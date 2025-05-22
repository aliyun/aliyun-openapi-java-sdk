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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeDBInstancesAsCsvResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstancesAsCsvResponse.DBInstanceAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancesAsCsvResponseUnmarshaller {

	public static DescribeDBInstancesAsCsvResponse unmarshall(DescribeDBInstancesAsCsvResponse describeDBInstancesAsCsvResponse, UnmarshallerContext _ctx) {
		
		describeDBInstancesAsCsvResponse.setRequestId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.RequestId"));

		List<DBInstanceAttribute> items = new ArrayList<DBInstanceAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstancesAsCsvResponse.Items.Length"); i++) {
			DBInstanceAttribute dBInstanceAttribute = new DBInstanceAttribute();
			dBInstanceAttribute.setAccountMaxQuantity(_ctx.integerValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].AccountMaxQuantity"));
			dBInstanceAttribute.setAccountType(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].AccountType"));
			dBInstanceAttribute.setAvailabilityValue(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].AvailabilityValue"));
			dBInstanceAttribute.setCategory(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].Category"));
			dBInstanceAttribute.setConnectionMode(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].ConnectionMode"));
			dBInstanceAttribute.setConnectionString(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].ConnectionString"));
			dBInstanceAttribute.setCreationTime(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].CreationTime"));
			dBInstanceAttribute.setDBInstanceCPU(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceCPU"));
			dBInstanceAttribute.setDBInstanceClass(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceClass"));
			dBInstanceAttribute.setDBInstanceClassType(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceClassType"));
			dBInstanceAttribute.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstanceAttribute.setDBInstanceId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceId"));
			dBInstanceAttribute.setDBInstanceMemory(_ctx.longValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceMemory"));
			dBInstanceAttribute.setDBInstanceNetType(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceNetType"));
			dBInstanceAttribute.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstanceAttribute.setDBInstanceStorage(_ctx.integerValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceStorage"));
			dBInstanceAttribute.setDBInstanceType(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceType"));
			dBInstanceAttribute.setDBMaxQuantity(_ctx.integerValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBMaxQuantity"));
			dBInstanceAttribute.setEngine(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].Engine"));
			dBInstanceAttribute.setEngineVersion(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].EngineVersion"));
			dBInstanceAttribute.setExpireTime(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].ExpireTime"));
			dBInstanceAttribute.setExportKey(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].ExportKey"));
			dBInstanceAttribute.setGuardDBInstanceId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].GuardDBInstanceId"));
			dBInstanceAttribute.setIncrementSourceDBInstanceId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].IncrementSourceDBInstanceId"));
			dBInstanceAttribute.setInstanceNetworkType(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].InstanceNetworkType"));
			dBInstanceAttribute.setLockMode(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].LockMode"));
			dBInstanceAttribute.setLockReason(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].LockReason"));
			dBInstanceAttribute.setMaintainTime(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].MaintainTime"));
			dBInstanceAttribute.setMasterInstanceId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].MasterInstanceId"));
			dBInstanceAttribute.setMaxConnections(_ctx.integerValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].MaxConnections"));
			dBInstanceAttribute.setMaxIOPS(_ctx.integerValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].MaxIOPS"));
			dBInstanceAttribute.setPayType(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].PayType"));
			dBInstanceAttribute.setPort(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].Port"));
			dBInstanceAttribute.setReadDelayTime(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].ReadDelayTime"));
			dBInstanceAttribute.setRegionId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].RegionId"));
			dBInstanceAttribute.setSecurityIPList(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].SecurityIPList"));
			dBInstanceAttribute.setSupportUpgradeAccountType(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].SupportUpgradeAccountType"));
			dBInstanceAttribute.setTags(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].Tags"));
			dBInstanceAttribute.setTempDBInstanceId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].TempDBInstanceId"));
			dBInstanceAttribute.setVSwitchId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].VSwitchId"));
			dBInstanceAttribute.setVpcId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].VpcId"));
			dBInstanceAttribute.setZoneId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].ZoneId"));

			List<String> slaveZones = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].SlaveZones.Length"); j++) {
				slaveZones.add(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].SlaveZones["+ j +"]"));
			}
			dBInstanceAttribute.setSlaveZones(slaveZones);

			items.add(dBInstanceAttribute);
		}
		describeDBInstancesAsCsvResponse.setItems(items);
	 
	 	return describeDBInstancesAsCsvResponse;
	}
}