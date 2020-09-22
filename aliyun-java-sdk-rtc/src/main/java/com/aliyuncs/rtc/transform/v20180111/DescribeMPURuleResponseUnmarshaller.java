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

package com.aliyuncs.rtc.transform.v20180111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rtc.model.v20180111.DescribeMPURuleResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeMPURuleResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMPURuleResponseUnmarshaller {

	public static DescribeMPURuleResponse unmarshall(DescribeMPURuleResponse describeMPURuleResponse, UnmarshallerContext _ctx) {
		
		describeMPURuleResponse.setRequestId(_ctx.stringValue("DescribeMPURuleResponse.RequestId"));

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMPURuleResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(_ctx.longValue("DescribeMPURuleResponse.Rules["+ i +"].RuleId"));
			rule.setChannelPrefix(_ctx.stringValue("DescribeMPURuleResponse.Rules["+ i +"].ChannelPrefix"));
			rule.setMediaEncode(_ctx.integerValue("DescribeMPURuleResponse.Rules["+ i +"].MediaEncode"));
			rule.setBackgroudColor(_ctx.integerValue("DescribeMPURuleResponse.Rules["+ i +"].BackgroudColor"));
			rule.setCropMode(_ctx.integerValue("DescribeMPURuleResponse.Rules["+ i +"].CropMode"));
			rule.setTaskProfile(_ctx.stringValue("DescribeMPURuleResponse.Rules["+ i +"].TaskProfile"));
			rule.setPlayDomain(_ctx.stringValue("DescribeMPURuleResponse.Rules["+ i +"].PlayDomain"));
			rule.setCallBack(_ctx.stringValue("DescribeMPURuleResponse.Rules["+ i +"].CallBack"));
			rule.setIsEnable(_ctx.integerValue("DescribeMPURuleResponse.Rules["+ i +"].IsEnable"));

			List<String> layoutIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMPURuleResponse.Rules["+ i +"].LayoutIds.Length"); j++) {
				layoutIds.add(_ctx.stringValue("DescribeMPURuleResponse.Rules["+ i +"].LayoutIds["+ j +"]"));
			}
			rule.setLayoutIds(layoutIds);

			rules.add(rule);
		}
		describeMPURuleResponse.setRules(rules);
	 
	 	return describeMPURuleResponse;
	}
}