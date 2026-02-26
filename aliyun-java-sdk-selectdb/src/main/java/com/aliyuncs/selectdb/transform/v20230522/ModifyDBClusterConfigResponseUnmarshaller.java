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

package com.aliyuncs.selectdb.transform.v20230522;

import com.aliyuncs.selectdb.model.v20230522.ModifyDBClusterConfigResponse;
import com.aliyuncs.selectdb.model.v20230522.ModifyDBClusterConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyDBClusterConfigResponseUnmarshaller {

	public static ModifyDBClusterConfigResponse unmarshall(ModifyDBClusterConfigResponse modifyDBClusterConfigResponse, UnmarshallerContext _ctx) {
		
		modifyDBClusterConfigResponse.setRequestId(_ctx.stringValue("ModifyDBClusterConfigResponse.RequestId"));
		modifyDBClusterConfigResponse.setDynamicCode(_ctx.stringValue("ModifyDBClusterConfigResponse.DynamicCode"));
		modifyDBClusterConfigResponse.setDynamicMessage(_ctx.stringValue("ModifyDBClusterConfigResponse.DynamicMessage"));
		modifyDBClusterConfigResponse.setAccessDeniedDetail(_ctx.stringValue("ModifyDBClusterConfigResponse.AccessDeniedDetail"));

		Data data = new Data();
		data.setDbInstanceName(_ctx.stringValue("ModifyDBClusterConfigResponse.Data.DbInstanceName"));
		data.setDbInstanceId(_ctx.stringValue("ModifyDBClusterConfigResponse.Data.DbInstanceId"));
		data.setDbClusterId(_ctx.stringValue("ModifyDBClusterConfigResponse.Data.DbClusterId"));
		data.setTaskId(_ctx.integerValue("ModifyDBClusterConfigResponse.Data.TaskId"));
		modifyDBClusterConfigResponse.setData(data);
	 
	 	return modifyDBClusterConfigResponse;
	}
}