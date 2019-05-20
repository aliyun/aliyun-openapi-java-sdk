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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListBarChartsResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListBarChartsResponse.TrendChart;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListBarChartsResponse.TrendChart.BarData;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBarChartsResponseUnmarshaller {

	public static ListBarChartsResponse unmarshall(ListBarChartsResponse listBarChartsResponse, UnmarshallerContext context) {
		
		listBarChartsResponse.setRequestId(context.stringValue("ListBarChartsResponse.RequestId"));
		listBarChartsResponse.setSuccess(context.booleanValue("ListBarChartsResponse.Success"));
		listBarChartsResponse.setCode(context.stringValue("ListBarChartsResponse.Code"));
		listBarChartsResponse.setMessage(context.stringValue("ListBarChartsResponse.Message"));
		listBarChartsResponse.setHttpStatusCode(context.integerValue("ListBarChartsResponse.HttpStatusCode"));

		List<TrendChart> trendCharts = new ArrayList<TrendChart>();
		for (int i = 0; i < context.lengthValue("ListBarChartsResponse.TrendCharts.Length"); i++) {
			TrendChart trendChart = new TrendChart();
			trendChart.setIndicator(context.stringValue("ListBarChartsResponse.TrendCharts["+ i +"].Indicator"));

			List<BarData> barDataList = new ArrayList<BarData>();
			for (int j = 0; j < context.lengthValue("ListBarChartsResponse.TrendCharts["+ i +"].BarDataList.Length"); j++) {
				BarData barData = new BarData();
				barData.setTimestamp(context.longValue("ListBarChartsResponse.TrendCharts["+ i +"].BarDataList["+ j +"].Timestamp"));
				barData.setWidth(context.longValue("ListBarChartsResponse.TrendCharts["+ i +"].BarDataList["+ j +"].Width"));
				barData.setHeight(context.longValue("ListBarChartsResponse.TrendCharts["+ i +"].BarDataList["+ j +"].Height"));

				barDataList.add(barData);
			}
			trendChart.setBarDataList(barDataList);

			trendCharts.add(trendChart);
		}
		listBarChartsResponse.setTrendCharts(trendCharts);
	 
	 	return listBarChartsResponse;
	}
}