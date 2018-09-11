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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancesAsCsvResponseUnmarshaller {

	public static DescribeDBInstancesAsCsvResponse unmarshall(DescribeDBInstancesAsCsvResponse describeDBInstancesAsCsvResponse, UnmarshallerContext context) {
		
		describeDBInstancesAsCsvResponse.setRequestId(context.stringValue("DescribeDBInstancesAsCsvResponse.RequestId"));

		List<DBInstanceAttribute> items = new ArrayList<DBInstanceAttribute>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstancesAsCsvResponse.Items.Length"); i++) {
			DBInstanceAttribute dBInstanceAttribute = new DBInstanceAttribute();
			dBInstanceAttribute.setDBInstanceId(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceId"));
			dBInstanceAttribute.setPayType(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].PayType"));
			dBInstanceAttribute.setDBInstanceClassType(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceClassType"));
			dBInstanceAttribute.setDBInstanceType(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceType"));
			dBInstanceAttribute.setRegionId(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].RegionId"));
			dBInstanceAttribute.setConnectionString(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].ConnectionString"));
			dBInstanceAttribute.setPort(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].Port"));
			dBInstanceAttribute.setEngine(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].Engine"));
			dBInstanceAttribute.setEngineVersion(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].EngineVersion"));
			dBInstanceAttribute.setDBInstanceClass(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceClass"));
			dBInstanceAttribute.setDBInstanceMemory(context.longValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceMemory"));
			dBInstanceAttribute.setDBInstanceStorage(context.integerValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceStorage"));
			dBInstanceAttribute.setDBInstanceNetType(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceNetType"));
			dBInstanceAttribute.setDBInstanceStatus(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstanceAttribute.setDBInstanceDescription(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstanceAttribute.setLockMode(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].LockMode"));
			dBInstanceAttribute.setLockReason(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].LockReason"));
			dBInstanceAttribute.setReadDelayTime(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].ReadDelayTime"));
			dBInstanceAttribute.setDBMaxQuantity(context.integerValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBMaxQuantity"));
			dBInstanceAttribute.setAccountMaxQuantity(context.integerValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].AccountMaxQuantity"));
			dBInstanceAttribute.setCreationTime(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].CreationTime"));
			dBInstanceAttribute.setExpireTime(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].ExpireTime"));
			dBInstanceAttribute.setMaintainTime(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].MaintainTime"));
			dBInstanceAttribute.setAvailabilityValue(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].AvailabilityValue"));
			dBInstanceAttribute.setMaxIOPS(context.integerValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].MaxIOPS"));
			dBInstanceAttribute.setMaxConnections(context.integerValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].MaxConnections"));
			dBInstanceAttribute.setMasterInstanceId(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].MasterInstanceId"));
			dBInstanceAttribute.setDBInstanceCPU(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].DBInstanceCPU"));
			dBInstanceAttribute.setIncrementSourceDBInstanceId(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].IncrementSourceDBInstanceId"));
			dBInstanceAttribute.setGuardDBInstanceId(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].GuardDBInstanceId"));
			dBInstanceAttribute.setTempDBInstanceId(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].TempDBInstanceId"));
			dBInstanceAttribute.setSecurityIPList(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].SecurityIPList"));
			dBInstanceAttribute.setZoneId(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].ZoneId"));
			dBInstanceAttribute.setInstanceNetworkType(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].InstanceNetworkType"));
			dBInstanceAttribute.setCategory(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].Category"));
			dBInstanceAttribute.setAccountType(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].AccountType"));
			dBInstanceAttribute.setSupportUpgradeAccountType(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].SupportUpgradeAccountType"));
			dBInstanceAttribute.setVpcId(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].VpcId"));
			dBInstanceAttribute.setVSwitchId(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].VSwitchId"));
			dBInstanceAttribute.setConnectionMode(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].ConnectionMode"));
			dBInstanceAttribute.setTags(context.stringValue("DescribeDBInstancesAsCsvResponse.Items["+ i +"].Tags"));

			items.add(dBInstanceAttribute);
		}
		describeDBInstancesAsCsvResponse.setItems(items);
	 
	 	return describeDBInstancesAsCsvResponse;
	}
}