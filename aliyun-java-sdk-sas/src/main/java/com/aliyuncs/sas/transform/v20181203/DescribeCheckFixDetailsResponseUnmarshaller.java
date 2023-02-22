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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeCheckFixDetailsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeCheckFixDetailsResponse.Data;
import com.aliyuncs.sas.model.v20181203.DescribeCheckFixDetailsResponse.Data.Rule;
import com.aliyuncs.sas.model.v20181203.DescribeCheckFixDetailsResponse.Data.Rule.ParamListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCheckFixDetailsResponseUnmarshaller {

	public static DescribeCheckFixDetailsResponse unmarshall(DescribeCheckFixDetailsResponse describeCheckFixDetailsResponse, UnmarshallerContext _ctx) {
		
		describeCheckFixDetailsResponse.setRequestId(_ctx.stringValue("DescribeCheckFixDetailsResponse.RequestId"));
		describeCheckFixDetailsResponse.setCount(_ctx.integerValue("DescribeCheckFixDetailsResponse.Count"));

		List<Data> checkFixDetails = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCheckFixDetailsResponse.CheckFixDetails.Length"); i++) {
			Data data = new Data();
			data.setCheckId(_ctx.longValue("DescribeCheckFixDetailsResponse.CheckFixDetails["+ i +"].CheckId"));
			data.setCheckItem(_ctx.stringValue("DescribeCheckFixDetailsResponse.CheckFixDetails["+ i +"].CheckItem"));
			data.setCheckDesc(_ctx.stringValue("DescribeCheckFixDetailsResponse.CheckFixDetails["+ i +"].CheckDesc"));

			List<Rule> rules = new ArrayList<Rule>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCheckFixDetailsResponse.CheckFixDetails["+ i +"].Rules.Length"); j++) {
				Rule rule = new Rule();
				rule.setRuleId(_ctx.stringValue("DescribeCheckFixDetailsResponse.CheckFixDetails["+ i +"].Rules["+ j +"].RuleId"));
				rule.setRuleDesc(_ctx.stringValue("DescribeCheckFixDetailsResponse.CheckFixDetails["+ i +"].Rules["+ j +"].RuleDesc"));
				rule.setVarName(_ctx.stringValue("DescribeCheckFixDetailsResponse.CheckFixDetails["+ i +"].Rules["+ j +"].VarName"));
				rule.setDefaultValue(_ctx.integerValue("DescribeCheckFixDetailsResponse.CheckFixDetails["+ i +"].Rules["+ j +"].DefaultValue"));
				rule.setOptional(_ctx.integerValue("DescribeCheckFixDetailsResponse.CheckFixDetails["+ i +"].Rules["+ j +"].Optional"));
				rule.setCheckId(_ctx.longValue("DescribeCheckFixDetailsResponse.CheckFixDetails["+ i +"].Rules["+ j +"].CheckId"));
				rule.setValue(_ctx.integerValue("DescribeCheckFixDetailsResponse.CheckFixDetails["+ i +"].Rules["+ j +"].Value"));

				List<ParamListItem> paramList = new ArrayList<ParamListItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeCheckFixDetailsResponse.CheckFixDetails["+ i +"].Rules["+ j +"].ParamList.Length"); k++) {
					ParamListItem paramListItem = new ParamListItem();
					paramListItem.setParamName(_ctx.stringValue("DescribeCheckFixDetailsResponse.CheckFixDetails["+ i +"].Rules["+ j +"].ParamList["+ k +"].ParamName"));
					paramListItem.setParamDesc(_ctx.stringValue("DescribeCheckFixDetailsResponse.CheckFixDetails["+ i +"].Rules["+ j +"].ParamList["+ k +"].ParamDesc"));
					paramListItem.setParamDefaultValue(_ctx.stringValue("DescribeCheckFixDetailsResponse.CheckFixDetails["+ i +"].Rules["+ j +"].ParamList["+ k +"].ParamDefaultValue"));
					paramListItem.setParamType(_ctx.integerValue("DescribeCheckFixDetailsResponse.CheckFixDetails["+ i +"].Rules["+ j +"].ParamList["+ k +"].ParamType"));
					paramListItem.setMinValue(_ctx.integerValue("DescribeCheckFixDetailsResponse.CheckFixDetails["+ i +"].Rules["+ j +"].ParamList["+ k +"].MinValue"));
					paramListItem.setMaxValue(_ctx.integerValue("DescribeCheckFixDetailsResponse.CheckFixDetails["+ i +"].Rules["+ j +"].ParamList["+ k +"].MaxValue"));
					paramListItem.setEnumValue(_ctx.stringValue("DescribeCheckFixDetailsResponse.CheckFixDetails["+ i +"].Rules["+ j +"].ParamList["+ k +"].EnumValue"));
					paramListItem.setValue(_ctx.stringValue("DescribeCheckFixDetailsResponse.CheckFixDetails["+ i +"].Rules["+ j +"].ParamList["+ k +"].Value"));
					paramListItem.setRuleId(_ctx.stringValue("DescribeCheckFixDetailsResponse.CheckFixDetails["+ i +"].Rules["+ j +"].ParamList["+ k +"].RuleId"));

					paramList.add(paramListItem);
				}
				rule.setParamList(paramList);

				rules.add(rule);
			}
			data.setRules(rules);

			checkFixDetails.add(data);
		}
		describeCheckFixDetailsResponse.setCheckFixDetails(checkFixDetails);
	 
	 	return describeCheckFixDetailsResponse;
	}
}