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

package com.aliyuncs.copyright.transform.v20190123;

import com.aliyuncs.copyright.model.v20190123.RegisterNumberCheckResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RegisterNumberCheckResponseUnmarshaller {

	public static RegisterNumberCheckResponse unmarshall(RegisterNumberCheckResponse registerNumberCheckResponse, UnmarshallerContext _ctx) {
		
		registerNumberCheckResponse.setRequestId(_ctx.stringValue("RegisterNumberCheckResponse.RequestId"));
		registerNumberCheckResponse.setSuccess(_ctx.booleanValue("RegisterNumberCheckResponse.Success"));
		registerNumberCheckResponse.setMessage(_ctx.stringValue("RegisterNumberCheckResponse.Message"));
		registerNumberCheckResponse.setR11Registered(_ctx.booleanValue("RegisterNumberCheckResponse.R11Registered"));
		registerNumberCheckResponse.setR41RegisterNumber(_ctx.stringValue("RegisterNumberCheckResponse.R41RegisterNumber"));
		registerNumberCheckResponse.setCompleteDate(_ctx.longValue("RegisterNumberCheckResponse.CompleteDate"));
		registerNumberCheckResponse.setFirstAppearDate(_ctx.longValue("RegisterNumberCheckResponse.FirstAppearDate"));
		registerNumberCheckResponse.setPublishStatus(_ctx.stringValue("RegisterNumberCheckResponse.PublishStatus"));
		registerNumberCheckResponse.setSoftwareFullName(_ctx.stringValue("RegisterNumberCheckResponse.SoftwareFullName"));
		registerNumberCheckResponse.setSoftwareShortName(_ctx.stringValue("RegisterNumberCheckResponse.SoftwareShortName"));
		registerNumberCheckResponse.setVersion(_ctx.stringValue("RegisterNumberCheckResponse.Version"));
	 
	 	return registerNumberCheckResponse;
	}
}