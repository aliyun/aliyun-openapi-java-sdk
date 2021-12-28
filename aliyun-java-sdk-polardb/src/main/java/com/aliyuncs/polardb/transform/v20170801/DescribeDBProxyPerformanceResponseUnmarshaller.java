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

import com.aliyuncs.polardb.model.v20170801.DescribeDBProxyPerformanceResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBProxyPerformanceResponse.PerformanceItem;
import com.aliyuncs.polardb.model.v20170801.DescribeDBProxyPerformanceResponse.PerformanceItem.PerformanceItemValue;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBProxyPerformanceResponseUnmarshaller {

	public static DescribeDBProxyPerformanceResponse unmarshall(DescribeDBProxyPerformanceResponse describeDBProxyPerformanceResponse, UnmarshallerContext _ctx) {
		
		describeDBProxyPerformanceResponse.setRequestId(_ctx.stringValue("DescribeDBProxyPerformanceResponse.RequestId"));
		describeDBProxyPerformanceResponse.setDBVersion(_ctx.stringValue("DescribeDBProxyPerformanceResponse.DBVersion"));
		describeDBProxyPerformanceResponse.setEndTime(_ctx.stringValue("DescribeDBProxyPerformanceResponse.EndTime"));
		describeDBProxyPerformanceResponse.setStartTime(_ctx.stringValue("DescribeDBProxyPerformanceResponse.StartTime"));
		describeDBProxyPerformanceResponse.setDBClusterId(_ctx.stringValue("DescribeDBProxyPerformanceResponse.DBClusterId"));
		describeDBProxyPerformanceResponse.setDBType(_ctx.stringValue("DescribeDBProxyPerformanceResponse.DBType"));
		describeDBProxyPerformanceResponse.setEngine(_ctx.stringValue("DescribeDBProxyPerformanceResponse.Engine"));

		List<PerformanceItem> performanceKeys = new ArrayList<PerformanceItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBProxyPerformanceResponse.PerformanceKeys.Length"); i++) {
			PerformanceItem performanceItem = new PerformanceItem();
			performanceItem.setMetricName(_ctx.stringValue("DescribeDBProxyPerformanceResponse.PerformanceKeys["+ i +"].MetricName"));
			performanceItem.setMeasurement(_ctx.stringValue("DescribeDBProxyPerformanceResponse.PerformanceKeys["+ i +"].Measurement"));
			performanceItem.setDBNodeId(_ctx.stringValue("DescribeDBProxyPerformanceResponse.PerformanceKeys["+ i +"].DBNodeId"));

			List<PerformanceItemValue> points = new ArrayList<PerformanceItemValue>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBProxyPerformanceResponse.PerformanceKeys["+ i +"].Points.Length"); j++) {
				PerformanceItemValue performanceItemValue = new PerformanceItemValue();
				performanceItemValue.setValue(_ctx.stringValue("DescribeDBProxyPerformanceResponse.PerformanceKeys["+ i +"].Points["+ j +"].Value"));
				performanceItemValue.setTimestamp(_ctx.longValue("DescribeDBProxyPerformanceResponse.PerformanceKeys["+ i +"].Points["+ j +"].Timestamp"));

				points.add(performanceItemValue);
			}
			performanceItem.setPoints(points);

			performanceKeys.add(performanceItem);
		}
		describeDBProxyPerformanceResponse.setPerformanceKeys(performanceKeys);
	 
	 	return describeDBProxyPerformanceResponse;
	}
}