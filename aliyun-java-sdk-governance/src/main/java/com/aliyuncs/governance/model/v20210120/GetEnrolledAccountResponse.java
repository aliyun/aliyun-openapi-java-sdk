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

package com.aliyuncs.governance.model.v20210120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.governance.transform.v20210120.GetEnrolledAccountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetEnrolledAccountResponse extends AcsResponse {

	private Long accountUid;

	private String baselineId;

	private String createTime;

	private String displayName;

	private String folderId;

	private Boolean initialized;

	private Long masterAccountUid;

	private Long payerAccountUid;

	private String requestId;

	private String status;

	private String updateTime;

	private List<BaselineItem> baselineItems;

	private List<Progres> progress;

	private ErrorInfo errorInfo;

	private Inputs inputs;

	public Long getAccountUid() {
		return this.accountUid;
	}

	public void setAccountUid(Long accountUid) {
		this.accountUid = accountUid;
	}

	public String getBaselineId() {
		return this.baselineId;
	}

	public void setBaselineId(String baselineId) {
		this.baselineId = baselineId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getFolderId() {
		return this.folderId;
	}

	public void setFolderId(String folderId) {
		this.folderId = folderId;
	}

	public Boolean getInitialized() {
		return this.initialized;
	}

	public void setInitialized(Boolean initialized) {
		this.initialized = initialized;
	}

	public Long getMasterAccountUid() {
		return this.masterAccountUid;
	}

	public void setMasterAccountUid(Long masterAccountUid) {
		this.masterAccountUid = masterAccountUid;
	}

	public Long getPayerAccountUid() {
		return this.payerAccountUid;
	}

	public void setPayerAccountUid(Long payerAccountUid) {
		this.payerAccountUid = payerAccountUid;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public List<BaselineItem> getBaselineItems() {
		return this.baselineItems;
	}

	public void setBaselineItems(List<BaselineItem> baselineItems) {
		this.baselineItems = baselineItems;
	}

	public List<Progres> getProgress() {
		return this.progress;
	}

	public void setProgress(List<Progres> progress) {
		this.progress = progress;
	}

	public ErrorInfo getErrorInfo() {
		return this.errorInfo;
	}

	public void setErrorInfo(ErrorInfo errorInfo) {
		this.errorInfo = errorInfo;
	}

	public Inputs getInputs() {
		return this.inputs;
	}

	public void setInputs(Inputs inputs) {
		this.inputs = inputs;
	}

	public static class BaselineItem {

		private String config;

		private String name;

		private Boolean skip;

		private String version;

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getSkip() {
			return this.skip;
		}

		public void setSkip(Boolean skip) {
			this.skip = skip;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}
	}

	public static class Progres {

		private String name;

		private String status;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	public static class ErrorInfo {

		private String code;

		private String message;

		private String recommend;

		private String requestId;

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

		public String getRecommend() {
			return this.recommend;
		}

		public void setRecommend(String recommend) {
			this.recommend = recommend;
		}

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}
	}

	public static class Inputs {

		private String accountNamePrefix;

		private Long accountUid;

		private String displayName;

		private String folderId;

		private Long payerAccountUid;

		private List<BaselineItem2> baselineItems1;

		public String getAccountNamePrefix() {
			return this.accountNamePrefix;
		}

		public void setAccountNamePrefix(String accountNamePrefix) {
			this.accountNamePrefix = accountNamePrefix;
		}

		public Long getAccountUid() {
			return this.accountUid;
		}

		public void setAccountUid(Long accountUid) {
			this.accountUid = accountUid;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getFolderId() {
			return this.folderId;
		}

		public void setFolderId(String folderId) {
			this.folderId = folderId;
		}

		public Long getPayerAccountUid() {
			return this.payerAccountUid;
		}

		public void setPayerAccountUid(Long payerAccountUid) {
			this.payerAccountUid = payerAccountUid;
		}

		public List<BaselineItem2> getBaselineItems1() {
			return this.baselineItems1;
		}

		public void setBaselineItems1(List<BaselineItem2> baselineItems1) {
			this.baselineItems1 = baselineItems1;
		}

		public static class BaselineItem2 {

			private String config;

			private String name;

			private Boolean skip;

			private String version;

			public String getConfig() {
				return this.config;
			}

			public void setConfig(String config) {
				this.config = config;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Boolean getSkip() {
				return this.skip;
			}

			public void setSkip(Boolean skip) {
				this.skip = skip;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}
		}
	}

	@Override
	public GetEnrolledAccountResponse getInstance(UnmarshallerContext context) {
		return	GetEnrolledAccountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
