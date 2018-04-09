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

import com.aliyuncs.emr.model.v20160408.QueryMetricDataResponse;
import com.aliyuncs.emr.model.v20160408.QueryMetricDataResponse.CmsDataPoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMetricDataResponseUnmarshaller {

	public static QueryMetricDataResponse unmarshall(QueryMetricDataResponse queryMetricDataResponse, UnmarshallerContext context) {
		
		queryMetricDataResponse.setRequestId(context.stringValue("QueryMetricDataResponse.RequestId"));

		List<CmsDataPoint> datapoints = new ArrayList<CmsDataPoint>();
		for (int i = 0; i < context.lengthValue("QueryMetricDataResponse.Datapoints.Length"); i++) {
			CmsDataPoint cmsDataPoint = new CmsDataPoint();
			cmsDataPoint.setRole(context.stringValue("QueryMetricDataResponse.Datapoints["+ i +"].Role"));
			cmsDataPoint.setMaximum(context.floatValue("QueryMetricDataResponse.Datapoints["+ i +"].Maximum"));
			cmsDataPoint.setMinimum(context.floatValue("QueryMetricDataResponse.Datapoints["+ i +"].Minimum"));
			cmsDataPoint.setAverage(context.floatValue("QueryMetricDataResponse.Datapoints["+ i +"].Average"));
			cmsDataPoint.setTimestamp(context.longValue("QueryMetricDataResponse.Datapoints["+ i +"].Timestamp"));

			datapoints.add(cmsDataPoint);
		}
		queryMetricDataResponse.setDatapoints(datapoints);
	 
	 	return queryMetricDataResponse;
	}
}