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

import com.aliyuncs.miniapplcdp.model.v20200113.GetAppResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.GetAppResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppResponseUnmarshaller {

	public static GetAppResponse unmarshall(GetAppResponse getAppResponse, UnmarshallerContext _ctx) {
		
		getAppResponse.setRequestId(_ctx.stringValue("GetAppResponse.RequestId"));

		Data data = new Data();
		data.setAppStatus(_ctx.stringValue("GetAppResponse.Data.AppStatus"));
		data.setAppName(_ctx.stringValue("GetAppResponse.Data.AppName"));
		data.setIsTemplate(_ctx.booleanValue("GetAppResponse.Data.IsTemplate"));
		data.setModifiedTime(_ctx.stringValue("GetAppResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("GetAppResponse.Data.Description"));
		data.setCreateTime(_ctx.stringValue("GetAppResponse.Data.CreateTime"));
		data.setAppId(_ctx.stringValue("GetAppResponse.Data.AppId"));
		data.setIcon(_ctx.stringValue("GetAppResponse.Data.Icon"));
		data.setAppType(_ctx.stringValue("GetAppResponse.Data.AppType"));
		data.setSource(_ctx.stringValue("GetAppResponse.Data.Source"));
		data.setLastEditTime(_ctx.stringValue("GetAppResponse.Data.LastEditTime"));
		getAppResponse.setData(data);
	 
	 	return getAppResponse;
	}
}