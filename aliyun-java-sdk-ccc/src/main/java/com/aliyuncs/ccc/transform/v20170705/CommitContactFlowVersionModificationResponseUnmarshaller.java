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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.CommitContactFlowVersionModificationResponse;
import com.aliyuncs.ccc.model.v20170705.CommitContactFlowVersionModificationResponse.ContactFlowVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class CommitContactFlowVersionModificationResponseUnmarshaller {

	public static CommitContactFlowVersionModificationResponse unmarshall(CommitContactFlowVersionModificationResponse commitContactFlowVersionModificationResponse, UnmarshallerContext context) {
		
		commitContactFlowVersionModificationResponse.setRequestId(context.stringValue("CommitContactFlowVersionModificationResponse.RequestId"));
		commitContactFlowVersionModificationResponse.setSuccess(context.booleanValue("CommitContactFlowVersionModificationResponse.Success"));
		commitContactFlowVersionModificationResponse.setCode(context.stringValue("CommitContactFlowVersionModificationResponse.Code"));
		commitContactFlowVersionModificationResponse.setMessage(context.stringValue("CommitContactFlowVersionModificationResponse.Message"));
		commitContactFlowVersionModificationResponse.setHttpStatusCode(context.integerValue("CommitContactFlowVersionModificationResponse.HttpStatusCode"));

		ContactFlowVersion contactFlowVersion = new ContactFlowVersion();
		contactFlowVersion.setContactFlowVersionId(context.stringValue("CommitContactFlowVersionModificationResponse.ContactFlowVersion.ContactFlowVersionId"));
		contactFlowVersion.setVersion(context.stringValue("CommitContactFlowVersionModificationResponse.ContactFlowVersion.Version"));
		contactFlowVersion.setContactFlowVersionDescription(context.stringValue("CommitContactFlowVersionModificationResponse.ContactFlowVersion.ContactFlowVersionDescription"));
		contactFlowVersion.setCanvas(context.stringValue("CommitContactFlowVersionModificationResponse.ContactFlowVersion.Canvas"));
		contactFlowVersion.setContent(context.stringValue("CommitContactFlowVersionModificationResponse.ContactFlowVersion.Content"));
		contactFlowVersion.setLastModified(context.stringValue("CommitContactFlowVersionModificationResponse.ContactFlowVersion.LastModified"));
		contactFlowVersion.setLastModifiedBy(context.stringValue("CommitContactFlowVersionModificationResponse.ContactFlowVersion.LastModifiedBy"));
		contactFlowVersion.setLockedBy(context.stringValue("CommitContactFlowVersionModificationResponse.ContactFlowVersion.LockedBy"));
		contactFlowVersion.setStatus(context.stringValue("CommitContactFlowVersionModificationResponse.ContactFlowVersion.Status"));
		commitContactFlowVersionModificationResponse.setContactFlowVersion(contactFlowVersion);
	 
	 	return commitContactFlowVersionModificationResponse;
	}
}