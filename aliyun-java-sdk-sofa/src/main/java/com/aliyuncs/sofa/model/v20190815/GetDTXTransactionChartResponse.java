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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetDTXTransactionChartResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDTXTransactionChartResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String bizId;

		private String bizType;

		private Long cost;

		private String endTime;

		private String lastHandleTime;

		private Long lowerLineCount;

		private Long participatorNum;

		private String starterIp;

		private String starterName;

		private String startTime;

		private String state;

		private String txId;

		private Long upperLineCount;

		private List<EdgesItem> edges;

		private List<NodesItem> nodes;

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public Long getCost() {
			return this.cost;
		}

		public void setCost(Long cost) {
			this.cost = cost;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getLastHandleTime() {
			return this.lastHandleTime;
		}

		public void setLastHandleTime(String lastHandleTime) {
			this.lastHandleTime = lastHandleTime;
		}

		public Long getLowerLineCount() {
			return this.lowerLineCount;
		}

		public void setLowerLineCount(Long lowerLineCount) {
			this.lowerLineCount = lowerLineCount;
		}

		public Long getParticipatorNum() {
			return this.participatorNum;
		}

		public void setParticipatorNum(Long participatorNum) {
			this.participatorNum = participatorNum;
		}

		public String getStarterIp() {
			return this.starterIp;
		}

		public void setStarterIp(String starterIp) {
			this.starterIp = starterIp;
		}

		public String getStarterName() {
			return this.starterName;
		}

		public void setStarterName(String starterName) {
			this.starterName = starterName;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getTxId() {
			return this.txId;
		}

		public void setTxId(String txId) {
			this.txId = txId;
		}

		public Long getUpperLineCount() {
			return this.upperLineCount;
		}

		public void setUpperLineCount(Long upperLineCount) {
			this.upperLineCount = upperLineCount;
		}

		public List<EdgesItem> getEdges() {
			return this.edges;
		}

		public void setEdges(List<EdgesItem> edges) {
			this.edges = edges;
		}

		public List<NodesItem> getNodes() {
			return this.nodes;
		}

		public void setNodes(List<NodesItem> nodes) {
			this.nodes = nodes;
		}

		public static class EdgesItem {

			private String content;

			private String errorMessage;

			private Long id;

			private Boolean isError;

			private Long source;

			private Long target;

			private String type;

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Boolean getIsError() {
				return this.isError;
			}

			public void setIsError(Boolean isError) {
				this.isError = isError;
			}

			public Long getSource() {
				return this.source;
			}

			public void setSource(Long source) {
				this.source = source;
			}

			public Long getTarget() {
				return this.target;
			}

			public void setTarget(Long target) {
				this.target = target;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}

		public static class NodesItem {

			private String endTime;

			private Long id;

			private Boolean isEnd;

			private String label;

			private String name;

			private String role;

			private String startTime;

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Boolean getIsEnd() {
				return this.isEnd;
			}

			public void setIsEnd(Boolean isEnd) {
				this.isEnd = isEnd;
			}

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}
		}
	}

	@Override
	public GetDTXTransactionChartResponse getInstance(UnmarshallerContext context) {
		return	GetDTXTransactionChartResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
