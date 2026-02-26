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

package com.aliyuncs.cdn.transform.v20180510;

import com.aliyuncs.cdn.model.v20180510.DescribeCdnSMCertificateDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnSMCertificateDetailResponseUnmarshaller {

	public static DescribeCdnSMCertificateDetailResponse unmarshall(DescribeCdnSMCertificateDetailResponse describeCdnSMCertificateDetailResponse, UnmarshallerContext _ctx) {
		
		describeCdnSMCertificateDetailResponse.setRequestId(_ctx.stringValue("DescribeCdnSMCertificateDetailResponse.RequestId"));
		describeCdnSMCertificateDetailResponse.setCertExpireTime(_ctx.stringValue("DescribeCdnSMCertificateDetailResponse.CertExpireTime"));
		describeCdnSMCertificateDetailResponse.setCertIdentifier(_ctx.stringValue("DescribeCdnSMCertificateDetailResponse.CertIdentifier"));
		describeCdnSMCertificateDetailResponse.setCommonName(_ctx.stringValue("DescribeCdnSMCertificateDetailResponse.CommonName"));
		describeCdnSMCertificateDetailResponse.setCertName(_ctx.stringValue("DescribeCdnSMCertificateDetailResponse.CertName"));
		describeCdnSMCertificateDetailResponse.setSans(_ctx.stringValue("DescribeCdnSMCertificateDetailResponse.Sans"));
		describeCdnSMCertificateDetailResponse.setSignCertificate(_ctx.stringValue("DescribeCdnSMCertificateDetailResponse.SignCertificate"));
		describeCdnSMCertificateDetailResponse.setCertOrg(_ctx.stringValue("DescribeCdnSMCertificateDetailResponse.CertOrg"));
		describeCdnSMCertificateDetailResponse.setEncryptCertificate(_ctx.stringValue("DescribeCdnSMCertificateDetailResponse.EncryptCertificate"));
	 
	 	return describeCdnSMCertificateDetailResponse;
	}
}