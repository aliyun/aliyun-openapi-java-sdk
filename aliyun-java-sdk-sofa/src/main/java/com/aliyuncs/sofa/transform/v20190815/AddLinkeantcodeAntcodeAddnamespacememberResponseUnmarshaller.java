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

import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeAddnamespacememberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeantcodeAntcodeAddnamespacememberResponseUnmarshaller {

	public static AddLinkeantcodeAntcodeAddnamespacememberResponse unmarshall(AddLinkeantcodeAntcodeAddnamespacememberResponse addLinkeantcodeAntcodeAddnamespacememberResponse, UnmarshallerContext _ctx) {
		
		addLinkeantcodeAntcodeAddnamespacememberResponse.setRequestId(_ctx.stringValue("AddLinkeantcodeAntcodeAddnamespacememberResponse.RequestId"));
		addLinkeantcodeAntcodeAddnamespacememberResponse.setResultCode(_ctx.stringValue("AddLinkeantcodeAntcodeAddnamespacememberResponse.ResultCode"));
		addLinkeantcodeAntcodeAddnamespacememberResponse.setResultMessage(_ctx.stringValue("AddLinkeantcodeAntcodeAddnamespacememberResponse.ResultMessage"));
		addLinkeantcodeAntcodeAddnamespacememberResponse.setAccessLevel(_ctx.longValue("AddLinkeantcodeAntcodeAddnamespacememberResponse.AccessLevel"));
		addLinkeantcodeAntcodeAddnamespacememberResponse.setAvatarUrl(_ctx.stringValue("AddLinkeantcodeAntcodeAddnamespacememberResponse.AvatarUrl"));
		addLinkeantcodeAntcodeAddnamespacememberResponse.setCreatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeAddnamespacememberResponse.CreatedAt"));
		addLinkeantcodeAntcodeAddnamespacememberResponse.setEmail(_ctx.stringValue("AddLinkeantcodeAntcodeAddnamespacememberResponse.Email"));
		addLinkeantcodeAntcodeAddnamespacememberResponse.setExpiresAt(_ctx.stringValue("AddLinkeantcodeAntcodeAddnamespacememberResponse.ExpiresAt"));
		addLinkeantcodeAntcodeAddnamespacememberResponse.setExternUid(_ctx.stringValue("AddLinkeantcodeAntcodeAddnamespacememberResponse.ExternUid"));
		addLinkeantcodeAntcodeAddnamespacememberResponse.setId(_ctx.longValue("AddLinkeantcodeAntcodeAddnamespacememberResponse.Id"));
		addLinkeantcodeAntcodeAddnamespacememberResponse.setName(_ctx.stringValue("AddLinkeantcodeAntcodeAddnamespacememberResponse.Name"));
		addLinkeantcodeAntcodeAddnamespacememberResponse.setNotificationLevel(_ctx.longValue("AddLinkeantcodeAntcodeAddnamespacememberResponse.NotificationLevel"));
		addLinkeantcodeAntcodeAddnamespacememberResponse.setResponseStatusCode(_ctx.longValue("AddLinkeantcodeAntcodeAddnamespacememberResponse.ResponseStatusCode"));
		addLinkeantcodeAntcodeAddnamespacememberResponse.setState(_ctx.stringValue("AddLinkeantcodeAntcodeAddnamespacememberResponse.State"));
		addLinkeantcodeAntcodeAddnamespacememberResponse.setUpdatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeAddnamespacememberResponse.UpdatedAt"));
		addLinkeantcodeAntcodeAddnamespacememberResponse.setUsername(_ctx.stringValue("AddLinkeantcodeAntcodeAddnamespacememberResponse.Username"));
		addLinkeantcodeAntcodeAddnamespacememberResponse.setWebUrl(_ctx.stringValue("AddLinkeantcodeAntcodeAddnamespacememberResponse.WebUrl"));
	 
	 	return addLinkeantcodeAntcodeAddnamespacememberResponse;
	}
}