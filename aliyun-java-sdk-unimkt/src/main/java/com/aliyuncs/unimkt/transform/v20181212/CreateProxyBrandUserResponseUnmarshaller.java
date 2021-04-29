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

package com.aliyuncs.unimkt.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.unimkt.model.v20181212.CreateProxyBrandUserResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateProxyBrandUserResponseUnmarshaller {

	public static CreateProxyBrandUserResponse unmarshall(CreateProxyBrandUserResponse createProxyBrandUserResponse, UnmarshallerContext _ctx) {
		
		createProxyBrandUserResponse.setRequestId(_ctx.stringValue("CreateProxyBrandUserResponse.RequestId"));
		createProxyBrandUserResponse.setCode(_ctx.integerValue("CreateProxyBrandUserResponse.Code"));
		createProxyBrandUserResponse.setSuccess(_ctx.booleanValue("CreateProxyBrandUserResponse.Success"));
		createProxyBrandUserResponse.setErrorMsg(_ctx.stringValue("CreateProxyBrandUserResponse.ErrorMsg"));

		List<Map<Object, Object>> data = _ctx.listMapValue("CreateProxyBrandUserResponse.Data");
		createProxyBrandUserResponse.setData(data);
	 
	 	return createProxyBrandUserResponse;
	}
}