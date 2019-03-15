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

import com.aliyuncs.finmall.model.v20180723.GetCreditStatusResponse;
import com.aliyuncs.finmall.model.v20180723.GetCreditStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCreditStatusResponseUnmarshaller {

	public static GetCreditStatusResponse unmarshall(GetCreditStatusResponse getCreditStatusResponse, UnmarshallerContext context) {
		
		getCreditStatusResponse.setRequestId(context.stringValue("GetCreditStatusResponse.RequestId"));
		getCreditStatusResponse.setCode(context.stringValue("GetCreditStatusResponse.Code"));
		getCreditStatusResponse.setMessage(context.stringValue("GetCreditStatusResponse.Message"));

		Data data = new Data();
		data.setStatus(context.stringValue("GetCreditStatusResponse.Data.Status"));
		data.setCreateTime(context.stringValue("GetCreditStatusResponse.Data.CreateTime"));
		data.setProductId(context.stringValue("GetCreditStatusResponse.Data.ProductId"));
		data.setFundPartyId(context.stringValue("GetCreditStatusResponse.Data.FundPartyId"));
		data.setTradeDataId(context.stringValue("GetCreditStatusResponse.Data.TradeDataId"));
		data.setCreditApproveComment(context.stringValue("GetCreditStatusResponse.Data.CreditApproveComment"));
		getCreditStatusResponse.setData(data);
	 
	 	return getCreditStatusResponse;
	}
}