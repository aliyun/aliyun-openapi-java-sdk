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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeChangePlansResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeChangePlansResponse.Data;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeChangePlansResponse.Data.Plan;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeChangePlansResponseUnmarshaller {

	public static OpsDescribeChangePlansResponse unmarshall(OpsDescribeChangePlansResponse opsDescribeChangePlansResponse, UnmarshallerContext _ctx) {
		
		opsDescribeChangePlansResponse.setRequestId(_ctx.stringValue("OpsDescribeChangePlansResponse.RequestId"));

		Data data = new Data();

		List<Plan> plans = new ArrayList<Plan>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeChangePlansResponse.Data.Plans.Length"); i++) {
			Plan plan = new Plan();
			plan.setPlanId(_ctx.stringValue("OpsDescribeChangePlansResponse.Data.Plans["+ i +"].PlanId"));
			plan.setPlanningStatus(_ctx.stringValue("OpsDescribeChangePlansResponse.Data.Plans["+ i +"].PlanningStatus"));
			plan.setOperationStatus(_ctx.stringValue("OpsDescribeChangePlansResponse.Data.Plans["+ i +"].OperationStatus"));
			plan.setStrategy(_ctx.stringValue("OpsDescribeChangePlansResponse.Data.Plans["+ i +"].Strategy"));
			plan.setStrategyModel(_ctx.stringValue("OpsDescribeChangePlansResponse.Data.Plans["+ i +"].StrategyModel"));
			plan.setGroups(_ctx.stringValue("OpsDescribeChangePlansResponse.Data.Plans["+ i +"].Groups"));
			plan.setScopes(_ctx.stringValue("OpsDescribeChangePlansResponse.Data.Plans["+ i +"].Scopes"));
			plan.setGmtCreated(_ctx.stringValue("OpsDescribeChangePlansResponse.Data.Plans["+ i +"].GmtCreated"));
			plan.setGmtModified(_ctx.stringValue("OpsDescribeChangePlansResponse.Data.Plans["+ i +"].GmtModified"));
			plan.setOperator(_ctx.stringValue("OpsDescribeChangePlansResponse.Data.Plans["+ i +"].Operator"));
			plan.setExtensions(_ctx.stringValue("OpsDescribeChangePlansResponse.Data.Plans["+ i +"].Extensions"));
			plan.setChangeDescription(_ctx.stringValue("OpsDescribeChangePlansResponse.Data.Plans["+ i +"].ChangeDescription"));

			plans.add(plan);
		}
		data.setPlans(plans);
		opsDescribeChangePlansResponse.setData(data);
	 
	 	return opsDescribeChangePlansResponse;
	}
}