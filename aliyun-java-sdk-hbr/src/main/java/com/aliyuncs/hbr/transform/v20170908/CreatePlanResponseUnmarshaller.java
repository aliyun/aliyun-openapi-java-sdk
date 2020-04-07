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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.CreatePlanResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePlanResponseUnmarshaller {

	public static CreatePlanResponse unmarshall(CreatePlanResponse createPlanResponse, UnmarshallerContext _ctx) {
		
		createPlanResponse.setRequestId(_ctx.stringValue("CreatePlanResponse.RequestId"));
		createPlanResponse.setSuccess(_ctx.booleanValue("CreatePlanResponse.Success"));
		createPlanResponse.setCode(_ctx.stringValue("CreatePlanResponse.Code"));
		createPlanResponse.setMessage(_ctx.stringValue("CreatePlanResponse.Message"));
		createPlanResponse.setPlanId(_ctx.stringValue("CreatePlanResponse.PlanId"));
	 
	 	return createPlanResponse;
	}
}