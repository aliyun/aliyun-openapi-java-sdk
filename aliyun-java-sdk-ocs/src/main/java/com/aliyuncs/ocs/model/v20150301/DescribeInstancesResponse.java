/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ocs.model.v20150301;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ocs.transform.v20150301.DescribeInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstancesResponse extends AcsResponse {

	private String requestId;

	private GetOcsInstancesResponse getOcsInstancesResponse;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public GetOcsInstancesResponse getGetOcsInstancesResponse() {
		return this.getOcsInstancesResponse;
	}

	public void setGetOcsInstancesResponse(GetOcsInstancesResponse getOcsInstancesResponse) {
		this.getOcsInstancesResponse = getOcsInstancesResponse;
	}

	public static class GetOcsInstancesResponse {

		private Integer total;

		private Integer pageNo;

		private Integer pageSize;

		private List<OcsInstance> ocsInstances;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<OcsInstance> getOcsInstances() {
			return this.ocsInstances;
		}

		public void setOcsInstances(List<OcsInstance> ocsInstances) {
			this.ocsInstances = ocsInstances;
		}

		public static class OcsInstance {

			private String ocsInstanceId;

			private String ocsInstanceName;

			private Long capacity;

			private Long qps;

			private Long bandwidth;

			private Long connections;

			private String connectionDomain;

			private Integer port;

			private String userName;

			private String regionId;

			private String ocsInstanceStatus;

			private String gmtCreated;

			private String endTime;

			private String chargeType;

			private String izId;

			private String networkType;

			private String vpcId;

			private String vSwitchId;

			private String privateIp;

			public String getOcsInstanceId() {
				return this.ocsInstanceId;
			}

			public void setOcsInstanceId(String ocsInstanceId) {
				this.ocsInstanceId = ocsInstanceId;
			}

			public String getOcsInstanceName() {
				return this.ocsInstanceName;
			}

			public void setOcsInstanceName(String ocsInstanceName) {
				this.ocsInstanceName = ocsInstanceName;
			}

			public Long getCapacity() {
				return this.capacity;
			}

			public void setCapacity(Long capacity) {
				this.capacity = capacity;
			}

			public Long getQps() {
				return this.qps;
			}

			public void setQps(Long qps) {
				this.qps = qps;
			}

			public Long getBandwidth() {
				return this.bandwidth;
			}

			public void setBandwidth(Long bandwidth) {
				this.bandwidth = bandwidth;
			}

			public Long getConnections() {
				return this.connections;
			}

			public void setConnections(Long connections) {
				this.connections = connections;
			}

			public String getConnectionDomain() {
				return this.connectionDomain;
			}

			public void setConnectionDomain(String connectionDomain) {
				this.connectionDomain = connectionDomain;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getOcsInstanceStatus() {
				return this.ocsInstanceStatus;
			}

			public void setOcsInstanceStatus(String ocsInstanceStatus) {
				this.ocsInstanceStatus = ocsInstanceStatus;
			}

			public String getgmtCreated() {
				return this.gmtCreated;
			}

			public void setgmtCreated(String gmtCreated) {
				this.gmtCreated = gmtCreated;
			}

			public String getendTime() {
				return this.endTime;
			}

			public void setendTime(String endTime) {
				this.endTime = endTime;
			}

			public String getchargeType() {
				return this.chargeType;
			}

			public void setchargeType(String chargeType) {
				this.chargeType = chargeType;
			}

			public String getizId() {
				return this.izId;
			}

			public void setizId(String izId) {
				this.izId = izId;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
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

			public String getPrivateIp() {
				return this.privateIp;
			}

			public void setPrivateIp(String privateIp) {
				this.privateIp = privateIp;
			}
		}
	}

	@Override
	public DescribeInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
