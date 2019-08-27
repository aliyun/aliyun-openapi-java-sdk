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

import com.aliyuncs.emr.model.v20160408.ListFlowResponse;
import com.aliyuncs.emr.model.v20160408.ListFlowResponse.FlowItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowResponseUnmarshaller {

	public static ListFlowResponse unmarshall(ListFlowResponse listFlowResponse, UnmarshallerContext _ctx) {
		
		listFlowResponse.setRequestId(_ctx.stringValue("ListFlowResponse.RequestId"));
		listFlowResponse.setPageNumber(_ctx.integerValue("ListFlowResponse.PageNumber"));
		listFlowResponse.setPageSize(_ctx.integerValue("ListFlowResponse.PageSize"));
		listFlowResponse.setTotal(_ctx.integerValue("ListFlowResponse.Total"));

		List<FlowItem> flow = new ArrayList<FlowItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowResponse.Flow.Length"); i++) {
			FlowItem flowItem = new FlowItem();
			flowItem.setId(_ctx.stringValue("ListFlowResponse.Flow["+ i +"].Id"));
			flowItem.setGmtCreate(_ctx.longValue("ListFlowResponse.Flow["+ i +"].GmtCreate"));
			flowItem.setGmtModified(_ctx.longValue("ListFlowResponse.Flow["+ i +"].GmtModified"));
			flowItem.setName(_ctx.stringValue("ListFlowResponse.Flow["+ i +"].Name"));
			flowItem.setDescription(_ctx.stringValue("ListFlowResponse.Flow["+ i +"].Description"));
			flowItem.setType(_ctx.stringValue("ListFlowResponse.Flow["+ i +"].Type"));
			flowItem.setStatus(_ctx.stringValue("ListFlowResponse.Flow["+ i +"].Status"));
			flowItem.setPeriodic(_ctx.booleanValue("ListFlowResponse.Flow["+ i +"].Periodic"));
			flowItem.setStartSchedule(_ctx.longValue("ListFlowResponse.Flow["+ i +"].StartSchedule"));
			flowItem.setEndSchedule(_ctx.longValue("ListFlowResponse.Flow["+ i +"].EndSchedule"));
			flowItem.setCronExpr(_ctx.stringValue("ListFlowResponse.Flow["+ i +"].CronExpr"));
			flowItem.setCreateCluster(_ctx.booleanValue("ListFlowResponse.Flow["+ i +"].CreateCluster"));
			flowItem.setClusterId(_ctx.stringValue("ListFlowResponse.Flow["+ i +"].ClusterId"));
			flowItem.setProjectId(_ctx.stringValue("ListFlowResponse.Flow["+ i +"].ProjectId"));
			flowItem.setHostName(_ctx.stringValue("ListFlowResponse.Flow["+ i +"].HostName"));
			flowItem.setGraph(_ctx.stringValue("ListFlowResponse.Flow["+ i +"].Graph"));
			flowItem.setAlertUserGroupBizId(_ctx.stringValue("ListFlowResponse.Flow["+ i +"].AlertUserGroupBizId"));
			flowItem.setAlertDingDingGroupBizId(_ctx.stringValue("ListFlowResponse.Flow["+ i +"].AlertDingDingGroupBizId"));
			flowItem.setAlertConf(_ctx.stringValue("ListFlowResponse.Flow["+ i +"].AlertConf"));
			flowItem.setCategoryId(_ctx.stringValue("ListFlowResponse.Flow["+ i +"].CategoryId"));

			flow.add(flowItem);
		}
		listFlowResponse.setFlow(flow);
	 
	 	return listFlowResponse;
	}
}