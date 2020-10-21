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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeClusterMemberInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterMemberInfoResponse extends AcsResponse {

	private String requestId;

	private List<Children> clusterChildren;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Children> getClusterChildren() {
		return this.clusterChildren;
	}

	public void setClusterChildren(List<Children> clusterChildren) {
		this.clusterChildren = clusterChildren;
	}

	public static class Children {

		private Long id;

		private String name;

		private String bizType;

		private Integer replicaSize;

		private Integer modifier;

		private String serviceVersion;

		private String connType;

		private Integer diskSizeMB;

		private String insType;

		private String nickname;

		private String primaryInsName;

		private String classCode;

		private Integer creator;

		private String resourceGroupName;

		private String lockMode;

		private String health;

		private Integer binlogRetentionDays;

		private String userId;

		private String lockReason;

		private String service;

		private Long capacity;

		private Long bandWidth;

		private Long connections;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public Integer getReplicaSize() {
			return this.replicaSize;
		}

		public void setReplicaSize(Integer replicaSize) {
			this.replicaSize = replicaSize;
		}

		public Integer getModifier() {
			return this.modifier;
		}

		public void setModifier(Integer modifier) {
			this.modifier = modifier;
		}

		public String getServiceVersion() {
			return this.serviceVersion;
		}

		public void setServiceVersion(String serviceVersion) {
			this.serviceVersion = serviceVersion;
		}

		public String getConnType() {
			return this.connType;
		}

		public void setConnType(String connType) {
			this.connType = connType;
		}

		public Integer getDiskSizeMB() {
			return this.diskSizeMB;
		}

		public void setDiskSizeMB(Integer diskSizeMB) {
			this.diskSizeMB = diskSizeMB;
		}

		public String getInsType() {
			return this.insType;
		}

		public void setInsType(String insType) {
			this.insType = insType;
		}

		public String getNickname() {
			return this.nickname;
		}

		public void setNickname(String nickname) {
			this.nickname = nickname;
		}

		public String getPrimaryInsName() {
			return this.primaryInsName;
		}

		public void setPrimaryInsName(String primaryInsName) {
			this.primaryInsName = primaryInsName;
		}

		public String getClassCode() {
			return this.classCode;
		}

		public void setClassCode(String classCode) {
			this.classCode = classCode;
		}

		public Integer getCreator() {
			return this.creator;
		}

		public void setCreator(Integer creator) {
			this.creator = creator;
		}

		public String getResourceGroupName() {
			return this.resourceGroupName;
		}

		public void setResourceGroupName(String resourceGroupName) {
			this.resourceGroupName = resourceGroupName;
		}

		public String getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(String lockMode) {
			this.lockMode = lockMode;
		}

		public String getHealth() {
			return this.health;
		}

		public void setHealth(String health) {
			this.health = health;
		}

		public Integer getBinlogRetentionDays() {
			return this.binlogRetentionDays;
		}

		public void setBinlogRetentionDays(Integer binlogRetentionDays) {
			this.binlogRetentionDays = binlogRetentionDays;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}

		public String getService() {
			return this.service;
		}

		public void setService(String service) {
			this.service = service;
		}

		public Long getCapacity() {
			return this.capacity;
		}

		public void setCapacity(Long capacity) {
			this.capacity = capacity;
		}

		public Long getBandWidth() {
			return this.bandWidth;
		}

		public void setBandWidth(Long bandWidth) {
			this.bandWidth = bandWidth;
		}

		public Long getConnections() {
			return this.connections;
		}

		public void setConnections(Long connections) {
			this.connections = connections;
		}
	}

	@Override
	public DescribeClusterMemberInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterMemberInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
