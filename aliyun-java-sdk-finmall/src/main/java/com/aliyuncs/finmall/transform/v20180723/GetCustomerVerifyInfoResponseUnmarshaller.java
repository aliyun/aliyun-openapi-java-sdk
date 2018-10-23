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

import com.aliyuncs.finmall.model.v20180723.GetCustomerVerifyInfoResponse;
import com.aliyuncs.finmall.model.v20180723.GetCustomerVerifyInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCustomerVerifyInfoResponseUnmarshaller {

	public static GetCustomerVerifyInfoResponse unmarshall(GetCustomerVerifyInfoResponse getCustomerVerifyInfoResponse, UnmarshallerContext context) {
		
		getCustomerVerifyInfoResponse.setRequestId(context.stringValue("GetCustomerVerifyInfoResponse.RequestId"));
		getCustomerVerifyInfoResponse.setCode(context.stringValue("GetCustomerVerifyInfoResponse.Code"));
		getCustomerVerifyInfoResponse.setMessage(context.stringValue("GetCustomerVerifyInfoResponse.Message"));

		Data data = new Data();
		data.setLegalPersonName(context.stringValue("GetCustomerVerifyInfoResponse.Data.LegalPersonName"));
		data.setIdCardNumber(context.stringValue("GetCustomerVerifyInfoResponse.Data.IdCardNumber"));
		data.setEnterpriseName(context.stringValue("GetCustomerVerifyInfoResponse.Data.EnterpriseName"));
		data.setBusinessLicense(context.stringValue("GetCustomerVerifyInfoResponse.Data.BusinessLicense"));
		data.setAddress(context.stringValue("GetCustomerVerifyInfoResponse.Data.Address"));
		data.setPhoneNumber(context.stringValue("GetCustomerVerifyInfoResponse.Data.PhoneNumber"));
		data.setBankCard(context.stringValue("GetCustomerVerifyInfoResponse.Data.BankCard"));
		data.setLoanSubject(context.stringValue("GetCustomerVerifyInfoResponse.Data.LoanSubject"));
		data.setIdCardFrontPage(context.stringValue("GetCustomerVerifyInfoResponse.Data.IdCardFrontPage"));
		data.setIdCardBackPage(context.stringValue("GetCustomerVerifyInfoResponse.Data.IdCardBackPage"));
		data.setValidateTime(context.stringValue("GetCustomerVerifyInfoResponse.Data.ValidateTime"));
		data.setValidateState(context.stringValue("GetCustomerVerifyInfoResponse.Data.ValidateState"));
		data.setEmail(context.stringValue("GetCustomerVerifyInfoResponse.Data.Email"));
		getCustomerVerifyInfoResponse.setData(data);
	 
	 	return getCustomerVerifyInfoResponse;
	}
}