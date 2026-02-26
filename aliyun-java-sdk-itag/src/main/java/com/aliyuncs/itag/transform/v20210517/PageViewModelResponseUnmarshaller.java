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

import com.aliyuncs.itag.model.v20210517.PageViewModelResponse;
import com.aliyuncs.itag.model.v20210517.PageViewModelResponse.Result;
import com.aliyuncs.itag.model.v20210517.PageViewModelResponse.Result.ListItem;
import com.aliyuncs.itag.model.v20210517.PageViewModelResponse.Result.ListItem.Creator;
import com.aliyuncs.itag.model.v20210517.PageViewModelResponse.Result.ListItem.DemoModelConfig;
import com.aliyuncs.itag.model.v20210517.PageViewModelResponse.Result.ListItem.ModelConfig;
import com.aliyuncs.itag.model.v20210517.PageViewModelResponse.Result.ListItem.ModelExtendConfig;
import com.aliyuncs.itag.model.v20210517.PageViewModelResponse.Result.ListItem.ModelExtendConfig.AsyncConfig;
import com.aliyuncs.itag.model.v20210517.PageViewModelResponse.Result.ListItem.Modifier;
import com.aliyuncs.itag.model.v20210517.PageViewModelResponse.Result.ListItem.ParamConfig;
import com.aliyuncs.itag.model.v20210517.PageViewModelResponse.Result.ListItem.ParamConfig.PostParamItem;
import com.aliyuncs.itag.model.v20210517.PageViewModelResponse.Result.ListItem.ParamConfig.PresetParamItem;
import com.aliyuncs.itag.model.v20210517.PageViewModelResponse.Result.ListItem.ParamConfig.ResponseParamItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageViewModelResponseUnmarshaller {

	public static PageViewModelResponse unmarshall(PageViewModelResponse pageViewModelResponse, UnmarshallerContext _ctx) {
		
		pageViewModelResponse.setRequestId(_ctx.stringValue("PageViewModelResponse.RequestId"));
		pageViewModelResponse.setCode(_ctx.integerValue("PageViewModelResponse.Code"));
		pageViewModelResponse.setMsg(_ctx.stringValue("PageViewModelResponse.Msg"));
		pageViewModelResponse.setErrInfo(_ctx.stringValue("PageViewModelResponse.ErrInfo"));
		pageViewModelResponse.setSucc(_ctx.booleanValue("PageViewModelResponse.Succ"));
		pageViewModelResponse.setRt(_ctx.longValue("PageViewModelResponse.Rt"));
		pageViewModelResponse.setHost(_ctx.stringValue("PageViewModelResponse.Host"));
		pageViewModelResponse.setErrorCode(_ctx.stringValue("PageViewModelResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.integerValue("PageViewModelResponse.Result.PageNum"));
		result.setPageSize(_ctx.integerValue("PageViewModelResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("PageViewModelResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("PageViewModelResponse.Result.TotalPage"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("PageViewModelResponse.Result.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setId(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].Id"));
			listItem.setCreatorId(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].CreatorId"));
			listItem.setCreatorAccount(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].CreatorAccount"));
			listItem.setCreatorName(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].CreatorName"));
			listItem.setTntInstId(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].TntInstId"));
			listItem.setName(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].Name"));
			listItem.setType(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].Type"));
			listItem.setSource(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].Source"));
			listItem.setRemark(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].Remark"));
			listItem.setAsync(_ctx.booleanValue("PageViewModelResponse.Result.List["+ i +"].Async"));
			listItem.setGmtCreate(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].GmtCreate"));
			listItem.setGmtModified(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].GmtModified"));
			listItem.setModelTag(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].ModelTag"));
			listItem.setUdfType(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].UdfType"));

			ModelConfig modelConfig = new ModelConfig();
			modelConfig.setHost(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].ModelConfig.Host"));
			modelConfig.setRequestType(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].ModelConfig.RequestType"));
			modelConfig.setContentType(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].ModelConfig.ContentType"));
			modelConfig.setQpsLimit(_ctx.longValue("PageViewModelResponse.Result.List["+ i +"].ModelConfig.QpsLimit"));
			modelConfig.setServiceCode(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].ModelConfig.ServiceCode"));
			modelConfig.setAppId(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].ModelConfig.AppId"));
			modelConfig.setToken(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].ModelConfig.Token"));
			modelConfig.setPaiModelTarget(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].ModelConfig.PaiModelTarget"));
			modelConfig.setUdfContent(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].ModelConfig.UdfContent"));
			listItem.setModelConfig(modelConfig);

			ParamConfig paramConfig = new ParamConfig();

			List<PresetParamItem> presetParam = new ArrayList<PresetParamItem>();
			for (int j = 0; j < _ctx.lengthValue("PageViewModelResponse.Result.List["+ i +"].ParamConfig.PresetParam.Length"); j++) {
				PresetParamItem presetParamItem = new PresetParamItem();
				presetParamItem.setName(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].ParamConfig.PresetParam["+ j +"].Name"));
				presetParamItem.setAlias(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].ParamConfig.PresetParam["+ j +"].Alias"));
				presetParamItem.setType(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].ParamConfig.PresetParam["+ j +"].Type"));
				presetParamItem.setCodec(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].ParamConfig.PresetParam["+ j +"].Codec"));
				presetParamItem.setValue(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].ParamConfig.PresetParam["+ j +"].Value"));
				presetParamItem.setDefaultValue(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].ParamConfig.PresetParam["+ j +"].DefaultValue"));

				presetParam.add(presetParamItem);
			}
			paramConfig.setPresetParam(presetParam);

			List<PostParamItem> postParam = new ArrayList<PostParamItem>();
			for (int j = 0; j < _ctx.lengthValue("PageViewModelResponse.Result.List["+ i +"].ParamConfig.PostParam.Length"); j++) {
				PostParamItem postParamItem = new PostParamItem();
				postParamItem.setName(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].ParamConfig.PostParam["+ j +"].Name"));
				postParamItem.setAlias(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].ParamConfig.PostParam["+ j +"].Alias"));
				postParamItem.setType(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].ParamConfig.PostParam["+ j +"].Type"));
				postParamItem.setCodec(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].ParamConfig.PostParam["+ j +"].Codec"));
				postParamItem.setValue(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].ParamConfig.PostParam["+ j +"].Value"));
				postParamItem.setDefaultValue(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].ParamConfig.PostParam["+ j +"].DefaultValue"));

				postParam.add(postParamItem);
			}
			paramConfig.setPostParam(postParam);

			List<ResponseParamItem> responseParam = new ArrayList<ResponseParamItem>();
			for (int j = 0; j < _ctx.lengthValue("PageViewModelResponse.Result.List["+ i +"].ParamConfig.ResponseParam.Length"); j++) {
				ResponseParamItem responseParamItem = new ResponseParamItem();
				responseParamItem.setResultKey(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].ParamConfig.ResponseParam["+ j +"].ResultKey"));
				responseParamItem.setResultPath(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].ParamConfig.ResponseParam["+ j +"].ResultPath"));

				responseParam.add(responseParamItem);
			}
			paramConfig.setResponseParam(responseParam);
			listItem.setParamConfig(paramConfig);

			ModelExtendConfig modelExtendConfig = new ModelExtendConfig();
			modelExtendConfig.setPostUdfModelId(_ctx.longValue("PageViewModelResponse.Result.List["+ i +"].ModelExtendConfig.PostUdfModelId"));
			modelExtendConfig.setPreUdfModelId(_ctx.longValue("PageViewModelResponse.Result.List["+ i +"].ModelExtendConfig.PreUdfModelId"));
			modelExtendConfig.setExtra(_ctx.mapValue("PageViewModelResponse.Result.List["+ i +"].ModelExtendConfig.Extra"));

			List<Long> aggModelIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("PageViewModelResponse.Result.List["+ i +"].ModelExtendConfig.AggModelIds.Length"); j++) {
				aggModelIds.add(_ctx.longValue("PageViewModelResponse.Result.List["+ i +"].ModelExtendConfig.AggModelIds["+ j +"]"));
			}
			modelExtendConfig.setAggModelIds(aggModelIds);

			AsyncConfig asyncConfig = new AsyncConfig();
			asyncConfig.setModelId(_ctx.longValue("PageViewModelResponse.Result.List["+ i +"].ModelExtendConfig.AsyncConfig.ModelId"));
			modelExtendConfig.setAsyncConfig(asyncConfig);
			listItem.setModelExtendConfig(modelExtendConfig);

			Creator creator = new Creator();
			creator.setUserId(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].Creator.UserId"));
			creator.setUserName(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].Creator.UserName"));
			creator.setAccountType(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].Creator.AccountType"));
			creator.setAccountNo(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].Creator.AccountNo"));
			creator.setEmail(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].Creator.Email"));
			creator.setPamNo(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].Creator.PamNo"));
			creator.setSupplierId(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].Creator.SupplierId"));
			creator.setSupplierName(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].Creator.SupplierName"));
			listItem.setCreator(creator);

			Modifier modifier = new Modifier();
			modifier.setUserId(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].Modifier.UserId"));
			modifier.setUserName(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].Modifier.UserName"));
			modifier.setAccountType(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].Modifier.AccountType"));
			modifier.setAccountNo(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].Modifier.AccountNo"));
			modifier.setEmail(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].Modifier.Email"));
			modifier.setPamNo(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].Modifier.PamNo"));
			modifier.setSupplierId(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].Modifier.SupplierId"));
			modifier.setSupplierName(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].Modifier.SupplierName"));
			listItem.setModifier(modifier);

			DemoModelConfig demoModelConfig = new DemoModelConfig();
			demoModelConfig.setHost(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].DemoModelConfig.Host"));
			demoModelConfig.setRequestType(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].DemoModelConfig.RequestType"));
			demoModelConfig.setContentType(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].DemoModelConfig.ContentType"));
			demoModelConfig.setQpsLimit(_ctx.longValue("PageViewModelResponse.Result.List["+ i +"].DemoModelConfig.QpsLimit"));
			demoModelConfig.setServiceCode(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].DemoModelConfig.ServiceCode"));
			demoModelConfig.setAppId(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].DemoModelConfig.AppId"));
			demoModelConfig.setToken(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].DemoModelConfig.Token"));
			demoModelConfig.setPaiModelTarget(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].DemoModelConfig.PaiModelTarget"));
			demoModelConfig.setUdfContent(_ctx.stringValue("PageViewModelResponse.Result.List["+ i +"].DemoModelConfig.UdfContent"));
			listItem.setDemoModelConfig(demoModelConfig);

			list.add(listItem);
		}
		result.setList(list);
		pageViewModelResponse.setResult(result);
	 
	 	return pageViewModelResponse;
	}
}