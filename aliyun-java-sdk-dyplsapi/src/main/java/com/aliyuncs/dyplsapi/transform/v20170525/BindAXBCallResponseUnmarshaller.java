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

import com.aliyuncs.dyplsapi.model.v20170525.BindAXBCallResponse;
import com.aliyuncs.dyplsapi.model.v20170525.BindAXBCallResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindAXBCallResponseUnmarshaller {

	public static BindAXBCallResponse unmarshall(BindAXBCallResponse bindAXBCallResponse, UnmarshallerContext _ctx) {
		
		bindAXBCallResponse.setAccessDeniedDetail(_ctx.stringValue("BindAXBCallResponse.AccessDeniedDetail"));
		bindAXBCallResponse.setMessage(_ctx.stringValue("BindAXBCallResponse.Message"));
		bindAXBCallResponse.setCode(_ctx.stringValue("BindAXBCallResponse.Code"));
		bindAXBCallResponse.setSuccess(_ctx.booleanValue("BindAXBCallResponse.Success"));

		Data data = new Data();
		data.setBindId(_ctx.stringValue("BindAXBCallResponse.Data.BindId"));
		bindAXBCallResponse.setData(data);
	 
	 	return bindAXBCallResponse;
	}
}