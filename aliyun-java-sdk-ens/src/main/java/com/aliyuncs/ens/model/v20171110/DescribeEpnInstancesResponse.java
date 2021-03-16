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
import com.aliyuncs.ens.transform.v20171110.DescribeEpnInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEpnInstancesResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<EPNInstance> ePNInstances;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<EPNInstance> getEPNInstances() {
		return this.ePNInstances;
	}

	public void setEPNInstances(List<EPNInstance> ePNInstances) {
		this.ePNInstances = ePNInstances;
	}

	public static class EPNInstance {

		private String status;

		private String ePNInstanceType;

		private String modifyTime;

		private Integer internetMaxBandwidthOut;

		private String endTime;

		private String networkingModel;

		private String startTime;

		private String creationTime;

		private String ePNInstanceId;

		private String ePNInstanceName;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getEPNInstanceType() {
			return this.ePNInstanceType;
		}

		public void setEPNInstanceType(String ePNInstanceType) {
			this.ePNInstanceType = ePNInstanceType;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public Integer getInternetMaxBandwidthOut() {
			return this.internetMaxBandwidthOut;
		}

		public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
			this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getNetworkingModel() {
			return this.networkingModel;
		}

		public void setNetworkingModel(String networkingModel) {
			this.networkingModel = networkingModel;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getEPNInstanceId() {
			return this.ePNInstanceId;
		}

		public void setEPNInstanceId(String ePNInstanceId) {
			this.ePNInstanceId = ePNInstanceId;
		}

		public String getEPNInstanceName() {
			return this.ePNInstanceName;
		}

		public void setEPNInstanceName(String ePNInstanceName) {
			this.ePNInstanceName = ePNInstanceName;
		}
	}

	@Override
	public DescribeEpnInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeEpnInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
