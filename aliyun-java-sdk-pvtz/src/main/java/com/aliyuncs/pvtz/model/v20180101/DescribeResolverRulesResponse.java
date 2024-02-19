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

package com.aliyuncs.pvtz.model.v20180101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pvtz.transform.v20180101.DescribeResolverRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResolverRulesResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalPages;

	private Integer totalItems;

	private List<Rule> rules;

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

	public Integer getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getTotalItems() {
		return this.totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	public List<Rule> getRules() {
		return this.rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	public static class Rule {

		private String type;

		private String updateTime;

		private String endpointName;

		private String createTime;

		private String zoneName;

		private Long updateTimestamp;

		private String endpointId;

		private String name;

		private String id;

		private Long createTimestamp;

		private List<ForwardIp> forwardIps;

		private List<Vpc> bindVpcs;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getEndpointName() {
			return this.endpointName;
		}

		public void setEndpointName(String endpointName) {
			this.endpointName = endpointName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getZoneName() {
			return this.zoneName;
		}

		public void setZoneName(String zoneName) {
			this.zoneName = zoneName;
		}

		public Long getUpdateTimestamp() {
			return this.updateTimestamp;
		}

		public void setUpdateTimestamp(Long updateTimestamp) {
			this.updateTimestamp = updateTimestamp;
		}

		public String getEndpointId() {
			return this.endpointId;
		}

		public void setEndpointId(String endpointId) {
			this.endpointId = endpointId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public List<ForwardIp> getForwardIps() {
			return this.forwardIps;
		}

		public void setForwardIps(List<ForwardIp> forwardIps) {
			this.forwardIps = forwardIps;
		}

		public List<Vpc> getBindVpcs() {
			return this.bindVpcs;
		}

		public void setBindVpcs(List<Vpc> bindVpcs) {
			this.bindVpcs = bindVpcs;
		}

		public static class ForwardIp {

			private String ip;

			private Integer port;

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}
		}

		public static class Vpc {

			private String vpcName;

			private String vpcId;

			private String vpcType;

			private String regionName;

			private String regionId;

			private String vpcUserId;

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

			public String getVpcType() {
				return this.vpcType;
			}

			public void setVpcType(String vpcType) {
				this.vpcType = vpcType;
			}

			public String getRegionName() {
				return this.regionName;
			}

			public void setRegionName(String regionName) {
				this.regionName = regionName;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getVpcUserId() {
				return this.vpcUserId;
			}

			public void setVpcUserId(String vpcUserId) {
				this.vpcUserId = vpcUserId;
			}
		}
	}

	@Override
	public DescribeResolverRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeResolverRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
