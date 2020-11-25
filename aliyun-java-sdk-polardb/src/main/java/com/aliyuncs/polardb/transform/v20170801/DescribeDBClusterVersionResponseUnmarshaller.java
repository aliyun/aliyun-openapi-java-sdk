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

import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterVersionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterVersionResponseUnmarshaller {

	public static DescribeDBClusterVersionResponse unmarshall(DescribeDBClusterVersionResponse describeDBClusterVersionResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterVersionResponse.setRequestId(_ctx.stringValue("DescribeDBClusterVersionResponse.RequestId"));
		describeDBClusterVersionResponse.setDBInstanceName(_ctx.stringValue("DescribeDBClusterVersionResponse.DBInstanceName"));
		describeDBClusterVersionResponse.setDBVersion(_ctx.stringValue("DescribeDBClusterVersionResponse.DBVersion"));
		describeDBClusterVersionResponse.setDBMinorVersion(_ctx.stringValue("DescribeDBClusterVersionResponse.DBMinorVersion"));
		describeDBClusterVersionResponse.setDBRevisionVersion(_ctx.stringValue("DescribeDBClusterVersionResponse.DBRevisionVersion"));
		describeDBClusterVersionResponse.setDBVersionStatus(_ctx.stringValue("DescribeDBClusterVersionResponse.DBVersionStatus"));
		describeDBClusterVersionResponse.setIsLatestVersion(_ctx.stringValue("DescribeDBClusterVersionResponse.IsLatestVersion"));
		describeDBClusterVersionResponse.setLatestRevisionVersion(_ctx.stringValue("DescribeDBClusterVersionResponse.LatestRevisionVersion"));
	 
	 	return describeDBClusterVersionResponse;
	}
}