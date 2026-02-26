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

import com.aliyuncs.dyplsapi.model.v20170525.BindXBResponse;
import com.aliyuncs.dyplsapi.model.v20170525.BindXBResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindXBResponseUnmarshaller {

	public static BindXBResponse unmarshall(BindXBResponse bindXBResponse, UnmarshallerContext _ctx) {
		
		bindXBResponse.setAccessDeniedDetail(_ctx.stringValue("BindXBResponse.AccessDeniedDetail"));
		bindXBResponse.setMessage(_ctx.stringValue("BindXBResponse.Message"));
		bindXBResponse.setCode(_ctx.stringValue("BindXBResponse.Code"));
		bindXBResponse.setSuccess(_ctx.booleanValue("BindXBResponse.Success"));

		Data data = new Data();
		data.setAuthId(_ctx.stringValue("BindXBResponse.Data.AuthId"));
		data.setTelX(_ctx.stringValue("BindXBResponse.Data.TelX"));
		bindXBResponse.setData(data);
	 
	 	return bindXBResponse;
	}
}