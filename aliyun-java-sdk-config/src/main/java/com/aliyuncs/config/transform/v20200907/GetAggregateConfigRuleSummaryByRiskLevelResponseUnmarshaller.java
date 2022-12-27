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

import com.aliyuncs.config.model.v20200907.GetAggregateConfigRuleSummaryByRiskLevelResponse;
import com.aliyuncs.config.model.v20200907.GetAggregateConfigRuleSummaryByRiskLevelResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAggregateConfigRuleSummaryByRiskLevelResponseUnmarshaller {

	public static GetAggregateConfigRuleSummaryByRiskLevelResponse unmarshall(GetAggregateConfigRuleSummaryByRiskLevelResponse getAggregateConfigRuleSummaryByRiskLevelResponse, UnmarshallerContext _ctx) {
		
		getAggregateConfigRuleSummaryByRiskLevelResponse.setRequestId(_ctx.stringValue("GetAggregateConfigRuleSummaryByRiskLevelResponse.RequestId"));

		List<Data> configRuleSummaries = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("GetAggregateConfigRuleSummaryByRiskLevelResponse.ConfigRuleSummaries.Length"); i++) {
			Data data = new Data();
			data.setRiskLevel(_ctx.integerValue("GetAggregateConfigRuleSummaryByRiskLevelResponse.ConfigRuleSummaries["+ i +"].RiskLevel"));
			data.setCompliantCount(_ctx.integerValue("GetAggregateConfigRuleSummaryByRiskLevelResponse.ConfigRuleSummaries["+ i +"].CompliantCount"));
			data.setNonCompliantCount(_ctx.integerValue("GetAggregateConfigRuleSummaryByRiskLevelResponse.ConfigRuleSummaries["+ i +"].NonCompliantCount"));

			configRuleSummaries.add(data);
		}
		getAggregateConfigRuleSummaryByRiskLevelResponse.setConfigRuleSummaries(configRuleSummaries);
	 
	 	return getAggregateConfigRuleSummaryByRiskLevelResponse;
	}
}