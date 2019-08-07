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

package com.aliyuncs.webplus.model.v20190320;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.webplus.transform.v20190320.DescribeAppEnvsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAppEnvsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<AppEnv> appEnvs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<AppEnv> getAppEnvs() {
		return this.appEnvs;
	}

	public void setAppEnvs(List<AppEnv> appEnvs) {
		this.appEnvs = appEnvs;
	}

	public static class AppEnv {

		private String envId;

		private String envName;

		private String envDescription;

		private String createUsername;

		private String updateUsername;

		private Long createTime;

		private Long updateTime;

		private String stackId;

		private String stackName;

		private String appName;

		private String appId;

		private Boolean applyingChange;

		private Boolean abortingChange;

		private String envType;

		private String pkgVersionId;

		private String pkgVersionLabel;

		private String envStatus;

		private String lastEnvStatus;

		private String storageBase;

		private String dataRoot;

		private String latestChangeId;

		private String changeBanner;

		private String categoryName;

		private Long totalInstances;

		private String logBase;

		private String pkgVersionStorageKey;

		public String getEnvId() {
			return this.envId;
		}

		public void setEnvId(String envId) {
			this.envId = envId;
		}

		public String getEnvName() {
			return this.envName;
		}

		public void setEnvName(String envName) {
			this.envName = envName;
		}

		public String getEnvDescription() {
			return this.envDescription;
		}

		public void setEnvDescription(String envDescription) {
			this.envDescription = envDescription;
		}

		public String getCreateUsername() {
			return this.createUsername;
		}

		public void setCreateUsername(String createUsername) {
			this.createUsername = createUsername;
		}

		public String getUpdateUsername() {
			return this.updateUsername;
		}

		public void setUpdateUsername(String updateUsername) {
			this.updateUsername = updateUsername;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getStackId() {
			return this.stackId;
		}

		public void setStackId(String stackId) {
			this.stackId = stackId;
		}

		public String getStackName() {
			return this.stackName;
		}

		public void setStackName(String stackName) {
			this.stackName = stackName;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public Boolean getApplyingChange() {
			return this.applyingChange;
		}

		public void setApplyingChange(Boolean applyingChange) {
			this.applyingChange = applyingChange;
		}

		public Boolean getAbortingChange() {
			return this.abortingChange;
		}

		public void setAbortingChange(Boolean abortingChange) {
			this.abortingChange = abortingChange;
		}

		public String getEnvType() {
			return this.envType;
		}

		public void setEnvType(String envType) {
			this.envType = envType;
		}

		public String getPkgVersionId() {
			return this.pkgVersionId;
		}

		public void setPkgVersionId(String pkgVersionId) {
			this.pkgVersionId = pkgVersionId;
		}

		public String getPkgVersionLabel() {
			return this.pkgVersionLabel;
		}

		public void setPkgVersionLabel(String pkgVersionLabel) {
			this.pkgVersionLabel = pkgVersionLabel;
		}

		public String getEnvStatus() {
			return this.envStatus;
		}

		public void setEnvStatus(String envStatus) {
			this.envStatus = envStatus;
		}

		public String getLastEnvStatus() {
			return this.lastEnvStatus;
		}

		public void setLastEnvStatus(String lastEnvStatus) {
			this.lastEnvStatus = lastEnvStatus;
		}

		public String getStorageBase() {
			return this.storageBase;
		}

		public void setStorageBase(String storageBase) {
			this.storageBase = storageBase;
		}

		public String getDataRoot() {
			return this.dataRoot;
		}

		public void setDataRoot(String dataRoot) {
			this.dataRoot = dataRoot;
		}

		public String getLatestChangeId() {
			return this.latestChangeId;
		}

		public void setLatestChangeId(String latestChangeId) {
			this.latestChangeId = latestChangeId;
		}

		public String getChangeBanner() {
			return this.changeBanner;
		}

		public void setChangeBanner(String changeBanner) {
			this.changeBanner = changeBanner;
		}

		public String getCategoryName() {
			return this.categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public Long getTotalInstances() {
			return this.totalInstances;
		}

		public void setTotalInstances(Long totalInstances) {
			this.totalInstances = totalInstances;
		}

		public String getLogBase() {
			return this.logBase;
		}

		public void setLogBase(String logBase) {
			this.logBase = logBase;
		}

		public String getPkgVersionStorageKey() {
			return this.pkgVersionStorageKey;
		}

		public void setPkgVersionStorageKey(String pkgVersionStorageKey) {
			this.pkgVersionStorageKey = pkgVersionStorageKey;
		}
	}

	@Override
	public DescribeAppEnvsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAppEnvsResponseUnmarshaller.unmarshall(this, context);
	}
}
