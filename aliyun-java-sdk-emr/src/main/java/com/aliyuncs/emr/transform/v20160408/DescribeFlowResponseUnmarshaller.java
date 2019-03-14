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

import com.aliyuncs.emr.model.v20160408.DescribeFlowResponse;
import com.aliyuncs.emr.model.v20160408.DescribeFlowResponse.ParentFlow;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFlowResponseUnmarshaller {

	public static DescribeFlowResponse unmarshall(DescribeFlowResponse describeFlowResponse, UnmarshallerContext context) {
		
		describeFlowResponse.setRequestId(context.stringValue("DescribeFlowResponse.RequestId"));
		describeFlowResponse.setId(context.stringValue("DescribeFlowResponse.Id"));
		describeFlowResponse.setGmtCreate(context.longValue("DescribeFlowResponse.GmtCreate"));
		describeFlowResponse.setGmtModified(context.longValue("DescribeFlowResponse.GmtModified"));
		describeFlowResponse.setName(context.stringValue("DescribeFlowResponse.Name"));
		describeFlowResponse.setDescription(context.stringValue("DescribeFlowResponse.Description"));
		describeFlowResponse.setType(context.stringValue("DescribeFlowResponse.Type"));
		describeFlowResponse.setStatus(context.stringValue("DescribeFlowResponse.Status"));
		describeFlowResponse.setPeriodic(context.booleanValue("DescribeFlowResponse.Periodic"));
		describeFlowResponse.setStartSchedule(context.longValue("DescribeFlowResponse.StartSchedule"));
		describeFlowResponse.setEndSchedule(context.longValue("DescribeFlowResponse.EndSchedule"));
		describeFlowResponse.setCronExpr(context.stringValue("DescribeFlowResponse.CronExpr"));
		describeFlowResponse.setCreateCluster(context.booleanValue("DescribeFlowResponse.CreateCluster"));
		describeFlowResponse.setClusterId(context.stringValue("DescribeFlowResponse.ClusterId"));
		describeFlowResponse.setHostName(context.stringValue("DescribeFlowResponse.HostName"));
		describeFlowResponse.setGraph(context.stringValue("DescribeFlowResponse.Graph"));
		describeFlowResponse.setCategoryId(context.stringValue("DescribeFlowResponse.CategoryId"));
		describeFlowResponse.setAlertConf(context.stringValue("DescribeFlowResponse.AlertConf"));
		describeFlowResponse.setAlertUserGroupBizId(context.stringValue("DescribeFlowResponse.AlertUserGroupBizId"));
		describeFlowResponse.setAlertDingDingGroupBizId(context.stringValue("DescribeFlowResponse.AlertDingDingGroupBizId"));
		describeFlowResponse.setApplication(context.stringValue("DescribeFlowResponse.Application"));

		List<ParentFlow> parentFlowList = new ArrayList<ParentFlow>();
		for (int i = 0; i < context.lengthValue("DescribeFlowResponse.ParentFlowList.Length"); i++) {
			ParentFlow parentFlow = new ParentFlow();
			parentFlow.setParentFlowId(context.stringValue("DescribeFlowResponse.ParentFlowList["+ i +"].ParentFlowId"));
			parentFlow.setParentFlowName(context.stringValue("DescribeFlowResponse.ParentFlowList["+ i +"].ParentFlowName"));
			parentFlow.setProjectId(context.stringValue("DescribeFlowResponse.ParentFlowList["+ i +"].ProjectId"));
			parentFlow.setProjectName(context.stringValue("DescribeFlowResponse.ParentFlowList["+ i +"].ProjectName"));

			parentFlowList.add(parentFlow);
		}
		describeFlowResponse.setParentFlowList(parentFlowList);
	 
	 	return describeFlowResponse;
	}
}