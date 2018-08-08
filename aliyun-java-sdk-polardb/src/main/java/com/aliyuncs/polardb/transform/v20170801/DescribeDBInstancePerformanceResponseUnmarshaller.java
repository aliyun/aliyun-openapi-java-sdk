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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeDBInstancePerformanceResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBInstancePerformanceResponse.PerformanceItem;
import com.aliyuncs.polardb.model.v20170801.DescribeDBInstancePerformanceResponse.PerformanceItem.PerformanceItemValue;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancePerformanceResponseUnmarshaller {

	public static DescribeDBInstancePerformanceResponse unmarshall(DescribeDBInstancePerformanceResponse describeDBInstancePerformanceResponse, UnmarshallerContext context) {
		
		describeDBInstancePerformanceResponse.setRequestId(context.stringValue("DescribeDBInstancePerformanceResponse.RequestId"));
		describeDBInstancePerformanceResponse.setDBInstanceId(context.stringValue("DescribeDBInstancePerformanceResponse.DBInstanceId"));
		describeDBInstancePerformanceResponse.setEngine(context.stringValue("DescribeDBInstancePerformanceResponse.Engine"));
		describeDBInstancePerformanceResponse.setDBType(context.stringValue("DescribeDBInstancePerformanceResponse.DBType"));
		describeDBInstancePerformanceResponse.setDBVersion(context.stringValue("DescribeDBInstancePerformanceResponse.DBVersion"));
		describeDBInstancePerformanceResponse.setStartTime(context.stringValue("DescribeDBInstancePerformanceResponse.StartTime"));
		describeDBInstancePerformanceResponse.setEndTime(context.stringValue("DescribeDBInstancePerformanceResponse.EndTime"));

		List<PerformanceItem> performanceKeys = new ArrayList<PerformanceItem>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstancePerformanceResponse.PerformanceKeys.Length"); i++) {
			PerformanceItem performanceItem = new PerformanceItem();
			performanceItem.setMetricName(context.stringValue("DescribeDBInstancePerformanceResponse.PerformanceKeys["+ i +"].MetricName"));
			performanceItem.setMeasurement(context.stringValue("DescribeDBInstancePerformanceResponse.PerformanceKeys["+ i +"].Measurement"));

			List<PerformanceItemValue> points = new ArrayList<PerformanceItemValue>();
			for (int j = 0; j < context.lengthValue("DescribeDBInstancePerformanceResponse.PerformanceKeys["+ i +"].Points.Length"); j++) {
				PerformanceItemValue performanceItemValue = new PerformanceItemValue();
				performanceItemValue.setValue(context.stringValue("DescribeDBInstancePerformanceResponse.PerformanceKeys["+ i +"].Points["+ j +"].Value"));
				performanceItemValue.setTimestamp(context.longValue("DescribeDBInstancePerformanceResponse.PerformanceKeys["+ i +"].Points["+ j +"].Timestamp"));

				points.add(performanceItemValue);
			}
			performanceItem.setPoints(points);

			performanceKeys.add(performanceItem);
		}
		describeDBInstancePerformanceResponse.setPerformanceKeys(performanceKeys);
	 
	 	return describeDBInstancePerformanceResponse;
	}
}