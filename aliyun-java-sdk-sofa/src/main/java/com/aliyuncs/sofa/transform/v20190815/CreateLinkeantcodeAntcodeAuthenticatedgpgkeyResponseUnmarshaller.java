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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponse unmarshall(CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponse createLinkeantcodeAntcodeAuthenticatedgpgkeyResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeAuthenticatedgpgkeyResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponse.RequestId"));
		createLinkeantcodeAntcodeAuthenticatedgpgkeyResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponse.ResultCode"));
		createLinkeantcodeAntcodeAuthenticatedgpgkeyResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponse.ResultMessage"));
		createLinkeantcodeAntcodeAuthenticatedgpgkeyResponse.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponse.CreatedAt"));
		createLinkeantcodeAntcodeAuthenticatedgpgkeyResponse.setId(_ctx.longValue("CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponse.Id"));
		createLinkeantcodeAntcodeAuthenticatedgpgkeyResponse.setKey(_ctx.stringValue("CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponse.Key"));
		createLinkeantcodeAntcodeAuthenticatedgpgkeyResponse.setPrimaryKeyid(_ctx.stringValue("CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponse.PrimaryKeyid"));
		createLinkeantcodeAntcodeAuthenticatedgpgkeyResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeAuthenticatedgpgkeyResponse.ResponseStatusCode"));
	 
	 	return createLinkeantcodeAntcodeAuthenticatedgpgkeyResponse;
	}
}