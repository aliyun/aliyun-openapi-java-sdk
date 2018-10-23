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

import com.aliyuncs.finmall.model.v20180723.GetCurrentTermRepayInfoResponse;
import com.aliyuncs.finmall.model.v20180723.GetCurrentTermRepayInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCurrentTermRepayInfoResponseUnmarshaller {

	public static GetCurrentTermRepayInfoResponse unmarshall(GetCurrentTermRepayInfoResponse getCurrentTermRepayInfoResponse, UnmarshallerContext context) {
		
		getCurrentTermRepayInfoResponse.setRequestId(context.stringValue("GetCurrentTermRepayInfoResponse.RequestId"));
		getCurrentTermRepayInfoResponse.setCode(context.stringValue("GetCurrentTermRepayInfoResponse.Code"));
		getCurrentTermRepayInfoResponse.setMessage(context.stringValue("GetCurrentTermRepayInfoResponse.Message"));

		Data data = new Data();
		data.setCreditId(context.stringValue("GetCurrentTermRepayInfoResponse.Data.CreditId"));
		data.setBalAmt(context.stringValue("GetCurrentTermRepayInfoResponse.Data.BalAmt"));
		data.setInterAmt(context.stringValue("GetCurrentTermRepayInfoResponse.Data.InterAmt"));
		data.setFineAmt(context.stringValue("GetCurrentTermRepayInfoResponse.Data.FineAmt"));
		data.setInterInter(context.stringValue("GetCurrentTermRepayInfoResponse.Data.InterInter"));
		data.setFineInter(context.stringValue("GetCurrentTermRepayInfoResponse.Data.FineInter"));
		data.setExpiryDate(context.stringValue("GetCurrentTermRepayInfoResponse.Data.ExpiryDate"));
		data.setLoanBalance(context.stringValue("GetCurrentTermRepayInfoResponse.Data.LoanBalance"));
		data.setTotalLoanAmount(context.stringValue("GetCurrentTermRepayInfoResponse.Data.TotalLoanAmount"));
		data.setRepayPrincipalAmount(context.stringValue("GetCurrentTermRepayInfoResponse.Data.RepayPrincipalAmount"));
		getCurrentTermRepayInfoResponse.setData(data);
	 
	 	return getCurrentTermRepayInfoResponse;
	}
}