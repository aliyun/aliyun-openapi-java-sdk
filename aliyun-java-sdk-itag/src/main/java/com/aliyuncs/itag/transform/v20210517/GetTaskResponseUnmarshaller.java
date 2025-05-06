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

import com.aliyuncs.itag.model.v20210517.GetTaskResponse;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.AssignConfig;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.BizInfo;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.Creator;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.ITagSimpleUserVO;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.ITagTaskWorkflowConfig;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.ITagTaskWorkflowConfig.ITagSimpleUserGroupVO;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.ITagTaskWorkflowConfig.ITagSimpleUserVO1;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.Modifier;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.NoticeConfig;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.OptionTemplateDTO;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.OptionTemplateDTO.Creator3;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.OptionTemplateDTO.Modifier4;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigDTO;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigDTO.QuestionOption;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigDTO.TemplateRobotConfig;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigDTO.TemplateRobotConfig.RobotParam;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.OptionTemplateDTO.RobotConfig;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.OptionTemplateDTO.RobotConfig.EffectStep;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.OptionTemplateDTO.RobotConfig.EffectStep.ProcessConfig;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.OptionTemplateDTO.RobotConfig.ModelServiceConfig;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.OptionTemplateDTO.RobotConfig.ModelServiceConfig.ModelServiceConfig$PostParamPair;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.OptionTemplateDTO.RobotConfig.ModelServiceConfig.ModelServiceConfig$ResultMappingPair;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.OptionTemplateDTO.ViewConfigs;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.OptionTemplateDTO.ViewConfigs.DisplayFieldDTO;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.OptionTemplateDTO.ViewConfigs.DisplayFieldDTO.VisitInfo;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.OptionTemplateDTO.ViewConfigs.DisplayFieldDTO.VisitInfo.AftsConf;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.OptionTemplateDTO.ViewConfigs.DisplayFieldDTO.VisitInfo.OssConf;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.ResultCallbackConfig;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.TaskDatasetProxyRelation;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.TaskTemplateConfig;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.TaskTemplateConfig.RobotConfig6;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.TaskTemplateConfig.RobotConfig6.EffectStep7;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.TaskTemplateConfig.RobotConfig6.EffectStep7.ProcessConfig14;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.TaskTemplateConfig.RobotConfig6.ModelServiceConfig9;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.TaskTemplateConfig.RobotConfig6.ModelServiceConfig9.ModelServiceConfig$PostParamPair12;
import com.aliyuncs.itag.model.v20210517.GetTaskResponse.Result.TaskTemplateConfig.RobotConfig6.ModelServiceConfig9.ModelServiceConfig$ResultMappingPair13;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskResponseUnmarshaller {

	public static GetTaskResponse unmarshall(GetTaskResponse getTaskResponse, UnmarshallerContext _ctx) {
		
		getTaskResponse.setRequestId(_ctx.stringValue("GetTaskResponse.RequestId"));
		getTaskResponse.setCode(_ctx.stringValue("GetTaskResponse.Code"));
		getTaskResponse.setErrInfo(_ctx.stringValue("GetTaskResponse.ErrInfo"));
		getTaskResponse.setMsg(_ctx.stringValue("GetTaskResponse.Msg"));
		getTaskResponse.setSucc(_ctx.booleanValue("GetTaskResponse.Succ"));
		getTaskResponse.setErrorCode(_ctx.stringValue("GetTaskResponse.ErrorCode"));

		Result result = new Result();
		result.setTaskName(_ctx.stringValue("GetTaskResponse.Result.TaskName"));
		result.setTaskId(_ctx.stringValue("GetTaskResponse.Result.TaskId"));
		result.setTemplateId(_ctx.stringValue("GetTaskResponse.Result.TemplateId"));
		result.setProjectId(_ctx.longValue("GetTaskResponse.Result.ProjectId"));
		result.setTaskType(_ctx.stringValue("GetTaskResponse.Result.TaskType"));
		result.setTntInstId(_ctx.stringValue("GetTaskResponse.Result.TntInstId"));
		result.setTntInstName(_ctx.stringValue("GetTaskResponse.Result.TntInstName"));
		result.setRemark(_ctx.stringValue("GetTaskResponse.Result.Remark"));
		result.setAllowAppendData(_ctx.booleanValue("GetTaskResponse.Result.AllowAppendData"));
		result.setChannel(_ctx.stringValue("GetTaskResponse.Result.Channel"));
		result.setSafetyLevel(_ctx.integerValue("GetTaskResponse.Result.SafetyLevel"));
		result.setRelateTaskConfig(_ctx.stringValue("GetTaskResponse.Result.RelateTaskConfig"));
		result.setExif(_ctx.mapValue("GetTaskResponse.Result.Exif"));
		result.setMineConfigs(_ctx.mapValue("GetTaskResponse.Result.MineConfigs"));
		result.setVoteConfigs(_ctx.mapValue("GetTaskResponse.Result.VoteConfigs"));
		result.setRunMsg(_ctx.stringValue("GetTaskResponse.Result.RunMsg"));
		result.setArchived(_ctx.booleanValue("GetTaskResponse.Result.Archived"));
		result.setStage(_ctx.stringValue("GetTaskResponse.Result.Stage"));
		result.setArchivedInfos(_ctx.mapValue("GetTaskResponse.Result.ArchivedInfos"));
		result.setAlertTime(_ctx.integerValue("GetTaskResponse.Result.AlertTime"));
		result.setStatus(_ctx.integerValue("GetTaskResponse.Result.Status"));
		result.setGmtCreate(_ctx.stringValue("GetTaskResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("GetTaskResponse.Result.GmtModified"));

		List<String> workflowNodes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskResponse.Result.WorkflowNodes.Length"); i++) {
			workflowNodes.add(_ctx.stringValue("GetTaskResponse.Result.WorkflowNodes["+ i +"]"));
		}
		result.setWorkflowNodes(workflowNodes);

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskResponse.Result.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("GetTaskResponse.Result.Tags["+ i +"]"));
		}
		result.setTags(tags);

		List<String> supportDownloadTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskResponse.Result.SupportDownloadTypes.Length"); i++) {
			supportDownloadTypes.add(_ctx.stringValue("GetTaskResponse.Result.SupportDownloadTypes["+ i +"]"));
		}
		result.setSupportDownloadTypes(supportDownloadTypes);

		OptionTemplateDTO optionTemplateDTO = new OptionTemplateDTO();
		optionTemplateDTO.setId(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.Id"));
		optionTemplateDTO.setName(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.Name"));
		optionTemplateDTO.setTntInstId(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.TntInstId"));
		optionTemplateDTO.setDescription(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.Description"));
		optionTemplateDTO.setExif(_ctx.mapValue("GetTaskResponse.Result.OptionTemplateDTO.Exif"));
		optionTemplateDTO.setStatus(_ctx.integerValue("GetTaskResponse.Result.OptionTemplateDTO.Status"));
		optionTemplateDTO.setSharedMode(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.SharedMode"));
		optionTemplateDTO.setType(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.Type"));
		optionTemplateDTO.setClassify(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.Classify"));
		optionTemplateDTO.setGmtCreate(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.GmtCreate"));
		optionTemplateDTO.setGmtModified(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.GmtModified"));

		List<String> tags2 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskResponse.Result.OptionTemplateDTO.Tags.Length"); i++) {
			tags2.add(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.Tags["+ i +"]"));
		}
		optionTemplateDTO.setTags2(tags2);

		List<String> abandonReasons = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskResponse.Result.OptionTemplateDTO.AbandonReasons.Length"); i++) {
			abandonReasons.add(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.AbandonReasons["+ i +"]"));
		}
		optionTemplateDTO.setAbandonReasons(abandonReasons);

		ViewConfigs viewConfigs = new ViewConfigs();

		List<DisplayFieldDTO> fields = new ArrayList<DisplayFieldDTO>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskResponse.Result.OptionTemplateDTO.ViewConfigs.Fields.Length"); i++) {
			DisplayFieldDTO displayFieldDTO = new DisplayFieldDTO();
			displayFieldDTO.setFieldName(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.ViewConfigs.Fields["+ i +"].FieldName"));
			displayFieldDTO.setType(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.ViewConfigs.Fields["+ i +"].Type"));
			displayFieldDTO.setCorsProxy(_ctx.booleanValue("GetTaskResponse.Result.OptionTemplateDTO.ViewConfigs.Fields["+ i +"].CorsProxy"));
			displayFieldDTO.setHide(_ctx.booleanValue("GetTaskResponse.Result.OptionTemplateDTO.ViewConfigs.Fields["+ i +"].Hide"));
			displayFieldDTO.setConvertor(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.ViewConfigs.Fields["+ i +"].Convertor"));
			displayFieldDTO.setPlugins(_ctx.mapValue("GetTaskResponse.Result.OptionTemplateDTO.ViewConfigs.Fields["+ i +"].Plugins"));
			displayFieldDTO.setFieldNames(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.ViewConfigs.Fields["+ i +"].FieldNames"));

			List<String> relationQuestionIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskResponse.Result.OptionTemplateDTO.ViewConfigs.Fields["+ i +"].RelationQuestionIds.Length"); j++) {
				relationQuestionIds.add(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.ViewConfigs.Fields["+ i +"].RelationQuestionIds["+ j +"]"));
			}
			displayFieldDTO.setRelationQuestionIds(relationQuestionIds);

			VisitInfo visitInfo = new VisitInfo();

			OssConf ossConf = new OssConf();
			ossConf.setOssEndpoint(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.ViewConfigs.Fields["+ i +"].VisitInfo.OssConf.OssEndpoint"));
			ossConf.setOssAk(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.ViewConfigs.Fields["+ i +"].VisitInfo.OssConf.OssAk"));
			ossConf.setOssAs(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.ViewConfigs.Fields["+ i +"].VisitInfo.OssConf.OssAs"));
			ossConf.setOssOwner(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.ViewConfigs.Fields["+ i +"].VisitInfo.OssConf.OssOwner"));
			ossConf.setOssBucket(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.ViewConfigs.Fields["+ i +"].VisitInfo.OssConf.OssBucket"));
			ossConf.setFolder(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.ViewConfigs.Fields["+ i +"].VisitInfo.OssConf.Folder"));
			ossConf.setExpiredTime(_ctx.longValue("GetTaskResponse.Result.OptionTemplateDTO.ViewConfigs.Fields["+ i +"].VisitInfo.OssConf.ExpiredTime"));
			visitInfo.setOssConf(ossConf);

			AftsConf aftsConf = new AftsConf();
			aftsConf.setExpiredTime(_ctx.integerValue("GetTaskResponse.Result.OptionTemplateDTO.ViewConfigs.Fields["+ i +"].VisitInfo.AftsConf.ExpiredTime"));
			visitInfo.setAftsConf(aftsConf);
			displayFieldDTO.setVisitInfo(visitInfo);

			fields.add(displayFieldDTO);
		}
		viewConfigs.setFields(fields);
		optionTemplateDTO.setViewConfigs(viewConfigs);

		Creator3 creator3 = new Creator3();
		creator3.setUserId(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.Creator.UserId"));
		creator3.setUserName(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.Creator.UserName"));
		creator3.setAccountType(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.Creator.AccountType"));
		creator3.setAccountNo(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.Creator.AccountNo"));
		optionTemplateDTO.setCreator3(creator3);

		Modifier4 modifier4 = new Modifier4();
		modifier4.setUserId(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.Modifier.UserId"));
		modifier4.setUserName(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.Modifier.UserName"));
		modifier4.setAccountType(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.Modifier.AccountType"));
		modifier4.setAccountNo(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.Modifier.AccountNo"));
		optionTemplateDTO.setModifier4(modifier4);

		RobotConfig robotConfig = new RobotConfig();
		robotConfig.setSource(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.RobotConfig.Source"));

		EffectStep effectStep = new EffectStep();
		effectStep.setPreProcess(_ctx.booleanValue("GetTaskResponse.Result.OptionTemplateDTO.RobotConfig.EffectStep.PreProcess"));
		effectStep.setPreLabel(_ctx.booleanValue("GetTaskResponse.Result.OptionTemplateDTO.RobotConfig.EffectStep.PreLabel"));
		effectStep.setLabel(_ctx.booleanValue("GetTaskResponse.Result.OptionTemplateDTO.RobotConfig.EffectStep.Label"));

		ProcessConfig processConfig = new ProcessConfig();

		List<String> relateColumn = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskResponse.Result.OptionTemplateDTO.RobotConfig.EffectStep.ProcessConfig.RelateColumn.Length"); i++) {
			relateColumn.add(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.RobotConfig.EffectStep.ProcessConfig.RelateColumn["+ i +"]"));
		}
		processConfig.setRelateColumn(relateColumn);
		effectStep.setProcessConfig(processConfig);
		robotConfig.setEffectStep(effectStep);

		List<ModelServiceConfig> modelServiceConfigs = new ArrayList<ModelServiceConfig>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskResponse.Result.OptionTemplateDTO.RobotConfig.ModelServiceConfigs.Length"); i++) {
			ModelServiceConfig modelServiceConfig = new ModelServiceConfig();
			modelServiceConfig.setServiceId(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.RobotConfig.ModelServiceConfigs["+ i +"].ServiceId"));
			modelServiceConfig.setServiceName(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.RobotConfig.ModelServiceConfigs["+ i +"].ServiceName"));

			List<ModelServiceConfig$PostParamPair> postParams = new ArrayList<ModelServiceConfig$PostParamPair>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskResponse.Result.OptionTemplateDTO.RobotConfig.ModelServiceConfigs["+ i +"].PostParams.Length"); j++) {
				ModelServiceConfig$PostParamPair modelServiceConfig$PostParamPair = new ModelServiceConfig$PostParamPair();
				modelServiceConfig$PostParamPair.setKey(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.RobotConfig.ModelServiceConfigs["+ i +"].PostParams["+ j +"].Key"));
				modelServiceConfig$PostParamPair.setValue(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.RobotConfig.ModelServiceConfigs["+ i +"].PostParams["+ j +"].Value"));

				postParams.add(modelServiceConfig$PostParamPair);
			}
			modelServiceConfig.setPostParams(postParams);

			List<ModelServiceConfig$ResultMappingPair> resultMappings = new ArrayList<ModelServiceConfig$ResultMappingPair>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskResponse.Result.OptionTemplateDTO.RobotConfig.ModelServiceConfigs["+ i +"].ResultMappings.Length"); j++) {
				ModelServiceConfig$ResultMappingPair modelServiceConfig$ResultMappingPair = new ModelServiceConfig$ResultMappingPair();
				modelServiceConfig$ResultMappingPair.setQuestionId(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.RobotConfig.ModelServiceConfigs["+ i +"].ResultMappings["+ j +"].QuestionId"));
				modelServiceConfig$ResultMappingPair.setResultKey(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.RobotConfig.ModelServiceConfigs["+ i +"].ResultMappings["+ j +"].ResultKey"));
				modelServiceConfig$ResultMappingPair.setMarkTitle(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.RobotConfig.ModelServiceConfigs["+ i +"].ResultMappings["+ j +"].MarkTitle"));

				resultMappings.add(modelServiceConfig$ResultMappingPair);
			}
			modelServiceConfig.setResultMappings(resultMappings);

			modelServiceConfigs.add(modelServiceConfig);
		}
		robotConfig.setModelServiceConfigs(modelServiceConfigs);
		optionTemplateDTO.setRobotConfig(robotConfig);

		List<QuestionConfigDTO> questionConfigs = new ArrayList<QuestionConfigDTO>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs.Length"); i++) {
			QuestionConfigDTO questionConfigDTO = new QuestionConfigDTO();
			questionConfigDTO.setId(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].Id"));
			questionConfigDTO.setMarkTitle(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].MarkTitle"));
			questionConfigDTO.setMarkTitleAlias(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].MarkTitleAlias"));
			questionConfigDTO.setType(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].Type"));
			questionConfigDTO.setMustFill(_ctx.booleanValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].MustFill"));
			questionConfigDTO.setDisplay(_ctx.booleanValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].Display"));
			questionConfigDTO.setSelected(_ctx.booleanValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].Selected"));
			questionConfigDTO.setSelectGroup(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].SelectGroup"));
			questionConfigDTO.setDefaultResult(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].DefaultResult"));
			questionConfigDTO.setRule(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].Rule"));
			questionConfigDTO.setExif(_ctx.mapValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].Exif"));

			List<String> children = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].Children.Length"); j++) {
				children.add(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].Children["+ j +"]"));
			}
			questionConfigDTO.setChildren(children);

			List<String> preOptions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].PreOptions.Length"); j++) {
				preOptions.add(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].PreOptions["+ j +"]"));
			}
			questionConfigDTO.setPreOptions(preOptions);

			List<QuestionOption> options = new ArrayList<QuestionOption>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].Options.Length"); j++) {
				QuestionOption questionOption = new QuestionOption();
				questionOption.setLabel(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].Options["+ j +"].Label"));
				questionOption.setKey(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].Options["+ j +"].Key"));
				questionOption.setShortcut(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].Options["+ j +"].Shortcut"));
				questionOption.setColor(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].Options["+ j +"].Color"));
				questionOption.setValue(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].Options["+ j +"].Value"));

				List<String> children5 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].Options["+ j +"].Children.Length"); k++) {
					children5.add(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].Options["+ j +"].Children["+ k +"]"));
				}
				questionOption.setChildren5(children5);

				options.add(questionOption);
			}
			questionConfigDTO.setOptions(options);

			List<TemplateRobotConfig> robotConfigs = new ArrayList<TemplateRobotConfig>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].RobotConfigs.Length"); j++) {
				TemplateRobotConfig templateRobotConfig = new TemplateRobotConfig();
				templateRobotConfig.setRobotId(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].RobotId"));
				templateRobotConfig.setQuestionId(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].QuestionId"));
				templateRobotConfig.setStage(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Stage"));
				templateRobotConfig.setType(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Type"));
				templateRobotConfig.setResultPath(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].ResultPath"));
				templateRobotConfig.setDefaultResult(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].DefaultResult"));

				List<RobotParam> params = new ArrayList<RobotParam>();
				for (int k = 0; k < _ctx.lengthValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params.Length"); k++) {
					RobotParam robotParam = new RobotParam();
					robotParam.setParamName(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params["+ k +"].ParamName"));
					robotParam.setDataField(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params["+ k +"].DataField"));
					robotParam.setDefaultResult(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params["+ k +"].DefaultResult"));
					robotParam.setServiceId(_ctx.stringValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params["+ k +"].ServiceId"));
					robotParam.setMustFill(_ctx.booleanValue("GetTaskResponse.Result.OptionTemplateDTO.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params["+ k +"].MustFill"));

					params.add(robotParam);
				}
				templateRobotConfig.setParams(params);

				robotConfigs.add(templateRobotConfig);
			}
			questionConfigDTO.setRobotConfigs(robotConfigs);

			questionConfigs.add(questionConfigDTO);
		}
		optionTemplateDTO.setQuestionConfigs(questionConfigs);
		result.setOptionTemplateDTO(optionTemplateDTO);

		TaskTemplateConfig taskTemplateConfig = new TaskTemplateConfig();
		taskTemplateConfig.setExif(_ctx.mapValue("GetTaskResponse.Result.TaskTemplateConfig.Exif"));
		taskTemplateConfig.setTemplateOptionMap(_ctx.mapValue("GetTaskResponse.Result.TaskTemplateConfig.TemplateOptionMap"));
		taskTemplateConfig.setTemplateRelationId(_ctx.stringValue("GetTaskResponse.Result.TaskTemplateConfig.TemplateRelationId"));
		taskTemplateConfig.setResourceKey(_ctx.stringValue("GetTaskResponse.Result.TaskTemplateConfig.ResourceKey"));

		List<String> selectQuestions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskResponse.Result.TaskTemplateConfig.SelectQuestions.Length"); i++) {
			selectQuestions.add(_ctx.stringValue("GetTaskResponse.Result.TaskTemplateConfig.SelectQuestions["+ i +"]"));
		}
		taskTemplateConfig.setSelectQuestions(selectQuestions);

		RobotConfig6 robotConfig6 = new RobotConfig6();
		robotConfig6.setSource(_ctx.stringValue("GetTaskResponse.Result.TaskTemplateConfig.RobotConfig.Source"));

		EffectStep7 effectStep7 = new EffectStep7();
		effectStep7.setPreProcess(_ctx.booleanValue("GetTaskResponse.Result.TaskTemplateConfig.RobotConfig.EffectStep.PreProcess"));
		effectStep7.setPreLabel(_ctx.booleanValue("GetTaskResponse.Result.TaskTemplateConfig.RobotConfig.EffectStep.PreLabel"));
		effectStep7.setLabel(_ctx.booleanValue("GetTaskResponse.Result.TaskTemplateConfig.RobotConfig.EffectStep.Label"));

		ProcessConfig14 processConfig14 = new ProcessConfig14();

		List<String> relateColumn15 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskResponse.Result.TaskTemplateConfig.RobotConfig.EffectStep.ProcessConfig.RelateColumn.Length"); i++) {
			relateColumn15.add(_ctx.stringValue("GetTaskResponse.Result.TaskTemplateConfig.RobotConfig.EffectStep.ProcessConfig.RelateColumn["+ i +"]"));
		}
		processConfig14.setRelateColumn15(relateColumn15);
		effectStep7.setProcessConfig14(processConfig14);
		robotConfig6.setEffectStep7(effectStep7);

		List<ModelServiceConfig9> modelServiceConfigs8 = new ArrayList<ModelServiceConfig9>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskResponse.Result.TaskTemplateConfig.RobotConfig.ModelServiceConfigs.Length"); i++) {
			ModelServiceConfig9 modelServiceConfig9 = new ModelServiceConfig9();
			modelServiceConfig9.setServiceId(_ctx.stringValue("GetTaskResponse.Result.TaskTemplateConfig.RobotConfig.ModelServiceConfigs["+ i +"].ServiceId"));
			modelServiceConfig9.setServiceName(_ctx.stringValue("GetTaskResponse.Result.TaskTemplateConfig.RobotConfig.ModelServiceConfigs["+ i +"].ServiceName"));

			List<ModelServiceConfig$PostParamPair12> postParams10 = new ArrayList<ModelServiceConfig$PostParamPair12>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskResponse.Result.TaskTemplateConfig.RobotConfig.ModelServiceConfigs["+ i +"].PostParams.Length"); j++) {
				ModelServiceConfig$PostParamPair12 modelServiceConfig$PostParamPair12 = new ModelServiceConfig$PostParamPair12();
				modelServiceConfig$PostParamPair12.setKey(_ctx.stringValue("GetTaskResponse.Result.TaskTemplateConfig.RobotConfig.ModelServiceConfigs["+ i +"].PostParams["+ j +"].Key"));
				modelServiceConfig$PostParamPair12.setValue(_ctx.stringValue("GetTaskResponse.Result.TaskTemplateConfig.RobotConfig.ModelServiceConfigs["+ i +"].PostParams["+ j +"].Value"));

				postParams10.add(modelServiceConfig$PostParamPair12);
			}
			modelServiceConfig9.setPostParams10(postParams10);

			List<ModelServiceConfig$ResultMappingPair13> resultMappings11 = new ArrayList<ModelServiceConfig$ResultMappingPair13>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskResponse.Result.TaskTemplateConfig.RobotConfig.ModelServiceConfigs["+ i +"].ResultMappings.Length"); j++) {
				ModelServiceConfig$ResultMappingPair13 modelServiceConfig$ResultMappingPair13 = new ModelServiceConfig$ResultMappingPair13();
				modelServiceConfig$ResultMappingPair13.setQuestionId(_ctx.stringValue("GetTaskResponse.Result.TaskTemplateConfig.RobotConfig.ModelServiceConfigs["+ i +"].ResultMappings["+ j +"].QuestionId"));
				modelServiceConfig$ResultMappingPair13.setResultKey(_ctx.stringValue("GetTaskResponse.Result.TaskTemplateConfig.RobotConfig.ModelServiceConfigs["+ i +"].ResultMappings["+ j +"].ResultKey"));
				modelServiceConfig$ResultMappingPair13.setMarkTitle(_ctx.stringValue("GetTaskResponse.Result.TaskTemplateConfig.RobotConfig.ModelServiceConfigs["+ i +"].ResultMappings["+ j +"].MarkTitle"));

				resultMappings11.add(modelServiceConfig$ResultMappingPair13);
			}
			modelServiceConfig9.setResultMappings11(resultMappings11);

			modelServiceConfigs8.add(modelServiceConfig9);
		}
		robotConfig6.setModelServiceConfigs8(modelServiceConfigs8);
		taskTemplateConfig.setRobotConfig6(robotConfig6);
		result.setTaskTemplateConfig(taskTemplateConfig);

		BizInfo bizInfo = new BizInfo();
		bizInfo.setBizCode(_ctx.stringValue("GetTaskResponse.Result.BizInfo.BizCode"));
		bizInfo.setBizNo(_ctx.stringValue("GetTaskResponse.Result.BizInfo.BizNo"));
		bizInfo.setBizClassify(_ctx.stringValue("GetTaskResponse.Result.BizInfo.BizClassify"));
		result.setBizInfo(bizInfo);

		AssignConfig assignConfig = new AssignConfig();
		assignConfig.setAssignType(_ctx.stringValue("GetTaskResponse.Result.AssignConfig.AssignType"));
		assignConfig.setAssignCount(_ctx.integerValue("GetTaskResponse.Result.AssignConfig.AssignCount"));
		assignConfig.setAssignSubTaskCount(_ctx.integerValue("GetTaskResponse.Result.AssignConfig.AssignSubTaskCount"));
		assignConfig.setAssignField(_ctx.stringValue("GetTaskResponse.Result.AssignConfig.AssignField"));
		result.setAssignConfig(assignConfig);

		NoticeConfig noticeConfig = new NoticeConfig();
		noticeConfig.setDingHook(_ctx.stringValue("GetTaskResponse.Result.NoticeConfig.DingHook"));
		noticeConfig.setSubTaskAlertGap(_ctx.stringValue("GetTaskResponse.Result.NoticeConfig.SubTaskAlertGap"));

		List<String> listenActions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskResponse.Result.NoticeConfig.ListenActions.Length"); i++) {
			listenActions.add(_ctx.stringValue("GetTaskResponse.Result.NoticeConfig.ListenActions["+ i +"]"));
		}
		noticeConfig.setListenActions(listenActions);
		result.setNoticeConfig(noticeConfig);

		ResultCallbackConfig resultCallbackConfig = new ResultCallbackConfig();
		resultCallbackConfig.setRetMsgMode(_ctx.stringValue("GetTaskResponse.Result.ResultCallbackConfig.RetMsgMode"));
		resultCallbackConfig.setExif(_ctx.mapValue("GetTaskResponse.Result.ResultCallbackConfig.Exif"));
		result.setResultCallbackConfig(resultCallbackConfig);

		Creator creator = new Creator();
		creator.setUserId(_ctx.stringValue("GetTaskResponse.Result.Creator.UserId"));
		creator.setUserName(_ctx.stringValue("GetTaskResponse.Result.Creator.UserName"));
		creator.setAccountType(_ctx.stringValue("GetTaskResponse.Result.Creator.AccountType"));
		creator.setAccountNo(_ctx.stringValue("GetTaskResponse.Result.Creator.AccountNo"));
		result.setCreator(creator);

		Modifier modifier = new Modifier();
		modifier.setUserId(_ctx.stringValue("GetTaskResponse.Result.Modifier.UserId"));
		modifier.setUserName(_ctx.stringValue("GetTaskResponse.Result.Modifier.UserName"));
		modifier.setAccountType(_ctx.stringValue("GetTaskResponse.Result.Modifier.AccountType"));
		modifier.setAccountNo(_ctx.stringValue("GetTaskResponse.Result.Modifier.AccountNo"));
		result.setModifier(modifier);

		List<TaskDatasetProxyRelation> datasetProxyRelations = new ArrayList<TaskDatasetProxyRelation>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskResponse.Result.DatasetProxyRelations.Length"); i++) {
			TaskDatasetProxyRelation taskDatasetProxyRelation = new TaskDatasetProxyRelation();
			taskDatasetProxyRelation.setDatasetId(_ctx.stringValue("GetTaskResponse.Result.DatasetProxyRelations["+ i +"].DatasetId"));
			taskDatasetProxyRelation.setSource(_ctx.stringValue("GetTaskResponse.Result.DatasetProxyRelations["+ i +"].Source"));
			taskDatasetProxyRelation.setSourceBizId(_ctx.stringValue("GetTaskResponse.Result.DatasetProxyRelations["+ i +"].SourceBizId"));
			taskDatasetProxyRelation.setDatasetType(_ctx.stringValue("GetTaskResponse.Result.DatasetProxyRelations["+ i +"].DatasetType"));
			taskDatasetProxyRelation.setExif(_ctx.mapValue("GetTaskResponse.Result.DatasetProxyRelations["+ i +"].Exif"));

			datasetProxyRelations.add(taskDatasetProxyRelation);
		}
		result.setDatasetProxyRelations(datasetProxyRelations);

		List<ITagSimpleUserVO> admins = new ArrayList<ITagSimpleUserVO>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskResponse.Result.Admins.Length"); i++) {
			ITagSimpleUserVO iTagSimpleUserVO = new ITagSimpleUserVO();
			iTagSimpleUserVO.setUserId(_ctx.stringValue("GetTaskResponse.Result.Admins["+ i +"].UserId"));
			iTagSimpleUserVO.setUserName(_ctx.stringValue("GetTaskResponse.Result.Admins["+ i +"].UserName"));
			iTagSimpleUserVO.setAccountType(_ctx.stringValue("GetTaskResponse.Result.Admins["+ i +"].AccountType"));
			iTagSimpleUserVO.setAccountNo(_ctx.stringValue("GetTaskResponse.Result.Admins["+ i +"].AccountNo"));

			admins.add(iTagSimpleUserVO);
		}
		result.setAdmins(admins);

		List<ITagTaskWorkflowConfig> taskWorkFlow = new ArrayList<ITagTaskWorkflowConfig>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskResponse.Result.TaskWorkFlow.Length"); i++) {
			ITagTaskWorkflowConfig iTagTaskWorkflowConfig = new ITagTaskWorkflowConfig();
			iTagTaskWorkflowConfig.setNodeName(_ctx.stringValue("GetTaskResponse.Result.TaskWorkFlow["+ i +"].NodeName"));
			iTagTaskWorkflowConfig.setExif(_ctx.mapValue("GetTaskResponse.Result.TaskWorkFlow["+ i +"].Exif"));

			List<ITagSimpleUserVO1> users = new ArrayList<ITagSimpleUserVO1>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskResponse.Result.TaskWorkFlow["+ i +"].Users.Length"); j++) {
				ITagSimpleUserVO1 iTagSimpleUserVO1 = new ITagSimpleUserVO1();
				iTagSimpleUserVO1.setUserId(_ctx.stringValue("GetTaskResponse.Result.TaskWorkFlow["+ i +"].Users["+ j +"].UserId"));
				iTagSimpleUserVO1.setUserName(_ctx.stringValue("GetTaskResponse.Result.TaskWorkFlow["+ i +"].Users["+ j +"].UserName"));
				iTagSimpleUserVO1.setAccountType(_ctx.stringValue("GetTaskResponse.Result.TaskWorkFlow["+ i +"].Users["+ j +"].AccountType"));
				iTagSimpleUserVO1.setAccountNo(_ctx.stringValue("GetTaskResponse.Result.TaskWorkFlow["+ i +"].Users["+ j +"].AccountNo"));

				users.add(iTagSimpleUserVO1);
			}
			iTagTaskWorkflowConfig.setUsers(users);

			List<ITagSimpleUserGroupVO> groups = new ArrayList<ITagSimpleUserGroupVO>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskResponse.Result.TaskWorkFlow["+ i +"].Groups.Length"); j++) {
				ITagSimpleUserGroupVO iTagSimpleUserGroupVO = new ITagSimpleUserGroupVO();
				iTagSimpleUserGroupVO.setGroupId(_ctx.stringValue("GetTaskResponse.Result.TaskWorkFlow["+ i +"].Groups["+ j +"].GroupId"));
				iTagSimpleUserGroupVO.setGroupName(_ctx.stringValue("GetTaskResponse.Result.TaskWorkFlow["+ i +"].Groups["+ j +"].GroupName"));

				groups.add(iTagSimpleUserGroupVO);
			}
			iTagTaskWorkflowConfig.setGroups(groups);

			taskWorkFlow.add(iTagTaskWorkflowConfig);
		}
		result.setTaskWorkFlow(taskWorkFlow);
		getTaskResponse.setResult(result);
	 
	 	return getTaskResponse;
	}
}