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
import com.aliyuncs.arms.transform.v20190808.GetPrometheusInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPrometheusInstanceResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer code;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String clusterId;

		private String regionId;

		private String userId;

		private String clusterName;

		private String clusterType;

		private String vpcId;

		private String vSwitchId;

		private String securityGroupId;

		private String subClustersJson;

		private String remoteReadIntraUrl;

		private String remoteReadInterUrl;

		private String remoteWriteIntraUrl;

		private String remoteWriteInterUrl;

		private String pushGatewayIntraUrl;

		private String pushGatewayInterUrl;

		private String httpApiIntraUrl;

		private String httpApiInterUrl;

		private String authToken;

		private String accessType;

		private String paymentType;

		private Integer storageDuration;

		private Integer archiveDuration;

		private String grafanaInstanceId;

		private String resourceGroupId;

		private String resourceType;

		private String enableAuthToken;

		private Boolean enableAuthFreeRead;

		private String authFreeReadPolicy;

		private Boolean enableAuthFreeWrite;

		private String authFreeWritePolicy;

		private String product;

		private String dbInstanceStatus;

		private String version;

		private String paymentTypeUpdateTime;

		private Map<Object,Object> extraInfo;

		private List<TagsItem> tags;

		private List<String> supportAuthTypes;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(String clusterType) {
			this.clusterType = clusterType;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getSubClustersJson() {
			return this.subClustersJson;
		}

		public void setSubClustersJson(String subClustersJson) {
			this.subClustersJson = subClustersJson;
		}

		public String getRemoteReadIntraUrl() {
			return this.remoteReadIntraUrl;
		}

		public void setRemoteReadIntraUrl(String remoteReadIntraUrl) {
			this.remoteReadIntraUrl = remoteReadIntraUrl;
		}

		public String getRemoteReadInterUrl() {
			return this.remoteReadInterUrl;
		}

		public void setRemoteReadInterUrl(String remoteReadInterUrl) {
			this.remoteReadInterUrl = remoteReadInterUrl;
		}

		public String getRemoteWriteIntraUrl() {
			return this.remoteWriteIntraUrl;
		}

		public void setRemoteWriteIntraUrl(String remoteWriteIntraUrl) {
			this.remoteWriteIntraUrl = remoteWriteIntraUrl;
		}

		public String getRemoteWriteInterUrl() {
			return this.remoteWriteInterUrl;
		}

		public void setRemoteWriteInterUrl(String remoteWriteInterUrl) {
			this.remoteWriteInterUrl = remoteWriteInterUrl;
		}

		public String getPushGatewayIntraUrl() {
			return this.pushGatewayIntraUrl;
		}

		public void setPushGatewayIntraUrl(String pushGatewayIntraUrl) {
			this.pushGatewayIntraUrl = pushGatewayIntraUrl;
		}

		public String getPushGatewayInterUrl() {
			return this.pushGatewayInterUrl;
		}

		public void setPushGatewayInterUrl(String pushGatewayInterUrl) {
			this.pushGatewayInterUrl = pushGatewayInterUrl;
		}

		public String getHttpApiIntraUrl() {
			return this.httpApiIntraUrl;
		}

		public void setHttpApiIntraUrl(String httpApiIntraUrl) {
			this.httpApiIntraUrl = httpApiIntraUrl;
		}

		public String getHttpApiInterUrl() {
			return this.httpApiInterUrl;
		}

		public void setHttpApiInterUrl(String httpApiInterUrl) {
			this.httpApiInterUrl = httpApiInterUrl;
		}

		public String getAuthToken() {
			return this.authToken;
		}

		public void setAuthToken(String authToken) {
			this.authToken = authToken;
		}

		public String getAccessType() {
			return this.accessType;
		}

		public void setAccessType(String accessType) {
			this.accessType = accessType;
		}

		public String getPaymentType() {
			return this.paymentType;
		}

		public void setPaymentType(String paymentType) {
			this.paymentType = paymentType;
		}

		public Integer getStorageDuration() {
			return this.storageDuration;
		}

		public void setStorageDuration(Integer storageDuration) {
			this.storageDuration = storageDuration;
		}

		public Integer getArchiveDuration() {
			return this.archiveDuration;
		}

		public void setArchiveDuration(Integer archiveDuration) {
			this.archiveDuration = archiveDuration;
		}

		public String getGrafanaInstanceId() {
			return this.grafanaInstanceId;
		}

		public void setGrafanaInstanceId(String grafanaInstanceId) {
			this.grafanaInstanceId = grafanaInstanceId;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getEnableAuthToken() {
			return this.enableAuthToken;
		}

		public void setEnableAuthToken(String enableAuthToken) {
			this.enableAuthToken = enableAuthToken;
		}

		public Boolean getEnableAuthFreeRead() {
			return this.enableAuthFreeRead;
		}

		public void setEnableAuthFreeRead(Boolean enableAuthFreeRead) {
			this.enableAuthFreeRead = enableAuthFreeRead;
		}

		public String getAuthFreeReadPolicy() {
			return this.authFreeReadPolicy;
		}

		public void setAuthFreeReadPolicy(String authFreeReadPolicy) {
			this.authFreeReadPolicy = authFreeReadPolicy;
		}

		public Boolean getEnableAuthFreeWrite() {
			return this.enableAuthFreeWrite;
		}

		public void setEnableAuthFreeWrite(Boolean enableAuthFreeWrite) {
			this.enableAuthFreeWrite = enableAuthFreeWrite;
		}

		public String getAuthFreeWritePolicy() {
			return this.authFreeWritePolicy;
		}

		public void setAuthFreeWritePolicy(String authFreeWritePolicy) {
			this.authFreeWritePolicy = authFreeWritePolicy;
		}

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public String getDbInstanceStatus() {
			return this.dbInstanceStatus;
		}

		public void setDbInstanceStatus(String dbInstanceStatus) {
			this.dbInstanceStatus = dbInstanceStatus;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getPaymentTypeUpdateTime() {
			return this.paymentTypeUpdateTime;
		}

		public void setPaymentTypeUpdateTime(String paymentTypeUpdateTime) {
			this.paymentTypeUpdateTime = paymentTypeUpdateTime;
		}

		public Map<Object,Object> getExtraInfo() {
			return this.extraInfo;
		}

		public void setExtraInfo(Map<Object,Object> extraInfo) {
			this.extraInfo = extraInfo;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public List<String> getSupportAuthTypes() {
			return this.supportAuthTypes;
		}

		public void setSupportAuthTypes(List<String> supportAuthTypes) {
			this.supportAuthTypes = supportAuthTypes;
		}

		public static class TagsItem {

			private String tagKey;

			private String tagValue;

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}
		}
	}

	@Override
	public GetPrometheusInstanceResponse getInstance(UnmarshallerContext context) {
		return	GetPrometheusInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
