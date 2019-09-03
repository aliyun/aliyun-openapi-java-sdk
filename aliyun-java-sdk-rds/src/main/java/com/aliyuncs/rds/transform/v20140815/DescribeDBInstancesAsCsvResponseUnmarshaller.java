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
			dBInstanceAttribute.setDBInstanceId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceId"));
			dBInstanceAttribute.setPayType(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].PayType"));
			dBInstanceAttribute.setDBInstanceClassType(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceClassType"));
			dBInstanceAttribute.setDBInstanceType(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceType"));
			dBInstanceAttribute.setRegionId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].RegionId"));
			dBInstanceAttribute.setConnectionString(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].ConnectionString"));
			dBInstanceAttribute.setPort(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].Port"));
			dBInstanceAttribute.setEngine(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].Engine"));
			dBInstanceAttribute.setEngineVersion(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].EngineVersion"));
			dBInstanceAttribute.setDBInstanceClass(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceClass"));
			dBInstanceAttribute.setDBInstanceMemory(_ctx.longValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceMemory"));
			dBInstanceAttribute.setDBInstanceStorage(_ctx.integerValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceStorage"));
			dBInstanceAttribute.setDBInstanceNetType(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceNetType"));
			dBInstanceAttribute.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstanceAttribute.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstanceAttribute.setLockMode(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].LockMode"));
			dBInstanceAttribute.setLockReason(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].LockReason"));
			dBInstanceAttribute.setReadDelayTime(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].ReadDelayTime"));
			dBInstanceAttribute.setDBMaxQuantity(_ctx.integerValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBMaxQuantity"));
			dBInstanceAttribute.setAccountMaxQuantity(_ctx.integerValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].AccountMaxQuantity"));
			dBInstanceAttribute.setCreationTime(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].CreationTime"));
			dBInstanceAttribute.setExpireTime(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].ExpireTime"));
			dBInstanceAttribute.setMaintainTime(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].MaintainTime"));
			dBInstanceAttribute.setAvailabilityValue(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].AvailabilityValue"));
			dBInstanceAttribute.setMaxIOPS(_ctx.integerValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].MaxIOPS"));
			dBInstanceAttribute.setMaxConnections(_ctx.integerValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].MaxConnections"));
			dBInstanceAttribute.setMasterInstanceId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].MasterInstanceId"));
			dBInstanceAttribute.setDBInstanceCPU(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceCPU"));
			dBInstanceAttribute.setIncrementSourceDBInstanceId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].IncrementSourceDBInstanceId"));
			dBInstanceAttribute.setGuardDBInstanceId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].GuardDBInstanceId"));
			dBInstanceAttribute.setTempDBInstanceId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].TempDBInstanceId"));
			dBInstanceAttribute.setSecurityIPList(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].SecurityIPList"));
			dBInstanceAttribute.setZoneId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].ZoneId"));
			dBInstanceAttribute.setInstanceNetworkType(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].InstanceNetworkType"));
			dBInstanceAttribute.setCategory(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].Category"));
			dBInstanceAttribute.setAccountType(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].AccountType"));
			dBInstanceAttribute.setSupportUpgradeAccountType(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].SupportUpgradeAccountType"));
			dBInstanceAttribute.setVpcId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].VpcId"));
			dBInstanceAttribute.setVSwitchId(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].VSwitchId"));
			dBInstanceAttribute.setConnectionMode(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].ConnectionMode"));
			dBInstanceAttribute.setTags(_ctx.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].Tags"));

			items.add(dBInstanceAttribute);
		}
		describeDBInstancesAsCsvResponse.setItems(items);
	 
	 	return describeDBInstancesAsCsvResponse;
	}
}