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

import com.aliyuncs.polardbx.model.v20200202.DescribeInstancePerformanceResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeInstancePerformanceResponse.Data;
import com.aliyuncs.polardbx.model.v20200202.DescribeInstancePerformanceResponse.Data.PerformanceItem;
import com.aliyuncs.polardbx.model.v20200202.DescribeInstancePerformanceResponse.Data.PerformanceItem.Point;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancePerformanceResponseUnmarshaller {

	public static DescribeInstancePerformanceResponse unmarshall(DescribeInstancePerformanceResponse describeInstancePerformanceResponse, UnmarshallerContext _ctx) {
		
		describeInstancePerformanceResponse.setRequestId(_ctx.stringValue("DescribeInstancePerformanceResponse.RequestId"));
		describeInstancePerformanceResponse.setSuccess(_ctx.booleanValue("DescribeInstancePerformanceResponse.Success"));
		describeInstancePerformanceResponse.setMessage(_ctx.stringValue("DescribeInstancePerformanceResponse.Message"));

		Data data = new Data();

		List<PerformanceItem> performanceItems = new ArrayList<PerformanceItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstancePerformanceResponse.Data.PerformanceItems.Length"); i++) {
			PerformanceItem performanceItem = new PerformanceItem();
			performanceItem.setMeasurement(_ctx.stringValue("DescribeInstancePerformanceResponse.Data.PerformanceItems["+ i +"].Measurement"));
			performanceItem.setMetricName(_ctx.stringValue("DescribeInstancePerformanceResponse.Data.PerformanceItems["+ i +"].MetricName"));

			List<Point> points = new ArrayList<Point>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancePerformanceResponse.Data.PerformanceItems["+ i +"].Points.Length"); j++) {
				Point point = new Point();
				point.setTimestamp(_ctx.longValue("DescribeInstancePerformanceResponse.Data.PerformanceItems["+ i +"].Points["+ j +"].Timestamp"));
				point.setValue(_ctx.stringValue("DescribeInstancePerformanceResponse.Data.PerformanceItems["+ i +"].Points["+ j +"].Value"));

				points.add(point);
			}
			performanceItem.setPoints(points);

			performanceItems.add(performanceItem);
		}
		data.setPerformanceItems(performanceItems);
		describeInstancePerformanceResponse.setData(data);
	 
	 	return describeInstancePerformanceResponse;
	}
}