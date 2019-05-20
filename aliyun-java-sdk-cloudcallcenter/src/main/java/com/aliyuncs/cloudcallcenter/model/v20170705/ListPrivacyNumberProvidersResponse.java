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
import com.aliyuncs.cloudcallcenter.transform.v20170705.ListPrivacyNumberProvidersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPrivacyNumberProvidersResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<Provider> providers;

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

	public List<Provider> getProviders() {
		return this.providers;
	}

	public void setProviders(List<Provider> providers) {
		this.providers = providers;
	}

	public static class Provider {

		private Long id;

		private String providerId;

		private String providerName;

		private String prefix;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
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
	}

	@Override
	public ListPrivacyNumberProvidersResponse getInstance(UnmarshallerContext context) {
		return	ListPrivacyNumberProvidersResponseUnmarshaller.unmarshall(this, context);
	}
}
