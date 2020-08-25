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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeGpgkeyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeGpgkeyResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeGpgkeyResponse unmarshall(CreateLinkeantcodeAntcodeGpgkeyResponse createLinkeantcodeAntcodeGpgkeyResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeGpgkeyResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeGpgkeyResponse.RequestId"));
		createLinkeantcodeAntcodeGpgkeyResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeGpgkeyResponse.ResultCode"));
		createLinkeantcodeAntcodeGpgkeyResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeGpgkeyResponse.ResultMessage"));
		createLinkeantcodeAntcodeGpgkeyResponse.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeGpgkeyResponse.CreatedAt"));
		createLinkeantcodeAntcodeGpgkeyResponse.setId(_ctx.longValue("CreateLinkeantcodeAntcodeGpgkeyResponse.Id"));
		createLinkeantcodeAntcodeGpgkeyResponse.setKey(_ctx.stringValue("CreateLinkeantcodeAntcodeGpgkeyResponse.Key"));
		createLinkeantcodeAntcodeGpgkeyResponse.setPrimaryKeyid(_ctx.stringValue("CreateLinkeantcodeAntcodeGpgkeyResponse.PrimaryKeyid"));
		createLinkeantcodeAntcodeGpgkeyResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeGpgkeyResponse.ResponseStatusCode"));
	 
	 	return createLinkeantcodeAntcodeGpgkeyResponse;
	}
}