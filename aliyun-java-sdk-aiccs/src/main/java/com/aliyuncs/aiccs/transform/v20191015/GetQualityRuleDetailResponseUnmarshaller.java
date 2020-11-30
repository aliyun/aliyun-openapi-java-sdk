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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.GetQualityRuleDetailResponse;
import com.aliyuncs.aiccs.model.v20191015.GetQualityRuleDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualityRuleDetailResponseUnmarshaller {

	public static GetQualityRuleDetailResponse unmarshall(GetQualityRuleDetailResponse getQualityRuleDetailResponse, UnmarshallerContext _ctx) {
		
		getQualityRuleDetailResponse.setRequestId(_ctx.stringValue("GetQualityRuleDetailResponse.RequestId"));
		getQualityRuleDetailResponse.setCode(_ctx.stringValue("GetQualityRuleDetailResponse.Code"));
		getQualityRuleDetailResponse.setMessage(_ctx.stringValue("GetQualityRuleDetailResponse.Message"));
		getQualityRuleDetailResponse.setSuccess(_ctx.booleanValue("GetQualityRuleDetailResponse.Success"));

		Data data = new Data();
		data.setMatchType(_ctx.integerValue("GetQualityRuleDetailResponse.Data.MatchType"));
		data.setRuleId(_ctx.longValue("GetQualityRuleDetailResponse.Data.RuleId"));
		data.setName(_ctx.stringValue("GetQualityRuleDetailResponse.Data.Name"));
		data.setRuleCreateTime(_ctx.stringValue("GetQualityRuleDetailResponse.Data.RuleCreateTime"));
		data.setRuleTag(_ctx.integerValue("GetQualityRuleDetailResponse.Data.RuleTag"));

		List<String> keyWords = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityRuleDetailResponse.Data.KeyWords.Length"); i++) {
			keyWords.add(_ctx.stringValue("GetQualityRuleDetailResponse.Data.KeyWords["+ i +"]"));
		}
		data.setKeyWords(keyWords);
		getQualityRuleDetailResponse.setData(data);
	 
	 	return getQualityRuleDetailResponse;
	}
}