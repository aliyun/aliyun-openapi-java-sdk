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

package com.aliyuncs.pts.transform.v20201020;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20201020.GetPtsReportDetailsResponse;
import com.aliyuncs.pts.model.v20201020.GetPtsReportDetailsResponse.ApiMetrics;
import com.aliyuncs.pts.model.v20201020.GetPtsReportDetailsResponse.ReportOverView;
import com.aliyuncs.pts.model.v20201020.GetPtsReportDetailsResponse.SceneMetrics;
import com.aliyuncs.pts.model.v20201020.GetPtsReportDetailsResponse.SceneSnapShot;
import com.aliyuncs.pts.model.v20201020.GetPtsReportDetailsResponse.SceneSnapShot.AdvanceSetting;
import com.aliyuncs.pts.model.v20201020.GetPtsReportDetailsResponse.SceneSnapShot.AdvanceSetting.DomainBinding;
import com.aliyuncs.pts.model.v20201020.GetPtsReportDetailsResponse.SceneSnapShot.FileParameter;
import com.aliyuncs.pts.model.v20201020.GetPtsReportDetailsResponse.SceneSnapShot.GlobalParameter;
import com.aliyuncs.pts.model.v20201020.GetPtsReportDetailsResponse.SceneSnapShot.LoadConfig;
import com.aliyuncs.pts.model.v20201020.GetPtsReportDetailsResponse.SceneSnapShot.LoadConfig.ApiLoadConfig;
import com.aliyuncs.pts.model.v20201020.GetPtsReportDetailsResponse.SceneSnapShot.LoadConfig.Configuration;
import com.aliyuncs.pts.model.v20201020.GetPtsReportDetailsResponse.SceneSnapShot.LoadConfig.RelationLoadConfig;
import com.aliyuncs.pts.model.v20201020.GetPtsReportDetailsResponse.SceneSnapShot.Relation;
import com.aliyuncs.pts.model.v20201020.GetPtsReportDetailsResponse.SceneSnapShot.Relation.Api;
import com.aliyuncs.pts.model.v20201020.GetPtsReportDetailsResponse.SceneSnapShot.Relation.Api.Body;
import com.aliyuncs.pts.model.v20201020.GetPtsReportDetailsResponse.SceneSnapShot.Relation.Api.CheckPoint;
import com.aliyuncs.pts.model.v20201020.GetPtsReportDetailsResponse.SceneSnapShot.Relation.Api.Export;
import com.aliyuncs.pts.model.v20201020.GetPtsReportDetailsResponse.SceneSnapShot.Relation.Api.Header;
import com.aliyuncs.pts.model.v20201020.GetPtsReportDetailsResponse.SceneSnapShot.Relation.FileParameterExplain;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPtsReportDetailsResponseUnmarshaller {

	public static GetPtsReportDetailsResponse unmarshall(GetPtsReportDetailsResponse getPtsReportDetailsResponse, UnmarshallerContext _ctx) {
		
		getPtsReportDetailsResponse.setRequestId(_ctx.stringValue("GetPtsReportDetailsResponse.RequestId"));
		getPtsReportDetailsResponse.setMessage(_ctx.stringValue("GetPtsReportDetailsResponse.Message"));
		getPtsReportDetailsResponse.setHttpStatusCode(_ctx.integerValue("GetPtsReportDetailsResponse.HttpStatusCode"));
		getPtsReportDetailsResponse.setCode(_ctx.stringValue("GetPtsReportDetailsResponse.Code"));
		getPtsReportDetailsResponse.setSuccess(_ctx.booleanValue("GetPtsReportDetailsResponse.Success"));

		ReportOverView reportOverView = new ReportOverView();
		reportOverView.setReportName(_ctx.stringValue("GetPtsReportDetailsResponse.ReportOverView.ReportName"));
		reportOverView.setEndTime(_ctx.stringValue("GetPtsReportDetailsResponse.ReportOverView.EndTime"));
		reportOverView.setStartTime(_ctx.stringValue("GetPtsReportDetailsResponse.ReportOverView.StartTime"));
		reportOverView.setAgentCount(_ctx.integerValue("GetPtsReportDetailsResponse.ReportOverView.AgentCount"));
		reportOverView.setReportId(_ctx.stringValue("GetPtsReportDetailsResponse.ReportOverView.ReportId"));
		reportOverView.setVum(_ctx.longValue("GetPtsReportDetailsResponse.ReportOverView.Vum"));
		getPtsReportDetailsResponse.setReportOverView(reportOverView);

		SceneMetrics sceneMetrics = new SceneMetrics();
		sceneMetrics.setFailCountBiz(_ctx.longValue("GetPtsReportDetailsResponse.SceneMetrics.FailCountBiz"));
		sceneMetrics.setAllCount(_ctx.longValue("GetPtsReportDetailsResponse.SceneMetrics.AllCount"));
		sceneMetrics.setSuccessRateBiz(_ctx.floatValue("GetPtsReportDetailsResponse.SceneMetrics.SuccessRateBiz"));
		sceneMetrics.setAvgRt(_ctx.floatValue("GetPtsReportDetailsResponse.SceneMetrics.AvgRt"));
		sceneMetrics.setFailCountReq(_ctx.longValue("GetPtsReportDetailsResponse.SceneMetrics.FailCountReq"));
		sceneMetrics.setAvgTps(_ctx.floatValue("GetPtsReportDetailsResponse.SceneMetrics.AvgTps"));
		sceneMetrics.setSeg99Rt(_ctx.floatValue("GetPtsReportDetailsResponse.SceneMetrics.Seg99Rt"));
		sceneMetrics.setSuccessRateReq(_ctx.floatValue("GetPtsReportDetailsResponse.SceneMetrics.SuccessRateReq"));
		sceneMetrics.setSeg90Rt(_ctx.floatValue("GetPtsReportDetailsResponse.SceneMetrics.Seg90Rt"));
		getPtsReportDetailsResponse.setSceneMetrics(sceneMetrics);

		SceneSnapShot sceneSnapShot = new SceneSnapShot();
		sceneSnapShot.setStatus(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.Status"));
		sceneSnapShot.setModifiedTime(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.ModifiedTime"));
		sceneSnapShot.setCreateTime(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.CreateTime"));
		sceneSnapShot.setSceneName(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.SceneName"));
		sceneSnapShot.setSceneId(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.SceneId"));

		LoadConfig loadConfig = new LoadConfig();
		loadConfig.setMaxRunningTime(_ctx.integerValue("GetPtsReportDetailsResponse.SceneSnapShot.LoadConfig.MaxRunningTime"));
		loadConfig.setAgentCount(_ctx.integerValue("GetPtsReportDetailsResponse.SceneSnapShot.LoadConfig.AgentCount"));
		loadConfig.setTestMode(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.LoadConfig.TestMode"));

		Configuration configuration = new Configuration();
		configuration.setAllRpsBegin(_ctx.integerValue("GetPtsReportDetailsResponse.SceneSnapShot.LoadConfig.Configuration.AllRpsBegin"));
		configuration.setAllConcurrencyBegin(_ctx.integerValue("GetPtsReportDetailsResponse.SceneSnapShot.LoadConfig.Configuration.AllConcurrencyBegin"));
		configuration.setAllConcurrencyLimit(_ctx.integerValue("GetPtsReportDetailsResponse.SceneSnapShot.LoadConfig.Configuration.AllConcurrencyLimit"));
		configuration.setAllRpsLimit(_ctx.integerValue("GetPtsReportDetailsResponse.SceneSnapShot.LoadConfig.Configuration.AllRpsLimit"));
		loadConfig.setConfiguration(configuration);

		List<ApiLoadConfig> apiLoadConfigList = new ArrayList<ApiLoadConfig>();
		for (int i = 0; i < _ctx.lengthValue("GetPtsReportDetailsResponse.SceneSnapShot.LoadConfig.ApiLoadConfigList.Length"); i++) {
			ApiLoadConfig apiLoadConfig = new ApiLoadConfig();
			apiLoadConfig.setRpsBegin(_ctx.integerValue("GetPtsReportDetailsResponse.SceneSnapShot.LoadConfig.ApiLoadConfigList["+ i +"].RpsBegin"));
			apiLoadConfig.setRpsLimit(_ctx.integerValue("GetPtsReportDetailsResponse.SceneSnapShot.LoadConfig.ApiLoadConfigList["+ i +"].RpsLimit"));

			apiLoadConfigList.add(apiLoadConfig);
		}
		loadConfig.setApiLoadConfigList(apiLoadConfigList);

		List<RelationLoadConfig> relationLoadConfigList = new ArrayList<RelationLoadConfig>();
		for (int i = 0; i < _ctx.lengthValue("GetPtsReportDetailsResponse.SceneSnapShot.LoadConfig.RelationLoadConfigList.Length"); i++) {
			RelationLoadConfig relationLoadConfig = new RelationLoadConfig();
			relationLoadConfig.setConcurrencyBegin(_ctx.integerValue("GetPtsReportDetailsResponse.SceneSnapShot.LoadConfig.RelationLoadConfigList["+ i +"].ConcurrencyBegin"));
			relationLoadConfig.setConcurrencyLimit(_ctx.integerValue("GetPtsReportDetailsResponse.SceneSnapShot.LoadConfig.RelationLoadConfigList["+ i +"].ConcurrencyLimit"));

			relationLoadConfigList.add(relationLoadConfig);
		}
		loadConfig.setRelationLoadConfigList(relationLoadConfigList);
		sceneSnapShot.setLoadConfig(loadConfig);

		AdvanceSetting advanceSetting = new AdvanceSetting();
		advanceSetting.setLogRate(_ctx.integerValue("GetPtsReportDetailsResponse.SceneSnapShot.AdvanceSetting.LogRate"));
		advanceSetting.setConnectionTimeoutInSecond(_ctx.integerValue("GetPtsReportDetailsResponse.SceneSnapShot.AdvanceSetting.ConnectionTimeoutInSecond"));
		advanceSetting.setSuccessCode(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.AdvanceSetting.SuccessCode"));

		List<DomainBinding> domainBindingList = new ArrayList<DomainBinding>();
		for (int i = 0; i < _ctx.lengthValue("GetPtsReportDetailsResponse.SceneSnapShot.AdvanceSetting.DomainBindingList.Length"); i++) {
			DomainBinding domainBinding = new DomainBinding();
			domainBinding.setDomain(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.AdvanceSetting.DomainBindingList["+ i +"].Domain"));

			List<String> ips = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetPtsReportDetailsResponse.SceneSnapShot.AdvanceSetting.DomainBindingList["+ i +"].Ips.Length"); j++) {
				ips.add(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.AdvanceSetting.DomainBindingList["+ i +"].Ips["+ j +"]"));
			}
			domainBinding.setIps(ips);

			domainBindingList.add(domainBinding);
		}
		advanceSetting.setDomainBindingList(domainBindingList);
		sceneSnapShot.setAdvanceSetting(advanceSetting);

		List<FileParameter> fileParameterList = new ArrayList<FileParameter>();
		for (int i = 0; i < _ctx.lengthValue("GetPtsReportDetailsResponse.SceneSnapShot.FileParameterList.Length"); i++) {
			FileParameter fileParameter = new FileParameter();
			fileParameter.setFileOssAddress(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.FileParameterList["+ i +"].FileOssAddress"));
			fileParameter.setFileName(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.FileParameterList["+ i +"].FileName"));

			fileParameterList.add(fileParameter);
		}
		sceneSnapShot.setFileParameterList(fileParameterList);

		List<Relation> relationList = new ArrayList<Relation>();
		for (int i = 0; i < _ctx.lengthValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList.Length"); i++) {
			Relation relation = new Relation();
			relation.setRelationName(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].RelationName"));
			relation.setRelationId(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].RelationId"));

			List<FileParameterExplain> fileParameterExplainList = new ArrayList<FileParameterExplain>();
			for (int j = 0; j < _ctx.lengthValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].FileParameterExplainList.Length"); j++) {
				FileParameterExplain fileParameterExplain = new FileParameterExplain();
				fileParameterExplain.setCycleOnce(_ctx.booleanValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].FileParameterExplainList["+ j +"].CycleOnce"));
				fileParameterExplain.setFileParamName(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].FileParameterExplainList["+ j +"].FileParamName"));
				fileParameterExplain.setFileName(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].FileParameterExplainList["+ j +"].FileName"));
				fileParameterExplain.setBaseFile(_ctx.booleanValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].FileParameterExplainList["+ j +"].BaseFile"));

				fileParameterExplainList.add(fileParameterExplain);
			}
			relation.setFileParameterExplainList(fileParameterExplainList);

			List<Api> apiList = new ArrayList<Api>();
			for (int j = 0; j < _ctx.lengthValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].ApiList.Length"); j++) {
				Api api = new Api();
				api.setApiId(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].ApiList["+ j +"].ApiId"));
				api.setTimeoutInSecond(_ctx.integerValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].ApiList["+ j +"].TimeoutInSecond"));
				api.setUrl(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].ApiList["+ j +"].Url"));
				api.setBizMethod(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].ApiList["+ j +"].Method"));
				api.setRedirectCountLimit(_ctx.integerValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].ApiList["+ j +"].RedirectCountLimit"));
				api.setApiName(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].ApiList["+ j +"].ApiName"));

				Body body = new Body();
				body.setBodyValue(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].ApiList["+ j +"].Body.BodyValue"));
				body.setContentType(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].ApiList["+ j +"].Body.ContentType"));
				api.setBody(body);

				List<CheckPoint> checkPointList = new ArrayList<CheckPoint>();
				for (int k = 0; k < _ctx.lengthValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].ApiList["+ j +"].CheckPointList.Length"); k++) {
					CheckPoint checkPoint = new CheckPoint();
					checkPoint.setCheckType(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].ApiList["+ j +"].CheckPointList["+ k +"].CheckType"));
					checkPoint.setOperator(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].ApiList["+ j +"].CheckPointList["+ k +"].Operator"));
					checkPoint.setExpectValue(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].ApiList["+ j +"].CheckPointList["+ k +"].ExpectValue"));
					checkPoint.setCheckPoint(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].ApiList["+ j +"].CheckPointList["+ k +"].CheckPoint"));

					checkPointList.add(checkPoint);
				}
				api.setCheckPointList(checkPointList);

				List<Header> headerList = new ArrayList<Header>();
				for (int k = 0; k < _ctx.lengthValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].ApiList["+ j +"].HeaderList.Length"); k++) {
					Header header = new Header();
					header.setHeaderValue(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].ApiList["+ j +"].HeaderList["+ k +"].HeaderValue"));
					header.setHeaderName(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].ApiList["+ j +"].HeaderList["+ k +"].HeaderName"));

					headerList.add(header);
				}
				api.setHeaderList(headerList);

				List<Export> exportList = new ArrayList<Export>();
				for (int k = 0; k < _ctx.lengthValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].ApiList["+ j +"].ExportList.Length"); k++) {
					Export export = new Export();
					export.setExportType(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].ApiList["+ j +"].ExportList["+ k +"].ExportType"));
					export.setExportValue(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].ApiList["+ j +"].ExportList["+ k +"].ExportValue"));
					export.setExportName(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].ApiList["+ j +"].ExportList["+ k +"].ExportName"));
					export.setCount(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.RelationList["+ i +"].ApiList["+ j +"].ExportList["+ k +"].Count"));

					exportList.add(export);
				}
				api.setExportList(exportList);

				apiList.add(api);
			}
			relation.setApiList(apiList);

			relationList.add(relation);
		}
		sceneSnapShot.setRelationList(relationList);

		List<GlobalParameter> globalParameterList = new ArrayList<GlobalParameter>();
		for (int i = 0; i < _ctx.lengthValue("GetPtsReportDetailsResponse.SceneSnapShot.GlobalParameterList.Length"); i++) {
			GlobalParameter globalParameter = new GlobalParameter();
			globalParameter.setParamName(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.GlobalParameterList["+ i +"].ParamName"));
			globalParameter.setParamValue(_ctx.stringValue("GetPtsReportDetailsResponse.SceneSnapShot.GlobalParameterList["+ i +"].ParamValue"));

			globalParameterList.add(globalParameter);
		}
		sceneSnapShot.setGlobalParameterList(globalParameterList);
		getPtsReportDetailsResponse.setSceneSnapShot(sceneSnapShot);

		List<ApiMetrics> apiMetricsList = new ArrayList<ApiMetrics>();
		for (int i = 0; i < _ctx.lengthValue("GetPtsReportDetailsResponse.ApiMetricsList.Length"); i++) {
			ApiMetrics apiMetrics = new ApiMetrics();
			apiMetrics.setFailCountBiz(_ctx.longValue("GetPtsReportDetailsResponse.ApiMetricsList["+ i +"].FailCountBiz"));
			apiMetrics.setSeg75Rt(_ctx.floatValue("GetPtsReportDetailsResponse.ApiMetricsList["+ i +"].Seg75Rt"));
			apiMetrics.setAllCount(_ctx.longValue("GetPtsReportDetailsResponse.ApiMetricsList["+ i +"].AllCount"));
			apiMetrics.setAvgTps(_ctx.floatValue("GetPtsReportDetailsResponse.ApiMetricsList["+ i +"].AvgTps"));
			apiMetrics.setMinRt(_ctx.floatValue("GetPtsReportDetailsResponse.ApiMetricsList["+ i +"].MinRt"));
			apiMetrics.setSeg99Rt(_ctx.floatValue("GetPtsReportDetailsResponse.ApiMetricsList["+ i +"].Seg99Rt"));
			apiMetrics.setSeg50Rt(_ctx.floatValue("GetPtsReportDetailsResponse.ApiMetricsList["+ i +"].Seg50Rt"));
			apiMetrics.setMaxRt(_ctx.floatValue("GetPtsReportDetailsResponse.ApiMetricsList["+ i +"].MaxRt"));
			apiMetrics.setSeg90Rt(_ctx.floatValue("GetPtsReportDetailsResponse.ApiMetricsList["+ i +"].Seg90Rt"));
			apiMetrics.setSuccessRateBiz(_ctx.floatValue("GetPtsReportDetailsResponse.ApiMetricsList["+ i +"].SuccessRateBiz"));
			apiMetrics.setAvgRt(_ctx.floatValue("GetPtsReportDetailsResponse.ApiMetricsList["+ i +"].AvgRt"));
			apiMetrics.setFailCountReq(_ctx.longValue("GetPtsReportDetailsResponse.ApiMetricsList["+ i +"].FailCountReq"));
			apiMetrics.setSuccessRateReq(_ctx.floatValue("GetPtsReportDetailsResponse.ApiMetricsList["+ i +"].SuccessRateReq"));
			apiMetrics.setApiName(_ctx.stringValue("GetPtsReportDetailsResponse.ApiMetricsList["+ i +"].ApiName"));

			apiMetricsList.add(apiMetrics);
		}
		getPtsReportDetailsResponse.setApiMetricsList(apiMetricsList);
	 
	 	return getPtsReportDetailsResponse;
	}
}