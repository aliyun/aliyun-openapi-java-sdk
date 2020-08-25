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

import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeAddprojectmemberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeantcodeAntcodeAddprojectmemberResponseUnmarshaller {

	public static AddLinkeantcodeAntcodeAddprojectmemberResponse unmarshall(AddLinkeantcodeAntcodeAddprojectmemberResponse addLinkeantcodeAntcodeAddprojectmemberResponse, UnmarshallerContext _ctx) {
		
		addLinkeantcodeAntcodeAddprojectmemberResponse.setRequestId(_ctx.stringValue("AddLinkeantcodeAntcodeAddprojectmemberResponse.RequestId"));
		addLinkeantcodeAntcodeAddprojectmemberResponse.setResultCode(_ctx.stringValue("AddLinkeantcodeAntcodeAddprojectmemberResponse.ResultCode"));
		addLinkeantcodeAntcodeAddprojectmemberResponse.setResultMessage(_ctx.stringValue("AddLinkeantcodeAntcodeAddprojectmemberResponse.ResultMessage"));
		addLinkeantcodeAntcodeAddprojectmemberResponse.setAccessLevel(_ctx.longValue("AddLinkeantcodeAntcodeAddprojectmemberResponse.AccessLevel"));
		addLinkeantcodeAntcodeAddprojectmemberResponse.setAvatarUrl(_ctx.stringValue("AddLinkeantcodeAntcodeAddprojectmemberResponse.AvatarUrl"));
		addLinkeantcodeAntcodeAddprojectmemberResponse.setEmail(_ctx.stringValue("AddLinkeantcodeAntcodeAddprojectmemberResponse.Email"));
		addLinkeantcodeAntcodeAddprojectmemberResponse.setExpiresAt(_ctx.stringValue("AddLinkeantcodeAntcodeAddprojectmemberResponse.ExpiresAt"));
		addLinkeantcodeAntcodeAddprojectmemberResponse.setExternUid(_ctx.stringValue("AddLinkeantcodeAntcodeAddprojectmemberResponse.ExternUid"));
		addLinkeantcodeAntcodeAddprojectmemberResponse.setId(_ctx.longValue("AddLinkeantcodeAntcodeAddprojectmemberResponse.Id"));
		addLinkeantcodeAntcodeAddprojectmemberResponse.setName(_ctx.stringValue("AddLinkeantcodeAntcodeAddprojectmemberResponse.Name"));
		addLinkeantcodeAntcodeAddprojectmemberResponse.setResponseStatusCode(_ctx.longValue("AddLinkeantcodeAntcodeAddprojectmemberResponse.ResponseStatusCode"));
		addLinkeantcodeAntcodeAddprojectmemberResponse.setState(_ctx.stringValue("AddLinkeantcodeAntcodeAddprojectmemberResponse.State"));
		addLinkeantcodeAntcodeAddprojectmemberResponse.setUsername(_ctx.stringValue("AddLinkeantcodeAntcodeAddprojectmemberResponse.Username"));
		addLinkeantcodeAntcodeAddprojectmemberResponse.setWebUrl(_ctx.stringValue("AddLinkeantcodeAntcodeAddprojectmemberResponse.WebUrl"));
	 
	 	return addLinkeantcodeAntcodeAddprojectmemberResponse;
	}
}