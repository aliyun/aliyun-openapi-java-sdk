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

import com.aliyuncs.mse.model.v20190531.AddMigrationTaskResponse;
import com.aliyuncs.mse.model.v20190531.AddMigrationTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMigrationTaskResponseUnmarshaller {

	public static AddMigrationTaskResponse unmarshall(AddMigrationTaskResponse addMigrationTaskResponse, UnmarshallerContext _ctx) {
		
		addMigrationTaskResponse.setRequestId(_ctx.stringValue("AddMigrationTaskResponse.RequestId"));
		addMigrationTaskResponse.setHttpCode(_ctx.stringValue("AddMigrationTaskResponse.HttpCode"));
		addMigrationTaskResponse.setMessage(_ctx.stringValue("AddMigrationTaskResponse.Message"));
		addMigrationTaskResponse.setErrorCode(_ctx.stringValue("AddMigrationTaskResponse.ErrorCode"));
		addMigrationTaskResponse.setSuccess(_ctx.booleanValue("AddMigrationTaskResponse.Success"));

		Data data = new Data();
		data.setId(_ctx.stringValue("AddMigrationTaskResponse.Data.Id"));
		data.setUserId(_ctx.stringValue("AddMigrationTaskResponse.Data.UserId"));
		data.setClusterType(_ctx.stringValue("AddMigrationTaskResponse.Data.ClusterType"));
		data.setOriginInstanceAddress(_ctx.stringValue("AddMigrationTaskResponse.Data.OriginInstanceAddress"));
		data.setOriginInstanceName(_ctx.stringValue("AddMigrationTaskResponse.Data.OriginInstanceName"));
		data.setOriginInstanceNamespace(_ctx.stringValue("AddMigrationTaskResponse.Data.OriginInstanceNamespace"));
		data.setTargetInstanceId(_ctx.stringValue("AddMigrationTaskResponse.Data.TargetInstanceId"));
		data.setTargetClusterName(_ctx.stringValue("AddMigrationTaskResponse.Data.TargetClusterName"));
		data.setTargetClusterUrl(_ctx.stringValue("AddMigrationTaskResponse.Data.TargetClusterUrl"));
		data.setProjectDesc(_ctx.stringValue("AddMigrationTaskResponse.Data.ProjectDesc"));
		data.setGmtCreate(_ctx.stringValue("AddMigrationTaskResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("AddMigrationTaskResponse.Data.GmtModified"));
		addMigrationTaskResponse.setData(data);
	 
	 	return addMigrationTaskResponse;
	}
}