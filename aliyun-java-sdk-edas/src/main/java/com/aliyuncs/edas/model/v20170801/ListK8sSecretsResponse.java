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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.ListK8sSecretsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListK8sSecretsResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<ResultItem> result;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private Integer total;

		private List<SecretsItem> secrets;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<SecretsItem> getSecrets() {
			return this.secrets;
		}

		public void setSecrets(List<SecretsItem> secrets) {
			this.secrets = secrets;
		}

		public static class SecretsItem {

			private String type;

			private String creationTime;

			private String clusterName;

			private String namespace;

			private Boolean base64Encoded;

			private String certRegionId;

			private String certId;

			private String name;

			private String clusterId;

			private List<RelatedIngressRulesItem> relatedIngressRules;

			private List<DataItem> data;

			private List<RelatedAppsItem2> relatedApps;

			private CertDetail certDetail;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getClusterName() {
				return this.clusterName;
			}

			public void setClusterName(String clusterName) {
				this.clusterName = clusterName;
			}

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}

			public Boolean getBase64Encoded() {
				return this.base64Encoded;
			}

			public void setBase64Encoded(Boolean base64Encoded) {
				this.base64Encoded = base64Encoded;
			}

			public String getCertRegionId() {
				return this.certRegionId;
			}

			public void setCertRegionId(String certRegionId) {
				this.certRegionId = certRegionId;
			}

			public String getCertId() {
				return this.certId;
			}

			public void setCertId(String certId) {
				this.certId = certId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}

			public List<RelatedIngressRulesItem> getRelatedIngressRules() {
				return this.relatedIngressRules;
			}

			public void setRelatedIngressRules(List<RelatedIngressRulesItem> relatedIngressRules) {
				this.relatedIngressRules = relatedIngressRules;
			}

			public List<DataItem> getData() {
				return this.data;
			}

			public void setData(List<DataItem> data) {
				this.data = data;
			}

			public List<RelatedAppsItem2> getRelatedApps() {
				return this.relatedApps;
			}

			public void setRelatedApps(List<RelatedAppsItem2> relatedApps) {
				this.relatedApps = relatedApps;
			}

			public CertDetail getCertDetail() {
				return this.certDetail;
			}

			public void setCertDetail(CertDetail certDetail) {
				this.certDetail = certDetail;
			}

			public static class RelatedIngressRulesItem {

				private String name;

				private String namespace;

				private List<RelatedAppsItem> relatedApps1;

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

				public List<RelatedAppsItem> getRelatedApps1() {
					return this.relatedApps1;
				}

				public void setRelatedApps1(List<RelatedAppsItem> relatedApps1) {
					this.relatedApps1 = relatedApps1;
				}

				public static class RelatedAppsItem {

					private String appName;

					private String appId;

					public String getAppName() {
						return this.appName;
					}

					public void setAppName(String appName) {
						this.appName = appName;
					}

					public String getAppId() {
						return this.appId;
					}

					public void setAppId(String appId) {
						this.appId = appId;
					}
				}
			}

			public static class DataItem {

				private String key;

				private String value;

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
			}

			public static class RelatedAppsItem2 {

				private String appName;

				private String appId;

				public String getAppName() {
					return this.appName;
				}

				public void setAppName(String appName) {
					this.appName = appName;
				}

				public String getAppId() {
					return this.appId;
				}

				public void setAppId(String appId) {
					this.appId = appId;
				}
			}

			public static class CertDetail {

				private String endTime;

				private String status;

				private String startTime;

				private String issuer;

				private Integer keySize;

				private List<String> domainNames;

				public String getEndTime() {
					return this.endTime;
				}

				public void setEndTime(String endTime) {
					this.endTime = endTime;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public String getIssuer() {
					return this.issuer;
				}

				public void setIssuer(String issuer) {
					this.issuer = issuer;
				}

				public Integer getKeySize() {
					return this.keySize;
				}

				public void setKeySize(Integer keySize) {
					this.keySize = keySize;
				}

				public List<String> getDomainNames() {
					return this.domainNames;
				}

				public void setDomainNames(List<String> domainNames) {
					this.domainNames = domainNames;
				}
			}
		}
	}

	@Override
	public ListK8sSecretsResponse getInstance(UnmarshallerContext context) {
		return	ListK8sSecretsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
