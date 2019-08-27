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

import com.aliyuncs.emr.model.v20160408.ListJobExecutionPlanHierarchyResponse;
import com.aliyuncs.emr.model.v20160408.ListJobExecutionPlanHierarchyResponse.HierarchyInfo;
import com.aliyuncs.emr.model.v20160408.ListJobExecutionPlanHierarchyResponse.HierarchyInfo.ExecutionPlan;
import com.aliyuncs.emr.model.v20160408.ListJobExecutionPlanHierarchyResponse.HierarchyInfo.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobExecutionPlanHierarchyResponseUnmarshaller {

	public static ListJobExecutionPlanHierarchyResponse unmarshall(ListJobExecutionPlanHierarchyResponse listJobExecutionPlanHierarchyResponse, UnmarshallerContext _ctx) {
		
		listJobExecutionPlanHierarchyResponse.setRequestId(_ctx.stringValue("ListJobExecutionPlanHierarchyResponse.RequestId"));
		listJobExecutionPlanHierarchyResponse.setSuccess(_ctx.stringValue("ListJobExecutionPlanHierarchyResponse.Success"));
		listJobExecutionPlanHierarchyResponse.setErrCode(_ctx.stringValue("ListJobExecutionPlanHierarchyResponse.ErrCode"));
		listJobExecutionPlanHierarchyResponse.setErrMsg(_ctx.stringValue("ListJobExecutionPlanHierarchyResponse.ErrMsg"));
		listJobExecutionPlanHierarchyResponse.setTotalCount(_ctx.integerValue("ListJobExecutionPlanHierarchyResponse.TotalCount"));
		listJobExecutionPlanHierarchyResponse.setPageSize(_ctx.integerValue("ListJobExecutionPlanHierarchyResponse.pageSize"));
		listJobExecutionPlanHierarchyResponse.setPageNumber(_ctx.integerValue("ListJobExecutionPlanHierarchyResponse.pageNumber"));

		List<HierarchyInfo> hierarchyInfos = new ArrayList<HierarchyInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos.Length"); i++) {
			HierarchyInfo hierarchyInfo = new HierarchyInfo();
			hierarchyInfo.setId(_ctx.longValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].Id"));
			hierarchyInfo.setNodeBizType(_ctx.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].NodeBizType"));
			hierarchyInfo.setNodeType(_ctx.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].NodeType"));
			hierarchyInfo.setRelateId(_ctx.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].RelateId"));
			hierarchyInfo.setName(_ctx.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].Name"));
			hierarchyInfo.setParentId(_ctx.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ParentId"));
			hierarchyInfo.setResourceOwnerId(_ctx.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ResourceOwnerId"));
			hierarchyInfo.setUtcCreateTimestamp(_ctx.longValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].UtcCreateTimestamp"));
			hierarchyInfo.setUtcModifiedTimestamp(_ctx.longValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].UtcModifiedTimestamp"));
			hierarchyInfo.setNodeStatus(_ctx.integerValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].NodeStatus"));

			ExecutionPlan executionPlan = new ExecutionPlan();
			executionPlan.setBizId(_ctx.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.BizId"));
			executionPlan.setName(_ctx.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.Name"));
			executionPlan.setStatus(_ctx.integerValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.Status"));
			executionPlan.setLastExeStatus(_ctx.integerValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.LastExeStatus"));
			executionPlan.setIsCreateCluster(_ctx.booleanValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.IsCreateCluster"));
			executionPlan.setIsInterruptWhenError(_ctx.booleanValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.IsInterruptWhenError"));
			executionPlan.setIsCycle(_ctx.booleanValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.IsCycle"));
			executionPlan.setScheduleCycle(_ctx.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.ScheduleCycle"));
			executionPlan.setRegionId(_ctx.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.RegionId"));
			executionPlan.setCronExpr(_ctx.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.CronExpr"));
			executionPlan.setUtcCreateTimestamp(_ctx.longValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.UtcCreateTimestamp"));
			executionPlan.setUtcModifiedTimestamp(_ctx.longValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.UtcModifiedTimestamp"));
			executionPlan.setVersion(_ctx.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.Version"));
			executionPlan.setClusterTemplateId(_ctx.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.ClusterTemplateId"));
			hierarchyInfo.setExecutionPlan(executionPlan);

			Job job = new Job();
			job.setBizId(_ctx.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].Job.BizId"));
			job.setName(_ctx.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].Job.Name"));
			job.setJobFailAct(_ctx.integerValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].Job.JobFailAct"));
			job.setJobType(_ctx.integerValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].Job.JobType"));
			job.setEnvParam(_ctx.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].Job.EnvParam"));
			job.setMaxRetry(_ctx.integerValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].Job.MaxRetry"));
			job.setRetryInterval(_ctx.integerValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].Job.RetryInterval"));
			hierarchyInfo.setJob(job);

			hierarchyInfos.add(hierarchyInfo);
		}
		listJobExecutionPlanHierarchyResponse.setHierarchyInfos(hierarchyInfos);
	 
	 	return listJobExecutionPlanHierarchyResponse;
	}
}