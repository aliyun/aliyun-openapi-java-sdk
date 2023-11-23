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

package com.aliyuncs.cloudauth_device.transform.v20200120;

import com.aliyuncs.cloudauth_device.model.v20200120.ExecuteDeviceRiskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecuteDeviceRiskResponseUnmarshaller {

	public static ExecuteDeviceRiskResponse unmarshall(ExecuteDeviceRiskResponse executeDeviceRiskResponse, UnmarshallerContext _ctx) {
		
		executeDeviceRiskResponse.setRequestId(_ctx.stringValue("ExecuteDeviceRiskResponse.RequestId"));
		executeDeviceRiskResponse.setCode(_ctx.integerValue("ExecuteDeviceRiskResponse.Code"));
		executeDeviceRiskResponse.setTags(_ctx.stringValue("ExecuteDeviceRiskResponse.Tags"));
		executeDeviceRiskResponse.setSubCode(_ctx.stringValue("ExecuteDeviceRiskResponse.SubCode"));
		executeDeviceRiskResponse.setUmid(_ctx.stringValue("ExecuteDeviceRiskResponse.Umid"));
		executeDeviceRiskResponse.setRiskItems(_ctx.stringValue("ExecuteDeviceRiskResponse.RiskItems"));
	 
	 	return executeDeviceRiskResponse;
	}
}