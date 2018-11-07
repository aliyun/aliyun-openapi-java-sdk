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

import com.aliyuncs.emr.model.v20160408.ListExecutionPlansResponse;
import com.aliyuncs.emr.model.v20160408.ListExecutionPlansResponse.ExecutionPlanInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExecutionPlansResponseUnmarshaller {

	public static ListExecutionPlansResponse unmarshall(ListExecutionPlansResponse listExecutionPlansResponse, UnmarshallerContext context) {
		
		listExecutionPlansResponse.setRequestId(context.stringValue("ListExecutionPlansResponse.RequestId"));
		listExecutionPlansResponse.setTotalCount(context.integerValue("ListExecutionPlansResponse.TotalCount"));
		listExecutionPlansResponse.setPageNumber(context.integerValue("ListExecutionPlansResponse.PageNumber"));
		listExecutionPlansResponse.setPageSize(context.integerValue("ListExecutionPlansResponse.PageSize"));

		List<ExecutionPlanInfo> executionPlans = new ArrayList<ExecutionPlanInfo>();
		for (int i = 0; i < context.lengthValue("ListExecutionPlansResponse.ExecutionPlans.Length"); i++) {
			ExecutionPlanInfo executionPlanInfo = new ExecutionPlanInfo();
			executionPlanInfo.setId(context.stringValue("ListExecutionPlansResponse.ExecutionPlans["+ i +"].Id"));
			executionPlanInfo.setName(context.stringValue("ListExecutionPlansResponse.ExecutionPlans["+ i +"].Name"));
			executionPlanInfo.setCreateClusterOnDemand(context.booleanValue("ListExecutionPlansResponse.ExecutionPlans["+ i +"].CreateClusterOnDemand"));
			executionPlanInfo.setStragety(context.stringValue("ListExecutionPlansResponse.ExecutionPlans["+ i +"].Stragety"));
			executionPlanInfo.setStatus(context.stringValue("ListExecutionPlansResponse.ExecutionPlans["+ i +"].Status"));
			executionPlanInfo.setTimeInterval(context.integerValue("ListExecutionPlansResponse.ExecutionPlans["+ i +"].TimeInterval"));
			executionPlanInfo.setStartTime(context.longValue("ListExecutionPlansResponse.ExecutionPlans["+ i +"].StartTime"));
			executionPlanInfo.setTimeUnit(context.stringValue("ListExecutionPlansResponse.ExecutionPlans["+ i +"].TimeUnit"));

			executionPlans.add(executionPlanInfo);
		}
		listExecutionPlansResponse.setExecutionPlans(executionPlans);
	 
	 	return listExecutionPlansResponse;
	}
}