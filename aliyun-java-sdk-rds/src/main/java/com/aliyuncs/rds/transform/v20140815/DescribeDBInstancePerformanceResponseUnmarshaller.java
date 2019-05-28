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

import com.aliyuncs.rds.model.v20140815.DescribeDBInstancePerformanceResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstancePerformanceResponse.PerformanceKey;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstancePerformanceResponse.PerformanceKey.PerformanceValue;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancePerformanceResponseUnmarshaller {

	public static DescribeDBInstancePerformanceResponse unmarshall(DescribeDBInstancePerformanceResponse describeDBInstancePerformanceResponse, UnmarshallerContext context) {
		
		describeDBInstancePerformanceResponse.setRequestId(context.stringValue("DescribeDBInstancePerformanceResponse.RequestId"));
		describeDBInstancePerformanceResponse.setDBInstanceId(context.stringValue("DescribeDBInstancePerformanceResponse.DBInstanceId"));
		describeDBInstancePerformanceResponse.setEngine(context.stringValue("DescribeDBInstancePerformanceResponse.Engine"));
		describeDBInstancePerformanceResponse.setStartTime(context.stringValue("DescribeDBInstancePerformanceResponse.StartTime"));
		describeDBInstancePerformanceResponse.setEndTime(context.stringValue("DescribeDBInstancePerformanceResponse.EndTime"));

		List<PerformanceKey> performanceKeys = new ArrayList<PerformanceKey>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstancePerformanceResponse.PerformanceKeys.Length"); i++) {
			PerformanceKey performanceKey = new PerformanceKey();
			performanceKey.setKey(context.stringValue("DescribeDBInstancePerformanceResponse.PerformanceKeys["+ i +"].Key"));
			performanceKey.setUnit(context.stringValue("DescribeDBInstancePerformanceResponse.PerformanceKeys["+ i +"].Unit"));
			performanceKey.setValueFormat(context.stringValue("DescribeDBInstancePerformanceResponse.PerformanceKeys["+ i +"].ValueFormat"));

			List<PerformanceValue> values = new ArrayList<PerformanceValue>();
			for (int j = 0; j < context.lengthValue("DescribeDBInstancePerformanceResponse.PerformanceKeys["+ i +"].Values.Length"); j++) {
				PerformanceValue performanceValue = new PerformanceValue();
				performanceValue.setValue(context.stringValue("DescribeDBInstancePerformanceResponse.PerformanceKeys["+ i +"].Values["+ j +"].Value"));
				performanceValue.setDate(context.stringValue("DescribeDBInstancePerformanceResponse.PerformanceKeys["+ i +"].Values["+ j +"].Date"));

				values.add(performanceValue);
			}
			performanceKey.setValues(values);

			performanceKeys.add(performanceKey);
		}
		describeDBInstancePerformanceResponse.setPerformanceKeys(performanceKeys);
	 
	 	return describeDBInstancePerformanceResponse;
	}
}