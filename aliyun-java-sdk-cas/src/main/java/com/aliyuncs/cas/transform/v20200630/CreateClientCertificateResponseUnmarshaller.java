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

import com.aliyuncs.cas.model.v20200630.CreateClientCertificateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateClientCertificateResponseUnmarshaller {

	public static CreateClientCertificateResponse unmarshall(CreateClientCertificateResponse createClientCertificateResponse, UnmarshallerContext _ctx) {
		
		createClientCertificateResponse.setRequestId(_ctx.stringValue("CreateClientCertificateResponse.RequestId"));
		createClientCertificateResponse.setX509Certificate(_ctx.stringValue("CreateClientCertificateResponse.X509Certificate"));
		createClientCertificateResponse.setCertificateChain(_ctx.stringValue("CreateClientCertificateResponse.CertificateChain"));
		createClientCertificateResponse.setRootX509Certificate(_ctx.stringValue("CreateClientCertificateResponse.RootX509Certificate"));
		createClientCertificateResponse.setParentX509Certificate(_ctx.stringValue("CreateClientCertificateResponse.ParentX509Certificate"));
		createClientCertificateResponse.setIdentifier(_ctx.stringValue("CreateClientCertificateResponse.Identifier"));
	 
	 	return createClientCertificateResponse;
	}
}