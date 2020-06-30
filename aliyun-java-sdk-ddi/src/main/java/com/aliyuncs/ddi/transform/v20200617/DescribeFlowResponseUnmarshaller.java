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

import com.aliyuncs.ddi.model.v20200617.DescribeFlowResponse;
import com.aliyuncs.ddi.model.v20200617.DescribeFlowResponse.ParentFlow;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFlowResponseUnmarshaller {

	public static DescribeFlowResponse unmarshall(DescribeFlowResponse describeFlowResponse, UnmarshallerContext _ctx) {
		
		describeFlowResponse.setRequestId(_ctx.stringValue("DescribeFlowResponse.RequestId"));
		describeFlowResponse.setAlertConf(_ctx.stringValue("DescribeFlowResponse.AlertConf"));
		describeFlowResponse.setAlertDingDingGroupBizId(_ctx.stringValue("DescribeFlowResponse.AlertDingDingGroupBizId"));
		describeFlowResponse.setAlertUserGroupBizId(_ctx.stringValue("DescribeFlowResponse.AlertUserGroupBizId"));
		describeFlowResponse.setApplication(_ctx.stringValue("DescribeFlowResponse.Application"));
		describeFlowResponse.setCategoryId(_ctx.stringValue("DescribeFlowResponse.CategoryId"));
		describeFlowResponse.setClusterId(_ctx.stringValue("DescribeFlowResponse.ClusterId"));
		describeFlowResponse.setCreateCluster(_ctx.booleanValue("DescribeFlowResponse.CreateCluster"));
		describeFlowResponse.setCronExpr(_ctx.stringValue("DescribeFlowResponse.CronExpr"));
		describeFlowResponse.setDescription(_ctx.stringValue("DescribeFlowResponse.Description"));
		describeFlowResponse.setEditLockDetail(_ctx.stringValue("DescribeFlowResponse.EditLockDetail"));
		describeFlowResponse.setEndSchedule(_ctx.longValue("DescribeFlowResponse.EndSchedule"));
		describeFlowResponse.setGmtCreate(_ctx.longValue("DescribeFlowResponse.GmtCreate"));
		describeFlowResponse.setGmtModified(_ctx.longValue("DescribeFlowResponse.GmtModified"));
		describeFlowResponse.setGraph(_ctx.stringValue("DescribeFlowResponse.Graph"));
		describeFlowResponse.setHostName(_ctx.stringValue("DescribeFlowResponse.HostName"));
		describeFlowResponse.setId(_ctx.stringValue("DescribeFlowResponse.Id"));
		describeFlowResponse.setName(_ctx.stringValue("DescribeFlowResponse.Name"));
		describeFlowResponse.setPeriodic(_ctx.booleanValue("DescribeFlowResponse.Periodic"));
		describeFlowResponse.setStartSchedule(_ctx.longValue("DescribeFlowResponse.StartSchedule"));
		describeFlowResponse.setStatus(_ctx.stringValue("DescribeFlowResponse.Status"));
		describeFlowResponse.setType(_ctx.stringValue("DescribeFlowResponse.Type"));

		List<ParentFlow> parentFlowList = new ArrayList<ParentFlow>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFlowResponse.ParentFlowList.Length"); i++) {
			ParentFlow parentFlow = new ParentFlow();
			parentFlow.setParentFlowId(_ctx.stringValue("DescribeFlowResponse.ParentFlowList["+ i +"].ParentFlowId"));
			parentFlow.setParentFlowName(_ctx.stringValue("DescribeFlowResponse.ParentFlowList["+ i +"].ParentFlowName"));
			parentFlow.setProjectId(_ctx.stringValue("DescribeFlowResponse.ParentFlowList["+ i +"].ProjectId"));
			parentFlow.setProjectName(_ctx.stringValue("DescribeFlowResponse.ParentFlowList["+ i +"].ProjectName"));

			parentFlowList.add(parentFlow);
		}
		describeFlowResponse.setParentFlowList(parentFlowList);
	 
	 	return describeFlowResponse;
	}
}