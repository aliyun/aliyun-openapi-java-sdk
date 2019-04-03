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

package com.aliyuncs.uis.model.v20180821;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.uis.transform.v20180821.DescribeUisNodesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUisNodesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<UisNode> uisNodeList;

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

	public List<UisNode> getUisNodeList() {
		return this.uisNodeList;
	}

	public void setUisNodeList(List<UisNode> uisNodeList) {
		this.uisNodeList = uisNodeList;
	}

	public static class UisNode {

		private String uisId;

		private String uisNodeId;

		private Integer uisNodeBandwidth;

		private String uisNodeAreaId;

		private String description;

		private String name;

		private String status;

		private Integer ipAddrsNum;

		private String uisNodeIps;

		private String uisNodeActiveIp;

		private Long createTime;

		private String uisEniIps;

		public String getUisId() {
			return this.uisId;
		}

		public void setUisId(String uisId) {
			this.uisId = uisId;
		}

		public String getUisNodeId() {
			return this.uisNodeId;
		}

		public void setUisNodeId(String uisNodeId) {
			this.uisNodeId = uisNodeId;
		}

		public Integer getUisNodeBandwidth() {
			return this.uisNodeBandwidth;
		}

		public void setUisNodeBandwidth(Integer uisNodeBandwidth) {
			this.uisNodeBandwidth = uisNodeBandwidth;
		}

		public String getUisNodeAreaId() {
			return this.uisNodeAreaId;
		}

		public void setUisNodeAreaId(String uisNodeAreaId) {
			this.uisNodeAreaId = uisNodeAreaId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getIpAddrsNum() {
			return this.ipAddrsNum;
		}

		public void setIpAddrsNum(Integer ipAddrsNum) {
			this.ipAddrsNum = ipAddrsNum;
		}

		public String getUisNodeIps() {
			return this.uisNodeIps;
		}

		public void setUisNodeIps(String uisNodeIps) {
			this.uisNodeIps = uisNodeIps;
		}

		public String getUisNodeActiveIp() {
			return this.uisNodeActiveIp;
		}

		public void setUisNodeActiveIp(String uisNodeActiveIp) {
			this.uisNodeActiveIp = uisNodeActiveIp;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getUisEniIps() {
			return this.uisEniIps;
		}

		public void setUisEniIps(String uisEniIps) {
			this.uisEniIps = uisEniIps;
		}
	}

	@Override
	public DescribeUisNodesResponse getInstance(UnmarshallerContext context) {
		return	DescribeUisNodesResponseUnmarshaller.unmarshall(this, context);
	}
}
