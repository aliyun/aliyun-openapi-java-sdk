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

import com.aliyuncs.adb.model.v20190315.DescribeDBClusterForecastResponse;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterForecastResponse.PerformancesItem;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterForecastResponse.PerformancesItem.SeriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterForecastResponseUnmarshaller {

	public static DescribeDBClusterForecastResponse unmarshall(DescribeDBClusterForecastResponse describeDBClusterForecastResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterForecastResponse.setRequestId(_ctx.stringValue("DescribeDBClusterForecastResponse.RequestId"));

		List<PerformancesItem> performances = new ArrayList<PerformancesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterForecastResponse.Performances.Length"); i++) {
			PerformancesItem performancesItem = new PerformancesItem();
			performancesItem.setKey(_ctx.stringValue("DescribeDBClusterForecastResponse.Performances["+ i +"].Key"));
			performancesItem.setUnit(_ctx.stringValue("DescribeDBClusterForecastResponse.Performances["+ i +"].Unit"));

			List<SeriesItem> series = new ArrayList<SeriesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClusterForecastResponse.Performances["+ i +"].Series.Length"); j++) {
				SeriesItem seriesItem = new SeriesItem();
				seriesItem.setName(_ctx.stringValue("DescribeDBClusterForecastResponse.Performances["+ i +"].Series["+ j +"].Name"));
				seriesItem.setValues(_ctx.stringValue("DescribeDBClusterForecastResponse.Performances["+ i +"].Series["+ j +"].Values"));

				series.add(seriesItem);
			}
			performancesItem.setSeries(series);

			performances.add(performancesItem);
		}
		describeDBClusterForecastResponse.setPerformances(performances);
	 
	 	return describeDBClusterForecastResponse;
	}
}