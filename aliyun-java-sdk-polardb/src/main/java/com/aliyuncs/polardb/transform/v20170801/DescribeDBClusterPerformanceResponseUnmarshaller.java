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

import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterPerformanceResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterPerformanceResponse.PerformanceItem;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterPerformanceResponse.PerformanceItem.PerformanceItemValue;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterPerformanceResponseUnmarshaller {

	public static DescribeDBClusterPerformanceResponse unmarshall(DescribeDBClusterPerformanceResponse describeDBClusterPerformanceResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterPerformanceResponse.setRequestId(_ctx.stringValue("DescribeDBClusterPerformanceResponse.RequestId"));
		describeDBClusterPerformanceResponse.setDBClusterId(_ctx.stringValue("DescribeDBClusterPerformanceResponse.DBClusterId"));
		describeDBClusterPerformanceResponse.setEngine(_ctx.stringValue("DescribeDBClusterPerformanceResponse.Engine"));
		describeDBClusterPerformanceResponse.setDBType(_ctx.stringValue("DescribeDBClusterPerformanceResponse.DBType"));
		describeDBClusterPerformanceResponse.setDBVersion(_ctx.stringValue("DescribeDBClusterPerformanceResponse.DBVersion"));
		describeDBClusterPerformanceResponse.setStartTime(_ctx.stringValue("DescribeDBClusterPerformanceResponse.StartTime"));
		describeDBClusterPerformanceResponse.setEndTime(_ctx.stringValue("DescribeDBClusterPerformanceResponse.EndTime"));

		List<PerformanceItem> performanceKeys = new ArrayList<PerformanceItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterPerformanceResponse.PerformanceKeys.Length"); i++) {
			PerformanceItem performanceItem = new PerformanceItem();
			performanceItem.setDBNodeId(_ctx.stringValue("DescribeDBClusterPerformanceResponse.PerformanceKeys["+ i +"].DBNodeId"));
			performanceItem.setMeasurement(_ctx.stringValue("DescribeDBClusterPerformanceResponse.PerformanceKeys["+ i +"].Measurement"));
			performanceItem.setMetricName(_ctx.stringValue("DescribeDBClusterPerformanceResponse.PerformanceKeys["+ i +"].MetricName"));

			List<PerformanceItemValue> points = new ArrayList<PerformanceItemValue>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClusterPerformanceResponse.PerformanceKeys["+ i +"].Points.Length"); j++) {
				PerformanceItemValue performanceItemValue = new PerformanceItemValue();
				performanceItemValue.setValue(_ctx.stringValue("DescribeDBClusterPerformanceResponse.PerformanceKeys["+ i +"].Points["+ j +"].Value"));
				performanceItemValue.setTimestamp(_ctx.longValue("DescribeDBClusterPerformanceResponse.PerformanceKeys["+ i +"].Points["+ j +"].Timestamp"));

				points.add(performanceItemValue);
			}
			performanceItem.setPoints(points);

			performanceKeys.add(performanceItem);
		}
		describeDBClusterPerformanceResponse.setPerformanceKeys(performanceKeys);
	 
	 	return describeDBClusterPerformanceResponse;
	}
}