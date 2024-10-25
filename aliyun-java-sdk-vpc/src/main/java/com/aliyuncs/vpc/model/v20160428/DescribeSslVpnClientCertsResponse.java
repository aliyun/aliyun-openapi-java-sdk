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
import com.aliyuncs.vpc.transform.v20160428.DescribeSslVpnClientCertsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSslVpnClientCertsResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<SslVpnClientCertKey> sslVpnClientCertKeys;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<SslVpnClientCertKey> getSslVpnClientCertKeys() {
		return this.sslVpnClientCertKeys;
	}

	public void setSslVpnClientCertKeys(List<SslVpnClientCertKey> sslVpnClientCertKeys) {
		this.sslVpnClientCertKeys = sslVpnClientCertKeys;
	}

	public static class SslVpnClientCertKey {

		private String status;

		private Long endTime;

		private Long createTime;

		private String sslVpnClientCertId;

		private String sslVpnServerId;

		private String name;

		private String regionId;

		private String resourceGroupId;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getSslVpnClientCertId() {
			return this.sslVpnClientCertId;
		}

		public void setSslVpnClientCertId(String sslVpnClientCertId) {
			this.sslVpnClientCertId = sslVpnClientCertId;
		}

		public String getSslVpnServerId() {
			return this.sslVpnServerId;
		}

		public void setSslVpnServerId(String sslVpnServerId) {
			this.sslVpnServerId = sslVpnServerId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}
	}

	@Override
	public DescribeSslVpnClientCertsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSslVpnClientCertsResponseUnmarshaller.unmarshall(this, context);
	}
}
