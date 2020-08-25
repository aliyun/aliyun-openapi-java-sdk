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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeUserkeysResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeUserkeysResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeUserkeysResponse unmarshall(CreateLinkeantcodeAntcodeUserkeysResponse createLinkeantcodeAntcodeUserkeysResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeUserkeysResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeUserkeysResponse.RequestId"));
		createLinkeantcodeAntcodeUserkeysResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeUserkeysResponse.ResultCode"));
		createLinkeantcodeAntcodeUserkeysResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeUserkeysResponse.ResultMessage"));
		createLinkeantcodeAntcodeUserkeysResponse.setContext(_ctx.stringValue("CreateLinkeantcodeAntcodeUserkeysResponse.Context"));
		createLinkeantcodeAntcodeUserkeysResponse.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeUserkeysResponse.CreatedAt"));
		createLinkeantcodeAntcodeUserkeysResponse.setFingerprint(_ctx.stringValue("CreateLinkeantcodeAntcodeUserkeysResponse.Fingerprint"));
		createLinkeantcodeAntcodeUserkeysResponse.setId(_ctx.longValue("CreateLinkeantcodeAntcodeUserkeysResponse.Id"));
		createLinkeantcodeAntcodeUserkeysResponse.setKey(_ctx.stringValue("CreateLinkeantcodeAntcodeUserkeysResponse.Key"));
		createLinkeantcodeAntcodeUserkeysResponse.set_Public(_ctx.booleanValue("CreateLinkeantcodeAntcodeUserkeysResponse.Public"));
		createLinkeantcodeAntcodeUserkeysResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeUserkeysResponse.ResponseStatusCode"));
		createLinkeantcodeAntcodeUserkeysResponse.setShaContext(_ctx.stringValue("CreateLinkeantcodeAntcodeUserkeysResponse.ShaContext"));
		createLinkeantcodeAntcodeUserkeysResponse.setTitle(_ctx.stringValue("CreateLinkeantcodeAntcodeUserkeysResponse.Title"));
		createLinkeantcodeAntcodeUserkeysResponse.setType(_ctx.stringValue("CreateLinkeantcodeAntcodeUserkeysResponse.Type"));
		createLinkeantcodeAntcodeUserkeysResponse.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeUserkeysResponse.UpdatedAt"));
		createLinkeantcodeAntcodeUserkeysResponse.setUserId(_ctx.longValue("CreateLinkeantcodeAntcodeUserkeysResponse.UserId"));
	 
	 	return createLinkeantcodeAntcodeUserkeysResponse;
	}
}