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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetNavigatorContactFlowResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetNavigatorContactFlowResponse.ContactFlow;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetNavigatorContactFlowResponse.ContactFlow.ContactFlowVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNavigatorContactFlowResponseUnmarshaller {

	public static GetNavigatorContactFlowResponse unmarshall(GetNavigatorContactFlowResponse getNavigatorContactFlowResponse, UnmarshallerContext context) {
		
		getNavigatorContactFlowResponse.setRequestId(context.stringValue("GetNavigatorContactFlowResponse.RequestId"));
		getNavigatorContactFlowResponse.setSuccess(context.booleanValue("GetNavigatorContactFlowResponse.Success"));
		getNavigatorContactFlowResponse.setCode(context.stringValue("GetNavigatorContactFlowResponse.Code"));
		getNavigatorContactFlowResponse.setMessage(context.stringValue("GetNavigatorContactFlowResponse.Message"));
		getNavigatorContactFlowResponse.setHttpStatusCode(context.integerValue("GetNavigatorContactFlowResponse.HttpStatusCode"));

		ContactFlow contactFlow = new ContactFlow();
		contactFlow.setContactFlowId(context.stringValue("GetNavigatorContactFlowResponse.ContactFlow.ContactFlowId"));
		contactFlow.setInstanceId(context.stringValue("GetNavigatorContactFlowResponse.ContactFlow.InstanceId"));
		contactFlow.setContactFlowName(context.stringValue("GetNavigatorContactFlowResponse.ContactFlow.ContactFlowName"));
		contactFlow.setContactFlowDescription(context.stringValue("GetNavigatorContactFlowResponse.ContactFlow.ContactFlowDescription"));
		contactFlow.setType(context.stringValue("GetNavigatorContactFlowResponse.ContactFlow.Type"));

		List<ContactFlowVersion> versions = new ArrayList<ContactFlowVersion>();
		for (int i = 0; i < context.lengthValue("GetNavigatorContactFlowResponse.ContactFlow.Versions.Length"); i++) {
			ContactFlowVersion contactFlowVersion = new ContactFlowVersion();
			contactFlowVersion.setContactFlowVersionId(context.stringValue("GetNavigatorContactFlowResponse.ContactFlow.Versions["+ i +"].ContactFlowVersionId"));
			contactFlowVersion.setVersion(context.stringValue("GetNavigatorContactFlowResponse.ContactFlow.Versions["+ i +"].Version"));
			contactFlowVersion.setContactFlowVersionDescription(context.stringValue("GetNavigatorContactFlowResponse.ContactFlow.Versions["+ i +"].ContactFlowVersionDescription"));
			contactFlowVersion.setCanvas(context.stringValue("GetNavigatorContactFlowResponse.ContactFlow.Versions["+ i +"].Canvas"));
			contactFlowVersion.setContent(context.stringValue("GetNavigatorContactFlowResponse.ContactFlow.Versions["+ i +"].Content"));
			contactFlowVersion.setLastModified(context.stringValue("GetNavigatorContactFlowResponse.ContactFlow.Versions["+ i +"].LastModified"));
			contactFlowVersion.setLastModifiedBy(context.stringValue("GetNavigatorContactFlowResponse.ContactFlow.Versions["+ i +"].LastModifiedBy"));
			contactFlowVersion.setStatus(context.stringValue("GetNavigatorContactFlowResponse.ContactFlow.Versions["+ i +"].Status"));

			versions.add(contactFlowVersion);
		}
		contactFlow.setVersions(versions);
		getNavigatorContactFlowResponse.setContactFlow(contactFlow);
	 
	 	return getNavigatorContactFlowResponse;
	}
}