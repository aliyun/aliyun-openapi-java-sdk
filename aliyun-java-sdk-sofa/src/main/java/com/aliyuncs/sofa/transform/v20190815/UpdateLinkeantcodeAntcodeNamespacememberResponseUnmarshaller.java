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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeNamespacememberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeNamespacememberResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeNamespacememberResponse unmarshall(UpdateLinkeantcodeAntcodeNamespacememberResponse updateLinkeantcodeAntcodeNamespacememberResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeNamespacememberResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacememberResponse.RequestId"));
		updateLinkeantcodeAntcodeNamespacememberResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacememberResponse.ResultCode"));
		updateLinkeantcodeAntcodeNamespacememberResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacememberResponse.ResultMessage"));
		updateLinkeantcodeAntcodeNamespacememberResponse.setAccessLevel(_ctx.longValue("UpdateLinkeantcodeAntcodeNamespacememberResponse.AccessLevel"));
		updateLinkeantcodeAntcodeNamespacememberResponse.setAvatarUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacememberResponse.AvatarUrl"));
		updateLinkeantcodeAntcodeNamespacememberResponse.setEmail(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacememberResponse.Email"));
		updateLinkeantcodeAntcodeNamespacememberResponse.setExpiresAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacememberResponse.ExpiresAt"));
		updateLinkeantcodeAntcodeNamespacememberResponse.setExternUid(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacememberResponse.ExternUid"));
		updateLinkeantcodeAntcodeNamespacememberResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeNamespacememberResponse.Id"));
		updateLinkeantcodeAntcodeNamespacememberResponse.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacememberResponse.Name"));
		updateLinkeantcodeAntcodeNamespacememberResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeNamespacememberResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeNamespacememberResponse.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacememberResponse.State"));
		updateLinkeantcodeAntcodeNamespacememberResponse.setUsername(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacememberResponse.Username"));
		updateLinkeantcodeAntcodeNamespacememberResponse.setWebUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacememberResponse.WebUrl"));
	 
	 	return updateLinkeantcodeAntcodeNamespacememberResponse;
	}
}