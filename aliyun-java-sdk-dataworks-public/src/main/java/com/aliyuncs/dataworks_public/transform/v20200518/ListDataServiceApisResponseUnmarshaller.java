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
		listDataServiceApisResponse.setHttpStatusCode(_ctx.integerValue("ListDataServiceApisResponse.HttpStatusCode"));
		listDataServiceApisResponse.setErrorMessage(_ctx.stringValue("ListDataServiceApisResponse.ErrorMessage"));
		listDataServiceApisResponse.setSuccess(_ctx.booleanValue("ListDataServiceApisResponse.Success"));
		listDataServiceApisResponse.setErrorCode(_ctx.stringValue("ListDataServiceApisResponse.ErrorCode"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListDataServiceApisResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListDataServiceApisResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListDataServiceApisResponse.Data.TotalCount"));

		List<Api> apis = new ArrayList<Api>();
		for (int i = 0; i < _ctx.lengthValue("ListDataServiceApisResponse.Data.Apis.Length"); i++) {
			Api api = new Api();
			api.setTimeout(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].Timeout"));
			api.setStatus(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].Status"));
			api.setApiId(_ctx.longValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ApiId"));
			api.setApiMode(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ApiMode"));
			api.setProjectId(_ctx.longValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ProjectId"));
			api.setResponseContentType(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ResponseContentType"));
			api.setCreatorId(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].CreatorId"));
			api.setVisibleRange(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].VisibleRange"));
			api.setModifiedTime(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ModifiedTime"));
			api.setOperatorId(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].OperatorId"));
			api.setGroupId(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].GroupId"));
			api.setDescription(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].Description"));
			api.setFolderId(_ctx.longValue("ListDataServiceApisResponse.Data.Apis["+ i +"].FolderId"));
			api.setRequestMethod(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RequestMethod"));
			api.setCreatedTime(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].CreatedTime"));
			api.setApiName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ApiName"));
			api.setTenantId(_ctx.longValue("ListDataServiceApisResponse.Data.Apis["+ i +"].TenantId"));
			api.setApiPath(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ApiPath"));

			List<Integer> protocols = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("ListDataServiceApisResponse.Data.Apis["+ i +"].Protocols.Length"); j++) {
				protocols.add(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].Protocols["+ j +"]"));
			}
			api.setProtocols(protocols);

			RegistrationDetails registrationDetails = new RegistrationDetails();
			registrationDetails.setServiceHost(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.ServiceHost"));
			registrationDetails.setServiceContentType(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.ServiceContentType"));
			registrationDetails.setServicePath(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.ServicePath"));
			registrationDetails.setSuccessfulResultSample(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.SuccessfulResultSample"));
			registrationDetails.setFailedResultSample(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.FailedResultSample"));
			registrationDetails.setServiceRequestBodyDescription(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.ServiceRequestBodyDescription"));

			List<RegistrationErrorCode> registrationErrorCodes = new ArrayList<RegistrationErrorCode>();
			for (int j = 0; j < _ctx.lengthValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationErrorCodes.Length"); j++) {
				RegistrationErrorCode registrationErrorCode = new RegistrationErrorCode();
				registrationErrorCode.setErrorMessage(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationErrorCodes["+ j +"].ErrorMessage"));
				registrationErrorCode.setErrorCode(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationErrorCodes["+ j +"].ErrorCode"));
				registrationErrorCode.setErrorSolution(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationErrorCodes["+ j +"].ErrorSolution"));

				registrationErrorCodes.add(registrationErrorCode);
			}
			registrationDetails.setRegistrationErrorCodes(registrationErrorCodes);

			List<RegistrationRequestParameter> registrationRequestParameters = new ArrayList<RegistrationRequestParameter>();
			for (int j = 0; j < _ctx.lengthValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationRequestParameters.Length"); j++) {
				RegistrationRequestParameter registrationRequestParameter = new RegistrationRequestParameter();
				registrationRequestParameter.setColumnName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationRequestParameters["+ j +"].ColumnName"));
				registrationRequestParameter.setParameterName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationRequestParameters["+ j +"].ParameterName"));
				registrationRequestParameter.setParameterPosition(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationRequestParameters["+ j +"].ParameterPosition"));
				registrationRequestParameter.setParameterDescription(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationRequestParameters["+ j +"].ParameterDescription"));
				registrationRequestParameter.setDefaultValue(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationRequestParameters["+ j +"].DefaultValue"));
				registrationRequestParameter.setParameterOperator(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationRequestParameters["+ j +"].ParameterOperator"));
				registrationRequestParameter.setParameterDataType(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationRequestParameters["+ j +"].ParameterDataType"));
				registrationRequestParameter.setExampleValue(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationRequestParameters["+ j +"].ExampleValue"));
				registrationRequestParameter.setIsRequiredParameter(_ctx.booleanValue("ListDataServiceApisResponse.Data.Apis["+ i +"].RegistrationDetails.RegistrationRequestParameters["+ j +"].IsRequiredParameter"));

				registrationRequestParameters.add(registrationRequestParameter);
			}
			registrationDetails.setRegistrationRequestParameters(registrationRequestParameters);
			api.setRegistrationDetails(registrationDetails);

			ScriptDetails scriptDetails = new ScriptDetails();
			scriptDetails.setScript(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.Script"));
			scriptDetails.setIsPagedResponse(_ctx.booleanValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.IsPagedResponse"));

			ScriptConnection scriptConnection = new ScriptConnection();
			scriptConnection.setTableName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptConnection.TableName"));
			scriptConnection.setConnectionId(_ctx.longValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptConnection.ConnectionId"));
			scriptDetails.setScriptConnection(scriptConnection);

			List<ScriptRequestParameter> scriptRequestParameters = new ArrayList<ScriptRequestParameter>();
			for (int j = 0; j < _ctx.lengthValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptRequestParameters.Length"); j++) {
				ScriptRequestParameter scriptRequestParameter = new ScriptRequestParameter();
				scriptRequestParameter.setColumnName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptRequestParameters["+ j +"].ColumnName"));
				scriptRequestParameter.setParameterName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptRequestParameters["+ j +"].ParameterName"));
				scriptRequestParameter.setParameterPosition(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptRequestParameters["+ j +"].ParameterPosition"));
				scriptRequestParameter.setParameterDescription(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptRequestParameters["+ j +"].ParameterDescription"));
				scriptRequestParameter.setDefaultValue(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptRequestParameters["+ j +"].DefaultValue"));
				scriptRequestParameter.setParameterOperator(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptRequestParameters["+ j +"].ParameterOperator"));
				scriptRequestParameter.setParameterDataType(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptRequestParameters["+ j +"].ParameterDataType"));
				scriptRequestParameter.setExampleValue(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptRequestParameters["+ j +"].ExampleValue"));
				scriptRequestParameter.setIsRequiredParameter(_ctx.booleanValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptRequestParameters["+ j +"].IsRequiredParameter"));

				scriptRequestParameters.add(scriptRequestParameter);
			}
			scriptDetails.setScriptRequestParameters(scriptRequestParameters);

			List<ScriptResponseParameter> scriptResponseParameters = new ArrayList<ScriptResponseParameter>();
			for (int j = 0; j < _ctx.lengthValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptResponseParameters.Length"); j++) {
				ScriptResponseParameter scriptResponseParameter = new ScriptResponseParameter();
				scriptResponseParameter.setParameterDescription(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptResponseParameters["+ j +"].ParameterDescription"));
				scriptResponseParameter.setColumnName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptResponseParameters["+ j +"].ColumnName"));
				scriptResponseParameter.setParameterName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptResponseParameters["+ j +"].ParameterName"));
				scriptResponseParameter.setParameterDataType(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptResponseParameters["+ j +"].ParameterDataType"));
				scriptResponseParameter.setExampleValue(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].ScriptDetails.ScriptResponseParameters["+ j +"].ExampleValue"));

				scriptResponseParameters.add(scriptResponseParameter);
			}
			scriptDetails.setScriptResponseParameters(scriptResponseParameters);
			api.setScriptDetails(scriptDetails);

			WizardDetails wizardDetails = new WizardDetails();
			wizardDetails.setIsPagedResponse(_ctx.booleanValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.IsPagedResponse"));

			WizardConnection wizardConnection = new WizardConnection();
			wizardConnection.setTableName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardConnection.TableName"));
			wizardConnection.setConnectionId(_ctx.longValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardConnection.ConnectionId"));
			wizardDetails.setWizardConnection(wizardConnection);

			List<WizardRequestParameter> wizardRequestParameters = new ArrayList<WizardRequestParameter>();
			for (int j = 0; j < _ctx.lengthValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardRequestParameters.Length"); j++) {
				WizardRequestParameter wizardRequestParameter = new WizardRequestParameter();
				wizardRequestParameter.setColumnName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardRequestParameters["+ j +"].ColumnName"));
				wizardRequestParameter.setParameterName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardRequestParameters["+ j +"].ParameterName"));
				wizardRequestParameter.setParameterPosition(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardRequestParameters["+ j +"].ParameterPosition"));
				wizardRequestParameter.setParameterDescription(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardRequestParameters["+ j +"].ParameterDescription"));
				wizardRequestParameter.setDefaultValue(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardRequestParameters["+ j +"].DefaultValue"));
				wizardRequestParameter.setParameterOperator(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardRequestParameters["+ j +"].ParameterOperator"));
				wizardRequestParameter.setParameterDataType(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardRequestParameters["+ j +"].ParameterDataType"));
				wizardRequestParameter.setExampleValue(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardRequestParameters["+ j +"].ExampleValue"));
				wizardRequestParameter.setIsRequiredParameter(_ctx.booleanValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardRequestParameters["+ j +"].IsRequiredParameter"));

				wizardRequestParameters.add(wizardRequestParameter);
			}
			wizardDetails.setWizardRequestParameters(wizardRequestParameters);

			List<WizardResponseParameter> wizardResponseParameters = new ArrayList<WizardResponseParameter>();
			for (int j = 0; j < _ctx.lengthValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardResponseParameters.Length"); j++) {
				WizardResponseParameter wizardResponseParameter = new WizardResponseParameter();
				wizardResponseParameter.setParameterDescription(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardResponseParameters["+ j +"].ParameterDescription"));
				wizardResponseParameter.setColumnName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardResponseParameters["+ j +"].ColumnName"));
				wizardResponseParameter.setParameterName(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardResponseParameters["+ j +"].ParameterName"));
				wizardResponseParameter.setParameterDataType(_ctx.integerValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardResponseParameters["+ j +"].ParameterDataType"));
				wizardResponseParameter.setExampleValue(_ctx.stringValue("ListDataServiceApisResponse.Data.Apis["+ i +"].WizardDetails.WizardResponseParameters["+ j +"].ExampleValue"));

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