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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.SwitchAdvancedMonitoringResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SwitchAdvancedMonitoringResponseUnmarshaller {

	public static SwitchAdvancedMonitoringResponse unmarshall(SwitchAdvancedMonitoringResponse switchAdvancedMonitoringResponse, UnmarshallerContext _ctx) {
		
		switchAdvancedMonitoringResponse.setRequestId(_ctx.stringValue("SwitchAdvancedMonitoringResponse.RequestId"));
		switchAdvancedMonitoringResponse.setCode(_ctx.integerValue("SwitchAdvancedMonitoringResponse.Code"));
		switchAdvancedMonitoringResponse.setMessage(_ctx.stringValue("SwitchAdvancedMonitoringResponse.Message"));
		switchAdvancedMonitoringResponse.setAdvancedMonitoringEnabled(_ctx.booleanValue("SwitchAdvancedMonitoringResponse.AdvancedMonitoringEnabled"));
	 
	 	return switchAdvancedMonitoringResponse;
	}
}