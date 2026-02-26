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

import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.ITagSimpleUserMarkItemDTO;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.ITagSimpleUserMarkItemDTO.ITagSimpleUserMarkResultDTO;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.Creator;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.Modifier;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigDTO;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigDTO.QuestionOption;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigDTO.TemplateRobotConfig;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigDTO.TemplateRobotConfig.RobotParam;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.RobotConfig;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.RobotConfig.EffectStep;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.RobotConfig.EffectStep.ProcessConfig;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.RobotConfig.ModelServiceConfig;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.RobotConfig.ModelServiceConfig.ModelServiceConfig$PostParamPair;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.RobotConfig.ModelServiceConfig.ModelServiceConfig$ResultMappingPair;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.ViewConfigs;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.ViewConfigs.DisplayFieldDTO;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.ViewConfigs.DisplayFieldDTO.VisitInfo;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.ViewConfigs.DisplayFieldDTO.VisitInfo.AftsConf;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.ViewConfigs.DisplayFieldDTO.VisitInfo.OssConf;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubTask;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubTask.Handler;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubUserTask;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubUserTask.Handler1;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.TaskInfo;
import com.aliyuncs.itag.model.v20210517.QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.TaskInfo.BizInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySampleMarkItemsResponseUnmarshaller {

	public static QuerySampleMarkItemsResponse unmarshall(QuerySampleMarkItemsResponse querySampleMarkItemsResponse, UnmarshallerContext _ctx) {
		
		querySampleMarkItemsResponse.setRequestId(_ctx.stringValue("QuerySampleMarkItemsResponse.RequestId"));
		querySampleMarkItemsResponse.setCode(_ctx.stringValue("QuerySampleMarkItemsResponse.Code"));
		querySampleMarkItemsResponse.setErrInfo(_ctx.stringValue("QuerySampleMarkItemsResponse.ErrInfo"));
		querySampleMarkItemsResponse.setMsg(_ctx.stringValue("QuerySampleMarkItemsResponse.Msg"));
		querySampleMarkItemsResponse.setSucc(_ctx.booleanValue("QuerySampleMarkItemsResponse.Succ"));
		querySampleMarkItemsResponse.setErrorCode(_ctx.stringValue("QuerySampleMarkItemsResponse.ErrorCode"));

		Result result = new Result();

		ITagSamplingStatsDTO iTagSamplingStatsDTO = new ITagSamplingStatsDTO();
		iTagSamplingStatsDTO.setHasNonCompleteTask(_ctx.integerValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.HasNonCompleteTask"));
		iTagSamplingStatsDTO.setSampleRecordId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.SampleRecordId"));
		iTagSamplingStatsDTO.setNeedPolling(_ctx.booleanValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.NeedPolling"));
		iTagSamplingStatsDTO.setTotalMarkItemCount(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.TotalMarkItemCount"));

		ITagMarkableWorkTaskDTO iTagMarkableWorkTaskDTO = new ITagMarkableWorkTaskDTO();

		TaskInfo taskInfo = new TaskInfo();
		taskInfo.setTaskName(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.TaskInfo.TaskName"));
		taskInfo.setTaskId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.TaskInfo.TaskId"));
		taskInfo.setTaskType(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.TaskInfo.TaskType"));
		taskInfo.setChannel(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.TaskInfo.Channel"));
		taskInfo.setSafetyLevel(_ctx.integerValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.TaskInfo.SafetyLevel"));

		BizInfo bizInfo = new BizInfo();
		bizInfo.setBizCode(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.TaskInfo.BizInfo.BizCode"));
		bizInfo.setBizNo(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.TaskInfo.BizInfo.BizNo"));
		bizInfo.setBizClassify(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.TaskInfo.BizInfo.BizClassify"));
		taskInfo.setBizInfo(bizInfo);
		iTagMarkableWorkTaskDTO.setTaskInfo(taskInfo);

		SubTask subTask = new SubTask();
		subTask.setSubTaskId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubTask.SubTaskId"));
		subTask.setTaskId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubTask.TaskId"));

		Handler handler = new Handler();
		handler.setUserId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubTask.Handler.UserId"));
		handler.setUserName(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubTask.Handler.UserName"));
		handler.setAccountType(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubTask.Handler.AccountType"));
		handler.setAccountNo(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubTask.Handler.AccountNo"));
		subTask.setHandler(handler);
		iTagMarkableWorkTaskDTO.setSubTask(subTask);

		SubUserTask subUserTask = new SubUserTask();
		subUserTask.setUserSubTaskId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubUserTask.UserSubTaskId"));
		subUserTask.setSubTaskId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubUserTask.SubTaskId"));
		subUserTask.setWorkNode(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubUserTask.WorkNode"));
		subUserTask.setState(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubUserTask.State"));
		subUserTask.setVoteIdx(_ctx.integerValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubUserTask.VoteIdx"));
		subUserTask.setLastUserSubTaskId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubUserTask.LastUserSubTaskId"));
		subUserTask.setOperateFlag(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubUserTask.OperateFlag"));
		subUserTask.setRejectFlag(_ctx.integerValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubUserTask.RejectFlag"));
		subUserTask.setRejectRemark(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubUserTask.RejectRemark"));
		subUserTask.setGmtTimeout(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubUserTask.GmtTimeout"));
		subUserTask.setExternalBizNo(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubUserTask.ExternalBizNo"));

		Handler1 handler1 = new Handler1();
		handler1.setUserId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubUserTask.Handler.UserId"));
		handler1.setUserName(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubUserTask.Handler.UserName"));
		handler1.setAccountType(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubUserTask.Handler.AccountType"));
		handler1.setAccountNo(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.SubUserTask.Handler.AccountNo"));
		subUserTask.setHandler1(handler1);
		iTagMarkableWorkTaskDTO.setSubUserTask(subUserTask);

		OptionTemplate optionTemplate = new OptionTemplate();
		optionTemplate.setId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.Id"));
		optionTemplate.setName(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.Name"));
		optionTemplate.setTntInstId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.TntInstId"));
		optionTemplate.setDescription(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.Description"));
		optionTemplate.setExif(_ctx.mapValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.Exif"));
		optionTemplate.setStatus(_ctx.integerValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.Status"));
		optionTemplate.setSharedMode(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.SharedMode"));
		optionTemplate.setType(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.Type"));
		optionTemplate.setClassify(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.Classify"));
		optionTemplate.setGmtCreate(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.GmtCreate"));
		optionTemplate.setGmtModified(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.GmtModified"));

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.Tags["+ i +"]"));
		}
		optionTemplate.setTags(tags);

		List<String> abandonReasons = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.AbandonReasons.Length"); i++) {
			abandonReasons.add(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.AbandonReasons["+ i +"]"));
		}
		optionTemplate.setAbandonReasons(abandonReasons);

		ViewConfigs viewConfigs = new ViewConfigs();

		List<DisplayFieldDTO> fields = new ArrayList<DisplayFieldDTO>();
		for (int i = 0; i < _ctx.lengthValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.ViewConfigs.Fields.Length"); i++) {
			DisplayFieldDTO displayFieldDTO = new DisplayFieldDTO();
			displayFieldDTO.setFieldName(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.ViewConfigs.Fields["+ i +"].FieldName"));
			displayFieldDTO.setType(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.ViewConfigs.Fields["+ i +"].Type"));
			displayFieldDTO.setCorsProxy(_ctx.booleanValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.ViewConfigs.Fields["+ i +"].CorsProxy"));
			displayFieldDTO.setHide(_ctx.booleanValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.ViewConfigs.Fields["+ i +"].Hide"));
			displayFieldDTO.setConvertor(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.ViewConfigs.Fields["+ i +"].Convertor"));
			displayFieldDTO.setPlugins(_ctx.mapValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.ViewConfigs.Fields["+ i +"].Plugins"));
			displayFieldDTO.setFieldNames(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.ViewConfigs.Fields["+ i +"].FieldNames"));

			List<String> relationQuestionIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.ViewConfigs.Fields["+ i +"].RelationQuestionIds.Length"); j++) {
				relationQuestionIds.add(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.ViewConfigs.Fields["+ i +"].RelationQuestionIds["+ j +"]"));
			}
			displayFieldDTO.setRelationQuestionIds(relationQuestionIds);

			VisitInfo visitInfo = new VisitInfo();

			OssConf ossConf = new OssConf();
			ossConf.setOssEndpoint(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.ViewConfigs.Fields["+ i +"].VisitInfo.OssConf.OssEndpoint"));
			ossConf.setOssAk(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.ViewConfigs.Fields["+ i +"].VisitInfo.OssConf.OssAk"));
			ossConf.setOssAs(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.ViewConfigs.Fields["+ i +"].VisitInfo.OssConf.OssAs"));
			ossConf.setOssOwner(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.ViewConfigs.Fields["+ i +"].VisitInfo.OssConf.OssOwner"));
			ossConf.setOssBucket(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.ViewConfigs.Fields["+ i +"].VisitInfo.OssConf.OssBucket"));
			ossConf.setFolder(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.ViewConfigs.Fields["+ i +"].VisitInfo.OssConf.Folder"));
			ossConf.setExpiredTime(_ctx.longValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.ViewConfigs.Fields["+ i +"].VisitInfo.OssConf.ExpiredTime"));
			visitInfo.setOssConf(ossConf);

			AftsConf aftsConf = new AftsConf();
			aftsConf.setExpiredTime(_ctx.integerValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.ViewConfigs.Fields["+ i +"].VisitInfo.AftsConf.ExpiredTime"));
			visitInfo.setAftsConf(aftsConf);
			displayFieldDTO.setVisitInfo(visitInfo);

			fields.add(displayFieldDTO);
		}
		viewConfigs.setFields(fields);
		optionTemplate.setViewConfigs(viewConfigs);

		Creator creator = new Creator();
		creator.setUserId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.Creator.UserId"));
		creator.setUserName(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.Creator.UserName"));
		creator.setAccountType(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.Creator.AccountType"));
		creator.setAccountNo(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.Creator.AccountNo"));
		optionTemplate.setCreator(creator);

		Modifier modifier = new Modifier();
		modifier.setUserId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.Modifier.UserId"));
		modifier.setUserName(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.Modifier.UserName"));
		modifier.setAccountType(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.Modifier.AccountType"));
		modifier.setAccountNo(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.Modifier.AccountNo"));
		optionTemplate.setModifier(modifier);

		RobotConfig robotConfig = new RobotConfig();
		robotConfig.setSource(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.RobotConfig.Source"));

		EffectStep effectStep = new EffectStep();
		effectStep.setPreProcess(_ctx.booleanValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.RobotConfig.EffectStep.PreProcess"));
		effectStep.setPreLabel(_ctx.booleanValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.RobotConfig.EffectStep.PreLabel"));
		effectStep.setLabel(_ctx.booleanValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.RobotConfig.EffectStep.Label"));

		ProcessConfig processConfig = new ProcessConfig();

		List<String> relateColumn = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.RobotConfig.EffectStep.ProcessConfig.RelateColumn.Length"); i++) {
			relateColumn.add(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.RobotConfig.EffectStep.ProcessConfig.RelateColumn["+ i +"]"));
		}
		processConfig.setRelateColumn(relateColumn);
		effectStep.setProcessConfig(processConfig);
		robotConfig.setEffectStep(effectStep);

		List<ModelServiceConfig> modelServiceConfigs = new ArrayList<ModelServiceConfig>();
		for (int i = 0; i < _ctx.lengthValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.RobotConfig.ModelServiceConfigs.Length"); i++) {
			ModelServiceConfig modelServiceConfig = new ModelServiceConfig();
			modelServiceConfig.setServiceId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.RobotConfig.ModelServiceConfigs["+ i +"].ServiceId"));
			modelServiceConfig.setServiceName(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.RobotConfig.ModelServiceConfigs["+ i +"].ServiceName"));

			List<ModelServiceConfig$PostParamPair> postParams = new ArrayList<ModelServiceConfig$PostParamPair>();
			for (int j = 0; j < _ctx.lengthValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.RobotConfig.ModelServiceConfigs["+ i +"].PostParams.Length"); j++) {
				ModelServiceConfig$PostParamPair modelServiceConfig$PostParamPair = new ModelServiceConfig$PostParamPair();
				modelServiceConfig$PostParamPair.setKey(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.RobotConfig.ModelServiceConfigs["+ i +"].PostParams["+ j +"].Key"));
				modelServiceConfig$PostParamPair.setValue(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.RobotConfig.ModelServiceConfigs["+ i +"].PostParams["+ j +"].Value"));

				postParams.add(modelServiceConfig$PostParamPair);
			}
			modelServiceConfig.setPostParams(postParams);

			List<ModelServiceConfig$ResultMappingPair> resultMappings = new ArrayList<ModelServiceConfig$ResultMappingPair>();
			for (int j = 0; j < _ctx.lengthValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.RobotConfig.ModelServiceConfigs["+ i +"].ResultMappings.Length"); j++) {
				ModelServiceConfig$ResultMappingPair modelServiceConfig$ResultMappingPair = new ModelServiceConfig$ResultMappingPair();
				modelServiceConfig$ResultMappingPair.setQuestionId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.RobotConfig.ModelServiceConfigs["+ i +"].ResultMappings["+ j +"].QuestionId"));
				modelServiceConfig$ResultMappingPair.setResultKey(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.RobotConfig.ModelServiceConfigs["+ i +"].ResultMappings["+ j +"].ResultKey"));
				modelServiceConfig$ResultMappingPair.setMarkTitle(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.RobotConfig.ModelServiceConfigs["+ i +"].ResultMappings["+ j +"].MarkTitle"));

				resultMappings.add(modelServiceConfig$ResultMappingPair);
			}
			modelServiceConfig.setResultMappings(resultMappings);

			modelServiceConfigs.add(modelServiceConfig);
		}
		robotConfig.setModelServiceConfigs(modelServiceConfigs);
		optionTemplate.setRobotConfig(robotConfig);

		List<QuestionConfigDTO> questionConfigs = new ArrayList<QuestionConfigDTO>();
		for (int i = 0; i < _ctx.lengthValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs.Length"); i++) {
			QuestionConfigDTO questionConfigDTO = new QuestionConfigDTO();
			questionConfigDTO.setId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].Id"));
			questionConfigDTO.setMarkTitle(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].MarkTitle"));
			questionConfigDTO.setMarkTitleAlias(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].MarkTitleAlias"));
			questionConfigDTO.setType(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].Type"));
			questionConfigDTO.setMustFill(_ctx.booleanValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].MustFill"));
			questionConfigDTO.setDisplay(_ctx.booleanValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].Display"));
			questionConfigDTO.setSelected(_ctx.booleanValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].Selected"));
			questionConfigDTO.setSelectGroup(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].SelectGroup"));
			questionConfigDTO.setDefaultResult(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].DefaultResult"));
			questionConfigDTO.setRule(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].Rule"));
			questionConfigDTO.setExif(_ctx.mapValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].Exif"));

			List<String> children = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].Children.Length"); j++) {
				children.add(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].Children["+ j +"]"));
			}
			questionConfigDTO.setChildren(children);

			List<String> preOptions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].PreOptions.Length"); j++) {
				preOptions.add(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].PreOptions["+ j +"]"));
			}
			questionConfigDTO.setPreOptions(preOptions);

			List<QuestionOption> options = new ArrayList<QuestionOption>();
			for (int j = 0; j < _ctx.lengthValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].Options.Length"); j++) {
				QuestionOption questionOption = new QuestionOption();
				questionOption.setLabel(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].Options["+ j +"].Label"));
				questionOption.setKey(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].Options["+ j +"].Key"));
				questionOption.setShortcut(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].Options["+ j +"].Shortcut"));
				questionOption.setColor(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].Options["+ j +"].Color"));
				questionOption.setValue(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].Options["+ j +"].Value"));

				List<String> children2 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].Options["+ j +"].Children.Length"); k++) {
					children2.add(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].Options["+ j +"].Children["+ k +"]"));
				}
				questionOption.setChildren2(children2);

				options.add(questionOption);
			}
			questionConfigDTO.setOptions(options);

			List<TemplateRobotConfig> robotConfigs = new ArrayList<TemplateRobotConfig>();
			for (int j = 0; j < _ctx.lengthValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs.Length"); j++) {
				TemplateRobotConfig templateRobotConfig = new TemplateRobotConfig();
				templateRobotConfig.setRobotId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].RobotId"));
				templateRobotConfig.setQuestionId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].QuestionId"));
				templateRobotConfig.setStage(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Stage"));
				templateRobotConfig.setType(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Type"));
				templateRobotConfig.setResultPath(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].ResultPath"));
				templateRobotConfig.setDefaultResult(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].DefaultResult"));

				List<RobotParam> params = new ArrayList<RobotParam>();
				for (int k = 0; k < _ctx.lengthValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params.Length"); k++) {
					RobotParam robotParam = new RobotParam();
					robotParam.setParamName(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params["+ k +"].ParamName"));
					robotParam.setDataField(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params["+ k +"].DataField"));
					robotParam.setDefaultResult(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params["+ k +"].DefaultResult"));
					robotParam.setServiceId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params["+ k +"].ServiceId"));
					robotParam.setMustFill(_ctx.booleanValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.OptionTemplate.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params["+ k +"].MustFill"));

					params.add(robotParam);
				}
				templateRobotConfig.setParams(params);

				robotConfigs.add(templateRobotConfig);
			}
			questionConfigDTO.setRobotConfigs(robotConfigs);

			questionConfigs.add(questionConfigDTO);
		}
		optionTemplate.setQuestionConfigs(questionConfigs);
		iTagMarkableWorkTaskDTO.setOptionTemplate(optionTemplate);

		List<ITagSimpleUserMarkItemDTO> markItemList = new ArrayList<ITagSimpleUserMarkItemDTO>();
		for (int i = 0; i < _ctx.lengthValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList.Length"); i++) {
			ITagSimpleUserMarkItemDTO iTagSimpleUserMarkItemDTO = new ITagSimpleUserMarkItemDTO();
			iTagSimpleUserMarkItemDTO.setUserMarkItemId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].UserMarkItemId"));
			iTagSimpleUserMarkItemDTO.setFeedbackRemark(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].FeedbackRemark"));
			iTagSimpleUserMarkItemDTO.setFeedbackFlag(_ctx.integerValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].FeedbackFlag"));
			iTagSimpleUserMarkItemDTO.setOperator(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].Operator"));
			iTagSimpleUserMarkItemDTO.setMarkItemId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].MarkItemId"));
			iTagSimpleUserMarkItemDTO.setDataId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].DataId"));
			iTagSimpleUserMarkItemDTO.setDatasetId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].DatasetId"));
			iTagSimpleUserMarkItemDTO.setState(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].State"));
			iTagSimpleUserMarkItemDTO.setMine(_ctx.integerValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].Mine"));
			iTagSimpleUserMarkItemDTO.setSubTaskId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].SubTaskId"));
			iTagSimpleUserMarkItemDTO.setRejectFlag(_ctx.integerValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].RejectFlag"));
			iTagSimpleUserMarkItemDTO.setFixedFlag(_ctx.integerValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].FixedFlag"));
			iTagSimpleUserMarkItemDTO.setAbandonFlag(_ctx.integerValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].AbandonFlag"));
			iTagSimpleUserMarkItemDTO.setAbandonRemark(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].AbandonRemark"));
			iTagSimpleUserMarkItemDTO.setWeight(_ctx.integerValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].Weight"));
			iTagSimpleUserMarkItemDTO.setDataMeta(_ctx.mapValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].DataMeta"));

			List<ITagSimpleUserMarkResultDTO> markResultList = new ArrayList<ITagSimpleUserMarkResultDTO>();
			for (int j = 0; j < _ctx.lengthValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].MarkResultList.Length"); j++) {
				ITagSimpleUserMarkResultDTO iTagSimpleUserMarkResultDTO = new ITagSimpleUserMarkResultDTO();
				iTagSimpleUserMarkResultDTO.setMarkResultId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].MarkResultList["+ j +"].MarkResultId"));
				iTagSimpleUserMarkResultDTO.setMarkTitle(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].MarkResultList["+ j +"].MarkTitle"));
				iTagSimpleUserMarkResultDTO.setMarkResult(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].MarkResultList["+ j +"].MarkResult"));
				iTagSimpleUserMarkResultDTO.setQuestionId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].MarkResultList["+ j +"].QuestionId"));
				iTagSimpleUserMarkResultDTO.setResultType(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].MarkResultList["+ j +"].ResultType"));
				iTagSimpleUserMarkResultDTO.setVersion(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].MarkResultList["+ j +"].Version"));
				iTagSimpleUserMarkResultDTO.setUserMarkResultId(_ctx.stringValue("QuerySampleMarkItemsResponse.Result.ITagSamplingStatsDTO.ITagMarkableWorkTaskDTO.MarkItemList["+ i +"].MarkResultList["+ j +"].UserMarkResultId"));

				markResultList.add(iTagSimpleUserMarkResultDTO);
			}
			iTagSimpleUserMarkItemDTO.setMarkResultList(markResultList);

			markItemList.add(iTagSimpleUserMarkItemDTO);
		}
		iTagMarkableWorkTaskDTO.setMarkItemList(markItemList);
		iTagSamplingStatsDTO.setITagMarkableWorkTaskDTO(iTagMarkableWorkTaskDTO);
		result.setITagSamplingStatsDTO(iTagSamplingStatsDTO);
		querySampleMarkItemsResponse.setResult(result);
	 
	 	return querySampleMarkItemsResponse;
	}
}