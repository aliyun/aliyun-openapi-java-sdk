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

import com.aliyuncs.cas.model.v20200630.CreateServerCertificateWithCsrResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateServerCertificateWithCsrResponseUnmarshaller {

	public static CreateServerCertificateWithCsrResponse unmarshall(CreateServerCertificateWithCsrResponse createServerCertificateWithCsrResponse, UnmarshallerContext _ctx) {
		
		createServerCertificateWithCsrResponse.setRequestId(_ctx.stringValue("CreateServerCertificateWithCsrResponse.RequestId"));
		createServerCertificateWithCsrResponse.setX509Certificate(_ctx.stringValue("CreateServerCertificateWithCsrResponse.X509Certificate"));
		createServerCertificateWithCsrResponse.setCertificateChain(_ctx.stringValue("CreateServerCertificateWithCsrResponse.CertificateChain"));
		createServerCertificateWithCsrResponse.setRootX509Certificate(_ctx.stringValue("CreateServerCertificateWithCsrResponse.RootX509Certificate"));
		createServerCertificateWithCsrResponse.setParentX509Certificate(_ctx.stringValue("CreateServerCertificateWithCsrResponse.ParentX509Certificate"));
		createServerCertificateWithCsrResponse.setIdentifier(_ctx.stringValue("CreateServerCertificateWithCsrResponse.Identifier"));
		createServerCertificateWithCsrResponse.setSerialNumber(_ctx.stringValue("CreateServerCertificateWithCsrResponse.SerialNumber"));
	 
	 	return createServerCertificateWithCsrResponse;
	}
}