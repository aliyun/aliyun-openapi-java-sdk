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

package com.aliyuncs.finmall.transform.v20180723;

import com.aliyuncs.finmall.model.v20180723.GetCreditDetailResponse;
import com.aliyuncs.finmall.model.v20180723.GetCreditDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCreditDetailResponseUnmarshaller {

	public static GetCreditDetailResponse unmarshall(GetCreditDetailResponse getCreditDetailResponse, UnmarshallerContext context) {
		
		getCreditDetailResponse.setRequestId(context.stringValue("GetCreditDetailResponse.RequestId"));
		getCreditDetailResponse.setCode(context.stringValue("GetCreditDetailResponse.Code"));
		getCreditDetailResponse.setMessage(context.stringValue("GetCreditDetailResponse.Message"));

		Data data = new Data();
		data.setCreditId(context.stringValue("GetCreditDetailResponse.Data.CreditId"));
		data.setProductName(context.stringValue("GetCreditDetailResponse.Data.ProductName"));
		data.setLineOfCredit(context.stringValue("GetCreditDetailResponse.Data.LineOfCredit"));
		data.setAmount(context.stringValue("GetCreditDetailResponse.Data.Amount"));
		data.setDebtorName(context.stringValue("GetCreditDetailResponse.Data.DebtorName"));
		data.setLoanBalance(context.stringValue("GetCreditDetailResponse.Data.LoanBalance"));
		data.setRepayPhase(context.stringValue("GetCreditDetailResponse.Data.RepayPhase"));
		data.setState(context.stringValue("GetCreditDetailResponse.Data.State"));
		data.setCreateDate(context.stringValue("GetCreditDetailResponse.Data.CreateDate"));
		data.setUpdateDate(context.stringValue("GetCreditDetailResponse.Data.UpdateDate"));
		data.setProductId(context.stringValue("GetCreditDetailResponse.Data.ProductId"));
		data.setFundPartyId(context.stringValue("GetCreditDetailResponse.Data.FundPartyId"));
		data.setDownPaymentAmount(context.stringValue("GetCreditDetailResponse.Data.DownPaymentAmount"));
		data.setDownPaymentRate(context.stringValue("GetCreditDetailResponse.Data.DownPaymentRate"));
		getCreditDetailResponse.setData(data);
	 
	 	return getCreditDetailResponse;
	}
}