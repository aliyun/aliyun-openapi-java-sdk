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

import com.aliyuncs.finance_rule.model.v20180808.QueryFinanceRuleByCodeResponse;
import com.aliyuncs.finance_rule.model.v20180808.QueryFinanceRuleByCodeResponse.ExtendInfo;
import com.aliyuncs.finance_rule.model.v20180808.QueryFinanceRuleByCodeResponse.ResultObj;
import com.aliyuncs.finance_rule.model.v20180808.QueryFinanceRuleByCodeResponse.ResultObj.FinanceGoodsRuleConditionDtlDTO;
import com.aliyuncs.finance_rule.model.v20180808.QueryFinanceRuleByCodeResponse.ResultObj.FinanceRuleGoodsAddDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFinanceRuleByCodeResponseUnmarshaller {

	public static QueryFinanceRuleByCodeResponse unmarshall(QueryFinanceRuleByCodeResponse queryFinanceRuleByCodeResponse, UnmarshallerContext _ctx) {
		
		queryFinanceRuleByCodeResponse.setResultMessage(_ctx.stringValue("QueryFinanceRuleByCodeResponse.ResultMessage"));
		queryFinanceRuleByCodeResponse.setResultCode(_ctx.stringValue("QueryFinanceRuleByCodeResponse.ResultCode"));
		queryFinanceRuleByCodeResponse.setRemark(_ctx.stringValue("QueryFinanceRuleByCodeResponse.Remark"));
		queryFinanceRuleByCodeResponse.setSuccess(_ctx.booleanValue("QueryFinanceRuleByCodeResponse.Success"));

		ResultObj resultObj = new ResultObj();

		FinanceRuleGoodsAddDTO financeRuleGoodsAddDTO = new FinanceRuleGoodsAddDTO();
		financeRuleGoodsAddDTO.setCode(_ctx.stringValue("QueryFinanceRuleByCodeResponse.ResultObj.FinanceRuleGoodsAddDTO.Code"));
		financeRuleGoodsAddDTO.setSkuName(_ctx.stringValue("QueryFinanceRuleByCodeResponse.ResultObj.FinanceRuleGoodsAddDTO.SkuName"));
		resultObj.setFinanceRuleGoodsAddDTO(financeRuleGoodsAddDTO);

		FinanceGoodsRuleConditionDtlDTO financeGoodsRuleConditionDtlDTO = new FinanceGoodsRuleConditionDtlDTO();
		financeGoodsRuleConditionDtlDTO.setInvoiceContent(_ctx.stringValue("QueryFinanceRuleByCodeResponse.ResultObj.FinanceGoodsRuleConditionDtlDTO.InvoiceContent"));
		financeGoodsRuleConditionDtlDTO.setInvoiceCountry(_ctx.stringValue("QueryFinanceRuleByCodeResponse.ResultObj.FinanceGoodsRuleConditionDtlDTO.InvoiceCountry"));
		financeGoodsRuleConditionDtlDTO.setInvoiceOu(_ctx.stringValue("QueryFinanceRuleByCodeResponse.ResultObj.FinanceGoodsRuleConditionDtlDTO.InvoiceOu"));
		financeGoodsRuleConditionDtlDTO.setInvoiceRate(_ctx.stringValue("QueryFinanceRuleByCodeResponse.ResultObj.FinanceGoodsRuleConditionDtlDTO.InvoiceRate"));
		financeGoodsRuleConditionDtlDTO.setInvoiceRateItem(_ctx.stringValue("QueryFinanceRuleByCodeResponse.ResultObj.FinanceGoodsRuleConditionDtlDTO.InvoiceRateItem"));
		financeGoodsRuleConditionDtlDTO.setInvoiceContentType(_ctx.integerValue("QueryFinanceRuleByCodeResponse.ResultObj.FinanceGoodsRuleConditionDtlDTO.InvoiceContentType"));
		resultObj.setFinanceGoodsRuleConditionDtlDTO(financeGoodsRuleConditionDtlDTO);
		queryFinanceRuleByCodeResponse.setResultObj(resultObj);

		ExtendInfo extendInfo = new ExtendInfo();
		extendInfo.setPlaceHolder1(_ctx.stringValue("QueryFinanceRuleByCodeResponse.ExtendInfo.PlaceHolder1"));
		queryFinanceRuleByCodeResponse.setExtendInfo(extendInfo);
	 
	 	return queryFinanceRuleByCodeResponse;
	}
}