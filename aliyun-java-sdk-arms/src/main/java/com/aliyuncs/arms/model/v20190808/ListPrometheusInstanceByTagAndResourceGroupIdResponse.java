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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.ListPrometheusInstanceByTagAndResourceGroupIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPrometheusInstanceByTagAndResourceGroupIdResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<PrometheusInstancesItem> prometheusInstances;

		public List<PrometheusInstancesItem> getPrometheusInstances() {
			return this.prometheusInstances;
		}

		public void setPrometheusInstances(List<PrometheusInstancesItem> prometheusInstances) {
			this.prometheusInstances = prometheusInstances;
		}

		public static class PrometheusInstancesItem {

			private String clusterId;

			private String regionId;

			private String userId;

			private String clusterName;

			private String clusterType;

			private String vpcId;

			private String vSwitchId;

			private String securityGroupId;

			private String subClustersJson;

			private String paymentType;

			private String grafanaInstanceId;

			private String resourceGroupId;

			private List<TagsItem> tags;

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

			public String getPaymentType() {
				return this.paymentType;
			}

			public void setPaymentType(String paymentType) {
				this.paymentType = paymentType;
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

			public List<TagsItem> getTags() {
				return this.tags;
			}

			public void setTags(List<TagsItem> tags) {
				this.tags = tags;
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
	}

	@Override
	public ListPrometheusInstanceByTagAndResourceGroupIdResponse getInstance(UnmarshallerContext context) {
		return	ListPrometheusInstanceByTagAndResourceGroupIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
