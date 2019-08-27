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
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExecutionPlansResponseUnmarshaller {

	public static ListExecutionPlansResponse unmarshall(ListExecutionPlansResponse listExecutionPlansResponse, UnmarshallerContext _ctx) {
		
		listExecutionPlansResponse.setRequestId(_ctx.stringValue("ListExecutionPlansResponse.RequestId"));
		listExecutionPlansResponse.setTotalCount(_ctx.integerValue("ListExecutionPlansResponse.TotalCount"));
		listExecutionPlansResponse.setPageNumber(_ctx.integerValue("ListExecutionPlansResponse.PageNumber"));
		listExecutionPlansResponse.setPageSize(_ctx.integerValue("ListExecutionPlansResponse.PageSize"));

		List<ExecutionPlanInfo> executionPlans = new ArrayList<ExecutionPlanInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListExecutionPlansResponse.ExecutionPlans.Length"); i++) {
			ExecutionPlanInfo executionPlanInfo = new ExecutionPlanInfo();
			executionPlanInfo.setId(_ctx.stringValue("ListExecutionPlansResponse.ExecutionPlans["+ i +"].Id"));
			executionPlanInfo.setName(_ctx.stringValue("ListExecutionPlansResponse.ExecutionPlans["+ i +"].Name"));
			executionPlanInfo.setCreateClusterOnDemand(_ctx.booleanValue("ListExecutionPlansResponse.ExecutionPlans["+ i +"].CreateClusterOnDemand"));
			executionPlanInfo.setStragety(_ctx.stringValue("ListExecutionPlansResponse.ExecutionPlans["+ i +"].Stragety"));
			executionPlanInfo.setStatus(_ctx.stringValue("ListExecutionPlansResponse.ExecutionPlans["+ i +"].Status"));
			executionPlanInfo.setTimeInterval(_ctx.integerValue("ListExecutionPlansResponse.ExecutionPlans["+ i +"].TimeInterval"));
			executionPlanInfo.setStartTime(_ctx.longValue("ListExecutionPlansResponse.ExecutionPlans["+ i +"].StartTime"));
			executionPlanInfo.setTimeUnit(_ctx.stringValue("ListExecutionPlansResponse.ExecutionPlans["+ i +"].TimeUnit"));

			executionPlans.add(executionPlanInfo);
		}
		listExecutionPlansResponse.setExecutionPlans(executionPlans);
	 
	 	return listExecutionPlansResponse;
	}
}