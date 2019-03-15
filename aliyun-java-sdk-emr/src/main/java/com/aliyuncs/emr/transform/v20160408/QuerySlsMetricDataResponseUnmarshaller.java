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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.QuerySlsMetricDataResponse;
import com.aliyuncs.emr.model.v20160408.QuerySlsMetricDataResponse.SlsDataPoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySlsMetricDataResponseUnmarshaller {

	public static QuerySlsMetricDataResponse unmarshall(QuerySlsMetricDataResponse querySlsMetricDataResponse, UnmarshallerContext context) {
		
		querySlsMetricDataResponse.setRequestId(context.stringValue("QuerySlsMetricDataResponse.RequestId"));

		List<SlsDataPoint> datapoints = new ArrayList<SlsDataPoint>();
		for (int i = 0; i < context.lengthValue("QuerySlsMetricDataResponse.Datapoints.Length"); i++) {
			SlsDataPoint slsDataPoint = new SlsDataPoint();
			slsDataPoint.setRole(context.stringValue("QuerySlsMetricDataResponse.Datapoints["+ i +"].Role"));
			slsDataPoint.setValue(context.stringValue("QuerySlsMetricDataResponse.Datapoints["+ i +"].Value"));
			slsDataPoint.setTimestamp(context.longValue("QuerySlsMetricDataResponse.Datapoints["+ i +"].Timestamp"));

			datapoints.add(slsDataPoint);
		}
		querySlsMetricDataResponse.setDatapoints(datapoints);
	 
	 	return querySlsMetricDataResponse;
	}
}