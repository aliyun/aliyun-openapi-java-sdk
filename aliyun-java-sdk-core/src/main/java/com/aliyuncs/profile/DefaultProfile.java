/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.profile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aliyuncs.auth.AlibabaCloudCredentials;
import com.aliyuncs.auth.AlibabaCloudCredentialsProvider;
import com.aliyuncs.auth.Credential;
import com.aliyuncs.auth.CredentialsBackupCompatibilityAdaptor;
import com.aliyuncs.auth.ICredentialProvider;
import com.aliyuncs.auth.ISigner;
import com.aliyuncs.auth.ShaHmac1Singleton;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.regions.CustomizedEndpointsParser;
import com.aliyuncs.regions.Endpoint;
import com.aliyuncs.regions.IEndpointsProvider;
import com.aliyuncs.regions.InternalEndpointsParser;
import com.aliyuncs.regions.LocationConfig;
import com.aliyuncs.regions.ProductDomain;
import com.aliyuncs.regions.RemoteEndpointsParser;
import com.aliyuncs.utils.CacheTimeHelper;

public class DefaultProfile implements IClientProfile {

    private static DefaultProfile profile = null;
    private static List<Endpoint> endpoints = null;

    private Credential credential = null;
    private String regionId = null;
    private FormatType acceptFormat = null;
    private ISigner isigner = null;
    private IEndpointsProvider iendpoints = null;
    private IEndpointsProvider remoteProvider = null;
    private ICredentialProvider icredential = null;
    private LocationConfig locationConfig = new LocationConfig();

    private DefaultProfile() {
        this.locationConfig = new LocationConfig();
        this.iendpoints = new InternalEndpointsParser();
        this.remoteProvider = RemoteEndpointsParser.initRemoteEndpointsParser();
    }

    private DefaultProfile(String regionId) {
        this();
        this.regionId = regionId;
    }

    private DefaultProfile(String region, Credential creden) {
        this.iendpoints = new InternalEndpointsParser();
        this.remoteProvider = RemoteEndpointsParser.initRemoteEndpointsParser();
        this.credential = creden;
        this.regionId = region;
        this.locationConfig = new LocationConfig();
    }

    private DefaultProfile(String region, Credential creden, IEndpointsProvider provider) {
        this.iendpoints = provider;
        this.credential = creden;
        this.regionId = region;
        this.locationConfig = new LocationConfig();
        this.remoteProvider = RemoteEndpointsParser.initRemoteEndpointsParser();
    }

    private DefaultProfile(ICredentialProvider icredential) {
        this.icredential = icredential;
        this.iendpoints = new InternalEndpointsParser();
        this.remoteProvider = RemoteEndpointsParser.initRemoteEndpointsParser();
        this.locationConfig = new LocationConfig();
    }

    private DefaultProfile(String region, ICredentialProvider icredential) {
        this.regionId = region;
        this.icredential = icredential;
        this.iendpoints = new InternalEndpointsParser();
        this.locationConfig = new LocationConfig();
        this.remoteProvider = RemoteEndpointsParser.initRemoteEndpointsParser();
    }

    private DefaultProfile(ICredentialProvider icredential, String region, FormatType format) {
        this.regionId = region;
        this.acceptFormat = format;
        this.icredential = icredential;
        this.iendpoints = new InternalEndpointsParser();
        this.remoteProvider = RemoteEndpointsParser.initRemoteEndpointsParser();
        this.locationConfig = new LocationConfig();
    }

    @Override
    public synchronized ISigner getSigner() {
        if (null == isigner) { this.isigner = ShaHmac1Singleton.INSTANCE.getInstance(); }
        return isigner;
    }

    @Override
    public synchronized String getRegionId() {
        return regionId;
    }

    @Override
    public synchronized FormatType getFormat() {
        return acceptFormat;
    }

    @Override
    public synchronized Credential getCredential() {
        if (null == credential && null != icredential) { credential = icredential.fresh(); }
        return credential;
    }

    @Override
    public synchronized void setLocationConfig(String regionId, String product, String endpoint) {
        this.locationConfig = LocationConfig.createLocationConfig(regionId, product, endpoint);
    }

    @Override
    public List<Endpoint> getEndpoints() throws ClientException {
        throw new UnsupportedOperationException();
    }

    @Override
    public synchronized List<Endpoint> getEndpoints(String regionId, String product) throws ClientException {
        if (null == endpoints) {
            Endpoint endpoint = iendpoints.getEndpoint(regionId, product);
            if (endpoint != null) {
                endpoints = new ArrayList<Endpoint>();
                endpoints.add(endpoint);
            }
        }

        return endpoints;
    }

    @Override
    public synchronized List<Endpoint> getEndpoints(String product, String regionId, String serviceCode,
                                                    String endpointType) throws ClientException {
        if (null == endpoints) {
            Endpoint endpoint = null;
            if (serviceCode != null) {
                endpoint = remoteProvider.getEndpoint(regionId, product, serviceCode, endpointType, credential,
                    locationConfig);
            }
            if (endpoint == null) {
                endpoint = iendpoints.getEndpoint(regionId, product);
            }
            if (endpoint != null) {
                endpoints = new ArrayList<Endpoint>();
                endpoints.add(endpoint);
            }
        } else if (Endpoint.findProductDomain(regionId, product, endpoints) == null || CacheTimeHelper.CheckEndPointCacheIsExpire(product, regionId)) {
            Endpoint endpoint = null;
            if (serviceCode != null) {
                endpoint = remoteProvider.getEndpoint(regionId, product, serviceCode, endpointType,
                    credential, locationConfig);
            }
            if (endpoint == null) {
                endpoint = iendpoints.getEndpoint(regionId, product);
            }
            if (endpoint != null) {
                for (String region : endpoint.getRegionIds()) {
                    for (ProductDomain productDomain : endpoint.getProductDomains()) {
                        addEndpoint(endpoint.getName(), region, product, productDomain.getDomianName(), false);
                    }
                }
            }
        }
        return endpoints;
    }

    public synchronized static DefaultProfile getProfile() {
        if (null == profile) { profile = new DefaultProfile(); }

        return profile;
    }

    public synchronized static DefaultProfile getProfile(String regionId, ICredentialProvider icredential) {
        profile = new DefaultProfile(regionId, icredential);
        return profile;
    }

    public synchronized static DefaultProfile getProfile(String regionId, String accessKeyId, String secret) {
        Credential creden = new Credential(accessKeyId, secret);
        profile = new DefaultProfile(regionId, creden);
        return profile;
    }

    public synchronized static DefaultProfile getProfile(String regionId, String accessKeyId, String secret,
                                                         String stsToken) {
        Credential creden = new Credential(accessKeyId, secret, stsToken);
        profile = new DefaultProfile(regionId, creden);
        return profile;
    }

    /**
     * <pre>
     * 给个性化用户使用的，CustomizedEndpointsParser 通过这个去解析endpoint,
     * 非本地和location；所以一般情况不要使用这个 regionId,
     * </pre>
     * eg: cn-hangzhou productDomainMap,eg: Map<String, String>
     * productDomainMap= new HashMap<String,String>();
     * productDomainMap.put("ecs","ecs.aliyuncs.com") accessKeyId secret
     */
    public synchronized static DefaultProfile getProfile(String regionId, Map<String, String> productDomainMap,
                                                         String accessKeyId, String secret) {
        Credential creden = new Credential(accessKeyId, secret);
        IEndpointsProvider provider = CustomizedEndpointsParser.initParser(regionId, productDomainMap);
        profile = new DefaultProfile(regionId, creden, provider);
        return profile;
    }

    public synchronized static DefaultProfile getProfile(String regionId, Map<String, String> productDomainMap,
                                                         String accessKeyId, String secret, String stsToken) {
        Credential creden = new Credential(accessKeyId, secret, stsToken);
        IEndpointsProvider provider = CustomizedEndpointsParser.initParser(regionId, productDomainMap);
        profile = new DefaultProfile(regionId, creden, provider);
        return profile;
    }

    public synchronized static DefaultProfile getProfile(String regionId, IEndpointsProvider provider,
                                                         String accessKeyId, String secret) {
        Credential creden = new Credential(accessKeyId, secret);
        profile = new DefaultProfile(regionId, creden, provider);
        return profile;
    }

    public synchronized static DefaultProfile getProfile(String regionId, IEndpointsProvider provider,
                                                         String accessKeyId, String secret, String stsToken) {
        Credential creden = new Credential(accessKeyId, secret, stsToken);
        profile = new DefaultProfile(regionId, creden, provider);
        return profile;
    }

    public synchronized static DefaultProfile getProfile(String regionId) {
        return new DefaultProfile(regionId);
    }

    public synchronized static void addEndpoint(String endpointName, String regionId, String product, String domain)
        throws ClientException {
        addEndpoint(endpointName, regionId, product, domain, true);
    }
    
    public synchronized static void addEndpoint(String endpointName, String regionId, String product, String domain, boolean isNeverExpire)
            throws ClientException {
        if (null == endpoints) {
            endpoints = getProfile().getEndpoints(regionId, product);
        }
        Endpoint endpoint = findEndpointByRegionId(regionId);
        if (null == endpoint) {
            addEndpoint_(endpointName, regionId, product, domain);
        } else {
            updateEndpoint(regionId, product, domain, endpoint);
        }

        if (isNeverExpire) {
            Date date = new Date(32472115200000L);
            CacheTimeHelper.addLastClearTimePerProduct(product, regionId, date);
        }       
    }

    private static void addEndpoint_(String endpointName, String regionId, String product, String domain) {
        Set<String> regions = new HashSet<String>();
        regions.add(regionId);

        List<ProductDomain> productDomains = new ArrayList<ProductDomain>();
        productDomains.add(new ProductDomain(product, domain));
        Endpoint endpoint = new Endpoint(endpointName, regions, productDomains);
        if (endpoints == null) {
            endpoints = new ArrayList<Endpoint>();
        }
        endpoints.add(endpoint);
    }

    private static void updateEndpoint(String regionId, String product, String domain, Endpoint endpoint) {
        Set<String> regionIds = endpoint.getRegionIds();
        regionIds.add(regionId);

        List<ProductDomain> productDomains = endpoint.getProductDomains();
        ProductDomain productDomain = findProductDomain(productDomains, product);
        if (null == productDomain) {
            ProductDomain newProductDomain = new ProductDomain(product, domain);
            productDomains.add(newProductDomain);
        } else {
            productDomain.setDomianName(domain);
        }
    }

    private static Endpoint findEndpointByRegionId(String regionId) {
        if (null == endpoints) {
            return null;
        }
        for (Endpoint endpoint : endpoints) {
            if (endpoint.getRegionIds().contains(regionId)) {
                return endpoint;
            }
        }
        return null;
    }

    private static ProductDomain findProductDomain(List<ProductDomain> productDomains, String product) {
        for (ProductDomain productDomain : productDomains) {
            if (productDomain.getProductName().equals(product)) {
                return productDomain;
            }
        }
        return null;
    }
    
    public void mockRemoteProvider(IEndpointsProvider remoteProvider) {
        this.remoteProvider = remoteProvider;
    }

    @Override
    public void setCredentialsProvider(AlibabaCloudCredentialsProvider credentialsProvider) {
        if (credential != null) {
            return;
        }
        credential = new CredentialsBackupCompatibilityAdaptor(credentialsProvider);
    }

}
