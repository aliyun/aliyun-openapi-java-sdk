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

package com.aliyuncs.csas.transform.v20230120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csas.model.v20230120.ListPopTrafficStatisticsResponse;
import com.aliyuncs.csas.model.v20230120.ListPopTrafficStatisticsResponse.Data;
import com.aliyuncs.csas.model.v20230120.ListPopTrafficStatisticsResponse.Data.Point;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPopTrafficStatisticsResponseUnmarshaller {

	public static ListPopTrafficStatisticsResponse unmarshall(ListPopTrafficStatisticsResponse listPopTrafficStatisticsResponse, UnmarshallerContext _ctx) {
		
		listPopTrafficStatisticsResponse.setRequestId(_ctx.stringValue("ListPopTrafficStatisticsResponse.RequestId"));

		List<Data> trafficData = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListPopTrafficStatisticsResponse.TrafficData.Length"); i++) {
			Data data = new Data();
			data.setMetricName(_ctx.stringValue("ListPopTrafficStatisticsResponse.TrafficData["+ i +"].MetricName"));

			List<Point> datapoints = new ArrayList<Point>();
			for (int j = 0; j < _ctx.lengthValue("ListPopTrafficStatisticsResponse.TrafficData["+ i +"].Datapoints.Length"); j++) {
				Point point = new Point();
				point.setDateTime(_ctx.stringValue("ListPopTrafficStatisticsResponse.TrafficData["+ i +"].Datapoints["+ j +"].DateTime"));
				point.setAverage(_ctx.doubleValue("ListPopTrafficStatisticsResponse.TrafficData["+ i +"].Datapoints["+ j +"].Average"));

				datapoints.add(point);
			}
			data.setDatapoints(datapoints);

			trafficData.add(data);
		}
		listPopTrafficStatisticsResponse.setTrafficData(trafficData);
	 
	 	return listPopTrafficStatisticsResponse;
	}
}