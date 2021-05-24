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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.GetInstanceTrendingReportResponse;
import com.aliyuncs.ccc.model.v20200701.GetInstanceTrendingReportResponse.Data;
import com.aliyuncs.ccc.model.v20200701.GetInstanceTrendingReportResponse.Data.InboundItem;
import com.aliyuncs.ccc.model.v20200701.GetInstanceTrendingReportResponse.Data.OutboundItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceTrendingReportResponseUnmarshaller {

	public static GetInstanceTrendingReportResponse unmarshall(GetInstanceTrendingReportResponse getInstanceTrendingReportResponse, UnmarshallerContext _ctx) {
		
		getInstanceTrendingReportResponse.setRequestId(_ctx.stringValue("GetInstanceTrendingReportResponse.RequestId"));
		getInstanceTrendingReportResponse.setCode(_ctx.stringValue("GetInstanceTrendingReportResponse.Code"));
		getInstanceTrendingReportResponse.setHttpStatusCode(_ctx.integerValue("GetInstanceTrendingReportResponse.HttpStatusCode"));
		getInstanceTrendingReportResponse.setMessage(_ctx.stringValue("GetInstanceTrendingReportResponse.Message"));

		Data data = new Data();

		List<InboundItem> inbound = new ArrayList<InboundItem>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceTrendingReportResponse.Data.Inbound.Length"); i++) {
			InboundItem inboundItem = new InboundItem();
			inboundItem.setCallsAbandonedInIVR(_ctx.longValue("GetInstanceTrendingReportResponse.Data.Inbound["+ i +"].CallsAbandonedInIVR"));
			inboundItem.setCallsAbandonedInQueue(_ctx.longValue("GetInstanceTrendingReportResponse.Data.Inbound["+ i +"].CallsAbandonedInQueue"));
			inboundItem.setCallsAbandonedInRinging(_ctx.longValue("GetInstanceTrendingReportResponse.Data.Inbound["+ i +"].CallsAbandonedInRinging"));
			inboundItem.setCallsHandled(_ctx.longValue("GetInstanceTrendingReportResponse.Data.Inbound["+ i +"].CallsHandled"));
			inboundItem.setCallsQueued(_ctx.longValue("GetInstanceTrendingReportResponse.Data.Inbound["+ i +"].CallsQueued"));
			inboundItem.setStatsTime(_ctx.longValue("GetInstanceTrendingReportResponse.Data.Inbound["+ i +"].StatsTime"));
			inboundItem.setTotalCalls(_ctx.longValue("GetInstanceTrendingReportResponse.Data.Inbound["+ i +"].TotalCalls"));

			inbound.add(inboundItem);
		}
		data.setInbound(inbound);

		List<OutboundItem> outbound = new ArrayList<OutboundItem>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceTrendingReportResponse.Data.Outbound.Length"); i++) {
			OutboundItem outboundItem = new OutboundItem();
			outboundItem.setCallsAnswered(_ctx.longValue("GetInstanceTrendingReportResponse.Data.Outbound["+ i +"].CallsAnswered"));
			outboundItem.setStatsTime(_ctx.longValue("GetInstanceTrendingReportResponse.Data.Outbound["+ i +"].StatsTime"));
			outboundItem.setTotalCalls(_ctx.longValue("GetInstanceTrendingReportResponse.Data.Outbound["+ i +"].TotalCalls"));

			outbound.add(outboundItem);
		}
		data.setOutbound(outbound);
		getInstanceTrendingReportResponse.setData(data);
	 
	 	return getInstanceTrendingReportResponse;
	}
}