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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeLockprojectvariableResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeantcodeAntcodeLockprojectvariableResponseUnmarshaller {

	public static ExecLinkeantcodeAntcodeLockprojectvariableResponse unmarshall(ExecLinkeantcodeAntcodeLockprojectvariableResponse execLinkeantcodeAntcodeLockprojectvariableResponse, UnmarshallerContext _ctx) {
		
		execLinkeantcodeAntcodeLockprojectvariableResponse.setRequestId(_ctx.stringValue("ExecLinkeantcodeAntcodeLockprojectvariableResponse.RequestId"));
		execLinkeantcodeAntcodeLockprojectvariableResponse.setResultCode(_ctx.stringValue("ExecLinkeantcodeAntcodeLockprojectvariableResponse.ResultCode"));
		execLinkeantcodeAntcodeLockprojectvariableResponse.setResultMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeLockprojectvariableResponse.ResultMessage"));
		execLinkeantcodeAntcodeLockprojectvariableResponse.setId(_ctx.stringValue("ExecLinkeantcodeAntcodeLockprojectvariableResponse.Id"));
		execLinkeantcodeAntcodeLockprojectvariableResponse.setKey(_ctx.stringValue("ExecLinkeantcodeAntcodeLockprojectvariableResponse.Key"));
		execLinkeantcodeAntcodeLockprojectvariableResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeantcodeAntcodeLockprojectvariableResponse.ResponseStatusCode"));
		execLinkeantcodeAntcodeLockprojectvariableResponse.setSecret(_ctx.booleanValue("ExecLinkeantcodeAntcodeLockprojectvariableResponse.Secret"));
		execLinkeantcodeAntcodeLockprojectvariableResponse.setValue(_ctx.stringValue("ExecLinkeantcodeAntcodeLockprojectvariableResponse.Value"));
	 
	 	return execLinkeantcodeAntcodeLockprojectvariableResponse;
	}
}