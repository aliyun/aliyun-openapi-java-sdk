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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.ListGlobalQuestionsResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListGlobalQuestionsResponse.GlobalQuestions;
import com.aliyuncs.outboundbot.model.v20191226.ListGlobalQuestionsResponse.GlobalQuestions.GlobalQuestion;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGlobalQuestionsResponseUnmarshaller {

	public static ListGlobalQuestionsResponse unmarshall(ListGlobalQuestionsResponse listGlobalQuestionsResponse, UnmarshallerContext _ctx) {
		
		listGlobalQuestionsResponse.setRequestId(_ctx.stringValue("ListGlobalQuestionsResponse.RequestId"));
		listGlobalQuestionsResponse.setSuccess(_ctx.booleanValue("ListGlobalQuestionsResponse.Success"));
		listGlobalQuestionsResponse.setCode(_ctx.stringValue("ListGlobalQuestionsResponse.Code"));
		listGlobalQuestionsResponse.setMessage(_ctx.stringValue("ListGlobalQuestionsResponse.Message"));
		listGlobalQuestionsResponse.setHttpStatusCode(_ctx.integerValue("ListGlobalQuestionsResponse.HttpStatusCode"));

		GlobalQuestions globalQuestions = new GlobalQuestions();
		globalQuestions.setTotalCount(_ctx.integerValue("ListGlobalQuestionsResponse.GlobalQuestions.TotalCount"));
		globalQuestions.setPageNumber(_ctx.integerValue("ListGlobalQuestionsResponse.GlobalQuestions.PageNumber"));
		globalQuestions.setPageSize(_ctx.integerValue("ListGlobalQuestionsResponse.GlobalQuestions.PageSize"));

		List<GlobalQuestion> list = new ArrayList<GlobalQuestion>();
		for (int i = 0; i < _ctx.lengthValue("ListGlobalQuestionsResponse.GlobalQuestions.List.Length"); i++) {
			GlobalQuestion globalQuestion = new GlobalQuestion();
			globalQuestion.setGlobalQuestionId(_ctx.stringValue("ListGlobalQuestionsResponse.GlobalQuestions.List["+ i +"].GlobalQuestionId"));
			globalQuestion.setScriptId(_ctx.stringValue("ListGlobalQuestionsResponse.GlobalQuestions.List["+ i +"].ScriptId"));
			globalQuestion.setGlobalQuestionName(_ctx.stringValue("ListGlobalQuestionsResponse.GlobalQuestions.List["+ i +"].GlobalQuestionName"));
			globalQuestion.setGlobalQuestionType(_ctx.stringValue("ListGlobalQuestionsResponse.GlobalQuestions.List["+ i +"].GlobalQuestionType"));
			globalQuestion.setQuestions(_ctx.stringValue("ListGlobalQuestionsResponse.GlobalQuestions.List["+ i +"].Questions"));
			globalQuestion.setAnswers(_ctx.stringValue("ListGlobalQuestionsResponse.GlobalQuestions.List["+ i +"].Answers"));

			list.add(globalQuestion);
		}
		globalQuestions.setList(list);
		listGlobalQuestionsResponse.setGlobalQuestions(globalQuestions);
	 
	 	return listGlobalQuestionsResponse;
	}
}