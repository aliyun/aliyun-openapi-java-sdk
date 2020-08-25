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

import com.aliyuncs.sofa.model.v20190815.RemoveLinkeantcodeAntcodeUsergpgkeyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveLinkeantcodeAntcodeUsergpgkeyResponseUnmarshaller {

	public static RemoveLinkeantcodeAntcodeUsergpgkeyResponse unmarshall(RemoveLinkeantcodeAntcodeUsergpgkeyResponse removeLinkeantcodeAntcodeUsergpgkeyResponse, UnmarshallerContext _ctx) {
		
		removeLinkeantcodeAntcodeUsergpgkeyResponse.setRequestId(_ctx.stringValue("RemoveLinkeantcodeAntcodeUsergpgkeyResponse.RequestId"));
		removeLinkeantcodeAntcodeUsergpgkeyResponse.setResultCode(_ctx.stringValue("RemoveLinkeantcodeAntcodeUsergpgkeyResponse.ResultCode"));
		removeLinkeantcodeAntcodeUsergpgkeyResponse.setResultMessage(_ctx.stringValue("RemoveLinkeantcodeAntcodeUsergpgkeyResponse.ResultMessage"));
		removeLinkeantcodeAntcodeUsergpgkeyResponse.setCreatedAt(_ctx.stringValue("RemoveLinkeantcodeAntcodeUsergpgkeyResponse.CreatedAt"));
		removeLinkeantcodeAntcodeUsergpgkeyResponse.setId(_ctx.longValue("RemoveLinkeantcodeAntcodeUsergpgkeyResponse.Id"));
		removeLinkeantcodeAntcodeUsergpgkeyResponse.setKey(_ctx.stringValue("RemoveLinkeantcodeAntcodeUsergpgkeyResponse.Key"));
		removeLinkeantcodeAntcodeUsergpgkeyResponse.setPrimaryKeyid(_ctx.stringValue("RemoveLinkeantcodeAntcodeUsergpgkeyResponse.PrimaryKeyid"));
		removeLinkeantcodeAntcodeUsergpgkeyResponse.setResponseStatusCode(_ctx.longValue("RemoveLinkeantcodeAntcodeUsergpgkeyResponse.ResponseStatusCode"));
	 
	 	return removeLinkeantcodeAntcodeUsergpgkeyResponse;
	}
}