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

import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeAddprojectkeyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeantcodeAntcodeAddprojectkeyResponseUnmarshaller {

	public static AddLinkeantcodeAntcodeAddprojectkeyResponse unmarshall(AddLinkeantcodeAntcodeAddprojectkeyResponse addLinkeantcodeAntcodeAddprojectkeyResponse, UnmarshallerContext _ctx) {
		
		addLinkeantcodeAntcodeAddprojectkeyResponse.setRequestId(_ctx.stringValue("AddLinkeantcodeAntcodeAddprojectkeyResponse.RequestId"));
		addLinkeantcodeAntcodeAddprojectkeyResponse.setResultCode(_ctx.stringValue("AddLinkeantcodeAntcodeAddprojectkeyResponse.ResultCode"));
		addLinkeantcodeAntcodeAddprojectkeyResponse.setResultMessage(_ctx.stringValue("AddLinkeantcodeAntcodeAddprojectkeyResponse.ResultMessage"));
		addLinkeantcodeAntcodeAddprojectkeyResponse.setContext(_ctx.stringValue("AddLinkeantcodeAntcodeAddprojectkeyResponse.Context"));
		addLinkeantcodeAntcodeAddprojectkeyResponse.setCreatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeAddprojectkeyResponse.CreatedAt"));
		addLinkeantcodeAntcodeAddprojectkeyResponse.setFingerprint(_ctx.stringValue("AddLinkeantcodeAntcodeAddprojectkeyResponse.Fingerprint"));
		addLinkeantcodeAntcodeAddprojectkeyResponse.setId(_ctx.longValue("AddLinkeantcodeAntcodeAddprojectkeyResponse.Id"));
		addLinkeantcodeAntcodeAddprojectkeyResponse.setKey(_ctx.stringValue("AddLinkeantcodeAntcodeAddprojectkeyResponse.Key"));
		addLinkeantcodeAntcodeAddprojectkeyResponse.set_Public(_ctx.booleanValue("AddLinkeantcodeAntcodeAddprojectkeyResponse.Public"));
		addLinkeantcodeAntcodeAddprojectkeyResponse.setResponseStatusCode(_ctx.longValue("AddLinkeantcodeAntcodeAddprojectkeyResponse.ResponseStatusCode"));
		addLinkeantcodeAntcodeAddprojectkeyResponse.setShaContext(_ctx.stringValue("AddLinkeantcodeAntcodeAddprojectkeyResponse.ShaContext"));
		addLinkeantcodeAntcodeAddprojectkeyResponse.setTitle(_ctx.stringValue("AddLinkeantcodeAntcodeAddprojectkeyResponse.Title"));
		addLinkeantcodeAntcodeAddprojectkeyResponse.setType(_ctx.stringValue("AddLinkeantcodeAntcodeAddprojectkeyResponse.Type"));
		addLinkeantcodeAntcodeAddprojectkeyResponse.setUpdatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeAddprojectkeyResponse.UpdatedAt"));
		addLinkeantcodeAntcodeAddprojectkeyResponse.setUserId(_ctx.longValue("AddLinkeantcodeAntcodeAddprojectkeyResponse.UserId"));
	 
	 	return addLinkeantcodeAntcodeAddprojectkeyResponse;
	}
}