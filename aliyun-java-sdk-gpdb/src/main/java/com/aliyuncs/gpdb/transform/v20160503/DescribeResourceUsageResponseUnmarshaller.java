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

package com.aliyuncs.gpdb.transform.v20160503;

import com.aliyuncs.gpdb.model.v20160503.DescribeResourceUsageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceUsageResponseUnmarshaller {

	public static DescribeResourceUsageResponse unmarshall(DescribeResourceUsageResponse describeResourceUsageResponse, UnmarshallerContext context) {
		
		describeResourceUsageResponse.setRequestId(context.stringValue("DescribeResourceUsageResponse.RequestId"));
		describeResourceUsageResponse.setDBInstanceId(context.stringValue("DescribeResourceUsageResponse.DBInstanceId"));
		describeResourceUsageResponse.setEngine(context.stringValue("DescribeResourceUsageResponse.Engine"));
		describeResourceUsageResponse.setDiskUsed(context.longValue("DescribeResourceUsageResponse.DiskUsed"));
		describeResourceUsageResponse.setDataSize(context.longValue("DescribeResourceUsageResponse.DataSize"));
		describeResourceUsageResponse.setLogSize(context.longValue("DescribeResourceUsageResponse.LogSize"));
		describeResourceUsageResponse.setBackupSize(context.longValue("DescribeResourceUsageResponse.BackupSize"));
	 
	 	return describeResourceUsageResponse;
	}
}