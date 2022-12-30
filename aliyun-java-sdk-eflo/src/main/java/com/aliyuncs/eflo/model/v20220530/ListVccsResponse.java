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

package com.aliyuncs.eflo.model.v20220530;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eflo.transform.v20220530.ListVccsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVccsResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Content content;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Content getContent() {
		return this.content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public static class Content {

		private Long total;

		private List<DataItem> data;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public static class DataItem {

			private String tenantId;

			private String regionId;

			private String vccId;

			private String vpdId;

			private String vpcId;

			private String cenId;

			private String vccName;

			private String accessPointId;

			private String lineOperator;

			private String spec;

			private String portType;

			private String status;

			private String message;

			private String createTime;

			private String gmtModified;

			private Double rate;

			private String bandwidthStr;

			private String bgpCidr;

			private VpdBaseInfo vpdBaseInfo;

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getVccId() {
				return this.vccId;
			}

			public void setVccId(String vccId) {
				this.vccId = vccId;
			}

			public String getVpdId() {
				return this.vpdId;
			}

			public void setVpdId(String vpdId) {
				this.vpdId = vpdId;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getCenId() {
				return this.cenId;
			}

			public void setCenId(String cenId) {
				this.cenId = cenId;
			}

			public String getVccName() {
				return this.vccName;
			}

			public void setVccName(String vccName) {
				this.vccName = vccName;
			}

			public String getAccessPointId() {
				return this.accessPointId;
			}

			public void setAccessPointId(String accessPointId) {
				this.accessPointId = accessPointId;
			}

			public String getLineOperator() {
				return this.lineOperator;
			}

			public void setLineOperator(String lineOperator) {
				this.lineOperator = lineOperator;
			}

			public String getSpec() {
				return this.spec;
			}

			public void setSpec(String spec) {
				this.spec = spec;
			}

			public String getPortType() {
				return this.portType;
			}

			public void setPortType(String portType) {
				this.portType = portType;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Double getRate() {
				return this.rate;
			}

			public void setRate(Double rate) {
				this.rate = rate;
			}

			public String getBandwidthStr() {
				return this.bandwidthStr;
			}

			public void setBandwidthStr(String bandwidthStr) {
				this.bandwidthStr = bandwidthStr;
			}

			public String getBgpCidr() {
				return this.bgpCidr;
			}

			public void setBgpCidr(String bgpCidr) {
				this.bgpCidr = bgpCidr;
			}

			public VpdBaseInfo getVpdBaseInfo() {
				return this.vpdBaseInfo;
			}

			public void setVpdBaseInfo(VpdBaseInfo vpdBaseInfo) {
				this.vpdBaseInfo = vpdBaseInfo;
			}

			public static class VpdBaseInfo {

				private String vpdId;

				private String name;

				private String cidr;

				private String gmtCreate;

				public String getVpdId() {
					return this.vpdId;
				}

				public void setVpdId(String vpdId) {
					this.vpdId = vpdId;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getCidr() {
					return this.cidr;
				}

				public void setCidr(String cidr) {
					this.cidr = cidr;
				}

				public String getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(String gmtCreate) {
					this.gmtCreate = gmtCreate;
				}
			}
		}
	}

	@Override
	public ListVccsResponse getInstance(UnmarshallerContext context) {
		return	ListVccsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
