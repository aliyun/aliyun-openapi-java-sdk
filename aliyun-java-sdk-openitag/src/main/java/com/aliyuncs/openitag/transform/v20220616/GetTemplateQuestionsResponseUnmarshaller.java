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

import com.aliyuncs.openitag.model.v20220616.GetTemplateQuestionsResponse;
import com.aliyuncs.openitag.model.v20220616.GetTemplateQuestionsResponse.QuestionConfigsItem;
import com.aliyuncs.openitag.model.v20220616.GetTemplateQuestionsResponse.QuestionConfigsItem.OptionsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTemplateQuestionsResponseUnmarshaller {

	public static GetTemplateQuestionsResponse unmarshall(GetTemplateQuestionsResponse getTemplateQuestionsResponse, UnmarshallerContext _ctx) {
		
		getTemplateQuestionsResponse.setRequestId(_ctx.stringValue("GetTemplateQuestionsResponse.RequestId"));
		getTemplateQuestionsResponse.setCode(_ctx.integerValue("GetTemplateQuestionsResponse.Code"));
		getTemplateQuestionsResponse.setMessage(_ctx.stringValue("GetTemplateQuestionsResponse.Message"));
		getTemplateQuestionsResponse.setDetails(_ctx.stringValue("GetTemplateQuestionsResponse.Details"));
		getTemplateQuestionsResponse.setSuccess(_ctx.booleanValue("GetTemplateQuestionsResponse.Success"));
		getTemplateQuestionsResponse.setErrorCode(_ctx.stringValue("GetTemplateQuestionsResponse.ErrorCode"));

		List<QuestionConfigsItem> questionConfigs = new ArrayList<QuestionConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTemplateQuestionsResponse.QuestionConfigs.Length"); i++) {
			QuestionConfigsItem questionConfigsItem = new QuestionConfigsItem();
			questionConfigsItem.setMarkTitle(_ctx.stringValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].MarkTitle"));
			questionConfigsItem.setMarkTitleAlias(_ctx.stringValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].MarkTitleAlias"));
			questionConfigsItem.setType(_ctx.stringValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].Type"));
			questionConfigsItem.setMustFill(_ctx.booleanValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].MustFill"));
			questionConfigsItem.setDisplay(_ctx.booleanValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].Display"));
			questionConfigsItem.setSelected(_ctx.booleanValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].Selected"));
			questionConfigsItem.setSelectGroup(_ctx.stringValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].SelectGroup"));
			questionConfigsItem.setDefaultResult(_ctx.stringValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].DefaultResult"));
			questionConfigsItem.setRule(_ctx.stringValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].Rule"));
			questionConfigsItem.setCanSelect(_ctx.booleanValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].CanSelect"));
			questionConfigsItem.setExif(_ctx.mapValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].Exif"));
			questionConfigsItem.setHotKeyMap(_ctx.stringValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].HotKeyMap"));
			questionConfigsItem.setQuestionId(_ctx.stringValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].QuestionId"));

			List<String> children = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].Children.Length"); j++) {
				children.add(_ctx.stringValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].Children["+ j +"]"));
			}
			questionConfigsItem.setChildren(children);

			List<String> preOptions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].PreOptions.Length"); j++) {
				preOptions.add(_ctx.stringValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].PreOptions["+ j +"]"));
			}
			questionConfigsItem.setPreOptions(preOptions);

			List<OptionsItem> options = new ArrayList<OptionsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].Options.Length"); j++) {
				OptionsItem optionsItem = new OptionsItem();
				optionsItem.setLabel(_ctx.stringValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].Options["+ j +"].Label"));
				optionsItem.setKey(_ctx.stringValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].Options["+ j +"].Key"));
				optionsItem.setShortcut(_ctx.stringValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].Options["+ j +"].Shortcut"));
				optionsItem.setColor(_ctx.stringValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].Options["+ j +"].Color"));
				optionsItem.setRemark(_ctx.stringValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].Options["+ j +"].Remark"));

				List<String> children1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].Options["+ j +"].Children.Length"); k++) {
					children1.add(_ctx.stringValue("GetTemplateQuestionsResponse.QuestionConfigs["+ i +"].Options["+ j +"].Children["+ k +"]"));
				}
				optionsItem.setChildren1(children1);

				options.add(optionsItem);
			}
			questionConfigsItem.setOptions(options);

			questionConfigs.add(questionConfigsItem);
		}
		getTemplateQuestionsResponse.setQuestionConfigs(questionConfigs);
	 
	 	return getTemplateQuestionsResponse;
	}
}