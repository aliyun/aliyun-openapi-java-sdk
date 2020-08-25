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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeProjectreviewmemberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeProjectreviewmemberResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeProjectreviewmemberResponse unmarshall(UpdateLinkeantcodeAntcodeProjectreviewmemberResponse updateLinkeantcodeAntcodeProjectreviewmemberResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeProjectreviewmemberResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewmemberResponse.RequestId"));
		updateLinkeantcodeAntcodeProjectreviewmemberResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewmemberResponse.ResultCode"));
		updateLinkeantcodeAntcodeProjectreviewmemberResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewmemberResponse.ResultMessage"));
		updateLinkeantcodeAntcodeProjectreviewmemberResponse.setAccessLevel(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectreviewmemberResponse.AccessLevel"));
		updateLinkeantcodeAntcodeProjectreviewmemberResponse.setAvatarUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewmemberResponse.AvatarUrl"));
		updateLinkeantcodeAntcodeProjectreviewmemberResponse.setEmail(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewmemberResponse.Email"));
		updateLinkeantcodeAntcodeProjectreviewmemberResponse.setExpiresAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewmemberResponse.ExpiresAt"));
		updateLinkeantcodeAntcodeProjectreviewmemberResponse.setExternUid(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewmemberResponse.ExternUid"));
		updateLinkeantcodeAntcodeProjectreviewmemberResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectreviewmemberResponse.Id"));
		updateLinkeantcodeAntcodeProjectreviewmemberResponse.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewmemberResponse.Name"));
		updateLinkeantcodeAntcodeProjectreviewmemberResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectreviewmemberResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeProjectreviewmemberResponse.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewmemberResponse.State"));
		updateLinkeantcodeAntcodeProjectreviewmemberResponse.setUsername(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewmemberResponse.Username"));
		updateLinkeantcodeAntcodeProjectreviewmemberResponse.setWebUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewmemberResponse.WebUrl"));
	 
	 	return updateLinkeantcodeAntcodeProjectreviewmemberResponse;
	}
}