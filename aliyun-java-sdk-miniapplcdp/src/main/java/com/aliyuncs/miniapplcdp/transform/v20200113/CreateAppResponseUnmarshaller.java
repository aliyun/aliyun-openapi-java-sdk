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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import com.aliyuncs.miniapplcdp.model.v20200113.CreateAppResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.CreateAppResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAppResponseUnmarshaller {

	public static CreateAppResponse unmarshall(CreateAppResponse createAppResponse, UnmarshallerContext _ctx) {
		
		createAppResponse.setRequestId(_ctx.stringValue("CreateAppResponse.RequestId"));

		Data data = new Data();
		data.setAppStatus(_ctx.stringValue("CreateAppResponse.Data.AppStatus"));
		data.setAppName(_ctx.stringValue("CreateAppResponse.Data.AppName"));
		data.setIsTemplate(_ctx.booleanValue("CreateAppResponse.Data.IsTemplate"));
		data.setModifiedTime(_ctx.stringValue("CreateAppResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("CreateAppResponse.Data.Description"));
		data.setCreateTime(_ctx.stringValue("CreateAppResponse.Data.CreateTime"));
		data.setAppId(_ctx.stringValue("CreateAppResponse.Data.AppId"));
		data.setIcon(_ctx.stringValue("CreateAppResponse.Data.Icon"));
		data.setAppType(_ctx.stringValue("CreateAppResponse.Data.AppType"));
		data.setSource(_ctx.stringValue("CreateAppResponse.Data.Source"));
		data.setLastEditTime(_ctx.stringValue("CreateAppResponse.Data.LastEditTime"));
		createAppResponse.setData(data);
	 
	 	return createAppResponse;
	}
}