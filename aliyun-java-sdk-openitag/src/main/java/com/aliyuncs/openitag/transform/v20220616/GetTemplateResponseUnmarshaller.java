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

import com.aliyuncs.openitag.model.v20220616.GetTemplateResponse;
import com.aliyuncs.openitag.model.v20220616.GetTemplateResponse.Template;
import com.aliyuncs.openitag.model.v20220616.GetTemplateResponse.Template.Creator;
import com.aliyuncs.openitag.model.v20220616.GetTemplateResponse.Template.Modifier;
import com.aliyuncs.openitag.model.v20220616.GetTemplateResponse.Template.QuestionConfigsItem;
import com.aliyuncs.openitag.model.v20220616.GetTemplateResponse.Template.QuestionConfigsItem.OptionsItem;
import com.aliyuncs.openitag.model.v20220616.GetTemplateResponse.Template.ViewConfigs;
import com.aliyuncs.openitag.model.v20220616.GetTemplateResponse.Template.ViewConfigs.ViewPluginsItem;
import com.aliyuncs.openitag.model.v20220616.GetTemplateResponse.Template.ViewConfigs.ViewPluginsItem.VisitInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTemplateResponseUnmarshaller {

	public static GetTemplateResponse unmarshall(GetTemplateResponse getTemplateResponse, UnmarshallerContext _ctx) {
		
		getTemplateResponse.setRequestId(_ctx.stringValue("GetTemplateResponse.RequestId"));
		getTemplateResponse.setCode(_ctx.integerValue("GetTemplateResponse.Code"));
		getTemplateResponse.setMessage(_ctx.stringValue("GetTemplateResponse.Message"));
		getTemplateResponse.setDetails(_ctx.stringValue("GetTemplateResponse.Details"));
		getTemplateResponse.setSuccess(_ctx.booleanValue("GetTemplateResponse.Success"));
		getTemplateResponse.setErrorCode(_ctx.stringValue("GetTemplateResponse.ErrorCode"));

		Template template = new Template();
		template.setGmtCreateTime(_ctx.stringValue("GetTemplateResponse.Template.GmtCreateTime"));
		template.setGmtModifiedTime(_ctx.stringValue("GetTemplateResponse.Template.GmtModifiedTime"));
		template.setTemplateId(_ctx.stringValue("GetTemplateResponse.Template.TemplateId"));
		template.setTemplateName(_ctx.stringValue("GetTemplateResponse.Template.TemplateName"));
		template.setDescription(_ctx.stringValue("GetTemplateResponse.Template.Description"));
		template.setExif(_ctx.mapValue("GetTemplateResponse.Template.Exif"));
		template.setStatus(_ctx.stringValue("GetTemplateResponse.Template.Status"));
		template.setType(_ctx.stringValue("GetTemplateResponse.Template.Type"));
		template.setClassify(_ctx.stringValue("GetTemplateResponse.Template.Classify"));
		template.setTenantId(_ctx.stringValue("GetTemplateResponse.Template.TenantId"));
		template.setSharedMode(_ctx.stringValue("GetTemplateResponse.Template.SharedMode"));

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTemplateResponse.Template.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("GetTemplateResponse.Template.Tags["+ i +"]"));
		}
		template.setTags(tags);

		List<String> abandonReasons = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTemplateResponse.Template.AbandonReasons.Length"); i++) {
			abandonReasons.add(_ctx.stringValue("GetTemplateResponse.Template.AbandonReasons["+ i +"]"));
		}
		template.setAbandonReasons(abandonReasons);

		Creator creator = new Creator();
		creator.setUserId(_ctx.longValue("GetTemplateResponse.Template.Creator.UserId"));
		creator.setAccountType(_ctx.stringValue("GetTemplateResponse.Template.Creator.AccountType"));
		creator.setAccountNo(_ctx.stringValue("GetTemplateResponse.Template.Creator.AccountNo"));
		creator.setUserName(_ctx.stringValue("GetTemplateResponse.Template.Creator.UserName"));
		creator.setRole(_ctx.stringValue("GetTemplateResponse.Template.Creator.Role"));
		template.setCreator(creator);

		Modifier modifier = new Modifier();
		modifier.setUserId(_ctx.longValue("GetTemplateResponse.Template.Modifier.UserId"));
		modifier.setAccountType(_ctx.stringValue("GetTemplateResponse.Template.Modifier.AccountType"));
		modifier.setAccountNo(_ctx.stringValue("GetTemplateResponse.Template.Modifier.AccountNo"));
		modifier.setUserName(_ctx.stringValue("GetTemplateResponse.Template.Modifier.UserName"));
		modifier.setRole(_ctx.stringValue("GetTemplateResponse.Template.Modifier.Role"));
		template.setModifier(modifier);

		ViewConfigs viewConfigs = new ViewConfigs();

		List<ViewPluginsItem> viewPlugins = new ArrayList<ViewPluginsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTemplateResponse.Template.ViewConfigs.ViewPlugins.Length"); i++) {
			ViewPluginsItem viewPluginsItem = new ViewPluginsItem();
			viewPluginsItem.setType(_ctx.stringValue("GetTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].Type"));
			viewPluginsItem.setCorsProxy(_ctx.booleanValue("GetTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].CorsProxy"));
			viewPluginsItem.setHide(_ctx.booleanValue("GetTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].Hide"));
			viewPluginsItem.setConvertor(_ctx.stringValue("GetTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].Convertor"));
			viewPluginsItem.setPlugins(_ctx.mapValue("GetTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].Plugins"));
			viewPluginsItem.setExif(_ctx.mapValue("GetTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].Exif"));
			viewPluginsItem.setBindField(_ctx.stringValue("GetTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].BindField"));
			viewPluginsItem.setDisplayOriImg(_ctx.booleanValue("GetTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].DisplayOriImg"));

			List<String> relationQuestionIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].RelationQuestionIds.Length"); j++) {
				relationQuestionIds.add(_ctx.stringValue("GetTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].RelationQuestionIds["+ j +"]"));
			}
			viewPluginsItem.setRelationQuestionIds(relationQuestionIds);

			VisitInfo visitInfo = new VisitInfo();
			visitInfo.setOssConf(_ctx.mapValue("GetTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].VisitInfo.ossConf"));
			visitInfo.setAftsConf(_ctx.mapValue("GetTemplateResponse.Template.ViewConfigs.ViewPlugins["+ i +"].VisitInfo.aftsConf"));
			viewPluginsItem.setVisitInfo(visitInfo);

			viewPlugins.add(viewPluginsItem);
		}
		viewConfigs.setViewPlugins(viewPlugins);
		template.setViewConfigs(viewConfigs);

		List<QuestionConfigsItem> questionConfigs = new ArrayList<QuestionConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTemplateResponse.Template.QuestionConfigs.Length"); i++) {
			QuestionConfigsItem questionConfigsItem = new QuestionConfigsItem();
			questionConfigsItem.setMarkTitle(_ctx.stringValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].MarkTitle"));
			questionConfigsItem.setMarkTitleAlias(_ctx.stringValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].MarkTitleAlias"));
			questionConfigsItem.setType(_ctx.stringValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].Type"));
			questionConfigsItem.setMustFill(_ctx.booleanValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].MustFill"));
			questionConfigsItem.setDisplay(_ctx.booleanValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].Display"));
			questionConfigsItem.setSelected(_ctx.booleanValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].Selected"));
			questionConfigsItem.setSelectGroup(_ctx.stringValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].SelectGroup"));
			questionConfigsItem.setDefaultResult(_ctx.stringValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].DefaultResult"));
			questionConfigsItem.setRule(_ctx.stringValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].Rule"));
			questionConfigsItem.setCanSelect(_ctx.booleanValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].CanSelect"));
			questionConfigsItem.setExif(_ctx.mapValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].Exif"));
			questionConfigsItem.setHotKeyMap(_ctx.stringValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].HotKeyMap"));
			questionConfigsItem.setQuestionId(_ctx.stringValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].QuestionId"));

			List<String> children = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].Children.Length"); j++) {
				children.add(_ctx.stringValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].Children["+ j +"]"));
			}
			questionConfigsItem.setChildren(children);

			List<String> preOptions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].PreOptions.Length"); j++) {
				preOptions.add(_ctx.stringValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].PreOptions["+ j +"]"));
			}
			questionConfigsItem.setPreOptions(preOptions);

			List<OptionsItem> options = new ArrayList<OptionsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].Options.Length"); j++) {
				OptionsItem optionsItem = new OptionsItem();
				optionsItem.setLabel(_ctx.stringValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].Options["+ j +"].Label"));
				optionsItem.setKey(_ctx.stringValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].Options["+ j +"].Key"));
				optionsItem.setShortcut(_ctx.stringValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].Options["+ j +"].Shortcut"));
				optionsItem.setColor(_ctx.stringValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].Options["+ j +"].Color"));
				optionsItem.setRemark(_ctx.stringValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].Options["+ j +"].Remark"));

				List<String> children1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].Options["+ j +"].Children.Length"); k++) {
					children1.add(_ctx.stringValue("GetTemplateResponse.Template.QuestionConfigs["+ i +"].Options["+ j +"].Children["+ k +"]"));
				}
				optionsItem.setChildren1(children1);

				options.add(optionsItem);
			}
			questionConfigsItem.setOptions(options);

			questionConfigs.add(questionConfigsItem);
		}
		template.setQuestionConfigs(questionConfigs);
		getTemplateResponse.setTemplate(template);
	 
	 	return getTemplateResponse;
	}
}