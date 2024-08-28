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

import com.aliyuncs.config.model.v20200907.GetConfigRuleSummaryByRiskLevelResponse;
import com.aliyuncs.config.model.v20200907.GetConfigRuleSummaryByRiskLevelResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConfigRuleSummaryByRiskLevelResponseUnmarshaller {

	public static GetConfigRuleSummaryByRiskLevelResponse unmarshall(GetConfigRuleSummaryByRiskLevelResponse getConfigRuleSummaryByRiskLevelResponse, UnmarshallerContext _ctx) {
		
		getConfigRuleSummaryByRiskLevelResponse.setRequestId(_ctx.stringValue("GetConfigRuleSummaryByRiskLevelResponse.RequestId"));

		List<Data> configRuleSummaries = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("GetConfigRuleSummaryByRiskLevelResponse.ConfigRuleSummaries.Length"); i++) {
			Data data = new Data();
			data.setCompliantCount(_ctx.integerValue("GetConfigRuleSummaryByRiskLevelResponse.ConfigRuleSummaries["+ i +"].CompliantCount"));
			data.setNonCompliantCount(_ctx.integerValue("GetConfigRuleSummaryByRiskLevelResponse.ConfigRuleSummaries["+ i +"].NonCompliantCount"));
			data.setRiskLevel(_ctx.integerValue("GetConfigRuleSummaryByRiskLevelResponse.ConfigRuleSummaries["+ i +"].RiskLevel"));

			configRuleSummaries.add(data);
		}
		getConfigRuleSummaryByRiskLevelResponse.setConfigRuleSummaries(configRuleSummaries);
	 
	 	return getConfigRuleSummaryByRiskLevelResponse;
	}
}