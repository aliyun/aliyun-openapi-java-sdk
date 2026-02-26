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

package com.aliyuncs.openitag.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openitag.model.v20220616.GetTaskTemplateQuestionsResponse;
import com.aliyuncs.openitag.model.v20220616.GetTaskTemplateQuestionsResponse.QuestionsItem;
import com.aliyuncs.openitag.model.v20220616.GetTaskTemplateQuestionsResponse.QuestionsItem.OptionsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskTemplateQuestionsResponseUnmarshaller {

	public static GetTaskTemplateQuestionsResponse unmarshall(GetTaskTemplateQuestionsResponse getTaskTemplateQuestionsResponse, UnmarshallerContext _ctx) {
		
		getTaskTemplateQuestionsResponse.setRequestId(_ctx.stringValue("GetTaskTemplateQuestionsResponse.RequestId"));
		getTaskTemplateQuestionsResponse.setCode(_ctx.integerValue("GetTaskTemplateQuestionsResponse.Code"));
		getTaskTemplateQuestionsResponse.setMessage(_ctx.stringValue("GetTaskTemplateQuestionsResponse.Message"));
		getTaskTemplateQuestionsResponse.setSuccess(_ctx.booleanValue("GetTaskTemplateQuestionsResponse.Success"));
		getTaskTemplateQuestionsResponse.setDetails(_ctx.stringValue("GetTaskTemplateQuestionsResponse.Details"));
		getTaskTemplateQuestionsResponse.setErrorCode(_ctx.stringValue("GetTaskTemplateQuestionsResponse.ErrorCode"));

		List<QuestionsItem> questions = new ArrayList<QuestionsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskTemplateQuestionsResponse.Questions.Length"); i++) {
			QuestionsItem questionsItem = new QuestionsItem();
			questionsItem.setMarkTitle(_ctx.stringValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].MarkTitle"));
			questionsItem.setMarkTitleAlias(_ctx.stringValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].MarkTitleAlias"));
			questionsItem.setType(_ctx.stringValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].Type"));
			questionsItem.setMustFill(_ctx.booleanValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].MustFill"));
			questionsItem.setDisplay(_ctx.booleanValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].Display"));
			questionsItem.setSelected(_ctx.booleanValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].Selected"));
			questionsItem.setSelectGroup(_ctx.stringValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].SelectGroup"));
			questionsItem.setDefaultResult(_ctx.stringValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].DefaultResult"));
			questionsItem.setRule(_ctx.stringValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].Rule"));
			questionsItem.setCanSelect(_ctx.booleanValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].CanSelect"));
			questionsItem.setExif(_ctx.mapValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].Exif"));
			questionsItem.setHotKeyMap(_ctx.stringValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].HotKeyMap"));
			questionsItem.setQuestionId(_ctx.stringValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].QuestionId"));

			List<String> children = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].Children.Length"); j++) {
				children.add(_ctx.stringValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].Children["+ j +"]"));
			}
			questionsItem.setChildren(children);

			List<String> preOptions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].PreOptions.Length"); j++) {
				preOptions.add(_ctx.stringValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].PreOptions["+ j +"]"));
			}
			questionsItem.setPreOptions(preOptions);

			List<OptionsItem> options = new ArrayList<OptionsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].Options.Length"); j++) {
				OptionsItem optionsItem = new OptionsItem();
				optionsItem.setLabel(_ctx.stringValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].Options["+ j +"].Label"));
				optionsItem.setKey(_ctx.stringValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].Options["+ j +"].Key"));
				optionsItem.setShortcut(_ctx.stringValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].Options["+ j +"].Shortcut"));
				optionsItem.setColor(_ctx.stringValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].Options["+ j +"].Color"));
				optionsItem.setRemark(_ctx.stringValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].Options["+ j +"].Remark"));

				List<String> children1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].Options["+ j +"].Children.Length"); k++) {
					children1.add(_ctx.stringValue("GetTaskTemplateQuestionsResponse.Questions["+ i +"].Options["+ j +"].Children["+ k +"]"));
				}
				optionsItem.setChildren1(children1);

				options.add(optionsItem);
			}
			questionsItem.setOptions(options);

			questions.add(questionsItem);
		}
		getTaskTemplateQuestionsResponse.setQuestions(questions);
	 
	 	return getTaskTemplateQuestionsResponse;
	}
}