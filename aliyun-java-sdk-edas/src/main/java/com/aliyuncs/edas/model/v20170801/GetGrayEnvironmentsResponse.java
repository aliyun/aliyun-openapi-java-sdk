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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.GetGrayEnvironmentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetGrayEnvironmentsResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private List<EnvList> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<EnvList> getData() {
		return this.data;
	}

	public void setData(List<EnvList> data) {
		this.data = data;
	}

	public static class EnvList {

		private String accountId;

		private Long pointcutId;

		private String regionId;

		private String tenantId;

		private Metadata metadata;

		private Spec spec;

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public Long getPointcutId() {
			return this.pointcutId;
		}

		public void setPointcutId(Long pointcutId) {
			this.pointcutId = pointcutId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public Metadata getMetadata() {
			return this.metadata;
		}

		public void setMetadata(Metadata metadata) {
			this.metadata = metadata;
		}

		public Spec getSpec() {
			return this.spec;
		}

		public void setSpec(Spec spec) {
			this.spec = spec;
		}

		public static class Metadata {

			private Map<Object,Object> labels;

			private Map<Object,Object> annotations;

			private String name;

			private String namespace;

			public Map<Object,Object> getLabels() {
				return this.labels;
			}

			public void setLabels(Map<Object,Object> labels) {
				this.labels = labels;
			}

			public Map<Object,Object> getAnnotations() {
				return this.annotations;
			}

			public void setAnnotations(Map<Object,Object> annotations) {
				this.annotations = annotations;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}
		}

		public static class Spec {

			private Boolean enable;

			private String showName;

			private Boolean single;

			private String tag;

			private Map<Object,Object> selector;

			private List<ScopesItem> scopes;

			public Boolean getEnable() {
				return this.enable;
			}

			public void setEnable(Boolean enable) {
				this.enable = enable;
			}

			public String getShowName() {
				return this.showName;
			}

			public void setShowName(String showName) {
				this.showName = showName;
			}

			public Boolean getSingle() {
				return this.single;
			}

			public void setSingle(Boolean single) {
				this.single = single;
			}

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}

			public Map<Object,Object> getSelector() {
				return this.selector;
			}

			public void setSelector(Map<Object,Object> selector) {
				this.selector = selector;
			}

			public List<ScopesItem> getScopes() {
				return this.scopes;
			}

			public void setScopes(List<ScopesItem> scopes) {
				this.scopes = scopes;
			}

			public static class ScopesItem {

				private Long id;

				private String key;

				private String value;

				private String extra;

				private ValueFrom valueFrom;

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getExtra() {
					return this.extra;
				}

				public void setExtra(String extra) {
					this.extra = extra;
				}

				public ValueFrom getValueFrom() {
					return this.valueFrom;
				}

				public void setValueFrom(ValueFrom valueFrom) {
					this.valueFrom = valueFrom;
				}

				public static class ValueFrom {

					private String refName;

					private String refValue;

					public String getRefName() {
						return this.refName;
					}

					public void setRefName(String refName) {
						this.refName = refName;
					}

					public String getRefValue() {
						return this.refValue;
					}

					public void setRefValue(String refValue) {
						this.refValue = refValue;
					}
				}
			}
		}
	}

	@Override
	public GetGrayEnvironmentsResponse getInstance(UnmarshallerContext context) {
		return	GetGrayEnvironmentsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
