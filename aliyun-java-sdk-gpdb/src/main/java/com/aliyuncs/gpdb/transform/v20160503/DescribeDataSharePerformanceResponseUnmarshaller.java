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

import com.aliyuncs.gpdb.model.v20160503.DescribeDataSharePerformanceResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDataSharePerformanceResponse.PerformanceItem;
import com.aliyuncs.gpdb.model.v20160503.DescribeDataSharePerformanceResponse.PerformanceItem.SeriesItem;
import com.aliyuncs.gpdb.model.v20160503.DescribeDataSharePerformanceResponse.PerformanceItem.SeriesItem.ValuesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataSharePerformanceResponseUnmarshaller {

	public static DescribeDataSharePerformanceResponse unmarshall(DescribeDataSharePerformanceResponse describeDataSharePerformanceResponse, UnmarshallerContext _ctx) {
		
		describeDataSharePerformanceResponse.setRequestId(_ctx.stringValue("DescribeDataSharePerformanceResponse.RequestId"));
		describeDataSharePerformanceResponse.setEndTime(_ctx.stringValue("DescribeDataSharePerformanceResponse.EndTime"));
		describeDataSharePerformanceResponse.setStartTime(_ctx.stringValue("DescribeDataSharePerformanceResponse.StartTime"));
		describeDataSharePerformanceResponse.setDBClusterId(_ctx.stringValue("DescribeDataSharePerformanceResponse.DBClusterId"));

		List<PerformanceItem> performanceKeys = new ArrayList<PerformanceItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataSharePerformanceResponse.PerformanceKeys.Length"); i++) {
			PerformanceItem performanceItem = new PerformanceItem();
			performanceItem.setName(_ctx.stringValue("DescribeDataSharePerformanceResponse.PerformanceKeys["+ i +"].Name"));
			performanceItem.setUnit(_ctx.stringValue("DescribeDataSharePerformanceResponse.PerformanceKeys["+ i +"].Unit"));

			List<SeriesItem> series = new ArrayList<SeriesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDataSharePerformanceResponse.PerformanceKeys["+ i +"].Series.Length"); j++) {
				SeriesItem seriesItem = new SeriesItem();
				seriesItem.setName(_ctx.stringValue("DescribeDataSharePerformanceResponse.PerformanceKeys["+ i +"].Series["+ j +"].Name"));

				List<ValuesItem> values = new ArrayList<ValuesItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeDataSharePerformanceResponse.PerformanceKeys["+ i +"].Series["+ j +"].Values.Length"); k++) {
					ValuesItem valuesItem = new ValuesItem();

					List<String> point = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("DescribeDataSharePerformanceResponse.PerformanceKeys["+ i +"].Series["+ j +"].Values["+ k +"].Point.Length"); l++) {
						point.add(_ctx.stringValue("DescribeDataSharePerformanceResponse.PerformanceKeys["+ i +"].Series["+ j +"].Values["+ k +"].Point["+ l +"]"));
					}
					valuesItem.setPoint(point);

					values.add(valuesItem);
				}
				seriesItem.setValues(values);

				series.add(seriesItem);
			}
			performanceItem.setSeries(series);

			performanceKeys.add(performanceItem);
		}
		describeDataSharePerformanceResponse.setPerformanceKeys(performanceKeys);
	 
	 	return describeDataSharePerformanceResponse;
	}
}