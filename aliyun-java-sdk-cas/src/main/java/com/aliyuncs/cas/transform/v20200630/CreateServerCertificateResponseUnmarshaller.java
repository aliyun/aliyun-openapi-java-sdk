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

import com.aliyuncs.cas.model.v20200630.CreateServerCertificateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateServerCertificateResponseUnmarshaller {

	public static CreateServerCertificateResponse unmarshall(CreateServerCertificateResponse createServerCertificateResponse, UnmarshallerContext _ctx) {
		
		createServerCertificateResponse.setRequestId(_ctx.stringValue("CreateServerCertificateResponse.RequestId"));
		createServerCertificateResponse.setX509Certificate(_ctx.stringValue("CreateServerCertificateResponse.X509Certificate"));
		createServerCertificateResponse.setCertificateChain(_ctx.stringValue("CreateServerCertificateResponse.CertificateChain"));
		createServerCertificateResponse.setRootX509Certificate(_ctx.stringValue("CreateServerCertificateResponse.RootX509Certificate"));
		createServerCertificateResponse.setParentX509Certificate(_ctx.stringValue("CreateServerCertificateResponse.ParentX509Certificate"));
		createServerCertificateResponse.setIdentifier(_ctx.stringValue("CreateServerCertificateResponse.Identifier"));
	 
	 	return createServerCertificateResponse;
	}
}