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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.ListIntegrationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListIntegrationResponse extends AcsResponse {

	private String requestId;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class PageInfo {

		private Long total;

		private Long size;

		private Long page;

		private List<Integrations> iintegrations;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public Long getPage() {
			return this.page;
		}

		public void setPage(Long page) {
			this.page = page;
		}

		public List<Integrations> getIintegrations() {
			return this.iintegrations;
		}

		public void setIintegrations(List<Integrations> iintegrations) {
			this.iintegrations = iintegrations;
		}

		public static class Integrations {

			private Long integrationId;

			private String integrationName;

			private String integrationProductType;

			private String apiEndpoint;

			private String shortToken;

			private Boolean state;

			private String liveness;

			private String createTime;

			private IntegrationDetail integrationDetail;

			public Long getIntegrationId() {
				return this.integrationId;
			}

			public void setIntegrationId(Long integrationId) {
				this.integrationId = integrationId;
			}

			public String getIntegrationName() {
				return this.integrationName;
			}

			public void setIntegrationName(String integrationName) {
				this.integrationName = integrationName;
			}

			public String getIntegrationProductType() {
				return this.integrationProductType;
			}

			public void setIntegrationProductType(String integrationProductType) {
				this.integrationProductType = integrationProductType;
			}

			public String getApiEndpoint() {
				return this.apiEndpoint;
			}

			public void setApiEndpoint(String apiEndpoint) {
				this.apiEndpoint = apiEndpoint;
			}

			public String getShortToken() {
				return this.shortToken;
			}

			public void setShortToken(String shortToken) {
				this.shortToken = shortToken;
			}

			public Boolean getState() {
				return this.state;
			}

			public void setState(Boolean state) {
				this.state = state;
			}

			public String getLiveness() {
				return this.liveness;
			}

			public void setLiveness(String liveness) {
				this.liveness = liveness;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public IntegrationDetail getIntegrationDetail() {
				return this.integrationDetail;
			}

			public void setIntegrationDetail(IntegrationDetail integrationDetail) {
				this.integrationDetail = integrationDetail;
			}

			public static class IntegrationDetail {

				private String description;

				private String duplicateKey;

				private Boolean autoRecover;

				private Long recoverTime;

				private List<Long> stat;

				private List<Map<Object,Object>> fieldRedefineRules;

				private List<Map<Object,Object>> extendedFieldRedefineRules;

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getDuplicateKey() {
					return this.duplicateKey;
				}

				public void setDuplicateKey(String duplicateKey) {
					this.duplicateKey = duplicateKey;
				}

				public Boolean getAutoRecover() {
					return this.autoRecover;
				}

				public void setAutoRecover(Boolean autoRecover) {
					this.autoRecover = autoRecover;
				}

				public Long getRecoverTime() {
					return this.recoverTime;
				}

				public void setRecoverTime(Long recoverTime) {
					this.recoverTime = recoverTime;
				}

				public List<Long> getStat() {
					return this.stat;
				}

				public void setStat(List<Long> stat) {
					this.stat = stat;
				}

				public List<Map<Object,Object>> getFieldRedefineRules() {
					return this.fieldRedefineRules;
				}

				public void setFieldRedefineRules(List<Map<Object,Object>> fieldRedefineRules) {
					this.fieldRedefineRules = fieldRedefineRules;
				}

				public List<Map<Object,Object>> getExtendedFieldRedefineRules() {
					return this.extendedFieldRedefineRules;
				}

				public void setExtendedFieldRedefineRules(List<Map<Object,Object>> extendedFieldRedefineRules) {
					this.extendedFieldRedefineRules = extendedFieldRedefineRules;
				}
			}
		}
	}

	@Override
	public ListIntegrationResponse getInstance(UnmarshallerContext context) {
		return	ListIntegrationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
