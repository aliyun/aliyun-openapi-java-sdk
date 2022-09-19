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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListTaskFlowEdgesByConditionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTaskFlowEdgesByConditionResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private List<Edge> edges;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Edge> getEdges() {
		return this.edges;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

	public static class Edge {

		private Long id;

		private Long nodeEnd;

		private Long nodeFrom;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getNodeEnd() {
			return this.nodeEnd;
		}

		public void setNodeEnd(Long nodeEnd) {
			this.nodeEnd = nodeEnd;
		}

		public Long getNodeFrom() {
			return this.nodeFrom;
		}

		public void setNodeFrom(Long nodeFrom) {
			this.nodeFrom = nodeFrom;
		}
	}

	@Override
	public ListTaskFlowEdgesByConditionResponse getInstance(UnmarshallerContext context) {
		return	ListTaskFlowEdgesByConditionResponseUnmarshaller.unmarshall(this, context);
	}
}
