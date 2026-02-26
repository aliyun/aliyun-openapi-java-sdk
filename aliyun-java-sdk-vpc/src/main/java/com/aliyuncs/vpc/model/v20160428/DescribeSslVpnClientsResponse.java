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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeSslVpnClientsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSslVpnClientsResponse extends AcsResponse {

	private String requestId;

	private String vpnGatewayId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private String regionId;

	private List<ClientInfo> clientInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getVpnGatewayId() {
		return this.vpnGatewayId;
	}

	public void setVpnGatewayId(String vpnGatewayId) {
		this.vpnGatewayId = vpnGatewayId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public List<ClientInfo> getClientInfoList() {
		return this.clientInfoList;
	}

	public void setClientInfoList(List<ClientInfo> clientInfoList) {
		this.clientInfoList = clientInfoList;
	}

	public static class ClientInfo {

		private String status;

		private String privateIp;

		private Long sendBytes;

		private Long connectedTime;

		private String commonName;

		private String ip;

		private Long receiveBytes;

		private String port;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPrivateIp() {
			return this.privateIp;
		}

		public void setPrivateIp(String privateIp) {
			this.privateIp = privateIp;
		}

		public Long getSendBytes() {
			return this.sendBytes;
		}

		public void setSendBytes(Long sendBytes) {
			this.sendBytes = sendBytes;
		}

		public Long getConnectedTime() {
			return this.connectedTime;
		}

		public void setConnectedTime(Long connectedTime) {
			this.connectedTime = connectedTime;
		}

		public String getCommonName() {
			return this.commonName;
		}

		public void setCommonName(String commonName) {
			this.commonName = commonName;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public Long getReceiveBytes() {
			return this.receiveBytes;
		}

		public void setReceiveBytes(Long receiveBytes) {
			this.receiveBytes = receiveBytes;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}
	}

	@Override
	public DescribeSslVpnClientsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSslVpnClientsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
