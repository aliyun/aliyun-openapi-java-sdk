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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.GetDWSSubsTaskMetricsResponse;
import com.aliyuncs.sofa.model.v20190815.GetDWSSubsTaskMetricsResponse.Data;
import com.aliyuncs.sofa.model.v20190815.GetDWSSubsTaskMetricsResponse.Data.Metric;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDWSSubsTaskMetricsResponseUnmarshaller {

	public static GetDWSSubsTaskMetricsResponse unmarshall(GetDWSSubsTaskMetricsResponse getDWSSubsTaskMetricsResponse, UnmarshallerContext _ctx) {
		
		getDWSSubsTaskMetricsResponse.setRequestId(_ctx.stringValue("GetDWSSubsTaskMetricsResponse.RequestId"));
		getDWSSubsTaskMetricsResponse.setResultCode(_ctx.stringValue("GetDWSSubsTaskMetricsResponse.ResultCode"));
		getDWSSubsTaskMetricsResponse.setResultMessage(_ctx.stringValue("GetDWSSubsTaskMetricsResponse.ResultMessage"));

		Data data = new Data();
		data.setConsumer(_ctx.stringValue("GetDWSSubsTaskMetricsResponse.Data.Consumer"));
		data.setGroup(_ctx.stringValue("GetDWSSubsTaskMetricsResponse.Data.Group"));
		data.setId(_ctx.longValue("GetDWSSubsTaskMetricsResponse.Data.Id"));
		data.setName(_ctx.stringValue("GetDWSSubsTaskMetricsResponse.Data.Name"));
		data.setTableId(_ctx.stringValue("GetDWSSubsTaskMetricsResponse.Data.TableId"));

		Metric metric = new Metric();
		metric.setConsumptionLatency(_ctx.longValue("GetDWSSubsTaskMetricsResponse.Data.Metric.ConsumptionLatency"));
		metric.setConsumptionRps(_ctx.longValue("GetDWSSubsTaskMetricsResponse.Data.Metric.ConsumptionRps"));
		metric.setDailyConsumedRecords(_ctx.longValue("GetDWSSubsTaskMetricsResponse.Data.Metric.DailyConsumedRecords"));
		metric.setSampleTime(_ctx.stringValue("GetDWSSubsTaskMetricsResponse.Data.Metric.SampleTime"));
		metric.setSlowestPartition(_ctx.stringValue("GetDWSSubsTaskMetricsResponse.Data.Metric.SlowestPartition"));
		data.setMetric(metric);
		getDWSSubsTaskMetricsResponse.setData(data);
	 
	 	return getDWSSubsTaskMetricsResponse;
	}
}