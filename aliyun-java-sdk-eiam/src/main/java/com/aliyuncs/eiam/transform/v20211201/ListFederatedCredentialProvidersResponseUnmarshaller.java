/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.ListFederatedCredentialProvidersResponse;
import com.aliyuncs.eiam.model.v20211201.ListFederatedCredentialProvidersResponse.FederatedCredentialProvider;
import com.aliyuncs.eiam.model.v20211201.ListFederatedCredentialProvidersResponse.FederatedCredentialProvider.OidcProviderConfig;
import com.aliyuncs.eiam.model.v20211201.ListFederatedCredentialProvidersResponse.FederatedCredentialProvider.Pkcs7ProviderConfig;
import com.aliyuncs.eiam.model.v20211201.ListFederatedCredentialProvidersResponse.FederatedCredentialProvider.Pkcs7ProviderConfig.Certificate2;
import com.aliyuncs.eiam.model.v20211201.ListFederatedCredentialProvidersResponse.FederatedCredentialProvider.Pkcs7ProviderConfig.Certificate2.CertificateMetadata3;
import com.aliyuncs.eiam.model.v20211201.ListFederatedCredentialProvidersResponse.FederatedCredentialProvider.PrivateCaProviderConfig;
import com.aliyuncs.eiam.model.v20211201.ListFederatedCredentialProvidersResponse.FederatedCredentialProvider.PrivateCaProviderConfig.Certificate;
import com.aliyuncs.eiam.model.v20211201.ListFederatedCredentialProvidersResponse.FederatedCredentialProvider.PrivateCaProviderConfig.Certificate.CertificateMetadata;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFederatedCredentialProvidersResponseUnmarshaller {

	public static ListFederatedCredentialProvidersResponse unmarshall(ListFederatedCredentialProvidersResponse listFederatedCredentialProvidersResponse, UnmarshallerContext _ctx) {
		
		listFederatedCredentialProvidersResponse.setRequestId(_ctx.stringValue("ListFederatedCredentialProvidersResponse.RequestId"));
		listFederatedCredentialProvidersResponse.setTotalCount(_ctx.integerValue("ListFederatedCredentialProvidersResponse.TotalCount"));
		listFederatedCredentialProvidersResponse.setNextToken(_ctx.stringValue("ListFederatedCredentialProvidersResponse.NextToken"));
		listFederatedCredentialProvidersResponse.setPreviousToken(_ctx.stringValue("ListFederatedCredentialProvidersResponse.PreviousToken"));
		listFederatedCredentialProvidersResponse.setMaxResults(_ctx.integerValue("ListFederatedCredentialProvidersResponse.MaxResults"));

		List<FederatedCredentialProvider> federatedCredentialProviders = new ArrayList<FederatedCredentialProvider>();
		for (int i = 0; i < _ctx.lengthValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders.Length"); i++) {
			FederatedCredentialProvider federatedCredentialProvider = new FederatedCredentialProvider();
			federatedCredentialProvider.setStatus(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].Status"));
			federatedCredentialProvider.setDescription(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].Description"));
			federatedCredentialProvider.setInstanceId(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].InstanceId"));
			federatedCredentialProvider.setCreateTime(_ctx.longValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].CreateTime"));
			federatedCredentialProvider.setUpdateTime(_ctx.longValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].UpdateTime"));
			federatedCredentialProvider.setFederatedCredentialProviderType(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].FederatedCredentialProviderType"));
			federatedCredentialProvider.setNetworkAccessEndpointId(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].NetworkAccessEndpointId"));
			federatedCredentialProvider.setFederatedCredentialProviderName(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].FederatedCredentialProviderName"));
			federatedCredentialProvider.setFederatedCredentialProviderId(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].FederatedCredentialProviderId"));

			PrivateCaProviderConfig privateCaProviderConfig = new PrivateCaProviderConfig();
			privateCaProviderConfig.setTrustAnchorSource(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].PrivateCaProviderConfig.TrustAnchorSource"));
			privateCaProviderConfig.setTrustCondition(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].PrivateCaProviderConfig.TrustCondition"));

			List<Certificate> certificates = new ArrayList<Certificate>();
			for (int j = 0; j < _ctx.lengthValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].PrivateCaProviderConfig.Certificates.Length"); j++) {
				Certificate certificate = new Certificate();
				certificate.setFingerprint(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].PrivateCaProviderConfig.Certificates["+ j +"].Fingerprint"));
				certificate.setContent(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].PrivateCaProviderConfig.Certificates["+ j +"].Content"));

				CertificateMetadata certificateMetadata = new CertificateMetadata();
				certificateMetadata.setNotBefore(_ctx.longValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].PrivateCaProviderConfig.Certificates["+ j +"].CertificateMetadata.NotBefore"));
				certificateMetadata.setNotAfter(_ctx.longValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].PrivateCaProviderConfig.Certificates["+ j +"].CertificateMetadata.NotAfter"));
				certificate.setCertificateMetadata(certificateMetadata);

				certificates.add(certificate);
			}
			privateCaProviderConfig.setCertificates(certificates);
			federatedCredentialProvider.setPrivateCaProviderConfig(privateCaProviderConfig);

			OidcProviderConfig oidcProviderConfig = new OidcProviderConfig();
			oidcProviderConfig.setJwksUri(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].OidcProviderConfig.JwksUri"));
			oidcProviderConfig.setIssuer(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].OidcProviderConfig.Issuer"));
			oidcProviderConfig.setJwksLastObtainedTime(_ctx.longValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].OidcProviderConfig.JwksLastObtainedTime"));
			oidcProviderConfig.setStaticJwks(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].OidcProviderConfig.StaticJwks"));
			oidcProviderConfig.setJwksSource(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].OidcProviderConfig.JwksSource"));
			oidcProviderConfig.setTrustCondition(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].OidcProviderConfig.TrustCondition"));
			oidcProviderConfig.setDynamicJwks(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].OidcProviderConfig.DynamicJwks"));

			List<String> audiences = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].OidcProviderConfig.Audiences.Length"); j++) {
				audiences.add(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].OidcProviderConfig.Audiences["+ j +"]"));
			}
			oidcProviderConfig.setAudiences(audiences);
			federatedCredentialProvider.setOidcProviderConfig(oidcProviderConfig);

			Pkcs7ProviderConfig pkcs7ProviderConfig = new Pkcs7ProviderConfig();
			pkcs7ProviderConfig.setSignatureEffectiveTime(_ctx.longValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].Pkcs7ProviderConfig.SignatureEffectiveTime"));
			pkcs7ProviderConfig.setTrustAnchorSource(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].Pkcs7ProviderConfig.TrustAnchorSource"));
			pkcs7ProviderConfig.setCmsVerificationMode(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].Pkcs7ProviderConfig.CmsVerificationMode"));
			pkcs7ProviderConfig.setSigningTimeValueExpression(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].Pkcs7ProviderConfig.SigningTimeValueExpression"));
			pkcs7ProviderConfig.setTrustCondition(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].Pkcs7ProviderConfig.TrustCondition"));

			List<Certificate2> certificates1 = new ArrayList<Certificate2>();
			for (int j = 0; j < _ctx.lengthValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].Pkcs7ProviderConfig.Certificates.Length"); j++) {
				Certificate2 certificate2 = new Certificate2();
				certificate2.setFingerprint(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].Pkcs7ProviderConfig.Certificates["+ j +"].Fingerprint"));
				certificate2.setContent(_ctx.stringValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].Pkcs7ProviderConfig.Certificates["+ j +"].Content"));

				CertificateMetadata3 certificateMetadata3 = new CertificateMetadata3();
				certificateMetadata3.setNotBefore(_ctx.longValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].Pkcs7ProviderConfig.Certificates["+ j +"].CertificateMetadata.NotBefore"));
				certificateMetadata3.setNotAfter(_ctx.longValue("ListFederatedCredentialProvidersResponse.FederatedCredentialProviders["+ i +"].Pkcs7ProviderConfig.Certificates["+ j +"].CertificateMetadata.NotAfter"));
				certificate2.setCertificateMetadata3(certificateMetadata3);

				certificates1.add(certificate2);
			}
			pkcs7ProviderConfig.setCertificates1(certificates1);
			federatedCredentialProvider.setPkcs7ProviderConfig(pkcs7ProviderConfig);

			federatedCredentialProviders.add(federatedCredentialProvider);
		}
		listFederatedCredentialProvidersResponse.setFederatedCredentialProviders(federatedCredentialProviders);
	 
	 	return listFederatedCredentialProvidersResponse;
	}
}