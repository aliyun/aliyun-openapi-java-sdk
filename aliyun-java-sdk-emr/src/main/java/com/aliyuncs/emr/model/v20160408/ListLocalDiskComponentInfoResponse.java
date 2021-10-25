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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListLocalDiskComponentInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLocalDiskComponentInfoResponse extends AcsResponse {

	private String requestId;

	private List<ComponentInfo> componentInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ComponentInfo> getComponentInfoList() {
		return this.componentInfoList;
	}

	public void setComponentInfoList(List<ComponentInfo> componentInfoList) {
		this.componentInfoList = componentInfoList;
	}

	public static class ComponentInfo {

		private String serviceName;

		private String serviceDisplayName;

		private String componentName;

		private String componentDisplayName;

		private String isolateWarningMsg;

		private String mountWarningMsg;

		private String rebootWarningMsg;

		private Boolean supportDiskHotSwap;

		private List<MountParam> mountParams;

		private List<String> apmMetrics;

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getServiceDisplayName() {
			return this.serviceDisplayName;
		}

		public void setServiceDisplayName(String serviceDisplayName) {
			this.serviceDisplayName = serviceDisplayName;
		}

		public String getComponentName() {
			return this.componentName;
		}

		public void setComponentName(String componentName) {
			this.componentName = componentName;
		}

		public String getComponentDisplayName() {
			return this.componentDisplayName;
		}

		public void setComponentDisplayName(String componentDisplayName) {
			this.componentDisplayName = componentDisplayName;
		}

		public String getIsolateWarningMsg() {
			return this.isolateWarningMsg;
		}

		public void setIsolateWarningMsg(String isolateWarningMsg) {
			this.isolateWarningMsg = isolateWarningMsg;
		}

		public String getMountWarningMsg() {
			return this.mountWarningMsg;
		}

		public void setMountWarningMsg(String mountWarningMsg) {
			this.mountWarningMsg = mountWarningMsg;
		}

		public String getRebootWarningMsg() {
			return this.rebootWarningMsg;
		}

		public void setRebootWarningMsg(String rebootWarningMsg) {
			this.rebootWarningMsg = rebootWarningMsg;
		}

		public Boolean getSupportDiskHotSwap() {
			return this.supportDiskHotSwap;
		}

		public void setSupportDiskHotSwap(Boolean supportDiskHotSwap) {
			this.supportDiskHotSwap = supportDiskHotSwap;
		}

		public List<MountParam> getMountParams() {
			return this.mountParams;
		}

		public void setMountParams(List<MountParam> mountParams) {
			this.mountParams = mountParams;
		}

		public List<String> getApmMetrics() {
			return this.apmMetrics;
		}

		public void setApmMetrics(List<String> apmMetrics) {
			this.apmMetrics = apmMetrics;
		}

		public static class MountParam {

			private String name;

			private String key;

			private String valueType;

			private String defaultValue;

			private String tips;

			private String unit;

			private Integer min;

			private Integer max;

			private List<String> options;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValueType() {
				return this.valueType;
			}

			public void setValueType(String valueType) {
				this.valueType = valueType;
			}

			public String getDefaultValue() {
				return this.defaultValue;
			}

			public void setDefaultValue(String defaultValue) {
				this.defaultValue = defaultValue;
			}

			public String getTips() {
				return this.tips;
			}

			public void setTips(String tips) {
				this.tips = tips;
			}

			public String getUnit() {
				return this.unit;
			}

			public void setUnit(String unit) {
				this.unit = unit;
			}

			public Integer getMin() {
				return this.min;
			}

			public void setMin(Integer min) {
				this.min = min;
			}

			public Integer getMax() {
				return this.max;
			}

			public void setMax(Integer max) {
				this.max = max;
			}

			public List<String> getOptions() {
				return this.options;
			}

			public void setOptions(List<String> options) {
				this.options = options;
			}
		}
	}

	@Override
	public ListLocalDiskComponentInfoResponse getInstance(UnmarshallerContext context) {
		return	ListLocalDiskComponentInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
