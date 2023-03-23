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

package com.aliyuncs.cas.transform.v20200630;

import com.aliyuncs.cas.model.v20200630.CreateCustomCertificateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCustomCertificateResponseUnmarshaller {

	public static CreateCustomCertificateResponse unmarshall(CreateCustomCertificateResponse createCustomCertificateResponse, UnmarshallerContext _ctx) {
		
		createCustomCertificateResponse.setRequestId(_ctx.stringValue("CreateCustomCertificateResponse.RequestId"));
		createCustomCertificateResponse.setIdentifier(_ctx.stringValue("CreateCustomCertificateResponse.Identifier"));
		createCustomCertificateResponse.setCertificate(_ctx.stringValue("CreateCustomCertificateResponse.Certificate"));
		createCustomCertificateResponse.setCertificateChain(_ctx.stringValue("CreateCustomCertificateResponse.CertificateChain"));
		createCustomCertificateResponse.setSerialNumber(_ctx.stringValue("CreateCustomCertificateResponse.SerialNumber"));
	 
	 	return createCustomCertificateResponse;
	}
}