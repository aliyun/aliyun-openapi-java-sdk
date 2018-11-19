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

import com.aliyuncs.polardb.model.v20170801.DescribeDBNodePerformanceResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBNodePerformanceResponse.PerformanceItem;
import com.aliyuncs.polardb.model.v20170801.DescribeDBNodePerformanceResponse.PerformanceItem.PerformanceItemValue;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBNodePerformanceResponseUnmarshaller {

	public static DescribeDBNodePerformanceResponse unmarshall(DescribeDBNodePerformanceResponse describeDBNodePerformanceResponse, UnmarshallerContext context) {
		
		describeDBNodePerformanceResponse.setRequestId(context.stringValue("DescribeDBNodePerformanceResponse.RequestId"));
		describeDBNodePerformanceResponse.setDBNodeId(context.stringValue("DescribeDBNodePerformanceResponse.DBNodeId"));
		describeDBNodePerformanceResponse.setEngine(context.stringValue("DescribeDBNodePerformanceResponse.Engine"));
		describeDBNodePerformanceResponse.setDBType(context.stringValue("DescribeDBNodePerformanceResponse.DBType"));
		describeDBNodePerformanceResponse.setDBVersion(context.stringValue("DescribeDBNodePerformanceResponse.DBVersion"));
		describeDBNodePerformanceResponse.setStartTime(context.stringValue("DescribeDBNodePerformanceResponse.StartTime"));
		describeDBNodePerformanceResponse.setEndTime(context.stringValue("DescribeDBNodePerformanceResponse.EndTime"));

		List<PerformanceItem> performanceKeys = new ArrayList<PerformanceItem>();
		for (int i = 0; i < context.lengthValue("DescribeDBNodePerformanceResponse.PerformanceKeys.Length"); i++) {
			PerformanceItem performanceItem = new PerformanceItem();
			performanceItem.setMetricName(context.stringValue("DescribeDBNodePerformanceResponse.PerformanceKeys["+ i +"].MetricName"));
			performanceItem.setMeasurement(context.stringValue("DescribeDBNodePerformanceResponse.PerformanceKeys["+ i +"].Measurement"));

			List<PerformanceItemValue> points = new ArrayList<PerformanceItemValue>();
			for (int j = 0; j < context.lengthValue("DescribeDBNodePerformanceResponse.PerformanceKeys["+ i +"].Points.Length"); j++) {
				PerformanceItemValue performanceItemValue = new PerformanceItemValue();
				performanceItemValue.setValue(context.stringValue("DescribeDBNodePerformanceResponse.PerformanceKeys["+ i +"].Points["+ j +"].Value"));
				performanceItemValue.setTimestamp(context.longValue("DescribeDBNodePerformanceResponse.PerformanceKeys["+ i +"].Points["+ j +"].Timestamp"));

				points.add(performanceItemValue);
			}
			performanceItem.setPoints(points);

			performanceKeys.add(performanceItem);
		}
		describeDBNodePerformanceResponse.setPerformanceKeys(performanceKeys);
	 
	 	return describeDBNodePerformanceResponse;
	}
}