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

package com.aliyuncs.nis.transform.v20211216;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nis.model.v20211216.GetNisNetworkMetricsResponse;
import com.aliyuncs.nis.model.v20211216.GetNisNetworkMetricsResponse.Data;
import com.aliyuncs.nis.model.v20211216.GetNisNetworkMetricsResponse.Data.MetricsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNisNetworkMetricsResponseUnmarshaller {

	public static GetNisNetworkMetricsResponse unmarshall(GetNisNetworkMetricsResponse getNisNetworkMetricsResponse, UnmarshallerContext _ctx) {
		
		getNisNetworkMetricsResponse.setRequestId(_ctx.stringValue("GetNisNetworkMetricsResponse.RequestId"));

		Data data = new Data();
		data.setUnit(_ctx.stringValue("GetNisNetworkMetricsResponse.Data.Unit"));

		List<MetricsItem> metrics = new ArrayList<MetricsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetNisNetworkMetricsResponse.Data.Metrics.Length"); i++) {
			MetricsItem metricsItem = new MetricsItem();
			metricsItem.setTimeStamp(_ctx.longValue("GetNisNetworkMetricsResponse.Data.Metrics["+ i +"].TimeStamp"));
			metricsItem.setValue(_ctx.doubleValue("GetNisNetworkMetricsResponse.Data.Metrics["+ i +"].Value"));

			metrics.add(metricsItem);
		}
		data.setMetrics(metrics);
		getNisNetworkMetricsResponse.setData(data);
	 
	 	return getNisNetworkMetricsResponse;
	}
}