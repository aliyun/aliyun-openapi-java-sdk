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

package com.aliyuncs.httpdns.transform.v20160201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.httpdns.model.v20160201.GetResolveStatisticsResponse;
import com.aliyuncs.httpdns.model.v20160201.GetResolveStatisticsResponse.DataPoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResolveStatisticsResponseUnmarshaller {

	public static GetResolveStatisticsResponse unmarshall(GetResolveStatisticsResponse getResolveStatisticsResponse, UnmarshallerContext context) {
		
		getResolveStatisticsResponse.setRequestId(context.stringValue("GetResolveStatisticsResponse.RequestId"));

		List<DataPoint> dataPoints = new ArrayList<DataPoint>();
		for (int i = 0; i < context.lengthValue("GetResolveStatisticsResponse.DataPoints.Length"); i++) {
			DataPoint dataPoint = new DataPoint();
			dataPoint.setTime(context.integerValue("GetResolveStatisticsResponse.DataPoints["+ i +"].Time"));
			dataPoint.setCount(context.integerValue("GetResolveStatisticsResponse.DataPoints["+ i +"].Count"));

			dataPoints.add(dataPoint);
		}
		getResolveStatisticsResponse.setDataPoints(dataPoints);
	 
	 	return getResolveStatisticsResponse;
	}
}