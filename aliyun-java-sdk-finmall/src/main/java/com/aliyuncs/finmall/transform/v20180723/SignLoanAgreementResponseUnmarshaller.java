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

import com.aliyuncs.finmall.model.v20180723.SignLoanAgreementResponse;
import com.aliyuncs.finmall.model.v20180723.SignLoanAgreementResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SignLoanAgreementResponseUnmarshaller {

	public static SignLoanAgreementResponse unmarshall(SignLoanAgreementResponse signLoanAgreementResponse, UnmarshallerContext context) {
		
		signLoanAgreementResponse.setRequestId(context.stringValue("SignLoanAgreementResponse.RequestId"));
		signLoanAgreementResponse.setCode(context.stringValue("SignLoanAgreementResponse.Code"));
		signLoanAgreementResponse.setMessage(context.stringValue("SignLoanAgreementResponse.Message"));

		Data data = new Data();
		data.setReturnCode(context.stringValue("SignLoanAgreementResponse.Data.ReturnCode"));
		signLoanAgreementResponse.setData(data);
	 
	 	return signLoanAgreementResponse;
	}
}