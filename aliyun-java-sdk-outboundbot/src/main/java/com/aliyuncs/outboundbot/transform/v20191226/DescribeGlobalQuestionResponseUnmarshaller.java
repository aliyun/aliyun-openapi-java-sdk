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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.DescribeGlobalQuestionResponse;
import com.aliyuncs.outboundbot.model.v20191226.DescribeGlobalQuestionResponse.GlobalQuestion;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGlobalQuestionResponseUnmarshaller {

	public static DescribeGlobalQuestionResponse unmarshall(DescribeGlobalQuestionResponse describeGlobalQuestionResponse, UnmarshallerContext _ctx) {
		
		describeGlobalQuestionResponse.setRequestId(_ctx.stringValue("DescribeGlobalQuestionResponse.RequestId"));
		describeGlobalQuestionResponse.setSuccess(_ctx.booleanValue("DescribeGlobalQuestionResponse.Success"));
		describeGlobalQuestionResponse.setCode(_ctx.stringValue("DescribeGlobalQuestionResponse.Code"));
		describeGlobalQuestionResponse.setMessage(_ctx.stringValue("DescribeGlobalQuestionResponse.Message"));
		describeGlobalQuestionResponse.setHttpStatusCode(_ctx.integerValue("DescribeGlobalQuestionResponse.HttpStatusCode"));

		GlobalQuestion globalQuestion = new GlobalQuestion();
		globalQuestion.setGlobalQuestionId(_ctx.stringValue("DescribeGlobalQuestionResponse.GlobalQuestion.GlobalQuestionId"));
		globalQuestion.setScriptId(_ctx.stringValue("DescribeGlobalQuestionResponse.GlobalQuestion.ScriptId"));
		globalQuestion.setGlobalQuestionName(_ctx.stringValue("DescribeGlobalQuestionResponse.GlobalQuestion.GlobalQuestionName"));
		globalQuestion.setGlobalQuestionType(_ctx.stringValue("DescribeGlobalQuestionResponse.GlobalQuestion.GlobalQuestionType"));
		globalQuestion.setQuestions(_ctx.stringValue("DescribeGlobalQuestionResponse.GlobalQuestion.Questions"));
		globalQuestion.setAnswers(_ctx.stringValue("DescribeGlobalQuestionResponse.GlobalQuestion.Answers"));
		describeGlobalQuestionResponse.setGlobalQuestion(globalQuestion);
	 
	 	return describeGlobalQuestionResponse;
	}
}