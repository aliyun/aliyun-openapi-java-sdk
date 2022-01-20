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

package com.aliyuncs.finance_rule.transform.v20180808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.finance_rule.model.v20180808.QueryOuRuleResponse;
import com.aliyuncs.finance_rule.model.v20180808.QueryOuRuleResponse.ExtendInfo;
import com.aliyuncs.finance_rule.model.v20180808.QueryOuRuleResponse.FinanceRuleOuDto;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOuRuleResponseUnmarshaller {

	public static QueryOuRuleResponse unmarshall(QueryOuRuleResponse queryOuRuleResponse, UnmarshallerContext _ctx) {
		
		queryOuRuleResponse.setResultMessage(_ctx.stringValue("QueryOuRuleResponse.ResultMessage"));
		queryOuRuleResponse.setResultCode(_ctx.stringValue("QueryOuRuleResponse.ResultCode"));
		queryOuRuleResponse.setRemark(_ctx.stringValue("QueryOuRuleResponse.Remark"));
		queryOuRuleResponse.setSuccess(_ctx.booleanValue("QueryOuRuleResponse.Success"));

		ExtendInfo extendInfo = new ExtendInfo();
		extendInfo.setPlaceHolder1(_ctx.stringValue("QueryOuRuleResponse.ExtendInfo.PlaceHolder1"));
		queryOuRuleResponse.setExtendInfo(extendInfo);

		List<FinanceRuleOuDto> resultObj = new ArrayList<FinanceRuleOuDto>();
		for (int i = 0; i < _ctx.lengthValue("QueryOuRuleResponse.ResultObj.Length"); i++) {
			FinanceRuleOuDto financeRuleOuDto = new FinanceRuleOuDto();
			financeRuleOuDto.setOuCode(_ctx.stringValue("QueryOuRuleResponse.ResultObj["+ i +"].OuCode"));
			financeRuleOuDto.setPreChargeRate(_ctx.floatValue("QueryOuRuleResponse.ResultObj["+ i +"].PreChargeRate"));
			financeRuleOuDto.setIsPrePayTaxes(_ctx.integerValue("QueryOuRuleResponse.ResultObj["+ i +"].IsPrePayTaxes"));
			financeRuleOuDto.setOuName(_ctx.stringValue("QueryOuRuleResponse.ResultObj["+ i +"].OuName"));
			financeRuleOuDto.setPreChargeMinPrice(_ctx.floatValue("QueryOuRuleResponse.ResultObj["+ i +"].PreChargeMinPrice"));
			financeRuleOuDto.setCompanyEntity(_ctx.stringValue("QueryOuRuleResponse.ResultObj["+ i +"].CompanyEntity"));
			financeRuleOuDto.setMinCurrency(_ctx.stringValue("QueryOuRuleResponse.ResultObj["+ i +"].MinCurrency"));

			List<String> settlementCurrencyList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryOuRuleResponse.ResultObj["+ i +"].SettlementCurrencyList.Length"); j++) {
				settlementCurrencyList.add(_ctx.stringValue("QueryOuRuleResponse.ResultObj["+ i +"].SettlementCurrencyList["+ j +"]"));
			}
			financeRuleOuDto.setSettlementCurrencyList(settlementCurrencyList);

			List<String> priceCurrencyList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryOuRuleResponse.ResultObj["+ i +"].PriceCurrencyList.Length"); j++) {
				priceCurrencyList.add(_ctx.stringValue("QueryOuRuleResponse.ResultObj["+ i +"].PriceCurrencyList["+ j +"]"));
			}
			financeRuleOuDto.setPriceCurrencyList(priceCurrencyList);

			resultObj.add(financeRuleOuDto);
		}
		queryOuRuleResponse.setResultObj(resultObj);
	 
	 	return queryOuRuleResponse;
	}
}