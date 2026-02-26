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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.GetAgentlessTaskCountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAgentlessTaskCountResponseUnmarshaller {

	public static GetAgentlessTaskCountResponse unmarshall(GetAgentlessTaskCountResponse getAgentlessTaskCountResponse, UnmarshallerContext _ctx) {
		
		getAgentlessTaskCountResponse.setRequestId(_ctx.stringValue("GetAgentlessTaskCountResponse.RequestId"));
		getAgentlessTaskCountResponse.setRiskMachine(_ctx.integerValue("GetAgentlessTaskCountResponse.RiskMachine"));
		getAgentlessTaskCountResponse.setScanMachine(_ctx.integerValue("GetAgentlessTaskCountResponse.ScanMachine"));
		getAgentlessTaskCountResponse.setMaliciousFile(_ctx.integerValue("GetAgentlessTaskCountResponse.MaliciousFile"));
		getAgentlessTaskCountResponse.setVulnerability(_ctx.integerValue("GetAgentlessTaskCountResponse.Vulnerability"));
		getAgentlessTaskCountResponse.setLastTaskTime(_ctx.longValue("GetAgentlessTaskCountResponse.LastTaskTime"));
		getAgentlessTaskCountResponse.setBaselineCheckCount(_ctx.integerValue("GetAgentlessTaskCountResponse.BaselineCheckCount"));
		getAgentlessTaskCountResponse.setScaVulCount(_ctx.integerValue("GetAgentlessTaskCountResponse.ScaVulCount"));
		getAgentlessTaskCountResponse.setCveVulCount(_ctx.integerValue("GetAgentlessTaskCountResponse.CveVulCount"));
	 
	 	return getAgentlessTaskCountResponse;
	}
}