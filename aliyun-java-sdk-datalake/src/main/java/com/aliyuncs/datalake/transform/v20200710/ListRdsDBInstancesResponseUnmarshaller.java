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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.datalake.model.v20200710.ListRdsDBInstancesResponse;
import com.aliyuncs.datalake.model.v20200710.ListRdsDBInstancesResponse.DBInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRdsDBInstancesResponseUnmarshaller {

	public static ListRdsDBInstancesResponse unmarshall(ListRdsDBInstancesResponse listRdsDBInstancesResponse, UnmarshallerContext _ctx) {
		
		listRdsDBInstancesResponse.setRequestId(_ctx.stringValue("ListRdsDBInstancesResponse.RequestId"));
		listRdsDBInstancesResponse.setTotalCount(_ctx.integerValue("ListRdsDBInstancesResponse.TotalCount"));
		listRdsDBInstancesResponse.setSuccess(_ctx.stringValue("ListRdsDBInstancesResponse.Success"));

		List<DBInstance> rdsInstances = new ArrayList<DBInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListRdsDBInstancesResponse.RdsInstances.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setDBInstanceId(_ctx.stringValue("ListRdsDBInstancesResponse.RdsInstances["+ i +"].DBInstanceId"));
			dBInstance.setDBInstanceDescription(_ctx.stringValue("ListRdsDBInstancesResponse.RdsInstances["+ i +"].DBInstanceDescription"));
			dBInstance.setRegionId(_ctx.stringValue("ListRdsDBInstancesResponse.RdsInstances["+ i +"].RegionId"));
			dBInstance.setDBInstanceType(_ctx.stringValue("ListRdsDBInstancesResponse.RdsInstances["+ i +"].DBInstanceType"));
			dBInstance.setDBInstanceStatus(_ctx.stringValue("ListRdsDBInstancesResponse.RdsInstances["+ i +"].DBInstanceStatus"));
			dBInstance.setEngine(_ctx.stringValue("ListRdsDBInstancesResponse.RdsInstances["+ i +"].Engine"));
			dBInstance.setEngineVersion(_ctx.stringValue("ListRdsDBInstancesResponse.RdsInstances["+ i +"].EngineVersion"));
			dBInstance.setDBInstanceNetType(_ctx.stringValue("ListRdsDBInstancesResponse.RdsInstances["+ i +"].DBInstanceNetType"));
			dBInstance.setLockMode(_ctx.stringValue("ListRdsDBInstancesResponse.RdsInstances["+ i +"].LockMode"));
			dBInstance.setInstanceNetworkType(_ctx.stringValue("ListRdsDBInstancesResponse.RdsInstances["+ i +"].InstanceNetworkType"));
			dBInstance.setVpcCloudInstanceId(_ctx.stringValue("ListRdsDBInstancesResponse.RdsInstances["+ i +"].VpcCloudInstanceId"));
			dBInstance.setVpcId(_ctx.stringValue("ListRdsDBInstancesResponse.RdsInstances["+ i +"].VpcId"));
			dBInstance.setVSwitchId(_ctx.stringValue("ListRdsDBInstancesResponse.RdsInstances["+ i +"].VSwitchId"));
			dBInstance.setZoneId(_ctx.stringValue("ListRdsDBInstancesResponse.RdsInstances["+ i +"].ZoneId"));
			dBInstance.setMutriORsignle(_ctx.booleanValue("ListRdsDBInstancesResponse.RdsInstances["+ i +"].MutriORsignle"));
			dBInstance.setResourceGroupId(_ctx.stringValue("ListRdsDBInstancesResponse.RdsInstances["+ i +"].ResourceGroupId"));

			rdsInstances.add(dBInstance);
		}
		listRdsDBInstancesResponse.setRdsInstances(rdsInstances);
	 
	 	return listRdsDBInstancesResponse;
	}
}