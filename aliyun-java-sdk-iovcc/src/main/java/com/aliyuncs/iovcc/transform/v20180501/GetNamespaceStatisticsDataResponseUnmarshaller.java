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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.GetNamespaceStatisticsDataResponse;
import com.aliyuncs.iovcc.model.v20180501.GetNamespaceStatisticsDataResponse.Statistics;
import com.aliyuncs.iovcc.model.v20180501.GetNamespaceStatisticsDataResponse.Statistics.SeriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNamespaceStatisticsDataResponseUnmarshaller {

	public static GetNamespaceStatisticsDataResponse unmarshall(GetNamespaceStatisticsDataResponse getNamespaceStatisticsDataResponse, UnmarshallerContext _ctx) {
		
		getNamespaceStatisticsDataResponse.setRequestId(_ctx.stringValue("GetNamespaceStatisticsDataResponse.RequestId"));

		Statistics statistics = new Statistics();

		List<String> categories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetNamespaceStatisticsDataResponse.Statistics.Categories.Length"); i++) {
			categories.add(_ctx.stringValue("GetNamespaceStatisticsDataResponse.Statistics.Categories["+ i +"]"));
		}
		statistics.setCategories(categories);

		List<SeriesItem> series = new ArrayList<SeriesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetNamespaceStatisticsDataResponse.Statistics.Series.Length"); i++) {
			SeriesItem seriesItem = new SeriesItem();
			seriesItem.setName(_ctx.stringValue("GetNamespaceStatisticsDataResponse.Statistics.Series["+ i +"].Name"));

			List<String> data = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetNamespaceStatisticsDataResponse.Statistics.Series["+ i +"].Data.Length"); j++) {
				data.add(_ctx.stringValue("GetNamespaceStatisticsDataResponse.Statistics.Series["+ i +"].Data["+ j +"]"));
			}
			seriesItem.setData(data);

			series.add(seriesItem);
		}
		statistics.setSeries(series);
		getNamespaceStatisticsDataResponse.setStatistics(statistics);
	 
	 	return getNamespaceStatisticsDataResponse;
	}
}