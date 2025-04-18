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
import com.aliyuncs.swas_open.model.v20200601.ListPlansResponse.Plan.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPlansResponseUnmarshaller {

	public static ListPlansResponse unmarshall(ListPlansResponse listPlansResponse, UnmarshallerContext _ctx) {
		
		listPlansResponse.setRequestId(_ctx.stringValue("ListPlansResponse.RequestId"));

		List<Plan> plans = new ArrayList<Plan>();
		for (int i = 0; i < _ctx.lengthValue("ListPlansResponse.Plans.Length"); i++) {
			Plan plan = new Plan();
			plan.setCore(_ctx.integerValue("ListPlansResponse.Plans["+ i +"].Core"));
			plan.setBandwidth(_ctx.integerValue("ListPlansResponse.Plans["+ i +"].Bandwidth"));
			plan.setDiskSize(_ctx.integerValue("ListPlansResponse.Plans["+ i +"].DiskSize"));
			plan.setFlow(_ctx.integerValue("ListPlansResponse.Plans["+ i +"].Flow"));
			plan.setPlanId(_ctx.stringValue("ListPlansResponse.Plans["+ i +"].PlanId"));
			plan.setDiskType(_ctx.stringValue("ListPlansResponse.Plans["+ i +"].DiskType"));
			plan.setCurrency(_ctx.stringValue("ListPlansResponse.Plans["+ i +"].Currency"));
			plan.setSupportPlatform(_ctx.stringValue("ListPlansResponse.Plans["+ i +"].SupportPlatform"));
			plan.setPlanType(_ctx.stringValue("ListPlansResponse.Plans["+ i +"].PlanType"));
			plan.setPublicIpNum(_ctx.stringValue("ListPlansResponse.Plans["+ i +"].PublicIpNum"));
			plan.setIspType(_ctx.stringValue("ListPlansResponse.Plans["+ i +"].IspType"));
			plan.setMemory(_ctx.floatValue("ListPlansResponse.Plans["+ i +"].Memory"));
			plan.setOriginPrice(_ctx.stringValue("ListPlansResponse.Plans["+ i +"].OriginPrice"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListPlansResponse.Plans["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setCnTitle(_ctx.stringValue("ListPlansResponse.Plans["+ i +"].Tags["+ j +"].CnTitle"));
				tag.setEnTitle(_ctx.stringValue("ListPlansResponse.Plans["+ i +"].Tags["+ j +"].EnTitle"));
				tag.setColor(_ctx.stringValue("ListPlansResponse.Plans["+ i +"].Tags["+ j +"].Color"));

				tags.add(tag);
			}
			plan.setTags(tags);

			plans.add(plan);
		}
		listPlansResponse.setPlans(plans);
	 
	 	return listPlansResponse;
	}
}