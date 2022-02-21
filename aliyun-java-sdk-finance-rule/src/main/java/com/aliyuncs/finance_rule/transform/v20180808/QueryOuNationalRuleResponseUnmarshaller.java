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

import com.aliyuncs.finance_rule.model.v20180808.QueryOuNationalRuleResponse;
import com.aliyuncs.finance_rule.model.v20180808.QueryOuNationalRuleResponse.ExtendInfo;
import com.aliyuncs.finance_rule.model.v20180808.QueryOuNationalRuleResponse.FinanceRuleOuNationalRuleDTO;
import com.aliyuncs.finance_rule.model.v20180808.QueryOuNationalRuleResponse.FinanceRuleOuNationalRuleDTO.FinanceRuleOuDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOuNationalRuleResponseUnmarshaller {

	public static QueryOuNationalRuleResponse unmarshall(QueryOuNationalRuleResponse queryOuNationalRuleResponse, UnmarshallerContext _ctx) {
		
		queryOuNationalRuleResponse.setResultMessage(_ctx.stringValue("QueryOuNationalRuleResponse.ResultMessage"));
		queryOuNationalRuleResponse.setResultCode(_ctx.stringValue("QueryOuNationalRuleResponse.ResultCode"));
		queryOuNationalRuleResponse.setRemark(_ctx.stringValue("QueryOuNationalRuleResponse.Remark"));
		queryOuNationalRuleResponse.setSuccess(_ctx.booleanValue("QueryOuNationalRuleResponse.Success"));

		ExtendInfo extendInfo = new ExtendInfo();
		extendInfo.setPlaceHolder1(_ctx.stringValue("QueryOuNationalRuleResponse.ExtendInfo.PlaceHolder1"));
		queryOuNationalRuleResponse.setExtendInfo(extendInfo);

		List<FinanceRuleOuNationalRuleDTO> resultObj = new ArrayList<FinanceRuleOuNationalRuleDTO>();
		for (int i = 0; i < _ctx.lengthValue("QueryOuNationalRuleResponse.ResultObj.Length"); i++) {
			FinanceRuleOuNationalRuleDTO financeRuleOuNationalRuleDTO = new FinanceRuleOuNationalRuleDTO();
			financeRuleOuNationalRuleDTO.setCountryCode(_ctx.stringValue("QueryOuNationalRuleResponse.ResultObj["+ i +"].CountryCode"));
			financeRuleOuNationalRuleDTO.setCountryNameCn(_ctx.stringValue("QueryOuNationalRuleResponse.ResultObj["+ i +"].CountryNameCn"));
			financeRuleOuNationalRuleDTO.setBid(_ctx.stringValue("QueryOuNationalRuleResponse.ResultObj["+ i +"].Bid"));
			financeRuleOuNationalRuleDTO.setCountryNameEn(_ctx.stringValue("QueryOuNationalRuleResponse.ResultObj["+ i +"].CountryNameEn"));

			List<FinanceRuleOuDTO> ouRuleDTOS = new ArrayList<FinanceRuleOuDTO>();
			for (int j = 0; j < _ctx.lengthValue("QueryOuNationalRuleResponse.ResultObj["+ i +"].OuRuleDTOS.Length"); j++) {
				FinanceRuleOuDTO financeRuleOuDTO = new FinanceRuleOuDTO();
				financeRuleOuDTO.setOuCode(_ctx.stringValue("QueryOuNationalRuleResponse.ResultObj["+ i +"].OuRuleDTOS["+ j +"].OuCode"));
				financeRuleOuDTO.setPreChargeRate(_ctx.floatValue("QueryOuNationalRuleResponse.ResultObj["+ i +"].OuRuleDTOS["+ j +"].PreChargeRate"));
				financeRuleOuDTO.setIsPrePayTaxes(_ctx.integerValue("QueryOuNationalRuleResponse.ResultObj["+ i +"].OuRuleDTOS["+ j +"].IsPrePayTaxes"));
				financeRuleOuDTO.setOuName(_ctx.stringValue("QueryOuNationalRuleResponse.ResultObj["+ i +"].OuRuleDTOS["+ j +"].OuName"));
				financeRuleOuDTO.setPreChargeMinPrice(_ctx.floatValue("QueryOuNationalRuleResponse.ResultObj["+ i +"].OuRuleDTOS["+ j +"].PreChargeMinPrice"));
				financeRuleOuDTO.setCompanyEntity(_ctx.stringValue("QueryOuNationalRuleResponse.ResultObj["+ i +"].OuRuleDTOS["+ j +"].CompanyEntity"));
				financeRuleOuDTO.setMinCurrency(_ctx.stringValue("QueryOuNationalRuleResponse.ResultObj["+ i +"].OuRuleDTOS["+ j +"].MinCurrency"));

				List<String> settlementCurrencyList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryOuNationalRuleResponse.ResultObj["+ i +"].OuRuleDTOS["+ j +"].SettlementCurrencyList.Length"); k++) {
					settlementCurrencyList.add(_ctx.stringValue("QueryOuNationalRuleResponse.ResultObj["+ i +"].OuRuleDTOS["+ j +"].SettlementCurrencyList["+ k +"]"));
				}
				financeRuleOuDTO.setSettlementCurrencyList(settlementCurrencyList);

				List<String> priceCurrencyList = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryOuNationalRuleResponse.ResultObj["+ i +"].OuRuleDTOS["+ j +"].PriceCurrencyList.Length"); k++) {
					priceCurrencyList.add(_ctx.stringValue("QueryOuNationalRuleResponse.ResultObj["+ i +"].OuRuleDTOS["+ j +"].PriceCurrencyList["+ k +"]"));
				}
				financeRuleOuDTO.setPriceCurrencyList(priceCurrencyList);

				ouRuleDTOS.add(financeRuleOuDTO);
			}
			financeRuleOuNationalRuleDTO.setOuRuleDTOS(ouRuleDTOS);

			resultObj.add(financeRuleOuNationalRuleDTO);
		}
		queryOuNationalRuleResponse.setResultObj(resultObj);
	 
	 	return queryOuNationalRuleResponse;
	}
}