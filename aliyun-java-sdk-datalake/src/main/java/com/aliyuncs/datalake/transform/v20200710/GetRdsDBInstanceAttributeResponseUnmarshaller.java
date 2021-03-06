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

package com.aliyuncs.datalake.transform.v20200710;

import com.aliyuncs.datalake.model.v20200710.GetRdsDBInstanceAttributeResponse;
import com.aliyuncs.datalake.model.v20200710.GetRdsDBInstanceAttributeResponse.DBInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRdsDBInstanceAttributeResponseUnmarshaller {

	public static GetRdsDBInstanceAttributeResponse unmarshall(GetRdsDBInstanceAttributeResponse getRdsDBInstanceAttributeResponse, UnmarshallerContext _ctx) {
		
		getRdsDBInstanceAttributeResponse.setRequestId(_ctx.stringValue("GetRdsDBInstanceAttributeResponse.RequestId"));
		getRdsDBInstanceAttributeResponse.setSuccess(_ctx.stringValue("GetRdsDBInstanceAttributeResponse.Success"));

		DBInstance dBInstance = new DBInstance();
		dBInstance.setDBInstanceId(_ctx.stringValue("GetRdsDBInstanceAttributeResponse.DBInstance.DBInstanceId"));
		dBInstance.setDBInstanceDescription(_ctx.stringValue("GetRdsDBInstanceAttributeResponse.DBInstance.DBInstanceDescription"));
		dBInstance.setDBInstanceType(_ctx.stringValue("GetRdsDBInstanceAttributeResponse.DBInstance.DBInstanceType"));
		dBInstance.setRegionId(_ctx.stringValue("GetRdsDBInstanceAttributeResponse.DBInstance.RegionId"));
		dBInstance.setDBInstanceStatus(_ctx.stringValue("GetRdsDBInstanceAttributeResponse.DBInstance.DBInstanceStatus"));
		dBInstance.setEngine(_ctx.stringValue("GetRdsDBInstanceAttributeResponse.DBInstance.Engine"));
		dBInstance.setEngineVersion(_ctx.stringValue("GetRdsDBInstanceAttributeResponse.DBInstance.EngineVersion"));
		dBInstance.setDBInstanceNetType(_ctx.stringValue("GetRdsDBInstanceAttributeResponse.DBInstance.DBInstanceNetType"));
		dBInstance.setInstanceNetworkType(_ctx.stringValue("GetRdsDBInstanceAttributeResponse.DBInstance.InstanceNetworkType"));
		dBInstance.setVpcCloudInstanceId(_ctx.stringValue("GetRdsDBInstanceAttributeResponse.DBInstance.VpcCloudInstanceId"));
		dBInstance.setZoneId(_ctx.stringValue("GetRdsDBInstanceAttributeResponse.DBInstance.ZoneId"));
		dBInstance.setVpcId(_ctx.stringValue("GetRdsDBInstanceAttributeResponse.DBInstance.VpcId"));
		dBInstance.setVSwitchId(_ctx.stringValue("GetRdsDBInstanceAttributeResponse.DBInstance.VSwitchId"));
		dBInstance.setConnectionString(_ctx.stringValue("GetRdsDBInstanceAttributeResponse.DBInstance.ConnectionString"));
		dBInstance.setPort(_ctx.stringValue("GetRdsDBInstanceAttributeResponse.DBInstance.Port"));
		dBInstance.setResourceGroupId(_ctx.stringValue("GetRdsDBInstanceAttributeResponse.DBInstance.ResourceGroupId"));
		getRdsDBInstanceAttributeResponse.setDBInstance(dBInstance);
	 
	 	return getRdsDBInstanceAttributeResponse;
	}
}