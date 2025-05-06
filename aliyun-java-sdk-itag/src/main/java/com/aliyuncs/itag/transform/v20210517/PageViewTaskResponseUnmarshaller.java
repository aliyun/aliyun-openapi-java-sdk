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

import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.AssignConfig;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.BizInfo;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.Creator;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.ITagSimpleUserVO;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.ITagTaskWorkflowConfig;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.ITagTaskWorkflowConfig.ITagSimpleUserGroupVO;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.ITagTaskWorkflowConfig.ITagSimpleUserVO1;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.Modifier;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.NoticeConfig;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.OptionTemplateDTO;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.OptionTemplateDTO.Creator3;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.OptionTemplateDTO.Modifier4;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.OptionTemplateDTO.QuestionConfigDTO;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.OptionTemplateDTO.QuestionConfigDTO.QuestionOption;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.OptionTemplateDTO.QuestionConfigDTO.TemplateRobotConfig;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.OptionTemplateDTO.QuestionConfigDTO.TemplateRobotConfig.RobotParam;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.OptionTemplateDTO.RobotConfig;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.OptionTemplateDTO.RobotConfig.EffectStep;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.OptionTemplateDTO.RobotConfig.EffectStep.ProcessConfig;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.OptionTemplateDTO.RobotConfig.ModelServiceConfig;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.OptionTemplateDTO.RobotConfig.ModelServiceConfig.ModelServiceConfig$PostParamPair;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.OptionTemplateDTO.RobotConfig.ModelServiceConfig.ModelServiceConfig$ResultMappingPair;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.OptionTemplateDTO.ViewConfigs;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.OptionTemplateDTO.ViewConfigs.DisplayFieldDTO;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.OptionTemplateDTO.ViewConfigs.DisplayFieldDTO.VisitInfo;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.OptionTemplateDTO.ViewConfigs.DisplayFieldDTO.VisitInfo.AftsConf;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.OptionTemplateDTO.ViewConfigs.DisplayFieldDTO.VisitInfo.OssConf;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.ResultCallbackConfig;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.TaskDatasetProxyRelation;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.TaskTemplateConfig;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.TaskTemplateConfig.RobotConfig6;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.TaskTemplateConfig.RobotConfig6.EffectStep7;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.TaskTemplateConfig.RobotConfig6.EffectStep7.ProcessConfig14;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.TaskTemplateConfig.RobotConfig6.ModelServiceConfig9;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.TaskTemplateConfig.RobotConfig6.ModelServiceConfig9.ModelServiceConfig$PostParamPair12;
import com.aliyuncs.itag.model.v20210517.PageViewTaskResponse.Result.ITagTaskDTO.TaskTemplateConfig.RobotConfig6.ModelServiceConfig9.ModelServiceConfig$ResultMappingPair13;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageViewTaskResponseUnmarshaller {

	public static PageViewTaskResponse unmarshall(PageViewTaskResponse pageViewTaskResponse, UnmarshallerContext _ctx) {
		
		pageViewTaskResponse.setRequestId(_ctx.stringValue("PageViewTaskResponse.RequestId"));
		pageViewTaskResponse.setCode(_ctx.stringValue("PageViewTaskResponse.Code"));
		pageViewTaskResponse.setErrInfo(_ctx.stringValue("PageViewTaskResponse.ErrInfo"));
		pageViewTaskResponse.setMsg(_ctx.stringValue("PageViewTaskResponse.Msg"));
		pageViewTaskResponse.setSucc(_ctx.booleanValue("PageViewTaskResponse.Succ"));
		pageViewTaskResponse.setErrorCode(_ctx.stringValue("PageViewTaskResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.longValue("PageViewTaskResponse.Result.PageNum"));
		result.setPageSize(_ctx.longValue("PageViewTaskResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("PageViewTaskResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("PageViewTaskResponse.Result.TotalPage"));

		List<ITagTaskDTO> list = new ArrayList<ITagTaskDTO>();
		for (int i = 0; i < _ctx.lengthValue("PageViewTaskResponse.Result.List.Length"); i++) {
			ITagTaskDTO iTagTaskDTO = new ITagTaskDTO();
			iTagTaskDTO.setTaskName(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TaskName"));
			iTagTaskDTO.setTaskId(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TaskId"));
			iTagTaskDTO.setTemplateId(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TemplateId"));
			iTagTaskDTO.setProjectId(_ctx.longValue("PageViewTaskResponse.Result.List["+ i +"].ProjectId"));
			iTagTaskDTO.setTaskType(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TaskType"));
			iTagTaskDTO.setTntInstId(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TntInstId"));
			iTagTaskDTO.setTntInstName(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TntInstName"));
			iTagTaskDTO.setRemark(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].Remark"));
			iTagTaskDTO.setAllowAppendData(_ctx.booleanValue("PageViewTaskResponse.Result.List["+ i +"].AllowAppendData"));
			iTagTaskDTO.setChannel(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].Channel"));
			iTagTaskDTO.setSafetyLevel(_ctx.integerValue("PageViewTaskResponse.Result.List["+ i +"].SafetyLevel"));
			iTagTaskDTO.setRelateTaskConfig(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].RelateTaskConfig"));
			iTagTaskDTO.setExif(_ctx.mapValue("PageViewTaskResponse.Result.List["+ i +"].Exif"));
			iTagTaskDTO.setMineConfigs(_ctx.mapValue("PageViewTaskResponse.Result.List["+ i +"].MineConfigs"));
			iTagTaskDTO.setVoteConfigs(_ctx.mapValue("PageViewTaskResponse.Result.List["+ i +"].VoteConfigs"));
			iTagTaskDTO.setRunMsg(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].RunMsg"));
			iTagTaskDTO.setArchived(_ctx.booleanValue("PageViewTaskResponse.Result.List["+ i +"].Archived"));
			iTagTaskDTO.setStage(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].Stage"));
			iTagTaskDTO.setArchivedInfos(_ctx.mapValue("PageViewTaskResponse.Result.List["+ i +"].ArchivedInfos"));
			iTagTaskDTO.setAlertTime(_ctx.integerValue("PageViewTaskResponse.Result.List["+ i +"].AlertTime"));
			iTagTaskDTO.setStatus(_ctx.integerValue("PageViewTaskResponse.Result.List["+ i +"].Status"));
			iTagTaskDTO.setGmtCreate(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].GmtCreate"));
			iTagTaskDTO.setGmtModified(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].GmtModified"));

			List<String> workflowNodes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].WorkflowNodes.Length"); j++) {
				workflowNodes.add(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].WorkflowNodes["+ j +"]"));
			}
			iTagTaskDTO.setWorkflowNodes(workflowNodes);

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].Tags["+ j +"]"));
			}
			iTagTaskDTO.setTags(tags);

			List<String> supportDownloadTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].SupportDownloadTypes.Length"); j++) {
				supportDownloadTypes.add(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].SupportDownloadTypes["+ j +"]"));
			}
			iTagTaskDTO.setSupportDownloadTypes(supportDownloadTypes);

			OptionTemplateDTO optionTemplateDTO = new OptionTemplateDTO();
			optionTemplateDTO.setId(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.Id"));
			optionTemplateDTO.setName(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.Name"));
			optionTemplateDTO.setTntInstId(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.TntInstId"));
			optionTemplateDTO.setDescription(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.Description"));
			optionTemplateDTO.setExif(_ctx.mapValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.Exif"));
			optionTemplateDTO.setStatus(_ctx.integerValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.Status"));
			optionTemplateDTO.setSharedMode(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.SharedMode"));
			optionTemplateDTO.setType(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.Type"));
			optionTemplateDTO.setClassify(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.Classify"));
			optionTemplateDTO.setGmtCreate(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.GmtCreate"));
			optionTemplateDTO.setGmtModified(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.GmtModified"));

			List<String> tags2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.Tags.Length"); j++) {
				tags2.add(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.Tags["+ j +"]"));
			}
			optionTemplateDTO.setTags2(tags2);

			List<String> abandonReasons = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.AbandonReasons.Length"); j++) {
				abandonReasons.add(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.AbandonReasons["+ j +"]"));
			}
			optionTemplateDTO.setAbandonReasons(abandonReasons);

			ViewConfigs viewConfigs = new ViewConfigs();

			List<DisplayFieldDTO> fields = new ArrayList<DisplayFieldDTO>();
			for (int j = 0; j < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.ViewConfigs.Fields.Length"); j++) {
				DisplayFieldDTO displayFieldDTO = new DisplayFieldDTO();
				displayFieldDTO.setFieldName(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.ViewConfigs.Fields["+ j +"].FieldName"));
				displayFieldDTO.setType(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.ViewConfigs.Fields["+ j +"].Type"));
				displayFieldDTO.setCorsProxy(_ctx.booleanValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.ViewConfigs.Fields["+ j +"].CorsProxy"));
				displayFieldDTO.setHide(_ctx.booleanValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.ViewConfigs.Fields["+ j +"].Hide"));
				displayFieldDTO.setConvertor(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.ViewConfigs.Fields["+ j +"].Convertor"));
				displayFieldDTO.setPlugins(_ctx.mapValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.ViewConfigs.Fields["+ j +"].Plugins"));
				displayFieldDTO.setFieldNames(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.ViewConfigs.Fields["+ j +"].FieldNames"));

				List<String> relationQuestionIds = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.ViewConfigs.Fields["+ j +"].RelationQuestionIds.Length"); k++) {
					relationQuestionIds.add(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.ViewConfigs.Fields["+ j +"].RelationQuestionIds["+ k +"]"));
				}
				displayFieldDTO.setRelationQuestionIds(relationQuestionIds);

				VisitInfo visitInfo = new VisitInfo();

				OssConf ossConf = new OssConf();
				ossConf.setOssEndpoint(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.ViewConfigs.Fields["+ j +"].VisitInfo.OssConf.OssEndpoint"));
				ossConf.setOssAk(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.ViewConfigs.Fields["+ j +"].VisitInfo.OssConf.OssAk"));
				ossConf.setOssAs(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.ViewConfigs.Fields["+ j +"].VisitInfo.OssConf.OssAs"));
				ossConf.setOssOwner(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.ViewConfigs.Fields["+ j +"].VisitInfo.OssConf.OssOwner"));
				ossConf.setOssBucket(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.ViewConfigs.Fields["+ j +"].VisitInfo.OssConf.OssBucket"));
				ossConf.setFolder(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.ViewConfigs.Fields["+ j +"].VisitInfo.OssConf.Folder"));
				ossConf.setExpiredTime(_ctx.longValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.ViewConfigs.Fields["+ j +"].VisitInfo.OssConf.ExpiredTime"));
				visitInfo.setOssConf(ossConf);

				AftsConf aftsConf = new AftsConf();
				aftsConf.setExpiredTime(_ctx.integerValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.ViewConfigs.Fields["+ j +"].VisitInfo.AftsConf.ExpiredTime"));
				visitInfo.setAftsConf(aftsConf);
				displayFieldDTO.setVisitInfo(visitInfo);

				fields.add(displayFieldDTO);
			}
			viewConfigs.setFields(fields);
			optionTemplateDTO.setViewConfigs(viewConfigs);

			Creator3 creator3 = new Creator3();
			creator3.setUserId(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.Creator.UserId"));
			creator3.setUserName(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.Creator.UserName"));
			creator3.setAccountType(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.Creator.AccountType"));
			creator3.setAccountNo(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.Creator.AccountNo"));
			optionTemplateDTO.setCreator3(creator3);

			Modifier4 modifier4 = new Modifier4();
			modifier4.setUserId(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.Modifier.UserId"));
			modifier4.setUserName(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.Modifier.UserName"));
			modifier4.setAccountType(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.Modifier.AccountType"));
			modifier4.setAccountNo(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.Modifier.AccountNo"));
			optionTemplateDTO.setModifier4(modifier4);

			RobotConfig robotConfig = new RobotConfig();
			robotConfig.setSource(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.RobotConfig.Source"));

			EffectStep effectStep = new EffectStep();
			effectStep.setPreProcess(_ctx.booleanValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.RobotConfig.EffectStep.PreProcess"));
			effectStep.setPreLabel(_ctx.booleanValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.RobotConfig.EffectStep.PreLabel"));
			effectStep.setLabel(_ctx.booleanValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.RobotConfig.EffectStep.Label"));

			ProcessConfig processConfig = new ProcessConfig();

			List<String> relateColumn = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.RobotConfig.EffectStep.ProcessConfig.RelateColumn.Length"); j++) {
				relateColumn.add(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.RobotConfig.EffectStep.ProcessConfig.RelateColumn["+ j +"]"));
			}
			processConfig.setRelateColumn(relateColumn);
			effectStep.setProcessConfig(processConfig);
			robotConfig.setEffectStep(effectStep);

			List<ModelServiceConfig> modelServiceConfigs = new ArrayList<ModelServiceConfig>();
			for (int j = 0; j < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.RobotConfig.ModelServiceConfigs.Length"); j++) {
				ModelServiceConfig modelServiceConfig = new ModelServiceConfig();
				modelServiceConfig.setServiceId(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.RobotConfig.ModelServiceConfigs["+ j +"].ServiceId"));
				modelServiceConfig.setServiceName(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.RobotConfig.ModelServiceConfigs["+ j +"].ServiceName"));

				List<ModelServiceConfig$PostParamPair> postParams = new ArrayList<ModelServiceConfig$PostParamPair>();
				for (int k = 0; k < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.RobotConfig.ModelServiceConfigs["+ j +"].PostParams.Length"); k++) {
					ModelServiceConfig$PostParamPair modelServiceConfig$PostParamPair = new ModelServiceConfig$PostParamPair();
					modelServiceConfig$PostParamPair.setKey(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.RobotConfig.ModelServiceConfigs["+ j +"].PostParams["+ k +"].Key"));
					modelServiceConfig$PostParamPair.setValue(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.RobotConfig.ModelServiceConfigs["+ j +"].PostParams["+ k +"].Value"));

					postParams.add(modelServiceConfig$PostParamPair);
				}
				modelServiceConfig.setPostParams(postParams);

				List<ModelServiceConfig$ResultMappingPair> resultMappings = new ArrayList<ModelServiceConfig$ResultMappingPair>();
				for (int k = 0; k < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.RobotConfig.ModelServiceConfigs["+ j +"].ResultMappings.Length"); k++) {
					ModelServiceConfig$ResultMappingPair modelServiceConfig$ResultMappingPair = new ModelServiceConfig$ResultMappingPair();
					modelServiceConfig$ResultMappingPair.setQuestionId(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.RobotConfig.ModelServiceConfigs["+ j +"].ResultMappings["+ k +"].QuestionId"));
					modelServiceConfig$ResultMappingPair.setResultKey(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.RobotConfig.ModelServiceConfigs["+ j +"].ResultMappings["+ k +"].ResultKey"));
					modelServiceConfig$ResultMappingPair.setMarkTitle(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.RobotConfig.ModelServiceConfigs["+ j +"].ResultMappings["+ k +"].MarkTitle"));

					resultMappings.add(modelServiceConfig$ResultMappingPair);
				}
				modelServiceConfig.setResultMappings(resultMappings);

				modelServiceConfigs.add(modelServiceConfig);
			}
			robotConfig.setModelServiceConfigs(modelServiceConfigs);
			optionTemplateDTO.setRobotConfig(robotConfig);

			List<QuestionConfigDTO> questionConfigs = new ArrayList<QuestionConfigDTO>();
			for (int j = 0; j < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs.Length"); j++) {
				QuestionConfigDTO questionConfigDTO = new QuestionConfigDTO();
				questionConfigDTO.setId(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].Id"));
				questionConfigDTO.setMarkTitle(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].MarkTitle"));
				questionConfigDTO.setMarkTitleAlias(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].MarkTitleAlias"));
				questionConfigDTO.setType(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].Type"));
				questionConfigDTO.setMustFill(_ctx.booleanValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].MustFill"));
				questionConfigDTO.setDisplay(_ctx.booleanValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].Display"));
				questionConfigDTO.setSelected(_ctx.booleanValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].Selected"));
				questionConfigDTO.setSelectGroup(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].SelectGroup"));
				questionConfigDTO.setDefaultResult(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].DefaultResult"));
				questionConfigDTO.setRule(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].Rule"));
				questionConfigDTO.setExif(_ctx.mapValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].Exif"));

				List<String> children = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].Children.Length"); k++) {
					children.add(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].Children["+ k +"]"));
				}
				questionConfigDTO.setChildren(children);

				List<String> preOptions = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].PreOptions.Length"); k++) {
					preOptions.add(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].PreOptions["+ k +"]"));
				}
				questionConfigDTO.setPreOptions(preOptions);

				List<QuestionOption> options = new ArrayList<QuestionOption>();
				for (int k = 0; k < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].Options.Length"); k++) {
					QuestionOption questionOption = new QuestionOption();
					questionOption.setLabel(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].Options["+ k +"].Label"));
					questionOption.setKey(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].Options["+ k +"].Key"));
					questionOption.setShortcut(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].Options["+ k +"].Shortcut"));
					questionOption.setColor(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].Options["+ k +"].Color"));
					questionOption.setValue(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].Options["+ k +"].Value"));

					List<String> children5 = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].Options["+ k +"].Children.Length"); l++) {
						children5.add(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].Options["+ k +"].Children["+ l +"]"));
					}
					questionOption.setChildren5(children5);

					options.add(questionOption);
				}
				questionConfigDTO.setOptions(options);

				List<TemplateRobotConfig> robotConfigs = new ArrayList<TemplateRobotConfig>();
				for (int k = 0; k < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].RobotConfigs.Length"); k++) {
					TemplateRobotConfig templateRobotConfig = new TemplateRobotConfig();
					templateRobotConfig.setRobotId(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].RobotConfigs["+ k +"].RobotId"));
					templateRobotConfig.setQuestionId(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].RobotConfigs["+ k +"].QuestionId"));
					templateRobotConfig.setStage(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].RobotConfigs["+ k +"].Stage"));
					templateRobotConfig.setType(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].RobotConfigs["+ k +"].Type"));
					templateRobotConfig.setResultPath(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].RobotConfigs["+ k +"].ResultPath"));
					templateRobotConfig.setDefaultResult(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].RobotConfigs["+ k +"].DefaultResult"));

					List<RobotParam> params = new ArrayList<RobotParam>();
					for (int l = 0; l < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].RobotConfigs["+ k +"].Params.Length"); l++) {
						RobotParam robotParam = new RobotParam();
						robotParam.setParamName(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].RobotConfigs["+ k +"].Params["+ l +"].ParamName"));
						robotParam.setDataField(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].RobotConfigs["+ k +"].Params["+ l +"].DataField"));
						robotParam.setDefaultResult(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].RobotConfigs["+ k +"].Params["+ l +"].DefaultResult"));
						robotParam.setServiceId(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].RobotConfigs["+ k +"].Params["+ l +"].ServiceId"));
						robotParam.setMustFill(_ctx.booleanValue("PageViewTaskResponse.Result.List["+ i +"].OptionTemplateDTO.QuestionConfigs["+ j +"].RobotConfigs["+ k +"].Params["+ l +"].MustFill"));

						params.add(robotParam);
					}
					templateRobotConfig.setParams(params);

					robotConfigs.add(templateRobotConfig);
				}
				questionConfigDTO.setRobotConfigs(robotConfigs);

				questionConfigs.add(questionConfigDTO);
			}
			optionTemplateDTO.setQuestionConfigs(questionConfigs);
			iTagTaskDTO.setOptionTemplateDTO(optionTemplateDTO);

			TaskTemplateConfig taskTemplateConfig = new TaskTemplateConfig();
			taskTemplateConfig.setExif(_ctx.mapValue("PageViewTaskResponse.Result.List["+ i +"].TaskTemplateConfig.Exif"));
			taskTemplateConfig.setTemplateOptionMap(_ctx.mapValue("PageViewTaskResponse.Result.List["+ i +"].TaskTemplateConfig.TemplateOptionMap"));
			taskTemplateConfig.setTemplateRelationId(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TaskTemplateConfig.TemplateRelationId"));
			taskTemplateConfig.setResourceKey(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TaskTemplateConfig.ResourceKey"));

			List<String> selectQuestions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].TaskTemplateConfig.SelectQuestions.Length"); j++) {
				selectQuestions.add(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TaskTemplateConfig.SelectQuestions["+ j +"]"));
			}
			taskTemplateConfig.setSelectQuestions(selectQuestions);

			RobotConfig6 robotConfig6 = new RobotConfig6();
			robotConfig6.setSource(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TaskTemplateConfig.RobotConfig.Source"));

			EffectStep7 effectStep7 = new EffectStep7();
			effectStep7.setPreProcess(_ctx.booleanValue("PageViewTaskResponse.Result.List["+ i +"].TaskTemplateConfig.RobotConfig.EffectStep.PreProcess"));
			effectStep7.setPreLabel(_ctx.booleanValue("PageViewTaskResponse.Result.List["+ i +"].TaskTemplateConfig.RobotConfig.EffectStep.PreLabel"));
			effectStep7.setLabel(_ctx.booleanValue("PageViewTaskResponse.Result.List["+ i +"].TaskTemplateConfig.RobotConfig.EffectStep.Label"));

			ProcessConfig14 processConfig14 = new ProcessConfig14();

			List<String> relateColumn15 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].TaskTemplateConfig.RobotConfig.EffectStep.ProcessConfig.RelateColumn.Length"); j++) {
				relateColumn15.add(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TaskTemplateConfig.RobotConfig.EffectStep.ProcessConfig.RelateColumn["+ j +"]"));
			}
			processConfig14.setRelateColumn15(relateColumn15);
			effectStep7.setProcessConfig14(processConfig14);
			robotConfig6.setEffectStep7(effectStep7);

			List<ModelServiceConfig9> modelServiceConfigs8 = new ArrayList<ModelServiceConfig9>();
			for (int j = 0; j < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].TaskTemplateConfig.RobotConfig.ModelServiceConfigs.Length"); j++) {
				ModelServiceConfig9 modelServiceConfig9 = new ModelServiceConfig9();
				modelServiceConfig9.setServiceId(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TaskTemplateConfig.RobotConfig.ModelServiceConfigs["+ j +"].ServiceId"));
				modelServiceConfig9.setServiceName(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TaskTemplateConfig.RobotConfig.ModelServiceConfigs["+ j +"].ServiceName"));

				List<ModelServiceConfig$PostParamPair12> postParams10 = new ArrayList<ModelServiceConfig$PostParamPair12>();
				for (int k = 0; k < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].TaskTemplateConfig.RobotConfig.ModelServiceConfigs["+ j +"].PostParams.Length"); k++) {
					ModelServiceConfig$PostParamPair12 modelServiceConfig$PostParamPair12 = new ModelServiceConfig$PostParamPair12();
					modelServiceConfig$PostParamPair12.setKey(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TaskTemplateConfig.RobotConfig.ModelServiceConfigs["+ j +"].PostParams["+ k +"].Key"));
					modelServiceConfig$PostParamPair12.setValue(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TaskTemplateConfig.RobotConfig.ModelServiceConfigs["+ j +"].PostParams["+ k +"].Value"));

					postParams10.add(modelServiceConfig$PostParamPair12);
				}
				modelServiceConfig9.setPostParams10(postParams10);

				List<ModelServiceConfig$ResultMappingPair13> resultMappings11 = new ArrayList<ModelServiceConfig$ResultMappingPair13>();
				for (int k = 0; k < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].TaskTemplateConfig.RobotConfig.ModelServiceConfigs["+ j +"].ResultMappings.Length"); k++) {
					ModelServiceConfig$ResultMappingPair13 modelServiceConfig$ResultMappingPair13 = new ModelServiceConfig$ResultMappingPair13();
					modelServiceConfig$ResultMappingPair13.setQuestionId(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TaskTemplateConfig.RobotConfig.ModelServiceConfigs["+ j +"].ResultMappings["+ k +"].QuestionId"));
					modelServiceConfig$ResultMappingPair13.setResultKey(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TaskTemplateConfig.RobotConfig.ModelServiceConfigs["+ j +"].ResultMappings["+ k +"].ResultKey"));
					modelServiceConfig$ResultMappingPair13.setMarkTitle(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TaskTemplateConfig.RobotConfig.ModelServiceConfigs["+ j +"].ResultMappings["+ k +"].MarkTitle"));

					resultMappings11.add(modelServiceConfig$ResultMappingPair13);
				}
				modelServiceConfig9.setResultMappings11(resultMappings11);

				modelServiceConfigs8.add(modelServiceConfig9);
			}
			robotConfig6.setModelServiceConfigs8(modelServiceConfigs8);
			taskTemplateConfig.setRobotConfig6(robotConfig6);
			iTagTaskDTO.setTaskTemplateConfig(taskTemplateConfig);

			BizInfo bizInfo = new BizInfo();
			bizInfo.setBizCode(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].BizInfo.BizCode"));
			bizInfo.setBizNo(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].BizInfo.BizNo"));
			bizInfo.setBizClassify(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].BizInfo.BizClassify"));
			iTagTaskDTO.setBizInfo(bizInfo);

			AssignConfig assignConfig = new AssignConfig();
			assignConfig.setAssignType(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].AssignConfig.AssignType"));
			assignConfig.setAssignCount(_ctx.integerValue("PageViewTaskResponse.Result.List["+ i +"].AssignConfig.AssignCount"));
			assignConfig.setAssignSubTaskCount(_ctx.integerValue("PageViewTaskResponse.Result.List["+ i +"].AssignConfig.AssignSubTaskCount"));
			assignConfig.setAssignField(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].AssignConfig.AssignField"));
			iTagTaskDTO.setAssignConfig(assignConfig);

			NoticeConfig noticeConfig = new NoticeConfig();
			noticeConfig.setDingHook(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].NoticeConfig.DingHook"));
			noticeConfig.setSubTaskAlertGap(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].NoticeConfig.SubTaskAlertGap"));

			List<String> listenActions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].NoticeConfig.ListenActions.Length"); j++) {
				listenActions.add(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].NoticeConfig.ListenActions["+ j +"]"));
			}
			noticeConfig.setListenActions(listenActions);
			iTagTaskDTO.setNoticeConfig(noticeConfig);

			ResultCallbackConfig resultCallbackConfig = new ResultCallbackConfig();
			resultCallbackConfig.setRetMsgMode(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].ResultCallbackConfig.RetMsgMode"));
			resultCallbackConfig.setExif(_ctx.mapValue("PageViewTaskResponse.Result.List["+ i +"].ResultCallbackConfig.Exif"));
			iTagTaskDTO.setResultCallbackConfig(resultCallbackConfig);

			Creator creator = new Creator();
			creator.setUserId(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].Creator.UserId"));
			creator.setUserName(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].Creator.UserName"));
			creator.setAccountType(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].Creator.AccountType"));
			creator.setAccountNo(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].Creator.AccountNo"));
			iTagTaskDTO.setCreator(creator);

			Modifier modifier = new Modifier();
			modifier.setUserId(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].Modifier.UserId"));
			modifier.setUserName(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].Modifier.UserName"));
			modifier.setAccountType(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].Modifier.AccountType"));
			modifier.setAccountNo(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].Modifier.AccountNo"));
			iTagTaskDTO.setModifier(modifier);

			List<TaskDatasetProxyRelation> datasetProxyRelations = new ArrayList<TaskDatasetProxyRelation>();
			for (int j = 0; j < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].DatasetProxyRelations.Length"); j++) {
				TaskDatasetProxyRelation taskDatasetProxyRelation = new TaskDatasetProxyRelation();
				taskDatasetProxyRelation.setDatasetId(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].DatasetProxyRelations["+ j +"].DatasetId"));
				taskDatasetProxyRelation.setSource(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].DatasetProxyRelations["+ j +"].Source"));
				taskDatasetProxyRelation.setSourceBizId(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].DatasetProxyRelations["+ j +"].SourceBizId"));
				taskDatasetProxyRelation.setDatasetType(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].DatasetProxyRelations["+ j +"].DatasetType"));
				taskDatasetProxyRelation.setExif(_ctx.mapValue("PageViewTaskResponse.Result.List["+ i +"].DatasetProxyRelations["+ j +"].Exif"));

				datasetProxyRelations.add(taskDatasetProxyRelation);
			}
			iTagTaskDTO.setDatasetProxyRelations(datasetProxyRelations);

			List<ITagSimpleUserVO> admins = new ArrayList<ITagSimpleUserVO>();
			for (int j = 0; j < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].Admins.Length"); j++) {
				ITagSimpleUserVO iTagSimpleUserVO = new ITagSimpleUserVO();
				iTagSimpleUserVO.setUserId(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].Admins["+ j +"].UserId"));
				iTagSimpleUserVO.setUserName(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].Admins["+ j +"].UserName"));
				iTagSimpleUserVO.setAccountType(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].Admins["+ j +"].AccountType"));
				iTagSimpleUserVO.setAccountNo(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].Admins["+ j +"].AccountNo"));

				admins.add(iTagSimpleUserVO);
			}
			iTagTaskDTO.setAdmins(admins);

			List<ITagTaskWorkflowConfig> taskWorkFlow = new ArrayList<ITagTaskWorkflowConfig>();
			for (int j = 0; j < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].TaskWorkFlow.Length"); j++) {
				ITagTaskWorkflowConfig iTagTaskWorkflowConfig = new ITagTaskWorkflowConfig();
				iTagTaskWorkflowConfig.setNodeName(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TaskWorkFlow["+ j +"].NodeName"));
				iTagTaskWorkflowConfig.setExif(_ctx.mapValue("PageViewTaskResponse.Result.List["+ i +"].TaskWorkFlow["+ j +"].Exif"));

				List<ITagSimpleUserVO1> users = new ArrayList<ITagSimpleUserVO1>();
				for (int k = 0; k < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].TaskWorkFlow["+ j +"].Users.Length"); k++) {
					ITagSimpleUserVO1 iTagSimpleUserVO1 = new ITagSimpleUserVO1();
					iTagSimpleUserVO1.setUserId(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TaskWorkFlow["+ j +"].Users["+ k +"].UserId"));
					iTagSimpleUserVO1.setUserName(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TaskWorkFlow["+ j +"].Users["+ k +"].UserName"));
					iTagSimpleUserVO1.setAccountType(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TaskWorkFlow["+ j +"].Users["+ k +"].AccountType"));
					iTagSimpleUserVO1.setAccountNo(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TaskWorkFlow["+ j +"].Users["+ k +"].AccountNo"));

					users.add(iTagSimpleUserVO1);
				}
				iTagTaskWorkflowConfig.setUsers(users);

				List<ITagSimpleUserGroupVO> groups = new ArrayList<ITagSimpleUserGroupVO>();
				for (int k = 0; k < _ctx.lengthValue("PageViewTaskResponse.Result.List["+ i +"].TaskWorkFlow["+ j +"].Groups.Length"); k++) {
					ITagSimpleUserGroupVO iTagSimpleUserGroupVO = new ITagSimpleUserGroupVO();
					iTagSimpleUserGroupVO.setGroupId(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TaskWorkFlow["+ j +"].Groups["+ k +"].GroupId"));
					iTagSimpleUserGroupVO.setGroupName(_ctx.stringValue("PageViewTaskResponse.Result.List["+ i +"].TaskWorkFlow["+ j +"].Groups["+ k +"].GroupName"));

					groups.add(iTagSimpleUserGroupVO);
				}
				iTagTaskWorkflowConfig.setGroups(groups);

				taskWorkFlow.add(iTagTaskWorkflowConfig);
			}
			iTagTaskDTO.setTaskWorkFlow(taskWorkFlow);

			list.add(iTagTaskDTO);
		}
		result.setList(list);
		pageViewTaskResponse.setResult(result);
	 
	 	return pageViewTaskResponse;
	}
}