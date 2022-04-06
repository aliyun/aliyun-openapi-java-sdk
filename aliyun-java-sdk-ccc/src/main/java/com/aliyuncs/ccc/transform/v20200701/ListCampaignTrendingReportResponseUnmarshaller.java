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

import com.aliyuncs.ccc.model.v20200701.ListCampaignTrendingReportResponse;
import com.aliyuncs.ccc.model.v20200701.ListCampaignTrendingReportResponse.TrendingList;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCampaignTrendingReportResponseUnmarshaller {

	public static ListCampaignTrendingReportResponse unmarshall(ListCampaignTrendingReportResponse listCampaignTrendingReportResponse, UnmarshallerContext _ctx) {
		
		listCampaignTrendingReportResponse.setRequestId(_ctx.stringValue("ListCampaignTrendingReportResponse.RequestId"));
		listCampaignTrendingReportResponse.setCode(_ctx.stringValue("ListCampaignTrendingReportResponse.Code"));
		listCampaignTrendingReportResponse.setHttpStatusCode(_ctx.integerValue("ListCampaignTrendingReportResponse.HttpStatusCode"));
		listCampaignTrendingReportResponse.setMessage(_ctx.stringValue("ListCampaignTrendingReportResponse.Message"));

		List<TrendingList> data = new ArrayList<TrendingList>();
		for (int i = 0; i < _ctx.lengthValue("ListCampaignTrendingReportResponse.Data.Length"); i++) {
			TrendingList trendingList = new TrendingList();
			trendingList.setDatetime(_ctx.longValue("ListCampaignTrendingReportResponse.Data["+ i +"].Datetime"));
			trendingList.setConcurrency(_ctx.longValue("ListCampaignTrendingReportResponse.Data["+ i +"].Concurrency"));
			trendingList.setTalkAgents(_ctx.longValue("ListCampaignTrendingReportResponse.Data["+ i +"].TalkAgents"));
			trendingList.setReadyAgents(_ctx.longValue("ListCampaignTrendingReportResponse.Data["+ i +"].ReadyAgents"));
			trendingList.setWorkAgents(_ctx.longValue("ListCampaignTrendingReportResponse.Data["+ i +"].WorkAgents"));
			trendingList.setLoggedInAgents(_ctx.longValue("ListCampaignTrendingReportResponse.Data["+ i +"].LoggedInAgents"));
			trendingList.setBreakAgents(_ctx.longValue("ListCampaignTrendingReportResponse.Data["+ i +"].BreakAgents"));

			data.add(trendingList);
		}
		listCampaignTrendingReportResponse.setData(data);
	 
	 	return listCampaignTrendingReportResponse;
	}
}