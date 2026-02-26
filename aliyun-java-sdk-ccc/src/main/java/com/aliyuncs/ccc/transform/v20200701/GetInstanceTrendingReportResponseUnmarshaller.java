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
import com.aliyuncs.ccc.model.v20200701.GetInstanceTrendingReportResponse.Data.OverallItem;
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
			inboundItem.setStatsTime(_ctx.longValue("GetInstanceTrendingReportResponse.Data.Inbound["+ i +"].StatsTime"));
			inboundItem.setCallsQueued(_ctx.longValue("GetInstanceTrendingReportResponse.Data.Inbound["+ i +"].CallsQueued"));
			inboundItem.setCallsAbandonedInRing(_ctx.longValue("GetInstanceTrendingReportResponse.Data.Inbound["+ i +"].CallsAbandonedInRing"));
			inboundItem.setCallsHandled(_ctx.longValue("GetInstanceTrendingReportResponse.Data.Inbound["+ i +"].CallsHandled"));
			inboundItem.setTotalCalls(_ctx.longValue("GetInstanceTrendingReportResponse.Data.Inbound["+ i +"].TotalCalls"));
			inboundItem.setCallsAbandonedInIVR(_ctx.longValue("GetInstanceTrendingReportResponse.Data.Inbound["+ i +"].CallsAbandonedInIVR"));
			inboundItem.setCallsAbandonedInQueue(_ctx.longValue("GetInstanceTrendingReportResponse.Data.Inbound["+ i +"].CallsAbandonedInQueue"));

			inbound.add(inboundItem);
		}
		data.setInbound(inbound);

		List<OutboundItem> outbound = new ArrayList<OutboundItem>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceTrendingReportResponse.Data.Outbound.Length"); i++) {
			OutboundItem outboundItem = new OutboundItem();
			outboundItem.setStatsTime(_ctx.longValue("GetInstanceTrendingReportResponse.Data.Outbound["+ i +"].StatsTime"));
			outboundItem.setCallsAnswered(_ctx.longValue("GetInstanceTrendingReportResponse.Data.Outbound["+ i +"].CallsAnswered"));
			outboundItem.setTotalCalls(_ctx.longValue("GetInstanceTrendingReportResponse.Data.Outbound["+ i +"].TotalCalls"));

			outbound.add(outboundItem);
		}
		data.setOutbound(outbound);

		List<OverallItem> overall = new ArrayList<OverallItem>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceTrendingReportResponse.Data.Overall.Length"); i++) {
			OverallItem overallItem = new OverallItem();
			overallItem.setStatsTime(_ctx.longValue("GetInstanceTrendingReportResponse.Data.Overall["+ i +"].StatsTime"));
			overallItem.setMaxLoggedInAgents(_ctx.longValue("GetInstanceTrendingReportResponse.Data.Overall["+ i +"].MaxLoggedInAgents"));

			overall.add(overallItem);
		}
		data.setOverall(overall);
		getInstanceTrendingReportResponse.setData(data);
	 
	 	return getInstanceTrendingReportResponse;
	}
}