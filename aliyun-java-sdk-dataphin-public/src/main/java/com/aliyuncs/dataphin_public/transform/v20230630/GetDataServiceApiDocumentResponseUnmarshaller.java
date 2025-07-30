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
		getDataServiceApiDocumentResponse.setSuccess(_ctx.booleanValue("GetDataServiceApiDocumentResponse.Success"));
		getDataServiceApiDocumentResponse.setHttpStatusCode(_ctx.integerValue("GetDataServiceApiDocumentResponse.HttpStatusCode"));
		getDataServiceApiDocumentResponse.setCode(_ctx.stringValue("GetDataServiceApiDocumentResponse.Code"));
		getDataServiceApiDocumentResponse.setMessage(_ctx.stringValue("GetDataServiceApiDocumentResponse.Message"));

		Data data = new Data();
		data.setName(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.Name"));
		data.setGroupId(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.GroupId"));
		data.setGroupName(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.GroupName"));
		data.setRequestMethod(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.RequestMethod"));
		data.setUpdateRate(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.UpdateRate"));
		data.setDescription(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.Description"));
		data.setReturnType(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.ReturnType"));
		data.setBizProtocol(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.Protocol"));
		data.setSql(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.Sql"));
		data.setIsSpecialSql(_ctx.booleanValue("GetDataServiceApiDocumentResponse.Data.IsSpecialSql"));
		data.setCreateType(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.CreateType"));
		data.setApiId(_ctx.longValue("GetDataServiceApiDocumentResponse.Data.ApiId"));
		data.setMode(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.Mode"));
		data.setEnv(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.Env"));
		data.setResultSample(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ResultSample"));
		data.setBizUnitName(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.BizUnitName"));
		data.setTableName(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.TableName"));
		data.setIsLogicalTable(_ctx.booleanValue("GetDataServiceApiDocumentResponse.Data.IsLogicalTable"));
		data.setDirectDatasourceId(_ctx.longValue("GetDataServiceApiDocumentResponse.Data.DirectDatasourceId"));
		data.setDirectDatasourceName(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.DirectDatasourceName"));
		data.setApiTimeout(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.ApiTimeout"));
		data.setReturnLimit(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.ReturnLimit"));
		data.setProjectId(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.ProjectId"));
		data.setProjectName(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ProjectName"));
		data.setResourceGroupId(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ResourceGroupId"));
		data.setResourceGroupName(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ResourceGroupName"));
		data.setOpenCache(_ctx.booleanValue("GetDataServiceApiDocumentResponse.Data.OpenCache"));
		data.setCacheTime(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.CacheTime"));
		data.setTimeout(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.Timeout"));
		data.setScriptType(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ScriptType"));
		data.setVersion(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.Version"));
		data.setIsPagedQuery(_ctx.booleanValue("GetDataServiceApiDocumentResponse.Data.IsPagedQuery"));

		ApiRegisterInfo apiRegisterInfo = new ApiRegisterInfo();
		apiRegisterInfo.setMode(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.ApiRegisterInfo.Mode"));
		apiRegisterInfo.setHttpMethod(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.ApiRegisterInfo.HttpMethod"));
		apiRegisterInfo.setDatasourceId(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ApiRegisterInfo.DatasourceId"));
		apiRegisterInfo.setDatasourceName(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ApiRegisterInfo.DatasourceName"));
		apiRegisterInfo.setUrl(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ApiRegisterInfo.Url"));
		apiRegisterInfo.setAuthType(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ApiRegisterInfo.AuthType"));
		apiRegisterInfo.setBizProtocol(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ApiRegisterInfo.Protocol"));
		apiRegisterInfo.setPath(_ctx.stringValue("GetDataServiceApiDocumentResponse.Data.ApiRegisterInfo.Path"));
		apiRegisterInfo.setTimeout(_ctx.integerValue("GetDataServiceApiDocumentResponse.Data.ApiRegisterInfo.Timeout"));
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
		getDataServiceApiDocumentResponse.setData(data);
	 
	 	return getDataServiceApiDocumentResponse;
	}
}