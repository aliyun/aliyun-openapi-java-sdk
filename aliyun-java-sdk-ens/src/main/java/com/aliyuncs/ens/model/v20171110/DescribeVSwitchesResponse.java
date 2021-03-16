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
import com.aliyuncs.ens.transform.v20171110.DescribeVSwitchesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVSwitchesResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<VSwitch> vSwitches;

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

	public List<VSwitch> getVSwitches() {
		return this.vSwitches;
	}

	public void setVSwitches(List<VSwitch> vSwitches) {
		this.vSwitches = vSwitches;
	}

	public static class VSwitch {

		private String status;

		private Long freeIpCount;

		private String createdTime;

		private String vSwitchId;

		private String cidrBlock;

		private String vSwitchName;

		private String ensRegionId;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getFreeIpCount() {
			return this.freeIpCount;
		}

		public void setFreeIpCount(Long freeIpCount) {
			this.freeIpCount = freeIpCount;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getCidrBlock() {
			return this.cidrBlock;
		}

		public void setCidrBlock(String cidrBlock) {
			this.cidrBlock = cidrBlock;
		}

		public String getVSwitchName() {
			return this.vSwitchName;
		}

		public void setVSwitchName(String vSwitchName) {
			this.vSwitchName = vSwitchName;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}
	}

	@Override
	public DescribeVSwitchesResponse getInstance(UnmarshallerContext context) {
		return	DescribeVSwitchesResponseUnmarshaller.unmarshall(this, context);
	}
}
