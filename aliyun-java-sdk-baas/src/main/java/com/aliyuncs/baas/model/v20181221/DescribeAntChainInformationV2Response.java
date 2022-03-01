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

package com.aliyuncs.baas.model.v20181221;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.DescribeAntChainInformationV2ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAntChainInformationV2Response extends AcsResponse {

	private String httpStatusCode;

	private String requestId;

	private Boolean success;

	private String resultMessage;

	private String code;

	private String message;

	private String resultCode;

	private Result result;

	public String getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Boolean isRole;

		private Integer transactionSum;

		private String version;

		private Long createTime;

		private Integer blockHeight;

		private Integer nodeNumber;

		private Integer abnormalNodes;

		private String antChainId;

		private Boolean normal;

		private List<NodeInfosItem> nodeInfos;

		public Boolean getIsRole() {
			return this.isRole;
		}

		public void setIsRole(Boolean isRole) {
			this.isRole = isRole;
		}

		public Integer getTransactionSum() {
			return this.transactionSum;
		}

		public void setTransactionSum(Integer transactionSum) {
			this.transactionSum = transactionSum;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Integer getBlockHeight() {
			return this.blockHeight;
		}

		public void setBlockHeight(Integer blockHeight) {
			this.blockHeight = blockHeight;
		}

		public Integer getNodeNumber() {
			return this.nodeNumber;
		}

		public void setNodeNumber(Integer nodeNumber) {
			this.nodeNumber = nodeNumber;
		}

		public Integer getAbnormalNodes() {
			return this.abnormalNodes;
		}

		public void setAbnormalNodes(Integer abnormalNodes) {
			this.abnormalNodes = abnormalNodes;
		}

		public String getAntChainId() {
			return this.antChainId;
		}

		public void setAntChainId(String antChainId) {
			this.antChainId = antChainId;
		}

		public Boolean getNormal() {
			return this.normal;
		}

		public void setNormal(Boolean normal) {
			this.normal = normal;
		}

		public List<NodeInfosItem> getNodeInfos() {
			return this.nodeInfos;
		}

		public void setNodeInfos(List<NodeInfosItem> nodeInfos) {
			this.nodeInfos = nodeInfos;
		}

		public static class NodeInfosItem {

			private Boolean status;

			private String nodeName;

			private String version;

			private Long blockHeight;

			public Boolean getStatus() {
				return this.status;
			}

			public void setStatus(Boolean status) {
				this.status = status;
			}

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
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
	public DescribeAntChainInformationV2Response getInstance(UnmarshallerContext context) {
		return	DescribeAntChainInformationV2ResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
