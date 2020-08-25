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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdateprojectmemberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeUpdateprojectmemberResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeUpdateprojectmemberResponse unmarshall(UpdateLinkeantcodeAntcodeUpdateprojectmemberResponse updateLinkeantcodeAntcodeUpdateprojectmemberResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeUpdateprojectmemberResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectmemberResponse.RequestId"));
		updateLinkeantcodeAntcodeUpdateprojectmemberResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectmemberResponse.ResultCode"));
		updateLinkeantcodeAntcodeUpdateprojectmemberResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectmemberResponse.ResultMessage"));
		updateLinkeantcodeAntcodeUpdateprojectmemberResponse.setAccessLevel(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectmemberResponse.AccessLevel"));
		updateLinkeantcodeAntcodeUpdateprojectmemberResponse.setAvatarUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectmemberResponse.AvatarUrl"));
		updateLinkeantcodeAntcodeUpdateprojectmemberResponse.setEmail(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectmemberResponse.Email"));
		updateLinkeantcodeAntcodeUpdateprojectmemberResponse.setExpiresAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectmemberResponse.ExpiresAt"));
		updateLinkeantcodeAntcodeUpdateprojectmemberResponse.setExternUid(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectmemberResponse.ExternUid"));
		updateLinkeantcodeAntcodeUpdateprojectmemberResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectmemberResponse.Id"));
		updateLinkeantcodeAntcodeUpdateprojectmemberResponse.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectmemberResponse.Name"));
		updateLinkeantcodeAntcodeUpdateprojectmemberResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectmemberResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeUpdateprojectmemberResponse.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectmemberResponse.State"));
		updateLinkeantcodeAntcodeUpdateprojectmemberResponse.setUsername(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectmemberResponse.Username"));
		updateLinkeantcodeAntcodeUpdateprojectmemberResponse.setWebUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectmemberResponse.WebUrl"));
	 
	 	return updateLinkeantcodeAntcodeUpdateprojectmemberResponse;
	}
}