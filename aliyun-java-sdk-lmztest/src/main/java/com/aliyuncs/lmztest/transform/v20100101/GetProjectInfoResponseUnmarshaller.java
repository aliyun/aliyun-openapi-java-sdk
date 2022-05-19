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

package com.aliyuncs.lmztest.transform.v20100101;

import com.aliyuncs.lmztest.model.v20100101.GetProjectInfoResponse;
import com.aliyuncs.lmztest.model.v20100101.GetProjectInfoResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectInfoResponseUnmarshaller {

	public static GetProjectInfoResponse unmarshall(GetProjectInfoResponse getProjectInfoResponse, UnmarshallerContext _ctx) {
		
		getProjectInfoResponse.setRequestId(_ctx.stringValue("GetProjectInfoResponse.requestId"));
		getProjectInfoResponse.setErrorCode(_ctx.stringValue("GetProjectInfoResponse.errorCode"));
		getProjectInfoResponse.setErrorMessage(_ctx.stringValue("GetProjectInfoResponse.errorMessage"));
		getProjectInfoResponse.setSuccess(_ctx.booleanValue("GetProjectInfoResponse.success"));

		Result result = new Result();
		result.setCategory(_ctx.stringValue("GetProjectInfoResponse.result.category"));
		result.setCategoryIdentifier(_ctx.stringValue("GetProjectInfoResponse.result.categoryIdentifier"));
		result.setCreator(_ctx.stringValue("GetProjectInfoResponse.result.creator"));
		result.setCustomCode(_ctx.stringValue("GetProjectInfoResponse.result.customCode"));
		result.setDescription(_ctx.stringValue("GetProjectInfoResponse.result.description"));
		result.setGmtCreate(_ctx.longValue("GetProjectInfoResponse.result.gmtCreate"));
		result.setGmtModified(_ctx.longValue("GetProjectInfoResponse.result.gmtModified"));
		result.setIconGroup(_ctx.stringValue("GetProjectInfoResponse.result.iconGroup"));
		result.setIcon(_ctx.stringValue("GetProjectInfoResponse.result.icon"));
		result.setIconBig(_ctx.stringValue("GetProjectInfoResponse.result.iconBig"));
		result.setIconSmall(_ctx.stringValue("GetProjectInfoResponse.result.iconSmall"));
		result.setId(_ctx.stringValue("GetProjectInfoResponse.result.id"));
		result.setIdentifier(_ctx.stringValue("GetProjectInfoResponse.result.identifier"));
		result.setIdentifierPath(_ctx.stringValue("GetProjectInfoResponse.result.identifierPath"));
		result.setLogicalStatus(_ctx.stringValue("GetProjectInfoResponse.result.logicalStatus"));
		result.setModifier(_ctx.stringValue("GetProjectInfoResponse.result.modifier"));
		result.setName(_ctx.stringValue("GetProjectInfoResponse.result.name"));
		result.setOrganizationIdentifier(_ctx.stringValue("GetProjectInfoResponse.result.organizationIdentifier"));
		result.setParentIdentifier(_ctx.stringValue("GetProjectInfoResponse.result.parentIdentifier"));
		result.setScope(_ctx.stringValue("GetProjectInfoResponse.result.scope"));
		result.setStatusIdentifier(_ctx.stringValue("GetProjectInfoResponse.result.statusIdentifier"));
		result.setStatusStageIdentifier(_ctx.stringValue("GetProjectInfoResponse.result.statusStageIdentifier"));
		result.setSubType(_ctx.stringValue("GetProjectInfoResponse.result.subType"));
		result.setTypeIdentifier(_ctx.stringValue("GetProjectInfoResponse.result.typeIdentifier"));
		getProjectInfoResponse.setResult(result);
	 
	 	return getProjectInfoResponse;
	}
}