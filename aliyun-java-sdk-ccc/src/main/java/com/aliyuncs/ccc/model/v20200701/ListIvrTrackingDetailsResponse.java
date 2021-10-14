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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.ListIvrTrackingDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListIvrTrackingDetailsResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<IvrTracking> list;

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<IvrTracking> getList() {
			return this.list;
		}

		public void setList(List<IvrTracking> list) {
			this.list = list;
		}

		public static class IvrTracking {

			private String callee;

			private String caller;

			private String channelId;

			private String channelVariables;

			private String contactId;

			private Long enterTime;

			private String flowId;

			private String flowName;

			private String instance;

			private Long leaveTime;

			private String nodeExitCode;

			private String nodeId;

			private String nodeName;

			private Map<Object,Object> nodeProperties;

			private String nodeType;

			private Map<Object,Object> nodeVariables;

			public String getCallee() {
				return this.callee;
			}

			public void setCallee(String callee) {
				this.callee = callee;
			}

			public String getCaller() {
				return this.caller;
			}

			public void setCaller(String caller) {
				this.caller = caller;
			}

			public String getChannelId() {
				return this.channelId;
			}

			public void setChannelId(String channelId) {
				this.channelId = channelId;
			}

			public String getChannelVariables() {
				return this.channelVariables;
			}

			public void setChannelVariables(String channelVariables) {
				this.channelVariables = channelVariables;
			}

			public String getContactId() {
				return this.contactId;
			}

			public void setContactId(String contactId) {
				this.contactId = contactId;
			}

			public Long getEnterTime() {
				return this.enterTime;
			}

			public void setEnterTime(Long enterTime) {
				this.enterTime = enterTime;
			}

			public String getFlowId() {
				return this.flowId;
			}

			public void setFlowId(String flowId) {
				this.flowId = flowId;
			}

			public String getFlowName() {
				return this.flowName;
			}

			public void setFlowName(String flowName) {
				this.flowName = flowName;
			}

			public String getInstance() {
				return this.instance;
			}

			public void setInstance(String instance) {
				this.instance = instance;
			}

			public Long getLeaveTime() {
				return this.leaveTime;
			}

			public void setLeaveTime(Long leaveTime) {
				this.leaveTime = leaveTime;
			}

			public String getNodeExitCode() {
				return this.nodeExitCode;
			}

			public void setNodeExitCode(String nodeExitCode) {
				this.nodeExitCode = nodeExitCode;
			}

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public Map<Object,Object> getNodeProperties() {
				return this.nodeProperties;
			}

			public void setNodeProperties(Map<Object,Object> nodeProperties) {
				this.nodeProperties = nodeProperties;
			}

			public String getNodeType() {
				return this.nodeType;
			}

			public void setNodeType(String nodeType) {
				this.nodeType = nodeType;
			}

			public Map<Object,Object> getNodeVariables() {
				return this.nodeVariables;
			}

			public void setNodeVariables(Map<Object,Object> nodeVariables) {
				this.nodeVariables = nodeVariables;
			}
		}
	}

	@Override
	public ListIvrTrackingDetailsResponse getInstance(UnmarshallerContext context) {
		return	ListIvrTrackingDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
