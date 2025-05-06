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

import com.aliyuncs.itag.model.v20210517.GetModelByIdResponse;
import com.aliyuncs.itag.model.v20210517.GetModelByIdResponse.Result;
import com.aliyuncs.itag.model.v20210517.GetModelByIdResponse.Result.Creator;
import com.aliyuncs.itag.model.v20210517.GetModelByIdResponse.Result.ModelConfig;
import com.aliyuncs.itag.model.v20210517.GetModelByIdResponse.Result.ModelExtendConfig;
import com.aliyuncs.itag.model.v20210517.GetModelByIdResponse.Result.ModelExtendConfig.AsyncConfig;
import com.aliyuncs.itag.model.v20210517.GetModelByIdResponse.Result.Modifier;
import com.aliyuncs.itag.model.v20210517.GetModelByIdResponse.Result.ParamConfig;
import com.aliyuncs.itag.model.v20210517.GetModelByIdResponse.Result.ParamConfig.PostParamItem;
import com.aliyuncs.itag.model.v20210517.GetModelByIdResponse.Result.ParamConfig.PresetParamItem;
import com.aliyuncs.itag.model.v20210517.GetModelByIdResponse.Result.ParamConfig.ResponseParamItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetModelByIdResponseUnmarshaller {

	public static GetModelByIdResponse unmarshall(GetModelByIdResponse getModelByIdResponse, UnmarshallerContext _ctx) {
		
		getModelByIdResponse.setRequestId(_ctx.stringValue("GetModelByIdResponse.RequestId"));
		getModelByIdResponse.setCode(_ctx.integerValue("GetModelByIdResponse.Code"));
		getModelByIdResponse.setMsg(_ctx.stringValue("GetModelByIdResponse.Msg"));
		getModelByIdResponse.setErrInfo(_ctx.stringValue("GetModelByIdResponse.ErrInfo"));
		getModelByIdResponse.setSucc(_ctx.booleanValue("GetModelByIdResponse.Succ"));
		getModelByIdResponse.setRt(_ctx.longValue("GetModelByIdResponse.Rt"));
		getModelByIdResponse.setHost(_ctx.stringValue("GetModelByIdResponse.Host"));
		getModelByIdResponse.setErrorCode(_ctx.stringValue("GetModelByIdResponse.ErrorCode"));

		Result result = new Result();
		result.setId(_ctx.stringValue("GetModelByIdResponse.Result.Id"));
		result.setCreatorId(_ctx.stringValue("GetModelByIdResponse.Result.CreatorId"));
		result.setCreatorAccount(_ctx.stringValue("GetModelByIdResponse.Result.CreatorAccount"));
		result.setCreatorName(_ctx.stringValue("GetModelByIdResponse.Result.CreatorName"));
		result.setTntInstId(_ctx.stringValue("GetModelByIdResponse.Result.TntInstId"));
		result.setName(_ctx.stringValue("GetModelByIdResponse.Result.Name"));
		result.setType(_ctx.stringValue("GetModelByIdResponse.Result.Type"));
		result.setSource(_ctx.stringValue("GetModelByIdResponse.Result.Source"));
		result.setRemark(_ctx.stringValue("GetModelByIdResponse.Result.Remark"));
		result.setAsync(_ctx.booleanValue("GetModelByIdResponse.Result.Async"));
		result.setGmtCreate(_ctx.stringValue("GetModelByIdResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("GetModelByIdResponse.Result.GmtModified"));

		ModelConfig modelConfig = new ModelConfig();
		modelConfig.setHost(_ctx.stringValue("GetModelByIdResponse.Result.ModelConfig.Host"));
		modelConfig.setRequestType(_ctx.stringValue("GetModelByIdResponse.Result.ModelConfig.RequestType"));
		modelConfig.setContentType(_ctx.stringValue("GetModelByIdResponse.Result.ModelConfig.ContentType"));
		modelConfig.setQpsLimit(_ctx.longValue("GetModelByIdResponse.Result.ModelConfig.QpsLimit"));
		modelConfig.setServiceCode(_ctx.stringValue("GetModelByIdResponse.Result.ModelConfig.ServiceCode"));
		modelConfig.setAppId(_ctx.stringValue("GetModelByIdResponse.Result.ModelConfig.AppId"));
		modelConfig.setToken(_ctx.stringValue("GetModelByIdResponse.Result.ModelConfig.Token"));
		modelConfig.setPaiModelTarget(_ctx.stringValue("GetModelByIdResponse.Result.ModelConfig.PaiModelTarget"));
		modelConfig.setUdfContent(_ctx.stringValue("GetModelByIdResponse.Result.ModelConfig.UdfContent"));
		result.setModelConfig(modelConfig);

		ParamConfig paramConfig = new ParamConfig();

		List<PresetParamItem> presetParam = new ArrayList<PresetParamItem>();
		for (int i = 0; i < _ctx.lengthValue("GetModelByIdResponse.Result.ParamConfig.PresetParam.Length"); i++) {
			PresetParamItem presetParamItem = new PresetParamItem();
			presetParamItem.setName(_ctx.stringValue("GetModelByIdResponse.Result.ParamConfig.PresetParam["+ i +"].Name"));
			presetParamItem.setAlias(_ctx.stringValue("GetModelByIdResponse.Result.ParamConfig.PresetParam["+ i +"].Alias"));
			presetParamItem.setType(_ctx.stringValue("GetModelByIdResponse.Result.ParamConfig.PresetParam["+ i +"].Type"));
			presetParamItem.setCodec(_ctx.stringValue("GetModelByIdResponse.Result.ParamConfig.PresetParam["+ i +"].Codec"));
			presetParamItem.setValue(_ctx.stringValue("GetModelByIdResponse.Result.ParamConfig.PresetParam["+ i +"].Value"));
			presetParamItem.setDefaultValue(_ctx.stringValue("GetModelByIdResponse.Result.ParamConfig.PresetParam["+ i +"].DefaultValue"));

			presetParam.add(presetParamItem);
		}
		paramConfig.setPresetParam(presetParam);

		List<PostParamItem> postParam = new ArrayList<PostParamItem>();
		for (int i = 0; i < _ctx.lengthValue("GetModelByIdResponse.Result.ParamConfig.PostParam.Length"); i++) {
			PostParamItem postParamItem = new PostParamItem();
			postParamItem.setName(_ctx.stringValue("GetModelByIdResponse.Result.ParamConfig.PostParam["+ i +"].Name"));
			postParamItem.setAlias(_ctx.stringValue("GetModelByIdResponse.Result.ParamConfig.PostParam["+ i +"].Alias"));
			postParamItem.setType(_ctx.stringValue("GetModelByIdResponse.Result.ParamConfig.PostParam["+ i +"].Type"));
			postParamItem.setCodec(_ctx.stringValue("GetModelByIdResponse.Result.ParamConfig.PostParam["+ i +"].Codec"));
			postParamItem.setValue(_ctx.stringValue("GetModelByIdResponse.Result.ParamConfig.PostParam["+ i +"].Value"));
			postParamItem.setDefaultValue(_ctx.stringValue("GetModelByIdResponse.Result.ParamConfig.PostParam["+ i +"].DefaultValue"));

			postParam.add(postParamItem);
		}
		paramConfig.setPostParam(postParam);

		List<ResponseParamItem> responseParam = new ArrayList<ResponseParamItem>();
		for (int i = 0; i < _ctx.lengthValue("GetModelByIdResponse.Result.ParamConfig.ResponseParam.Length"); i++) {
			ResponseParamItem responseParamItem = new ResponseParamItem();
			responseParamItem.setResultKey(_ctx.stringValue("GetModelByIdResponse.Result.ParamConfig.ResponseParam["+ i +"].ResultKey"));
			responseParamItem.setResultPath(_ctx.stringValue("GetModelByIdResponse.Result.ParamConfig.ResponseParam["+ i +"].ResultPath"));

			responseParam.add(responseParamItem);
		}
		paramConfig.setResponseParam(responseParam);
		result.setParamConfig(paramConfig);

		ModelExtendConfig modelExtendConfig = new ModelExtendConfig();
		modelExtendConfig.setPostUdfModelId(_ctx.longValue("GetModelByIdResponse.Result.ModelExtendConfig.PostUdfModelId"));
		modelExtendConfig.setPreUdfModelId(_ctx.longValue("GetModelByIdResponse.Result.ModelExtendConfig.PreUdfModelId"));
		modelExtendConfig.setExtra(_ctx.mapValue("GetModelByIdResponse.Result.ModelExtendConfig.Extra"));

		List<Long> aggModelIds = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetModelByIdResponse.Result.ModelExtendConfig.AggModelIds.Length"); i++) {
			aggModelIds.add(_ctx.longValue("GetModelByIdResponse.Result.ModelExtendConfig.AggModelIds["+ i +"]"));
		}
		modelExtendConfig.setAggModelIds(aggModelIds);

		AsyncConfig asyncConfig = new AsyncConfig();
		asyncConfig.setModelId(_ctx.longValue("GetModelByIdResponse.Result.ModelExtendConfig.AsyncConfig.ModelId"));
		modelExtendConfig.setAsyncConfig(asyncConfig);
		result.setModelExtendConfig(modelExtendConfig);

		Creator creator = new Creator();
		creator.setUserId(_ctx.stringValue("GetModelByIdResponse.Result.Creator.UserId"));
		creator.setUserName(_ctx.stringValue("GetModelByIdResponse.Result.Creator.UserName"));
		creator.setAccountType(_ctx.stringValue("GetModelByIdResponse.Result.Creator.AccountType"));
		creator.setAccountNo(_ctx.stringValue("GetModelByIdResponse.Result.Creator.AccountNo"));
		creator.setEmail(_ctx.stringValue("GetModelByIdResponse.Result.Creator.Email"));
		creator.setPamNo(_ctx.stringValue("GetModelByIdResponse.Result.Creator.PamNo"));
		creator.setSupplierId(_ctx.stringValue("GetModelByIdResponse.Result.Creator.SupplierId"));
		creator.setSupplierName(_ctx.stringValue("GetModelByIdResponse.Result.Creator.SupplierName"));
		result.setCreator(creator);

		Modifier modifier = new Modifier();
		modifier.setUserId(_ctx.stringValue("GetModelByIdResponse.Result.Modifier.UserId"));
		modifier.setUserName(_ctx.stringValue("GetModelByIdResponse.Result.Modifier.UserName"));
		modifier.setAccountType(_ctx.stringValue("GetModelByIdResponse.Result.Modifier.AccountType"));
		modifier.setAccountNo(_ctx.stringValue("GetModelByIdResponse.Result.Modifier.AccountNo"));
		modifier.setEmail(_ctx.stringValue("GetModelByIdResponse.Result.Modifier.Email"));
		modifier.setPamNo(_ctx.stringValue("GetModelByIdResponse.Result.Modifier.PamNo"));
		modifier.setSupplierId(_ctx.stringValue("GetModelByIdResponse.Result.Modifier.SupplierId"));
		modifier.setSupplierName(_ctx.stringValue("GetModelByIdResponse.Result.Modifier.SupplierName"));
		result.setModifier(modifier);
		getModelByIdResponse.setResult(result);
	 
	 	return getModelByIdResponse;
	}
}