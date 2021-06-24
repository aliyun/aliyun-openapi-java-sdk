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

import com.aliyuncs.ecsops.model.v20160401.OpsCreateChangePlanResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsCreateChangePlanResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsCreateChangePlanResponseUnmarshaller {

	public static OpsCreateChangePlanResponse unmarshall(OpsCreateChangePlanResponse opsCreateChangePlanResponse, UnmarshallerContext _ctx) {
		
		opsCreateChangePlanResponse.setRequestId(_ctx.stringValue("OpsCreateChangePlanResponse.RequestId"));
		opsCreateChangePlanResponse.setMessage(_ctx.stringValue("OpsCreateChangePlanResponse.Message"));
		opsCreateChangePlanResponse.setCode(_ctx.stringValue("OpsCreateChangePlanResponse.Code"));
		opsCreateChangePlanResponse.setSuccess(_ctx.stringValue("OpsCreateChangePlanResponse.Success"));

		Data data = new Data();
		data.setPlanId(_ctx.stringValue("OpsCreateChangePlanResponse.Data.PlanId"));
		opsCreateChangePlanResponse.setData(data);
	 
	 	return opsCreateChangePlanResponse;
	}
}