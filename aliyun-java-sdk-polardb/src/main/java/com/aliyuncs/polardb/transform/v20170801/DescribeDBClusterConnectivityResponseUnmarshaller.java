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

import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterConnectivityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterConnectivityResponseUnmarshaller {

	public static DescribeDBClusterConnectivityResponse unmarshall(DescribeDBClusterConnectivityResponse describeDBClusterConnectivityResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterConnectivityResponse.setRequestId(_ctx.stringValue("DescribeDBClusterConnectivityResponse.RequestId"));
		describeDBClusterConnectivityResponse.setDBClusterId(_ctx.stringValue("DescribeDBClusterConnectivityResponse.DBClusterId"));
		describeDBClusterConnectivityResponse.setConnCheckResult(_ctx.stringValue("DescribeDBClusterConnectivityResponse.ConnCheckResult"));
		describeDBClusterConnectivityResponse.setConnCheckErrorCode(_ctx.stringValue("DescribeDBClusterConnectivityResponse.ConnCheckErrorCode"));
		describeDBClusterConnectivityResponse.setConnCheckErrorMessage(_ctx.stringValue("DescribeDBClusterConnectivityResponse.ConnCheckErrorMessage"));
	 
	 	return describeDBClusterConnectivityResponse;
	}
}