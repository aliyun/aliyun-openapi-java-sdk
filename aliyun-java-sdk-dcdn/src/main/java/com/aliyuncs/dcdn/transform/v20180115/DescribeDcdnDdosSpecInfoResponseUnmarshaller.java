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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDdosSpecInfoResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDdosSpecInfoResponse.RuleInfoItem;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDdosSpecInfoResponse.RuleInfoItem.ConfigItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDdosSpecInfoResponseUnmarshaller {

	public static DescribeDcdnDdosSpecInfoResponse unmarshall(DescribeDcdnDdosSpecInfoResponse describeDcdnDdosSpecInfoResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDdosSpecInfoResponse.setRequestId(_ctx.stringValue("DescribeDcdnDdosSpecInfoResponse.RequestId"));
		describeDcdnDdosSpecInfoResponse.setEdition(_ctx.stringValue("DescribeDcdnDdosSpecInfoResponse.Edition"));
		describeDcdnDdosSpecInfoResponse.setEnable(_ctx.stringValue("DescribeDcdnDdosSpecInfoResponse.Enable"));

		List<RuleInfoItem> specInfos = new ArrayList<RuleInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDdosSpecInfoResponse.SpecInfos.Length"); i++) {
			RuleInfoItem ruleInfoItem = new RuleInfoItem();
			ruleInfoItem.setRule(_ctx.stringValue("DescribeDcdnDdosSpecInfoResponse.SpecInfos["+ i +"].Rule"));

			List<ConfigItem> configs = new ArrayList<ConfigItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDcdnDdosSpecInfoResponse.SpecInfos["+ i +"].Configs.Length"); j++) {
				ConfigItem configItem = new ConfigItem();
				configItem.setValue(_ctx.stringValue("DescribeDcdnDdosSpecInfoResponse.SpecInfos["+ i +"].Configs["+ j +"].Value"));
				configItem.setConfig(_ctx.stringValue("DescribeDcdnDdosSpecInfoResponse.SpecInfos["+ i +"].Configs["+ j +"].Config"));
				configItem.setExpr(_ctx.stringValue("DescribeDcdnDdosSpecInfoResponse.SpecInfos["+ i +"].Configs["+ j +"].Expr"));

				configs.add(configItem);
			}
			ruleInfoItem.setConfigs(configs);

			specInfos.add(ruleInfoItem);
		}
		describeDcdnDdosSpecInfoResponse.setSpecInfos(specInfos);
	 
	 	return describeDcdnDdosSpecInfoResponse;
	}
}