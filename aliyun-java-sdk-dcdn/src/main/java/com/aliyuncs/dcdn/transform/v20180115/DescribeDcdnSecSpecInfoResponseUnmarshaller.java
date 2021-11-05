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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnSecSpecInfoResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnSecSpecInfoResponse.RuleInfoItem;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnSecSpecInfoResponse.RuleInfoItem.ConfigItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnSecSpecInfoResponseUnmarshaller {

	public static DescribeDcdnSecSpecInfoResponse unmarshall(DescribeDcdnSecSpecInfoResponse describeDcdnSecSpecInfoResponse, UnmarshallerContext _ctx) {
		
		describeDcdnSecSpecInfoResponse.setRequestId(_ctx.stringValue("DescribeDcdnSecSpecInfoResponse.RequestId"));
		describeDcdnSecSpecInfoResponse.setVersion(_ctx.stringValue("DescribeDcdnSecSpecInfoResponse.Version"));

		List<RuleInfoItem> specInfos = new ArrayList<RuleInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnSecSpecInfoResponse.SpecInfos.Length"); i++) {
			RuleInfoItem ruleInfoItem = new RuleInfoItem();
			ruleInfoItem.setRuleCode(_ctx.stringValue("DescribeDcdnSecSpecInfoResponse.SpecInfos["+ i +"].RuleCode"));

			List<ConfigItem> ruleConfigs = new ArrayList<ConfigItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDcdnSecSpecInfoResponse.SpecInfos["+ i +"].RuleConfigs.Length"); j++) {
				ConfigItem configItem = new ConfigItem();
				configItem.setCode(_ctx.stringValue("DescribeDcdnSecSpecInfoResponse.SpecInfos["+ i +"].RuleConfigs["+ j +"].Code"));
				configItem.setExpr(_ctx.stringValue("DescribeDcdnSecSpecInfoResponse.SpecInfos["+ i +"].RuleConfigs["+ j +"].Expr"));
				configItem.setValue(_ctx.stringValue("DescribeDcdnSecSpecInfoResponse.SpecInfos["+ i +"].RuleConfigs["+ j +"].Value"));

				ruleConfigs.add(configItem);
			}
			ruleInfoItem.setRuleConfigs(ruleConfigs);

			specInfos.add(ruleInfoItem);
		}
		describeDcdnSecSpecInfoResponse.setSpecInfos(specInfos);
	 
	 	return describeDcdnSecSpecInfoResponse;
	}
}