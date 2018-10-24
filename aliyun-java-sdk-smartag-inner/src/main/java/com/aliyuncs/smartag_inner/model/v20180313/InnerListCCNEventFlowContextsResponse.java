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

package com.aliyuncs.smartag_inner.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag_inner.transform.v20180313.InnerListCCNEventFlowContextsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerListCCNEventFlowContextsResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private Integer pageNumber;

	private Integer pageSize;

	private List<FlowContext> flowContexts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
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

	public List<FlowContext> getFlowContexts() {
		return this.flowContexts;
	}

	public void setFlowContexts(List<FlowContext> flowContexts) {
		this.flowContexts = flowContexts;
	}

	public static class FlowContext {

		private Long id;

		private String regionNo;

		private String instanceId;

		private String namespace;

		private String eventInstanceId;

		private String eventNamespace;

		private String state;

		private String gmtModify;

		private String gmtCreate;

		private List<FlowContextStep> flowContextSteps;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getEventInstanceId() {
			return this.eventInstanceId;
		}

		public void setEventInstanceId(String eventInstanceId) {
			this.eventInstanceId = eventInstanceId;
		}

		public String getEventNamespace() {
			return this.eventNamespace;
		}

		public void setEventNamespace(String eventNamespace) {
			this.eventNamespace = eventNamespace;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getGmtModify() {
			return this.gmtModify;
		}

		public void setGmtModify(String gmtModify) {
			this.gmtModify = gmtModify;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public List<FlowContextStep> getFlowContextSteps() {
			return this.flowContextSteps;
		}

		public void setFlowContextSteps(List<FlowContextStep> flowContextSteps) {
			this.flowContextSteps = flowContextSteps;
		}

		public static class FlowContextStep {

			private Long id;

			private String regionNo;

			private String instanceId;

			private String namespace;

			private String contextInstanceId;

			private String contextNamespace;

			private String state;

			private Long step;

			private Long data;

			private Long message;

			private String gmtCreate;

			private String gmtModify;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getRegionNo() {
				return this.regionNo;
			}

			public void setRegionNo(String regionNo) {
				this.regionNo = regionNo;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}

			public String getContextInstanceId() {
				return this.contextInstanceId;
			}

			public void setContextInstanceId(String contextInstanceId) {
				this.contextInstanceId = contextInstanceId;
			}

			public String getContextNamespace() {
				return this.contextNamespace;
			}

			public void setContextNamespace(String contextNamespace) {
				this.contextNamespace = contextNamespace;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public Long getStep() {
				return this.step;
			}

			public void setStep(Long step) {
				this.step = step;
			}

			public Long getData() {
				return this.data;
			}

			public void setData(Long data) {
				this.data = data;
			}

			public Long getMessage() {
				return this.message;
			}

			public void setMessage(Long message) {
				this.message = message;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModify() {
				return this.gmtModify;
			}

			public void setGmtModify(String gmtModify) {
				this.gmtModify = gmtModify;
			}
		}
	}

	@Override
	public InnerListCCNEventFlowContextsResponse getInstance(UnmarshallerContext context) {
		return	InnerListCCNEventFlowContextsResponseUnmarshaller.unmarshall(this, context);
	}
}
