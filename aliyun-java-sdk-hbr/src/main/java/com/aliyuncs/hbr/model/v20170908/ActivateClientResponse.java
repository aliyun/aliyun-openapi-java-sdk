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

package com.aliyuncs.hbr.model.v20170908;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbr.transform.v20170908.ActivateClientResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ActivateClientResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private String token;

	private String vaultUrl;

	private String clientId;

	private String accessCode;

	private String vaultId;

	private Long accountId;

	private String environment;

	private String clusterId;

	private String vaultType;

	private Boolean useHttps;

	private List<String> sourceTypes;

	private MqttInfo mqttInfo;

	private OtsInfo otsInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getVaultUrl() {
		return this.vaultUrl;
	}

	public void setVaultUrl(String vaultUrl) {
		this.vaultUrl = vaultUrl;
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getAccessCode() {
		return this.accessCode;
	}

	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}

	public String getVaultId() {
		return this.vaultId;
	}

	public void setVaultId(String vaultId) {
		this.vaultId = vaultId;
	}

	public Long getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getEnvironment() {
		return this.environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getVaultType() {
		return this.vaultType;
	}

	public void setVaultType(String vaultType) {
		this.vaultType = vaultType;
	}

	public Boolean getUseHttps() {
		return this.useHttps;
	}

	public void setUseHttps(Boolean useHttps) {
		this.useHttps = useHttps;
	}

	public List<String> getSourceTypes() {
		return this.sourceTypes;
	}

	public void setSourceTypes(List<String> sourceTypes) {
		this.sourceTypes = sourceTypes;
	}

	public MqttInfo getMqttInfo() {
		return this.mqttInfo;
	}

	public void setMqttInfo(MqttInfo mqttInfo) {
		this.mqttInfo = mqttInfo;
	}

	public OtsInfo getOtsInfo() {
		return this.otsInfo;
	}

	public void setOtsInfo(OtsInfo otsInfo) {
		this.otsInfo = otsInfo;
	}

	public static class MqttInfo {

		private String broker;

		private String pubTopic;

		private String clientId;

		private String clusterPubTopic;

		private String subTopic;

		private String authServer;

		private String username;

		private String password;

		private Brokers brokers;

		public String getBroker() {
			return this.broker;
		}

		public void setBroker(String broker) {
			this.broker = broker;
		}

		public String getPubTopic() {
			return this.pubTopic;
		}

		public void setPubTopic(String pubTopic) {
			this.pubTopic = pubTopic;
		}

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public String getClusterPubTopic() {
			return this.clusterPubTopic;
		}

		public void setClusterPubTopic(String clusterPubTopic) {
			this.clusterPubTopic = clusterPubTopic;
		}

		public String getSubTopic() {
			return this.subTopic;
		}

		public void setSubTopic(String subTopic) {
			this.subTopic = subTopic;
		}

		public String getAuthServer() {
			return this.authServer;
		}

		public void setAuthServer(String authServer) {
			this.authServer = authServer;
		}

		public String getUsername() {
			return this.username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Brokers getBrokers() {
			return this.brokers;
		}

		public void setBrokers(Brokers brokers) {
			this.brokers = brokers;
		}

		public static class Brokers {

			private String vpc;

			private String pub;

			private String classic;

			public String getVpc() {
				return this.vpc;
			}

			public void setVpc(String vpc) {
				this.vpc = vpc;
			}

			public String getPub() {
				return this.pub;
			}

			public void setPub(String pub) {
				this.pub = pub;
			}

			public String getClassic() {
				return this.classic;
			}

			public void setClassic(String classic) {
				this.classic = classic;
			}
		}
	}

	public static class OtsInfo {

		private String endpoint;

		private String instanceName;

		private String hanaMetaTableName;

		public String getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getHanaMetaTableName() {
			return this.hanaMetaTableName;
		}

		public void setHanaMetaTableName(String hanaMetaTableName) {
			this.hanaMetaTableName = hanaMetaTableName;
		}
	}

	@Override
	public ActivateClientResponse getInstance(UnmarshallerContext context) {
		return	ActivateClientResponseUnmarshaller.unmarshall(this, context);
	}
}
