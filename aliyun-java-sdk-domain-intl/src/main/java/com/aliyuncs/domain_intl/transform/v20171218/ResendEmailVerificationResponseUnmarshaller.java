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

package com.aliyuncs.domain_intl.transform.v20171218;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain_intl.model.v20171218.ResendEmailVerificationResponse;
import com.aliyuncs.domain_intl.model.v20171218.ResendEmailVerificationResponse.SendResult;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResendEmailVerificationResponseUnmarshaller {

	public static ResendEmailVerificationResponse unmarshall(ResendEmailVerificationResponse resendEmailVerificationResponse, UnmarshallerContext context) {
		
		resendEmailVerificationResponse.setRequestId(context.stringValue("ResendEmailVerificationResponse.RequestId"));

		List<SendResult> successList = new ArrayList<SendResult>();
		for (int i = 0; i < context.lengthValue("ResendEmailVerificationResponse.SuccessList.Length"); i++) {
			SendResult sendResult = new SendResult();
			sendResult.setEmail(context.stringValue("ResendEmailVerificationResponse.SuccessList["+ i +"].Email"));
			sendResult.setCode(context.stringValue("ResendEmailVerificationResponse.SuccessList["+ i +"].Code"));
			sendResult.setMessage(context.stringValue("ResendEmailVerificationResponse.SuccessList["+ i +"].Message"));

			successList.add(sendResult);
		}
		resendEmailVerificationResponse.setSuccessList(successList);

		List<SendResult> failList = new ArrayList<SendResult>();
		for (int i = 0; i < context.lengthValue("ResendEmailVerificationResponse.FailList.Length"); i++) {
			SendResult sendResult = new SendResult();
			sendResult.setEmail(context.stringValue("ResendEmailVerificationResponse.FailList["+ i +"].Email"));
			sendResult.setCode(context.stringValue("ResendEmailVerificationResponse.FailList["+ i +"].Code"));
			sendResult.setMessage(context.stringValue("ResendEmailVerificationResponse.FailList["+ i +"].Message"));

			failList.add(sendResult);
		}
		resendEmailVerificationResponse.setFailList(failList);
	 
	 	return resendEmailVerificationResponse;
	}
}