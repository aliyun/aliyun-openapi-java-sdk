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

package com.aliyuncs.dysmsapi.transform.v20170525;

import com.aliyuncs.dysmsapi.model.v20170525.AddSmsSignResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddSmsSignResponseUnmarshaller {

	public static AddSmsSignResponse unmarshall(AddSmsSignResponse addSmsSignResponse, UnmarshallerContext _ctx) {
		
		addSmsSignResponse.setRequestId(_ctx.stringValue("AddSmsSignResponse.RequestId"));
		addSmsSignResponse.setSignName(_ctx.stringValue("AddSmsSignResponse.SignName"));
		addSmsSignResponse.setCode(_ctx.stringValue("AddSmsSignResponse.Code"));
		addSmsSignResponse.setMessage(_ctx.stringValue("AddSmsSignResponse.Message"));
	 
	 	return addSmsSignResponse;
	}
}