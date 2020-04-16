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

package com.aliyuncs.clickhouse.transform.v20191111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.clickhouse.model.v20191111.DescribeDBClusterPerformanceResponse;
import com.aliyuncs.clickhouse.model.v20191111.DescribeDBClusterPerformanceResponse.PerformanceItem;
import com.aliyuncs.clickhouse.model.v20191111.DescribeDBClusterPerformanceResponse.PerformanceItem.SeriesItem;
import com.aliyuncs.clickhouse.model.v20191111.DescribeDBClusterPerformanceResponse.PerformanceItem.SeriesItem.ValueItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterPerformanceResponseUnmarshaller {

	public static DescribeDBClusterPerformanceResponse unmarshall(DescribeDBClusterPerformanceResponse describeDBClusterPerformanceResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterPerformanceResponse.setRequestId(_ctx.stringValue("DescribeDBClusterPerformanceResponse.RequestId"));
		describeDBClusterPerformanceResponse.setDBClusterId(_ctx.stringValue("DescribeDBClusterPerformanceResponse.DBClusterId"));
		describeDBClusterPerformanceResponse.setEndTime(_ctx.stringValue("DescribeDBClusterPerformanceResponse.EndTime"));
		describeDBClusterPerformanceResponse.setStartTime(_ctx.stringValue("DescribeDBClusterPerformanceResponse.StartTime"));

		List<PerformanceItem> performances = new ArrayList<PerformanceItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterPerformanceResponse.Performances.Length"); i++) {
			PerformanceItem performanceItem = new PerformanceItem();
			performanceItem.setKey(_ctx.stringValue("DescribeDBClusterPerformanceResponse.Performances["+ i +"].Key"));
			performanceItem.setUnit(_ctx.stringValue("DescribeDBClusterPerformanceResponse.Performances["+ i +"].Unit"));
			performanceItem.setName(_ctx.stringValue("DescribeDBClusterPerformanceResponse.Performances["+ i +"].Name"));

			List<SeriesItem> series = new ArrayList<SeriesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClusterPerformanceResponse.Performances["+ i +"].Series.Length"); j++) {
				SeriesItem seriesItem = new SeriesItem();
				seriesItem.setName(_ctx.stringValue("DescribeDBClusterPerformanceResponse.Performances["+ i +"].Series["+ j +"].Name"));

				List<ValueItem> values = new ArrayList<ValueItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeDBClusterPerformanceResponse.Performances["+ i +"].Series["+ j +"].Values.Length"); k++) {
					ValueItem valueItem = new ValueItem();

					List<String> point = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("DescribeDBClusterPerformanceResponse.Performances["+ i +"].Series["+ j +"].Values["+ k +"].Point.Length"); l++) {
						point.add(_ctx.stringValue("DescribeDBClusterPerformanceResponse.Performances["+ i +"].Series["+ j +"].Values["+ k +"].Point["+ l +"]"));
					}
					valueItem.setPoint(point);

					values.add(valueItem);
				}
				seriesItem.setValues(values);

				series.add(seriesItem);
			}
			performanceItem.setSeries(series);

			performances.add(performanceItem);
		}
		describeDBClusterPerformanceResponse.setPerformances(performances);
	 
	 	return describeDBClusterPerformanceResponse;
	}
}