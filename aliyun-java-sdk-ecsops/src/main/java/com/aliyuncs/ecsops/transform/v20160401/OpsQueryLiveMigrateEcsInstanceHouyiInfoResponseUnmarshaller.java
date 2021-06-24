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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryLiveMigrateEcsInstanceHouyiInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryLiveMigrateEcsInstanceHouyiInfoResponseUnmarshaller {

	public static OpsQueryLiveMigrateEcsInstanceHouyiInfoResponse unmarshall(OpsQueryLiveMigrateEcsInstanceHouyiInfoResponse opsQueryLiveMigrateEcsInstanceHouyiInfoResponse, UnmarshallerContext _ctx) {
		
		opsQueryLiveMigrateEcsInstanceHouyiInfoResponse.setRequestId(_ctx.stringValue("OpsQueryLiveMigrateEcsInstanceHouyiInfoResponse.RequestId"));
		opsQueryLiveMigrateEcsInstanceHouyiInfoResponse.setStatus(_ctx.stringValue("OpsQueryLiveMigrateEcsInstanceHouyiInfoResponse.Status"));
		opsQueryLiveMigrateEcsInstanceHouyiInfoResponse.setSourceNcId(_ctx.stringValue("OpsQueryLiveMigrateEcsInstanceHouyiInfoResponse.SourceNcId"));
		opsQueryLiveMigrateEcsInstanceHouyiInfoResponse.setMessage(_ctx.stringValue("OpsQueryLiveMigrateEcsInstanceHouyiInfoResponse.Message"));
		opsQueryLiveMigrateEcsInstanceHouyiInfoResponse.setInstanceId(_ctx.stringValue("OpsQueryLiveMigrateEcsInstanceHouyiInfoResponse.InstanceId"));
		opsQueryLiveMigrateEcsInstanceHouyiInfoResponse.setTimeout(_ctx.longValue("OpsQueryLiveMigrateEcsInstanceHouyiInfoResponse.Timeout"));
		opsQueryLiveMigrateEcsInstanceHouyiInfoResponse.setRate(_ctx.longValue("OpsQueryLiveMigrateEcsInstanceHouyiInfoResponse.Rate"));
		opsQueryLiveMigrateEcsInstanceHouyiInfoResponse.setMigrationId(_ctx.longValue("OpsQueryLiveMigrateEcsInstanceHouyiInfoResponse.MigrationId"));
		opsQueryLiveMigrateEcsInstanceHouyiInfoResponse.setCode(_ctx.stringValue("OpsQueryLiveMigrateEcsInstanceHouyiInfoResponse.Code"));
		opsQueryLiveMigrateEcsInstanceHouyiInfoResponse.setSuccess(_ctx.stringValue("OpsQueryLiveMigrateEcsInstanceHouyiInfoResponse.Success"));
		opsQueryLiveMigrateEcsInstanceHouyiInfoResponse.setSourceNcMigStatus(_ctx.stringValue("OpsQueryLiveMigrateEcsInstanceHouyiInfoResponse.SourceNcMigStatus"));
		opsQueryLiveMigrateEcsInstanceHouyiInfoResponse.setDestinationNcMigStatus(_ctx.stringValue("OpsQueryLiveMigrateEcsInstanceHouyiInfoResponse.DestinationNcMigStatus"));
		opsQueryLiveMigrateEcsInstanceHouyiInfoResponse.setResultCode(_ctx.longValue("OpsQueryLiveMigrateEcsInstanceHouyiInfoResponse.ResultCode"));
		opsQueryLiveMigrateEcsInstanceHouyiInfoResponse.setDestinationNcId(_ctx.stringValue("OpsQueryLiveMigrateEcsInstanceHouyiInfoResponse.DestinationNcId"));
	 
	 	return opsQueryLiveMigrateEcsInstanceHouyiInfoResponse;
	}
}