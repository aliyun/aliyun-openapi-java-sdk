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

import com.aliyuncs.ecsops.model.v20160401.OpsAlarmCenterProcessTriggerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsAlarmCenterProcessTriggerResponseUnmarshaller {

	public static OpsAlarmCenterProcessTriggerResponse unmarshall(OpsAlarmCenterProcessTriggerResponse opsAlarmCenterProcessTriggerResponse, UnmarshallerContext _ctx) {
		
		opsAlarmCenterProcessTriggerResponse.setRequestId(_ctx.stringValue("OpsAlarmCenterProcessTriggerResponse.RequestId"));
		opsAlarmCenterProcessTriggerResponse.setStatus(_ctx.stringValue("OpsAlarmCenterProcessTriggerResponse.Status"));
		opsAlarmCenterProcessTriggerResponse.setFinished(_ctx.booleanValue("OpsAlarmCenterProcessTriggerResponse.Finished"));
		opsAlarmCenterProcessTriggerResponse.setErrorInfo(_ctx.stringValue("OpsAlarmCenterProcessTriggerResponse.ErrorInfo"));
		opsAlarmCenterProcessTriggerResponse.setProcessResult(_ctx.stringValue("OpsAlarmCenterProcessTriggerResponse.ProcessResult"));
		opsAlarmCenterProcessTriggerResponse.setToken(_ctx.stringValue("OpsAlarmCenterProcessTriggerResponse.Token"));
		opsAlarmCenterProcessTriggerResponse.setRequestTime(_ctx.stringValue("OpsAlarmCenterProcessTriggerResponse.RequestTime"));
	 
	 	return opsAlarmCenterProcessTriggerResponse;
	}
}