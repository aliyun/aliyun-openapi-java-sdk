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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetDWSSubsPartitionsResponse;
import com.aliyuncs.sofa.model.v20190815.GetDWSSubsPartitionsResponse.Data;
import com.aliyuncs.sofa.model.v20190815.GetDWSSubsPartitionsResponse.Data.MetricsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDWSSubsPartitionsResponseUnmarshaller {

	public static GetDWSSubsPartitionsResponse unmarshall(GetDWSSubsPartitionsResponse getDWSSubsPartitionsResponse, UnmarshallerContext _ctx) {
		
		getDWSSubsPartitionsResponse.setRequestId(_ctx.stringValue("GetDWSSubsPartitionsResponse.RequestId"));
		getDWSSubsPartitionsResponse.setResultCode(_ctx.stringValue("GetDWSSubsPartitionsResponse.ResultCode"));
		getDWSSubsPartitionsResponse.setResultMessage(_ctx.stringValue("GetDWSSubsPartitionsResponse.ResultMessage"));

		Data data = new Data();
		data.setConsumer(_ctx.stringValue("GetDWSSubsPartitionsResponse.Data.Consumer"));
		data.setGroup(_ctx.stringValue("GetDWSSubsPartitionsResponse.Data.Group"));
		data.setId(_ctx.longValue("GetDWSSubsPartitionsResponse.Data.Id"));
		data.setName(_ctx.stringValue("GetDWSSubsPartitionsResponse.Data.Name"));
		data.setPartition(_ctx.longValue("GetDWSSubsPartitionsResponse.Data.Partition"));
		data.setTableId(_ctx.stringValue("GetDWSSubsPartitionsResponse.Data.TableId"));

		List<MetricsItem> metrics = new ArrayList<MetricsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDWSSubsPartitionsResponse.Data.Metrics.Length"); i++) {
			MetricsItem metricsItem = new MetricsItem();
			metricsItem.setClientAckTime(_ctx.stringValue("GetDWSSubsPartitionsResponse.Data.Metrics["+ i +"].ClientAckTime"));
			metricsItem.setClientAssignedQueueSize(_ctx.longValue("GetDWSSubsPartitionsResponse.Data.Metrics["+ i +"].ClientAssignedQueueSize"));
			metricsItem.setClientIp(_ctx.stringValue("GetDWSSubsPartitionsResponse.Data.Metrics["+ i +"].ClientIp"));
			metricsItem.setClientLastNotifiedSize(_ctx.longValue("GetDWSSubsPartitionsResponse.Data.Metrics["+ i +"].ClientLastNotifiedSize"));
			metricsItem.setClientRealQueueSize(_ctx.longValue("GetDWSSubsPartitionsResponse.Data.Metrics["+ i +"].ClientRealQueueSize"));
			metricsItem.setConsumptionLatency(_ctx.longValue("GetDWSSubsPartitionsResponse.Data.Metrics["+ i +"].ConsumptionLatency"));
			metricsItem.setConsumptionRps(_ctx.longValue("GetDWSSubsPartitionsResponse.Data.Metrics["+ i +"].ConsumptionRps"));
			metricsItem.setDailyConsumedRecords(_ctx.longValue("GetDWSSubsPartitionsResponse.Data.Metrics["+ i +"].DailyConsumedRecords"));
			metricsItem.setPartition(_ctx.stringValue("GetDWSSubsPartitionsResponse.Data.Metrics["+ i +"].Partition"));
			metricsItem.setSampleTime(_ctx.stringValue("GetDWSSubsPartitionsResponse.Data.Metrics["+ i +"].SampleTime"));
			metricsItem.setStoreLatency(_ctx.longValue("GetDWSSubsPartitionsResponse.Data.Metrics["+ i +"].StoreLatency"));
			metricsItem.setStoreName(_ctx.stringValue("GetDWSSubsPartitionsResponse.Data.Metrics["+ i +"].StoreName"));
			metricsItem.setStoreSendTime(_ctx.stringValue("GetDWSSubsPartitionsResponse.Data.Metrics["+ i +"].StoreSendTime"));

			metrics.add(metricsItem);
		}
		data.setMetrics(metrics);
		getDWSSubsPartitionsResponse.setData(data);
	 
	 	return getDWSSubsPartitionsResponse;
	}
}