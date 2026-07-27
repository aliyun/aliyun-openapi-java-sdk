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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceApiDocumentResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceApiDocumentResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceApiDocumentResponse.Data.ApiRegisterInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceApiDocumentResponse.Data.PublicParam;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceApiDocumentResponse.Data.RequestParam;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceApiDocumentResponse.Data.ResponseParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataServiceApiDocumentResponseUnmarshaller {

	public static GetDataServiceApiDocumentResponse unmarshall(GetDataServiceApiDocumentResponse getDataServiceApiDocumentResponse, UnmarshallerContext _ctx) {
		
		getDataServiceApiDocumentResponse.setRequestId(_ctx.stringValue("GetDataServiceApiDocumentResponse.RequestId"));
		getDataServiceApiDocumentResponse.setMessage(_ctx.stringValue("GetDataServiceApiDocumentResponse.Message"));
		getDataServiceApiDocumentResponse.setHttpStatusCode(_ctx.integerValue("GetDataServiceApiDocumentResponse.HttpStatusCode"));
		getDataServiceApiDocumentResponse.setCode(_ctx.stringValue("GetDataServiceApiDocumentResponse.Code"));
		getDataServiceApiDocumentResponse.setSuccess(_ctx.booleanValue("GetDataServiceApiDocumentResponse.Success"));

		Data data = new Data();
		data.setGroupName(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.GroupName"));
		data.setDescription(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.Description"));
		data.setUpdateRate(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.UpdateRate"));
		data.setResourceGroupId(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ResourceGroupId"));
		data.setIsSpecialSql(_ctx.booleanValue("GetDataServiceApiDocumentResponse.Data.IsSpecialSql"));
		data.setProjectName(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ProjectName"));
		data.setRequestMethod(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.RequestMethod"));
		data.setReturnLimit(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.ReturnLimit"));
		data.setEnv(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.Env"));
		data.setName(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.Name"));
		data.setDirectDatasourceId(_ctx.longValue("GetDataServiceApiDocumentResponse.Data.DirectDatasourceId"));
		data.setVersion(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.Version"));
		data.setCreateType(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.CreateType"));
		data.setBizUnitName(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.BizUnitName"));
		data.setBizProtocol(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.Protocol"));
		data.setApiTimeout(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.ApiTimeout"));
		data.setScriptType(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ScriptType"));
		data.setResultSample(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ResultSample"));
		data.setTimeout(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.Timeout"));
		data.setMode(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.Mode"));
		data.setIsLogicalTable(_ctx.booleanValue("GetDataServiceApiDocumentResponse.Data.IsLogicalTable"));
		data.setProjectId(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.ProjectId"));
		data.setReturnType(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.ReturnType"));
		data.setGroupId(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.GroupId"));
		data.setSql(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.Sql"));
		data.setTableName(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.TableName"));
		data.setOpenCache(_ctx.booleanValue("GetDataServiceApiDocumentResponse.Data.OpenCache"));
		data.setIsPagedQuery(_ctx.booleanValue("GetDataServiceApiDocumentResponse.Data.IsPagedQuery"));
		data.setDirectDatasourceName(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.DirectDatasourceName"));
		data.setCacheTime(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.CacheTime"));
		data.setApiId(_ctx.longValue("GetDataServiceApiDocumentResponse.Data.ApiId"));
		data.setResourceGroupName(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ResourceGroupName"));

		ApiRegisterInfo apiRegisterInfo = new ApiRegisterInfo();
		apiRegisterInfo.setPath(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ApiRegisterInfo.Path"));
		apiRegisterInfo.setDatasourceId(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ApiRegisterInfo.DatasourceId"));
		apiRegisterInfo.setDatasourceName(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ApiRegisterInfo.DatasourceName"));
		apiRegisterInfo.setTimeout(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.ApiRegisterInfo.Timeout"));
		apiRegisterInfo.setMode(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.ApiRegisterInfo.Mode"));
		apiRegisterInfo.setAuthType(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ApiRegisterInfo.AuthType"));
		apiRegisterInfo.setBizProtocol(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ApiRegisterInfo.Protocol"));
		apiRegisterInfo.setHttpMethod(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.ApiRegisterInfo.HttpMethod"));
		apiRegisterInfo.setUrl(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ApiRegisterInfo.Url"));
		data.setApiRegisterInfo(apiRegisterInfo);

		List<RequestParam> requestParamList = new ArrayList<RequestParam>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServiceApiDocumentResponse.Data.RequestParamList.Length"); i++) {
			RequestParam requestParam = new RequestParam();
			requestParam.setDefaultValue(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.RequestParamList["+ i +"].DefaultValue"));
			requestParam.setType(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.RequestParamList["+ i +"].Type"));
			requestParam.setDescription(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.RequestParamList["+ i +"].Description"));
			requestParam.setIsRequired(_ctx.booleanValue("GetDataServiceApiDocumentResponse.Data.RequestParamList["+ i +"].IsRequired"));
			requestParam.setSample(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.RequestParamList["+ i +"].Sample"));
			requestParam.setName(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.RequestParamList["+ i +"].Name"));

			requestParamList.add(requestParam);
		}
		data.setRequestParamList(requestParamList);

		List<PublicParam> publicParamList = new ArrayList<PublicParam>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServiceApiDocumentResponse.Data.PublicParamList.Length"); i++) {
			PublicParam publicParam = new PublicParam();
			publicParam.setType(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.PublicParamList["+ i +"].Type"));
			publicParam.setDescription(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.PublicParamList["+ i +"].Description"));
			publicParam.setIsRequired(_ctx.booleanValue("GetDataServiceApiDocumentResponse.Data.PublicParamList["+ i +"].IsRequired"));
			publicParam.setSample(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.PublicParamList["+ i +"].Sample"));
			publicParam.setName(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.PublicParamList["+ i +"].Name"));

			publicParamList.add(publicParam);
		}
		data.setPublicParamList(publicParamList);

		List<ResponseParam> responseParamList = new ArrayList<ResponseParam>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServiceApiDocumentResponse.Data.ResponseParamList.Length"); i++) {
			ResponseParam responseParam = new ResponseParam();
			responseParam.setType(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ResponseParamList["+ i +"].Type"));
			responseParam.setDescription(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ResponseParamList["+ i +"].Description"));
			responseParam.setSample(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ResponseParamList["+ i +"].Sample"));
			responseParam.setName(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ResponseParamList["+ i +"].Name"));

			responseParamList.add(responseParam);
		}
		data.setResponseParamList(responseParamList);
		getDataServiceApiDocumentResponse.setData(data);
	 
	 	return getDataServiceApiDocumentResponse;
	}
}