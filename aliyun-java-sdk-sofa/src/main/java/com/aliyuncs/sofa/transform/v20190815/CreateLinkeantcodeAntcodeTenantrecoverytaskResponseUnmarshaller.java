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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeTenantrecoverytaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeTenantrecoverytaskResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeTenantrecoverytaskResponse unmarshall(CreateLinkeantcodeAntcodeTenantrecoverytaskResponse createLinkeantcodeAntcodeTenantrecoverytaskResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeTenantrecoverytaskResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantrecoverytaskResponse.RequestId"));
		createLinkeantcodeAntcodeTenantrecoverytaskResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantrecoverytaskResponse.ResultCode"));
		createLinkeantcodeAntcodeTenantrecoverytaskResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantrecoverytaskResponse.ResultMessage"));
		createLinkeantcodeAntcodeTenantrecoverytaskResponse.setData(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantrecoverytaskResponse.Data"));
		createLinkeantcodeAntcodeTenantrecoverytaskResponse.setMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeTenantrecoverytaskResponse.Message"));
		createLinkeantcodeAntcodeTenantrecoverytaskResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeTenantrecoverytaskResponse.ResponseStatusCode"));
		createLinkeantcodeAntcodeTenantrecoverytaskResponse.setStatus(_ctx.booleanValue("CreateLinkeantcodeAntcodeTenantrecoverytaskResponse.Status"));
	 
	 	return createLinkeantcodeAntcodeTenantrecoverytaskResponse;
	}
}