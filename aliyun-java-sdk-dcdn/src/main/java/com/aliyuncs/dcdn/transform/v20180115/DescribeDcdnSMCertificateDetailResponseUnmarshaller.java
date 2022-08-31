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

package com.aliyuncs.dcdn.transform.v20180115;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnSMCertificateDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnSMCertificateDetailResponseUnmarshaller {

	public static DescribeDcdnSMCertificateDetailResponse unmarshall(DescribeDcdnSMCertificateDetailResponse describeDcdnSMCertificateDetailResponse, UnmarshallerContext _ctx) {
		
		describeDcdnSMCertificateDetailResponse.setRequestId(_ctx.stringValue("DescribeDcdnSMCertificateDetailResponse.RequestId"));
		describeDcdnSMCertificateDetailResponse.setCertExpireTime(_ctx.stringValue("DescribeDcdnSMCertificateDetailResponse.CertExpireTime"));
		describeDcdnSMCertificateDetailResponse.setCertIdentifier(_ctx.stringValue("DescribeDcdnSMCertificateDetailResponse.CertIdentifier"));
		describeDcdnSMCertificateDetailResponse.setCommonName(_ctx.stringValue("DescribeDcdnSMCertificateDetailResponse.CommonName"));
		describeDcdnSMCertificateDetailResponse.setCertName(_ctx.stringValue("DescribeDcdnSMCertificateDetailResponse.CertName"));
		describeDcdnSMCertificateDetailResponse.setSans(_ctx.stringValue("DescribeDcdnSMCertificateDetailResponse.Sans"));
		describeDcdnSMCertificateDetailResponse.setSignCertificate(_ctx.stringValue("DescribeDcdnSMCertificateDetailResponse.SignCertificate"));
		describeDcdnSMCertificateDetailResponse.setCertOrg(_ctx.stringValue("DescribeDcdnSMCertificateDetailResponse.CertOrg"));
		describeDcdnSMCertificateDetailResponse.setEncryptCertificate(_ctx.stringValue("DescribeDcdnSMCertificateDetailResponse.EncryptCertificate"));
	 
	 	return describeDcdnSMCertificateDetailResponse;
	}
}