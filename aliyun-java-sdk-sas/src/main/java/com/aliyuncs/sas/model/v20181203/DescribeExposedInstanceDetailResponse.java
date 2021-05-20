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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeExposedInstanceDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExposedInstanceDetailResponse extends AcsResponse {

	private String requestId;

	private List<ExposedChain> exposedChains;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ExposedChain> getExposedChains() {
		return this.exposedChains;
	}

	public void setExposedChains(List<ExposedChain> exposedChains) {
		this.exposedChains = exposedChains;
	}

	public static class ExposedChain {

		private String uuid;

		private String intranetIp;

		private String internetIp;

		private String exposureComponent;

		private String exposureType;

		private String exposurePort;

		private String exposureIp;

		private String exposureTypeId;

		private String instanceId;

		private String instanceName;

		private String regionId;

		private String groupNo;

		private List<ScaVulRecord> realVulList;

		private List<ScaVulRecord> allVulList;

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getExposureComponent() {
			return this.exposureComponent;
		}

		public void setExposureComponent(String exposureComponent) {
			this.exposureComponent = exposureComponent;
		}

		public String getExposureType() {
			return this.exposureType;
		}

		public void setExposureType(String exposureType) {
			this.exposureType = exposureType;
		}

		public String getExposurePort() {
			return this.exposurePort;
		}

		public void setExposurePort(String exposurePort) {
			this.exposurePort = exposurePort;
		}

		public String getExposureIp() {
			return this.exposureIp;
		}

		public void setExposureIp(String exposureIp) {
			this.exposureIp = exposureIp;
		}

		public String getExposureTypeId() {
			return this.exposureTypeId;
		}

		public void setExposureTypeId(String exposureTypeId) {
			this.exposureTypeId = exposureTypeId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getGroupNo() {
			return this.groupNo;
		}

		public void setGroupNo(String groupNo) {
			this.groupNo = groupNo;
		}

		public List<ScaVulRecord> getRealVulList() {
			return this.realVulList;
		}

		public void setRealVulList(List<ScaVulRecord> realVulList) {
			this.realVulList = realVulList;
		}

		public List<ScaVulRecord> getAllVulList() {
			return this.allVulList;
		}

		public void setAllVulList(List<ScaVulRecord> allVulList) {
			this.allVulList = allVulList;
		}

		public static class ScaVulRecord {

			private String aliasName;

			private String necessity;

			private String name;

			private String type;

			private String uuid;

			public String getAliasName() {
				return this.aliasName;
			}

			public void setAliasName(String aliasName) {
				this.aliasName = aliasName;
			}

			public String getNecessity() {
				return this.necessity;
			}

			public void setNecessity(String necessity) {
				this.necessity = necessity;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getUuid() {
				return this.uuid;
			}

			public void setUuid(String uuid) {
				this.uuid = uuid;
			}
		}
	}

	@Override
	public DescribeExposedInstanceDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeExposedInstanceDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
