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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.AddAuthResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddAuthResourceResponseUnmarshaller {

	public static AddAuthResourceResponse unmarshall(AddAuthResourceResponse addAuthResourceResponse, UnmarshallerContext _ctx) {
		
		addAuthResourceResponse.setRequestId(_ctx.stringValue("AddAuthResourceResponse.RequestId"));
		addAuthResourceResponse.setHttpStatusCode(_ctx.integerValue("AddAuthResourceResponse.HttpStatusCode"));
		addAuthResourceResponse.setMessage(_ctx.stringValue("AddAuthResourceResponse.Message"));
		addAuthResourceResponse.setCode(_ctx.integerValue("AddAuthResourceResponse.Code"));
		addAuthResourceResponse.setSuccess(_ctx.booleanValue("AddAuthResourceResponse.Success"));
		addAuthResourceResponse.setData(_ctx.longValue("AddAuthResourceResponse.Data"));
	 
	 	return addAuthResourceResponse;
	}
}