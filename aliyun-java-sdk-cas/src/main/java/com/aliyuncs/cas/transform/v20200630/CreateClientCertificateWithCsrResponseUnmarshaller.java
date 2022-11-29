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

import com.aliyuncs.cas.model.v20200630.CreateClientCertificateWithCsrResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateClientCertificateWithCsrResponseUnmarshaller {

	public static CreateClientCertificateWithCsrResponse unmarshall(CreateClientCertificateWithCsrResponse createClientCertificateWithCsrResponse, UnmarshallerContext _ctx) {
		
		createClientCertificateWithCsrResponse.setRequestId(_ctx.stringValue("CreateClientCertificateWithCsrResponse.RequestId"));
		createClientCertificateWithCsrResponse.setX509Certificate(_ctx.stringValue("CreateClientCertificateWithCsrResponse.X509Certificate"));
		createClientCertificateWithCsrResponse.setCertificateChain(_ctx.stringValue("CreateClientCertificateWithCsrResponse.CertificateChain"));
		createClientCertificateWithCsrResponse.setRootX509Certificate(_ctx.stringValue("CreateClientCertificateWithCsrResponse.RootX509Certificate"));
		createClientCertificateWithCsrResponse.setParentX509Certificate(_ctx.stringValue("CreateClientCertificateWithCsrResponse.ParentX509Certificate"));
		createClientCertificateWithCsrResponse.setIdentifier(_ctx.stringValue("CreateClientCertificateWithCsrResponse.Identifier"));
	 
	 	return createClientCertificateWithCsrResponse;
	}
}