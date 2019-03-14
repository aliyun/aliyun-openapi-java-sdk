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
import com.aliyuncs.emr.transform.v20160408.DescribeEmrMainVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEmrMainVersionResponse extends AcsResponse {

	private String requestId;

	private EmrMainVersion emrMainVersion;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public EmrMainVersion getEmrMainVersion() {
		return this.emrMainVersion;
	}

	public void setEmrMainVersion(EmrMainVersion emrMainVersion) {
		this.emrMainVersion = emrMainVersion;
	}

	public static class EmrMainVersion {

		private String regionId;

		private String emrVersion;

		private Boolean ecmVersion;

		private String imageId;

		private Boolean display;

		private String stackName;

		private String stackVersion;

		private List<ClusterTypeInfo> clusterTypeInfoList;

		private List<String> whiteUserList;

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getEmrVersion() {
			return this.emrVersion;
		}

		public void setEmrVersion(String emrVersion) {
			this.emrVersion = emrVersion;
		}

		public Boolean getEcmVersion() {
			return this.ecmVersion;
		}

		public void setEcmVersion(Boolean ecmVersion) {
			this.ecmVersion = ecmVersion;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public Boolean getDisplay() {
			return this.display;
		}

		public void setDisplay(Boolean display) {
			this.display = display;
		}

		public String getStackName() {
			return this.stackName;
		}

		public void setStackName(String stackName) {
			this.stackName = stackName;
		}

		public String getStackVersion() {
			return this.stackVersion;
		}

		public void setStackVersion(String stackVersion) {
			this.stackVersion = stackVersion;
		}

		public List<ClusterTypeInfo> getClusterTypeInfoList() {
			return this.clusterTypeInfoList;
		}

		public void setClusterTypeInfoList(List<ClusterTypeInfo> clusterTypeInfoList) {
			this.clusterTypeInfoList = clusterTypeInfoList;
		}

		public List<String> getWhiteUserList() {
			return this.whiteUserList;
		}

		public void setWhiteUserList(List<String> whiteUserList) {
			this.whiteUserList = whiteUserList;
		}

		public static class ClusterTypeInfo {

			private String clusterType;

			private List<ServiceInfo> serviceInfoList;

			public String getClusterType() {
				return this.clusterType;
			}

			public void setClusterType(String clusterType) {
				this.clusterType = clusterType;
			}

			public List<ServiceInfo> getServiceInfoList() {
				return this.serviceInfoList;
			}

			public void setServiceInfoList(List<ServiceInfo> serviceInfoList) {
				this.serviceInfoList = serviceInfoList;
			}

			public static class ServiceInfo {

				private String serviceName;

				private String serviceDisplayName;

				private String serviceVersion;

				private String serviceDisplayVersion;

				private Boolean mandatory;

				private Boolean display;

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

				public String getServiceVersion() {
					return this.serviceVersion;
				}

				public void setServiceVersion(String serviceVersion) {
					this.serviceVersion = serviceVersion;
				}

				public String getServiceDisplayVersion() {
					return this.serviceDisplayVersion;
				}

				public void setServiceDisplayVersion(String serviceDisplayVersion) {
					this.serviceDisplayVersion = serviceDisplayVersion;
				}

				public Boolean getMandatory() {
					return this.mandatory;
				}

				public void setMandatory(Boolean mandatory) {
					this.mandatory = mandatory;
				}

				public Boolean getDisplay() {
					return this.display;
				}

				public void setDisplay(Boolean display) {
					this.display = display;
				}
			}
		}
	}

	@Override
	public DescribeEmrMainVersionResponse getInstance(UnmarshallerContext context) {
		return	DescribeEmrMainVersionResponseUnmarshaller.unmarshall(this, context);
	}
}
