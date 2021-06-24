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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeMigrationPlansResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeMigrationPlansResponse.Plan;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeMigrationPlansResponseUnmarshaller {

	public static OpsDescribeMigrationPlansResponse unmarshall(OpsDescribeMigrationPlansResponse opsDescribeMigrationPlansResponse, UnmarshallerContext _ctx) {
		
		opsDescribeMigrationPlansResponse.setRequestId(_ctx.stringValue("OpsDescribeMigrationPlansResponse.RequestId"));
		opsDescribeMigrationPlansResponse.setPageSize(_ctx.integerValue("OpsDescribeMigrationPlansResponse.PageSize"));
		opsDescribeMigrationPlansResponse.setPageNumber(_ctx.integerValue("OpsDescribeMigrationPlansResponse.PageNumber"));
		opsDescribeMigrationPlansResponse.setTotal(_ctx.integerValue("OpsDescribeMigrationPlansResponse.Total"));

		List<Plan> planSet = new ArrayList<Plan>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeMigrationPlansResponse.PlanSet.Length"); i++) {
			Plan plan = new Plan();
			plan.setStatus(_ctx.integerValue("OpsDescribeMigrationPlansResponse.PlanSet["+ i +"].Status"));
			plan.setType(_ctx.integerValue("OpsDescribeMigrationPlansResponse.PlanSet["+ i +"].Type"));
			plan.setEnsureNetworkConnectivity(_ctx.booleanValue("OpsDescribeMigrationPlansResponse.PlanSet["+ i +"].EnsureNetworkConnectivity"));
			plan.setMigrationPlanId(_ctx.stringValue("OpsDescribeMigrationPlansResponse.PlanSet["+ i +"].MigrationPlanId"));
			plan.setRemainPublicMacAsPriority(_ctx.booleanValue("OpsDescribeMigrationPlansResponse.PlanSet["+ i +"].RemainPublicMacAsPriority"));
			plan.setCreateTime(_ctx.stringValue("OpsDescribeMigrationPlansResponse.PlanSet["+ i +"].CreateTime"));
			plan.setName(_ctx.stringValue("OpsDescribeMigrationPlansResponse.PlanSet["+ i +"].Name"));
			plan.setFinishVmCount(_ctx.integerValue("OpsDescribeMigrationPlansResponse.PlanSet["+ i +"].FinishVmCount"));
			plan.setKeepPrivateIp(_ctx.booleanValue("OpsDescribeMigrationPlansResponse.PlanSet["+ i +"].KeepPrivateIp"));
			plan.setTotalVmCount(_ctx.integerValue("OpsDescribeMigrationPlansResponse.PlanSet["+ i +"].TotalVmCount"));

			planSet.add(plan);
		}
		opsDescribeMigrationPlansResponse.setPlanSet(planSet);
	 
	 	return opsDescribeMigrationPlansResponse;
	}
}