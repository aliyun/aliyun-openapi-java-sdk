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

import com.aliyuncs.sas.model.v20181203.DescribeStrategyDetailResponse;
import com.aliyuncs.sas.model.v20181203.DescribeStrategyDetailResponse.Strategy;
import com.aliyuncs.sas.model.v20181203.DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResult;
import com.aliyuncs.sas.model.v20181203.DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResult.SubType;
import com.aliyuncs.sas.model.v20181203.DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResult.SubType.CheckDetail;
import com.aliyuncs.sas.model.v20181203.DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResult.SubType.CheckDetail.Rule;
import com.aliyuncs.sas.model.v20181203.DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResult.SubType.CheckDetail.Rule.Param;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStrategyDetailResponseUnmarshaller {

	public static DescribeStrategyDetailResponse unmarshall(DescribeStrategyDetailResponse describeStrategyDetailResponse, UnmarshallerContext _ctx) {
		
		describeStrategyDetailResponse.setRequestId(_ctx.stringValue("DescribeStrategyDetailResponse.RequestId"));

		Strategy strategy = new Strategy();
		strategy.setType(_ctx.integerValue("DescribeStrategyDetailResponse.Strategy.Type"));
		strategy.setCycleDays(_ctx.integerValue("DescribeStrategyDetailResponse.Strategy.CycleDays"));
		strategy.setName(_ctx.stringValue("DescribeStrategyDetailResponse.Strategy.Name"));
		strategy.setId(_ctx.integerValue("DescribeStrategyDetailResponse.Strategy.Id"));
		strategy.setCycleStartTime(_ctx.integerValue("DescribeStrategyDetailResponse.Strategy.CycleStartTime"));

		List<RiskTypeWhiteListQueryResult> riskTypeWhiteListQueryResultList = new ArrayList<RiskTypeWhiteListQueryResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList.Length"); i++) {
			RiskTypeWhiteListQueryResult riskTypeWhiteListQueryResult = new RiskTypeWhiteListQueryResult();
			riskTypeWhiteListQueryResult.setTypeName(_ctx.stringValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].TypeName"));
			riskTypeWhiteListQueryResult.setAlias(_ctx.stringValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].Alias"));
			riskTypeWhiteListQueryResult.setOn(_ctx.booleanValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].On"));

			List<SubType> subTypes = new ArrayList<SubType>();
			for (int j = 0; j < _ctx.lengthValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes.Length"); j++) {
				SubType subType = new SubType();
				subType.setTypeName(_ctx.stringValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].TypeName"));
				subType.setAlias(_ctx.stringValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].Alias"));
				subType.setOn(_ctx.booleanValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].On"));

				List<CheckDetail> checkDetails = new ArrayList<CheckDetail>();
				for (int k = 0; k < _ctx.lengthValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].CheckDetails.Length"); k++) {
					CheckDetail checkDetail = new CheckDetail();
					checkDetail.setCheckId(_ctx.longValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].CheckId"));
					checkDetail.setCheckItem(_ctx.stringValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].CheckItem"));
					checkDetail.setCheckDesc(_ctx.stringValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].CheckDesc"));

					List<Rule> rules = new ArrayList<Rule>();
					for (int l = 0; l < _ctx.lengthValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules.Length"); l++) {
						Rule rule = new Rule();
						rule.setOptional(_ctx.integerValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].Optional"));
						rule.setRuleDesc(_ctx.stringValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].RuleDesc"));
						rule.setDefaultValue(_ctx.integerValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].DefaultValue"));
						rule.setRuleId(_ctx.stringValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].RuleId"));

						List<Param> paramList = new ArrayList<Param>();
						for (int m = 0; m < _ctx.lengthValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].ParamList.Length"); m++) {
							Param param = new Param();
							param.setParamDefaultValue(_ctx.stringValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].ParamList["+ m +"].ParamDefaultValue"));
							param.setValue(_ctx.stringValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].ParamList["+ m +"].Value"));
							param.setParamName(_ctx.stringValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].ParamList["+ m +"].ParamName"));
							param.setMaxValue(_ctx.integerValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].ParamList["+ m +"].MaxValue"));
							param.setParamType(_ctx.integerValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].ParamList["+ m +"].ParamType"));
							param.setParamDesc(_ctx.stringValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].ParamList["+ m +"].ParamDesc"));
							param.setMinValue(_ctx.integerValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].ParamList["+ m +"].MinValue"));
							param.setEnumValue(_ctx.stringValue("DescribeStrategyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].ParamList["+ m +"].EnumValue"));

							paramList.add(param);
						}
						rule.setParamList(paramList);

						rules.add(rule);
					}
					checkDetail.setRules(rules);

					checkDetails.add(checkDetail);
				}
				subType.setCheckDetails(checkDetails);

				subTypes.add(subType);
			}
			riskTypeWhiteListQueryResult.setSubTypes(subTypes);

			riskTypeWhiteListQueryResultList.add(riskTypeWhiteListQueryResult);
		}
		strategy.setRiskTypeWhiteListQueryResultList(riskTypeWhiteListQueryResultList);
		describeStrategyDetailResponse.setStrategy(strategy);
	 
	 	return describeStrategyDetailResponse;
	}
}