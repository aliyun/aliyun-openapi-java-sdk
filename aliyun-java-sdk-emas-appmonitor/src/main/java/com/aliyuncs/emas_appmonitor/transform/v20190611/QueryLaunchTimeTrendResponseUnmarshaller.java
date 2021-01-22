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

import com.aliyuncs.emas_appmonitor.model.v20190611.QueryLaunchTimeTrendResponse;
import com.aliyuncs.emas_appmonitor.model.v20190611.QueryLaunchTimeTrendResponse.MetricResultItem;
import com.aliyuncs.emas_appmonitor.model.v20190611.QueryLaunchTimeTrendResponse.MetricResultItem.Point;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLaunchTimeTrendResponseUnmarshaller {

	public static QueryLaunchTimeTrendResponse unmarshall(QueryLaunchTimeTrendResponse queryLaunchTimeTrendResponse, UnmarshallerContext _ctx) {
		
		queryLaunchTimeTrendResponse.setRequestId(_ctx.stringValue("QueryLaunchTimeTrendResponse.RequestId"));

		List<MetricResultItem> metricResultList = new ArrayList<MetricResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLaunchTimeTrendResponse.MetricResultList.Length"); i++) {
			MetricResultItem metricResultItem = new MetricResultItem();
			metricResultItem.setTags(_ctx.mapValue("QueryLaunchTimeTrendResponse.MetricResultList["+ i +"].Tags"));

			List<Point> data = new ArrayList<Point>();
			for (int j = 0; j < _ctx.lengthValue("QueryLaunchTimeTrendResponse.MetricResultList["+ i +"].Data.Length"); j++) {
				Point point = new Point();
				point.setData(_ctx.floatValue("QueryLaunchTimeTrendResponse.MetricResultList["+ i +"].Data["+ j +"].Data"));
				point.setTime(_ctx.longValue("QueryLaunchTimeTrendResponse.MetricResultList["+ i +"].Data["+ j +"].Time"));

				data.add(point);
			}
			metricResultItem.setData(data);

			metricResultList.add(metricResultItem);
		}
		queryLaunchTimeTrendResponse.setMetricResultList(metricResultList);
	 
	 	return queryLaunchTimeTrendResponse;
	}
}