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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.ListQualityCheckSchemeResponse;
import com.aliyuncs.qualitycheck.model.v20190115.ListQualityCheckSchemeResponse.DataItem;
import com.aliyuncs.qualitycheck.model.v20190115.ListQualityCheckSchemeResponse.DataItem.RuleListItem;
import com.aliyuncs.qualitycheck.model.v20190115.ListQualityCheckSchemeResponse.DataItem.RuleListItem.RulesItem;
import com.aliyuncs.qualitycheck.model.v20190115.ListQualityCheckSchemeResponse.DataItem.SchemeCheckTypeListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQualityCheckSchemeResponseUnmarshaller {

	public static ListQualityCheckSchemeResponse unmarshall(ListQualityCheckSchemeResponse listQualityCheckSchemeResponse, UnmarshallerContext _ctx) {
		
		listQualityCheckSchemeResponse.setRequestId(_ctx.stringValue("ListQualityCheckSchemeResponse.RequestId"));
		listQualityCheckSchemeResponse.setSuccess(_ctx.booleanValue("ListQualityCheckSchemeResponse.Success"));
		listQualityCheckSchemeResponse.setResultCountId(_ctx.stringValue("ListQualityCheckSchemeResponse.ResultCountId"));
		listQualityCheckSchemeResponse.setCode(_ctx.stringValue("ListQualityCheckSchemeResponse.Code"));
		listQualityCheckSchemeResponse.setMessage(_ctx.stringValue("ListQualityCheckSchemeResponse.Message"));
		listQualityCheckSchemeResponse.setPageNumber(_ctx.integerValue("ListQualityCheckSchemeResponse.PageNumber"));
		listQualityCheckSchemeResponse.setPageSize(_ctx.integerValue("ListQualityCheckSchemeResponse.PageSize"));
		listQualityCheckSchemeResponse.setCount(_ctx.integerValue("ListQualityCheckSchemeResponse.Count"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListQualityCheckSchemeResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSchemeId(_ctx.longValue("ListQualityCheckSchemeResponse.Data["+ i +"].SchemeId"));
			dataItem.setName(_ctx.stringValue("ListQualityCheckSchemeResponse.Data["+ i +"].Name"));
			dataItem.setDescription(_ctx.stringValue("ListQualityCheckSchemeResponse.Data["+ i +"].Description"));
			dataItem.setDataType(_ctx.integerValue("ListQualityCheckSchemeResponse.Data["+ i +"].DataType"));
			dataItem.setType(_ctx.integerValue("ListQualityCheckSchemeResponse.Data["+ i +"].Type"));
			dataItem.setTemplateType(_ctx.integerValue("ListQualityCheckSchemeResponse.Data["+ i +"].TemplateType"));
			dataItem.setStatus(_ctx.integerValue("ListQualityCheckSchemeResponse.Data["+ i +"].Status"));
			dataItem.setCreateUserName(_ctx.stringValue("ListQualityCheckSchemeResponse.Data["+ i +"].CreateUserName"));
			dataItem.setCreateTime(_ctx.stringValue("ListQualityCheckSchemeResponse.Data["+ i +"].CreateTime"));
			dataItem.setUpdateUserName(_ctx.stringValue("ListQualityCheckSchemeResponse.Data["+ i +"].UpdateUserName"));
			dataItem.setUpdateTime(_ctx.stringValue("ListQualityCheckSchemeResponse.Data["+ i +"].UpdateTime"));
			dataItem.setVersion(_ctx.longValue("ListQualityCheckSchemeResponse.Data["+ i +"].Version"));

			List<SchemeCheckTypeListItem> schemeCheckTypeList = new ArrayList<SchemeCheckTypeListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListQualityCheckSchemeResponse.Data["+ i +"].SchemeCheckTypeList.Length"); j++) {
				SchemeCheckTypeListItem schemeCheckTypeListItem = new SchemeCheckTypeListItem();
				schemeCheckTypeListItem.setCheckType(_ctx.integerValue("ListQualityCheckSchemeResponse.Data["+ i +"].SchemeCheckTypeList["+ j +"].CheckType"));
				schemeCheckTypeListItem.setEnable(_ctx.integerValue("ListQualityCheckSchemeResponse.Data["+ i +"].SchemeCheckTypeList["+ j +"].Enable"));
				schemeCheckTypeListItem.setCheckName(_ctx.stringValue("ListQualityCheckSchemeResponse.Data["+ i +"].SchemeCheckTypeList["+ j +"].CheckName"));
				schemeCheckTypeListItem.setTargetType(_ctx.integerValue("ListQualityCheckSchemeResponse.Data["+ i +"].SchemeCheckTypeList["+ j +"].TargetType"));
				schemeCheckTypeListItem.setScore(_ctx.integerValue("ListQualityCheckSchemeResponse.Data["+ i +"].SchemeCheckTypeList["+ j +"].Score"));

				schemeCheckTypeList.add(schemeCheckTypeListItem);
			}
			dataItem.setSchemeCheckTypeList(schemeCheckTypeList);

			List<RuleListItem> ruleList = new ArrayList<RuleListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListQualityCheckSchemeResponse.Data["+ i +"].RuleList.Length"); j++) {
				RuleListItem ruleListItem = new RuleListItem();

				List<RulesItem> rules = new ArrayList<RulesItem>();
				for (int k = 0; k < _ctx.lengthValue("ListQualityCheckSchemeResponse.Data["+ i +"].RuleList["+ j +"].Rules.Length"); k++) {
					RulesItem rulesItem = new RulesItem();
					rulesItem.setRid(_ctx.longValue("ListQualityCheckSchemeResponse.Data["+ i +"].RuleList["+ j +"].Rules["+ k +"].Rid"));
					rulesItem.setName(_ctx.stringValue("ListQualityCheckSchemeResponse.Data["+ i +"].RuleList["+ j +"].Rules["+ k +"].Name"));
					rulesItem.setRuleScoreType(_ctx.integerValue("ListQualityCheckSchemeResponse.Data["+ i +"].RuleList["+ j +"].Rules["+ k +"].RuleScoreType"));
					rulesItem.setScoreNum(_ctx.integerValue("ListQualityCheckSchemeResponse.Data["+ i +"].RuleList["+ j +"].Rules["+ k +"].ScoreNum"));
					rulesItem.setScoreType(_ctx.integerValue("ListQualityCheckSchemeResponse.Data["+ i +"].RuleList["+ j +"].Rules["+ k +"].ScoreType"));
					rulesItem.setCheckType(_ctx.integerValue("ListQualityCheckSchemeResponse.Data["+ i +"].RuleList["+ j +"].Rules["+ k +"].CheckType"));
					rulesItem.setTargetType(_ctx.integerValue("ListQualityCheckSchemeResponse.Data["+ i +"].RuleList["+ j +"].Rules["+ k +"].TargetType"));
					rulesItem.setScoreNumType(_ctx.integerValue("ListQualityCheckSchemeResponse.Data["+ i +"].RuleList["+ j +"].Rules["+ k +"].ScoreNumType"));

					rules.add(rulesItem);
				}
				ruleListItem.setRules(rules);

				ruleList.add(ruleListItem);
			}
			dataItem.setRuleList(ruleList);

			data.add(dataItem);
		}
		listQualityCheckSchemeResponse.setData(data);
	 
	 	return listQualityCheckSchemeResponse;
	}
}