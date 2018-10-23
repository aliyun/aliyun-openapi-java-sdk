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

import com.aliyuncs.finmall.model.v20180723.GetRepayPlanTrialResponse;
import com.aliyuncs.finmall.model.v20180723.GetRepayPlanTrialResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRepayPlanTrialResponseUnmarshaller {

	public static GetRepayPlanTrialResponse unmarshall(GetRepayPlanTrialResponse getRepayPlanTrialResponse, UnmarshallerContext context) {
		
		getRepayPlanTrialResponse.setRequestId(context.stringValue("GetRepayPlanTrialResponse.RequestId"));
		getRepayPlanTrialResponse.setCode(context.stringValue("GetRepayPlanTrialResponse.Code"));
		getRepayPlanTrialResponse.setMessage(context.stringValue("GetRepayPlanTrialResponse.Message"));

		Data data = new Data();
		data.setAmount(context.stringValue("GetRepayPlanTrialResponse.Data.Amount"));
		data.setPlan(context.stringValue("GetRepayPlanTrialResponse.Data.Plan"));
		data.setTerms(context.stringValue("GetRepayPlanTrialResponse.Data.Terms"));
		data.setLoanRate(context.stringValue("GetRepayPlanTrialResponse.Data.LoanRate"));
		data.setRepayMethod(context.stringValue("GetRepayPlanTrialResponse.Data.RepayMethod"));
		data.setPrepayment(context.stringValue("GetRepayPlanTrialResponse.Data.Prepayment"));
		getRepayPlanTrialResponse.setData(data);
	 
	 	return getRepayPlanTrialResponse;
	}
}