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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeUnlockprojectvariableResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeantcodeAntcodeUnlockprojectvariableResponseUnmarshaller {

	public static ExecLinkeantcodeAntcodeUnlockprojectvariableResponse unmarshall(ExecLinkeantcodeAntcodeUnlockprojectvariableResponse execLinkeantcodeAntcodeUnlockprojectvariableResponse, UnmarshallerContext _ctx) {
		
		execLinkeantcodeAntcodeUnlockprojectvariableResponse.setRequestId(_ctx.stringValue("ExecLinkeantcodeAntcodeUnlockprojectvariableResponse.RequestId"));
		execLinkeantcodeAntcodeUnlockprojectvariableResponse.setResultCode(_ctx.stringValue("ExecLinkeantcodeAntcodeUnlockprojectvariableResponse.ResultCode"));
		execLinkeantcodeAntcodeUnlockprojectvariableResponse.setResultMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeUnlockprojectvariableResponse.ResultMessage"));
		execLinkeantcodeAntcodeUnlockprojectvariableResponse.setId(_ctx.stringValue("ExecLinkeantcodeAntcodeUnlockprojectvariableResponse.Id"));
		execLinkeantcodeAntcodeUnlockprojectvariableResponse.setKey(_ctx.stringValue("ExecLinkeantcodeAntcodeUnlockprojectvariableResponse.Key"));
		execLinkeantcodeAntcodeUnlockprojectvariableResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeantcodeAntcodeUnlockprojectvariableResponse.ResponseStatusCode"));
		execLinkeantcodeAntcodeUnlockprojectvariableResponse.setSecret(_ctx.booleanValue("ExecLinkeantcodeAntcodeUnlockprojectvariableResponse.Secret"));
		execLinkeantcodeAntcodeUnlockprojectvariableResponse.setValue(_ctx.stringValue("ExecLinkeantcodeAntcodeUnlockprojectvariableResponse.Value"));
	 
	 	return execLinkeantcodeAntcodeUnlockprojectvariableResponse;
	}
}