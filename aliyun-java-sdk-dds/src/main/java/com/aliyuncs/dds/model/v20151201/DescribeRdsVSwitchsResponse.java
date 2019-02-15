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

package com.aliyuncs.dds.model.v20151201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeRdsVSwitchsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRdsVSwitchsResponse extends AcsResponse {

	private String requestId;

	private VSwitches vSwitches;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public VSwitches getVSwitches() {
		return this.vSwitches;
	}

	public void setVSwitches(VSwitches vSwitches) {
		this.vSwitches = vSwitches;
	}

	public static class VSwitches {

		private List<VSwitchItem> vSwitch;

		public List<VSwitchItem> getVSwitch() {
			return this.vSwitch;
		}

		public void setVSwitch(List<VSwitchItem> vSwitch) {
			this.vSwitch = vSwitch;
		}

		public static class VSwitchItem {

			private String vSwitchId;

			private String vSwitchName;

			private String izNo;

			private String bid;

			private String aliUid;

			private String regionNo;

			private String cidrBlock;

			private Boolean isDefault;

			private String status;

			private String gmtCreate;

			private String gmtModified;

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public String getVSwitchName() {
				return this.vSwitchName;
			}

			public void setVSwitchName(String vSwitchName) {
				this.vSwitchName = vSwitchName;
			}

			public String getIzNo() {
				return this.izNo;
			}

			public void setIzNo(String izNo) {
				this.izNo = izNo;
			}

			public String getBid() {
				return this.bid;
			}

			public void setBid(String bid) {
				this.bid = bid;
			}

			public String getAliUid() {
				return this.aliUid;
			}

			public void setAliUid(String aliUid) {
				this.aliUid = aliUid;
			}

			public String getRegionNo() {
				return this.regionNo;
			}

			public void setRegionNo(String regionNo) {
				this.regionNo = regionNo;
			}

			public String getCidrBlock() {
				return this.cidrBlock;
			}

			public void setCidrBlock(String cidrBlock) {
				this.cidrBlock = cidrBlock;
			}

			public Boolean getIsDefault() {
				return this.isDefault;
			}

			public void setIsDefault(Boolean isDefault) {
				this.isDefault = isDefault;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}
		}
	}

	@Override
	public DescribeRdsVSwitchsResponse getInstance(UnmarshallerContext context) {
		return	DescribeRdsVSwitchsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
