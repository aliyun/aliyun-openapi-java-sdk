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

import com.aliyuncs.ccc.model.v20200701.ListCampaignsResponse;
import com.aliyuncs.ccc.model.v20200701.ListCampaignsResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListCampaignsResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCampaignsResponseUnmarshaller {

	public static ListCampaignsResponse unmarshall(ListCampaignsResponse listCampaignsResponse, UnmarshallerContext _ctx) {
		
		listCampaignsResponse.setRequestId(_ctx.stringValue("ListCampaignsResponse.RequestId"));
		listCampaignsResponse.setMessage(_ctx.stringValue("ListCampaignsResponse.Message"));
		listCampaignsResponse.setHttpStatusCode(_ctx.longValue("ListCampaignsResponse.HttpStatusCode"));
		listCampaignsResponse.setCode(_ctx.stringValue("ListCampaignsResponse.Code"));
		listCampaignsResponse.setSuccess(_ctx.booleanValue("ListCampaignsResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.longValue("ListCampaignsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.longValue("ListCampaignsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("ListCampaignsResponse.Data.TotalCount"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCampaignsResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setActualEndTime(_ctx.longValue("ListCampaignsResponse.Data.List["+ i +"].ActualEndTime"));
			listItem.setActualStartTime(_ctx.longValue("ListCampaignsResponse.Data.List["+ i +"].ActualStartTime"));
			listItem.setCasesAborted(_ctx.longValue("ListCampaignsResponse.Data.List["+ i +"].CasesAborted"));
			listItem.setCasesUncompleted(_ctx.longValue("ListCampaignsResponse.Data.List["+ i +"].CasesUncompleted"));
			listItem.setCasesConnected(_ctx.longValue("ListCampaignsResponse.Data.List["+ i +"].CasesConnected"));
			listItem.setMaxAttemptCount(_ctx.longValue("ListCampaignsResponse.Data.List["+ i +"].MaxAttemptCount"));
			listItem.setMinAttemptInterval(_ctx.longValue("ListCampaignsResponse.Data.List["+ i +"].MinAttemptInterval"));
			listItem.setName(_ctx.stringValue("ListCampaignsResponse.Data.List["+ i +"].Name"));
			listItem.setPlanedEndTime(_ctx.longValue("ListCampaignsResponse.Data.List["+ i +"].PlanedEndTime"));
			listItem.setPlanedStartTime(_ctx.longValue("ListCampaignsResponse.Data.List["+ i +"].PlanedStartTime"));
			listItem.setQueueName(_ctx.stringValue("ListCampaignsResponse.Data.List["+ i +"].QueueName"));
			listItem.setTotalCases(_ctx.longValue("ListCampaignsResponse.Data.List["+ i +"].TotalCases"));
			listItem.setState(_ctx.stringValue("ListCampaignsResponse.Data.List["+ i +"].State"));
			listItem.setCampaignId(_ctx.stringValue("ListCampaignsResponse.Data.List["+ i +"].CampaignId"));
			listItem.setStrategyType(_ctx.stringValue("ListCampaignsResponse.Data.List["+ i +"].StrategyType"));
			listItem.setStrategyParameters(_ctx.stringValue("ListCampaignsResponse.Data.List["+ i +"].StrategyParameters"));
			listItem.setQueueId(_ctx.stringValue("ListCampaignsResponse.Data.List["+ i +"].QueueId"));
			listItem.setSimulation(_ctx.booleanValue("ListCampaignsResponse.Data.List["+ i +"].Simulation"));
			listItem.setCompletionRate(_ctx.floatValue("ListCampaignsResponse.Data.List["+ i +"].CompletionRate"));
			listItem.setContactFlowId(_ctx.stringValue("ListCampaignsResponse.Data.List["+ i +"].ContactFlowId"));

			list.add(listItem);
		}
		data.setList(list);
		listCampaignsResponse.setData(data);
	 
	 	return listCampaignsResponse;
	}
}