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

import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeGroupmemberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeantcodeAntcodeGroupmemberResponseUnmarshaller {

	public static AddLinkeantcodeAntcodeGroupmemberResponse unmarshall(AddLinkeantcodeAntcodeGroupmemberResponse addLinkeantcodeAntcodeGroupmemberResponse, UnmarshallerContext _ctx) {
		
		addLinkeantcodeAntcodeGroupmemberResponse.setRequestId(_ctx.stringValue("AddLinkeantcodeAntcodeGroupmemberResponse.RequestId"));
		addLinkeantcodeAntcodeGroupmemberResponse.setResultCode(_ctx.stringValue("AddLinkeantcodeAntcodeGroupmemberResponse.ResultCode"));
		addLinkeantcodeAntcodeGroupmemberResponse.setResultMessage(_ctx.stringValue("AddLinkeantcodeAntcodeGroupmemberResponse.ResultMessage"));
		addLinkeantcodeAntcodeGroupmemberResponse.setAccessLevel(_ctx.longValue("AddLinkeantcodeAntcodeGroupmemberResponse.AccessLevel"));
		addLinkeantcodeAntcodeGroupmemberResponse.setAvatarUrl(_ctx.stringValue("AddLinkeantcodeAntcodeGroupmemberResponse.AvatarUrl"));
		addLinkeantcodeAntcodeGroupmemberResponse.setEmail(_ctx.stringValue("AddLinkeantcodeAntcodeGroupmemberResponse.Email"));
		addLinkeantcodeAntcodeGroupmemberResponse.setExpiresAt(_ctx.stringValue("AddLinkeantcodeAntcodeGroupmemberResponse.ExpiresAt"));
		addLinkeantcodeAntcodeGroupmemberResponse.setExternUid(_ctx.stringValue("AddLinkeantcodeAntcodeGroupmemberResponse.ExternUid"));
		addLinkeantcodeAntcodeGroupmemberResponse.setId(_ctx.longValue("AddLinkeantcodeAntcodeGroupmemberResponse.Id"));
		addLinkeantcodeAntcodeGroupmemberResponse.setName(_ctx.stringValue("AddLinkeantcodeAntcodeGroupmemberResponse.Name"));
		addLinkeantcodeAntcodeGroupmemberResponse.setResponseStatusCode(_ctx.longValue("AddLinkeantcodeAntcodeGroupmemberResponse.ResponseStatusCode"));
		addLinkeantcodeAntcodeGroupmemberResponse.setState(_ctx.stringValue("AddLinkeantcodeAntcodeGroupmemberResponse.State"));
		addLinkeantcodeAntcodeGroupmemberResponse.setUsername(_ctx.stringValue("AddLinkeantcodeAntcodeGroupmemberResponse.Username"));
		addLinkeantcodeAntcodeGroupmemberResponse.setWebUrl(_ctx.stringValue("AddLinkeantcodeAntcodeGroupmemberResponse.WebUrl"));
	 
	 	return addLinkeantcodeAntcodeGroupmemberResponse;
	}
}