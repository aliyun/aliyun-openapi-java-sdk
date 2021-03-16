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

import com.aliyuncs.ecsops.model.v20160401.OpsListPlanStrategiesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsListPlanStrategiesResponse.PlanStrategy;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsListPlanStrategiesResponseUnmarshaller {

	public static OpsListPlanStrategiesResponse unmarshall(OpsListPlanStrategiesResponse opsListPlanStrategiesResponse, UnmarshallerContext _ctx) {
		
		opsListPlanStrategiesResponse.setRequestId(_ctx.stringValue("OpsListPlanStrategiesResponse.RequestId"));
		opsListPlanStrategiesResponse.setCode(_ctx.stringValue("OpsListPlanStrategiesResponse.Code"));
		opsListPlanStrategiesResponse.setMessage(_ctx.stringValue("OpsListPlanStrategiesResponse.Message"));
		opsListPlanStrategiesResponse.setSuccess(_ctx.stringValue("OpsListPlanStrategiesResponse.Success"));

		List<PlanStrategy> planStrategies = new ArrayList<PlanStrategy>();
		for (int i = 0; i < _ctx.lengthValue("OpsListPlanStrategiesResponse.PlanStrategies.Length"); i++) {
			PlanStrategy planStrategy = new PlanStrategy();
			planStrategy.setStrategyName(_ctx.stringValue("OpsListPlanStrategiesResponse.PlanStrategies["+ i +"].StrategyName"));
			planStrategy.setDescription(_ctx.stringValue("OpsListPlanStrategiesResponse.PlanStrategies["+ i +"].Description"));
			planStrategy.setStep(_ctx.stringValue("OpsListPlanStrategiesResponse.PlanStrategies["+ i +"].Step"));
			planStrategy.setModel(_ctx.stringValue("OpsListPlanStrategiesResponse.PlanStrategies["+ i +"].Model"));
			planStrategy.setOrders(_ctx.stringValue("OpsListPlanStrategiesResponse.PlanStrategies["+ i +"].Orders"));
			planStrategy.setForks(_ctx.integerValue("OpsListPlanStrategiesResponse.PlanStrategies["+ i +"].Forks"));

			planStrategies.add(planStrategy);
		}
		opsListPlanStrategiesResponse.setPlanStrategies(planStrategies);
	 
	 	return opsListPlanStrategiesResponse;
	}
}