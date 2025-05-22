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

import com.aliyuncs.rds.model.v20140815.DescribeDBInstancePromoteActivityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancePromoteActivityResponseUnmarshaller {

	public static DescribeDBInstancePromoteActivityResponse unmarshall(DescribeDBInstancePromoteActivityResponse describeDBInstancePromoteActivityResponse, UnmarshallerContext _ctx) {
		
		describeDBInstancePromoteActivityResponse.setRequestId(_ctx.stringValue("DescribeDBInstancePromoteActivityResponse.RequestId"));
		describeDBInstancePromoteActivityResponse.setAliUid(_ctx.stringValue("DescribeDBInstancePromoteActivityResponse.AliUid"));
		describeDBInstancePromoteActivityResponse.setBid(_ctx.stringValue("DescribeDBInstancePromoteActivityResponse.Bid"));
		describeDBInstancePromoteActivityResponse.setDBInstanceId(_ctx.stringValue("DescribeDBInstancePromoteActivityResponse.DBInstanceId"));
		describeDBInstancePromoteActivityResponse.setDBInstanceName(_ctx.stringValue("DescribeDBInstancePromoteActivityResponse.DBInstanceName"));
		describeDBInstancePromoteActivityResponse.setDBType(_ctx.stringValue("DescribeDBInstancePromoteActivityResponse.DBType"));
		describeDBInstancePromoteActivityResponse.setIsActivity(_ctx.stringValue("DescribeDBInstancePromoteActivityResponse.IsActivity"));
	 
	 	return describeDBInstancePromoteActivityResponse;
	}
}