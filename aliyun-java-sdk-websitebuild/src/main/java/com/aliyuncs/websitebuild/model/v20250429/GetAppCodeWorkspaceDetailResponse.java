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

package com.aliyuncs.websitebuild.model.v20250429;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.websitebuild.transform.v20250429.GetAppCodeWorkspaceDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAppCodeWorkspaceDetailResponse extends AcsResponse {

	private String requestId;

	private String dynamicCode;

	private String dynamicMessage;

	private Boolean synchro;

	private String accessDeniedDetail;

	private String rootErrorMsg;

	private String rootErrorCode;

	private Boolean allowRetry;

	private String appName;

	private List<String> errorArgs;

	private Module module;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public Boolean getSynchro() {
		return this.synchro;
	}

	public void setSynchro(Boolean synchro) {
		this.synchro = synchro;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public String getRootErrorMsg() {
		return this.rootErrorMsg;
	}

	public void setRootErrorMsg(String rootErrorMsg) {
		this.rootErrorMsg = rootErrorMsg;
	}

	public String getRootErrorCode() {
		return this.rootErrorCode;
	}

	public void setRootErrorCode(String rootErrorCode) {
		this.rootErrorCode = rootErrorCode;
	}

	public Boolean getAllowRetry() {
		return this.allowRetry;
	}

	public void setAllowRetry(Boolean allowRetry) {
		this.allowRetry = allowRetry;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public List<String> getErrorArgs() {
		return this.errorArgs;
	}

	public void setErrorArgs(List<String> errorArgs) {
		this.errorArgs = errorArgs;
	}

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public static class Module {

		private String siteId;

		private Integer activeLogicalNumber;

		private Integer maxLogicalNumber;

		private Boolean isDirty;

		private List<Snapshot> snapshots;

		public String getSiteId() {
			return this.siteId;
		}

		public void setSiteId(String siteId) {
			this.siteId = siteId;
		}

		public Integer getActiveLogicalNumber() {
			return this.activeLogicalNumber;
		}

		public void setActiveLogicalNumber(Integer activeLogicalNumber) {
			this.activeLogicalNumber = activeLogicalNumber;
		}

		public Integer getMaxLogicalNumber() {
			return this.maxLogicalNumber;
		}

		public void setMaxLogicalNumber(Integer maxLogicalNumber) {
			this.maxLogicalNumber = maxLogicalNumber;
		}

		public Boolean getIsDirty() {
			return this.isDirty;
		}

		public void setIsDirty(Boolean isDirty) {
			this.isDirty = isDirty;
		}

		public List<Snapshot> getSnapshots() {
			return this.snapshots;
		}

		public void setSnapshots(List<Snapshot> snapshots) {
			this.snapshots = snapshots;
		}

		public static class Snapshot {

			private Integer logicalNumber;

			private String changeLog;

			private String gmtCreateTime;

			public Integer getLogicalNumber() {
				return this.logicalNumber;
			}

			public void setLogicalNumber(Integer logicalNumber) {
				this.logicalNumber = logicalNumber;
			}

			public String getChangeLog() {
				return this.changeLog;
			}

			public void setChangeLog(String changeLog) {
				this.changeLog = changeLog;
			}

			public String getGmtCreateTime() {
				return this.gmtCreateTime;
			}

			public void setGmtCreateTime(String gmtCreateTime) {
				this.gmtCreateTime = gmtCreateTime;
			}
		}
	}

	@Override
	public GetAppCodeWorkspaceDetailResponse getInstance(UnmarshallerContext context) {
		return	GetAppCodeWorkspaceDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
