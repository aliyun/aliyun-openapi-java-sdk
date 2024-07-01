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

import com.aliyuncs.domain_intl.model.v20171218.SubmitEmailVerificationResponse;
import com.aliyuncs.domain_intl.model.v20171218.SubmitEmailVerificationResponse.SendResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitEmailVerificationResponseUnmarshaller {

	public static SubmitEmailVerificationResponse unmarshall(SubmitEmailVerificationResponse submitEmailVerificationResponse, UnmarshallerContext _ctx) {
		
		submitEmailVerificationResponse.setRequestId(_ctx.stringValue("SubmitEmailVerificationResponse.RequestId"));

		List<SendResult> existList = new ArrayList<SendResult>();
		for (int i = 0; i < _ctx.lengthValue("SubmitEmailVerificationResponse.ExistList.Length"); i++) {
			SendResult sendResult = new SendResult();
			sendResult.setEmail(_ctx.stringValue("SubmitEmailVerificationResponse.ExistList["+ i +"].Email"));
			sendResult.setCode(_ctx.stringValue("SubmitEmailVerificationResponse.ExistList["+ i +"].Code"));
			sendResult.setMessage(_ctx.stringValue("SubmitEmailVerificationResponse.ExistList["+ i +"].Message"));

			existList.add(sendResult);
		}
		submitEmailVerificationResponse.setExistList(existList);

		List<SendResult> successList = new ArrayList<SendResult>();
		for (int i = 0; i < _ctx.lengthValue("SubmitEmailVerificationResponse.SuccessList.Length"); i++) {
			SendResult sendResult1 = new SendResult();
			sendResult1.setEmail(_ctx.stringValue("SubmitEmailVerificationResponse.SuccessList["+ i +"].Email"));
			sendResult1.setCode(_ctx.stringValue("SubmitEmailVerificationResponse.SuccessList["+ i +"].Code"));
			sendResult1.setMessage(_ctx.stringValue("SubmitEmailVerificationResponse.SuccessList["+ i +"].Message"));

			successList.add(sendResult1);
		}
		submitEmailVerificationResponse.setSuccessList(successList);

		List<SendResult> failList = new ArrayList<SendResult>();
		for (int i = 0; i < _ctx.lengthValue("SubmitEmailVerificationResponse.FailList.Length"); i++) {
			SendResult sendResult2 = new SendResult();
			sendResult2.setEmail(_ctx.stringValue("SubmitEmailVerificationResponse.FailList["+ i +"].Email"));
			sendResult2.setCode(_ctx.stringValue("SubmitEmailVerificationResponse.FailList["+ i +"].Code"));
			sendResult2.setMessage(_ctx.stringValue("SubmitEmailVerificationResponse.FailList["+ i +"].Message"));

			failList.add(sendResult2);
		}
		submitEmailVerificationResponse.setFailList(failList);
	 
	 	return submitEmailVerificationResponse;
	}
}