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

import com.aliyuncs.aiccs.model.v20191015.GetQualityRuleListResponse;
import com.aliyuncs.aiccs.model.v20191015.GetQualityRuleListResponse.Data;
import com.aliyuncs.aiccs.model.v20191015.GetQualityRuleListResponse.Data.QualityRuleListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualityRuleListResponseUnmarshaller {

	public static GetQualityRuleListResponse unmarshall(GetQualityRuleListResponse getQualityRuleListResponse, UnmarshallerContext _ctx) {
		
		getQualityRuleListResponse.setRequestId(_ctx.stringValue("GetQualityRuleListResponse.RequestId"));
		getQualityRuleListResponse.setMessage(_ctx.stringValue("GetQualityRuleListResponse.Message"));
		getQualityRuleListResponse.setCode(_ctx.stringValue("GetQualityRuleListResponse.Code"));
		getQualityRuleListResponse.setSuccess(_ctx.booleanValue("GetQualityRuleListResponse.Success"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("GetQualityRuleListResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("GetQualityRuleListResponse.Data.Total"));
		data.setPageNo(_ctx.integerValue("GetQualityRuleListResponse.Data.PageNo"));

		List<QualityRuleListItem> qualityRuleList = new ArrayList<QualityRuleListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityRuleListResponse.Data.QualityRuleList.Length"); i++) {
			QualityRuleListItem qualityRuleListItem = new QualityRuleListItem();
			qualityRuleListItem.setRuleCreateTime(_ctx.stringValue("GetQualityRuleListResponse.Data.QualityRuleList["+ i +"].RuleCreateTime"));
			qualityRuleListItem.setMatchType(_ctx.integerValue("GetQualityRuleListResponse.Data.QualityRuleList["+ i +"].MatchType"));
			qualityRuleListItem.setRuleId(_ctx.longValue("GetQualityRuleListResponse.Data.QualityRuleList["+ i +"].RuleId"));
			qualityRuleListItem.setRuleTag(_ctx.integerValue("GetQualityRuleListResponse.Data.QualityRuleList["+ i +"].RuleTag"));
			qualityRuleListItem.setName(_ctx.stringValue("GetQualityRuleListResponse.Data.QualityRuleList["+ i +"].Name"));

			List<String> keyWords = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetQualityRuleListResponse.Data.QualityRuleList["+ i +"].KeyWords.Length"); j++) {
				keyWords.add(_ctx.stringValue("GetQualityRuleListResponse.Data.QualityRuleList["+ i +"].KeyWords["+ j +"]"));
			}
			qualityRuleListItem.setKeyWords(keyWords);

			qualityRuleList.add(qualityRuleListItem);
		}
		data.setQualityRuleList(qualityRuleList);
		getQualityRuleListResponse.setData(data);
	 
	 	return getQualityRuleListResponse;
	}
}