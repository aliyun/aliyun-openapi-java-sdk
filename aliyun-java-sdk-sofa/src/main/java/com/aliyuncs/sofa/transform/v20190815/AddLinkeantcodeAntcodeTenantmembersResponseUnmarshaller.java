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

import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeTenantmembersResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeantcodeAntcodeTenantmembersResponseUnmarshaller {

	public static AddLinkeantcodeAntcodeTenantmembersResponse unmarshall(AddLinkeantcodeAntcodeTenantmembersResponse addLinkeantcodeAntcodeTenantmembersResponse, UnmarshallerContext _ctx) {
		
		addLinkeantcodeAntcodeTenantmembersResponse.setRequestId(_ctx.stringValue("AddLinkeantcodeAntcodeTenantmembersResponse.RequestId"));
		addLinkeantcodeAntcodeTenantmembersResponse.setResultCode(_ctx.stringValue("AddLinkeantcodeAntcodeTenantmembersResponse.ResultCode"));
		addLinkeantcodeAntcodeTenantmembersResponse.setResultMessage(_ctx.stringValue("AddLinkeantcodeAntcodeTenantmembersResponse.ResultMessage"));
		addLinkeantcodeAntcodeTenantmembersResponse.setAccessLevel(_ctx.longValue("AddLinkeantcodeAntcodeTenantmembersResponse.AccessLevel"));
		addLinkeantcodeAntcodeTenantmembersResponse.setAvatarUrl(_ctx.stringValue("AddLinkeantcodeAntcodeTenantmembersResponse.AvatarUrl"));
		addLinkeantcodeAntcodeTenantmembersResponse.setEmail(_ctx.stringValue("AddLinkeantcodeAntcodeTenantmembersResponse.Email"));
		addLinkeantcodeAntcodeTenantmembersResponse.setExpiresAt(_ctx.stringValue("AddLinkeantcodeAntcodeTenantmembersResponse.ExpiresAt"));
		addLinkeantcodeAntcodeTenantmembersResponse.setExternUid(_ctx.stringValue("AddLinkeantcodeAntcodeTenantmembersResponse.ExternUid"));
		addLinkeantcodeAntcodeTenantmembersResponse.setId(_ctx.longValue("AddLinkeantcodeAntcodeTenantmembersResponse.Id"));
		addLinkeantcodeAntcodeTenantmembersResponse.setName(_ctx.stringValue("AddLinkeantcodeAntcodeTenantmembersResponse.Name"));
		addLinkeantcodeAntcodeTenantmembersResponse.setResponseStatusCode(_ctx.longValue("AddLinkeantcodeAntcodeTenantmembersResponse.ResponseStatusCode"));
		addLinkeantcodeAntcodeTenantmembersResponse.setState(_ctx.stringValue("AddLinkeantcodeAntcodeTenantmembersResponse.State"));
		addLinkeantcodeAntcodeTenantmembersResponse.setUsername(_ctx.stringValue("AddLinkeantcodeAntcodeTenantmembersResponse.Username"));
		addLinkeantcodeAntcodeTenantmembersResponse.setWebUrl(_ctx.stringValue("AddLinkeantcodeAntcodeTenantmembersResponse.WebUrl"));
	 
	 	return addLinkeantcodeAntcodeTenantmembersResponse;
	}
}