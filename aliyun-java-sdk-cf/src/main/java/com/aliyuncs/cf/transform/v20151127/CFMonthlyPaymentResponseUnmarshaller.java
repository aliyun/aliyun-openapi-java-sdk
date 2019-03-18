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

import com.aliyuncs.cf.model.v20151127.CFMonthlyPaymentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CFMonthlyPaymentResponseUnmarshaller {

	public static CFMonthlyPaymentResponse unmarshall(CFMonthlyPaymentResponse cFMonthlyPaymentResponse, UnmarshallerContext context) {
		
		cFMonthlyPaymentResponse.setRequestId(context.stringValue("CFMonthlyPaymentResponse.requestId"));
		cFMonthlyPaymentResponse.setData(context.booleanValue("CFMonthlyPaymentResponse.data"));
		cFMonthlyPaymentResponse.setCode(context.stringValue("CFMonthlyPaymentResponse.code"));
		cFMonthlyPaymentResponse.setSuccess(context.booleanValue("CFMonthlyPaymentResponse.success"));
		cFMonthlyPaymentResponse.setMessage(context.stringValue("CFMonthlyPaymentResponse.message"));
		cFMonthlyPaymentResponse.setSynchro(context.booleanValue("CFMonthlyPaymentResponse.synchro"));
	 
	 	return cFMonthlyPaymentResponse;
	}
}