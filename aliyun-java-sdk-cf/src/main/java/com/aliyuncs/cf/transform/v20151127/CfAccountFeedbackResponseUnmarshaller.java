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
package com.aliyuncs.cf.transform.v20151127;

import com.aliyuncs.cf.model.v20151127.CfAccountFeedbackResponse;
import com.aliyuncs.cf.model.v20151127.CfAccountFeedbackResponse.AccountFeedbackResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CfAccountFeedbackResponseUnmarshaller {

	public static CfAccountFeedbackResponse unmarshall(CfAccountFeedbackResponse cfAccountFeedbackResponse, UnmarshallerContext context) {
		
		cfAccountFeedbackResponse.setRequestId(context.stringValue("CfAccountFeedbackResponse.RequestId"));
		cfAccountFeedbackResponse.setSuccess(context.booleanValue("CfAccountFeedbackResponse.Success"));
		cfAccountFeedbackResponse.setMessage(context.stringValue("CfAccountFeedbackResponse.Message"));
		cfAccountFeedbackResponse.setDetailMessage(context.stringValue("CfAccountFeedbackResponse.DetailMessage"));

		AccountFeedbackResponse accountFeedbackResponse = new AccountFeedbackResponse();
		accountFeedbackResponse.setErrorCode(context.integerValue("CfAccountFeedbackResponse.AccountFeedbackResponse.ErrorCode"));
		accountFeedbackResponse.setErrorMessage(context.stringValue("CfAccountFeedbackResponse.AccountFeedbackResponse.ErrorMessage"));
		cfAccountFeedbackResponse.setAccountFeedbackResponse(accountFeedbackResponse);
	 
	 	return cfAccountFeedbackResponse;
	}
}