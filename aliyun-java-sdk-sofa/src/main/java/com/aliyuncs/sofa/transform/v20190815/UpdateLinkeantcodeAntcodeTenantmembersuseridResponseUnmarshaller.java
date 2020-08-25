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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeTenantmembersuseridResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeTenantmembersuseridResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeTenantmembersuseridResponse unmarshall(UpdateLinkeantcodeAntcodeTenantmembersuseridResponse updateLinkeantcodeAntcodeTenantmembersuseridResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeTenantmembersuseridResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantmembersuseridResponse.RequestId"));
		updateLinkeantcodeAntcodeTenantmembersuseridResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantmembersuseridResponse.ResultCode"));
		updateLinkeantcodeAntcodeTenantmembersuseridResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantmembersuseridResponse.ResultMessage"));
		updateLinkeantcodeAntcodeTenantmembersuseridResponse.setAccessLevel(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantmembersuseridResponse.AccessLevel"));
		updateLinkeantcodeAntcodeTenantmembersuseridResponse.setAvatarUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantmembersuseridResponse.AvatarUrl"));
		updateLinkeantcodeAntcodeTenantmembersuseridResponse.setEmail(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantmembersuseridResponse.Email"));
		updateLinkeantcodeAntcodeTenantmembersuseridResponse.setExpiresAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantmembersuseridResponse.ExpiresAt"));
		updateLinkeantcodeAntcodeTenantmembersuseridResponse.setExternUid(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantmembersuseridResponse.ExternUid"));
		updateLinkeantcodeAntcodeTenantmembersuseridResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantmembersuseridResponse.Id"));
		updateLinkeantcodeAntcodeTenantmembersuseridResponse.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantmembersuseridResponse.Name"));
		updateLinkeantcodeAntcodeTenantmembersuseridResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantmembersuseridResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeTenantmembersuseridResponse.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantmembersuseridResponse.State"));
		updateLinkeantcodeAntcodeTenantmembersuseridResponse.setUsername(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantmembersuseridResponse.Username"));
		updateLinkeantcodeAntcodeTenantmembersuseridResponse.setWebUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantmembersuseridResponse.WebUrl"));
	 
	 	return updateLinkeantcodeAntcodeTenantmembersuseridResponse;
	}
}