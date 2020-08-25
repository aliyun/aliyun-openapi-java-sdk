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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreateprojectvariableResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeCreateprojectvariableResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeCreateprojectvariableResponse unmarshall(CreateLinkeantcodeAntcodeCreateprojectvariableResponse createLinkeantcodeAntcodeCreateprojectvariableResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeCreateprojectvariableResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectvariableResponse.RequestId"));
		createLinkeantcodeAntcodeCreateprojectvariableResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectvariableResponse.ResultCode"));
		createLinkeantcodeAntcodeCreateprojectvariableResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectvariableResponse.ResultMessage"));
		createLinkeantcodeAntcodeCreateprojectvariableResponse.setId(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectvariableResponse.Id"));
		createLinkeantcodeAntcodeCreateprojectvariableResponse.setKey(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectvariableResponse.Key"));
		createLinkeantcodeAntcodeCreateprojectvariableResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectvariableResponse.ResponseStatusCode"));
		createLinkeantcodeAntcodeCreateprojectvariableResponse.setSecret(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectvariableResponse.Secret"));
		createLinkeantcodeAntcodeCreateprojectvariableResponse.setValue(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectvariableResponse.Value"));
	 
	 	return createLinkeantcodeAntcodeCreateprojectvariableResponse;
	}
}