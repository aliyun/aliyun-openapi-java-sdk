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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceSupportMaxPerformanceResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceSupportMaxPerformanceResponse.Performance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceSupportMaxPerformanceResponseUnmarshaller {

	public static DescribeDBInstanceSupportMaxPerformanceResponse unmarshall(DescribeDBInstanceSupportMaxPerformanceResponse describeDBInstanceSupportMaxPerformanceResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceSupportMaxPerformanceResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceSupportMaxPerformanceResponse.RequestId"));
		describeDBInstanceSupportMaxPerformanceResponse.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceSupportMaxPerformanceResponse.DBInstanceId"));

		List<Performance> performances = new ArrayList<Performance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceSupportMaxPerformanceResponse.Performances.Length"); i++) {
			Performance performance = new Performance();
			performance.setKey(_ctx.stringValue("DescribeDBInstanceSupportMaxPerformanceResponse.Performances["+ i +"].Key"));
			performance.setValue(_ctx.stringValue("DescribeDBInstanceSupportMaxPerformanceResponse.Performances["+ i +"].Value"));
			performance.setBottleneck(_ctx.stringValue("DescribeDBInstanceSupportMaxPerformanceResponse.Performances["+ i +"].Bottleneck"));
			performance.setUnit(_ctx.stringValue("DescribeDBInstanceSupportMaxPerformanceResponse.Performances["+ i +"].Unit"));

			performances.add(performance);
		}
		describeDBInstanceSupportMaxPerformanceResponse.setPerformances(performances);
	 
	 	return describeDBInstanceSupportMaxPerformanceResponse;
	}
}