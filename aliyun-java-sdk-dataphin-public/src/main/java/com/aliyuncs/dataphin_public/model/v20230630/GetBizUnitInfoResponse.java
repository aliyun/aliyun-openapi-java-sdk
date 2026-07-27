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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetBizUnitInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBizUnitInfoResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private BizUnitInfo bizUnitInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public BizUnitInfo getBizUnitInfo() {
		return this.bizUnitInfo;
	}

	public void setBizUnitInfo(BizUnitInfo bizUnitInfo) {
		this.bizUnitInfo = bizUnitInfo;
	}

	public static class BizUnitInfo {

		private String ownerName;

		private String lastModifier;

		private String description;

		private String mode;

		private String gmtModified;

		private Integer bizObjectCount;

		private String lastModifierName;

		private String name;

		private String ownerUserId;

		private String gmtCreate;

		private Integer dataDomainCount;

		private String displayName;

		private Integer bizProcessCount;

		private Long id;

		private String icon;

		private List<EnvName> envList;

		private List<User> accountList;

		private List<User> businessLeaderList;

		private List<User> dataLeaderList;

		public String getOwnerName() {
			return this.ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		public String getLastModifier() {
			return this.lastModifier;
		}

		public void setLastModifier(String lastModifier) {
			this.lastModifier = lastModifier;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Integer getBizObjectCount() {
			return this.bizObjectCount;
		}

		public void setBizObjectCount(Integer bizObjectCount) {
			this.bizObjectCount = bizObjectCount;
		}

		public String getLastModifierName() {
			return this.lastModifierName;
		}

		public void setLastModifierName(String lastModifierName) {
			this.lastModifierName = lastModifierName;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOwnerUserId() {
			return this.ownerUserId;
		}

		public void setOwnerUserId(String ownerUserId) {
			this.ownerUserId = ownerUserId;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Integer getDataDomainCount() {
			return this.dataDomainCount;
		}

		public void setDataDomainCount(Integer dataDomainCount) {
			this.dataDomainCount = dataDomainCount;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public Integer getBizProcessCount() {
			return this.bizProcessCount;
		}

		public void setBizProcessCount(Integer bizProcessCount) {
			this.bizProcessCount = bizProcessCount;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getIcon() {
			return this.icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

		public List<EnvName> getEnvList() {
			return this.envList;
		}

		public void setEnvList(List<EnvName> envList) {
			this.envList = envList;
		}

		public List<User> getAccountList() {
			return this.accountList;
		}

		public void setAccountList(List<User> accountList) {
			this.accountList = accountList;
		}

		public List<User> getBusinessLeaderList() {
			return this.businessLeaderList;
		}

		public void setBusinessLeaderList(List<User> businessLeaderList) {
			this.businessLeaderList = businessLeaderList;
		}

		public List<User> getDataLeaderList() {
			return this.dataLeaderList;
		}

		public void setDataLeaderList(List<User> dataLeaderList) {
			this.dataLeaderList = dataLeaderList;
		}

		public static class EnvName {

			private String displayName;

			private String envName;

			private String name;

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getEnvName() {
				return this.envName;
			}

			public void setEnvName(String envName) {
				this.envName = envName;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class User {

			private String id;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}
	}

	@Override
	public GetBizUnitInfoResponse getInstance(UnmarshallerContext context) {
		return	GetBizUnitInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
