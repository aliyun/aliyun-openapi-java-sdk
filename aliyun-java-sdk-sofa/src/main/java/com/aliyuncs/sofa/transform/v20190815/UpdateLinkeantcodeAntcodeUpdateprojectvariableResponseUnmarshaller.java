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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdateprojectvariableResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeUpdateprojectvariableResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeUpdateprojectvariableResponse unmarshall(UpdateLinkeantcodeAntcodeUpdateprojectvariableResponse updateLinkeantcodeAntcodeUpdateprojectvariableResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeUpdateprojectvariableResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectvariableResponse.RequestId"));
		updateLinkeantcodeAntcodeUpdateprojectvariableResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectvariableResponse.ResultCode"));
		updateLinkeantcodeAntcodeUpdateprojectvariableResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectvariableResponse.ResultMessage"));
		updateLinkeantcodeAntcodeUpdateprojectvariableResponse.setId(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectvariableResponse.Id"));
		updateLinkeantcodeAntcodeUpdateprojectvariableResponse.setKey(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectvariableResponse.Key"));
		updateLinkeantcodeAntcodeUpdateprojectvariableResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectvariableResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeUpdateprojectvariableResponse.setSecret(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectvariableResponse.Secret"));
		updateLinkeantcodeAntcodeUpdateprojectvariableResponse.setValue(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectvariableResponse.Value"));
	 
	 	return updateLinkeantcodeAntcodeUpdateprojectvariableResponse;
	}
}