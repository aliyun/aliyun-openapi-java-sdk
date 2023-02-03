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

import com.aliyuncs.mse.model.v20190531.UpdateMigrationTaskResponse;
import com.aliyuncs.mse.model.v20190531.UpdateMigrationTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMigrationTaskResponseUnmarshaller {

	public static UpdateMigrationTaskResponse unmarshall(UpdateMigrationTaskResponse updateMigrationTaskResponse, UnmarshallerContext _ctx) {
		
		updateMigrationTaskResponse.setRequestId(_ctx.stringValue("UpdateMigrationTaskResponse.RequestId"));
		updateMigrationTaskResponse.setHttpCode(_ctx.stringValue("UpdateMigrationTaskResponse.HttpCode"));
		updateMigrationTaskResponse.setMessage(_ctx.stringValue("UpdateMigrationTaskResponse.Message"));
		updateMigrationTaskResponse.setErrorCode(_ctx.stringValue("UpdateMigrationTaskResponse.ErrorCode"));
		updateMigrationTaskResponse.setSuccess(_ctx.booleanValue("UpdateMigrationTaskResponse.Success"));

		Data data = new Data();
		data.setId(_ctx.stringValue("UpdateMigrationTaskResponse.Data.Id"));
		data.setUserId(_ctx.stringValue("UpdateMigrationTaskResponse.Data.UserId"));
		data.setClusterType(_ctx.stringValue("UpdateMigrationTaskResponse.Data.ClusterType"));
		data.setOriginInstanceAddress(_ctx.stringValue("UpdateMigrationTaskResponse.Data.OriginInstanceAddress"));
		data.setOriginInstanceName(_ctx.stringValue("UpdateMigrationTaskResponse.Data.OriginInstanceName"));
		data.setOriginInstanceNamespace(_ctx.stringValue("UpdateMigrationTaskResponse.Data.OriginInstanceNamespace"));
		data.setTargetInstanceId(_ctx.stringValue("UpdateMigrationTaskResponse.Data.TargetInstanceId"));
		data.setTargetClusterName(_ctx.stringValue("UpdateMigrationTaskResponse.Data.TargetClusterName"));
		data.setTargetClusterUrl(_ctx.stringValue("UpdateMigrationTaskResponse.Data.TargetClusterUrl"));
		data.setProjectDesc(_ctx.stringValue("UpdateMigrationTaskResponse.Data.ProjectDesc"));
		data.setGmtCreate(_ctx.stringValue("UpdateMigrationTaskResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("UpdateMigrationTaskResponse.Data.GmtModified"));
		updateMigrationTaskResponse.setData(data);
	 
	 	return updateMigrationTaskResponse;
	}
}