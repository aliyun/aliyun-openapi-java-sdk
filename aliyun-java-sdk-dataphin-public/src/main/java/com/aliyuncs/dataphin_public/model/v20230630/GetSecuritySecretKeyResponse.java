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
import com.aliyuncs.dataphin_public.transform.v20230630.GetSecuritySecretKeyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSecuritySecretKeyResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private SecuritySecretKeyInfo securitySecretKeyInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public SecuritySecretKeyInfo getSecuritySecretKeyInfo() {
		return this.securitySecretKeyInfo;
	}

	public void setSecuritySecretKeyInfo(SecuritySecretKeyInfo securitySecretKeyInfo) {
		this.securitySecretKeyInfo = securitySecretKeyInfo;
	}

	public static class SecuritySecretKeyInfo {

		private Long id;

		private String name;

		private String description;

		private String type;

		private String algorithmType;

		private String generationType;

		private Long subKeyCount;

		private Boolean isOwnerManageOnly;

		private Boolean enableOpenapiQuery;

		private String algorithmTypeAlias;

		private String owner;

		private String ownerName;

		private List<String> secretKeyList;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getAlgorithmType() {
			return this.algorithmType;
		}

		public void setAlgorithmType(String algorithmType) {
			this.algorithmType = algorithmType;
		}

		public String getGenerationType() {
			return this.generationType;
		}

		public void setGenerationType(String generationType) {
			this.generationType = generationType;
		}

		public Long getSubKeyCount() {
			return this.subKeyCount;
		}

		public void setSubKeyCount(Long subKeyCount) {
			this.subKeyCount = subKeyCount;
		}

		public Boolean getIsOwnerManageOnly() {
			return this.isOwnerManageOnly;
		}

		public void setIsOwnerManageOnly(Boolean isOwnerManageOnly) {
			this.isOwnerManageOnly = isOwnerManageOnly;
		}

		public Boolean getEnableOpenapiQuery() {
			return this.enableOpenapiQuery;
		}

		public void setEnableOpenapiQuery(Boolean enableOpenapiQuery) {
			this.enableOpenapiQuery = enableOpenapiQuery;
		}

		public String getAlgorithmTypeAlias() {
			return this.algorithmTypeAlias;
		}

		public void setAlgorithmTypeAlias(String algorithmTypeAlias) {
			this.algorithmTypeAlias = algorithmTypeAlias;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getOwnerName() {
			return this.ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		public List<String> getSecretKeyList() {
			return this.secretKeyList;
		}

		public void setSecretKeyList(List<String> secretKeyList) {
			this.secretKeyList = secretKeyList;
		}
	}

	@Override
	public GetSecuritySecretKeyResponse getInstance(UnmarshallerContext context) {
		return	GetSecuritySecretKeyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
