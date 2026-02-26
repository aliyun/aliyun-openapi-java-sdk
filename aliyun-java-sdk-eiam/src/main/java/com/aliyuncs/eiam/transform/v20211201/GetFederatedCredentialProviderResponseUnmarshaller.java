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

import com.aliyuncs.eiam.model.v20211201.GetFederatedCredentialProviderResponse;
import com.aliyuncs.eiam.model.v20211201.GetFederatedCredentialProviderResponse.FederatedCredentialProvider;
import com.aliyuncs.eiam.model.v20211201.GetFederatedCredentialProviderResponse.FederatedCredentialProvider.OidcProviderConfig;
import com.aliyuncs.eiam.model.v20211201.GetFederatedCredentialProviderResponse.FederatedCredentialProvider.Pkcs7ProviderConfig;
import com.aliyuncs.eiam.model.v20211201.GetFederatedCredentialProviderResponse.FederatedCredentialProvider.Pkcs7ProviderConfig.Certificate;
import com.aliyuncs.eiam.model.v20211201.GetFederatedCredentialProviderResponse.FederatedCredentialProvider.Pkcs7ProviderConfig.Certificate.CertificateMetadata;
import com.aliyuncs.eiam.model.v20211201.GetFederatedCredentialProviderResponse.FederatedCredentialProvider.PrivateCaProviderConfig;
import com.aliyuncs.eiam.model.v20211201.GetFederatedCredentialProviderResponse.FederatedCredentialProvider.PrivateCaProviderConfig.Certificate2;
import com.aliyuncs.eiam.model.v20211201.GetFederatedCredentialProviderResponse.FederatedCredentialProvider.PrivateCaProviderConfig.Certificate2.CertificateMetadata3;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFederatedCredentialProviderResponseUnmarshaller {

	public static GetFederatedCredentialProviderResponse unmarshall(GetFederatedCredentialProviderResponse getFederatedCredentialProviderResponse, UnmarshallerContext _ctx) {
		
		getFederatedCredentialProviderResponse.setRequestId(_ctx.stringValue("GetFederatedCredentialProviderResponse.RequestId"));

		FederatedCredentialProvider federatedCredentialProvider = new FederatedCredentialProvider();
		federatedCredentialProvider.setInstanceId(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.InstanceId"));
		federatedCredentialProvider.setFederatedCredentialProviderId(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.FederatedCredentialProviderId"));
		federatedCredentialProvider.setFederatedCredentialProviderName(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.FederatedCredentialProviderName"));
		federatedCredentialProvider.setFederatedCredentialProviderType(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.FederatedCredentialProviderType"));
		federatedCredentialProvider.setDescription(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.Description"));
		federatedCredentialProvider.setNetworkAccessEndpointId(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.NetworkAccessEndpointId"));
		federatedCredentialProvider.setStatus(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.Status"));
		federatedCredentialProvider.setCreateTime(_ctx.longValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.CreateTime"));
		federatedCredentialProvider.setUpdateTime(_ctx.longValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.UpdateTime"));

		OidcProviderConfig oidcProviderConfig = new OidcProviderConfig();
		oidcProviderConfig.setJwksSource(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.OidcProviderConfig.JwksSource"));
		oidcProviderConfig.setJwksUri(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.OidcProviderConfig.JwksUri"));
		oidcProviderConfig.setStaticJwks(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.OidcProviderConfig.StaticJwks"));
		oidcProviderConfig.setIssuer(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.OidcProviderConfig.Issuer"));
		oidcProviderConfig.setTrustCondition(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.OidcProviderConfig.TrustCondition"));
		oidcProviderConfig.setDynamicJwks(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.OidcProviderConfig.DynamicJwks"));
		oidcProviderConfig.setJwksLastObtainedTime(_ctx.longValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.OidcProviderConfig.JwksLastObtainedTime"));

		List<String> audiences = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.OidcProviderConfig.Audiences.Length"); i++) {
			audiences.add(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.OidcProviderConfig.Audiences["+ i +"]"));
		}
		oidcProviderConfig.setAudiences(audiences);
		federatedCredentialProvider.setOidcProviderConfig(oidcProviderConfig);

		Pkcs7ProviderConfig pkcs7ProviderConfig = new Pkcs7ProviderConfig();
		pkcs7ProviderConfig.setTrustAnchorSource(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.Pkcs7ProviderConfig.TrustAnchorSource"));
		pkcs7ProviderConfig.setTrustCondition(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.Pkcs7ProviderConfig.TrustCondition"));
		pkcs7ProviderConfig.setCmsVerificationMode(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.Pkcs7ProviderConfig.CmsVerificationMode"));
		pkcs7ProviderConfig.setSigningTimeValueExpression(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.Pkcs7ProviderConfig.SigningTimeValueExpression"));
		pkcs7ProviderConfig.setSignatureEffectiveTime(_ctx.longValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.Pkcs7ProviderConfig.SignatureEffectiveTime"));

		List<Certificate> certificates = new ArrayList<Certificate>();
		for (int i = 0; i < _ctx.lengthValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.Pkcs7ProviderConfig.Certificates.Length"); i++) {
			Certificate certificate = new Certificate();
			certificate.setFingerprint(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.Pkcs7ProviderConfig.Certificates["+ i +"].Fingerprint"));
			certificate.setContent(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.Pkcs7ProviderConfig.Certificates["+ i +"].Content"));

			CertificateMetadata certificateMetadata = new CertificateMetadata();
			certificateMetadata.setNotBefore(_ctx.longValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.Pkcs7ProviderConfig.Certificates["+ i +"].CertificateMetadata.NotBefore"));
			certificateMetadata.setNotAfter(_ctx.longValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.Pkcs7ProviderConfig.Certificates["+ i +"].CertificateMetadata.NotAfter"));
			certificate.setCertificateMetadata(certificateMetadata);

			certificates.add(certificate);
		}
		pkcs7ProviderConfig.setCertificates(certificates);
		federatedCredentialProvider.setPkcs7ProviderConfig(pkcs7ProviderConfig);

		PrivateCaProviderConfig privateCaProviderConfig = new PrivateCaProviderConfig();
		privateCaProviderConfig.setTrustAnchorSource(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.PrivateCaProviderConfig.TrustAnchorSource"));
		privateCaProviderConfig.setTrustCondition(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.PrivateCaProviderConfig.TrustCondition"));

		List<Certificate2> certificates1 = new ArrayList<Certificate2>();
		for (int i = 0; i < _ctx.lengthValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.PrivateCaProviderConfig.Certificates.Length"); i++) {
			Certificate2 certificate2 = new Certificate2();
			certificate2.setFingerprint(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.PrivateCaProviderConfig.Certificates["+ i +"].Fingerprint"));
			certificate2.setContent(_ctx.stringValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.PrivateCaProviderConfig.Certificates["+ i +"].Content"));

			CertificateMetadata3 certificateMetadata3 = new CertificateMetadata3();
			certificateMetadata3.setNotBefore(_ctx.longValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.PrivateCaProviderConfig.Certificates["+ i +"].CertificateMetadata.NotBefore"));
			certificateMetadata3.setNotAfter(_ctx.longValue("GetFederatedCredentialProviderResponse.FederatedCredentialProvider.PrivateCaProviderConfig.Certificates["+ i +"].CertificateMetadata.NotAfter"));
			certificate2.setCertificateMetadata3(certificateMetadata3);

			certificates1.add(certificate2);
		}
		privateCaProviderConfig.setCertificates1(certificates1);
		federatedCredentialProvider.setPrivateCaProviderConfig(privateCaProviderConfig);
		getFederatedCredentialProviderResponse.setFederatedCredentialProvider(federatedCredentialProvider);
	 
	 	return getFederatedCredentialProviderResponse;
	}
}