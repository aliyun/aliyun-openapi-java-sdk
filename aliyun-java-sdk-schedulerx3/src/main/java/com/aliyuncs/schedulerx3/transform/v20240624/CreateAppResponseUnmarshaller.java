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

package com.aliyuncs.schedulerx3.transform.v20240624;

import com.aliyuncs.schedulerx3.model.v20240624.CreateAppResponse;
import com.aliyuncs.schedulerx3.model.v20240624.CreateAppResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAppResponseUnmarshaller {

	public static CreateAppResponse unmarshall(CreateAppResponse createAppResponse, UnmarshallerContext _ctx) {
		
		createAppResponse.setRequestId(_ctx.stringValue("CreateAppResponse.RequestId"));
		createAppResponse.setCode(_ctx.integerValue("CreateAppResponse.Code"));
		createAppResponse.setMessage(_ctx.stringValue("CreateAppResponse.Message"));
		createAppResponse.setSuccess(_ctx.booleanValue("CreateAppResponse.Success"));

		Data data = new Data();
		data.setAppGroupId(_ctx.longValue("CreateAppResponse.Data.AppGroupId"));
		data.setAccessToken(_ctx.stringValue("CreateAppResponse.Data.AccessToken"));
		createAppResponse.setData(data);
	 
	 	return createAppResponse;
	}
}