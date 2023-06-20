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

package com.aliyuncs.cd.transform.v2021127;

import com.aliyuncs.cd.model.v2021127.CreateMenuDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMenuDataResponseUnmarshaller {

	public static CreateMenuDataResponse unmarshall(CreateMenuDataResponse createMenuDataResponse, UnmarshallerContext _ctx) {
		
		createMenuDataResponse.setRequestId(_ctx.stringValue("CreateMenuDataResponse.RequestId"));
		createMenuDataResponse.setSuccess(_ctx.booleanValue("CreateMenuDataResponse.Success"));
		createMenuDataResponse.setMessage(_ctx.stringValue("CreateMenuDataResponse.Message"));
		createMenuDataResponse.setCode(_ctx.stringValue("CreateMenuDataResponse.Code"));
		createMenuDataResponse.setHttpStatusCode(_ctx.integerValue("CreateMenuDataResponse.HttpStatusCode"));
		createMenuDataResponse.setData(_ctx.stringValue("CreateMenuDataResponse.Data"));
	 
	 	return createMenuDataResponse;
	}
}