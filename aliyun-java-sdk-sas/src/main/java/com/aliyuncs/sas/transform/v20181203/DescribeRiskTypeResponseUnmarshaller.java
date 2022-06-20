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

import com.aliyuncs.sas.model.v20181203.DescribeRiskTypeResponse;
import com.aliyuncs.sas.model.v20181203.DescribeRiskTypeResponse.RiskType;
import com.aliyuncs.sas.model.v20181203.DescribeRiskTypeResponse.RiskType.SubType;
import com.aliyuncs.sas.model.v20181203.DescribeRiskTypeResponse.RiskType.SubType.CheckDetail;
import com.aliyuncs.sas.model.v20181203.DescribeRiskTypeResponse.RiskType.SubType.CheckDetail.Rule;
import com.aliyuncs.sas.model.v20181203.DescribeRiskTypeResponse.RiskType.SubType.CheckDetail.Rule.Param;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRiskTypeResponseUnmarshaller {

	public static DescribeRiskTypeResponse unmarshall(DescribeRiskTypeResponse describeRiskTypeResponse, UnmarshallerContext _ctx) {
		
		describeRiskTypeResponse.setRequestId(_ctx.stringValue("DescribeRiskTypeResponse.RequestId"));

		List<RiskType> riskTypes = new ArrayList<RiskType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRiskTypeResponse.RiskTypes.Length"); i++) {
			RiskType riskType = new RiskType();
			riskType.setTypeName(_ctx.stringValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].TypeName"));
			riskType.setAlias(_ctx.stringValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].Alias"));

			List<SubType> subTypes = new ArrayList<SubType>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes.Length"); j++) {
				SubType subType = new SubType();
				subType.setTypeName(_ctx.stringValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes["+ j +"].TypeName"));
				subType.setAlias(_ctx.stringValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes["+ j +"].Alias"));

				List<CheckDetail> checkDetails = new ArrayList<CheckDetail>();
				for (int k = 0; k < _ctx.lengthValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes["+ j +"].CheckDetails.Length"); k++) {
					CheckDetail checkDetail = new CheckDetail();
					checkDetail.setCheckId(_ctx.longValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].CheckId"));
					checkDetail.setCheckItem(_ctx.stringValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].CheckItem"));
					checkDetail.setCheckDesc(_ctx.stringValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].CheckDesc"));

					List<Rule> rules = new ArrayList<Rule>();
					for (int l = 0; l < _ctx.lengthValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules.Length"); l++) {
						Rule rule = new Rule();
						rule.setOptional(_ctx.integerValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].Optional"));
						rule.setRuleDesc(_ctx.stringValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].RuleDesc"));
						rule.setDefaultValue(_ctx.integerValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].DefaultValue"));
						rule.setRuleId(_ctx.stringValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].RuleId"));

						List<Param> paramList = new ArrayList<Param>();
						for (int m = 0; m < _ctx.lengthValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].ParamList.Length"); m++) {
							Param param = new Param();
							param.setParamDefaultValue(_ctx.stringValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].ParamList["+ m +"].ParamDefaultValue"));
							param.setParamName(_ctx.stringValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].ParamList["+ m +"].ParamName"));
							param.setMaxValue(_ctx.integerValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].ParamList["+ m +"].MaxValue"));
							param.setParamType(_ctx.integerValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].ParamList["+ m +"].ParamType"));
							param.setParamDesc(_ctx.stringValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].ParamList["+ m +"].ParamDesc"));
							param.setMinValue(_ctx.integerValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].ParamList["+ m +"].MinValue"));
							param.setEnumValue(_ctx.stringValue("DescribeRiskTypeResponse.RiskTypes["+ i +"].SubTypes["+ j +"].CheckDetails["+ k +"].Rules["+ l +"].ParamList["+ m +"].EnumValue"));

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
			riskType.setSubTypes(subTypes);

			riskTypes.add(riskType);
		}
		describeRiskTypeResponse.setRiskTypes(riskTypes);
	 
	 	return describeRiskTypeResponse;
	}
}