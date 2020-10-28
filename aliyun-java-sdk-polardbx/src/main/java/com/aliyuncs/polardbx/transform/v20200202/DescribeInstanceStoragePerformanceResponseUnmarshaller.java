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

package com.aliyuncs.polardbx.transform.v20200202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardbx.model.v20200202.DescribeInstanceStoragePerformanceResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeInstanceStoragePerformanceResponse.Data;
import com.aliyuncs.polardbx.model.v20200202.DescribeInstanceStoragePerformanceResponse.Data.PerformanceItem;
import com.aliyuncs.polardbx.model.v20200202.DescribeInstanceStoragePerformanceResponse.Data.PerformanceItem.Point;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceStoragePerformanceResponseUnmarshaller {

	public static DescribeInstanceStoragePerformanceResponse unmarshall(DescribeInstanceStoragePerformanceResponse describeInstanceStoragePerformanceResponse, UnmarshallerContext _ctx) {
		
		describeInstanceStoragePerformanceResponse.setRequestId(_ctx.stringValue("DescribeInstanceStoragePerformanceResponse.RequestId"));
		describeInstanceStoragePerformanceResponse.setSuccess(_ctx.booleanValue("DescribeInstanceStoragePerformanceResponse.Success"));
		describeInstanceStoragePerformanceResponse.setMessage(_ctx.stringValue("DescribeInstanceStoragePerformanceResponse.Message"));

		Data data = new Data();

		List<PerformanceItem> performanceItems = new ArrayList<PerformanceItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceStoragePerformanceResponse.Data.PerformanceItems.Length"); i++) {
			PerformanceItem performanceItem = new PerformanceItem();
			performanceItem.setMeasurement(_ctx.stringValue("DescribeInstanceStoragePerformanceResponse.Data.PerformanceItems["+ i +"].Measurement"));
			performanceItem.setMetricName(_ctx.stringValue("DescribeInstanceStoragePerformanceResponse.Data.PerformanceItems["+ i +"].MetricName"));

			List<Point> points = new ArrayList<Point>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceStoragePerformanceResponse.Data.PerformanceItems["+ i +"].Points.Length"); j++) {
				Point point = new Point();
				point.setTimestamp(_ctx.longValue("DescribeInstanceStoragePerformanceResponse.Data.PerformanceItems["+ i +"].Points["+ j +"].Timestamp"));
				point.setValue(_ctx.stringValue("DescribeInstanceStoragePerformanceResponse.Data.PerformanceItems["+ i +"].Points["+ j +"].Value"));

				points.add(point);
			}
			performanceItem.setPoints(points);

			performanceItems.add(performanceItem);
		}
		data.setPerformanceItems(performanceItems);
		describeInstanceStoragePerformanceResponse.setData(data);
	 
	 	return describeInstanceStoragePerformanceResponse;
	}
}