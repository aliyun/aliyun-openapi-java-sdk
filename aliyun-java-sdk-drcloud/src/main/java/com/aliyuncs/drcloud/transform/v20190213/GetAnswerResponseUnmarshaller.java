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

package com.aliyuncs.drcloud.transform.v20190213;

import com.aliyuncs.drcloud.model.v20190213.GetAnswerResponse;
import com.aliyuncs.drcloud.model.v20190213.GetAnswerResponse.Data;
import com.aliyuncs.drcloud.model.v20190213.GetAnswerResponse.Data.QuestionDTO;
import com.aliyuncs.drcloud.model.v20190213.GetAnswerResponse.Data.ReplyDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAnswerResponseUnmarshaller {

	public static GetAnswerResponse unmarshall(GetAnswerResponse getAnswerResponse, UnmarshallerContext context) {
		
		getAnswerResponse.setCode(context.integerValue("GetAnswerResponse.Code"));
		getAnswerResponse.setSuccess(context.booleanValue("GetAnswerResponse.Success"));
		getAnswerResponse.setMessage(context.stringValue("GetAnswerResponse.Message"));

		Data data = new Data();
		data.setRequestId(context.stringValue("GetAnswerResponse.Data.RequestId"));

		QuestionDTO questionDTO = new QuestionDTO();
		questionDTO.setProductQuestionCode(context.stringValue("GetAnswerResponse.Data.QuestionDTO.ProductQuestionCode"));
		questionDTO.setProductCode(context.stringValue("GetAnswerResponse.Data.QuestionDTO.ProductCode"));
		questionDTO.setIntentionType(context.stringValue("GetAnswerResponse.Data.QuestionDTO.IntentionType"));
		data.setQuestionDTO(questionDTO);

		ReplyDTO replyDTO = new ReplyDTO();
		replyDTO.setQuestion(context.stringValue("GetAnswerResponse.Data.ReplyDTO.Question"));
		replyDTO.setAnswer(context.stringValue("GetAnswerResponse.Data.ReplyDTO.Answer"));
		replyDTO.setLink(context.stringValue("GetAnswerResponse.Data.ReplyDTO.Link"));
		replyDTO.setType(context.stringValue("GetAnswerResponse.Data.ReplyDTO.Type"));
		replyDTO.setDocTitle(context.stringValue("GetAnswerResponse.Data.ReplyDTO.DocTitle"));
		data.setReplyDTO(replyDTO);
		getAnswerResponse.setData(data);
	 
	 	return getAnswerResponse;
	}
}