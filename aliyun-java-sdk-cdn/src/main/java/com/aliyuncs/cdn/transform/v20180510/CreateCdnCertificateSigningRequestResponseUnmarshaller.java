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

import com.aliyuncs.cdn.model.v20180510.CreateCdnCertificateSigningRequestResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCdnCertificateSigningRequestResponseUnmarshaller {

	public static CreateCdnCertificateSigningRequestResponse unmarshall(CreateCdnCertificateSigningRequestResponse createCdnCertificateSigningRequestResponse, UnmarshallerContext _ctx) {
		
		createCdnCertificateSigningRequestResponse.setRequestId(_ctx.stringValue("CreateCdnCertificateSigningRequestResponse.RequestId"));
		createCdnCertificateSigningRequestResponse.setCommonName(_ctx.stringValue("CreateCdnCertificateSigningRequestResponse.CommonName"));
		createCdnCertificateSigningRequestResponse.setCsr(_ctx.stringValue("CreateCdnCertificateSigningRequestResponse.Csr"));
		createCdnCertificateSigningRequestResponse.setPubMd5(_ctx.stringValue("CreateCdnCertificateSigningRequestResponse.PubMd5"));
	 
	 	return createCdnCertificateSigningRequestResponse;
	}
}