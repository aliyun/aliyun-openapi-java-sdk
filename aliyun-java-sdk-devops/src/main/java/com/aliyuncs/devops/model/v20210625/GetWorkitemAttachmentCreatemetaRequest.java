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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetWorkitemAttachmentCreatemetaRequest extends RoaAcsRequest<GetWorkitemAttachmentCreatemetaResponse> {
	   

	private String organizationId;

	private String fileName;

	private String workitemIdentifier;
	public GetWorkitemAttachmentCreatemetaRequest() {
		super("devops", "2021-06-25", "GetWorkitemAttachmentCreatemeta");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/organization/[organizationId]/workitem/[workitemIdentifier]/attachment/createmeta");
		setMethod(MethodType.GET);
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putPathParameter("organizationId", organizationId);
		}
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		if(fileName != null){
			putQueryParameter("fileName", fileName);
		}
	}

	public String getWorkitemIdentifier() {
		return this.workitemIdentifier;
	}

	public void setWorkitemIdentifier(String workitemIdentifier) {
		this.workitemIdentifier = workitemIdentifier;
		if(workitemIdentifier != null){
			putPathParameter("workitemIdentifier", workitemIdentifier);
		}
	}

	@Override
	public Class<GetWorkitemAttachmentCreatemetaResponse> getResponseClass() {
		return GetWorkitemAttachmentCreatemetaResponse.class;
	}

}
