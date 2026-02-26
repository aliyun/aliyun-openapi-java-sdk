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

package com.aliyuncs.itag.transform.v20210517;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.itag.model.v20210517.PageViewSubTaskItemResponse;
import com.aliyuncs.itag.model.v20210517.PageViewSubTaskItemResponse.Result;
import com.aliyuncs.itag.model.v20210517.PageViewSubTaskItemResponse.Result.MarkItemList;
import com.aliyuncs.itag.model.v20210517.PageViewSubTaskItemResponse.Result.MarkItemList.MarkResultListItem;
import com.aliyuncs.itag.model.v20210517.PageViewSubTaskItemResponse.Result.OptionTemplate;
import com.aliyuncs.itag.model.v20210517.PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigsItem;
import com.aliyuncs.itag.model.v20210517.PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigsItem.QuestionOption;
import com.aliyuncs.itag.model.v20210517.PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigsItem.TemplateRobotConfig;
import com.aliyuncs.itag.model.v20210517.PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigsItem.TemplateRobotConfig.RobotParam;
import com.aliyuncs.itag.model.v20210517.PageViewSubTaskItemResponse.Result.OptionTemplate.ViewConfigs;
import com.aliyuncs.itag.model.v20210517.PageViewSubTaskItemResponse.Result.OptionTemplate.ViewConfigs.FieldsItem;
import com.aliyuncs.itag.model.v20210517.PageViewSubTaskItemResponse.Result.SubTask;
import com.aliyuncs.itag.model.v20210517.PageViewSubTaskItemResponse.Result.SubUserTask;
import com.aliyuncs.itag.model.v20210517.PageViewSubTaskItemResponse.Result.SubUserTask.Handler;
import com.aliyuncs.itag.model.v20210517.PageViewSubTaskItemResponse.Result.TaskInfo;
import com.aliyuncs.itag.model.v20210517.PageViewSubTaskItemResponse.Result.TaskInfo.BizInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageViewSubTaskItemResponseUnmarshaller {

	public static PageViewSubTaskItemResponse unmarshall(PageViewSubTaskItemResponse pageViewSubTaskItemResponse, UnmarshallerContext _ctx) {
		
		pageViewSubTaskItemResponse.setRequestId(_ctx.stringValue("PageViewSubTaskItemResponse.RequestId"));
		pageViewSubTaskItemResponse.setCode(_ctx.stringValue("PageViewSubTaskItemResponse.Code"));
		pageViewSubTaskItemResponse.setErrInfo(_ctx.stringValue("PageViewSubTaskItemResponse.ErrInfo"));
		pageViewSubTaskItemResponse.setMsg(_ctx.stringValue("PageViewSubTaskItemResponse.Msg"));
		pageViewSubTaskItemResponse.setSucc(_ctx.booleanValue("PageViewSubTaskItemResponse.Succ"));
		pageViewSubTaskItemResponse.setErrorCode(_ctx.stringValue("PageViewSubTaskItemResponse.ErrorCode"));

		Result result = new Result();
		result.setTotal(_ctx.longValue("PageViewSubTaskItemResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("PageViewSubTaskItemResponse.Result.TotalPage"));
		result.setPageNum(_ctx.integerValue("PageViewSubTaskItemResponse.Result.PageNum"));
		result.setPageSize(_ctx.integerValue("PageViewSubTaskItemResponse.Result.PageSize"));

		TaskInfo taskInfo = new TaskInfo();
		taskInfo.setTaskName(_ctx.stringValue("PageViewSubTaskItemResponse.Result.TaskInfo.TaskName"));
		taskInfo.setTaskId(_ctx.stringValue("PageViewSubTaskItemResponse.Result.TaskInfo.TaskId"));
		taskInfo.setTaskType(_ctx.stringValue("PageViewSubTaskItemResponse.Result.TaskInfo.TaskType"));
		taskInfo.setChannel(_ctx.stringValue("PageViewSubTaskItemResponse.Result.TaskInfo.Channel"));
		taskInfo.setSafetyLevel(_ctx.longValue("PageViewSubTaskItemResponse.Result.TaskInfo.SafetyLevel"));

		BizInfo bizInfo = new BizInfo();
		bizInfo.setBizCode(_ctx.stringValue("PageViewSubTaskItemResponse.Result.TaskInfo.BizInfo.BizCode"));
		bizInfo.setBizNo(_ctx.stringValue("PageViewSubTaskItemResponse.Result.TaskInfo.BizInfo.BizNo"));
		bizInfo.setBizClassify(_ctx.stringValue("PageViewSubTaskItemResponse.Result.TaskInfo.BizInfo.BizClassify"));
		taskInfo.setBizInfo(bizInfo);
		result.setTaskInfo(taskInfo);

		SubTask subTask = new SubTask();
		subTask.setSubTaskId(_ctx.stringValue("PageViewSubTaskItemResponse.Result.SubTask.SubTaskId"));
		result.setSubTask(subTask);

		SubUserTask subUserTask = new SubUserTask();
		subUserTask.setUserSubTaskId(_ctx.stringValue("PageViewSubTaskItemResponse.Result.SubUserTask.UserSubTaskId"));
		subUserTask.setSubTaskId(_ctx.stringValue("PageViewSubTaskItemResponse.Result.SubUserTask.SubTaskId"));
		subUserTask.setWorkNode(_ctx.stringValue("PageViewSubTaskItemResponse.Result.SubUserTask.WorkNode"));
		subUserTask.setState(_ctx.stringValue("PageViewSubTaskItemResponse.Result.SubUserTask.State"));
		subUserTask.setVoteIdx(_ctx.longValue("PageViewSubTaskItemResponse.Result.SubUserTask.VoteIdx"));
		subUserTask.setLastUserSubTaskId(_ctx.stringValue("PageViewSubTaskItemResponse.Result.SubUserTask.LastUserSubTaskId"));
		subUserTask.setOperateFlag(_ctx.stringValue("PageViewSubTaskItemResponse.Result.SubUserTask.OperateFlag"));
		subUserTask.setRejectFlag(_ctx.longValue("PageViewSubTaskItemResponse.Result.SubUserTask.RejectFlag"));
		subUserTask.setRejectRemark(_ctx.stringValue("PageViewSubTaskItemResponse.Result.SubUserTask.RejectRemark"));
		subUserTask.setGmtTimeout(_ctx.stringValue("PageViewSubTaskItemResponse.Result.SubUserTask.GmtTimeout"));
		subUserTask.setExternalBizNo(_ctx.stringValue("PageViewSubTaskItemResponse.Result.SubUserTask.ExternalBizNo"));

		Handler handler = new Handler();
		handler.setUserId(_ctx.stringValue("PageViewSubTaskItemResponse.Result.SubUserTask.Handler.UserId"));
		handler.setUserName(_ctx.stringValue("PageViewSubTaskItemResponse.Result.SubUserTask.Handler.UserName"));
		handler.setAccountType(_ctx.stringValue("PageViewSubTaskItemResponse.Result.SubUserTask.Handler.AccountType"));
		handler.setAccountNo(_ctx.stringValue("PageViewSubTaskItemResponse.Result.SubUserTask.Handler.AccountNo"));
		subUserTask.setHandler(handler);
		result.setSubUserTask(subUserTask);

		OptionTemplate optionTemplate = new OptionTemplate();
		optionTemplate.setGmtCreate(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.GmtCreate"));
		optionTemplate.setGmtModified(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.GmtModified"));
		optionTemplate.setId(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.Id"));
		optionTemplate.setName(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.Name"));
		optionTemplate.setTntInstId(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.TntInstId"));
		optionTemplate.setDescription(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.Description"));
		optionTemplate.setExif(_ctx.mapValue("PageViewSubTaskItemResponse.Result.OptionTemplate.Exif"));
		optionTemplate.setStatus(_ctx.longValue("PageViewSubTaskItemResponse.Result.OptionTemplate.Status"));
		optionTemplate.setSharedMode(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.SharedMode"));
		optionTemplate.setType(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.Type"));
		optionTemplate.setClassify(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.Classify"));

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("PageViewSubTaskItemResponse.Result.OptionTemplate.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.Tags["+ i +"]"));
		}
		optionTemplate.setTags(tags);

		List<String> abandonReasons = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("PageViewSubTaskItemResponse.Result.OptionTemplate.AbandonReasons.Length"); i++) {
			abandonReasons.add(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.AbandonReasons["+ i +"]"));
		}
		optionTemplate.setAbandonReasons(abandonReasons);

		ViewConfigs viewConfigs = new ViewConfigs();

		List<FieldsItem> fields = new ArrayList<FieldsItem>();
		for (int i = 0; i < _ctx.lengthValue("PageViewSubTaskItemResponse.Result.OptionTemplate.ViewConfigs.Fields.Length"); i++) {
			FieldsItem fieldsItem = new FieldsItem();
			fieldsItem.setFieldName(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.ViewConfigs.Fields["+ i +"].FieldName"));
			fieldsItem.setType(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.ViewConfigs.Fields["+ i +"].Type"));
			fieldsItem.setCorsProxy(_ctx.booleanValue("PageViewSubTaskItemResponse.Result.OptionTemplate.ViewConfigs.Fields["+ i +"].CorsProxy"));
			fieldsItem.setHide(_ctx.booleanValue("PageViewSubTaskItemResponse.Result.OptionTemplate.ViewConfigs.Fields["+ i +"].Hide"));
			fieldsItem.setConvertor(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.ViewConfigs.Fields["+ i +"].Convertor"));
			fieldsItem.setVisitInfo(_ctx.mapValue("PageViewSubTaskItemResponse.Result.OptionTemplate.ViewConfigs.Fields["+ i +"].VisitInfo"));
			fieldsItem.setPlugins(_ctx.mapValue("PageViewSubTaskItemResponse.Result.OptionTemplate.ViewConfigs.Fields["+ i +"].Plugins"));

			List<String> relationQuestionIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("PageViewSubTaskItemResponse.Result.OptionTemplate.ViewConfigs.Fields["+ i +"].RelationQuestionIds.Length"); j++) {
				relationQuestionIds.add(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.ViewConfigs.Fields["+ i +"].RelationQuestionIds["+ j +"]"));
			}
			fieldsItem.setRelationQuestionIds(relationQuestionIds);

			fields.add(fieldsItem);
		}
		viewConfigs.setFields(fields);
		optionTemplate.setViewConfigs(viewConfigs);

		List<QuestionConfigsItem> questionConfigs = new ArrayList<QuestionConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs.Length"); i++) {
			QuestionConfigsItem questionConfigsItem = new QuestionConfigsItem();
			questionConfigsItem.setId(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].Id"));
			questionConfigsItem.setMarkTitle(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].MarkTitle"));
			questionConfigsItem.setMarkTitleAlias(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].MarkTitleAlias"));
			questionConfigsItem.setType(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].Type"));
			questionConfigsItem.setMustFill(_ctx.booleanValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].MustFill"));
			questionConfigsItem.setDisplay(_ctx.booleanValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].Display"));
			questionConfigsItem.setSelected(_ctx.booleanValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].Selected"));
			questionConfigsItem.setSelectGroup(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].SelectGroup"));
			questionConfigsItem.setDefaultResult(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].DefaultResult"));
			questionConfigsItem.setRule(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].Rule"));
			questionConfigsItem.setExif(_ctx.mapValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].Exif"));

			List<String> children = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].Children.Length"); j++) {
				children.add(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].Children["+ j +"]"));
			}
			questionConfigsItem.setChildren(children);

			List<String> preOptions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].PreOptions.Length"); j++) {
				preOptions.add(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].PreOptions["+ j +"]"));
			}
			questionConfigsItem.setPreOptions(preOptions);

			List<QuestionOption> options = new ArrayList<QuestionOption>();
			for (int j = 0; j < _ctx.lengthValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].Options.Length"); j++) {
				QuestionOption questionOption = new QuestionOption();
				questionOption.setLabel(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].Options["+ j +"].Label"));
				questionOption.setKey(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].Options["+ j +"].Key"));
				questionOption.setShortcut(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].Options["+ j +"].Shortcut"));
				questionOption.setColor(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].Options["+ j +"].Color"));
				questionOption.setValue(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].Options["+ j +"].Value"));

				List<String> children1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].Options["+ j +"].Children.Length"); k++) {
					children1.add(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].Options["+ j +"].Children["+ k +"]"));
				}
				questionOption.setChildren1(children1);

				options.add(questionOption);
			}
			questionConfigsItem.setOptions(options);

			List<TemplateRobotConfig> robotConfigs = new ArrayList<TemplateRobotConfig>();
			for (int j = 0; j < _ctx.lengthValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs.Length"); j++) {
				TemplateRobotConfig templateRobotConfig = new TemplateRobotConfig();
				templateRobotConfig.setRobotId(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].RobotId"));
				templateRobotConfig.setQuestionId(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].QuestionId"));
				templateRobotConfig.setStage(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Stage"));
				templateRobotConfig.setType(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Type"));
				templateRobotConfig.setResultPath(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].ResultPath"));
				templateRobotConfig.setDefaultResult(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].DefaultResult"));

				List<RobotParam> params = new ArrayList<RobotParam>();
				for (int k = 0; k < _ctx.lengthValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params.Length"); k++) {
					RobotParam robotParam = new RobotParam();
					robotParam.setParamName(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params["+ k +"].ParamName"));
					robotParam.setDataField(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params["+ k +"].DataField"));
					robotParam.setDefaultResult(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params["+ k +"].DefaultResult"));
					robotParam.setServiceId(_ctx.stringValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params["+ k +"].ServiceId"));
					robotParam.setMustFill(_ctx.booleanValue("PageViewSubTaskItemResponse.Result.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params["+ k +"].MustFill"));

					params.add(robotParam);
				}
				templateRobotConfig.setParams(params);

				robotConfigs.add(templateRobotConfig);
			}
			questionConfigsItem.setRobotConfigs(robotConfigs);

			questionConfigs.add(questionConfigsItem);
		}
		optionTemplate.setQuestionConfigs(questionConfigs);
		result.setOptionTemplate(optionTemplate);

		List<MarkItemList> list = new ArrayList<MarkItemList>();
		for (int i = 0; i < _ctx.lengthValue("PageViewSubTaskItemResponse.Result.List.Length"); i++) {
			MarkItemList markItemList = new MarkItemList();
			markItemList.setMarkItemId(_ctx.stringValue("PageViewSubTaskItemResponse.Result.List["+ i +"].MarkItemId"));
			markItemList.setDataId(_ctx.stringValue("PageViewSubTaskItemResponse.Result.List["+ i +"].DataId"));
			markItemList.setDatasetId(_ctx.stringValue("PageViewSubTaskItemResponse.Result.List["+ i +"].DatasetId"));
			markItemList.setState(_ctx.stringValue("PageViewSubTaskItemResponse.Result.List["+ i +"].State"));
			markItemList.setMine(_ctx.longValue("PageViewSubTaskItemResponse.Result.List["+ i +"].Mine"));
			markItemList.setRejectFlag(_ctx.longValue("PageViewSubTaskItemResponse.Result.List["+ i +"].RejectFlag"));
			markItemList.setFixedFlag(_ctx.longValue("PageViewSubTaskItemResponse.Result.List["+ i +"].FixedFlag"));
			markItemList.setAbandonFlag(_ctx.longValue("PageViewSubTaskItemResponse.Result.List["+ i +"].AbandonFlag"));
			markItemList.setWeight(_ctx.longValue("PageViewSubTaskItemResponse.Result.List["+ i +"].Weight"));
			markItemList.setDataMeta(_ctx.mapValue("PageViewSubTaskItemResponse.Result.List["+ i +"].DataMeta"));

			List<MarkResultListItem> markResultList = new ArrayList<MarkResultListItem>();
			for (int j = 0; j < _ctx.lengthValue("PageViewSubTaskItemResponse.Result.List["+ i +"].MarkResultList.Length"); j++) {
				MarkResultListItem markResultListItem = new MarkResultListItem();
				markResultListItem.setUserMarkResultId(_ctx.stringValue("PageViewSubTaskItemResponse.Result.List["+ i +"].MarkResultList["+ j +"].UserMarkResultId"));
				markResultListItem.setMarkResultId(_ctx.stringValue("PageViewSubTaskItemResponse.Result.List["+ i +"].MarkResultList["+ j +"].MarkResultId"));
				markResultListItem.setMarkTitle(_ctx.stringValue("PageViewSubTaskItemResponse.Result.List["+ i +"].MarkResultList["+ j +"].MarkTitle"));
				markResultListItem.setMarkResult(_ctx.stringValue("PageViewSubTaskItemResponse.Result.List["+ i +"].MarkResultList["+ j +"].MarkResult"));
				markResultListItem.setQuestionId(_ctx.stringValue("PageViewSubTaskItemResponse.Result.List["+ i +"].MarkResultList["+ j +"].QuestionId"));
				markResultListItem.setResultType(_ctx.stringValue("PageViewSubTaskItemResponse.Result.List["+ i +"].MarkResultList["+ j +"].ResultType"));
				markResultListItem.setVersion(_ctx.stringValue("PageViewSubTaskItemResponse.Result.List["+ i +"].MarkResultList["+ j +"].Version"));

				markResultList.add(markResultListItem);
			}
			markItemList.setMarkResultList(markResultList);

			list.add(markItemList);
		}
		result.setList(list);
		pageViewSubTaskItemResponse.setResult(result);
	 
	 	return pageViewSubTaskItemResponse;
	}
}