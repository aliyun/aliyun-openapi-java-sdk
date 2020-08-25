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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryLinkeantcodeAntcodeProjectsidResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkeantcodeAntcodeProjectsidResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String description;

	private String httpUrlToRepo;

	private Long id;

	private String lastActivityAt;

	private String name;

	private String nameWithNamespace;

	private String path;

	private String pathWithNamespace;

	private String repositorySize;

	private Long responseStatusCode;

	private String sshUrlToRepo;

	private Long visibilityLevel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHttpUrlToRepo() {
		return this.httpUrlToRepo;
	}

	public void setHttpUrlToRepo(String httpUrlToRepo) {
		this.httpUrlToRepo = httpUrlToRepo;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLastActivityAt() {
		return this.lastActivityAt;
	}

	public void setLastActivityAt(String lastActivityAt) {
		this.lastActivityAt = lastActivityAt;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameWithNamespace() {
		return this.nameWithNamespace;
	}

	public void setNameWithNamespace(String nameWithNamespace) {
		this.nameWithNamespace = nameWithNamespace;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPathWithNamespace() {
		return this.pathWithNamespace;
	}

	public void setPathWithNamespace(String pathWithNamespace) {
		this.pathWithNamespace = pathWithNamespace;
	}

	public String getRepositorySize() {
		return this.repositorySize;
	}

	public void setRepositorySize(String repositorySize) {
		this.repositorySize = repositorySize;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public String getSshUrlToRepo() {
		return this.sshUrlToRepo;
	}

	public void setSshUrlToRepo(String sshUrlToRepo) {
		this.sshUrlToRepo = sshUrlToRepo;
	}

	public Long getVisibilityLevel() {
		return this.visibilityLevel;
	}

	public void setVisibilityLevel(Long visibilityLevel) {
		this.visibilityLevel = visibilityLevel;
	}

	@Override
	public QueryLinkeantcodeAntcodeProjectsidResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkeantcodeAntcodeProjectsidResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
