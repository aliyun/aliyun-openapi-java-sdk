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

import com.aliyuncs.dataworks_public.model.v20200518.GetDataServiceApiResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServiceApiResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServiceApiResponse.Data.RegistrationDetails;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServiceApiResponse.Data.RegistrationDetails.RegistrationErrorCode;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServiceApiResponse.Data.RegistrationDetails.RegistrationRequestParameter;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServiceApiResponse.Data.ScriptDetails;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServiceApiResponse.Data.ScriptDetails.ScriptConnection;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServiceApiResponse.Data.ScriptDetails.ScriptRequestParameter;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServiceApiResponse.Data.ScriptDetails.ScriptResponseParameter;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServiceApiResponse.Data.WizardDetails;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServiceApiResponse.Data.WizardDetails.WizardConnection;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServiceApiResponse.Data.WizardDetails.WizardRequestParameter;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServiceApiResponse.Data.WizardDetails.WizardResponseParameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataServiceApiResponseUnmarshaller {

	public static GetDataServiceApiResponse unmarshall(GetDataServiceApiResponse getDataServiceApiResponse, UnmarshallerContext _ctx) {
		
		getDataServiceApiResponse.setRequestId(_ctx.stringValue("GetDataServiceApiResponse.RequestId"));
		getDataServiceApiResponse.setErrorCode(_ctx.stringValue("GetDataServiceApiResponse.ErrorCode"));
		getDataServiceApiResponse.setErrorMessage(_ctx.stringValue("GetDataServiceApiResponse.ErrorMessage"));
		getDataServiceApiResponse.setHttpStatusCode(_ctx.integerValue("GetDataServiceApiResponse.HttpStatusCode"));
		getDataServiceApiResponse.setSuccess(_ctx.booleanValue("GetDataServiceApiResponse.Success"));

		Data data = new Data();
		data.setApiId(_ctx.longValue("GetDataServiceApiResponse.Data.ApiId"));
		data.setApiMode(_ctx.integerValue("GetDataServiceApiResponse.Data.ApiMode"));
		data.setApiName(_ctx.stringValue("GetDataServiceApiResponse.Data.ApiName"));
		data.setApiPath(_ctx.stringValue("GetDataServiceApiResponse.Data.ApiPath"));
		data.setCreatedTime(_ctx.stringValue("GetDataServiceApiResponse.Data.CreatedTime"));
		data.setCreatorId(_ctx.stringValue("GetDataServiceApiResponse.Data.CreatorId"));
		data.setDescription(_ctx.stringValue("GetDataServiceApiResponse.Data.Description"));
		data.setGroupId(_ctx.stringValue("GetDataServiceApiResponse.Data.GroupId"));
		data.setModifiedTime(_ctx.stringValue("GetDataServiceApiResponse.Data.ModifiedTime"));
		data.setOperatorId(_ctx.stringValue("GetDataServiceApiResponse.Data.OperatorId"));
		data.setProjectId(_ctx.longValue("GetDataServiceApiResponse.Data.ProjectId"));
		data.setRequestMethod(_ctx.integerValue("GetDataServiceApiResponse.Data.RequestMethod"));
		data.setResponseContentType(_ctx.integerValue("GetDataServiceApiResponse.Data.ResponseContentType"));
		data.setStatus(_ctx.integerValue("GetDataServiceApiResponse.Data.Status"));
		data.setTenantId(_ctx.longValue("GetDataServiceApiResponse.Data.TenantId"));
		data.setTimeout(_ctx.integerValue("GetDataServiceApiResponse.Data.Timeout"));
		data.setVisibleRange(_ctx.integerValue("GetDataServiceApiResponse.Data.VisibleRange"));

		List<Integer> protocols = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServiceApiResponse.Data.Protocols.Length"); i++) {
			protocols.add(_ctx.integerValue("GetDataServiceApiResponse.Data.Protocols["+ i +"]"));
		}
		data.setProtocols(protocols);

		RegistrationDetails registrationDetails = new RegistrationDetails();
		registrationDetails.setFailedResultSample(_ctx.stringValue("GetDataServiceApiResponse.Data.RegistrationDetails.FailedResultSample"));
		registrationDetails.setServiceContentType(_ctx.integerValue("GetDataServiceApiResponse.Data.RegistrationDetails.ServiceContentType"));
		registrationDetails.setServiceHost(_ctx.stringValue("GetDataServiceApiResponse.Data.RegistrationDetails.ServiceHost"));
		registrationDetails.setServicePath(_ctx.stringValue("GetDataServiceApiResponse.Data.RegistrationDetails.ServicePath"));
		registrationDetails.setServiceRequestBodyDescription(_ctx.stringValue("GetDataServiceApiResponse.Data.RegistrationDetails.ServiceRequestBodyDescription"));
		registrationDetails.setSuccessfulResultSample(_ctx.stringValue("GetDataServiceApiResponse.Data.RegistrationDetails.SuccessfulResultSample"));

		List<RegistrationErrorCode> registrationErrorCodes = new ArrayList<RegistrationErrorCode>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServiceApiResponse.Data.RegistrationDetails.RegistrationErrorCodes.Length"); i++) {
			RegistrationErrorCode registrationErrorCode = new RegistrationErrorCode();
			registrationErrorCode.setErrorCode(_ctx.stringValue("GetDataServiceApiResponse.Data.RegistrationDetails.RegistrationErrorCodes["+ i +"].ErrorCode"));
			registrationErrorCode.setErrorMessage(_ctx.stringValue("GetDataServiceApiResponse.Data.RegistrationDetails.RegistrationErrorCodes["+ i +"].ErrorMessage"));
			registrationErrorCode.setErrorSolution(_ctx.stringValue("GetDataServiceApiResponse.Data.RegistrationDetails.RegistrationErrorCodes["+ i +"].ErrorSolution"));

			registrationErrorCodes.add(registrationErrorCode);
		}
		registrationDetails.setRegistrationErrorCodes(registrationErrorCodes);

		List<RegistrationRequestParameter> registrationRequestParameters = new ArrayList<RegistrationRequestParameter>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServiceApiResponse.Data.RegistrationDetails.RegistrationRequestParameters.Length"); i++) {
			RegistrationRequestParameter registrationRequestParameter = new RegistrationRequestParameter();
			registrationRequestParameter.setColumnName(_ctx.stringValue("GetDataServiceApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].ColumnName"));
			registrationRequestParameter.setDefaultValue(_ctx.stringValue("GetDataServiceApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].DefaultValue"));
			registrationRequestParameter.setExampleValue(_ctx.stringValue("GetDataServiceApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].ExampleValue"));
			registrationRequestParameter.setIsRequiredParameter(_ctx.booleanValue("GetDataServiceApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].IsRequiredParameter"));
			registrationRequestParameter.setParameterDataType(_ctx.integerValue("GetDataServiceApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].ParameterDataType"));
			registrationRequestParameter.setParameterDescription(_ctx.stringValue("GetDataServiceApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].ParameterDescription"));
			registrationRequestParameter.setParameterName(_ctx.stringValue("GetDataServiceApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].ParameterName"));
			registrationRequestParameter.setParameterOperator(_ctx.integerValue("GetDataServiceApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].ParameterOperator"));
			registrationRequestParameter.setParameterPosition(_ctx.integerValue("GetDataServiceApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].ParameterPosition"));

			registrationRequestParameters.add(registrationRequestParameter);
		}
		registrationDetails.setRegistrationRequestParameters(registrationRequestParameters);
		data.setRegistrationDetails(registrationDetails);

		ScriptDetails scriptDetails = new ScriptDetails();
		scriptDetails.setIsPagedResponse(_ctx.booleanValue("GetDataServiceApiResponse.Data.ScriptDetails.IsPagedResponse"));
		scriptDetails.setScript(_ctx.stringValue("GetDataServiceApiResponse.Data.ScriptDetails.Script"));

		ScriptConnection scriptConnection = new ScriptConnection();
		scriptConnection.setConnectionId(_ctx.longValue("GetDataServiceApiResponse.Data.ScriptDetails.ScriptConnection.ConnectionId"));
		scriptConnection.setTableName(_ctx.stringValue("GetDataServiceApiResponse.Data.ScriptDetails.ScriptConnection.TableName"));
		scriptDetails.setScriptConnection(scriptConnection);

		List<ScriptRequestParameter> scriptRequestParameters = new ArrayList<ScriptRequestParameter>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServiceApiResponse.Data.ScriptDetails.ScriptRequestParameters.Length"); i++) {
			ScriptRequestParameter scriptRequestParameter = new ScriptRequestParameter();
			scriptRequestParameter.setColumnName(_ctx.stringValue("GetDataServiceApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].ColumnName"));
			scriptRequestParameter.setDefaultValue(_ctx.stringValue("GetDataServiceApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].DefaultValue"));
			scriptRequestParameter.setExampleValue(_ctx.stringValue("GetDataServiceApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].ExampleValue"));
			scriptRequestParameter.setIsRequiredParameter(_ctx.booleanValue("GetDataServiceApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].IsRequiredParameter"));
			scriptRequestParameter.setParameterDataType(_ctx.integerValue("GetDataServiceApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].ParameterDataType"));
			scriptRequestParameter.setParameterDescription(_ctx.stringValue("GetDataServiceApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].ParameterDescription"));
			scriptRequestParameter.setParameterName(_ctx.stringValue("GetDataServiceApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].ParameterName"));
			scriptRequestParameter.setParameterOperator(_ctx.integerValue("GetDataServiceApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].ParameterOperator"));
			scriptRequestParameter.setParameterPosition(_ctx.integerValue("GetDataServiceApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].ParameterPosition"));

			scriptRequestParameters.add(scriptRequestParameter);
		}
		scriptDetails.setScriptRequestParameters(scriptRequestParameters);

		List<ScriptResponseParameter> scriptResponseParameters = new ArrayList<ScriptResponseParameter>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServiceApiResponse.Data.ScriptDetails.ScriptResponseParameters.Length"); i++) {
			ScriptResponseParameter scriptResponseParameter = new ScriptResponseParameter();
			scriptResponseParameter.setColumnName(_ctx.stringValue("GetDataServiceApiResponse.Data.ScriptDetails.ScriptResponseParameters["+ i +"].ColumnName"));
			scriptResponseParameter.setExampleValue(_ctx.stringValue("GetDataServiceApiResponse.Data.ScriptDetails.ScriptResponseParameters["+ i +"].ExampleValue"));
			scriptResponseParameter.setParameterDataType(_ctx.integerValue("GetDataServiceApiResponse.Data.ScriptDetails.ScriptResponseParameters["+ i +"].ParameterDataType"));
			scriptResponseParameter.setParameterDescription(_ctx.stringValue("GetDataServiceApiResponse.Data.ScriptDetails.ScriptResponseParameters["+ i +"].ParameterDescription"));
			scriptResponseParameter.setParameterName(_ctx.stringValue("GetDataServiceApiResponse.Data.ScriptDetails.ScriptResponseParameters["+ i +"].ParameterName"));

			scriptResponseParameters.add(scriptResponseParameter);
		}
		scriptDetails.setScriptResponseParameters(scriptResponseParameters);
		data.setScriptDetails(scriptDetails);

		WizardDetails wizardDetails = new WizardDetails();
		wizardDetails.setIsPagedResponse(_ctx.booleanValue("GetDataServiceApiResponse.Data.WizardDetails.IsPagedResponse"));

		WizardConnection wizardConnection = new WizardConnection();
		wizardConnection.setConnectionId(_ctx.longValue("GetDataServiceApiResponse.Data.WizardDetails.WizardConnection.ConnectionId"));
		wizardConnection.setTableName(_ctx.stringValue("GetDataServiceApiResponse.Data.WizardDetails.WizardConnection.TableName"));
		wizardDetails.setWizardConnection(wizardConnection);

		List<WizardRequestParameter> wizardRequestParameters = new ArrayList<WizardRequestParameter>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServiceApiResponse.Data.WizardDetails.WizardRequestParameters.Length"); i++) {
			WizardRequestParameter wizardRequestParameter = new WizardRequestParameter();
			wizardRequestParameter.setColumnName(_ctx.stringValue("GetDataServiceApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].ColumnName"));
			wizardRequestParameter.setDefaultValue(_ctx.stringValue("GetDataServiceApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].DefaultValue"));
			wizardRequestParameter.setExampleValue(_ctx.stringValue("GetDataServiceApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].ExampleValue"));
			wizardRequestParameter.setIsRequiredParameter(_ctx.booleanValue("GetDataServiceApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].IsRequiredParameter"));
			wizardRequestParameter.setParameterDataType(_ctx.integerValue("GetDataServiceApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].ParameterDataType"));
			wizardRequestParameter.setParameterDescription(_ctx.stringValue("GetDataServiceApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].ParameterDescription"));
			wizardRequestParameter.setParameterName(_ctx.stringValue("GetDataServiceApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].ParameterName"));
			wizardRequestParameter.setParameterOperator(_ctx.integerValue("GetDataServiceApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].ParameterOperator"));
			wizardRequestParameter.setParameterPosition(_ctx.integerValue("GetDataServiceApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].ParameterPosition"));

			wizardRequestParameters.add(wizardRequestParameter);
		}
		wizardDetails.setWizardRequestParameters(wizardRequestParameters);

		List<WizardResponseParameter> wizardResponseParameters = new ArrayList<WizardResponseParameter>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServiceApiResponse.Data.WizardDetails.WizardResponseParameters.Length"); i++) {
			WizardResponseParameter wizardResponseParameter = new WizardResponseParameter();
			wizardResponseParameter.setColumnName(_ctx.stringValue("GetDataServiceApiResponse.Data.WizardDetails.WizardResponseParameters["+ i +"].ColumnName"));
			wizardResponseParameter.setExampleValue(_ctx.stringValue("GetDataServiceApiResponse.Data.WizardDetails.WizardResponseParameters["+ i +"].ExampleValue"));
			wizardResponseParameter.setParameterDataType(_ctx.integerValue("GetDataServiceApiResponse.Data.WizardDetails.WizardResponseParameters["+ i +"].ParameterDataType"));
			wizardResponseParameter.setParameterDescription(_ctx.stringValue("GetDataServiceApiResponse.Data.WizardDetails.WizardResponseParameters["+ i +"].ParameterDescription"));
			wizardResponseParameter.setParameterName(_ctx.stringValue("GetDataServiceApiResponse.Data.WizardDetails.WizardResponseParameters["+ i +"].ParameterName"));

			wizardResponseParameters.add(wizardResponseParameter);
		}
		wizardDetails.setWizardResponseParameters(wizardResponseParameters);
		data.setWizardDetails(wizardDetails);
		getDataServiceApiResponse.setData(data);
	 
	 	return getDataServiceApiResponse;
	}
}