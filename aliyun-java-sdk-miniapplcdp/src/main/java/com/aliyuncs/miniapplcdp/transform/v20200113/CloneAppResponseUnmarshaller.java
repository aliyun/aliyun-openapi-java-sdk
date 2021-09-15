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

import com.aliyuncs.miniapplcdp.model.v20200113.CloneAppResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.CloneAppResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CloneAppResponseUnmarshaller {

	public static CloneAppResponse unmarshall(CloneAppResponse cloneAppResponse, UnmarshallerContext _ctx) {
		
		cloneAppResponse.setRequestId(_ctx.stringValue("CloneAppResponse.RequestId"));

		Data data = new Data();
		data.setAppStatus(_ctx.stringValue("CloneAppResponse.Data.AppStatus"));
		data.setAppName(_ctx.stringValue("CloneAppResponse.Data.AppName"));
		data.setIsTemplate(_ctx.booleanValue("CloneAppResponse.Data.IsTemplate"));
		data.setModifiedTime(_ctx.stringValue("CloneAppResponse.Data.ModifiedTime"));
		data.setDescription(_ctx.stringValue("CloneAppResponse.Data.Description"));
		data.setCreateTime(_ctx.stringValue("CloneAppResponse.Data.CreateTime"));
		data.setAppId(_ctx.stringValue("CloneAppResponse.Data.AppId"));
		data.setIcon(_ctx.stringValue("CloneAppResponse.Data.Icon"));
		data.setAppType(_ctx.stringValue("CloneAppResponse.Data.AppType"));
		data.setSource(_ctx.stringValue("CloneAppResponse.Data.Source"));
		data.setLastEditTime(_ctx.stringValue("CloneAppResponse.Data.LastEditTime"));
		cloneAppResponse.setData(data);
	 
	 	return cloneAppResponse;
	}
}