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

import com.aliyuncs.ecsops.model.v20160401.OpsListPlanGroupsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsListPlanGroupsResponse.PlanGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsListPlanGroupsResponseUnmarshaller {

	public static OpsListPlanGroupsResponse unmarshall(OpsListPlanGroupsResponse opsListPlanGroupsResponse, UnmarshallerContext _ctx) {
		
		opsListPlanGroupsResponse.setRequestId(_ctx.stringValue("OpsListPlanGroupsResponse.RequestId"));
		opsListPlanGroupsResponse.setCode(_ctx.stringValue("OpsListPlanGroupsResponse.Code"));
		opsListPlanGroupsResponse.setMessage(_ctx.stringValue("OpsListPlanGroupsResponse.Message"));
		opsListPlanGroupsResponse.setSuccess(_ctx.stringValue("OpsListPlanGroupsResponse.Success"));

		List<PlanGroup> planGroups = new ArrayList<PlanGroup>();
		for (int i = 0; i < _ctx.lengthValue("OpsListPlanGroupsResponse.PlanGroups.Length"); i++) {
			PlanGroup planGroup = new PlanGroup();
			planGroup.setGroupName(_ctx.stringValue("OpsListPlanGroupsResponse.PlanGroups["+ i +"].GroupName"));
			planGroup.setDescription(_ctx.stringValue("OpsListPlanGroupsResponse.PlanGroups["+ i +"].Description"));
			planGroup.setRequired(_ctx.booleanValue("OpsListPlanGroupsResponse.PlanGroups["+ i +"].Required"));
			planGroup.setResourceLevel(_ctx.stringValue("OpsListPlanGroupsResponse.PlanGroups["+ i +"].ResourceLevel"));

			planGroups.add(planGroup);
		}
		opsListPlanGroupsResponse.setPlanGroups(planGroups);
	 
	 	return opsListPlanGroupsResponse;
	}
}