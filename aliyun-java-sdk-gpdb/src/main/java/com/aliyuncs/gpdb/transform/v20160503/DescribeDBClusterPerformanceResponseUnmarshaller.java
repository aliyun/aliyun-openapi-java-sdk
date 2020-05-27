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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeDBClusterPerformanceResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBClusterPerformanceResponse.PerformanceKey;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBClusterPerformanceResponse.PerformanceKey.SeriesItem;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBClusterPerformanceResponse.PerformanceKey.SeriesItem.ValueItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterPerformanceResponseUnmarshaller {

	public static DescribeDBClusterPerformanceResponse unmarshall(DescribeDBClusterPerformanceResponse describeDBClusterPerformanceResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterPerformanceResponse.setRequestId(_ctx.stringValue("DescribeDBClusterPerformanceResponse.RequestId"));
		describeDBClusterPerformanceResponse.setDBClusterId(_ctx.stringValue("DescribeDBClusterPerformanceResponse.DBClusterId"));
		describeDBClusterPerformanceResponse.setStartTime(_ctx.stringValue("DescribeDBClusterPerformanceResponse.StartTime"));
		describeDBClusterPerformanceResponse.setEndTime(_ctx.stringValue("DescribeDBClusterPerformanceResponse.EndTime"));

		List<PerformanceKey> performanceKeys = new ArrayList<PerformanceKey>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterPerformanceResponse.PerformanceKeys.Length"); i++) {
			PerformanceKey performanceKey = new PerformanceKey();
			performanceKey.setUnit(_ctx.stringValue("DescribeDBClusterPerformanceResponse.PerformanceKeys["+ i +"].Unit"));
			performanceKey.setName(_ctx.stringValue("DescribeDBClusterPerformanceResponse.PerformanceKeys["+ i +"].Name"));

			List<SeriesItem> series = new ArrayList<SeriesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClusterPerformanceResponse.PerformanceKeys["+ i +"].Series.Length"); j++) {
				SeriesItem seriesItem = new SeriesItem();
				seriesItem.setName(_ctx.stringValue("DescribeDBClusterPerformanceResponse.PerformanceKeys["+ i +"].Series["+ j +"].Name"));
				seriesItem.setRole(_ctx.stringValue("DescribeDBClusterPerformanceResponse.PerformanceKeys["+ i +"].Series["+ j +"].Role"));

				List<ValueItem> values = new ArrayList<ValueItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeDBClusterPerformanceResponse.PerformanceKeys["+ i +"].Series["+ j +"].Values.Length"); k++) {
					ValueItem valueItem = new ValueItem();

					List<String> point = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("DescribeDBClusterPerformanceResponse.PerformanceKeys["+ i +"].Series["+ j +"].Values["+ k +"].Point.Length"); l++) {
						point.add(_ctx.stringValue("DescribeDBClusterPerformanceResponse.PerformanceKeys["+ i +"].Series["+ j +"].Values["+ k +"].Point["+ l +"]"));
					}
					valueItem.setPoint(point);

					values.add(valueItem);
				}
				seriesItem.setValues(values);

				series.add(seriesItem);
			}
			performanceKey.setSeries(series);

			performanceKeys.add(performanceKey);
		}
		describeDBClusterPerformanceResponse.setPerformanceKeys(performanceKeys);
	 
	 	return describeDBClusterPerformanceResponse;
	}
}