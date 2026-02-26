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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeProxyServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeProxyServiceResponse extends AcsResponse {

	private String requestId;

	private Data data;

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

		private String proxyClusterId;

		private String proxyMode;

		private String zone;

		private String unitSpec;

		private Long unitNum;

		private Long currentEndpointNum;

		private Long endpointNumQuota;

		private String createTime;

		private String status;

		private String proxyServiceVersion;

		private String expireTime;

		private Long unitNumLimit;

		private String proxyVersion;

		private String deployMode;

		private Long serverNumLimit;

		private Boolean allowModifyServerNum;

		private Long sharedUnitNumLimit;

		private Long exclusiveUnitNumLimit;

		public String getProxyClusterId() {
			return this.proxyClusterId;
		}

		public void setProxyClusterId(String proxyClusterId) {
			this.proxyClusterId = proxyClusterId;
		}

		public String getProxyMode() {
			return this.proxyMode;
		}

		public void setProxyMode(String proxyMode) {
			this.proxyMode = proxyMode;
		}

		public String getZone() {
			return this.zone;
		}

		public void setZone(String zone) {
			this.zone = zone;
		}

		public String getUnitSpec() {
			return this.unitSpec;
		}

		public void setUnitSpec(String unitSpec) {
			this.unitSpec = unitSpec;
		}

		public Long getUnitNum() {
			return this.unitNum;
		}

		public void setUnitNum(Long unitNum) {
			this.unitNum = unitNum;
		}

		public Long getCurrentEndpointNum() {
			return this.currentEndpointNum;
		}

		public void setCurrentEndpointNum(Long currentEndpointNum) {
			this.currentEndpointNum = currentEndpointNum;
		}

		public Long getEndpointNumQuota() {
			return this.endpointNumQuota;
		}

		public void setEndpointNumQuota(Long endpointNumQuota) {
			this.endpointNumQuota = endpointNumQuota;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getProxyServiceVersion() {
			return this.proxyServiceVersion;
		}

		public void setProxyServiceVersion(String proxyServiceVersion) {
			this.proxyServiceVersion = proxyServiceVersion;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public Long getUnitNumLimit() {
			return this.unitNumLimit;
		}

		public void setUnitNumLimit(Long unitNumLimit) {
			this.unitNumLimit = unitNumLimit;
		}

		public String getProxyVersion() {
			return this.proxyVersion;
		}

		public void setProxyVersion(String proxyVersion) {
			this.proxyVersion = proxyVersion;
		}

		public String getDeployMode() {
			return this.deployMode;
		}

		public void setDeployMode(String deployMode) {
			this.deployMode = deployMode;
		}

		public Long getServerNumLimit() {
			return this.serverNumLimit;
		}

		public void setServerNumLimit(Long serverNumLimit) {
			this.serverNumLimit = serverNumLimit;
		}

		public Boolean getAllowModifyServerNum() {
			return this.allowModifyServerNum;
		}

		public void setAllowModifyServerNum(Boolean allowModifyServerNum) {
			this.allowModifyServerNum = allowModifyServerNum;
		}

		public Long getSharedUnitNumLimit() {
			return this.sharedUnitNumLimit;
		}

		public void setSharedUnitNumLimit(Long sharedUnitNumLimit) {
			this.sharedUnitNumLimit = sharedUnitNumLimit;
		}

		public Long getExclusiveUnitNumLimit() {
			return this.exclusiveUnitNumLimit;
		}

		public void setExclusiveUnitNumLimit(Long exclusiveUnitNumLimit) {
			this.exclusiveUnitNumLimit = exclusiveUnitNumLimit;
		}
	}

	@Override
	public DescribeProxyServiceResponse getInstance(UnmarshallerContext context) {
		return	DescribeProxyServiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
