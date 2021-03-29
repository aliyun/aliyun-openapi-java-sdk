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
import com.aliyuncs.edas.transform.v20170801.ToggleGrayIngressResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ToggleGrayIngressResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private Integer message;

	private Data data;

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

	public Integer getMessage() {
		return this.message;
	}

	public void setMessage(Integer message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long pointcutId;

		private String regionId;

		private Spec spec;

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

		public Spec getSpec() {
			return this.spec;
		}

		public void setSpec(Spec spec) {
			this.spec = spec;
		}

		public static class Spec {

			private String showName;

			private String tag;

			private Boolean enable;

			private Map<Object,Object> selector;

			private List<ScopesItem> scopes;

			public String getShowName() {
				return this.showName;
			}

			public void setShowName(String showName) {
				this.showName = showName;
			}

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}

			public Boolean getEnable() {
				return this.enable;
			}

			public void setEnable(Boolean enable) {
				this.enable = enable;
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
	public ToggleGrayIngressResponse getInstance(UnmarshallerContext context) {
		return	ToggleGrayIngressResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
