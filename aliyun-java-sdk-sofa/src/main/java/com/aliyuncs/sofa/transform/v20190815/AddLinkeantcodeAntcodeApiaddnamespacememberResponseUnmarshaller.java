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

import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeApiaddnamespacememberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeantcodeAntcodeApiaddnamespacememberResponseUnmarshaller {

	public static AddLinkeantcodeAntcodeApiaddnamespacememberResponse unmarshall(AddLinkeantcodeAntcodeApiaddnamespacememberResponse addLinkeantcodeAntcodeApiaddnamespacememberResponse, UnmarshallerContext _ctx) {
		
		addLinkeantcodeAntcodeApiaddnamespacememberResponse.setRequestId(_ctx.stringValue("AddLinkeantcodeAntcodeApiaddnamespacememberResponse.RequestId"));
		addLinkeantcodeAntcodeApiaddnamespacememberResponse.setResultCode(_ctx.stringValue("AddLinkeantcodeAntcodeApiaddnamespacememberResponse.ResultCode"));
		addLinkeantcodeAntcodeApiaddnamespacememberResponse.setResultMessage(_ctx.stringValue("AddLinkeantcodeAntcodeApiaddnamespacememberResponse.ResultMessage"));
		addLinkeantcodeAntcodeApiaddnamespacememberResponse.setAccessLevel(_ctx.longValue("AddLinkeantcodeAntcodeApiaddnamespacememberResponse.AccessLevel"));
		addLinkeantcodeAntcodeApiaddnamespacememberResponse.setAvatarUrl(_ctx.stringValue("AddLinkeantcodeAntcodeApiaddnamespacememberResponse.AvatarUrl"));
		addLinkeantcodeAntcodeApiaddnamespacememberResponse.setEmail(_ctx.stringValue("AddLinkeantcodeAntcodeApiaddnamespacememberResponse.Email"));
		addLinkeantcodeAntcodeApiaddnamespacememberResponse.setExpiresAt(_ctx.stringValue("AddLinkeantcodeAntcodeApiaddnamespacememberResponse.ExpiresAt"));
		addLinkeantcodeAntcodeApiaddnamespacememberResponse.setExternUid(_ctx.stringValue("AddLinkeantcodeAntcodeApiaddnamespacememberResponse.ExternUid"));
		addLinkeantcodeAntcodeApiaddnamespacememberResponse.setId(_ctx.longValue("AddLinkeantcodeAntcodeApiaddnamespacememberResponse.Id"));
		addLinkeantcodeAntcodeApiaddnamespacememberResponse.setName(_ctx.stringValue("AddLinkeantcodeAntcodeApiaddnamespacememberResponse.Name"));
		addLinkeantcodeAntcodeApiaddnamespacememberResponse.setResponseStatusCode(_ctx.longValue("AddLinkeantcodeAntcodeApiaddnamespacememberResponse.ResponseStatusCode"));
		addLinkeantcodeAntcodeApiaddnamespacememberResponse.setState(_ctx.stringValue("AddLinkeantcodeAntcodeApiaddnamespacememberResponse.State"));
		addLinkeantcodeAntcodeApiaddnamespacememberResponse.setUsername(_ctx.stringValue("AddLinkeantcodeAntcodeApiaddnamespacememberResponse.Username"));
		addLinkeantcodeAntcodeApiaddnamespacememberResponse.setWebUrl(_ctx.stringValue("AddLinkeantcodeAntcodeApiaddnamespacememberResponse.WebUrl"));
	 
	 	return addLinkeantcodeAntcodeApiaddnamespacememberResponse;
	}
}