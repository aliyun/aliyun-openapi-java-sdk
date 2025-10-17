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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancePerformanceResponseUnmarshaller {

	public static DescribeDBInstancePerformanceResponse unmarshall(DescribeDBInstancePerformanceResponse describeDBInstancePerformanceResponse, UnmarshallerContext _ctx) {
		
		describeDBInstancePerformanceResponse.setRequestId(_ctx.stringValue("DescribeDBInstancePerformanceResponse.RequestId"));
		describeDBInstancePerformanceResponse.setDBVersion(_ctx.stringValue("DescribeDBInstancePerformanceResponse.DBVersion"));
		describeDBInstancePerformanceResponse.setEndTime(_ctx.stringValue("DescribeDBInstancePerformanceResponse.EndTime"));
		describeDBInstancePerformanceResponse.setDBInstanceId(_ctx.stringValue("DescribeDBInstancePerformanceResponse.DBInstanceId"));
		describeDBInstancePerformanceResponse.setStartTime(_ctx.stringValue("DescribeDBInstancePerformanceResponse.StartTime"));
		describeDBInstancePerformanceResponse.setDBType(_ctx.stringValue("DescribeDBInstancePerformanceResponse.DBType"));
		describeDBInstancePerformanceResponse.setEngine(_ctx.stringValue("DescribeDBInstancePerformanceResponse.Engine"));

		List<PerformanceItem> performanceKeys = new ArrayList<PerformanceItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstancePerformanceResponse.PerformanceKeys.Length"); i++) {
			PerformanceItem performanceItem = new PerformanceItem();
			performanceItem.setMetricName(_ctx.stringValue("DescribeDBInstancePerformanceResponse.PerformanceKeys["+ i +"].MetricName"));
			performanceItem.setMeasurement(_ctx.stringValue("DescribeDBInstancePerformanceResponse.PerformanceKeys["+ i +"].Measurement"));

			List<PerformanceItemValue> points = new ArrayList<PerformanceItemValue>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstancePerformanceResponse.PerformanceKeys["+ i +"].Points.Length"); j++) {
				PerformanceItemValue performanceItemValue = new PerformanceItemValue();
				performanceItemValue.setValue(_ctx.stringValue("DescribeDBInstancePerformanceResponse.PerformanceKeys["+ i +"].Points["+ j +"].Value"));
				performanceItemValue.setTimestamp(_ctx.longValue("DescribeDBInstancePerformanceResponse.PerformanceKeys["+ i +"].Points["+ j +"].Timestamp"));

				points.add(performanceItemValue);
			}
			performanceItem.setPoints(points);

			performanceKeys.add(performanceItem);
		}
		describeDBInstancePerformanceResponse.setPerformanceKeys(performanceKeys);
	 
	 	return describeDBInstancePerformanceResponse;
	}
}