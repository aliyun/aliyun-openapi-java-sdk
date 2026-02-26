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

import com.aliyuncs.itag.model.v20210517.GetOptionTemplateResponse;
import com.aliyuncs.itag.model.v20210517.GetOptionTemplateResponse.Result;
import com.aliyuncs.itag.model.v20210517.GetOptionTemplateResponse.Result.Creator;
import com.aliyuncs.itag.model.v20210517.GetOptionTemplateResponse.Result.Modifier;
import com.aliyuncs.itag.model.v20210517.GetOptionTemplateResponse.Result.QuestionConfigDTO;
import com.aliyuncs.itag.model.v20210517.GetOptionTemplateResponse.Result.QuestionConfigDTO.QuestionOption;
import com.aliyuncs.itag.model.v20210517.GetOptionTemplateResponse.Result.QuestionConfigDTO.TemplateRobotConfig;
import com.aliyuncs.itag.model.v20210517.GetOptionTemplateResponse.Result.QuestionConfigDTO.TemplateRobotConfig.RobotParam;
import com.aliyuncs.itag.model.v20210517.GetOptionTemplateResponse.Result.RobotConfig;
import com.aliyuncs.itag.model.v20210517.GetOptionTemplateResponse.Result.RobotConfig.EffectStep;
import com.aliyuncs.itag.model.v20210517.GetOptionTemplateResponse.Result.RobotConfig.EffectStep.ProcessConfig;
import com.aliyuncs.itag.model.v20210517.GetOptionTemplateResponse.Result.RobotConfig.ModelServiceConfig;
import com.aliyuncs.itag.model.v20210517.GetOptionTemplateResponse.Result.RobotConfig.ModelServiceConfig.ModelServiceConfig$PostParamPair;
import com.aliyuncs.itag.model.v20210517.GetOptionTemplateResponse.Result.RobotConfig.ModelServiceConfig.ModelServiceConfig$ResultMappingPair;
import com.aliyuncs.itag.model.v20210517.GetOptionTemplateResponse.Result.ViewConfigs;
import com.aliyuncs.itag.model.v20210517.GetOptionTemplateResponse.Result.ViewConfigs.DisplayFieldDTO;
import com.aliyuncs.itag.model.v20210517.GetOptionTemplateResponse.Result.ViewConfigs.DisplayFieldDTO.VisitInfo;
import com.aliyuncs.itag.model.v20210517.GetOptionTemplateResponse.Result.ViewConfigs.DisplayFieldDTO.VisitInfo.AftsConf;
import com.aliyuncs.itag.model.v20210517.GetOptionTemplateResponse.Result.ViewConfigs.DisplayFieldDTO.VisitInfo.OssConf;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOptionTemplateResponseUnmarshaller {

	public static GetOptionTemplateResponse unmarshall(GetOptionTemplateResponse getOptionTemplateResponse, UnmarshallerContext _ctx) {
		
		getOptionTemplateResponse.setRequestId(_ctx.stringValue("GetOptionTemplateResponse.RequestId"));
		getOptionTemplateResponse.setCode(_ctx.integerValue("GetOptionTemplateResponse.Code"));
		getOptionTemplateResponse.setMsg(_ctx.stringValue("GetOptionTemplateResponse.Msg"));
		getOptionTemplateResponse.setErrInfo(_ctx.stringValue("GetOptionTemplateResponse.ErrInfo"));
		getOptionTemplateResponse.setSucc(_ctx.booleanValue("GetOptionTemplateResponse.Succ"));
		getOptionTemplateResponse.setErrorCode(_ctx.stringValue("GetOptionTemplateResponse.ErrorCode"));

		Result result = new Result();
		result.setId(_ctx.stringValue("GetOptionTemplateResponse.Result.Id"));
		result.setName(_ctx.stringValue("GetOptionTemplateResponse.Result.Name"));
		result.setTntInstId(_ctx.stringValue("GetOptionTemplateResponse.Result.TntInstId"));
		result.setDescription(_ctx.stringValue("GetOptionTemplateResponse.Result.Description"));
		result.setExif(_ctx.mapValue("GetOptionTemplateResponse.Result.Exif"));
		result.setStatus(_ctx.integerValue("GetOptionTemplateResponse.Result.Status"));
		result.setSharedMode(_ctx.stringValue("GetOptionTemplateResponse.Result.SharedMode"));
		result.setType(_ctx.stringValue("GetOptionTemplateResponse.Result.Type"));
		result.setClassify(_ctx.stringValue("GetOptionTemplateResponse.Result.Classify"));
		result.setGmtCreate(_ctx.stringValue("GetOptionTemplateResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("GetOptionTemplateResponse.Result.GmtModified"));

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOptionTemplateResponse.Result.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("GetOptionTemplateResponse.Result.Tags["+ i +"]"));
		}
		result.setTags(tags);

		List<String> abandonReasons = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOptionTemplateResponse.Result.AbandonReasons.Length"); i++) {
			abandonReasons.add(_ctx.stringValue("GetOptionTemplateResponse.Result.AbandonReasons["+ i +"]"));
		}
		result.setAbandonReasons(abandonReasons);

		ViewConfigs viewConfigs = new ViewConfigs();

		List<DisplayFieldDTO> fields = new ArrayList<DisplayFieldDTO>();
		for (int i = 0; i < _ctx.lengthValue("GetOptionTemplateResponse.Result.ViewConfigs.Fields.Length"); i++) {
			DisplayFieldDTO displayFieldDTO = new DisplayFieldDTO();
			displayFieldDTO.setFieldName(_ctx.stringValue("GetOptionTemplateResponse.Result.ViewConfigs.Fields["+ i +"].FieldName"));
			displayFieldDTO.setType(_ctx.stringValue("GetOptionTemplateResponse.Result.ViewConfigs.Fields["+ i +"].Type"));
			displayFieldDTO.setCorsProxy(_ctx.booleanValue("GetOptionTemplateResponse.Result.ViewConfigs.Fields["+ i +"].CorsProxy"));
			displayFieldDTO.setHide(_ctx.booleanValue("GetOptionTemplateResponse.Result.ViewConfigs.Fields["+ i +"].Hide"));
			displayFieldDTO.setConvertor(_ctx.stringValue("GetOptionTemplateResponse.Result.ViewConfigs.Fields["+ i +"].Convertor"));
			displayFieldDTO.setPlugins(_ctx.mapValue("GetOptionTemplateResponse.Result.ViewConfigs.Fields["+ i +"].Plugins"));
			displayFieldDTO.setFieldNames(_ctx.stringValue("GetOptionTemplateResponse.Result.ViewConfigs.Fields["+ i +"].FieldNames"));

			List<String> relationQuestionIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetOptionTemplateResponse.Result.ViewConfigs.Fields["+ i +"].RelationQuestionIds.Length"); j++) {
				relationQuestionIds.add(_ctx.stringValue("GetOptionTemplateResponse.Result.ViewConfigs.Fields["+ i +"].RelationQuestionIds["+ j +"]"));
			}
			displayFieldDTO.setRelationQuestionIds(relationQuestionIds);

			VisitInfo visitInfo = new VisitInfo();

			OssConf ossConf = new OssConf();
			ossConf.setOssEndpoint(_ctx.stringValue("GetOptionTemplateResponse.Result.ViewConfigs.Fields["+ i +"].VisitInfo.OssConf.OssEndpoint"));
			ossConf.setOssAk(_ctx.stringValue("GetOptionTemplateResponse.Result.ViewConfigs.Fields["+ i +"].VisitInfo.OssConf.OssAk"));
			ossConf.setOssAs(_ctx.stringValue("GetOptionTemplateResponse.Result.ViewConfigs.Fields["+ i +"].VisitInfo.OssConf.OssAs"));
			ossConf.setOssOwner(_ctx.stringValue("GetOptionTemplateResponse.Result.ViewConfigs.Fields["+ i +"].VisitInfo.OssConf.OssOwner"));
			ossConf.setOssBucket(_ctx.stringValue("GetOptionTemplateResponse.Result.ViewConfigs.Fields["+ i +"].VisitInfo.OssConf.OssBucket"));
			ossConf.setFolder(_ctx.stringValue("GetOptionTemplateResponse.Result.ViewConfigs.Fields["+ i +"].VisitInfo.OssConf.Folder"));
			ossConf.setExpiredTime(_ctx.longValue("GetOptionTemplateResponse.Result.ViewConfigs.Fields["+ i +"].VisitInfo.OssConf.ExpiredTime"));
			visitInfo.setOssConf(ossConf);

			AftsConf aftsConf = new AftsConf();
			aftsConf.setExpiredTime(_ctx.integerValue("GetOptionTemplateResponse.Result.ViewConfigs.Fields["+ i +"].VisitInfo.AftsConf.ExpiredTime"));
			visitInfo.setAftsConf(aftsConf);
			displayFieldDTO.setVisitInfo(visitInfo);

			fields.add(displayFieldDTO);
		}
		viewConfigs.setFields(fields);
		result.setViewConfigs(viewConfigs);

		Creator creator = new Creator();
		creator.setUserId(_ctx.stringValue("GetOptionTemplateResponse.Result.Creator.UserId"));
		creator.setUserName(_ctx.stringValue("GetOptionTemplateResponse.Result.Creator.UserName"));
		creator.setAccountType(_ctx.stringValue("GetOptionTemplateResponse.Result.Creator.AccountType"));
		creator.setAccountNo(_ctx.stringValue("GetOptionTemplateResponse.Result.Creator.AccountNo"));
		result.setCreator(creator);

		Modifier modifier = new Modifier();
		modifier.setUserId(_ctx.stringValue("GetOptionTemplateResponse.Result.Modifier.UserId"));
		modifier.setUserName(_ctx.stringValue("GetOptionTemplateResponse.Result.Modifier.UserName"));
		modifier.setAccountType(_ctx.stringValue("GetOptionTemplateResponse.Result.Modifier.AccountType"));
		modifier.setAccountNo(_ctx.stringValue("GetOptionTemplateResponse.Result.Modifier.AccountNo"));
		result.setModifier(modifier);

		RobotConfig robotConfig = new RobotConfig();
		robotConfig.setSource(_ctx.stringValue("GetOptionTemplateResponse.Result.RobotConfig.Source"));

		EffectStep effectStep = new EffectStep();
		effectStep.setPreProcess(_ctx.booleanValue("GetOptionTemplateResponse.Result.RobotConfig.EffectStep.PreProcess"));
		effectStep.setPreLabel(_ctx.booleanValue("GetOptionTemplateResponse.Result.RobotConfig.EffectStep.PreLabel"));
		effectStep.setLabel(_ctx.booleanValue("GetOptionTemplateResponse.Result.RobotConfig.EffectStep.Label"));

		ProcessConfig processConfig = new ProcessConfig();

		List<String> relateColumn = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOptionTemplateResponse.Result.RobotConfig.EffectStep.ProcessConfig.RelateColumn.Length"); i++) {
			relateColumn.add(_ctx.stringValue("GetOptionTemplateResponse.Result.RobotConfig.EffectStep.ProcessConfig.RelateColumn["+ i +"]"));
		}
		processConfig.setRelateColumn(relateColumn);
		effectStep.setProcessConfig(processConfig);
		robotConfig.setEffectStep(effectStep);

		List<ModelServiceConfig> modelServiceConfigs = new ArrayList<ModelServiceConfig>();
		for (int i = 0; i < _ctx.lengthValue("GetOptionTemplateResponse.Result.RobotConfig.ModelServiceConfigs.Length"); i++) {
			ModelServiceConfig modelServiceConfig = new ModelServiceConfig();
			modelServiceConfig.setServiceId(_ctx.stringValue("GetOptionTemplateResponse.Result.RobotConfig.ModelServiceConfigs["+ i +"].ServiceId"));
			modelServiceConfig.setServiceName(_ctx.stringValue("GetOptionTemplateResponse.Result.RobotConfig.ModelServiceConfigs["+ i +"].ServiceName"));

			List<ModelServiceConfig$PostParamPair> postParams = new ArrayList<ModelServiceConfig$PostParamPair>();
			for (int j = 0; j < _ctx.lengthValue("GetOptionTemplateResponse.Result.RobotConfig.ModelServiceConfigs["+ i +"].PostParams.Length"); j++) {
				ModelServiceConfig$PostParamPair modelServiceConfig$PostParamPair = new ModelServiceConfig$PostParamPair();
				modelServiceConfig$PostParamPair.setKey(_ctx.stringValue("GetOptionTemplateResponse.Result.RobotConfig.ModelServiceConfigs["+ i +"].PostParams["+ j +"].Key"));
				modelServiceConfig$PostParamPair.setValue(_ctx.stringValue("GetOptionTemplateResponse.Result.RobotConfig.ModelServiceConfigs["+ i +"].PostParams["+ j +"].Value"));

				postParams.add(modelServiceConfig$PostParamPair);
			}
			modelServiceConfig.setPostParams(postParams);

			List<ModelServiceConfig$ResultMappingPair> resultMappings = new ArrayList<ModelServiceConfig$ResultMappingPair>();
			for (int j = 0; j < _ctx.lengthValue("GetOptionTemplateResponse.Result.RobotConfig.ModelServiceConfigs["+ i +"].ResultMappings.Length"); j++) {
				ModelServiceConfig$ResultMappingPair modelServiceConfig$ResultMappingPair = new ModelServiceConfig$ResultMappingPair();
				modelServiceConfig$ResultMappingPair.setQuestionId(_ctx.stringValue("GetOptionTemplateResponse.Result.RobotConfig.ModelServiceConfigs["+ i +"].ResultMappings["+ j +"].QuestionId"));
				modelServiceConfig$ResultMappingPair.setResultKey(_ctx.stringValue("GetOptionTemplateResponse.Result.RobotConfig.ModelServiceConfigs["+ i +"].ResultMappings["+ j +"].ResultKey"));
				modelServiceConfig$ResultMappingPair.setMarkTitle(_ctx.stringValue("GetOptionTemplateResponse.Result.RobotConfig.ModelServiceConfigs["+ i +"].ResultMappings["+ j +"].MarkTitle"));

				resultMappings.add(modelServiceConfig$ResultMappingPair);
			}
			modelServiceConfig.setResultMappings(resultMappings);

			modelServiceConfigs.add(modelServiceConfig);
		}
		robotConfig.setModelServiceConfigs(modelServiceConfigs);
		result.setRobotConfig(robotConfig);

		List<QuestionConfigDTO> questionConfigs = new ArrayList<QuestionConfigDTO>();
		for (int i = 0; i < _ctx.lengthValue("GetOptionTemplateResponse.Result.QuestionConfigs.Length"); i++) {
			QuestionConfigDTO questionConfigDTO = new QuestionConfigDTO();
			questionConfigDTO.setId(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].Id"));
			questionConfigDTO.setMarkTitle(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].MarkTitle"));
			questionConfigDTO.setMarkTitleAlias(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].MarkTitleAlias"));
			questionConfigDTO.setType(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].Type"));
			questionConfigDTO.setMustFill(_ctx.booleanValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].MustFill"));
			questionConfigDTO.setDisplay(_ctx.booleanValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].Display"));
			questionConfigDTO.setSelected(_ctx.booleanValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].Selected"));
			questionConfigDTO.setSelectGroup(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].SelectGroup"));
			questionConfigDTO.setDefaultResult(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].DefaultResult"));
			questionConfigDTO.setRule(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].Rule"));
			questionConfigDTO.setExif(_ctx.mapValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].Exif"));

			List<String> children = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].Children.Length"); j++) {
				children.add(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].Children["+ j +"]"));
			}
			questionConfigDTO.setChildren(children);

			List<String> preOptions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].PreOptions.Length"); j++) {
				preOptions.add(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].PreOptions["+ j +"]"));
			}
			questionConfigDTO.setPreOptions(preOptions);

			List<QuestionOption> options = new ArrayList<QuestionOption>();
			for (int j = 0; j < _ctx.lengthValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].Options.Length"); j++) {
				QuestionOption questionOption = new QuestionOption();
				questionOption.setLabel(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].Options["+ j +"].Label"));
				questionOption.setKey(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].Options["+ j +"].Key"));
				questionOption.setShortcut(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].Options["+ j +"].Shortcut"));
				questionOption.setColor(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].Options["+ j +"].Color"));
				questionOption.setValue(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].Options["+ j +"].Value"));

				List<String> children1 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].Options["+ j +"].Children.Length"); k++) {
					children1.add(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].Options["+ j +"].Children["+ k +"]"));
				}
				questionOption.setChildren1(children1);

				options.add(questionOption);
			}
			questionConfigDTO.setOptions(options);

			List<TemplateRobotConfig> robotConfigs = new ArrayList<TemplateRobotConfig>();
			for (int j = 0; j < _ctx.lengthValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].RobotConfigs.Length"); j++) {
				TemplateRobotConfig templateRobotConfig = new TemplateRobotConfig();
				templateRobotConfig.setRobotId(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].RobotId"));
				templateRobotConfig.setQuestionId(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].QuestionId"));
				templateRobotConfig.setStage(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Stage"));
				templateRobotConfig.setType(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Type"));
				templateRobotConfig.setResultPath(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].ResultPath"));
				templateRobotConfig.setDefaultResult(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].DefaultResult"));

				List<RobotParam> params = new ArrayList<RobotParam>();
				for (int k = 0; k < _ctx.lengthValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params.Length"); k++) {
					RobotParam robotParam = new RobotParam();
					robotParam.setParamName(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params["+ k +"].ParamName"));
					robotParam.setDataField(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params["+ k +"].DataField"));
					robotParam.setDefaultResult(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params["+ k +"].DefaultResult"));
					robotParam.setServiceId(_ctx.stringValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params["+ k +"].ServiceId"));
					robotParam.setMustFill(_ctx.booleanValue("GetOptionTemplateResponse.Result.QuestionConfigs["+ i +"].RobotConfigs["+ j +"].Params["+ k +"].MustFill"));

					params.add(robotParam);
				}
				templateRobotConfig.setParams(params);

				robotConfigs.add(templateRobotConfig);
			}
			questionConfigDTO.setRobotConfigs(robotConfigs);

			questionConfigs.add(questionConfigDTO);
		}
		result.setQuestionConfigs(questionConfigs);
		getOptionTemplateResponse.setResult(result);
	 
	 	return getOptionTemplateResponse;
	}
}