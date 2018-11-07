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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobExecutionPlanHierarchyResponseUnmarshaller {

	public static ListJobExecutionPlanHierarchyResponse unmarshall(ListJobExecutionPlanHierarchyResponse listJobExecutionPlanHierarchyResponse, UnmarshallerContext context) {
		
		listJobExecutionPlanHierarchyResponse.setRequestId(context.stringValue("ListJobExecutionPlanHierarchyResponse.RequestId"));
		listJobExecutionPlanHierarchyResponse.setSuccess(context.stringValue("ListJobExecutionPlanHierarchyResponse.Success"));
		listJobExecutionPlanHierarchyResponse.setErrCode(context.stringValue("ListJobExecutionPlanHierarchyResponse.ErrCode"));
		listJobExecutionPlanHierarchyResponse.setErrMsg(context.stringValue("ListJobExecutionPlanHierarchyResponse.ErrMsg"));
		listJobExecutionPlanHierarchyResponse.setTotalCount(context.integerValue("ListJobExecutionPlanHierarchyResponse.TotalCount"));
		listJobExecutionPlanHierarchyResponse.setPageSize(context.integerValue("ListJobExecutionPlanHierarchyResponse.pageSize"));
		listJobExecutionPlanHierarchyResponse.setPageNumber(context.integerValue("ListJobExecutionPlanHierarchyResponse.pageNumber"));

		List<HierarchyInfo> hierarchyInfos = new ArrayList<HierarchyInfo>();
		for (int i = 0; i < context.lengthValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos.Length"); i++) {
			HierarchyInfo hierarchyInfo = new HierarchyInfo();
			hierarchyInfo.setId(context.longValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].Id"));
			hierarchyInfo.setNodeBizType(context.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].NodeBizType"));
			hierarchyInfo.setNodeType(context.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].NodeType"));
			hierarchyInfo.setRelateId(context.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].RelateId"));
			hierarchyInfo.setName(context.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].Name"));
			hierarchyInfo.setParentId(context.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ParentId"));
			hierarchyInfo.setResourceOwnerId(context.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ResourceOwnerId"));
			hierarchyInfo.setUtcCreateTimestamp(context.longValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].UtcCreateTimestamp"));
			hierarchyInfo.setUtcModifiedTimestamp(context.longValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].UtcModifiedTimestamp"));
			hierarchyInfo.setNodeStatus(context.integerValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].NodeStatus"));

			ExecutionPlan executionPlan = new ExecutionPlan();
			executionPlan.setBizId(context.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.BizId"));
			executionPlan.setName(context.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.Name"));
			executionPlan.setStatus(context.integerValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.Status"));
			executionPlan.setLastExeStatus(context.integerValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.LastExeStatus"));
			executionPlan.setIsCreateCluster(context.booleanValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.IsCreateCluster"));
			executionPlan.setIsInterruptWhenError(context.booleanValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.IsInterruptWhenError"));
			executionPlan.setIsCycle(context.booleanValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.IsCycle"));
			executionPlan.setScheduleCycle(context.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.ScheduleCycle"));
			executionPlan.setRegionId(context.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.RegionId"));
			executionPlan.setCronExpr(context.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.CronExpr"));
			executionPlan.setUtcCreateTimestamp(context.longValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.UtcCreateTimestamp"));
			executionPlan.setUtcModifiedTimestamp(context.longValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.UtcModifiedTimestamp"));
			executionPlan.setVersion(context.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.Version"));
			executionPlan.setClusterTemplateId(context.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].ExecutionPlan.ClusterTemplateId"));
			hierarchyInfo.setExecutionPlan(executionPlan);

			Job job = new Job();
			job.setBizId(context.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].Job.BizId"));
			job.setName(context.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].Job.Name"));
			job.setJobFailAct(context.integerValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].Job.JobFailAct"));
			job.setJobType(context.integerValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].Job.JobType"));
			job.setEnvParam(context.stringValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].Job.EnvParam"));
			job.setMaxRetry(context.integerValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].Job.MaxRetry"));
			job.setRetryInterval(context.integerValue("ListJobExecutionPlanHierarchyResponse.HierarchyInfos["+ i +"].Job.RetryInterval"));
			hierarchyInfo.setJob(job);

			hierarchyInfos.add(hierarchyInfo);
		}
		listJobExecutionPlanHierarchyResponse.setHierarchyInfos(hierarchyInfos);
	 
	 	return listJobExecutionPlanHierarchyResponse;
	}
}