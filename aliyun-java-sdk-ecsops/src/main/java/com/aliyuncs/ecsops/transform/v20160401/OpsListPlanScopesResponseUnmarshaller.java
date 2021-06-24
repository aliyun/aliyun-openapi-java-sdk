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

import com.aliyuncs.ecsops.model.v20160401.OpsListPlanScopesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsListPlanScopesResponse.PlanScope;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsListPlanScopesResponseUnmarshaller {

	public static OpsListPlanScopesResponse unmarshall(OpsListPlanScopesResponse opsListPlanScopesResponse, UnmarshallerContext _ctx) {
		
		opsListPlanScopesResponse.setRequestId(_ctx.stringValue("OpsListPlanScopesResponse.RequestId"));
		opsListPlanScopesResponse.setMessage(_ctx.stringValue("OpsListPlanScopesResponse.Message"));
		opsListPlanScopesResponse.setCode(_ctx.stringValue("OpsListPlanScopesResponse.Code"));
		opsListPlanScopesResponse.setSuccess(_ctx.stringValue("OpsListPlanScopesResponse.Success"));

		List<PlanScope> planScopes = new ArrayList<PlanScope>();
		for (int i = 0; i < _ctx.lengthValue("OpsListPlanScopesResponse.PlanScopes.Length"); i++) {
			PlanScope planScope = new PlanScope();
			planScope.setScopeName(_ctx.stringValue("OpsListPlanScopesResponse.PlanScopes["+ i +"].ScopeName"));

			List<String> scopeValue = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsListPlanScopesResponse.PlanScopes["+ i +"].ScopeValue.Length"); j++) {
				scopeValue.add(_ctx.stringValue("OpsListPlanScopesResponse.PlanScopes["+ i +"].ScopeValue["+ j +"]"));
			}
			planScope.setScopeValue(scopeValue);

			planScopes.add(planScope);
		}
		opsListPlanScopesResponse.setPlanScopes(planScopes);
	 
	 	return opsListPlanScopesResponse;
	}
}