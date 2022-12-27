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

package com.aliyuncs.config.transform.v20200907;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20200907.GetConfigRuleComplianceByPackResponse;
import com.aliyuncs.config.model.v20200907.GetConfigRuleComplianceByPackResponse.ConfigRuleComplianceResult;
import com.aliyuncs.config.model.v20200907.GetConfigRuleComplianceByPackResponse.ConfigRuleComplianceResult.ConfigRuleCompliancesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConfigRuleComplianceByPackResponseUnmarshaller {

	public static GetConfigRuleComplianceByPackResponse unmarshall(GetConfigRuleComplianceByPackResponse getConfigRuleComplianceByPackResponse, UnmarshallerContext _ctx) {
		
		getConfigRuleComplianceByPackResponse.setRequestId(_ctx.stringValue("GetConfigRuleComplianceByPackResponse.RequestId"));

		ConfigRuleComplianceResult configRuleComplianceResult = new ConfigRuleComplianceResult();
		configRuleComplianceResult.setCompliancePackId(_ctx.stringValue("GetConfigRuleComplianceByPackResponse.ConfigRuleComplianceResult.CompliancePackId"));
		configRuleComplianceResult.setNonCompliantCount(_ctx.integerValue("GetConfigRuleComplianceByPackResponse.ConfigRuleComplianceResult.NonCompliantCount"));
		configRuleComplianceResult.setTotalCount(_ctx.integerValue("GetConfigRuleComplianceByPackResponse.ConfigRuleComplianceResult.TotalCount"));

		List<ConfigRuleCompliancesItem> configRuleCompliances = new ArrayList<ConfigRuleCompliancesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetConfigRuleComplianceByPackResponse.ConfigRuleComplianceResult.ConfigRuleCompliances.Length"); i++) {
			ConfigRuleCompliancesItem configRuleCompliancesItem = new ConfigRuleCompliancesItem();
			configRuleCompliancesItem.setComplianceType(_ctx.stringValue("GetConfigRuleComplianceByPackResponse.ConfigRuleComplianceResult.ConfigRuleCompliances["+ i +"].ComplianceType"));
			configRuleCompliancesItem.setConfigRuleName(_ctx.stringValue("GetConfigRuleComplianceByPackResponse.ConfigRuleComplianceResult.ConfigRuleCompliances["+ i +"].ConfigRuleName"));
			configRuleCompliancesItem.setConfigRuleId(_ctx.stringValue("GetConfigRuleComplianceByPackResponse.ConfigRuleComplianceResult.ConfigRuleCompliances["+ i +"].ConfigRuleId"));

			configRuleCompliances.add(configRuleCompliancesItem);
		}
		configRuleComplianceResult.setConfigRuleCompliances(configRuleCompliances);
		getConfigRuleComplianceByPackResponse.setConfigRuleComplianceResult(configRuleComplianceResult);
	 
	 	return getConfigRuleComplianceByPackResponse;
	}
}