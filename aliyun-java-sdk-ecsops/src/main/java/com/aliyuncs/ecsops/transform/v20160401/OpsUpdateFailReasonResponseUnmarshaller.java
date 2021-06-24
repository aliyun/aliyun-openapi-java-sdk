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

import com.aliyuncs.ecsops.model.v20160401.OpsUpdateFailReasonResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsUpdateFailReasonResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsUpdateFailReasonResponseUnmarshaller {

	public static OpsUpdateFailReasonResponse unmarshall(OpsUpdateFailReasonResponse opsUpdateFailReasonResponse, UnmarshallerContext _ctx) {
		
		opsUpdateFailReasonResponse.setRequestId(_ctx.stringValue("OpsUpdateFailReasonResponse.RequestId"));

		Data data = new Data();
		data.setGmtCreate(_ctx.stringValue("OpsUpdateFailReasonResponse.Data.GmtCreate"));
		data.setPromptMessage(_ctx.stringValue("OpsUpdateFailReasonResponse.Data.PromptMessage"));
		data.setPlanId(_ctx.longValue("OpsUpdateFailReasonResponse.Data.PlanId"));
		data.setStatus(_ctx.stringValue("OpsUpdateFailReasonResponse.Data.Status"));
		data.setTaskId(_ctx.stringValue("OpsUpdateFailReasonResponse.Data.TaskId"));
		opsUpdateFailReasonResponse.setData(data);
	 
	 	return opsUpdateFailReasonResponse;
	}
}