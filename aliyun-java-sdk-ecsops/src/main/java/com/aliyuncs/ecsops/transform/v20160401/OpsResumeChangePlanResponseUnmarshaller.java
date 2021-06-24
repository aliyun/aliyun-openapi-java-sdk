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

import com.aliyuncs.ecsops.model.v20160401.OpsResumeChangePlanResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsResumeChangePlanResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsResumeChangePlanResponseUnmarshaller {

	public static OpsResumeChangePlanResponse unmarshall(OpsResumeChangePlanResponse opsResumeChangePlanResponse, UnmarshallerContext _ctx) {
		
		opsResumeChangePlanResponse.setRequestId(_ctx.stringValue("OpsResumeChangePlanResponse.RequestId"));
		opsResumeChangePlanResponse.setMessage(_ctx.stringValue("OpsResumeChangePlanResponse.Message"));
		opsResumeChangePlanResponse.setCode(_ctx.stringValue("OpsResumeChangePlanResponse.Code"));
		opsResumeChangePlanResponse.setSuccess(_ctx.stringValue("OpsResumeChangePlanResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("OpsResumeChangePlanResponse.Data.Status"));
		data.setPlanId(_ctx.stringValue("OpsResumeChangePlanResponse.Data.PlanId"));
		opsResumeChangePlanResponse.setData(data);
	 
	 	return opsResumeChangePlanResponse;
	}
}