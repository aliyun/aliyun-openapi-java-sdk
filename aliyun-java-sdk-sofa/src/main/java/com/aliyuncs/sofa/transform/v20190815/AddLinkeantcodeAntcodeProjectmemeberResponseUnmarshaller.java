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

import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeProjectmemeberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeantcodeAntcodeProjectmemeberResponseUnmarshaller {

	public static AddLinkeantcodeAntcodeProjectmemeberResponse unmarshall(AddLinkeantcodeAntcodeProjectmemeberResponse addLinkeantcodeAntcodeProjectmemeberResponse, UnmarshallerContext _ctx) {
		
		addLinkeantcodeAntcodeProjectmemeberResponse.setRequestId(_ctx.stringValue("AddLinkeantcodeAntcodeProjectmemeberResponse.RequestId"));
		addLinkeantcodeAntcodeProjectmemeberResponse.setResultCode(_ctx.stringValue("AddLinkeantcodeAntcodeProjectmemeberResponse.ResultCode"));
		addLinkeantcodeAntcodeProjectmemeberResponse.setResultMessage(_ctx.stringValue("AddLinkeantcodeAntcodeProjectmemeberResponse.ResultMessage"));
		addLinkeantcodeAntcodeProjectmemeberResponse.setAccessLevel(_ctx.longValue("AddLinkeantcodeAntcodeProjectmemeberResponse.AccessLevel"));
		addLinkeantcodeAntcodeProjectmemeberResponse.setAvatarUrl(_ctx.stringValue("AddLinkeantcodeAntcodeProjectmemeberResponse.AvatarUrl"));
		addLinkeantcodeAntcodeProjectmemeberResponse.setEmail(_ctx.stringValue("AddLinkeantcodeAntcodeProjectmemeberResponse.Email"));
		addLinkeantcodeAntcodeProjectmemeberResponse.setExpiresAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectmemeberResponse.ExpiresAt"));
		addLinkeantcodeAntcodeProjectmemeberResponse.setExternUid(_ctx.stringValue("AddLinkeantcodeAntcodeProjectmemeberResponse.ExternUid"));
		addLinkeantcodeAntcodeProjectmemeberResponse.setId(_ctx.longValue("AddLinkeantcodeAntcodeProjectmemeberResponse.Id"));
		addLinkeantcodeAntcodeProjectmemeberResponse.setName(_ctx.stringValue("AddLinkeantcodeAntcodeProjectmemeberResponse.Name"));
		addLinkeantcodeAntcodeProjectmemeberResponse.setResponseStatusCode(_ctx.longValue("AddLinkeantcodeAntcodeProjectmemeberResponse.ResponseStatusCode"));
		addLinkeantcodeAntcodeProjectmemeberResponse.setState(_ctx.stringValue("AddLinkeantcodeAntcodeProjectmemeberResponse.State"));
		addLinkeantcodeAntcodeProjectmemeberResponse.setUsername(_ctx.stringValue("AddLinkeantcodeAntcodeProjectmemeberResponse.Username"));
		addLinkeantcodeAntcodeProjectmemeberResponse.setWebUrl(_ctx.stringValue("AddLinkeantcodeAntcodeProjectmemeberResponse.WebUrl"));
	 
	 	return addLinkeantcodeAntcodeProjectmemeberResponse;
	}
}