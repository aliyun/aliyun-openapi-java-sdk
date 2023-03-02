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

import com.aliyuncs.swas_open.model.v20200601.ListInstancePlansModificationResponse;
import com.aliyuncs.swas_open.model.v20200601.ListInstancePlansModificationResponse.Plan;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancePlansModificationResponseUnmarshaller {

	public static ListInstancePlansModificationResponse unmarshall(ListInstancePlansModificationResponse listInstancePlansModificationResponse, UnmarshallerContext _ctx) {
		
		listInstancePlansModificationResponse.setRequestId(_ctx.stringValue("ListInstancePlansModificationResponse.RequestId"));

		List<Plan> plans = new ArrayList<Plan>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancePlansModificationResponse.Plans.Length"); i++) {
			Plan plan = new Plan();
			plan.setCore(_ctx.integerValue("ListInstancePlansModificationResponse.Plans["+ i +"].Core"));
			plan.setBandwidth(_ctx.integerValue("ListInstancePlansModificationResponse.Plans["+ i +"].Bandwidth"));
			plan.setDiskSize(_ctx.integerValue("ListInstancePlansModificationResponse.Plans["+ i +"].DiskSize"));
			plan.setFlow(_ctx.integerValue("ListInstancePlansModificationResponse.Plans["+ i +"].Flow"));
			plan.setMemory(_ctx.integerValue("ListInstancePlansModificationResponse.Plans["+ i +"].Memory"));
			plan.setPlanId(_ctx.stringValue("ListInstancePlansModificationResponse.Plans["+ i +"].PlanId"));
			plan.setDiskType(_ctx.stringValue("ListInstancePlansModificationResponse.Plans["+ i +"].DiskType"));
			plan.setOriginPrice(_ctx.doubleValue("ListInstancePlansModificationResponse.Plans["+ i +"].OriginPrice"));
			plan.setCurrency(_ctx.stringValue("ListInstancePlansModificationResponse.Plans["+ i +"].Currency"));
			plan.setSupportPlatform(_ctx.stringValue("ListInstancePlansModificationResponse.Plans["+ i +"].SupportPlatform"));

			plans.add(plan);
		}
		listInstancePlansModificationResponse.setPlans(plans);
	 
	 	return listInstancePlansModificationResponse;
	}
}