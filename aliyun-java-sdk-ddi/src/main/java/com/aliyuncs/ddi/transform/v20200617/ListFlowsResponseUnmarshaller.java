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

package com.aliyuncs.ddi.transform.v20200617;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddi.model.v20200617.ListFlowsResponse;
import com.aliyuncs.ddi.model.v20200617.ListFlowsResponse.FlowItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowsResponseUnmarshaller {

	public static ListFlowsResponse unmarshall(ListFlowsResponse listFlowsResponse, UnmarshallerContext _ctx) {
		
		listFlowsResponse.setRequestId(_ctx.stringValue("ListFlowsResponse.RequestId"));
		listFlowsResponse.setPageNumber(_ctx.integerValue("ListFlowsResponse.PageNumber"));
		listFlowsResponse.setPageSize(_ctx.integerValue("ListFlowsResponse.PageSize"));
		listFlowsResponse.setTotal(_ctx.integerValue("ListFlowsResponse.Total"));

		List<FlowItem> flow = new ArrayList<FlowItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowsResponse.Flow.Length"); i++) {
			FlowItem flowItem = new FlowItem();
			flowItem.setAlertConf(_ctx.stringValue("ListFlowsResponse.Flow["+ i +"].AlertConf"));
			flowItem.setAlertDingDingGroupBizId(_ctx.stringValue("ListFlowsResponse.Flow["+ i +"].AlertDingDingGroupBizId"));
			flowItem.setAlertUserGroupBizId(_ctx.stringValue("ListFlowsResponse.Flow["+ i +"].AlertUserGroupBizId"));
			flowItem.setCategoryId(_ctx.stringValue("ListFlowsResponse.Flow["+ i +"].CategoryId"));
			flowItem.setClusterId(_ctx.stringValue("ListFlowsResponse.Flow["+ i +"].ClusterId"));
			flowItem.setCreateCluster(_ctx.booleanValue("ListFlowsResponse.Flow["+ i +"].CreateCluster"));
			flowItem.setCronExpr(_ctx.stringValue("ListFlowsResponse.Flow["+ i +"].CronExpr"));
			flowItem.setDescription(_ctx.stringValue("ListFlowsResponse.Flow["+ i +"].Description"));
			flowItem.setEndSchedule(_ctx.longValue("ListFlowsResponse.Flow["+ i +"].EndSchedule"));
			flowItem.setGmtCreate(_ctx.longValue("ListFlowsResponse.Flow["+ i +"].GmtCreate"));
			flowItem.setGmtModified(_ctx.longValue("ListFlowsResponse.Flow["+ i +"].GmtModified"));
			flowItem.setGraph(_ctx.stringValue("ListFlowsResponse.Flow["+ i +"].Graph"));
			flowItem.setHostName(_ctx.stringValue("ListFlowsResponse.Flow["+ i +"].HostName"));
			flowItem.setId(_ctx.stringValue("ListFlowsResponse.Flow["+ i +"].Id"));
			flowItem.setName(_ctx.stringValue("ListFlowsResponse.Flow["+ i +"].Name"));
			flowItem.setPeriodic(_ctx.booleanValue("ListFlowsResponse.Flow["+ i +"].Periodic"));
			flowItem.setProjectId(_ctx.stringValue("ListFlowsResponse.Flow["+ i +"].ProjectId"));
			flowItem.setStartSchedule(_ctx.longValue("ListFlowsResponse.Flow["+ i +"].StartSchedule"));
			flowItem.setStatus(_ctx.stringValue("ListFlowsResponse.Flow["+ i +"].Status"));
			flowItem.setType(_ctx.stringValue("ListFlowsResponse.Flow["+ i +"].Type"));

			flow.add(flowItem);
		}
		listFlowsResponse.setFlow(flow);
	 
	 	return listFlowsResponse;
	}
}