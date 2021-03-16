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

import com.aliyuncs.ecsops.model.v20160401.OpsSuspendChangePlanResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsSuspendChangePlanResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsSuspendChangePlanResponseUnmarshaller {

	public static OpsSuspendChangePlanResponse unmarshall(OpsSuspendChangePlanResponse opsSuspendChangePlanResponse, UnmarshallerContext _ctx) {
		
		opsSuspendChangePlanResponse.setRequestId(_ctx.stringValue("OpsSuspendChangePlanResponse.RequestId"));
		opsSuspendChangePlanResponse.setCode(_ctx.stringValue("OpsSuspendChangePlanResponse.Code"));
		opsSuspendChangePlanResponse.setMessage(_ctx.stringValue("OpsSuspendChangePlanResponse.Message"));
		opsSuspendChangePlanResponse.setSuccess(_ctx.stringValue("OpsSuspendChangePlanResponse.Success"));

		Data data = new Data();
		data.setPlanId(_ctx.stringValue("OpsSuspendChangePlanResponse.Data.PlanId"));
		data.setStatus(_ctx.stringValue("OpsSuspendChangePlanResponse.Data.Status"));
		opsSuspendChangePlanResponse.setData(data);
	 
	 	return opsSuspendChangePlanResponse;
	}
}