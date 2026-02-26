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

import com.aliyuncs.openitag.model.v20220616.GetTaskTemplateResponse;
import com.aliyuncs.openitag.model.v20220616.GetTaskTemplateResponse.Template;
import com.aliyuncs.openitag.model.v20220616.GetTaskTemplateResponse.Template.Creator;
import com.aliyuncs.openitag.model.v20220616.GetTaskTemplateResponse.Template.Modifier;
import com.aliyuncs.openitag.model.v20220616.GetTaskTemplateResponse.Template.QuestionConfigsItem;
import com.aliyuncs.openitag.model.v20220616.GetTaskTemplateResponse.Template.QuestionConfigsItem.OptionsItem;
import com.aliyuncs.openitag.model.v20220616.GetTaskTemplateResponse.Template.ViewConfigs;
import com.aliyuncs.openitag.model.v20220616.GetTaskTemplateResponse.Template.ViewConfigs.ViewPluginsItem;
import com.aliyuncs.openitag.model.v20220616.GetTaskTemplateResponse.Template.ViewConfigs.ViewPluginsItem.VisitInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskTemplateResponseUnmarshaller {

	public static GetTaskTemplateResponse unmarshall(GetTaskTemplateResponse getTaskTemplateResponse, UnmarshallerContext _ctx) {
		
		getTaskTemplateResponse.setRequestId(_ctx.stringValue("GetTaskTemplateResponse.RequestId"));
		getTaskTemplateResponse.setCode(_ctx.integerValue("GetTaskTemplateResponse.Code"));
		getTaskTemplateResponse.setMessage(_ctx.stringValue("GetTaskTemplateResponse.Message"));
		getTaskTemplateResponse.setDetails(_ctx.stringValue("GetTaskTemplateResponse.Details"));
		getTaskTemplateResponse.setSuccess(_ctx.booleanValue("GetTaskTemplateResponse.Success"));
		getTaskTemplateResponse.setErrorCode(_ctx.stringValue("GetTaskTemplateResponse.ErrorCode"));

		Template template = new Template();
		template.setGmtCreateTime(_ctx.stringValue("GetTaskTemplateResponse.Template.GmtCreateTime"));
		template.setGmtModifiedTime(_ctx.stringValue("GetTaskTemplateResponse.Template.GmtModifiedTime"));
		template.setTemplateId(_ctx.stringValue("GetTaskTemplateResponse.Template.TemplateId"));
		template.setTemplateName(_ctx.stringValue("GetTaskTemplateResponse.Template.TemplateName"));
		template.setDescription(_ctx.stringValue("GetTaskTemplateResponse.Template.Description"));
		template.setExif(_ctx.mapValue("GetTaskTemplateResponse.Template.Exif"));
		template.setStatus(_ctx.stringValue("GetTaskTemplateResponse.Template.Status"));
		template.setType(_ctx.stringValue("GetTaskTemplateResponse.Template.Type"));
		template.setClassify(_ctx.stringValue("GetTaskTemplateResponse.Template.Classify"));
		template.setTenantId(_ctx.stringValue("GetTaskTemplateResponse.Template.TenantId"));
		template.setSharedMode(_ctx.stringValue("GetTaskTemplateResponse.Template.SharedMode"));

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskTemplateResponse.Template.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("GetTaskTemplateResponse.Template.Tags["+ i +"]"));
		}
		template.setTags(tags);

		List<String> abandonReasons = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskTemplateResponse.Template.AbandonReasons.Length"); i++) {
			abandonReasons.add(_ctx.stringValue("GetTaskTemplateResponse.Template.AbandonReasons["+ i +"]"));
		}
		template.setAbandonReasons(abandonReasons);

		Creator creator = new Creator();
		creator.setUserId(_ctx.longValue("GetTaskTemplateResponse.Template.Creator.UserId"));
		creator.setAccountType(_ctx.stringValue("GetTaskTemplateResponse.Template.Creator.AccountType"));
		creator.setAccountNo(_ctx.stringValue("GetTaskTemplateResponse.Template.Creator.AccountNo"));
		creator.setUserName(_ctx.stringValue("GetTaskTemplateResponse.Template.Creator.UserName"));
		creator.setRole(_ctx.stringValue("GetTaskTemplateResponse.Template.Creator.Role"));
		template.setCreator(creator);

		Modifier modifier = new Modifier();
		modifier.setUserId(_ctx.longValue("GetTaskTemplateResponse.Template.Modifier.UserId"));
		modifier.setAccountType(_ctx.stringValue("GetTaskTemplateResponse.Template.Modifier.AccountType"));
		modifier.setAccountNo(_ctx.stringValue("GetTaskTemplateResponse.Template.Modifier.AccountNo"));
		modifier.setUserName(_ctx.stringValue("GetTaskTemplateResponse.Template.Modifier.UserName"));
		modifier.setRole(_ctx.stringValue("GetTaskTemplateResponse.Template.Modifier.Role"));
		template.setModifier(modifier);

		ViewConfigs viewConfigs = new ViewConfigs();

		List<ViewPluginsItem> viewPlugins = new ArrayList<ViewPluginsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskTemplateResponse.Template.ViewConfigs.ViewPlugins.Length"); i++) {
			ViewPluginsItem viewPluginsItem = new ViewPluginsItem();
			viewPluginsItem.setType(_ctx.stringValue("GetTaskTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].Type"));
			viewPluginsItem.setCorsProxy(_ctx.booleanValue("GetTaskTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].CorsProxy"));
			viewPluginsItem.setHide(_ctx.booleanValue("GetTaskTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].Hide"));
			viewPluginsItem.setConvertor(_ctx.stringValue("GetTaskTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].Convertor"));
			viewPluginsItem.setPlugins(_ctx.mapValue("GetTaskTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].Plugins"));
			viewPluginsItem.setExif(_ctx.mapValue("GetTaskTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].Exif"));
			viewPluginsItem.setBindField(_ctx.stringValue("GetTaskTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].BindField"));
			viewPluginsItem.setDisplayOriImg(_ctx.booleanValue("GetTaskTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].DisplayOriImg"));

			List<String> relationQuestionIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].RelationQuestionIds.Length"); j++) {
				relationQuestionIds.add(_ctx.stringValue("GetTaskTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].RelationQuestionIds["+ j +"]"));
			}
			viewPluginsItem.setRelationQuestionIds(relationQuestionIds);

			VisitInfo visitInfo = new VisitInfo();
			visitInfo.setOssConf(_ctx.mapValue("GetTaskTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].VisitInfo.ossConf"));
			visitInfo.setAftsConf(_ctx.mapValue("GetTaskTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].VisitInfo.aftsConf"));
			viewPluginsItem.setVisitInfo(visitInfo);

			viewPlugins.add(viewPluginsItem);
		}
		viewConfigs.setViewPlugins(viewPlugins);
		template.setViewConfigs(viewConfigs);

		List<QuestionConfigsItem> questionConfigs = new ArrayList<QuestionConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskTemplateResponse.Template.QuestionConfigs.Length"); i++) {
			QuestionConfigsItem questionConfigsItem = new QuestionConfigsItem();
			questionConfigsItem.setMarkTitle(_ctx.stringValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].MarkTitle"));
			questionConfigsItem.setMarkTitleAlias(_ctx.stringValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].MarkTitleAlias"));
			questionConfigsItem.setType(_ctx.stringValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].Type"));
			questionConfigsItem.setMustFill(_ctx.booleanValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].MustFill"));
			questionConfigsItem.setDisplay(_ctx.booleanValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].Display"));
			questionConfigsItem.setSelected(_ctx.booleanValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].Selected"));
			questionConfigsItem.setSelectGroup(_ctx.stringValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].SelectGroup"));
			questionConfigsItem.setDefaultResult(_ctx.stringValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].DefaultResult"));
			questionConfigsItem.setRule(_ctx.stringValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].Rule"));
			questionConfigsItem.setCanSelect(_ctx.booleanValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].CanSelect"));
			questionConfigsItem.setExif(_ctx.mapValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].Exif"));
			questionConfigsItem.setHotKeyMap(_ctx.stringValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].HotKeyMap"));
			questionConfigsItem.setQuestionId(_ctx.stringValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].QuestionId"));

			List<String> children = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].Children.Length"); j++) {
				children.add(_ctx.stringValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].Children["+ j +"]"));
			}
			questionConfigsItem.setChildren(children);

			List<String> preOptions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].PreOptions.Length"); j++) {
				preOptions.add(_ctx.stringValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].PreOptions["+ j +"]"));
			}
			questionConfigsItem.setPreOptions(preOptions);

			List<OptionsItem> options = new ArrayList<OptionsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].Options.Length"); j++) {
				OptionsItem optionsItem = new OptionsItem();
				optionsItem.setLabel(_ctx.stringValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].Options["+ j +"].Label"));
				optionsItem.setKey(_ctx.stringValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].Options["+ j +"].Key"));
				optionsItem.setShortcut(_ctx.stringValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].Options["+ j +"].Shortcut"));
				optionsItem.setColor(_ctx.stringValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].Options["+ j +"].Color"));
				optionsItem.setRemark(_ctx.stringValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].Options["+ j +"].Remark"));

				List<String> children1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].Options["+ j +"].Children.Length"); k++) {
					children1.add(_ctx.stringValue("GetTaskTemplateResponse.Template.QuestionConfigs["+ i +"].Options["+ j +"].Children["+ k +"]"));
				}
				optionsItem.setChildren1(children1);

				options.add(optionsItem);
			}
			questionConfigsItem.setOptions(options);

			questionConfigs.add(questionConfigsItem);
		}
		template.setQuestionConfigs(questionConfigs);
		getTaskTemplateResponse.setTemplate(template);
	 
	 	return getTaskTemplateResponse;
	}
}