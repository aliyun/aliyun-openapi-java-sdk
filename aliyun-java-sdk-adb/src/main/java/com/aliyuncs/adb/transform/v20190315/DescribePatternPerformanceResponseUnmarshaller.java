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

import com.aliyuncs.adb.model.v20190315.DescribePatternPerformanceResponse;
import com.aliyuncs.adb.model.v20190315.DescribePatternPerformanceResponse.PerformanceItem;
import com.aliyuncs.adb.model.v20190315.DescribePatternPerformanceResponse.PerformanceItem.SeriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePatternPerformanceResponseUnmarshaller {

	public static DescribePatternPerformanceResponse unmarshall(DescribePatternPerformanceResponse describePatternPerformanceResponse, UnmarshallerContext _ctx) {
		
		describePatternPerformanceResponse.setRequestId(_ctx.stringValue("DescribePatternPerformanceResponse.RequestId"));
		describePatternPerformanceResponse.setEndTime(_ctx.stringValue("DescribePatternPerformanceResponse.EndTime"));
		describePatternPerformanceResponse.setStartTime(_ctx.stringValue("DescribePatternPerformanceResponse.StartTime"));

		List<PerformanceItem> performances = new ArrayList<PerformanceItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePatternPerformanceResponse.Performances.Length"); i++) {
			PerformanceItem performanceItem = new PerformanceItem();
			performanceItem.setKey(_ctx.stringValue("DescribePatternPerformanceResponse.Performances["+ i +"].Key"));
			performanceItem.setUnit(_ctx.stringValue("DescribePatternPerformanceResponse.Performances["+ i +"].Unit"));

			List<SeriesItem> series = new ArrayList<SeriesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribePatternPerformanceResponse.Performances["+ i +"].Series.Length"); j++) {
				SeriesItem seriesItem = new SeriesItem();
				seriesItem.setName(_ctx.stringValue("DescribePatternPerformanceResponse.Performances["+ i +"].Series["+ j +"].Name"));

				List<String> values = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribePatternPerformanceResponse.Performances["+ i +"].Series["+ j +"].Values.Length"); k++) {
					values.add(_ctx.stringValue("DescribePatternPerformanceResponse.Performances["+ i +"].Series["+ j +"].Values["+ k +"]"));
				}
				seriesItem.setValues(values);

				series.add(seriesItem);
			}
			performanceItem.setSeries(series);

			performances.add(performanceItem);
		}
		describePatternPerformanceResponse.setPerformances(performances);
	 
	 	return describePatternPerformanceResponse;
	}
}