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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeRdsVpcsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRdsVpcsResponse extends AcsResponse {

	private String requestId;

	private Vpcs vpcs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Vpcs getVpcs() {
		return this.vpcs;
	}

	public void setVpcs(Vpcs vpcs) {
		this.vpcs = vpcs;
	}

	public static class Vpcs {

		private List<VpcItem> vpc;

		public List<VpcItem> getVpc() {
			return this.vpc;
		}

		public void setVpc(List<VpcItem> vpc) {
			this.vpc = vpc;
		}

		public static class VpcItem {

			private String status;

			private String vpcName;

			private String vpcId;

			private Boolean isDefault;

			private String cidrBlock;

			private String regionNo;

			private String gmtCreate;

			private String aliUid;

			private String gmtModified;

			private String bid;

			private List<VSwitch> vSwitchs;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getVpcName() {
				return this.vpcName;
			}

			public void setVpcName(String vpcName) {
				this.vpcName = vpcName;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public Boolean getIsDefault() {
				return this.isDefault;
			}

			public void setIsDefault(Boolean isDefault) {
				this.isDefault = isDefault;
			}

			public String getCidrBlock() {
				return this.cidrBlock;
			}

			public void setCidrBlock(String cidrBlock) {
				this.cidrBlock = cidrBlock;
			}

			public String getRegionNo() {
				return this.regionNo;
			}

			public void setRegionNo(String regionNo) {
				this.regionNo = regionNo;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getAliUid() {
				return this.aliUid;
			}

			public void setAliUid(String aliUid) {
				this.aliUid = aliUid;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getBid() {
				return this.bid;
			}

			public void setBid(String bid) {
				this.bid = bid;
			}

			public List<VSwitch> getVSwitchs() {
				return this.vSwitchs;
			}

			public void setVSwitchs(List<VSwitch> vSwitchs) {
				this.vSwitchs = vSwitchs;
			}

			public static class VSwitch {

				private String status;

				private String vSwitchId;

				private Boolean isDefault;

				private String cidrBlock;

				private String gmtCreate;

				private String gmtModified;

				private String izNo;

				private String vSwitchName;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getVSwitchId() {
					return this.vSwitchId;
				}

				public void setVSwitchId(String vSwitchId) {
					this.vSwitchId = vSwitchId;
				}

				public Boolean getIsDefault() {
					return this.isDefault;
				}

				public void setIsDefault(Boolean isDefault) {
					this.isDefault = isDefault;
				}

				public String getCidrBlock() {
					return this.cidrBlock;
				}

				public void setCidrBlock(String cidrBlock) {
					this.cidrBlock = cidrBlock;
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

				public String getIzNo() {
					return this.izNo;
				}

				public void setIzNo(String izNo) {
					this.izNo = izNo;
				}

				public String getVSwitchName() {
					return this.vSwitchName;
				}

				public void setVSwitchName(String vSwitchName) {
					this.vSwitchName = vSwitchName;
				}
			}
		}
	}

	@Override
	public DescribeRdsVpcsResponse getInstance(UnmarshallerContext context) {
		return	DescribeRdsVpcsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
