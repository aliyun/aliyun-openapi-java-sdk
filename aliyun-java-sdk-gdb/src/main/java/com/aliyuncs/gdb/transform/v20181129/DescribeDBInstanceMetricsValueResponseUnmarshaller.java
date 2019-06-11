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

package com.aliyuncs.gdb.transform.v20181129;

import com.aliyuncs.gdb.model.v20181129.DescribeDBInstanceMetricsValueResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceMetricsValueResponseUnmarshaller {

	public static DescribeDBInstanceMetricsValueResponse unmarshall(DescribeDBInstanceMetricsValueResponse describeDBInstanceMetricsValueResponse, UnmarshallerContext context) {
		
		describeDBInstanceMetricsValueResponse.setRequestId(context.stringValue("DescribeDBInstanceMetricsValueResponse.RequestId"));
		describeDBInstanceMetricsValueResponse.setCode(context.stringValue("DescribeDBInstanceMetricsValueResponse.Code"));
		describeDBInstanceMetricsValueResponse.setData(context.stringValue("DescribeDBInstanceMetricsValueResponse.Data"));
		describeDBInstanceMetricsValueResponse.setMessage(context.stringValue("DescribeDBInstanceMetricsValueResponse.Message"));
		describeDBInstanceMetricsValueResponse.setSuccess(context.stringValue("DescribeDBInstanceMetricsValueResponse.Success"));
		describeDBInstanceMetricsValueResponse.setSynchro(context.stringValue("DescribeDBInstanceMetricsValueResponse.Synchro"));
	 
	 	return describeDBInstanceMetricsValueResponse;
	}
}