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

import com.aliyuncs.polardbx.model.v20200202.DescribeInstanceDbPerformanceResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeInstanceDbPerformanceResponse.Data;
import com.aliyuncs.polardbx.model.v20200202.DescribeInstanceDbPerformanceResponse.Data.PerformanceItem;
import com.aliyuncs.polardbx.model.v20200202.DescribeInstanceDbPerformanceResponse.Data.PerformanceItem.Point;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceDbPerformanceResponseUnmarshaller {

	public static DescribeInstanceDbPerformanceResponse unmarshall(DescribeInstanceDbPerformanceResponse describeInstanceDbPerformanceResponse, UnmarshallerContext _ctx) {
		
		describeInstanceDbPerformanceResponse.setRequestId(_ctx.stringValue("DescribeInstanceDbPerformanceResponse.RequestId"));
		describeInstanceDbPerformanceResponse.setSuccess(_ctx.booleanValue("DescribeInstanceDbPerformanceResponse.Success"));
		describeInstanceDbPerformanceResponse.setMessage(_ctx.stringValue("DescribeInstanceDbPerformanceResponse.Message"));

		Data data = new Data();

		List<PerformanceItem> performanceItems = new ArrayList<PerformanceItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceDbPerformanceResponse.Data.PerformanceItems.Length"); i++) {
			PerformanceItem performanceItem = new PerformanceItem();
			performanceItem.setMeasurement(_ctx.stringValue("DescribeInstanceDbPerformanceResponse.Data.PerformanceItems["+ i +"].Measurement"));
			performanceItem.setMetricName(_ctx.stringValue("DescribeInstanceDbPerformanceResponse.Data.PerformanceItems["+ i +"].MetricName"));

			List<Point> points = new ArrayList<Point>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceDbPerformanceResponse.Data.PerformanceItems["+ i +"].Points.Length"); j++) {
				Point point = new Point();
				point.setTimestamp(_ctx.longValue("DescribeInstanceDbPerformanceResponse.Data.PerformanceItems["+ i +"].Points["+ j +"].Timestamp"));
				point.setValue(_ctx.stringValue("DescribeInstanceDbPerformanceResponse.Data.PerformanceItems["+ i +"].Points["+ j +"].Value"));

				points.add(point);
			}
			performanceItem.setPoints(points);

			performanceItems.add(performanceItem);
		}
		data.setPerformanceItems(performanceItems);
		describeInstanceDbPerformanceResponse.setData(data);
	 
	 	return describeInstanceDbPerformanceResponse;
	}
}