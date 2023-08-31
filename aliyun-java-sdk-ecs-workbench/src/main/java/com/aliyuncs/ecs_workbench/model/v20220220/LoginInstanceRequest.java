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

package com.aliyuncs.ecs_workbench.model.v20220220;

import com.aliyuncs.RpcAcsRequest;
import java.util.Map;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class LoginInstanceRequest extends RpcAcsRequest<LoginInstanceResponse> {
	   

	private PartnerInfo partnerInfo;

	private InstanceLoginInfo instanceLoginInfo;

	private UserAccount userAccount;
	public LoginInstanceRequest() {
		super("ecs-workbench", "2022-02-20", "LoginInstance", "ecs-workbench");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public PartnerInfo getPartnerInfo() {
		return this.partnerInfo;
	}

	public void setPartnerInfo(PartnerInfo partnerInfo) {
		this.partnerInfo = partnerInfo;	
		if (partnerInfo != null) {
			
				putQueryParameter("PartnerInfo.PartnerName" , partnerInfo.getPartnerName());
				putQueryParameter("PartnerInfo.PartnerId" , partnerInfo.getPartnerId());
		}	
	}

	public InstanceLoginInfo getInstanceLoginInfo() {
		return this.instanceLoginInfo;
	}

	public void setInstanceLoginInfo(InstanceLoginInfo instanceLoginInfo) {
		this.instanceLoginInfo = instanceLoginInfo;	
		if (instanceLoginInfo != null) {
			
				putQueryParameter("InstanceLoginInfo.ExpireTime" , instanceLoginInfo.getExpireTime());
				putQueryParameter("InstanceLoginInfo.Certificate" , instanceLoginInfo.getCertificate());
				putQueryParameter("InstanceLoginInfo.AuthenticationType" , instanceLoginInfo.getAuthenticationType());
				putQueryParameter("InstanceLoginInfo.DockerExec" , instanceLoginInfo.getDockerExec());
				putQueryParameter("InstanceLoginInfo.Protocol" , instanceLoginInfo.getBizProtocol());
				putQueryParameter("InstanceLoginInfo.Password" , instanceLoginInfo.getPassword());
				putQueryParameter("InstanceLoginInfo.InstanceId" , instanceLoginInfo.getInstanceId());
				putQueryParameter("InstanceLoginInfo.RegionId" , instanceLoginInfo.getRegionId());
				putQueryParameter("InstanceLoginInfo.Port" , instanceLoginInfo.getPort());
				putQueryParameter("InstanceLoginInfo.VpcId" , instanceLoginInfo.getVpcId());
				putQueryParameter("InstanceLoginInfo.Host" , instanceLoginInfo.getHost());
				if (instanceLoginInfo.getOptions() != null) {
					
						putQueryParameter("InstanceLoginInfo.Options.OperationDisableSeconds" , instanceLoginInfo.getOptions().getOperationDisableSeconds());
						putQueryParameter("InstanceLoginInfo.Options.NotificationRecipientUrl" , instanceLoginInfo.getOptions().getNotificationRecipientUrl());
						putQueryParameter("InstanceLoginInfo.Options.SessionControl" , instanceLoginInfo.getOptions().getSessionControl());
						putQueryParameter("InstanceLoginInfo.Options.VideoFreezeSeconds" , instanceLoginInfo.getOptions().getVideoFreezeSeconds());
						if (instanceLoginInfo.getOptions().getContainerInfo() != null) {
							
								if (instanceLoginInfo.getOptions().getContainerInfo().getHeaders() != null) {
									for (String key1: instanceLoginInfo.getOptions().getContainerInfo().getHeaders().keySet() ) {
										putQueryParameter("InstanceLoginInfo.Options.ContainerInfo.Headers.#" + key1.length() + "#" + key1 , instanceLoginInfo.getOptions().getContainerInfo().getHeaders().get(key1));
									}
								}
								putQueryParameter("InstanceLoginInfo.Options.ContainerInfo.Endpoint" , instanceLoginInfo.getOptions().getContainerInfo().getEndpoint());
								putQueryParameter("InstanceLoginInfo.Options.ContainerInfo.ContainerName" , instanceLoginInfo.getOptions().getContainerInfo().getContainerName());
								putQueryParameter("InstanceLoginInfo.Options.ContainerInfo.ClusterName" , instanceLoginInfo.getOptions().getContainerInfo().getClusterName());
								putQueryParameter("InstanceLoginInfo.Options.ContainerInfo.Namespace" , instanceLoginInfo.getOptions().getContainerInfo().getNamespace());
								putQueryParameter("InstanceLoginInfo.Options.ContainerInfo.PodName" , instanceLoginInfo.getOptions().getContainerInfo().getPodName());
								putQueryParameter("InstanceLoginInfo.Options.ContainerInfo.ClusterId" , instanceLoginInfo.getOptions().getContainerInfo().getClusterId());
								putQueryParameter("InstanceLoginInfo.Options.ContainerInfo.Deployment" , instanceLoginInfo.getOptions().getContainerInfo().getDeployment());
						}
						putQueryParameter("InstanceLoginInfo.Options.NotificationRetryIntervalSeconds" , instanceLoginInfo.getOptions().getNotificationRetryIntervalSeconds());
						putQueryParameter("InstanceLoginInfo.Options.AudioMuteSeconds" , instanceLoginInfo.getOptions().getAudioMuteSeconds());
						putQueryParameter("InstanceLoginInfo.Options.FixedHeight" , instanceLoginInfo.getOptions().getFixedHeight());
						putQueryParameter("InstanceLoginInfo.Options.FixedWidth" , instanceLoginInfo.getOptions().getFixedWidth());
						putQueryParameter("InstanceLoginInfo.Options.NotificationEventTypes" , instanceLoginInfo.getOptions().getNotificationEventTypes());
						putQueryParameter("InstanceLoginInfo.Options.NotificationRetryLimit" , instanceLoginInfo.getOptions().getNotificationRetryLimit());
				}
				putQueryParameter("InstanceLoginInfo.InstanceType" , instanceLoginInfo.getInstanceType());
				putQueryParameter("InstanceLoginInfo.DockerContainerName" , instanceLoginInfo.getDockerContainerName());
				putQueryParameter("InstanceLoginInfo.PassPhrase" , instanceLoginInfo.getPassPhrase());
				putQueryParameter("InstanceLoginInfo.DurationSeconds" , instanceLoginInfo.getDurationSeconds());
				putQueryParameter("InstanceLoginInfo.NetworkAccessMode" , instanceLoginInfo.getNetworkAccessMode());
				putQueryParameter("InstanceLoginInfo.Username" , instanceLoginInfo.getUsername());
		}	
	}

	public UserAccount getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;	
		if (userAccount != null) {
			
				putQueryParameter("UserAccount.AccountId" , userAccount.getAccountId());
				putQueryParameter("UserAccount.EmpId" , userAccount.getEmpId());
				putQueryParameter("UserAccount.ExpireTime" , userAccount.getExpireTime());
				putQueryParameter("UserAccount.LoginName" , userAccount.getLoginName());
				if (userAccount.getOptions() != null) {
					
						putQueryParameter("UserAccount.Options.LoginLimit" , userAccount.getOptions().getLoginLimit());
				}
				putQueryParameter("UserAccount.AccountStructure" , userAccount.getAccountStructure());
				putQueryParameter("UserAccount.DurationSeconds" , userAccount.getDurationSeconds());
				putQueryParameter("UserAccount.ParentId" , userAccount.getParentId());
				putQueryParameter("UserAccount.AccountPlatform" , userAccount.getAccountPlatform());
		}	
	}

	public static class PartnerInfo {

		private String partnerName;

		private String partnerId;

		public String getPartnerName() {
			return this.partnerName;
		}

		public void setPartnerName(String partnerName) {
			this.partnerName = partnerName;
		}

		public String getPartnerId() {
			return this.partnerId;
		}

		public void setPartnerId(String partnerId) {
			this.partnerId = partnerId;
		}
	}

	public static class InstanceLoginInfo {

		private String expireTime;

		private String certificate;

		private String authenticationType;

		private String dockerExec;

		private String protocol;

		private String password;

		private String instanceId;

		private String regionId;

		private Integer port;

		private String vpcId;

		private String host;

		private Options options;

		private String instanceType;

		private String dockerContainerName;

		private String passPhrase;

		private Long durationSeconds;

		private String networkAccessMode;

		private String username;

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getCertificate() {
			return this.certificate;
		}

		public void setCertificate(String certificate) {
			this.certificate = certificate;
		}

		public String getAuthenticationType() {
			return this.authenticationType;
		}

		public void setAuthenticationType(String authenticationType) {
			this.authenticationType = authenticationType;
		}

		public String getDockerExec() {
			return this.dockerExec;
		}

		public void setDockerExec(String dockerExec) {
			this.dockerExec = dockerExec;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getHost() {
			return this.host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public Options getOptions() {
			return this.options;
		}

		public void setOptions(Options options) {
			this.options = options;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getDockerContainerName() {
			return this.dockerContainerName;
		}

		public void setDockerContainerName(String dockerContainerName) {
			this.dockerContainerName = dockerContainerName;
		}

		public String getPassPhrase() {
			return this.passPhrase;
		}

		public void setPassPhrase(String passPhrase) {
			this.passPhrase = passPhrase;
		}

		public Long getDurationSeconds() {
			return this.durationSeconds;
		}

		public void setDurationSeconds(Long durationSeconds) {
			this.durationSeconds = durationSeconds;
		}

		public String getNetworkAccessMode() {
			return this.networkAccessMode;
		}

		public void setNetworkAccessMode(String networkAccessMode) {
			this.networkAccessMode = networkAccessMode;
		}

		public String getUsername() {
			return this.username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public static class Options {

			private Integer operationDisableSeconds;

			private String notificationRecipientUrl;

			private String sessionControl;

			private Integer videoFreezeSeconds;

			private ContainerInfo containerInfo;

			private Integer notificationRetryIntervalSeconds;

			private Integer audioMuteSeconds;

			private Integer fixedHeight;

			private Integer fixedWidth;

			private String notificationEventTypes;

			private Integer notificationRetryLimit;

			public Integer getOperationDisableSeconds() {
				return this.operationDisableSeconds;
			}

			public void setOperationDisableSeconds(Integer operationDisableSeconds) {
				this.operationDisableSeconds = operationDisableSeconds;
			}

			public String getNotificationRecipientUrl() {
				return this.notificationRecipientUrl;
			}

			public void setNotificationRecipientUrl(String notificationRecipientUrl) {
				this.notificationRecipientUrl = notificationRecipientUrl;
			}

			public String getSessionControl() {
				return this.sessionControl;
			}

			public void setSessionControl(String sessionControl) {
				this.sessionControl = sessionControl;
			}

			public Integer getVideoFreezeSeconds() {
				return this.videoFreezeSeconds;
			}

			public void setVideoFreezeSeconds(Integer videoFreezeSeconds) {
				this.videoFreezeSeconds = videoFreezeSeconds;
			}

			public ContainerInfo getContainerInfo() {
				return this.containerInfo;
			}

			public void setContainerInfo(ContainerInfo containerInfo) {
				this.containerInfo = containerInfo;
			}

			public Integer getNotificationRetryIntervalSeconds() {
				return this.notificationRetryIntervalSeconds;
			}

			public void setNotificationRetryIntervalSeconds(Integer notificationRetryIntervalSeconds) {
				this.notificationRetryIntervalSeconds = notificationRetryIntervalSeconds;
			}

			public Integer getAudioMuteSeconds() {
				return this.audioMuteSeconds;
			}

			public void setAudioMuteSeconds(Integer audioMuteSeconds) {
				this.audioMuteSeconds = audioMuteSeconds;
			}

			public Integer getFixedHeight() {
				return this.fixedHeight;
			}

			public void setFixedHeight(Integer fixedHeight) {
				this.fixedHeight = fixedHeight;
			}

			public Integer getFixedWidth() {
				return this.fixedWidth;
			}

			public void setFixedWidth(Integer fixedWidth) {
				this.fixedWidth = fixedWidth;
			}

			public String getNotificationEventTypes() {
				return this.notificationEventTypes;
			}

			public void setNotificationEventTypes(String notificationEventTypes) {
				this.notificationEventTypes = notificationEventTypes;
			}

			public Integer getNotificationRetryLimit() {
				return this.notificationRetryLimit;
			}

			public void setNotificationRetryLimit(Integer notificationRetryLimit) {
				this.notificationRetryLimit = notificationRetryLimit;
			}

			public static class ContainerInfo {

				private Map<String,String> headers;

				private String endpoint;

				private String containerName;

				private String clusterName;

				private String namespace;

				private String podName;

				private String clusterId;

				private String deployment;

				public Map<String,String> getHeaders() {
					return this.headers;
				}

				public void setHeaders(Map<String,String> headers) {
					this.headers = headers;
				}

				public String getEndpoint() {
					return this.endpoint;
				}

				public void setEndpoint(String endpoint) {
					this.endpoint = endpoint;
				}

				public String getContainerName() {
					return this.containerName;
				}

				public void setContainerName(String containerName) {
					this.containerName = containerName;
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

				public String getPodName() {
					return this.podName;
				}

				public void setPodName(String podName) {
					this.podName = podName;
				}

				public String getClusterId() {
					return this.clusterId;
				}

				public void setClusterId(String clusterId) {
					this.clusterId = clusterId;
				}

				public String getDeployment() {
					return this.deployment;
				}

				public void setDeployment(String deployment) {
					this.deployment = deployment;
				}
			}
		}
	}

	public static class UserAccount {

		private Long accountId;

		private String empId;

		private String expireTime;

		private String loginName;

		private Options options;

		private String accountStructure;

		private Long durationSeconds;

		private Long parentId;

		private String accountPlatform;

		public Long getAccountId() {
			return this.accountId;
		}

		public void setAccountId(Long accountId) {
			this.accountId = accountId;
		}

		public String getEmpId() {
			return this.empId;
		}

		public void setEmpId(String empId) {
			this.empId = empId;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getLoginName() {
			return this.loginName;
		}

		public void setLoginName(String loginName) {
			this.loginName = loginName;
		}

		public Options getOptions() {
			return this.options;
		}

		public void setOptions(Options options) {
			this.options = options;
		}

		public String getAccountStructure() {
			return this.accountStructure;
		}

		public void setAccountStructure(String accountStructure) {
			this.accountStructure = accountStructure;
		}

		public Long getDurationSeconds() {
			return this.durationSeconds;
		}

		public void setDurationSeconds(Long durationSeconds) {
			this.durationSeconds = durationSeconds;
		}

		public Long getParentId() {
			return this.parentId;
		}

		public void setParentId(Long parentId) {
			this.parentId = parentId;
		}

		public String getAccountPlatform() {
			return this.accountPlatform;
		}

		public void setAccountPlatform(String accountPlatform) {
			this.accountPlatform = accountPlatform;
		}

		public static class Options {

			private Long loginLimit;

			public Long getLoginLimit() {
				return this.loginLimit;
			}

			public void setLoginLimit(Long loginLimit) {
				this.loginLimit = loginLimit;
			}
		}
	}

	@Override
	public Class<LoginInstanceResponse> getResponseClass() {
		return LoginInstanceResponse.class;
	}

}
