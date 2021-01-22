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

import com.aliyuncs.emas_appmonitor.model.v20190611.QueryApiErrorGroupTrendResponse;
import com.aliyuncs.emas_appmonitor.model.v20190611.QueryApiErrorGroupTrendResponse.MetricResultItem;
import com.aliyuncs.emas_appmonitor.model.v20190611.QueryApiErrorGroupTrendResponse.MetricResultItem.Point;
import com.aliyuncs.emas_appmonitor.model.v20190611.QueryApiErrorGroupTrendResponse.MetricResultItem.Point.ErrorInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryApiErrorGroupTrendResponseUnmarshaller {

	public static QueryApiErrorGroupTrendResponse unmarshall(QueryApiErrorGroupTrendResponse queryApiErrorGroupTrendResponse, UnmarshallerContext _ctx) {
		
		queryApiErrorGroupTrendResponse.setRequestId(_ctx.stringValue("QueryApiErrorGroupTrendResponse.RequestId"));

		List<MetricResultItem> metricResultList = new ArrayList<MetricResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryApiErrorGroupTrendResponse.MetricResultList.Length"); i++) {
			MetricResultItem metricResultItem = new MetricResultItem();
			metricResultItem.setTags(_ctx.mapValue("QueryApiErrorGroupTrendResponse.MetricResultList["+ i +"].Tags"));

			List<Point> data = new ArrayList<Point>();
			for (int j = 0; j < _ctx.lengthValue("QueryApiErrorGroupTrendResponse.MetricResultList["+ i +"].Data.Length"); j++) {
				Point point = new Point();
				point.setTime(_ctx.longValue("QueryApiErrorGroupTrendResponse.MetricResultList["+ i +"].Data["+ j +"].Time"));

				ErrorInfo errorInfo = new ErrorInfo();
				errorInfo.setErrorCount(_ctx.longValue("QueryApiErrorGroupTrendResponse.MetricResultList["+ i +"].Data["+ j +"].ErrorInfo.ErrorCount"));
				errorInfo.setErrorRatio(_ctx.floatValue("QueryApiErrorGroupTrendResponse.MetricResultList["+ i +"].Data["+ j +"].ErrorInfo.ErrorRatio"));
				point.setErrorInfo(errorInfo);

				data.add(point);
			}
			metricResultItem.setData(data);

			metricResultList.add(metricResultItem);
		}
		queryApiErrorGroupTrendResponse.setMetricResultList(metricResultList);
	 
	 	return queryApiErrorGroupTrendResponse;
	}
}