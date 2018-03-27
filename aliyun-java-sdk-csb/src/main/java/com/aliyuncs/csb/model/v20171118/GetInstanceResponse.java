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

package com.aliyuncs.csb.model.v20171118;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.csb.transform.v20171118.GetInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Instance instance;

		public Instance getInstance() {
			return this.instance;
		}

		public void setInstance(Instance instance) {
			this.instance = instance;
		}

		public static class Instance {

			private Integer apprLevel;

			private String apprUser1;

			private String apprUser2;

			private String brokerVpcId;

			private String brokerVpcName;

			private String clientVpcId;

			private String clientVpcName;

			private Integer clusterMembers;

			private Long credentialGroup;

			private String csbAccountId;

			private Long csbId;

			private Integer dbStatus;

			private String description;

			private String frontStatus;

			private Long gmtCreate;

			private Long gmtModified;

			private Long id;

			private Integer instanceCategory;

			private Integer instanceType;

			private String ipList;

			private Boolean isImported;

			private Boolean isPublic;

			private String name;

			private String ownerId;

			private String sentinelCtlStr;

			private Long sentinelCtrl;

			private Integer sentinelGridInterval;

			private Long sentinelQps;

			private String status;

			private Integer statusCode;

			private String tenantId;

			private Boolean testable;

			private String userId;

			private Boolean visible;

			private String vpcName;

			public Integer getApprLevel() {
				return this.apprLevel;
			}

			public void setApprLevel(Integer apprLevel) {
				this.apprLevel = apprLevel;
			}

			public String getApprUser1() {
				return this.apprUser1;
			}

			public void setApprUser1(String apprUser1) {
				this.apprUser1 = apprUser1;
			}

			public String getApprUser2() {
				return this.apprUser2;
			}

			public void setApprUser2(String apprUser2) {
				this.apprUser2 = apprUser2;
			}

			public String getBrokerVpcId() {
				return this.brokerVpcId;
			}

			public void setBrokerVpcId(String brokerVpcId) {
				this.brokerVpcId = brokerVpcId;
			}

			public String getBrokerVpcName() {
				return this.brokerVpcName;
			}

			public void setBrokerVpcName(String brokerVpcName) {
				this.brokerVpcName = brokerVpcName;
			}

			public String getClientVpcId() {
				return this.clientVpcId;
			}

			public void setClientVpcId(String clientVpcId) {
				this.clientVpcId = clientVpcId;
			}

			public String getClientVpcName() {
				return this.clientVpcName;
			}

			public void setClientVpcName(String clientVpcName) {
				this.clientVpcName = clientVpcName;
			}

			public Integer getClusterMembers() {
				return this.clusterMembers;
			}

			public void setClusterMembers(Integer clusterMembers) {
				this.clusterMembers = clusterMembers;
			}

			public Long getCredentialGroup() {
				return this.credentialGroup;
			}

			public void setCredentialGroup(Long credentialGroup) {
				this.credentialGroup = credentialGroup;
			}

			public String getCsbAccountId() {
				return this.csbAccountId;
			}

			public void setCsbAccountId(String csbAccountId) {
				this.csbAccountId = csbAccountId;
			}

			public Long getCsbId() {
				return this.csbId;
			}

			public void setCsbId(Long csbId) {
				this.csbId = csbId;
			}

			public Integer getDbStatus() {
				return this.dbStatus;
			}

			public void setDbStatus(Integer dbStatus) {
				this.dbStatus = dbStatus;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getFrontStatus() {
				return this.frontStatus;
			}

			public void setFrontStatus(String frontStatus) {
				this.frontStatus = frontStatus;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Integer getInstanceCategory() {
				return this.instanceCategory;
			}

			public void setInstanceCategory(Integer instanceCategory) {
				this.instanceCategory = instanceCategory;
			}

			public Integer getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(Integer instanceType) {
				this.instanceType = instanceType;
			}

			public String getIpList() {
				return this.ipList;
			}

			public void setIpList(String ipList) {
				this.ipList = ipList;
			}

			public Boolean getIsImported() {
				return this.isImported;
			}

			public void setIsImported(Boolean isImported) {
				this.isImported = isImported;
			}

			public Boolean getIsPublic() {
				return this.isPublic;
			}

			public void setIsPublic(Boolean isPublic) {
				this.isPublic = isPublic;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(String ownerId) {
				this.ownerId = ownerId;
			}

			public String getSentinelCtlStr() {
				return this.sentinelCtlStr;
			}

			public void setSentinelCtlStr(String sentinelCtlStr) {
				this.sentinelCtlStr = sentinelCtlStr;
			}

			public Long getSentinelCtrl() {
				return this.sentinelCtrl;
			}

			public void setSentinelCtrl(Long sentinelCtrl) {
				this.sentinelCtrl = sentinelCtrl;
			}

			public Integer getSentinelGridInterval() {
				return this.sentinelGridInterval;
			}

			public void setSentinelGridInterval(Integer sentinelGridInterval) {
				this.sentinelGridInterval = sentinelGridInterval;
			}

			public Long getSentinelQps() {
				return this.sentinelQps;
			}

			public void setSentinelQps(Long sentinelQps) {
				this.sentinelQps = sentinelQps;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Integer getStatusCode() {
				return this.statusCode;
			}

			public void setStatusCode(Integer statusCode) {
				this.statusCode = statusCode;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public Boolean getTestable() {
				return this.testable;
			}

			public void setTestable(Boolean testable) {
				this.testable = testable;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public Boolean getVisible() {
				return this.visible;
			}

			public void setVisible(Boolean visible) {
				this.visible = visible;
			}

			public String getVpcName() {
				return this.vpcName;
			}

			public void setVpcName(String vpcName) {
				this.vpcName = vpcName;
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
