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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeWebCacheConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebCacheConfigsResponse extends AcsResponse {

	private String requestId;

	private List<CacheConfig> domainCacheConfigs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CacheConfig> getDomainCacheConfigs() {
		return this.domainCacheConfigs;
	}

	public void setDomainCacheConfigs(List<CacheConfig> domainCacheConfigs) {
		this.domainCacheConfigs = domainCacheConfigs;
	}

	public static class CacheConfig {

		private String mode;

		private Integer enable;

		private String domain;

		private List<CustomRule> customRules;

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public Integer getEnable() {
			return this.enable;
		}

		public void setEnable(Integer enable) {
			this.enable = enable;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public List<CustomRule> getCustomRules() {
			return this.customRules;
		}

		public void setCustomRules(List<CustomRule> customRules) {
			this.customRules = customRules;
		}

		public static class CustomRule {

			private String mode;

			private String name;

			private Long cacheTtl;

			private String uri;

			public String getMode() {
				return this.mode;
			}

			public void setMode(String mode) {
				this.mode = mode;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Long getCacheTtl() {
				return this.cacheTtl;
			}

			public void setCacheTtl(Long cacheTtl) {
				this.cacheTtl = cacheTtl;
			}

			public String getUri() {
				return this.uri;
			}

			public void setUri(String uri) {
				this.uri = uri;
			}
		}
	}

	@Override
	public DescribeWebCacheConfigsResponse getInstance(UnmarshallerContext context) {
		return	DescribeWebCacheConfigsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
