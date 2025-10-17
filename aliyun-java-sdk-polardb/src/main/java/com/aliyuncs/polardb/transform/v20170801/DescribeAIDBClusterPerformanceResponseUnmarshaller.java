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

import com.aliyuncs.polardb.model.v20170801.DescribeAIDBClusterPerformanceResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeAIDBClusterPerformanceResponse.PerformanceItem;
import com.aliyuncs.polardb.model.v20170801.DescribeAIDBClusterPerformanceResponse.PerformanceItem.PerformanceItemValue;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAIDBClusterPerformanceResponseUnmarshaller {

	public static DescribeAIDBClusterPerformanceResponse unmarshall(DescribeAIDBClusterPerformanceResponse describeAIDBClusterPerformanceResponse, UnmarshallerContext _ctx) {
		
		describeAIDBClusterPerformanceResponse.setRequestId(_ctx.stringValue("DescribeAIDBClusterPerformanceResponse.RequestId"));
		describeAIDBClusterPerformanceResponse.setDBVersion(_ctx.stringValue("DescribeAIDBClusterPerformanceResponse.DBVersion"));
		describeAIDBClusterPerformanceResponse.setEndTime(_ctx.stringValue("DescribeAIDBClusterPerformanceResponse.EndTime"));
		describeAIDBClusterPerformanceResponse.setStartTime(_ctx.stringValue("DescribeAIDBClusterPerformanceResponse.StartTime"));
		describeAIDBClusterPerformanceResponse.setDBClusterId(_ctx.stringValue("DescribeAIDBClusterPerformanceResponse.DBClusterId"));
		describeAIDBClusterPerformanceResponse.setDBType(_ctx.stringValue("DescribeAIDBClusterPerformanceResponse.DBType"));
		describeAIDBClusterPerformanceResponse.setEngine(_ctx.stringValue("DescribeAIDBClusterPerformanceResponse.Engine"));
		describeAIDBClusterPerformanceResponse.setApiKey(_ctx.stringValue("DescribeAIDBClusterPerformanceResponse.ApiKey"));
		describeAIDBClusterPerformanceResponse.setInterval(_ctx.stringValue("DescribeAIDBClusterPerformanceResponse.Interval"));

		List<PerformanceItem> performanceKeys = new ArrayList<PerformanceItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAIDBClusterPerformanceResponse.PerformanceKeys.Length"); i++) {
			PerformanceItem performanceItem = new PerformanceItem();
			performanceItem.setMeasurement(_ctx.stringValue("DescribeAIDBClusterPerformanceResponse.PerformanceKeys["+ i +"].Measurement"));
			performanceItem.setMetricName(_ctx.stringValue("DescribeAIDBClusterPerformanceResponse.PerformanceKeys["+ i +"].MetricName"));
			performanceItem.setDBNodeId(_ctx.stringValue("DescribeAIDBClusterPerformanceResponse.PerformanceKeys["+ i +"].DBNodeId"));

			List<PerformanceItemValue> points = new ArrayList<PerformanceItemValue>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAIDBClusterPerformanceResponse.PerformanceKeys["+ i +"].Points.Length"); j++) {
				PerformanceItemValue performanceItemValue = new PerformanceItemValue();
				performanceItemValue.setValue(_ctx.stringValue("DescribeAIDBClusterPerformanceResponse.PerformanceKeys["+ i +"].Points["+ j +"].Value"));
				performanceItemValue.setTimestamp(_ctx.longValue("DescribeAIDBClusterPerformanceResponse.PerformanceKeys["+ i +"].Points["+ j +"].Timestamp"));

				points.add(performanceItemValue);
			}
			performanceItem.setPoints(points);

			performanceKeys.add(performanceItem);
		}
		describeAIDBClusterPerformanceResponse.setPerformanceKeys(performanceKeys);
	 
	 	return describeAIDBClusterPerformanceResponse;
	}
}