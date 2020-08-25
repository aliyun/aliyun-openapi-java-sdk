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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.ListAKSClustersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAKSClustersResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<ListItem> list;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<ListItem> getList() {
		return this.list;
	}

	public void setList(List<ListItem> list) {
		this.list = list;
	}

	public static class ListItem {

		private String alsProjectName;

		private String clusterProviderType;

		private String displayName;

		private Boolean enableLogging;

		private Boolean enableMesh;

		private Boolean enableMetis;

		private String id;

		private String installType;

		private String name;

		private String podCidr;

		private String serviceCidr;

		private String status;

		private List<CellInfosItem> cellInfos;

		private List<SecuredGroupInfosItem> securedGroupInfos;

		private List<ZoneInfosItem> zoneInfos;

		private NetworkInfo networkInfo;

		public String getAlsProjectName() {
			return this.alsProjectName;
		}

		public void setAlsProjectName(String alsProjectName) {
			this.alsProjectName = alsProjectName;
		}

		public String getClusterProviderType() {
			return this.clusterProviderType;
		}

		public void setClusterProviderType(String clusterProviderType) {
			this.clusterProviderType = clusterProviderType;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public Boolean getEnableLogging() {
			return this.enableLogging;
		}

		public void setEnableLogging(Boolean enableLogging) {
			this.enableLogging = enableLogging;
		}

		public Boolean getEnableMesh() {
			return this.enableMesh;
		}

		public void setEnableMesh(Boolean enableMesh) {
			this.enableMesh = enableMesh;
		}

		public Boolean getEnableMetis() {
			return this.enableMetis;
		}

		public void setEnableMetis(Boolean enableMetis) {
			this.enableMetis = enableMetis;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getInstallType() {
			return this.installType;
		}

		public void setInstallType(String installType) {
			this.installType = installType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPodCidr() {
			return this.podCidr;
		}

		public void setPodCidr(String podCidr) {
			this.podCidr = podCidr;
		}

		public String getServiceCidr() {
			return this.serviceCidr;
		}

		public void setServiceCidr(String serviceCidr) {
			this.serviceCidr = serviceCidr;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<CellInfosItem> getCellInfos() {
			return this.cellInfos;
		}

		public void setCellInfos(List<CellInfosItem> cellInfos) {
			this.cellInfos = cellInfos;
		}

		public List<SecuredGroupInfosItem> getSecuredGroupInfos() {
			return this.securedGroupInfos;
		}

		public void setSecuredGroupInfos(List<SecuredGroupInfosItem> securedGroupInfos) {
			this.securedGroupInfos = securedGroupInfos;
		}

		public List<ZoneInfosItem> getZoneInfos() {
			return this.zoneInfos;
		}

		public void setZoneInfos(List<ZoneInfosItem> zoneInfos) {
			this.zoneInfos = zoneInfos;
		}

		public NetworkInfo getNetworkInfo() {
			return this.networkInfo;
		}

		public void setNetworkInfo(NetworkInfo networkInfo) {
			this.networkInfo = networkInfo;
		}

		public static class CellInfosItem {

			private String displayName;

			private String id;

			private String name;

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class SecuredGroupInfosItem {

			private String iaasProviderId;

			private String id;

			private String name;

			private String securedGroupIdentity;

			private String securedZoneId;

			private String utcCreate;

			private String utcModified;

			public String getIaasProviderId() {
				return this.iaasProviderId;
			}

			public void setIaasProviderId(String iaasProviderId) {
				this.iaasProviderId = iaasProviderId;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getSecuredGroupIdentity() {
				return this.securedGroupIdentity;
			}

			public void setSecuredGroupIdentity(String securedGroupIdentity) {
				this.securedGroupIdentity = securedGroupIdentity;
			}

			public String getSecuredZoneId() {
				return this.securedZoneId;
			}

			public void setSecuredZoneId(String securedZoneId) {
				this.securedZoneId = securedZoneId;
			}

			public String getUtcCreate() {
				return this.utcCreate;
			}

			public void setUtcCreate(String utcCreate) {
				this.utcCreate = utcCreate;
			}

			public String getUtcModified() {
				return this.utcModified;
			}

			public void setUtcModified(String utcModified) {
				this.utcModified = utcModified;
			}
		}

		public static class ZoneInfosItem {

			private String displayName;

			private String id;

			private String name;

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class NetworkInfo {

			private String description;

			private String segment;

			private String type;

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getSegment() {
				return this.segment;
			}

			public void setSegment(String segment) {
				this.segment = segment;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}
	}

	@Override
	public ListAKSClustersResponse getInstance(UnmarshallerContext context) {
		return	ListAKSClustersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
