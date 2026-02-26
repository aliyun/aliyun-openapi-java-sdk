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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeInstanceBandwidthDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceBandwidthDetailResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<Bandwidth> bandwidths;

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

	public List<Bandwidth> getBandwidths() {
		return this.bandwidths;
	}

	public void setBandwidths(List<Bandwidth> bandwidths) {
		this.bandwidths = bandwidths;
	}

	public static class Bandwidth {

		private String instanceId;

		private String serviceType;

		private String instanceType;

		private Long aliUid;

		private String ensRegionId;

		private Long txBw;

		private Long rxBw;

		private String ip;

		private String isp;

		private Integer flowType;

		private String bizTime;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public Long getTxBw() {
			return this.txBw;
		}

		public void setTxBw(Long txBw) {
			this.txBw = txBw;
		}

		public Long getRxBw() {
			return this.rxBw;
		}

		public void setRxBw(Long rxBw) {
			this.rxBw = rxBw;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getIsp() {
			return this.isp;
		}

		public void setIsp(String isp) {
			this.isp = isp;
		}

		public Integer getFlowType() {
			return this.flowType;
		}

		public void setFlowType(Integer flowType) {
			this.flowType = flowType;
		}

		public String getBizTime() {
			return this.bizTime;
		}

		public void setBizTime(String bizTime) {
			this.bizTime = bizTime;
		}
	}

	@Override
	public DescribeInstanceBandwidthDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceBandwidthDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
