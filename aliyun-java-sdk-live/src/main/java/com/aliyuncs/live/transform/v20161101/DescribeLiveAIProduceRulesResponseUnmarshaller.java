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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveAIProduceRulesResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveAIProduceRulesResponse.RuleInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveAIProduceRulesResponseUnmarshaller {

	public static DescribeLiveAIProduceRulesResponse unmarshall(DescribeLiveAIProduceRulesResponse describeLiveAIProduceRulesResponse, UnmarshallerContext _ctx) {
		
		describeLiveAIProduceRulesResponse.setRequestId(_ctx.stringValue("DescribeLiveAIProduceRulesResponse.RequestId"));

		List<RuleInfo> ruleInfoList = new ArrayList<RuleInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveAIProduceRulesResponse.RuleInfoList.Length"); i++) {
			RuleInfo ruleInfo = new RuleInfo();
			ruleInfo.setDomain(_ctx.stringValue("DescribeLiveAIProduceRulesResponse.RuleInfoList["+ i +"].Domain"));
			ruleInfo.setApp(_ctx.stringValue("DescribeLiveAIProduceRulesResponse.RuleInfoList["+ i +"].App"));
			ruleInfo.setSubtitleName(_ctx.stringValue("DescribeLiveAIProduceRulesResponse.RuleInfoList["+ i +"].SubtitleName"));
			ruleInfo.setIsLazy(_ctx.booleanValue("DescribeLiveAIProduceRulesResponse.RuleInfoList["+ i +"].IsLazy"));
			ruleInfo.setIsOrigin(_ctx.booleanValue("DescribeLiveAIProduceRulesResponse.RuleInfoList["+ i +"].IsOrigin"));
			ruleInfo.setRulesId(_ctx.stringValue("DescribeLiveAIProduceRulesResponse.RuleInfoList["+ i +"].RulesId"));
			ruleInfo.setLiveTemplate(_ctx.stringValue("DescribeLiveAIProduceRulesResponse.RuleInfoList["+ i +"].LiveTemplate"));
			ruleInfo.setGmtModifyTime(_ctx.stringValue("DescribeLiveAIProduceRulesResponse.RuleInfoList["+ i +"].GmtModifyTime"));
			ruleInfo.setSuffixName(_ctx.stringValue("DescribeLiveAIProduceRulesResponse.RuleInfoList["+ i +"].SuffixName"));
			ruleInfo.setStudioName(_ctx.stringValue("DescribeLiveAIProduceRulesResponse.RuleInfoList["+ i +"].StudioName"));
			ruleInfo.setDescription(_ctx.stringValue("DescribeLiveAIProduceRulesResponse.RuleInfoList["+ i +"].Description"));

			ruleInfoList.add(ruleInfo);
		}
		describeLiveAIProduceRulesResponse.setRuleInfoList(ruleInfoList);
	 
	 	return describeLiveAIProduceRulesResponse;
	}
}