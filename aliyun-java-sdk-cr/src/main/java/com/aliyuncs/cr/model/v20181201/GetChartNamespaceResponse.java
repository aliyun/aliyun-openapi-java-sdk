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

package com.aliyuncs.cr.model.v20181201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20181201.GetChartNamespaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetChartNamespaceResponse extends AcsResponse {

	private Boolean isSuccess;

	private String code;

	private String requestId;

	private String namespaceName;

	private String namespaceStatus;

	private Boolean autoCreateRepo;

	private String defaultRepoType;

	private String instanceId;

	private String namespaceId;

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNamespaceName() {
		return this.namespaceName;
	}

	public void setNamespaceName(String namespaceName) {
		this.namespaceName = namespaceName;
	}

	public String getNamespaceStatus() {
		return this.namespaceStatus;
	}

	public void setNamespaceStatus(String namespaceStatus) {
		this.namespaceStatus = namespaceStatus;
	}

	public Boolean getAutoCreateRepo() {
		return this.autoCreateRepo;
	}

	public void setAutoCreateRepo(Boolean autoCreateRepo) {
		this.autoCreateRepo = autoCreateRepo;
	}

	public String getDefaultRepoType() {
		return this.defaultRepoType;
	}

	public void setDefaultRepoType(String defaultRepoType) {
		this.defaultRepoType = defaultRepoType;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getNamespaceId() {
		return this.namespaceId;
	}

	public void setNamespaceId(String namespaceId) {
		this.namespaceId = namespaceId;
	}

	@Override
	public GetChartNamespaceResponse getInstance(UnmarshallerContext context) {
		return	GetChartNamespaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
