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

package com.aliyuncs.baas.model.v20180731;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20180731.DescribeMySuccessAppliesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMySuccessAppliesResponse extends AcsResponse {

	private String requestId;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String bizid;

		private Integer nodeNumber;

		private Integer blockHeight;

		private Integer transactionSum;

		private Long createTime;

		private Integer abnormalNodes;

		private String version;

		private Boolean isRole;

		private Boolean normal;

		private String name;

		private List<NodeInfoListItem> nodeInfoList;

		public String getBizid() {
			return this.bizid;
		}

		public void setBizid(String bizid) {
			this.bizid = bizid;
		}

		public Integer getNodeNumber() {
			return this.nodeNumber;
		}

		public void setNodeNumber(Integer nodeNumber) {
			this.nodeNumber = nodeNumber;
		}

		public Integer getBlockHeight() {
			return this.blockHeight;
		}

		public void setBlockHeight(Integer blockHeight) {
			this.blockHeight = blockHeight;
		}

		public Integer getTransactionSum() {
			return this.transactionSum;
		}

		public void setTransactionSum(Integer transactionSum) {
			this.transactionSum = transactionSum;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Integer getAbnormalNodes() {
			return this.abnormalNodes;
		}

		public void setAbnormalNodes(Integer abnormalNodes) {
			this.abnormalNodes = abnormalNodes;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public Boolean getIsRole() {
			return this.isRole;
		}

		public void setIsRole(Boolean isRole) {
			this.isRole = isRole;
		}

		public Boolean getNormal() {
			return this.normal;
		}

		public void setNormal(Boolean normal) {
			this.normal = normal;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<NodeInfoListItem> getNodeInfoList() {
			return this.nodeInfoList;
		}

		public void setNodeInfoList(List<NodeInfoListItem> nodeInfoList) {
			this.nodeInfoList = nodeInfoList;
		}

		public static class NodeInfoListItem {

			private String nodeName;

			private Boolean status;

			private String version;

			private Long blockHeight;

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public Boolean getStatus() {
				return this.status;
			}

			public void setStatus(Boolean status) {
				this.status = status;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public Long getBlockHeight() {
				return this.blockHeight;
			}

			public void setBlockHeight(Long blockHeight) {
				this.blockHeight = blockHeight;
			}
		}
	}

	@Override
	public DescribeMySuccessAppliesResponse getInstance(UnmarshallerContext context) {
		return	DescribeMySuccessAppliesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
