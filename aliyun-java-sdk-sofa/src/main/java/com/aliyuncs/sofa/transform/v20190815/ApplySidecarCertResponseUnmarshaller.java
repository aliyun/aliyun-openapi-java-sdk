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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.ApplySidecarCertResponse;
import com.aliyuncs.sofa.model.v20190815.ApplySidecarCertResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ApplySidecarCertResponseUnmarshaller {

	public static ApplySidecarCertResponse unmarshall(ApplySidecarCertResponse applySidecarCertResponse, UnmarshallerContext _ctx) {
		
		applySidecarCertResponse.setRequestId(_ctx.stringValue("ApplySidecarCertResponse.RequestId"));
		applySidecarCertResponse.setResultCode(_ctx.stringValue("ApplySidecarCertResponse.ResultCode"));
		applySidecarCertResponse.setResultMessage(_ctx.stringValue("ApplySidecarCertResponse.ResultMessage"));
		applySidecarCertResponse.setSuccess(_ctx.booleanValue("ApplySidecarCertResponse.Success"));

		Data data = new Data();
		data.setCertChain(_ctx.stringValue("ApplySidecarCertResponse.Data.CertChain"));
		data.setRootCert(_ctx.stringValue("ApplySidecarCertResponse.Data.RootCert"));
		applySidecarCertResponse.setData(data);
	 
	 	return applySidecarCertResponse;
	}
}