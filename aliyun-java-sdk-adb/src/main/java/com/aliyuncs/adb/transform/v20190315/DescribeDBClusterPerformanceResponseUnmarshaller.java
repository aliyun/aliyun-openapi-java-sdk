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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeDBClusterPerformanceResponse;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterPerformanceResponse.PerformanceItem;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterPerformanceResponse.PerformanceItem.SeriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterPerformanceResponseUnmarshaller {

	public static DescribeDBClusterPerformanceResponse unmarshall(DescribeDBClusterPerformanceResponse describeDBClusterPerformanceResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterPerformanceResponse.setRequestId(_ctx.stringValue("DescribeDBClusterPerformanceResponse.RequestId"));
		describeDBClusterPerformanceResponse.setDBClusterId(_ctx.stringValue("DescribeDBClusterPerformanceResponse.DBClusterId"));
		describeDBClusterPerformanceResponse.setStartTime(_ctx.stringValue("DescribeDBClusterPerformanceResponse.StartTime"));
		describeDBClusterPerformanceResponse.setEndTime(_ctx.stringValue("DescribeDBClusterPerformanceResponse.EndTime"));

		List<PerformanceItem> performances = new ArrayList<PerformanceItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterPerformanceResponse.Performances.Length"); i++) {
			PerformanceItem performanceItem = new PerformanceItem();
			performanceItem.setKey(_ctx.stringValue("DescribeDBClusterPerformanceResponse.Performances["+ i +"].Key"));
			performanceItem.setUnit(_ctx.stringValue("DescribeDBClusterPerformanceResponse.Performances["+ i +"].Unit"));

			List<SeriesItem> series = new ArrayList<SeriesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClusterPerformanceResponse.Performances["+ i +"].Series.Length"); j++) {
				SeriesItem seriesItem = new SeriesItem();
				seriesItem.setName(_ctx.stringValue("DescribeDBClusterPerformanceResponse.Performances["+ i +"].Series["+ j +"].Name"));

				List<String> values = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeDBClusterPerformanceResponse.Performances["+ i +"].Series["+ j +"].Values.Length"); k++) {
					values.add(_ctx.stringValue("DescribeDBClusterPerformanceResponse.Performances["+ i +"].Series["+ j +"].Values["+ k +"]"));
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