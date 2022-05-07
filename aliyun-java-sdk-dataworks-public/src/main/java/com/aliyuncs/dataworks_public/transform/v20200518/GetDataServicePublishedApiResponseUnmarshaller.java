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

import com.aliyuncs.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.RegistrationDetails;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationErrorCode;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationRequestParameter;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.ScriptDetails;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptConnection;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptErrorCode;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptRequestParameter;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptResponseParameter;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.WizardDetails;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.WizardDetails.WizardConnection;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.WizardDetails.WizardErrorCode;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.WizardDetails.WizardRequestParameter;
import com.aliyuncs.dataworks_public.model.v20200518.GetDataServicePublishedApiResponse.Data.WizardDetails.WizardResponseParameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataServicePublishedApiResponseUnmarshaller {

	public static GetDataServicePublishedApiResponse unmarshall(GetDataServicePublishedApiResponse getDataServicePublishedApiResponse, UnmarshallerContext _ctx) {
		
		getDataServicePublishedApiResponse.setRequestId(_ctx.stringValue("GetDataServicePublishedApiResponse.RequestId"));
		getDataServicePublishedApiResponse.setHttpStatusCode(_ctx.integerValue("GetDataServicePublishedApiResponse.HttpStatusCode"));
		getDataServicePublishedApiResponse.setErrorMessage(_ctx.stringValue("GetDataServicePublishedApiResponse.ErrorMessage"));
		getDataServicePublishedApiResponse.setSuccess(_ctx.booleanValue("GetDataServicePublishedApiResponse.Success"));
		getDataServicePublishedApiResponse.setErrorCode(_ctx.stringValue("GetDataServicePublishedApiResponse.ErrorCode"));

		Data data = new Data();
		data.setTimeout(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.Timeout"));
		data.setStatus(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.Status"));
		data.setApiId(_ctx.longValue("GetDataServicePublishedApiResponse.Data.ApiId"));
		data.setApiMode(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.ApiMode"));
		data.setProjectId(_ctx.longValue("GetDataServicePublishedApiResponse.Data.ProjectId"));
		data.setResponseContentType(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.ResponseContentType"));
		data.setCreatorId(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.CreatorId"));
		data.setVisibleRange(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.VisibleRange"));
		data.setModifiedTime(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ModifiedTime"));
		data.setOperatorId(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.OperatorId"));
		data.setGroupId(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.GroupId"));
		data.setDescription(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.Description"));
		data.setRequestMethod(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.RequestMethod"));
		data.setCreatedTime(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.CreatedTime"));
		data.setApiName(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ApiName"));
		data.setTenantId(_ctx.longValue("GetDataServicePublishedApiResponse.Data.TenantId"));
		data.setApiPath(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ApiPath"));

		List<Integer> protocols = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServicePublishedApiResponse.Data.Protocols.Length"); i++) {
			protocols.add(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.Protocols["+ i +"]"));
		}
		data.setProtocols(protocols);

		RegistrationDetails registrationDetails = new RegistrationDetails();
		registrationDetails.setServiceHost(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.ServiceHost"));
		registrationDetails.setServiceContentType(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.ServiceContentType"));
		registrationDetails.setServicePath(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.ServicePath"));
		registrationDetails.setSuccessfulResultSample(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.SuccessfulResultSample"));
		registrationDetails.setFailedResultSample(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.FailedResultSample"));
		registrationDetails.setServiceRequestBodyDescription(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.ServiceRequestBodyDescription"));

		List<RegistrationErrorCode> registrationErrorCodes = new ArrayList<RegistrationErrorCode>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationErrorCodes.Length"); i++) {
			RegistrationErrorCode registrationErrorCode = new RegistrationErrorCode();
			registrationErrorCode.setErrorMessage(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationErrorCodes["+ i +"].ErrorMessage"));
			registrationErrorCode.setErrorCode(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationErrorCodes["+ i +"].ErrorCode"));
			registrationErrorCode.setErrorSolution(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationErrorCodes["+ i +"].ErrorSolution"));

			registrationErrorCodes.add(registrationErrorCode);
		}
		registrationDetails.setRegistrationErrorCodes(registrationErrorCodes);

		List<RegistrationRequestParameter> registrationRequestParameters = new ArrayList<RegistrationRequestParameter>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationRequestParameters.Length"); i++) {
			RegistrationRequestParameter registrationRequestParameter = new RegistrationRequestParameter();
			registrationRequestParameter.setParameterName(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].ParameterName"));
			registrationRequestParameter.setParameterPosition(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].ParameterPosition"));
			registrationRequestParameter.setParameterDescription(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].ParameterDescription"));
			registrationRequestParameter.setDefaultValue(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].DefaultValue"));
			registrationRequestParameter.setParameterOperator(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].ParameterOperator"));
			registrationRequestParameter.setExampleValue(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].ExampleValue"));
			registrationRequestParameter.setParameterDataType(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].ParameterDataType"));
			registrationRequestParameter.setIsRequiredParameter(_ctx.booleanValue("GetDataServicePublishedApiResponse.Data.RegistrationDetails.RegistrationRequestParameters["+ i +"].IsRequiredParameter"));

			registrationRequestParameters.add(registrationRequestParameter);
		}
		registrationDetails.setRegistrationRequestParameters(registrationRequestParameters);
		data.setRegistrationDetails(registrationDetails);

		ScriptDetails scriptDetails = new ScriptDetails();
		scriptDetails.setIsPagedResponse(_ctx.booleanValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.IsPagedResponse"));
		scriptDetails.setSuccessfulResultSample(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.SuccessfulResultSample"));
		scriptDetails.setFailedResultSample(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.FailedResultSample"));
		scriptDetails.setScript(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.Script"));

		ScriptConnection scriptConnection = new ScriptConnection();
		scriptConnection.setTableName(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptConnection.TableName"));
		scriptConnection.setConnectionId(_ctx.longValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptConnection.ConnectionId"));
		scriptDetails.setScriptConnection(scriptConnection);

		List<ScriptErrorCode> scriptErrorCodes = new ArrayList<ScriptErrorCode>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptErrorCodes.Length"); i++) {
			ScriptErrorCode scriptErrorCode = new ScriptErrorCode();
			scriptErrorCode.setErrorMessage(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptErrorCodes["+ i +"].ErrorMessage"));
			scriptErrorCode.setErrorCode(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptErrorCodes["+ i +"].ErrorCode"));
			scriptErrorCode.setErrorSolution(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptErrorCodes["+ i +"].ErrorSolution"));

			scriptErrorCodes.add(scriptErrorCode);
		}
		scriptDetails.setScriptErrorCodes(scriptErrorCodes);

		List<ScriptRequestParameter> scriptRequestParameters = new ArrayList<ScriptRequestParameter>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptRequestParameters.Length"); i++) {
			ScriptRequestParameter scriptRequestParameter = new ScriptRequestParameter();
			scriptRequestParameter.setParameterName(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].ParameterName"));
			scriptRequestParameter.setParameterPosition(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].ParameterPosition"));
			scriptRequestParameter.setParameterDescription(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].ParameterDescription"));
			scriptRequestParameter.setDefaultValue(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].DefaultValue"));
			scriptRequestParameter.setParameterOperator(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].ParameterOperator"));
			scriptRequestParameter.setExampleValue(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].ExampleValue"));
			scriptRequestParameter.setParameterDataType(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].ParameterDataType"));
			scriptRequestParameter.setIsRequiredParameter(_ctx.booleanValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptRequestParameters["+ i +"].IsRequiredParameter"));

			scriptRequestParameters.add(scriptRequestParameter);
		}
		scriptDetails.setScriptRequestParameters(scriptRequestParameters);

		List<ScriptResponseParameter> scriptResponseParameters = new ArrayList<ScriptResponseParameter>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptResponseParameters.Length"); i++) {
			ScriptResponseParameter scriptResponseParameter = new ScriptResponseParameter();
			scriptResponseParameter.setParameterDescription(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptResponseParameters["+ i +"].ParameterDescription"));
			scriptResponseParameter.setParameterName(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptResponseParameters["+ i +"].ParameterName"));
			scriptResponseParameter.setExampleValue(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptResponseParameters["+ i +"].ExampleValue"));
			scriptResponseParameter.setParameterDataType(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.ScriptDetails.ScriptResponseParameters["+ i +"].ParameterDataType"));

			scriptResponseParameters.add(scriptResponseParameter);
		}
		scriptDetails.setScriptResponseParameters(scriptResponseParameters);
		data.setScriptDetails(scriptDetails);

		WizardDetails wizardDetails = new WizardDetails();
		wizardDetails.setIsPagedResponse(_ctx.booleanValue("GetDataServicePublishedApiResponse.Data.WizardDetails.IsPagedResponse"));
		wizardDetails.setSuccessfulResultSample(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.SuccessfulResultSample"));
		wizardDetails.setFailedResultSample(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.FailedResultSample"));

		WizardConnection wizardConnection = new WizardConnection();
		wizardConnection.setTableName(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardConnection.TableName"));
		wizardConnection.setConnectionId(_ctx.longValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardConnection.ConnectionId"));
		wizardDetails.setWizardConnection(wizardConnection);

		List<WizardErrorCode> wizardErrorCodes = new ArrayList<WizardErrorCode>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardErrorCodes.Length"); i++) {
			WizardErrorCode wizardErrorCode = new WizardErrorCode();
			wizardErrorCode.setErrorMessage(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardErrorCodes["+ i +"].ErrorMessage"));
			wizardErrorCode.setErrorCode(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardErrorCodes["+ i +"].ErrorCode"));
			wizardErrorCode.setErrorSolution(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardErrorCodes["+ i +"].ErrorSolution"));

			wizardErrorCodes.add(wizardErrorCode);
		}
		wizardDetails.setWizardErrorCodes(wizardErrorCodes);

		List<WizardRequestParameter> wizardRequestParameters = new ArrayList<WizardRequestParameter>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardRequestParameters.Length"); i++) {
			WizardRequestParameter wizardRequestParameter = new WizardRequestParameter();
			wizardRequestParameter.setParameterName(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].ParameterName"));
			wizardRequestParameter.setParameterPosition(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].ParameterPosition"));
			wizardRequestParameter.setParameterDescription(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].ParameterDescription"));
			wizardRequestParameter.setDefaultValue(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].DefaultValue"));
			wizardRequestParameter.setParameterOperator(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].ParameterOperator"));
			wizardRequestParameter.setExampleValue(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].ExampleValue"));
			wizardRequestParameter.setParameterDataType(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].ParameterDataType"));
			wizardRequestParameter.setIsRequiredParameter(_ctx.booleanValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardRequestParameters["+ i +"].IsRequiredParameter"));

			wizardRequestParameters.add(wizardRequestParameter);
		}
		wizardDetails.setWizardRequestParameters(wizardRequestParameters);

		List<WizardResponseParameter> wizardResponseParameters = new ArrayList<WizardResponseParameter>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardResponseParameters.Length"); i++) {
			WizardResponseParameter wizardResponseParameter = new WizardResponseParameter();
			wizardResponseParameter.setParameterDescription(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardResponseParameters["+ i +"].ParameterDescription"));
			wizardResponseParameter.setParameterName(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardResponseParameters["+ i +"].ParameterName"));
			wizardResponseParameter.setExampleValue(_ctx.stringValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardResponseParameters["+ i +"].ExampleValue"));
			wizardResponseParameter.setParameterDataType(_ctx.integerValue("GetDataServicePublishedApiResponse.Data.WizardDetails.WizardResponseParameters["+ i +"].ParameterDataType"));

			wizardResponseParameters.add(wizardResponseParameter);
		}
		wizardDetails.setWizardResponseParameters(wizardResponseParameters);
		data.setWizardDetails(wizardDetails);
		getDataServicePublishedApiResponse.setData(data);
	 
	 	return getDataServicePublishedApiResponse;
	}
}