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

import com.aliyuncs.domain.model.v20180129.DeleteEmailVerificationResponse;
import com.aliyuncs.domain.model.v20180129.DeleteEmailVerificationResponse.SendResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteEmailVerificationResponseUnmarshaller {

	public static DeleteEmailVerificationResponse unmarshall(DeleteEmailVerificationResponse deleteEmailVerificationResponse, UnmarshallerContext context) {
		
		deleteEmailVerificationResponse.setRequestId(context.stringValue("DeleteEmailVerificationResponse.RequestId"));

		List<SendResult> successList = new ArrayList<SendResult>();
		for (int i = 0; i < context.lengthValue("DeleteEmailVerificationResponse.SuccessList.Length"); i++) {
			SendResult sendResult = new SendResult();
			sendResult.setEmail(context.stringValue("DeleteEmailVerificationResponse.SuccessList["+ i +"].Email"));
			sendResult.setCode(context.stringValue("DeleteEmailVerificationResponse.SuccessList["+ i +"].Code"));
			sendResult.setMessage(context.stringValue("DeleteEmailVerificationResponse.SuccessList["+ i +"].Message"));

			successList.add(sendResult);
		}
		deleteEmailVerificationResponse.setSuccessList(successList);

		List<SendResult> failList = new ArrayList<SendResult>();
		for (int i = 0; i < context.lengthValue("DeleteEmailVerificationResponse.FailList.Length"); i++) {
			SendResult sendResult = new SendResult();
			sendResult.setEmail(context.stringValue("DeleteEmailVerificationResponse.FailList["+ i +"].Email"));
			sendResult.setCode(context.stringValue("DeleteEmailVerificationResponse.FailList["+ i +"].Code"));
			sendResult.setMessage(context.stringValue("DeleteEmailVerificationResponse.FailList["+ i +"].Message"));

			failList.add(sendResult);
		}
		deleteEmailVerificationResponse.setFailList(failList);
	 
	 	return deleteEmailVerificationResponse;
	}
}