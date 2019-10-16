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

import com.aliyuncs.rds.model.v20140815.DescribeDBProxyPerformanceResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBProxyPerformanceResponse.PerformanceKey;
import com.aliyuncs.rds.model.v20140815.DescribeDBProxyPerformanceResponse.PerformanceKey.PerformanceValue;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBProxyPerformanceResponseUnmarshaller {

	public static DescribeDBProxyPerformanceResponse unmarshall(DescribeDBProxyPerformanceResponse describeDBProxyPerformanceResponse, UnmarshallerContext _ctx) {
		
		describeDBProxyPerformanceResponse.setRequestId(_ctx.stringValue("DescribeDBProxyPerformanceResponse.RequestId"));
		describeDBProxyPerformanceResponse.setDBInstanceId(_ctx.stringValue("DescribeDBProxyPerformanceResponse.DBInstanceId"));
		describeDBProxyPerformanceResponse.setStartTime(_ctx.stringValue("DescribeDBProxyPerformanceResponse.StartTime"));
		describeDBProxyPerformanceResponse.setEndTime(_ctx.stringValue("DescribeDBProxyPerformanceResponse.EndTime"));

		List<PerformanceKey> performanceKeys = new ArrayList<PerformanceKey>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBProxyPerformanceResponse.PerformanceKeys.Length"); i++) {
			PerformanceKey performanceKey = new PerformanceKey();
			performanceKey.setKey(_ctx.stringValue("DescribeDBProxyPerformanceResponse.PerformanceKeys["+ i +"].Key"));
			performanceKey.setValueFormat(_ctx.stringValue("DescribeDBProxyPerformanceResponse.PerformanceKeys["+ i +"].ValueFormat"));

			List<PerformanceValue> values = new ArrayList<PerformanceValue>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBProxyPerformanceResponse.PerformanceKeys["+ i +"].Values.Length"); j++) {
				PerformanceValue performanceValue = new PerformanceValue();
				performanceValue.setValue(_ctx.stringValue("DescribeDBProxyPerformanceResponse.PerformanceKeys["+ i +"].Values["+ j +"].Value"));
				performanceValue.setDate(_ctx.stringValue("DescribeDBProxyPerformanceResponse.PerformanceKeys["+ i +"].Values["+ j +"].Date"));

				values.add(performanceValue);
			}
			performanceKey.setValues(values);

			performanceKeys.add(performanceKey);
		}
		describeDBProxyPerformanceResponse.setPerformanceKeys(performanceKeys);
	 
	 	return describeDBProxyPerformanceResponse;
	}
}