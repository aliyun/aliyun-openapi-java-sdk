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

import com.aliyuncs.pts.model.v20201020.GetPtsSceneResponse;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneResponse.Scene;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneResponse.Scene.AdvanceSetting;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneResponse.Scene.AdvanceSetting.DomainBinding;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneResponse.Scene.FileParameter;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneResponse.Scene.GlobalParameter;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneResponse.Scene.Header1;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneResponse.Scene.LoadConfig;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneResponse.Scene.LoadConfig.ApiLoadConfig;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneResponse.Scene.LoadConfig.Configuration;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneResponse.Scene.LoadConfig.RelationLoadConfig;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneResponse.Scene.LoadConfig.VpcLoadConfig;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneResponse.Scene.Relation;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneResponse.Scene.Relation.Api;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneResponse.Scene.Relation.Api.Body;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneResponse.Scene.Relation.Api.CheckPoint;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneResponse.Scene.Relation.Api.Export;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneResponse.Scene.Relation.Api.Header;
import com.aliyuncs.pts.model.v20201020.GetPtsSceneResponse.Scene.Relation.FileParameterExplain;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPtsSceneResponseUnmarshaller {

	public static GetPtsSceneResponse unmarshall(GetPtsSceneResponse getPtsSceneResponse, UnmarshallerContext _ctx) {
		
		getPtsSceneResponse.setRequestId(_ctx.stringValue("GetPtsSceneResponse.RequestId"));
		getPtsSceneResponse.setMessage(_ctx.stringValue("GetPtsSceneResponse.Message"));
		getPtsSceneResponse.setHttpStatusCode(_ctx.integerValue("GetPtsSceneResponse.HttpStatusCode"));
		getPtsSceneResponse.setCode(_ctx.stringValue("GetPtsSceneResponse.Code"));
		getPtsSceneResponse.setSuccess(_ctx.booleanValue("GetPtsSceneResponse.Success"));

		Scene scene = new Scene();
		scene.setStatus(_ctx.stringValue("GetPtsSceneResponse.Scene.Status"));
		scene.setModifiedTime(_ctx.stringValue("GetPtsSceneResponse.Scene.ModifiedTime"));
		scene.setCreateTime(_ctx.stringValue("GetPtsSceneResponse.Scene.CreateTime"));
		scene.setSceneName(_ctx.stringValue("GetPtsSceneResponse.Scene.SceneName"));
		scene.setSceneId(_ctx.stringValue("GetPtsSceneResponse.Scene.SceneId"));

		LoadConfig loadConfig = new LoadConfig();
		loadConfig.setMaxRunningTime(_ctx.integerValue("GetPtsSceneResponse.Scene.LoadConfig.MaxRunningTime"));
		loadConfig.setAgentCount(_ctx.integerValue("GetPtsSceneResponse.Scene.LoadConfig.AgentCount"));
		loadConfig.setTestMode(_ctx.stringValue("GetPtsSceneResponse.Scene.LoadConfig.TestMode"));
		loadConfig.setAutoStep(_ctx.booleanValue("GetPtsSceneResponse.Scene.LoadConfig.AutoStep"));
		loadConfig.setIncrement(_ctx.integerValue("GetPtsSceneResponse.Scene.LoadConfig.Increment"));
		loadConfig.setKeepTime(_ctx.integerValue("GetPtsSceneResponse.Scene.LoadConfig.KeepTime"));

		Configuration configuration = new Configuration();
		configuration.setAllRpsBegin(_ctx.integerValue("GetPtsSceneResponse.Scene.LoadConfig.Configuration.AllRpsBegin"));
		configuration.setAllConcurrencyBegin(_ctx.integerValue("GetPtsSceneResponse.Scene.LoadConfig.Configuration.AllConcurrencyBegin"));
		configuration.setAllConcurrencyLimit(_ctx.integerValue("GetPtsSceneResponse.Scene.LoadConfig.Configuration.AllConcurrencyLimit"));
		configuration.setAllRpsLimit(_ctx.integerValue("GetPtsSceneResponse.Scene.LoadConfig.Configuration.AllRpsLimit"));
		loadConfig.setConfiguration(configuration);

		VpcLoadConfig vpcLoadConfig = new VpcLoadConfig();
		vpcLoadConfig.setVpcId(_ctx.stringValue("GetPtsSceneResponse.Scene.LoadConfig.VpcLoadConfig.VpcId"));
		vpcLoadConfig.setVSwitchId(_ctx.stringValue("GetPtsSceneResponse.Scene.LoadConfig.VpcLoadConfig.VSwitchId"));
		vpcLoadConfig.setSecurityGroupId(_ctx.stringValue("GetPtsSceneResponse.Scene.LoadConfig.VpcLoadConfig.SecurityGroupId"));
		vpcLoadConfig.setRegionId(_ctx.stringValue("GetPtsSceneResponse.Scene.LoadConfig.VpcLoadConfig.RegionId"));
		loadConfig.setVpcLoadConfig(vpcLoadConfig);

		List<ApiLoadConfig> apiLoadConfigList = new ArrayList<ApiLoadConfig>();
		for (int i = 0; i < _ctx.lengthValue("GetPtsSceneResponse.Scene.LoadConfig.ApiLoadConfigList.Length"); i++) {
			ApiLoadConfig apiLoadConfig = new ApiLoadConfig();
			apiLoadConfig.setRpsBegin(_ctx.integerValue("GetPtsSceneResponse.Scene.LoadConfig.ApiLoadConfigList["+ i +"].RpsBegin"));
			apiLoadConfig.setRpsLimit(_ctx.integerValue("GetPtsSceneResponse.Scene.LoadConfig.ApiLoadConfigList["+ i +"].RpsLimit"));
			apiLoadConfig.setApiId(_ctx.stringValue("GetPtsSceneResponse.Scene.LoadConfig.ApiLoadConfigList["+ i +"].ApiId"));

			apiLoadConfigList.add(apiLoadConfig);
		}
		loadConfig.setApiLoadConfigList(apiLoadConfigList);

		List<RelationLoadConfig> relationLoadConfigList = new ArrayList<RelationLoadConfig>();
		for (int i = 0; i < _ctx.lengthValue("GetPtsSceneResponse.Scene.LoadConfig.RelationLoadConfigList.Length"); i++) {
			RelationLoadConfig relationLoadConfig = new RelationLoadConfig();
			relationLoadConfig.setConcurrencyBegin(_ctx.integerValue("GetPtsSceneResponse.Scene.LoadConfig.RelationLoadConfigList["+ i +"].ConcurrencyBegin"));
			relationLoadConfig.setConcurrencyLimit(_ctx.integerValue("GetPtsSceneResponse.Scene.LoadConfig.RelationLoadConfigList["+ i +"].ConcurrencyLimit"));
			relationLoadConfig.setRelationId(_ctx.stringValue("GetPtsSceneResponse.Scene.LoadConfig.RelationLoadConfigList["+ i +"].RelationId"));

			relationLoadConfigList.add(relationLoadConfig);
		}
		loadConfig.setRelationLoadConfigList(relationLoadConfigList);
		scene.setLoadConfig(loadConfig);

		AdvanceSetting advanceSetting = new AdvanceSetting();
		advanceSetting.setLogRate(_ctx.integerValue("GetPtsSceneResponse.Scene.AdvanceSetting.LogRate"));
		advanceSetting.setConnectionTimeoutInSecond(_ctx.integerValue("GetPtsSceneResponse.Scene.AdvanceSetting.ConnectionTimeoutInSecond"));
		advanceSetting.setSuccessCode(_ctx.stringValue("GetPtsSceneResponse.Scene.AdvanceSetting.SuccessCode"));

		List<DomainBinding> domainBindingList = new ArrayList<DomainBinding>();
		for (int i = 0; i < _ctx.lengthValue("GetPtsSceneResponse.Scene.AdvanceSetting.DomainBindingList.Length"); i++) {
			DomainBinding domainBinding = new DomainBinding();
			domainBinding.setDomain(_ctx.stringValue("GetPtsSceneResponse.Scene.AdvanceSetting.DomainBindingList["+ i +"].Domain"));

			List<String> ips = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetPtsSceneResponse.Scene.AdvanceSetting.DomainBindingList["+ i +"].Ips.Length"); j++) {
				ips.add(_ctx.stringValue("GetPtsSceneResponse.Scene.AdvanceSetting.DomainBindingList["+ i +"].Ips["+ j +"]"));
			}
			domainBinding.setIps(ips);

			domainBindingList.add(domainBinding);
		}
		advanceSetting.setDomainBindingList(domainBindingList);
		scene.setAdvanceSetting(advanceSetting);

		List<FileParameter> fileParameterList = new ArrayList<FileParameter>();
		for (int i = 0; i < _ctx.lengthValue("GetPtsSceneResponse.Scene.FileParameterList.Length"); i++) {
			FileParameter fileParameter = new FileParameter();
			fileParameter.setFileOssAddress(_ctx.stringValue("GetPtsSceneResponse.Scene.FileParameterList["+ i +"].FileOssAddress"));
			fileParameter.setFileName(_ctx.stringValue("GetPtsSceneResponse.Scene.FileParameterList["+ i +"].FileName"));

			fileParameterList.add(fileParameter);
		}
		scene.setFileParameterList(fileParameterList);

		List<Relation> relationList = new ArrayList<Relation>();
		for (int i = 0; i < _ctx.lengthValue("GetPtsSceneResponse.Scene.RelationList.Length"); i++) {
			Relation relation = new Relation();
			relation.setRelationName(_ctx.stringValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].RelationName"));
			relation.setRelationId(_ctx.stringValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].RelationId"));

			List<FileParameterExplain> fileParameterExplainList = new ArrayList<FileParameterExplain>();
			for (int j = 0; j < _ctx.lengthValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].FileParameterExplainList.Length"); j++) {
				FileParameterExplain fileParameterExplain = new FileParameterExplain();
				fileParameterExplain.setCycleOnce(_ctx.booleanValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].FileParameterExplainList["+ j +"].CycleOnce"));
				fileParameterExplain.setFileParamName(_ctx.stringValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].FileParameterExplainList["+ j +"].FileParamName"));
				fileParameterExplain.setFileName(_ctx.stringValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].FileParameterExplainList["+ j +"].FileName"));
				fileParameterExplain.setBaseFile(_ctx.booleanValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].FileParameterExplainList["+ j +"].BaseFile"));

				fileParameterExplainList.add(fileParameterExplain);
			}
			relation.setFileParameterExplainList(fileParameterExplainList);

			List<Api> apiList = new ArrayList<Api>();
			for (int j = 0; j < _ctx.lengthValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].ApiList.Length"); j++) {
				Api api = new Api();
				api.setApiId(_ctx.stringValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].ApiList["+ j +"].ApiId"));
				api.setTimeoutInSecond(_ctx.integerValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].ApiList["+ j +"].TimeoutInSecond"));
				api.setUrl(_ctx.stringValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].ApiList["+ j +"].Url"));
				api.setBizMethod(_ctx.stringValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].ApiList["+ j +"].Method"));
				api.setRedirectCountLimit(_ctx.integerValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].ApiList["+ j +"].RedirectCountLimit"));
				api.setApiName(_ctx.stringValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].ApiList["+ j +"].ApiName"));

				Body body = new Body();
				body.setBodyValue(_ctx.stringValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].ApiList["+ j +"].Body.BodyValue"));
				body.setContentType(_ctx.stringValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].ApiList["+ j +"].Body.ContentType"));
				api.setBody(body);

				List<CheckPoint> checkPointList = new ArrayList<CheckPoint>();
				for (int k = 0; k < _ctx.lengthValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].ApiList["+ j +"].CheckPointList.Length"); k++) {
					CheckPoint checkPoint = new CheckPoint();
					checkPoint.setCheckType(_ctx.stringValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].ApiList["+ j +"].CheckPointList["+ k +"].CheckType"));
					checkPoint.setOperator(_ctx.stringValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].ApiList["+ j +"].CheckPointList["+ k +"].Operator"));
					checkPoint.setExpectValue(_ctx.stringValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].ApiList["+ j +"].CheckPointList["+ k +"].ExpectValue"));
					checkPoint.setCheckPoint(_ctx.stringValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].ApiList["+ j +"].CheckPointList["+ k +"].CheckPoint"));

					checkPointList.add(checkPoint);
				}
				api.setCheckPointList(checkPointList);

				List<Header> headerList = new ArrayList<Header>();
				for (int k = 0; k < _ctx.lengthValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].ApiList["+ j +"].HeaderList.Length"); k++) {
					Header header = new Header();
					header.setHeaderValue(_ctx.stringValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].ApiList["+ j +"].HeaderList["+ k +"].HeaderValue"));
					header.setHeaderName(_ctx.stringValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].ApiList["+ j +"].HeaderList["+ k +"].HeaderName"));

					headerList.add(header);
				}
				api.setHeaderList(headerList);

				List<Export> exportList = new ArrayList<Export>();
				for (int k = 0; k < _ctx.lengthValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].ApiList["+ j +"].ExportList.Length"); k++) {
					Export export = new Export();
					export.setExportType(_ctx.stringValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].ApiList["+ j +"].ExportList["+ k +"].ExportType"));
					export.setExportValue(_ctx.stringValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].ApiList["+ j +"].ExportList["+ k +"].ExportValue"));
					export.setExportName(_ctx.stringValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].ApiList["+ j +"].ExportList["+ k +"].ExportName"));
					export.setCount(_ctx.stringValue("GetPtsSceneResponse.Scene.RelationList["+ i +"].ApiList["+ j +"].ExportList["+ k +"].Count"));

					exportList.add(export);
				}
				api.setExportList(exportList);

				apiList.add(api);
			}
			relation.setApiList(apiList);

			relationList.add(relation);
		}
		scene.setRelationList(relationList);

		List<GlobalParameter> globalParameterList = new ArrayList<GlobalParameter>();
		for (int i = 0; i < _ctx.lengthValue("GetPtsSceneResponse.Scene.GlobalParameterList.Length"); i++) {
			GlobalParameter globalParameter = new GlobalParameter();
			globalParameter.setParamName(_ctx.stringValue("GetPtsSceneResponse.Scene.GlobalParameterList["+ i +"].ParamName"));
			globalParameter.setParamValue(_ctx.stringValue("GetPtsSceneResponse.Scene.GlobalParameterList["+ i +"].ParamValue"));

			globalParameterList.add(globalParameter);
		}
		scene.setGlobalParameterList(globalParameterList);

		List<Header1> headers = new ArrayList<Header1>();
		for (int i = 0; i < _ctx.lengthValue("GetPtsSceneResponse.Scene.Headers.Length"); i++) {
			Header1 header1 = new Header1();
			header1.setName(_ctx.stringValue("GetPtsSceneResponse.Scene.Headers["+ i +"].Name"));
			header1.setValue(_ctx.stringValue("GetPtsSceneResponse.Scene.Headers["+ i +"].Value"));

			headers.add(header1);
		}
		scene.setHeaders(headers);
		getPtsSceneResponse.setScene(scene);
	 
	 	return getPtsSceneResponse;
	}
}