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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamWatermarkRulesResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamWatermarkRulesResponse.RuleInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamWatermarkRulesResponseUnmarshaller {

	public static DescribeLiveStreamWatermarkRulesResponse unmarshall(DescribeLiveStreamWatermarkRulesResponse describeLiveStreamWatermarkRulesResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamWatermarkRulesResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamWatermarkRulesResponse.RequestId"));

		List<RuleInfo> ruleInfoList = new ArrayList<RuleInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveStreamWatermarkRulesResponse.RuleInfoList.Length"); i++) {
			RuleInfo ruleInfo = new RuleInfo();
			ruleInfo.setRuleId(_ctx.stringValue("DescribeLiveStreamWatermarkRulesResponse.RuleInfoList["+ i +"].RuleId"));
			ruleInfo.setName(_ctx.stringValue("DescribeLiveStreamWatermarkRulesResponse.RuleInfoList["+ i +"].Name"));
			ruleInfo.setDomain(_ctx.stringValue("DescribeLiveStreamWatermarkRulesResponse.RuleInfoList["+ i +"].Domain"));
			ruleInfo.setApp(_ctx.stringValue("DescribeLiveStreamWatermarkRulesResponse.RuleInfoList["+ i +"].App"));
			ruleInfo.setStream(_ctx.stringValue("DescribeLiveStreamWatermarkRulesResponse.RuleInfoList["+ i +"].Stream"));
			ruleInfo.setTemplateId(_ctx.stringValue("DescribeLiveStreamWatermarkRulesResponse.RuleInfoList["+ i +"].TemplateId"));
			ruleInfo.setDescription(_ctx.stringValue("DescribeLiveStreamWatermarkRulesResponse.RuleInfoList["+ i +"].Description"));

			ruleInfoList.add(ruleInfo);
		}
		describeLiveStreamWatermarkRulesResponse.setRuleInfoList(ruleInfoList);
	 
	 	return describeLiveStreamWatermarkRulesResponse;
	}
}