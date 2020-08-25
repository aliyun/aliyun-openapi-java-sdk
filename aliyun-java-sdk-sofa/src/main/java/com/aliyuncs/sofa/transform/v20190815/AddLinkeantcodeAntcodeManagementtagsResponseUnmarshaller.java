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

import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeManagementtagsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeantcodeAntcodeManagementtagsResponseUnmarshaller {

	public static AddLinkeantcodeAntcodeManagementtagsResponse unmarshall(AddLinkeantcodeAntcodeManagementtagsResponse addLinkeantcodeAntcodeManagementtagsResponse, UnmarshallerContext _ctx) {
		
		addLinkeantcodeAntcodeManagementtagsResponse.setRequestId(_ctx.stringValue("AddLinkeantcodeAntcodeManagementtagsResponse.RequestId"));
		addLinkeantcodeAntcodeManagementtagsResponse.setResultCode(_ctx.stringValue("AddLinkeantcodeAntcodeManagementtagsResponse.ResultCode"));
		addLinkeantcodeAntcodeManagementtagsResponse.setResultMessage(_ctx.stringValue("AddLinkeantcodeAntcodeManagementtagsResponse.ResultMessage"));
		addLinkeantcodeAntcodeManagementtagsResponse.setData(_ctx.longValue("AddLinkeantcodeAntcodeManagementtagsResponse.Data"));
		addLinkeantcodeAntcodeManagementtagsResponse.setMessage(_ctx.stringValue("AddLinkeantcodeAntcodeManagementtagsResponse.Message"));
		addLinkeantcodeAntcodeManagementtagsResponse.setResponseStatusCode(_ctx.longValue("AddLinkeantcodeAntcodeManagementtagsResponse.ResponseStatusCode"));
		addLinkeantcodeAntcodeManagementtagsResponse.setStatus(_ctx.booleanValue("AddLinkeantcodeAntcodeManagementtagsResponse.Status"));
	 
	 	return addLinkeantcodeAntcodeManagementtagsResponse;
	}
}