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
import com.aliyuncs.cr.transform.v20181201.GetRepoSourceCodeRepoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRepoSourceCodeRepoResponse extends AcsResponse {

	private String codeRepoType;

	private String repoId;

	private String requestId;

	private String codeRepoNamespaceName;

	private String overseaBuild;

	private String code;

	private String codeRepoName;

	private String autoBuild;

	private Boolean isSuccess;

	private String disableCacheBuild;

	private String codeRepoDomain;

	public String getCodeRepoType() {
		return this.codeRepoType;
	}

	public void setCodeRepoType(String codeRepoType) {
		this.codeRepoType = codeRepoType;
	}

	public String getRepoId() {
		return this.repoId;
	}

	public void setRepoId(String repoId) {
		this.repoId = repoId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCodeRepoNamespaceName() {
		return this.codeRepoNamespaceName;
	}

	public void setCodeRepoNamespaceName(String codeRepoNamespaceName) {
		this.codeRepoNamespaceName = codeRepoNamespaceName;
	}

	public String getOverseaBuild() {
		return this.overseaBuild;
	}

	public void setOverseaBuild(String overseaBuild) {
		this.overseaBuild = overseaBuild;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeRepoName() {
		return this.codeRepoName;
	}

	public void setCodeRepoName(String codeRepoName) {
		this.codeRepoName = codeRepoName;
	}

	public String getAutoBuild() {
		return this.autoBuild;
	}

	public void setAutoBuild(String autoBuild) {
		this.autoBuild = autoBuild;
	}

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getDisableCacheBuild() {
		return this.disableCacheBuild;
	}

	public void setDisableCacheBuild(String disableCacheBuild) {
		this.disableCacheBuild = disableCacheBuild;
	}

	public String getCodeRepoDomain() {
		return this.codeRepoDomain;
	}

	public void setCodeRepoDomain(String codeRepoDomain) {
		this.codeRepoDomain = codeRepoDomain;
	}

	@Override
	public GetRepoSourceCodeRepoResponse getInstance(UnmarshallerContext context) {
		return	GetRepoSourceCodeRepoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
