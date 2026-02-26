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

package com.aliyuncs.dyplsapi.transform.v20170525;

import com.aliyuncs.dyplsapi.model.v20170525.CreateSmsSignResponse;
import com.aliyuncs.dyplsapi.model.v20170525.CreateSmsSignResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSmsSignResponseUnmarshaller {

	public static CreateSmsSignResponse unmarshall(CreateSmsSignResponse createSmsSignResponse, UnmarshallerContext _ctx) {
		
		createSmsSignResponse.setAccessDeniedDetail(_ctx.stringValue("CreateSmsSignResponse.AccessDeniedDetail"));
		createSmsSignResponse.setMessage(_ctx.stringValue("CreateSmsSignResponse.Message"));
		createSmsSignResponse.setCode(_ctx.stringValue("CreateSmsSignResponse.Code"));
		createSmsSignResponse.setSuccess(_ctx.booleanValue("CreateSmsSignResponse.Success"));

		Data data = new Data();
		data.setCalledNoSign(_ctx.stringValue("CreateSmsSignResponse.Data.CalledNoSign"));
		createSmsSignResponse.setData(data);
	 
	 	return createSmsSignResponse;
	}
}