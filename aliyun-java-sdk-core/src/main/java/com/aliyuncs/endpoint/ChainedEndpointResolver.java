package com.aliyuncs.endpoint;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ErrorCodeConstant;
import com.aliyuncs.exceptions.ErrorMessageConstant;

import java.util.List;
import java.util.Set;

@SuppressWarnings({"ALL", "AlibabaClassMustHaveAuthor"})
public class ChainedEndpointResolver implements EndpointResolver {
    protected List<EndpointResolverBase> endpointResolvers;

    public ChainedEndpointResolver(List<EndpointResolverBase> resolverChain) {
        this.endpointResolvers = resolverChain;
    }

    private void checkProductCode(ResolveEndpointRequest request) throws ClientException {
        boolean productCodeValid = false;
        for (EndpointResolverBase resolver : endpointResolvers) {
            if (resolver.isProductCodeValid(request)) {
                productCodeValid = true;
            }
        }

        if (!productCodeValid) {
            throw new ClientException(ErrorCodeConstant.SDK_ENDPOINT_RESOLVING_ERROR,
                    String.format(ErrorMessageConstant.ENDPOINT_NO_PRODUCT, request.productCode));
        }
    }

    private void checkRegionId(ResolveEndpointRequest request) throws ClientException {
        boolean regionIdValid = false;
        for (EndpointResolverBase resolver : endpointResolvers) {
            if (resolver.isRegionIdValid(request)) {
                regionIdValid = true;
            }
        }

        if (!regionIdValid) {
            throw new ClientException(ErrorCodeConstant.SDK_ENDPOINT_RESOLVING_ERROR,
                    String.format(ErrorMessageConstant.INVALID_REGION_ID, request.regionId));
        }
    }

    private String getAvailableRegionsHint(String productCode) {
        Set<String> availabeRegions = null;
        String availabeRegionsHint = "";
        for (EndpointResolverBase resolver : endpointResolvers) {
            availabeRegions = resolver.getValidRegionIdsByProduct(productCode);
            if (availabeRegions != null) {
                availabeRegionsHint = "\nOr you can use the other available regions:";
                for (String availabeRegion : availabeRegions) {
                    availabeRegionsHint += " " + availabeRegion;
                }
                break;
            }
        }
        return availabeRegionsHint;
    }

    @Override
    public String resolve(ResolveEndpointRequest request) throws ClientException {
        for (EndpointResolverBase resolver : endpointResolvers) {
            String endpoint = resolver.resolve(request);
            if (endpoint != null) {
                return endpoint;
            }
        }

        checkProductCode(request);
        checkRegionId(request);

        throw new ClientException(ErrorCodeConstant.SDK_ENDPOINT_RESOLVING_ERROR,
                String.format(ErrorMessageConstant.ENDPOINT_NO_REGION, request.regionId, request.productCode,
                        getAvailableRegionsHint(request.productCode)));
    }
}
