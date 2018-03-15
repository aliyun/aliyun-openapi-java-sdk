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

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceExtendAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceExtendAttributeResponseUnmarshaller {

	public static DescribeDBInstanceExtendAttributeResponse unmarshall(DescribeDBInstanceExtendAttributeResponse describeDBInstanceExtendAttributeResponse, UnmarshallerContext context) {
		
		describeDBInstanceExtendAttributeResponse.setRequestId(context.stringValue("DescribeDBInstanceExtendAttributeResponse.RequestId"));
		describeDBInstanceExtendAttributeResponse.setCanTempUpgrade(context.booleanValue("DescribeDBInstanceExtendAttributeResponse.CanTempUpgrade"));
		describeDBInstanceExtendAttributeResponse.setTempUpgradeTimeStart(context.stringValue("DescribeDBInstanceExtendAttributeResponse.TempUpgradeTimeStart"));
		describeDBInstanceExtendAttributeResponse.setTempUpgradeTimeEnd(context.stringValue("DescribeDBInstanceExtendAttributeResponse.TempUpgradeTimeEnd"));
		describeDBInstanceExtendAttributeResponse.setTempUpgradeRecoveryTime(context.stringValue("DescribeDBInstanceExtendAttributeResponse.TempUpgradeRecoveryTime"));
		describeDBInstanceExtendAttributeResponse.setTempUpgradeRecoveryClass(context.stringValue("DescribeDBInstanceExtendAttributeResponse.TempUpgradeRecoveryClass"));
		describeDBInstanceExtendAttributeResponse.setTempUpgradeRecoveryCpu(context.integerValue("DescribeDBInstanceExtendAttributeResponse.TempUpgradeRecoveryCpu"));
		describeDBInstanceExtendAttributeResponse.setTempUpgradeRecoveryMemory(context.integerValue("DescribeDBInstanceExtendAttributeResponse.TempUpgradeRecoveryMemory"));
		describeDBInstanceExtendAttributeResponse.setTempUpgradeRecoveryMaxIOPS(context.stringValue("DescribeDBInstanceExtendAttributeResponse.TempUpgradeRecoveryMaxIOPS"));
		describeDBInstanceExtendAttributeResponse.setTempUpgradeRecoveryMaxConnections(context.stringValue("DescribeDBInstanceExtendAttributeResponse.TempUpgradeRecoveryMaxConnections"));
	 
	 	return describeDBInstanceExtendAttributeResponse;
	}
}