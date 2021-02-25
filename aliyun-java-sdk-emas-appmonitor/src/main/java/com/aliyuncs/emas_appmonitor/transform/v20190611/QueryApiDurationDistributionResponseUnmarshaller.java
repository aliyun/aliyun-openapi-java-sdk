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

package com.aliyuncs.emas_appmonitor.transform.v20190611;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emas_appmonitor.model.v20190611.QueryApiDurationDistributionResponse;
import com.aliyuncs.emas_appmonitor.model.v20190611.QueryApiDurationDistributionResponse.MetricResultItem;
import com.aliyuncs.emas_appmonitor.model.v20190611.QueryApiDurationDistributionResponse.MetricResultItem.Point;
import com.aliyuncs.emas_appmonitor.model.v20190611.QueryApiDurationDistributionResponse.MetricResultItem.Point.CentroidItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryApiDurationDistributionResponseUnmarshaller {

	public static QueryApiDurationDistributionResponse unmarshall(QueryApiDurationDistributionResponse queryApiDurationDistributionResponse, UnmarshallerContext _ctx) {
		
		queryApiDurationDistributionResponse.setRequestId(_ctx.stringValue("QueryApiDurationDistributionResponse.RequestId"));

		List<MetricResultItem> metricResultList = new ArrayList<MetricResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryApiDurationDistributionResponse.MetricResultList.Length"); i++) {
			MetricResultItem metricResultItem = new MetricResultItem();
			metricResultItem.setTags(_ctx.mapValue("QueryApiDurationDistributionResponse.MetricResultList["+ i +"].Tags"));

			List<Point> data = new ArrayList<Point>();
			for (int j = 0; j < _ctx.lengthValue("QueryApiDurationDistributionResponse.MetricResultList["+ i +"].Data.Length"); j++) {
				Point point = new Point();
				point.setTime(_ctx.longValue("QueryApiDurationDistributionResponse.MetricResultList["+ i +"].Data["+ j +"].Time"));

				List<CentroidItem> centroidItemList = new ArrayList<CentroidItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryApiDurationDistributionResponse.MetricResultList["+ i +"].Data["+ j +"].CentroidItemList.Length"); k++) {
					CentroidItem centroidItem = new CentroidItem();
					centroidItem.setRange(_ctx.stringValue("QueryApiDurationDistributionResponse.MetricResultList["+ i +"].Data["+ j +"].CentroidItemList["+ k +"].Range"));
					centroidItem.setRate(_ctx.floatValue("QueryApiDurationDistributionResponse.MetricResultList["+ i +"].Data["+ j +"].CentroidItemList["+ k +"].Rate"));
					centroidItem.setValue(_ctx.floatValue("QueryApiDurationDistributionResponse.MetricResultList["+ i +"].Data["+ j +"].CentroidItemList["+ k +"].Value"));

					centroidItemList.add(centroidItem);
				}
				point.setCentroidItemList(centroidItemList);

				data.add(point);
			}
			metricResultItem.setData(data);

			metricResultList.add(metricResultItem);
		}
		queryApiDurationDistributionResponse.setMetricResultList(metricResultList);
	 
	 	return queryApiDurationDistributionResponse;
	}
}