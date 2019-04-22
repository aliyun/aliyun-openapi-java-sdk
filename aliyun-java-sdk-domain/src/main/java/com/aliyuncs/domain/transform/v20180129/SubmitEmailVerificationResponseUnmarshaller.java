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

package com.aliyuncs.domain.transform.v20180129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180129.SubmitEmailVerificationResponse;
import com.aliyuncs.domain.model.v20180129.SubmitEmailVerificationResponse.SendResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitEmailVerificationResponseUnmarshaller {

	public static SubmitEmailVerificationResponse unmarshall(SubmitEmailVerificationResponse submitEmailVerificationResponse, UnmarshallerContext context) {
		
		submitEmailVerificationResponse.setRequestId(context.stringValue("SubmitEmailVerificationResponse.RequestId"));

		List<SendResult> successList = new ArrayList<SendResult>();
		for (int i = 0; i < context.lengthValue("SubmitEmailVerificationResponse.SuccessList.Length"); i++) {
			SendResult sendResult = new SendResult();
			sendResult.setEmail(context.stringValue("SubmitEmailVerificationResponse.SuccessList["+ i +"].Email"));
			sendResult.setCode(context.stringValue("SubmitEmailVerificationResponse.SuccessList["+ i +"].Code"));
			sendResult.setMessage(context.stringValue("SubmitEmailVerificationResponse.SuccessList["+ i +"].Message"));

			successList.add(sendResult);
		}
		submitEmailVerificationResponse.setSuccessList(successList);

		List<SendResult> failList = new ArrayList<SendResult>();
		for (int i = 0; i < context.lengthValue("SubmitEmailVerificationResponse.FailList.Length"); i++) {
			SendResult sendResult = new SendResult();
			sendResult.setEmail(context.stringValue("SubmitEmailVerificationResponse.FailList["+ i +"].Email"));
			sendResult.setCode(context.stringValue("SubmitEmailVerificationResponse.FailList["+ i +"].Code"));
			sendResult.setMessage(context.stringValue("SubmitEmailVerificationResponse.FailList["+ i +"].Message"));

			failList.add(sendResult);
		}
		submitEmailVerificationResponse.setFailList(failList);

		List<SendResult> existList = new ArrayList<SendResult>();
		for (int i = 0; i < context.lengthValue("SubmitEmailVerificationResponse.ExistList.Length"); i++) {
			SendResult sendResult = new SendResult();
			sendResult.setEmail(context.stringValue("SubmitEmailVerificationResponse.ExistList["+ i +"].Email"));
			sendResult.setCode(context.stringValue("SubmitEmailVerificationResponse.ExistList["+ i +"].Code"));
			sendResult.setMessage(context.stringValue("SubmitEmailVerificationResponse.ExistList["+ i +"].Message"));

			existList.add(sendResult);
		}
		submitEmailVerificationResponse.setExistList(existList);
	 
	 	return submitEmailVerificationResponse;
	}
}