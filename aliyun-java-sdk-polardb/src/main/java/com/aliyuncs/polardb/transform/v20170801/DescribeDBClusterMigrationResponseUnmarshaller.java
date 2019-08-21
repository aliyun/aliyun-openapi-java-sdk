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

package com.aliyuncs.polardb.transform.v20170801;

import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterMigrationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterMigrationResponseUnmarshaller {

	public static DescribeDBClusterMigrationResponse unmarshall(DescribeDBClusterMigrationResponse describeDBClusterMigrationResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterMigrationResponse.setRequestId(_ctx.stringValue("DescribeDBClusterMigrationResponse.RequestId"));
		describeDBClusterMigrationResponse.setDBClusterId(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterId"));
		describeDBClusterMigrationResponse.setSourceRDSDBInstanceId(_ctx.stringValue("DescribeDBClusterMigrationResponse.SourceRDSDBInstanceId"));
		describeDBClusterMigrationResponse.setMigrationStatus(_ctx.stringValue("DescribeDBClusterMigrationResponse.MigrationStatus"));
		describeDBClusterMigrationResponse.setTopologies(_ctx.stringValue("DescribeDBClusterMigrationResponse.Topologies"));
		describeDBClusterMigrationResponse.setDelayedSeconds(_ctx.integerValue("DescribeDBClusterMigrationResponse.DelayedSeconds"));
		describeDBClusterMigrationResponse.setExpiredTime(_ctx.stringValue("DescribeDBClusterMigrationResponse.ExpiredTime"));
		describeDBClusterMigrationResponse.setRdsReadWriteMode(_ctx.stringValue("DescribeDBClusterMigrationResponse.RdsReadWriteMode"));
		describeDBClusterMigrationResponse.setDBClusterReadWriteMode(_ctx.stringValue("DescribeDBClusterMigrationResponse.DBClusterReadWriteMode"));
		describeDBClusterMigrationResponse.setComment(_ctx.stringValue("DescribeDBClusterMigrationResponse.Comment"));
	 
	 	return describeDBClusterMigrationResponse;
	}
}