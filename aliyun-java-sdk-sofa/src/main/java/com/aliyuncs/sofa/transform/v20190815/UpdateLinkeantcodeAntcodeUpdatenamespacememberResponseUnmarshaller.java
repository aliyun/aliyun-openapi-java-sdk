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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdatenamespacememberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeUpdatenamespacememberResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeUpdatenamespacememberResponse unmarshall(UpdateLinkeantcodeAntcodeUpdatenamespacememberResponse updateLinkeantcodeAntcodeUpdatenamespacememberResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeUpdatenamespacememberResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatenamespacememberResponse.RequestId"));
		updateLinkeantcodeAntcodeUpdatenamespacememberResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatenamespacememberResponse.ResultCode"));
		updateLinkeantcodeAntcodeUpdatenamespacememberResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatenamespacememberResponse.ResultMessage"));
		updateLinkeantcodeAntcodeUpdatenamespacememberResponse.setAccessLevel(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatenamespacememberResponse.AccessLevel"));
		updateLinkeantcodeAntcodeUpdatenamespacememberResponse.setAvatarUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatenamespacememberResponse.AvatarUrl"));
		updateLinkeantcodeAntcodeUpdatenamespacememberResponse.setEmail(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatenamespacememberResponse.Email"));
		updateLinkeantcodeAntcodeUpdatenamespacememberResponse.setExpiresAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatenamespacememberResponse.ExpiresAt"));
		updateLinkeantcodeAntcodeUpdatenamespacememberResponse.setExternUid(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatenamespacememberResponse.ExternUid"));
		updateLinkeantcodeAntcodeUpdatenamespacememberResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatenamespacememberResponse.Id"));
		updateLinkeantcodeAntcodeUpdatenamespacememberResponse.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatenamespacememberResponse.Name"));
		updateLinkeantcodeAntcodeUpdatenamespacememberResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatenamespacememberResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeUpdatenamespacememberResponse.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatenamespacememberResponse.State"));
		updateLinkeantcodeAntcodeUpdatenamespacememberResponse.setUsername(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatenamespacememberResponse.Username"));
		updateLinkeantcodeAntcodeUpdatenamespacememberResponse.setWebUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatenamespacememberResponse.WebUrl"));
	 
	 	return updateLinkeantcodeAntcodeUpdatenamespacememberResponse;
	}
}