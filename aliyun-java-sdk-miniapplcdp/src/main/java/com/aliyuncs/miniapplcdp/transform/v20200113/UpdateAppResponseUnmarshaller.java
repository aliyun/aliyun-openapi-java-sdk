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

import com.aliyuncs.miniapplcdp.model.v20200113.UpdateAppResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.UpdateAppResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAppResponseUnmarshaller {

	public static UpdateAppResponse unmarshall(UpdateAppResponse updateAppResponse, UnmarshallerContext _ctx) {
		
		updateAppResponse.setRequestId(_ctx.stringValue("UpdateAppResponse.RequestId"));

		Data data = new Data();
		data.setAppStatus(_ctx.stringValue("UpdateAppResponse.Data.AppStatus"));
		data.setAppName(_ctx.stringValue("UpdateAppResponse.Data.AppName"));
		data.setIsTemplate(_ctx.booleanValue("UpdateAppResponse.Data.IsTemplate"));
		data.setModifiedTime(_ctx.stringValue("UpdateAppResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("UpdateAppResponse.Data.Description"));
		data.setCreateTime(_ctx.stringValue("UpdateAppResponse.Data.CreateTime"));
		data.setAppId(_ctx.stringValue("UpdateAppResponse.Data.AppId"));
		data.setIcon(_ctx.stringValue("UpdateAppResponse.Data.Icon"));
		data.setAppType(_ctx.stringValue("UpdateAppResponse.Data.AppType"));
		data.setSource(_ctx.stringValue("UpdateAppResponse.Data.Source"));
		data.setLastEditTime(_ctx.stringValue("UpdateAppResponse.Data.LastEditTime"));
		updateAppResponse.setData(data);
	 
	 	return updateAppResponse;
	}
}