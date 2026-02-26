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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeVSwitchListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVSwitchListResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<VSwitchesItem> vSwitches;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public List<VSwitchesItem> getVSwitches() {
		return this.vSwitches;
	}

	public void setVSwitches(List<VSwitchesItem> vSwitches) {
		this.vSwitches = vSwitches;
	}

	public static class VSwitchesItem {

		private String isDefault;

		private String status;

		private String izNo;

		private String gmtCreate;

		private String description;

		private String availableIpAddressCount;

		private String vSwitchId;

		private String cidrBlock;

		private String vSwitchName;

		private String shareType;

		public String getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(String isDefault) {
			this.isDefault = isDefault;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getIzNo() {
			return this.izNo;
		}

		public void setIzNo(String izNo) {
			this.izNo = izNo;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAvailableIpAddressCount() {
			return this.availableIpAddressCount;
		}

		public void setAvailableIpAddressCount(String availableIpAddressCount) {
			this.availableIpAddressCount = availableIpAddressCount;
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

		public String getShareType() {
			return this.shareType;
		}

		public void setShareType(String shareType) {
			this.shareType = shareType;
		}
	}

	@Override
	public DescribeVSwitchListResponse getInstance(UnmarshallerContext context) {
		return	DescribeVSwitchListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
