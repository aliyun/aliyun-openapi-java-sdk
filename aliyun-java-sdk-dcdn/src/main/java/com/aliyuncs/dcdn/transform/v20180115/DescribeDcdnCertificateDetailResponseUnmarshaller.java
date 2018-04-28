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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnCertificateDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnCertificateDetailResponseUnmarshaller {

	public static DescribeDcdnCertificateDetailResponse unmarshall(DescribeDcdnCertificateDetailResponse describeDcdnCertificateDetailResponse, UnmarshallerContext context) {
		
		describeDcdnCertificateDetailResponse.setRequestId(context.stringValue("DescribeDcdnCertificateDetailResponse.RequestId"));
		describeDcdnCertificateDetailResponse.setCert(context.stringValue("DescribeDcdnCertificateDetailResponse.Cert"));
		describeDcdnCertificateDetailResponse.setKey(context.stringValue("DescribeDcdnCertificateDetailResponse.Key"));
		describeDcdnCertificateDetailResponse.setCertId(context.longValue("DescribeDcdnCertificateDetailResponse.CertId"));
		describeDcdnCertificateDetailResponse.setCertName(context.stringValue("DescribeDcdnCertificateDetailResponse.CertName"));
	 
	 	return describeDcdnCertificateDetailResponse;
	}
}