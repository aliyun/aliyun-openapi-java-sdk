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

import com.aliyuncs.dataphin_public.model.v20230630.ListApiByAppResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListApiByAppResponse.ListResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListApiByAppResponse.ListResult.DataServiceApiDetailList;
import com.aliyuncs.dataphin_public.model.v20230630.ListApiByAppResponse.ListResult.DataServiceApiDetailList.PublicParamListItem;
import com.aliyuncs.dataphin_public.model.v20230630.ListApiByAppResponse.ListResult.DataServiceApiDetailList.PublicParamListItem.TableAndDsListItem2;
import com.aliyuncs.dataphin_public.model.v20230630.ListApiByAppResponse.ListResult.DataServiceApiDetailList.RegisterApi;
import com.aliyuncs.dataphin_public.model.v20230630.ListApiByAppResponse.ListResult.DataServiceApiDetailList.RequestParamListItem;
import com.aliyuncs.dataphin_public.model.v20230630.ListApiByAppResponse.ListResult.DataServiceApiDetailList.RequestParamListItem.TableAndDsListItem;
import com.aliyuncs.dataphin_public.model.v20230630.ListApiByAppResponse.ListResult.DataServiceApiDetailList.ResponseParamListItem;
import com.aliyuncs.dataphin_public.model.v20230630.ListApiByAppResponse.ListResult.DataServiceApiDetailList.ResponseParamListItem.TableAndDsListItem4;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApiByAppResponseUnmarshaller {

	public static ListApiByAppResponse unmarshall(ListApiByAppResponse listApiByAppResponse, UnmarshallerContext _ctx) {
		
		listApiByAppResponse.setRequestId(_ctx.stringValue("ListApiByAppResponse.RequestId"));
		listApiByAppResponse.setMessage(_ctx.stringValue("ListApiByAppResponse.Message"));
		listApiByAppResponse.setHttpStatusCode(_ctx.integerValue("ListApiByAppResponse.HttpStatusCode"));
		listApiByAppResponse.setCode(_ctx.stringValue("ListApiByAppResponse.Code"));
		listApiByAppResponse.setSuccess(_ctx.booleanValue("ListApiByAppResponse.Success"));

		ListResult listResult = new ListResult();
		listResult.setTotalCount(_ctx.integerValue("ListApiByAppResponse.ListResult.TotalCount"));

		List<DataServiceApiDetailList> data = new ArrayList<DataServiceApiDetailList>();
		for (int i = 0; i < _ctx.lengthValue("ListApiByAppResponse.ListResult.Data.Length"); i++) {
			DataServiceApiDetailList dataServiceApiDetailList = new DataServiceApiDetailList();
			dataServiceApiDetailList.setGroupName(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].GroupName"));
			dataServiceApiDetailList.setProtocolName(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].ProtocolName"));
			dataServiceApiDetailList.setDescription(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].Description"));
			dataServiceApiDetailList.setUpdateRate(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].UpdateRate"));
			dataServiceApiDetailList.setDbEnv(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].DbEnv"));
			dataServiceApiDetailList.setRequestMethod(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestMethod"));
			dataServiceApiDetailList.setProjId(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].ProjId"));
			dataServiceApiDetailList.setName(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].Name"));
			dataServiceApiDetailList.setAppName(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].AppName"));
			dataServiceApiDetailList.setDirectDatasourceId(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].DirectDatasourceId"));
			dataServiceApiDetailList.setSqlStatement(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].SqlStatement"));
			dataServiceApiDetailList.setApiNo(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].ApiNo"));
			dataServiceApiDetailList.setVersion(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].Version"));
			dataServiceApiDetailList.setRequestMethodName(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestMethodName"));
			dataServiceApiDetailList.setCreateType(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].CreateType"));
			dataServiceApiDetailList.setUpdateRateName(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].UpdateRateName"));
			dataServiceApiDetailList.setBizProtocol(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].Protocol"));
			dataServiceApiDetailList.setApiTimeout(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].ApiTimeout"));
			dataServiceApiDetailList.setSpecialSql(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].SpecialSql"));
			dataServiceApiDetailList.setProjName(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].ProjName"));
			dataServiceApiDetailList.setScriptType(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].ScriptType"));
			dataServiceApiDetailList.setResultSample(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResultSample"));
			dataServiceApiDetailList.setCacheSwitch(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].CacheSwitch"));
			dataServiceApiDetailList.setRsGrpId(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RsGrpId"));
			dataServiceApiDetailList.setTimeout(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].Timeout"));
			dataServiceApiDetailList.setIsLogicalTable(_ctx.booleanValue("ListApiByAppResponse.ListResult.Data["+ i +"].IsLogicalTable"));
			dataServiceApiDetailList.setMaxReturnNum(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].MaxReturnNum"));
			dataServiceApiDetailList.setReturnType(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].ReturnType"));
			dataServiceApiDetailList.setGroupId(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].GroupId"));
			dataServiceApiDetailList.setReturnTypeName(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].ReturnTypeName"));
			dataServiceApiDetailList.setTableName(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].TableName"));
			dataServiceApiDetailList.setIsPagedQuery(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].IsPagedQuery"));
			dataServiceApiDetailList.setModelType(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].ModelType"));
			dataServiceApiDetailList.setId(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].Id"));
			dataServiceApiDetailList.setDirectDatasourceName(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].DirectDatasourceName"));
			dataServiceApiDetailList.setBizModuleEnName(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].BizModuleEnName"));
			dataServiceApiDetailList.setCacheTime(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].CacheTime"));
			dataServiceApiDetailList.setResourceGroupName(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResourceGroupName"));

			List<String> authTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListApiByAppResponse.ListResult.Data["+ i +"].AuthTypes.Length"); j++) {
				authTypes.add(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].AuthTypes["+ j +"]"));
			}
			dataServiceApiDetailList.setAuthTypes(authTypes);

			RegisterApi registerApi = new RegisterApi();
			registerApi.setPath(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RegisterApi.Path"));
			registerApi.setAuthenticationMode(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RegisterApi.AuthenticationMode"));
			registerApi.setDatasourceId(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RegisterApi.DatasourceId"));
			registerApi.setDatasourceName(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RegisterApi.DatasourceName"));
			registerApi.setTimeout(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].RegisterApi.Timeout"));
			registerApi.setFailExample(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RegisterApi.FailExample"));
			registerApi.setModelType(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].RegisterApi.ModelType"));
			registerApi.setBizProtocol(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RegisterApi.Protocol"));
			registerApi.setApiId(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].RegisterApi.ApiId"));
			registerApi.setSuccessExample(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RegisterApi.SuccessExample"));
			registerApi.setHttpMethod(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].RegisterApi.HttpMethod"));
			registerApi.setUrl(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RegisterApi.Url"));
			dataServiceApiDetailList.setRegisterApi(registerApi);

			List<RequestParamListItem> requestParamList = new ArrayList<RequestParamListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestParamList.Length"); j++) {
				RequestParamListItem requestParamListItem = new RequestParamListItem();
				requestParamListItem.setOperator(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestParamList["+ j +"].Operator"));
				requestParamListItem.setDescription(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestParamList["+ j +"].Description"));
				requestParamListItem.setMappingColumn(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestParamList["+ j +"].MappingColumn"));
				requestParamListItem.setDescriptionCode(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestParamList["+ j +"].DescriptionCode"));
				requestParamListItem.setOptional(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestParamList["+ j +"].Optional"));
				requestParamListItem.setSample(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestParamList["+ j +"].Sample"));
				requestParamListItem.setParameterLocation(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestParamList["+ j +"].ParameterLocation"));
				requestParamListItem.setMust(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestParamList["+ j +"].Must"));
				requestParamListItem.setParamType(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestParamList["+ j +"].ParamType"));
				requestParamListItem.setOriginalColumn(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestParamList["+ j +"].OriginalColumn"));
				requestParamListItem.setDefaultValue(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestParamList["+ j +"].DefaultValue"));
				requestParamListItem.setInitialValue(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestParamList["+ j +"].InitialValue"));
				requestParamListItem.setDateFormat(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestParamList["+ j +"].DateFormat"));
				requestParamListItem.setId(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestParamList["+ j +"].Id"));
				requestParamListItem.setParamName(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestParamList["+ j +"].ParamName"));

				List<TableAndDsListItem> tableAndDsList = new ArrayList<TableAndDsListItem>();
				for (int k = 0; k < _ctx.lengthValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestParamList["+ j +"].TableAndDsList.Length"); k++) {
					TableAndDsListItem tableAndDsListItem = new TableAndDsListItem();
					tableAndDsListItem.setTableName(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestParamList["+ j +"].TableAndDsList["+ k +"].TableName"));
					tableAndDsListItem.setDatasourceId(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestParamList["+ j +"].TableAndDsList["+ k +"].DatasourceId"));
					tableAndDsListItem.setDatasourceName(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestParamList["+ j +"].TableAndDsList["+ k +"].DatasourceName"));
					tableAndDsListItem.setDatasourceType(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestParamList["+ j +"].TableAndDsList["+ k +"].DatasourceType"));
					tableAndDsListItem.setDatasourceUrl(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].RequestParamList["+ j +"].TableAndDsList["+ k +"].DatasourceUrl"));

					tableAndDsList.add(tableAndDsListItem);
				}
				requestParamListItem.setTableAndDsList(tableAndDsList);

				requestParamList.add(requestParamListItem);
			}
			dataServiceApiDetailList.setRequestParamList(requestParamList);

			List<PublicParamListItem> publicParamList = new ArrayList<PublicParamListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListApiByAppResponse.ListResult.Data["+ i +"].PublicParamList.Length"); j++) {
				PublicParamListItem publicParamListItem = new PublicParamListItem();
				publicParamListItem.setOperator(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].PublicParamList["+ j +"].Operator"));
				publicParamListItem.setDescription(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].PublicParamList["+ j +"].Description"));
				publicParamListItem.setMappingColumn(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].PublicParamList["+ j +"].MappingColumn"));
				publicParamListItem.setDescriptionCode(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].PublicParamList["+ j +"].DescriptionCode"));
				publicParamListItem.setOptional(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].PublicParamList["+ j +"].Optional"));
				publicParamListItem.setSample(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].PublicParamList["+ j +"].Sample"));
				publicParamListItem.setParameterLocation(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].PublicParamList["+ j +"].ParameterLocation"));
				publicParamListItem.setMust(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].PublicParamList["+ j +"].Must"));
				publicParamListItem.setParamType(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].PublicParamList["+ j +"].ParamType"));
				publicParamListItem.setOriginalColumn(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].PublicParamList["+ j +"].OriginalColumn"));
				publicParamListItem.setDefaultValue(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].PublicParamList["+ j +"].DefaultValue"));
				publicParamListItem.setInitialValue(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].PublicParamList["+ j +"].InitialValue"));
				publicParamListItem.setDateFormat(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].PublicParamList["+ j +"].DateFormat"));
				publicParamListItem.setId(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].PublicParamList["+ j +"].Id"));
				publicParamListItem.setParamName(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].PublicParamList["+ j +"].ParamName"));

				List<TableAndDsListItem2> tableAndDsList1 = new ArrayList<TableAndDsListItem2>();
				for (int k = 0; k < _ctx.lengthValue("ListApiByAppResponse.ListResult.Data["+ i +"].PublicParamList["+ j +"].TableAndDsList.Length"); k++) {
					TableAndDsListItem2 tableAndDsListItem2 = new TableAndDsListItem2();
					tableAndDsListItem2.setTableName(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].PublicParamList["+ j +"].TableAndDsList["+ k +"].TableName"));
					tableAndDsListItem2.setDatasourceId(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].PublicParamList["+ j +"].TableAndDsList["+ k +"].DatasourceId"));
					tableAndDsListItem2.setDatasourceName(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].PublicParamList["+ j +"].TableAndDsList["+ k +"].DatasourceName"));
					tableAndDsListItem2.setDatasourceType(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].PublicParamList["+ j +"].TableAndDsList["+ k +"].DatasourceType"));
					tableAndDsListItem2.setDatasourceUrl(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].PublicParamList["+ j +"].TableAndDsList["+ k +"].DatasourceUrl"));

					tableAndDsList1.add(tableAndDsListItem2);
				}
				publicParamListItem.setTableAndDsList1(tableAndDsList1);

				publicParamList.add(publicParamListItem);
			}
			dataServiceApiDetailList.setPublicParamList(publicParamList);

			List<ResponseParamListItem> responseParamList = new ArrayList<ResponseParamListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResponseParamList.Length"); j++) {
				ResponseParamListItem responseParamListItem = new ResponseParamListItem();
				responseParamListItem.setOperator(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResponseParamList["+ j +"].Operator"));
				responseParamListItem.setDescription(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResponseParamList["+ j +"].Description"));
				responseParamListItem.setMappingColumn(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResponseParamList["+ j +"].MappingColumn"));
				responseParamListItem.setDescriptionCode(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResponseParamList["+ j +"].DescriptionCode"));
				responseParamListItem.setOptional(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResponseParamList["+ j +"].Optional"));
				responseParamListItem.setSample(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResponseParamList["+ j +"].Sample"));
				responseParamListItem.setParameterLocation(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResponseParamList["+ j +"].ParameterLocation"));
				responseParamListItem.setMust(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResponseParamList["+ j +"].Must"));
				responseParamListItem.setParamType(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResponseParamList["+ j +"].ParamType"));
				responseParamListItem.setOriginalColumn(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResponseParamList["+ j +"].OriginalColumn"));
				responseParamListItem.setDefaultValue(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResponseParamList["+ j +"].DefaultValue"));
				responseParamListItem.setInitialValue(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResponseParamList["+ j +"].InitialValue"));
				responseParamListItem.setDateFormat(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResponseParamList["+ j +"].DateFormat"));
				responseParamListItem.setId(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResponseParamList["+ j +"].Id"));
				responseParamListItem.setParamName(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResponseParamList["+ j +"].ParamName"));

				List<TableAndDsListItem4> tableAndDsList3 = new ArrayList<TableAndDsListItem4>();
				for (int k = 0; k < _ctx.lengthValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResponseParamList["+ j +"].TableAndDsList.Length"); k++) {
					TableAndDsListItem4 tableAndDsListItem4 = new TableAndDsListItem4();
					tableAndDsListItem4.setTableName(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResponseParamList["+ j +"].TableAndDsList["+ k +"].TableName"));
					tableAndDsListItem4.setDatasourceId(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResponseParamList["+ j +"].TableAndDsList["+ k +"].DatasourceId"));
					tableAndDsListItem4.setDatasourceName(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResponseParamList["+ j +"].TableAndDsList["+ k +"].DatasourceName"));
					tableAndDsListItem4.setDatasourceType(_ctx.longValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResponseParamList["+ j +"].TableAndDsList["+ k +"].DatasourceType"));
					tableAndDsListItem4.setDatasourceUrl(_ctx.stringValue("ListApiByAppResponse.ListResult.Data["+ i +"].ResponseParamList["+ j +"].TableAndDsList["+ k +"].DatasourceUrl"));

					tableAndDsList3.add(tableAndDsListItem4);
				}
				responseParamListItem.setTableAndDsList3(tableAndDsList3);

				responseParamList.add(responseParamListItem);
			}
			dataServiceApiDetailList.setResponseParamList(responseParamList);

			data.add(dataServiceApiDetailList);
		}
		listResult.setData(data);
		listApiByAppResponse.setListResult(listResult);
	 
	 	return listApiByAppResponse;
	}
}