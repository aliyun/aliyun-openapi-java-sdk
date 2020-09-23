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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceApisResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceApisResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceApisResponse.Data.Api;
import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceApisResponse.Data.Api.RegistrationDetails;
import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceApisResponse.Data.Api.RegistrationDetails.RegistrationErrorCode;
import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceApisResponse.Data.Api.RegistrationDetails.RegistrationRequestParameter;
import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceApisResponse.Data.Api.ScriptDetails;
import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceApisResponse.Data.Api.ScriptDetails.ScriptConnection;
import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceApisResponse.Data.Api.ScriptDetails.ScriptRequestParameter;
import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceApisResponse.Data.Api.ScriptDetails.ScriptResponseParameter;
import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceApisResponse.Data.Api.WizardDetails;
import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceApisResponse.Data.Api.WizardDetails.WizardConnection;
import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceApisResponse.Data.Api.WizardDetails.WizardRequestParameter;
import com.aliyuncs.dataworks_public.model.v20200518.ListDataServiceApisResponse.Data.Api.WizardDetails.WizardResponseParameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataServiceApisResponseUnmarshaller {

	public static ListDataServiceApisResponse unmarshall(ListDataServiceApisResponse listDataServiceApisResponse, UnmarshallerContext _ctx) {
		
		listDataServiceApisResponse.setRequestId(_ctx.stringValue("ListDataServiceApisResponse.RequestId"));
		listDataServiceApisResponse.setErrorCode(_ctx.stringValue("ListDataServiceApisResponse.ErrorCode"));
		listDataServiceApisResponse.setErrorMessage(_ctx.stringValue("ListDataServiceApisResponse.ErrorMessage"));
		listDataServiceApisResponse.setHttpStatusCode(_ctx.integerValue("ListDataServiceApisResponse.HttpStatusCode"));
		listDataServiceApisResponse.setSuccess(_ctx.booleanValue("ListDataServiceApisResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListDataServiceApisResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListDataServiceApisResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListDataServiceApisResponse.Data.TotalCount"));

		List<Api> apis = new ArrayList<Api>();
		for (int i = 0; i < _ctx.lengthValue("ListDataServiceApisResponse.Data.Apis.Length"); i++) {
			Api api = new Api();
			api.setApiId(_ctx.longValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ApiId"));
			api.setApiMode(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ApiMode"));
			api.setApiName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ApiName"));
			api.setApiPath(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ApiPath"));
			api.setCreatedTime(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].CreatedTime"));
			api.setCreatorId(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].CreatorId"));
			api.setDescription(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].Description"));
			api.setGroupId(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].GroupId"));
			api.setModifiedTime(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ModifiedTime"));
			api.setOperatorId(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].OperatorId"));
			api.setProjectId(_ctx.longValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ProjectId"));
			api.setRequestMethod(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RequestMethod"));
			api.setResponseContentType(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ResponseContentType"));
			api.setStatus(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].Status"));
			api.setTenantId(_ctx.longValue("ListDataServiceApisResponse.Data.Apis["+ i +"].TenantId"));
			api.setTimeout(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].Timeout"));
			api.setVisibleRange(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].VisibleRange"));
			api.setFolderId(_ctx.longValue("ListDataServiceApisResponse.Data.Apis["+ i +"].FolderId"));

			List<Integer> protocols = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("ListDataServiceApisResponse.Data.Apis["+ i +"].Protocols.Length"); j++) {
				protocols.add(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].Protocols["+ j +"]"));
			}
			api.setProtocols(protocols);

			RegistrationDetails registrationDetails = new RegistrationDetails();
			registrationDetails.setFailedResultSample(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.FailedResultSample"));
			registrationDetails.setServiceContentType(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.ServiceContentType"));
			registrationDetails.setServiceHost(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.ServiceHost"));
			registrationDetails.setServicePath(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.ServicePath"));
			registrationDetails.setServiceRequestBodyDescription(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.ServiceRequestBodyDescription"));
			registrationDetails.setSuccessfulResultSample(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.SuccessfulResultSample"));

			List<RegistrationErrorCode> registrationErrorCodes = new ArrayList<RegistrationErrorCode>();
			for (int j = 0; j < _ctx.lengthValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationErrorCodes.Length"); j++) {
				RegistrationErrorCode registrationErrorCode = new RegistrationErrorCode();
				registrationErrorCode.setErrorCode(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationErrorCodes["+ j +"].ErrorCode"));
				registrationErrorCode.setErrorMessage(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationErrorCodes["+ j +"].ErrorMessage"));
				registrationErrorCode.setErrorSolution(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationErrorCodes["+ j +"].ErrorSolution"));

				registrationErrorCodes.add(registrationErrorCode);
			}
			registrationDetails.setRegistrationErrorCodes(registrationErrorCodes);

			List<RegistrationRequestParameter> registrationRequestParameters = new ArrayList<RegistrationRequestParameter>();
			for (int j = 0; j < _ctx.lengthValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationRequestParameters.Length"); j++) {
				RegistrationRequestParameter registrationRequestParameter = new RegistrationRequestParameter();
				registrationRequestParameter.setColumnName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationRequestParameters["+ j +"].ColumnName"));
				registrationRequestParameter.setDefaultValue(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationRequestParameters["+ j +"].DefaultValue"));
				registrationRequestParameter.setExampleValue(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationRequestParameters["+ j +"].ExampleValue"));
				registrationRequestParameter.setIsRequiredParameter(_ctx.booleanValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationRequestParameters["+ j +"].IsRequiredParameter"));
				registrationRequestParameter.setParameterDataType(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationRequestParameters["+ j +"].ParameterDataType"));
				registrationRequestParameter.setParameterDescription(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationRequestParameters["+ j +"].ParameterDescription"));
				registrationRequestParameter.setParameterName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationRequestParameters["+ j +"].ParameterName"));
				registrationRequestParameter.setParameterOperator(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationRequestParameters["+ j +"].ParameterOperator"));
				registrationRequestParameter.setParameterPosition(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationRequestParameters["+ j +"].ParameterPosition"));

				registrationRequestParameters.add(registrationRequestParameter);
			}
			registrationDetails.setRegistrationRequestParameters(registrationRequestParameters);
			api.setRegistrationDetails(registrationDetails);

			ScriptDetails scriptDetails = new ScriptDetails();
			scriptDetails.setIsPagedResponse(_ctx.booleanValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.IsPagedResponse"));
			scriptDetails.setScript(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.Script"));

			ScriptConnection scriptConnection = new ScriptConnection();
			scriptConnection.setConnectionId(_ctx.longValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptConnection.ConnectionId"));
			scriptConnection.setTableName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptConnection.TableName"));
			scriptDetails.setScriptConnection(scriptConnection);

			List<ScriptRequestParameter> scriptRequestParameters = new ArrayList<ScriptRequestParameter>();
			for (int j = 0; j < _ctx.lengthValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptRequestParameters.Length"); j++) {
				ScriptRequestParameter scriptRequestParameter = new ScriptRequestParameter();
				scriptRequestParameter.setColumnName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptRequestParameters["+ j +"].ColumnName"));
				scriptRequestParameter.setDefaultValue(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptRequestParameters["+ j +"].DefaultValue"));
				scriptRequestParameter.setExampleValue(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptRequestParameters["+ j +"].ExampleValue"));
				scriptRequestParameter.setIsRequiredParameter(_ctx.booleanValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptRequestParameters["+ j +"].IsRequiredParameter"));
				scriptRequestParameter.setParameterDataType(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptRequestParameters["+ j +"].ParameterDataType"));
				scriptRequestParameter.setParameterDescription(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptRequestParameters["+ j +"].ParameterDescription"));
				scriptRequestParameter.setParameterName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptRequestParameters["+ j +"].ParameterName"));
				scriptRequestParameter.setParameterOperator(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptRequestParameters["+ j +"].ParameterOperator"));
				scriptRequestParameter.setParameterPosition(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptRequestParameters["+ j +"].ParameterPosition"));

				scriptRequestParameters.add(scriptRequestParameter);
			}
			scriptDetails.setScriptRequestParameters(scriptRequestParameters);

			List<ScriptResponseParameter> scriptResponseParameters = new ArrayList<ScriptResponseParameter>();
			for (int j = 0; j < _ctx.lengthValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptResponseParameters.Length"); j++) {
				ScriptResponseParameter scriptResponseParameter = new ScriptResponseParameter();
				scriptResponseParameter.setColumnName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptResponseParameters["+ j +"].ColumnName"));
				scriptResponseParameter.setExampleValue(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptResponseParameters["+ j +"].ExampleValue"));
				scriptResponseParameter.setParameterDataType(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptResponseParameters["+ j +"].ParameterDataType"));
				scriptResponseParameter.setParameterDescription(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptResponseParameters["+ j +"].ParameterDescription"));
				scriptResponseParameter.setParameterName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptResponseParameters["+ j +"].ParameterName"));

				scriptResponseParameters.add(scriptResponseParameter);
			}
			scriptDetails.setScriptResponseParameters(scriptResponseParameters);
			api.setScriptDetails(scriptDetails);

			WizardDetails wizardDetails = new WizardDetails();
			wizardDetails.setIsPagedResponse(_ctx.booleanValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.IsPagedResponse"));

			WizardConnection wizardConnection = new WizardConnection();
			wizardConnection.setConnectionId(_ctx.longValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardConnection.ConnectionId"));
			wizardConnection.setTableName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardConnection.TableName"));
			wizardDetails.setWizardConnection(wizardConnection);

			List<WizardRequestParameter> wizardRequestParameters = new ArrayList<WizardRequestParameter>();
			for (int j = 0; j < _ctx.lengthValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardRequestParameters.Length"); j++) {
				WizardRequestParameter wizardRequestParameter = new WizardRequestParameter();
				wizardRequestParameter.setColumnName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardRequestParameters["+ j +"].ColumnName"));
				wizardRequestParameter.setDefaultValue(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardRequestParameters["+ j +"].DefaultValue"));
				wizardRequestParameter.setExampleValue(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardRequestParameters["+ j +"].ExampleValue"));
				wizardRequestParameter.setIsRequiredParameter(_ctx.booleanValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardRequestParameters["+ j +"].IsRequiredParameter"));
				wizardRequestParameter.setParameterDataType(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardRequestParameters["+ j +"].ParameterDataType"));
				wizardRequestParameter.setParameterDescription(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardRequestParameters["+ j +"].ParameterDescription"));
				wizardRequestParameter.setParameterName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardRequestParameters["+ j +"].ParameterName"));
				wizardRequestParameter.setParameterOperator(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardRequestParameters["+ j +"].ParameterOperator"));
				wizardRequestParameter.setParameterPosition(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardRequestParameters["+ j +"].ParameterPosition"));

				wizardRequestParameters.add(wizardRequestParameter);
			}
			wizardDetails.setWizardRequestParameters(wizardRequestParameters);

			List<WizardResponseParameter> wizardResponseParameters = new ArrayList<WizardResponseParameter>();
			for (int j = 0; j < _ctx.lengthValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardResponseParameters.Length"); j++) {
				WizardResponseParameter wizardResponseParameter = new WizardResponseParameter();
				wizardResponseParameter.setColumnName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardResponseParameters["+ j +"].ColumnName"));
				wizardResponseParameter.setExampleValue(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardResponseParameters["+ j +"].ExampleValue"));
				wizardResponseParameter.setParameterDataType(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardResponseParameters["+ j +"].ParameterDataType"));
				wizardResponseParameter.setParameterDescription(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardResponseParameters["+ j +"].ParameterDescription"));
				wizardResponseParameter.setParameterName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardResponseParameters["+ j +"].ParameterName"));

				wizardResponseParameters.add(wizardResponseParameter);
			}
			wizardDetails.setWizardResponseParameters(wizardResponseParameters);
			api.setWizardDetails(wizardDetails);

			apis.add(api);
		}
		data.setApis(apis);
		listDataServiceApisResponse.setData(data);
	 
	 	return listDataServiceApisResponse;
	}
}