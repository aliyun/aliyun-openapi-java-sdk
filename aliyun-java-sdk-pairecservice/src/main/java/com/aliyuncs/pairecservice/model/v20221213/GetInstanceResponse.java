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

package com.aliyuncs.pairecservice.model.v20221213;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pairecservice.transform.v20221213.GetInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private String type;

	private String status;

	private String regionId;

	private String gmtCreateTime;

	private String gmtModifiedTime;

	private String expiredTime;

	private String commodityCode;

	private String chargeType;

	private Config config;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getGmtCreateTime() {
		return this.gmtCreateTime;
	}

	public void setGmtCreateTime(String gmtCreateTime) {
		this.gmtCreateTime = gmtCreateTime;
	}

	public String getGmtModifiedTime() {
		return this.gmtModifiedTime;
	}

	public void setGmtModifiedTime(String gmtModifiedTime) {
		this.gmtModifiedTime = gmtModifiedTime;
	}

	public String getExpiredTime() {
		return this.expiredTime;
	}

	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public Config getConfig() {
		return this.config;
	}

	public void setConfig(Config config) {
		this.config = config;
	}

	public static class Config {

		private List<EnginesItem> engines;

		private List<MonitorsItem> monitors;

		private List<DataManagementsItem> dataManagements;

		public List<EnginesItem> getEngines() {
			return this.engines;
		}

		public void setEngines(List<EnginesItem> engines) {
			this.engines = engines;
		}

		public List<MonitorsItem> getMonitors() {
			return this.monitors;
		}

		public void setMonitors(List<MonitorsItem> monitors) {
			this.monitors = monitors;
		}

		public List<DataManagementsItem> getDataManagements() {
			return this.dataManagements;
		}

		public void setDataManagements(List<DataManagementsItem> dataManagements) {
			this.dataManagements = dataManagements;
		}

		public static class EnginesItem {

			private String componentCode;

			private String type;

			private Map<Object,Object> meta;

			public String getComponentCode() {
				return this.componentCode;
			}

			public void setComponentCode(String componentCode) {
				this.componentCode = componentCode;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Map<Object,Object> getMeta() {
				return this.meta;
			}

			public void setMeta(Map<Object,Object> meta) {
				this.meta = meta;
			}
		}

		public static class MonitorsItem {

			private String componentCode;

			private String type;

			private Map<Object,Object> meta;

			public String getComponentCode() {
				return this.componentCode;
			}

			public void setComponentCode(String componentCode) {
				this.componentCode = componentCode;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Map<Object,Object> getMeta() {
				return this.meta;
			}

			public void setMeta(Map<Object,Object> meta) {
				this.meta = meta;
			}
		}

		public static class DataManagementsItem {

			private String componentCode;

			private String type;

			private Map<Object,Object> meta;

			public String getComponentCode() {
				return this.componentCode;
			}

			public void setComponentCode(String componentCode) {
				this.componentCode = componentCode;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Map<Object,Object> getMeta() {
				return this.meta;
			}

			public void setMeta(Map<Object,Object> meta) {
				this.meta = meta;
			}
		}
	}

	@Override
	public GetInstanceResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
