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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.ValidateRoleSetResponse;
import com.aliyuncs.qualitycheck.model.v20190115.ValidateRoleSetResponse.SentenceResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ValidateRoleSetResponseUnmarshaller {

	public static ValidateRoleSetResponse unmarshall(ValidateRoleSetResponse validateRoleSetResponse, UnmarshallerContext context) {
		
		validateRoleSetResponse.setRequestId(context.stringValue("ValidateRoleSetResponse.RequestId"));
		validateRoleSetResponse.setSuccess(context.booleanValue("ValidateRoleSetResponse.Success"));
		validateRoleSetResponse.setCode(context.stringValue("ValidateRoleSetResponse.Code"));
		validateRoleSetResponse.setMessage(context.stringValue("ValidateRoleSetResponse.Message"));

		List<SentenceResult> data = new ArrayList<SentenceResult>();
		for (int i = 0; i < context.lengthValue("ValidateRoleSetResponse.Data.Length"); i++) {
			SentenceResult sentenceResult = new SentenceResult();
			sentenceResult.setBeginTime(context.longValue("ValidateRoleSetResponse.Data["+ i +"].BeginTime"));
			sentenceResult.setChannelId(context.integerValue("ValidateRoleSetResponse.Data["+ i +"].ChannelId"));
			sentenceResult.setEndTime(context.longValue("ValidateRoleSetResponse.Data["+ i +"].EndTime"));
			sentenceResult.setText(context.stringValue("ValidateRoleSetResponse.Data["+ i +"].Text"));
			sentenceResult.setEmotionValue(context.integerValue("ValidateRoleSetResponse.Data["+ i +"].EmotionValue"));
			sentenceResult.setSilenceDuration(context.integerValue("ValidateRoleSetResponse.Data["+ i +"].SilenceDuration"));
			sentenceResult.setSpeechRate(context.integerValue("ValidateRoleSetResponse.Data["+ i +"].SpeechRate"));

			data.add(sentenceResult);
		}
		validateRoleSetResponse.setData(data);
	 
	 	return validateRoleSetResponse;
	}
}