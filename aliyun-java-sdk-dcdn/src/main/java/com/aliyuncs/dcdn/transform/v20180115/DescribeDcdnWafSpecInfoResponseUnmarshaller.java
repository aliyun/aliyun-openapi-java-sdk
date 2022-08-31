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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafSpecInfoResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafSpecInfoResponse.RuleInfoItem;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafSpecInfoResponse.RuleInfoItem.ConfigItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnWafSpecInfoResponseUnmarshaller {

	public static DescribeDcdnWafSpecInfoResponse unmarshall(DescribeDcdnWafSpecInfoResponse describeDcdnWafSpecInfoResponse, UnmarshallerContext _ctx) {
		
		describeDcdnWafSpecInfoResponse.setRequestId(_ctx.stringValue("DescribeDcdnWafSpecInfoResponse.RequestId"));
		describeDcdnWafSpecInfoResponse.setEdition(_ctx.stringValue("DescribeDcdnWafSpecInfoResponse.Edition"));

		List<RuleInfoItem> specInfos = new ArrayList<RuleInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnWafSpecInfoResponse.SpecInfos.Length"); i++) {
			RuleInfoItem ruleInfoItem = new RuleInfoItem();
			ruleInfoItem.setDefenseScene(_ctx.stringValue("DescribeDcdnWafSpecInfoResponse.SpecInfos["+ i +"].DefenseScene"));

			List<ConfigItem> configs = new ArrayList<ConfigItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDcdnWafSpecInfoResponse.SpecInfos["+ i +"].Configs.Length"); j++) {
				ConfigItem configItem = new ConfigItem();
				configItem.setValue(_ctx.stringValue("DescribeDcdnWafSpecInfoResponse.SpecInfos["+ i +"].Configs["+ j +"].Value"));
				configItem.setConfig(_ctx.stringValue("DescribeDcdnWafSpecInfoResponse.SpecInfos["+ i +"].Configs["+ j +"].Config"));
				configItem.setExpr(_ctx.stringValue("DescribeDcdnWafSpecInfoResponse.SpecInfos["+ i +"].Configs["+ j +"].Expr"));

				configs.add(configItem);
			}
			ruleInfoItem.setConfigs(configs);

			specInfos.add(ruleInfoItem);
		}
		describeDcdnWafSpecInfoResponse.setSpecInfos(specInfos);
	 
	 	return describeDcdnWafSpecInfoResponse;
	}
}