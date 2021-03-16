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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryDetailMetricResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryDetailMetricResponse.DetailMetric;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryDetailMetricResponseUnmarshaller {

	public static OpsQueryDetailMetricResponse unmarshall(OpsQueryDetailMetricResponse opsQueryDetailMetricResponse, UnmarshallerContext _ctx) {
		
		opsQueryDetailMetricResponse.setRequestId(_ctx.stringValue("OpsQueryDetailMetricResponse.RequestId"));
		opsQueryDetailMetricResponse.setIsStack(_ctx.booleanValue("OpsQueryDetailMetricResponse.IsStack"));
		opsQueryDetailMetricResponse.setInterval(_ctx.integerValue("OpsQueryDetailMetricResponse.Interval"));
		opsQueryDetailMetricResponse.setStartTime(_ctx.stringValue("OpsQueryDetailMetricResponse.StartTime"));
		opsQueryDetailMetricResponse.setEndTime(_ctx.stringValue("OpsQueryDetailMetricResponse.EndTime"));
		opsQueryDetailMetricResponse.setMetricDescription(_ctx.stringValue("OpsQueryDetailMetricResponse.MetricDescription"));
		opsQueryDetailMetricResponse.setExceptionName(_ctx.stringValue("OpsQueryDetailMetricResponse.ExceptionName"));
		opsQueryDetailMetricResponse.setExtraInfo(_ctx.stringValue("OpsQueryDetailMetricResponse.ExtraInfo"));

		List<DetailMetric> detailMetrics = new ArrayList<DetailMetric>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryDetailMetricResponse.DetailMetrics.Length"); i++) {
			DetailMetric detailMetric = new DetailMetric();
			detailMetric.setMetricName(_ctx.stringValue("OpsQueryDetailMetricResponse.DetailMetrics["+ i +"].MetricName"));
			detailMetric.setValue(_ctx.stringValue("OpsQueryDetailMetricResponse.DetailMetrics["+ i +"].Value"));
			detailMetric.setTimestamp(_ctx.stringValue("OpsQueryDetailMetricResponse.DetailMetrics["+ i +"].Timestamp"));

			detailMetrics.add(detailMetric);
		}
		opsQueryDetailMetricResponse.setDetailMetrics(detailMetrics);
	 
	 	return opsQueryDetailMetricResponse;
	}
}