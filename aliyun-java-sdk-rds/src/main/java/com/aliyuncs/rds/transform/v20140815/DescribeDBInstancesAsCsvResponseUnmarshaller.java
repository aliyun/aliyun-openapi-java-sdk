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
			dBInstanceAttribute.setVpcId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].VpcId"));
			dBInstanceAttribute.setCreationTime(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].CreationTime"));
			dBInstanceAttribute.setTempDBInstanceId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].TempDBInstanceId"));
			dBInstanceAttribute.setSupportUpgradeAccountType(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].SupportUpgradeAccountType"));
			dBInstanceAttribute.setIncrementSourceDBInstanceId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].IncrementSourceDBInstanceId"));
			dBInstanceAttribute.setDBInstanceMemory(_ctx.longValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceMemory"));
			dBInstanceAttribute.setMaintainTime(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].MaintainTime"));
			dBInstanceAttribute.setPayType(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].PayType"));
			dBInstanceAttribute.setTags(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].Tags"));
			dBInstanceAttribute.setAvailabilityValue(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].AvailabilityValue"));
			dBInstanceAttribute.setReadDelayTime(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].ReadDelayTime"));
			dBInstanceAttribute.setConnectionMode(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].ConnectionMode"));
			dBInstanceAttribute.setPort(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].Port"));
			dBInstanceAttribute.setAccountType(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].AccountType"));
			dBInstanceAttribute.setLockMode(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].LockMode"));
			dBInstanceAttribute.setEngineVersion(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].EngineVersion"));
			dBInstanceAttribute.setMaxIOPS(_ctx.integerValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].MaxIOPS"));
			dBInstanceAttribute.setConnectionString(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].ConnectionString"));
			dBInstanceAttribute.setInstanceNetworkType(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].InstanceNetworkType"));
			dBInstanceAttribute.setSecurityIPList(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].SecurityIPList"));
			dBInstanceAttribute.setMasterInstanceId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].MasterInstanceId"));
			dBInstanceAttribute.setDBInstanceClassType(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceClassType"));
			dBInstanceAttribute.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstanceAttribute.setDBInstanceCPU(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceCPU"));
			dBInstanceAttribute.setExpireTime(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].ExpireTime"));
			dBInstanceAttribute.setDBInstanceNetType(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceNetType"));
			dBInstanceAttribute.setDBInstanceType(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceType"));
			dBInstanceAttribute.setAccountMaxQuantity(_ctx.integerValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].AccountMaxQuantity"));
			dBInstanceAttribute.setLockReason(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].LockReason"));
			dBInstanceAttribute.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstanceAttribute.setDBMaxQuantity(_ctx.integerValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBMaxQuantity"));
			dBInstanceAttribute.setGuardDBInstanceId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].GuardDBInstanceId"));
			dBInstanceAttribute.setRegionId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].RegionId"));
			dBInstanceAttribute.setDBInstanceStorage(_ctx.integerValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceStorage"));
			dBInstanceAttribute.setVSwitchId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].VSwitchId"));
			dBInstanceAttribute.setZoneId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].ZoneId"));
			dBInstanceAttribute.setCategory(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].Category"));
			dBInstanceAttribute.setMaxConnections(_ctx.integerValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].MaxConnections"));
			dBInstanceAttribute.setDBInstanceId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceId"));
			dBInstanceAttribute.setDBInstanceClass(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceClass"));
			dBInstanceAttribute.setEngine(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].Engine"));

			items.add(dBInstanceAttribute);
		}
		describeDBInstancesAsCsvResponse.setItems(items);
	 
	 	return describeDBInstancesAsCsvResponse;
	}
}