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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.ListPrivacyNumberPoolsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPrivacyNumberPoolsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<PrivacyNumberPool> privacyNumberPools;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<PrivacyNumberPool> getPrivacyNumberPools() {
		return this.privacyNumberPools;
	}

	public void setPrivacyNumberPools(List<PrivacyNumberPool> privacyNumberPools) {
		this.privacyNumberPools = privacyNumberPools;
	}

	public static class PrivacyNumberPool {

		private String poolId;

		private String providerId;

		private String providerName;

		private String prefix;

		private String type;

		private String name;

		private Long aliYunUid;

		private String bizId;

		public String getPoolId() {
			return this.poolId;
		}

		public void setPoolId(String poolId) {
			this.poolId = poolId;
		}

		public String getProviderId() {
			return this.providerId;
		}

		public void setProviderId(String providerId) {
			this.providerId = providerId;
		}

		public String getProviderName() {
			return this.providerName;
		}

		public void setProviderName(String providerName) {
			this.providerName = providerName;
		}

		public String getPrefix() {
			return this.prefix;
		}

		public void setPrefix(String prefix) {
			this.prefix = prefix;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getAliYunUid() {
			return this.aliYunUid;
		}

		public void setAliYunUid(Long aliYunUid) {
			this.aliYunUid = aliYunUid;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}
	}

	@Override
	public ListPrivacyNumberPoolsResponse getInstance(UnmarshallerContext context) {
		return	ListPrivacyNumberPoolsResponseUnmarshaller.unmarshall(this, context);
	}
}
