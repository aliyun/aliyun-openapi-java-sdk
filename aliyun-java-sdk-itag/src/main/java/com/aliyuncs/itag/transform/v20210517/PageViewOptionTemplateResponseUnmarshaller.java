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

import com.aliyuncs.itag.model.v20210517.PageViewOptionTemplateResponse;
import com.aliyuncs.itag.model.v20210517.PageViewOptionTemplateResponse.Result;
import com.aliyuncs.itag.model.v20210517.PageViewOptionTemplateResponse.Result.ListItem;
import com.aliyuncs.itag.model.v20210517.PageViewOptionTemplateResponse.Result.ListItem.Creator;
import com.aliyuncs.itag.model.v20210517.PageViewOptionTemplateResponse.Result.ListItem.Modifier;
import com.aliyuncs.itag.model.v20210517.PageViewOptionTemplateResponse.Result.ListItem.QuestionConfigDTO;
import com.aliyuncs.itag.model.v20210517.PageViewOptionTemplateResponse.Result.ListItem.QuestionConfigDTO.QuestionOption;
import com.aliyuncs.itag.model.v20210517.PageViewOptionTemplateResponse.Result.ListItem.QuestionConfigDTO.TemplateRobotConfig;
import com.aliyuncs.itag.model.v20210517.PageViewOptionTemplateResponse.Result.ListItem.QuestionConfigDTO.TemplateRobotConfig.RobotParam;
import com.aliyuncs.itag.model.v20210517.PageViewOptionTemplateResponse.Result.ListItem.RobotConfig;
import com.aliyuncs.itag.model.v20210517.PageViewOptionTemplateResponse.Result.ListItem.RobotConfig.EffectStep;
import com.aliyuncs.itag.model.v20210517.PageViewOptionTemplateResponse.Result.ListItem.RobotConfig.EffectStep.ProcessConfig;
import com.aliyuncs.itag.model.v20210517.PageViewOptionTemplateResponse.Result.ListItem.RobotConfig.ModelServiceConfig;
import com.aliyuncs.itag.model.v20210517.PageViewOptionTemplateResponse.Result.ListItem.RobotConfig.ModelServiceConfig.ModelServiceConfig$PostParamPair;
import com.aliyuncs.itag.model.v20210517.PageViewOptionTemplateResponse.Result.ListItem.RobotConfig.ModelServiceConfig.ModelServiceConfig$ResultMappingPair;
import com.aliyuncs.itag.model.v20210517.PageViewOptionTemplateResponse.Result.ListItem.ViewConfigs;
import com.aliyuncs.itag.model.v20210517.PageViewOptionTemplateResponse.Result.ListItem.ViewConfigs.DisplayFieldDTO;
import com.aliyuncs.itag.model.v20210517.PageViewOptionTemplateResponse.Result.ListItem.ViewConfigs.DisplayFieldDTO.VisitInfo;
import com.aliyuncs.itag.model.v20210517.PageViewOptionTemplateResponse.Result.ListItem.ViewConfigs.DisplayFieldDTO.VisitInfo.AftsConf;
import com.aliyuncs.itag.model.v20210517.PageViewOptionTemplateResponse.Result.ListItem.ViewConfigs.DisplayFieldDTO.VisitInfo.OssConf;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageViewOptionTemplateResponseUnmarshaller {

	public static PageViewOptionTemplateResponse unmarshall(PageViewOptionTemplateResponse pageViewOptionTemplateResponse, UnmarshallerContext _ctx) {
		
		pageViewOptionTemplateResponse.setRequestId(_ctx.stringValue("PageViewOptionTemplateResponse.RequestId"));
		pageViewOptionTemplateResponse.setCode(_ctx.integerValue("PageViewOptionTemplateResponse.Code"));
		pageViewOptionTemplateResponse.setMsg(_ctx.stringValue("PageViewOptionTemplateResponse.Msg"));
		pageViewOptionTemplateResponse.setErrInfo(_ctx.stringValue("PageViewOptionTemplateResponse.ErrInfo"));
		pageViewOptionTemplateResponse.setSucc(_ctx.booleanValue("PageViewOptionTemplateResponse.Succ"));
		pageViewOptionTemplateResponse.setErrorCode(_ctx.stringValue("PageViewOptionTemplateResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.integerValue("PageViewOptionTemplateResponse.Result.PageNum"));
		result.setPageSize(_ctx.integerValue("PageViewOptionTemplateResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("PageViewOptionTemplateResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("PageViewOptionTemplateResponse.Result.TotalPage"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("PageViewOptionTemplateResponse.Result.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setId(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].Id"));
			listItem.setName(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].Name"));
			listItem.setTntInstId(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].TntInstId"));
			listItem.setDescription(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].Description"));
			listItem.setExif(_ctx.mapValue("PageViewOptionTemplateResponse.Result.List["+ i +"].Exif"));
			listItem.setStatus(_ctx.integerValue("PageViewOptionTemplateResponse.Result.List["+ i +"].Status"));
			listItem.setSharedMode(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].SharedMode"));
			listItem.setType(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].Type"));
			listItem.setClassify(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].Classify"));
			listItem.setGmtCreate(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].GmtCreate"));
			listItem.setGmtModified(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].GmtModified"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("PageViewOptionTemplateResponse.Result.List["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].Tags["+ j +"]"));
			}
			listItem.setTags(tags);

			List<String> abandonReasons = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("PageViewOptionTemplateResponse.Result.List["+ i +"].AbandonReasons.Length"); j++) {
				abandonReasons.add(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].AbandonReasons["+ j +"]"));
			}
			listItem.setAbandonReasons(abandonReasons);

			ViewConfigs viewConfigs = new ViewConfigs();

			List<DisplayFieldDTO> fields = new ArrayList<DisplayFieldDTO>();
			for (int j = 0; j < _ctx.lengthValue("PageViewOptionTemplateResponse.Result.List["+ i +"].ViewConfigs.Fields.Length"); j++) {
				DisplayFieldDTO displayFieldDTO = new DisplayFieldDTO();
				displayFieldDTO.setFieldName(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].ViewConfigs.Fields["+ j +"].FieldName"));
				displayFieldDTO.setType(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].ViewConfigs.Fields["+ j +"].Type"));
				displayFieldDTO.setCorsProxy(_ctx.booleanValue("PageViewOptionTemplateResponse.Result.List["+ i +"].ViewConfigs.Fields["+ j +"].CorsProxy"));
				displayFieldDTO.setHide(_ctx.booleanValue("PageViewOptionTemplateResponse.Result.List["+ i +"].ViewConfigs.Fields["+ j +"].Hide"));
				displayFieldDTO.setConvertor(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].ViewConfigs.Fields["+ j +"].Convertor"));
				displayFieldDTO.setPlugins(_ctx.mapValue("PageViewOptionTemplateResponse.Result.List["+ i +"].ViewConfigs.Fields["+ j +"].Plugins"));
				displayFieldDTO.setFieldNames(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].ViewConfigs.Fields["+ j +"].FieldNames"));

				List<String> relationQuestionIds = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("PageViewOptionTemplateResponse.Result.List["+ i +"].ViewConfigs.Fields["+ j +"].RelationQuestionIds.Length"); k++) {
					relationQuestionIds.add(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].ViewConfigs.Fields["+ j +"].RelationQuestionIds["+ k +"]"));
				}
				displayFieldDTO.setRelationQuestionIds(relationQuestionIds);

				VisitInfo visitInfo = new VisitInfo();

				OssConf ossConf = new OssConf();
				ossConf.setOssEndpoint(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].ViewConfigs.Fields["+ j +"].VisitInfo.OssConf.OssEndpoint"));
				ossConf.setOssAk(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].ViewConfigs.Fields["+ j +"].VisitInfo.OssConf.OssAk"));
				ossConf.setOssAs(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].ViewConfigs.Fields["+ j +"].VisitInfo.OssConf.OssAs"));
				ossConf.setOssOwner(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].ViewConfigs.Fields["+ j +"].VisitInfo.OssConf.OssOwner"));
				ossConf.setOssBucket(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].ViewConfigs.Fields["+ j +"].VisitInfo.OssConf.OssBucket"));
				ossConf.setFolder(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].ViewConfigs.Fields["+ j +"].VisitInfo.OssConf.Folder"));
				ossConf.setExpiredTime(_ctx.longValue("PageViewOptionTemplateResponse.Result.List["+ i +"].ViewConfigs.Fields["+ j +"].VisitInfo.OssConf.ExpiredTime"));
				visitInfo.setOssConf(ossConf);

				AftsConf aftsConf = new AftsConf();
				aftsConf.setExpiredTime(_ctx.integerValue("PageViewOptionTemplateResponse.Result.List["+ i +"].ViewConfigs.Fields["+ j +"].VisitInfo.AftsConf.ExpiredTime"));
				visitInfo.setAftsConf(aftsConf);
				displayFieldDTO.setVisitInfo(visitInfo);

				fields.add(displayFieldDTO);
			}
			viewConfigs.setFields(fields);
			listItem.setViewConfigs(viewConfigs);

			Creator creator = new Creator();
			creator.setUserId(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].Creator.UserId"));
			creator.setUserName(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].Creator.UserName"));
			creator.setAccountType(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].Creator.AccountType"));
			creator.setAccountNo(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].Creator.AccountNo"));
			listItem.setCreator(creator);

			Modifier modifier = new Modifier();
			modifier.setUserId(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].Modifier.UserId"));
			modifier.setUserName(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].Modifier.UserName"));
			modifier.setAccountType(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].Modifier.AccountType"));
			modifier.setAccountNo(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].Modifier.AccountNo"));
			listItem.setModifier(modifier);

			RobotConfig robotConfig = new RobotConfig();
			robotConfig.setSource(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].RobotConfig.Source"));

			EffectStep effectStep = new EffectStep();
			effectStep.setPreProcess(_ctx.booleanValue("PageViewOptionTemplateResponse.Result.List["+ i +"].RobotConfig.EffectStep.PreProcess"));
			effectStep.setPreLabel(_ctx.booleanValue("PageViewOptionTemplateResponse.Result.List["+ i +"].RobotConfig.EffectStep.PreLabel"));
			effectStep.setLabel(_ctx.booleanValue("PageViewOptionTemplateResponse.Result.List["+ i +"].RobotConfig.EffectStep.Label"));

			ProcessConfig processConfig = new ProcessConfig();

			List<String> relateColumn = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("PageViewOptionTemplateResponse.Result.List["+ i +"].RobotConfig.EffectStep.ProcessConfig.RelateColumn.Length"); j++) {
				relateColumn.add(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].RobotConfig.EffectStep.ProcessConfig.RelateColumn["+ j +"]"));
			}
			processConfig.setRelateColumn(relateColumn);
			effectStep.setProcessConfig(processConfig);
			robotConfig.setEffectStep(effectStep);

			List<ModelServiceConfig> modelServiceConfigs = new ArrayList<ModelServiceConfig>();
			for (int j = 0; j < _ctx.lengthValue("PageViewOptionTemplateResponse.Result.List["+ i +"].RobotConfig.ModelServiceConfigs.Length"); j++) {
				ModelServiceConfig modelServiceConfig = new ModelServiceConfig();
				modelServiceConfig.setServiceId(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].RobotConfig.ModelServiceConfigs["+ j +"].ServiceId"));
				modelServiceConfig.setServiceName(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].RobotConfig.ModelServiceConfigs["+ j +"].ServiceName"));

				List<ModelServiceConfig$PostParamPair> postParams = new ArrayList<ModelServiceConfig$PostParamPair>();
				for (int k = 0; k < _ctx.lengthValue("PageViewOptionTemplateResponse.Result.List["+ i +"].RobotConfig.ModelServiceConfigs["+ j +"].PostParams.Length"); k++) {
					ModelServiceConfig$PostParamPair modelServiceConfig$PostParamPair = new ModelServiceConfig$PostParamPair();
					modelServiceConfig$PostParamPair.setKey(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].RobotConfig.ModelServiceConfigs["+ j +"].PostParams["+ k +"].Key"));
					modelServiceConfig$PostParamPair.setValue(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].RobotConfig.ModelServiceConfigs["+ j +"].PostParams["+ k +"].Value"));

					postParams.add(modelServiceConfig$PostParamPair);
				}
				modelServiceConfig.setPostParams(postParams);

				List<ModelServiceConfig$ResultMappingPair> resultMappings = new ArrayList<ModelServiceConfig$ResultMappingPair>();
				for (int k = 0; k < _ctx.lengthValue("PageViewOptionTemplateResponse.Result.List["+ i +"].RobotConfig.ModelServiceConfigs["+ j +"].ResultMappings.Length"); k++) {
					ModelServiceConfig$ResultMappingPair modelServiceConfig$ResultMappingPair = new ModelServiceConfig$ResultMappingPair();
					modelServiceConfig$ResultMappingPair.setQuestionId(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].RobotConfig.ModelServiceConfigs["+ j +"].ResultMappings["+ k +"].QuestionId"));
					modelServiceConfig$ResultMappingPair.setResultKey(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].RobotConfig.ModelServiceConfigs["+ j +"].ResultMappings["+ k +"].ResultKey"));
					modelServiceConfig$ResultMappingPair.setMarkTitle(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].RobotConfig.ModelServiceConfigs["+ j +"].ResultMappings["+ k +"].MarkTitle"));

					resultMappings.add(modelServiceConfig$ResultMappingPair);
				}
				modelServiceConfig.setResultMappings(resultMappings);

				modelServiceConfigs.add(modelServiceConfig);
			}
			robotConfig.setModelServiceConfigs(modelServiceConfigs);
			listItem.setRobotConfig(robotConfig);

			List<QuestionConfigDTO> questionConfigs = new ArrayList<QuestionConfigDTO>();
			for (int j = 0; j < _ctx.lengthValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs.Length"); j++) {
				QuestionConfigDTO questionConfigDTO = new QuestionConfigDTO();
				questionConfigDTO.setId(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].Id"));
				questionConfigDTO.setMarkTitle(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].MarkTitle"));
				questionConfigDTO.setMarkTitleAlias(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].MarkTitleAlias"));
				questionConfigDTO.setType(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].Type"));
				questionConfigDTO.setMustFill(_ctx.booleanValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].MustFill"));
				questionConfigDTO.setDisplay(_ctx.booleanValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].Display"));
				questionConfigDTO.setSelected(_ctx.booleanValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].Selected"));
				questionConfigDTO.setSelectGroup(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].SelectGroup"));
				questionConfigDTO.setDefaultResult(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].DefaultResult"));
				questionConfigDTO.setRule(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].Rule"));
				questionConfigDTO.setExif(_ctx.mapValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].Exif"));

				List<String> children = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].Children.Length"); k++) {
					children.add(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].Children["+ k +"]"));
				}
				questionConfigDTO.setChildren(children);

				List<String> preOptions = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].PreOptions.Length"); k++) {
					preOptions.add(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].PreOptions["+ k +"]"));
				}
				questionConfigDTO.setPreOptions(preOptions);

				List<QuestionOption> options = new ArrayList<QuestionOption>();
				for (int k = 0; k < _ctx.lengthValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].Options.Length"); k++) {
					QuestionOption questionOption = new QuestionOption();
					questionOption.setLabel(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].Options["+ k +"].Label"));
					questionOption.setKey(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].Options["+ k +"].Key"));
					questionOption.setShortcut(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].Options["+ k +"].Shortcut"));
					questionOption.setColor(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].Options["+ k +"].Color"));
					questionOption.setValue(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].Options["+ k +"].Value"));

					List<String> children1 = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].Options["+ k +"].Children.Length"); l++) {
						children1.add(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].Options["+ k +"].Children["+ l +"]"));
					}
					questionOption.setChildren1(children1);

					options.add(questionOption);
				}
				questionConfigDTO.setOptions(options);

				List<TemplateRobotConfig> robotConfigs = new ArrayList<TemplateRobotConfig>();
				for (int k = 0; k < _ctx.lengthValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].RobotConfigs.Length"); k++) {
					TemplateRobotConfig templateRobotConfig = new TemplateRobotConfig();
					templateRobotConfig.setRobotId(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].RobotConfigs["+ k +"].RobotId"));
					templateRobotConfig.setQuestionId(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].RobotConfigs["+ k +"].QuestionId"));
					templateRobotConfig.setStage(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].RobotConfigs["+ k +"].Stage"));
					templateRobotConfig.setType(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].RobotConfigs["+ k +"].Type"));
					templateRobotConfig.setResultPath(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].RobotConfigs["+ k +"].ResultPath"));
					templateRobotConfig.setDefaultResult(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].RobotConfigs["+ k +"].DefaultResult"));

					List<RobotParam> params = new ArrayList<RobotParam>();
					for (int l = 0; l < _ctx.lengthValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].RobotConfigs["+ k +"].Params.Length"); l++) {
						RobotParam robotParam = new RobotParam();
						robotParam.setParamName(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].RobotConfigs["+ k +"].Params["+ l +"].ParamName"));
						robotParam.setDataField(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].RobotConfigs["+ k +"].Params["+ l +"].DataField"));
						robotParam.setDefaultResult(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].RobotConfigs["+ k +"].Params["+ l +"].DefaultResult"));
						robotParam.setServiceId(_ctx.stringValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].RobotConfigs["+ k +"].Params["+ l +"].ServiceId"));
						robotParam.setMustFill(_ctx.booleanValue("PageViewOptionTemplateResponse.Result.List["+ i +"].QuestionConfigs["+ j +"].RobotConfigs["+ k +"].Params["+ l +"].MustFill"));

						params.add(robotParam);
					}
					templateRobotConfig.setParams(params);

					robotConfigs.add(templateRobotConfig);
				}
				questionConfigDTO.setRobotConfigs(robotConfigs);

				questionConfigs.add(questionConfigDTO);
			}
			listItem.setQuestionConfigs(questionConfigs);

			list.add(listItem);
		}
		result.setList(list);
		pageViewOptionTemplateResponse.setResult(result);
	 
	 	return pageViewOptionTemplateResponse;
	}
}