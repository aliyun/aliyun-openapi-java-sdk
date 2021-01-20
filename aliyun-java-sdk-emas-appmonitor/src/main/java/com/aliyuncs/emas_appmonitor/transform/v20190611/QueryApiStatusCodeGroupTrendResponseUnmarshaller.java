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

import com.aliyuncs.emas_appmonitor.model.v20190611.QueryApiStatusCodeGroupTrendResponse;
import com.aliyuncs.emas_appmonitor.model.v20190611.QueryApiStatusCodeGroupTrendResponse.MetricResultItem;
import com.aliyuncs.emas_appmonitor.model.v20190611.QueryApiStatusCodeGroupTrendResponse.MetricResultItem.Point;
import com.aliyuncs.emas_appmonitor.model.v20190611.QueryApiStatusCodeGroupTrendResponse.MetricResultItem.Point.PointData;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryApiStatusCodeGroupTrendResponseUnmarshaller {

	public static QueryApiStatusCodeGroupTrendResponse unmarshall(QueryApiStatusCodeGroupTrendResponse queryApiStatusCodeGroupTrendResponse, UnmarshallerContext _ctx) {
		
		queryApiStatusCodeGroupTrendResponse.setRequestId(_ctx.stringValue("QueryApiStatusCodeGroupTrendResponse.RequestId"));

		List<MetricResultItem> metricResultList = new ArrayList<MetricResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryApiStatusCodeGroupTrendResponse.MetricResultList.Length"); i++) {
			MetricResultItem metricResultItem = new MetricResultItem();
			metricResultItem.setTags(_ctx.mapValue("QueryApiStatusCodeGroupTrendResponse.MetricResultList["+ i +"].Tags"));

			List<Point> data = new ArrayList<Point>();
			for (int j = 0; j < _ctx.lengthValue("QueryApiStatusCodeGroupTrendResponse.MetricResultList["+ i +"].Data.Length"); j++) {
				Point point = new Point();
				point.setTime(_ctx.longValue("QueryApiStatusCodeGroupTrendResponse.MetricResultList["+ i +"].Data["+ j +"].Time"));

				PointData pointData = new PointData();
				pointData.setStatus4xxCount(_ctx.longValue("QueryApiStatusCodeGroupTrendResponse.MetricResultList["+ i +"].Data["+ j +"].PointData.Status4xxCount"));
				pointData.setStatus4xxRatio(_ctx.floatValue("QueryApiStatusCodeGroupTrendResponse.MetricResultList["+ i +"].Data["+ j +"].PointData.Status4xxRatio"));
				pointData.setStatus5xxCount(_ctx.longValue("QueryApiStatusCodeGroupTrendResponse.MetricResultList["+ i +"].Data["+ j +"].PointData.Status5xxCount"));
				pointData.setStatus5xxRatio(_ctx.floatValue("QueryApiStatusCodeGroupTrendResponse.MetricResultList["+ i +"].Data["+ j +"].PointData.Status5xxRatio"));
				pointData.setStatusNormalCount(_ctx.longValue("QueryApiStatusCodeGroupTrendResponse.MetricResultList["+ i +"].Data["+ j +"].PointData.StatusNormalCount"));
				pointData.setStatusNormalRatio(_ctx.floatValue("QueryApiStatusCodeGroupTrendResponse.MetricResultList["+ i +"].Data["+ j +"].PointData.StatusNormalRatio"));
				point.setPointData(pointData);

				data.add(point);
			}
			metricResultItem.setData(data);

			metricResultList.add(metricResultItem);
		}
		queryApiStatusCodeGroupTrendResponse.setMetricResultList(metricResultList);
	 
	 	return queryApiStatusCodeGroupTrendResponse;
	}
}