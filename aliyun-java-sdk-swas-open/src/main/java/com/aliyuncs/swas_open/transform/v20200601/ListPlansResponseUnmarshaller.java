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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.ListPlansResponse;
import com.aliyuncs.swas_open.model.v20200601.ListPlansResponse.Plan;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPlansResponseUnmarshaller {

	public static ListPlansResponse unmarshall(ListPlansResponse listPlansResponse, UnmarshallerContext _ctx) {
		
		listPlansResponse.setRequestId(_ctx.stringValue("ListPlansResponse.RequestId"));

		List<Plan> plans = new ArrayList<Plan>();
		for (int i = 0; i < _ctx.lengthValue("ListPlansResponse.Plans.Length"); i++) {
			Plan plan = new Plan();
			plan.setPlanId(_ctx.stringValue("ListPlansResponse.Plans["+ i +"].PlanId"));
			plan.setCore(_ctx.integerValue("ListPlansResponse.Plans["+ i +"].Core"));
			plan.setMemory(_ctx.integerValue("ListPlansResponse.Plans["+ i +"].Memory"));
			plan.setBandwidth(_ctx.integerValue("ListPlansResponse.Plans["+ i +"].Bandwidth"));
			plan.setDiskSize(_ctx.integerValue("ListPlansResponse.Plans["+ i +"].DiskSize"));
			plan.setFlow(_ctx.integerValue("ListPlansResponse.Plans["+ i +"].Flow"));

			plans.add(plan);
		}
		listPlansResponse.setPlans(plans);
	 
	 	return listPlansResponse;
	}
}