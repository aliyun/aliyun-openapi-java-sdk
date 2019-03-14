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

	public static ListFlowResponse unmarshall(ListFlowResponse listFlowResponse, UnmarshallerContext context) {
		
		listFlowResponse.setRequestId(context.stringValue("ListFlowResponse.RequestId"));
		listFlowResponse.setPageNumber(context.integerValue("ListFlowResponse.PageNumber"));
		listFlowResponse.setPageSize(context.integerValue("ListFlowResponse.PageSize"));
		listFlowResponse.setTotal(context.integerValue("ListFlowResponse.Total"));

		List<FlowItem> flow = new ArrayList<FlowItem>();
		for (int i = 0; i < context.lengthValue("ListFlowResponse.Flow.Length"); i++) {
			FlowItem flowItem = new FlowItem();
			flowItem.setId(context.stringValue("ListFlowResponse.Flow["+ i +"].Id"));
			flowItem.setGmtCreate(context.longValue("ListFlowResponse.Flow["+ i +"].GmtCreate"));
			flowItem.setGmtModified(context.longValue("ListFlowResponse.Flow["+ i +"].GmtModified"));
			flowItem.setName(context.stringValue("ListFlowResponse.Flow["+ i +"].Name"));
			flowItem.setDescription(context.stringValue("ListFlowResponse.Flow["+ i +"].Description"));
			flowItem.setType(context.stringValue("ListFlowResponse.Flow["+ i +"].Type"));
			flowItem.setStatus(context.stringValue("ListFlowResponse.Flow["+ i +"].Status"));
			flowItem.setPeriodic(context.booleanValue("ListFlowResponse.Flow["+ i +"].Periodic"));
			flowItem.setStartSchedule(context.longValue("ListFlowResponse.Flow["+ i +"].StartSchedule"));
			flowItem.setEndSchedule(context.longValue("ListFlowResponse.Flow["+ i +"].EndSchedule"));
			flowItem.setCronExpr(context.stringValue("ListFlowResponse.Flow["+ i +"].CronExpr"));
			flowItem.setCreateCluster(context.booleanValue("ListFlowResponse.Flow["+ i +"].CreateCluster"));
			flowItem.setClusterId(context.stringValue("ListFlowResponse.Flow["+ i +"].ClusterId"));
			flowItem.setProjectId(context.stringValue("ListFlowResponse.Flow["+ i +"].ProjectId"));
			flowItem.setHostName(context.stringValue("ListFlowResponse.Flow["+ i +"].HostName"));
			flowItem.setGraph(context.stringValue("ListFlowResponse.Flow["+ i +"].Graph"));
			flowItem.setAlertUserGroupBizId(context.stringValue("ListFlowResponse.Flow["+ i +"].AlertUserGroupBizId"));
			flowItem.setAlertDingDingGroupBizId(context.stringValue("ListFlowResponse.Flow["+ i +"].AlertDingDingGroupBizId"));
			flowItem.setAlertConf(context.stringValue("ListFlowResponse.Flow["+ i +"].AlertConf"));
			flowItem.setCategoryId(context.stringValue("ListFlowResponse.Flow["+ i +"].CategoryId"));

			flow.add(flowItem);
		}
		listFlowResponse.setFlow(flow);
	 
	 	return listFlowResponse;
	}
}