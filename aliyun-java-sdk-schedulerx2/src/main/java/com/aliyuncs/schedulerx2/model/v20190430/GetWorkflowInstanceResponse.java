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

package com.aliyuncs.schedulerx2.model.v20190430;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.schedulerx2.transform.v20190430.GetWorkflowInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetWorkflowInstanceResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private Boolean success;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private WfInstanceInfo wfInstanceInfo;

		private WfInstanceDag wfInstanceDag;

		public WfInstanceInfo getWfInstanceInfo() {
			return this.wfInstanceInfo;
		}

		public void setWfInstanceInfo(WfInstanceInfo wfInstanceInfo) {
			this.wfInstanceInfo = wfInstanceInfo;
		}

		public WfInstanceDag getWfInstanceDag() {
			return this.wfInstanceDag;
		}

		public void setWfInstanceDag(WfInstanceDag wfInstanceDag) {
			this.wfInstanceDag = wfInstanceDag;
		}

		public static class WfInstanceInfo {

			private Integer status;

			private String startTime;

			private String endTime;

			private String scheduleTime;

			private String dataTime;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getScheduleTime() {
				return this.scheduleTime;
			}

			public void setScheduleTime(String scheduleTime) {
				this.scheduleTime = scheduleTime;
			}

			public String getDataTime() {
				return this.dataTime;
			}

			public void setDataTime(String dataTime) {
				this.dataTime = dataTime;
			}
		}

		public static class WfInstanceDag {

			private List<Node> nodes;

			private List<Edge> edges;

			public List<Node> getNodes() {
				return this.nodes;
			}

			public void setNodes(List<Node> nodes) {
				this.nodes = nodes;
			}

			public List<Edge> getEdges() {
				return this.edges;
			}

			public void setEdges(List<Edge> edges) {
				this.edges = edges;
			}

			public static class Node {

				private Long jobInstanceId;

				private Long jobId;

				private String startTime;

				private String endTime;

				private String scheduleTime;

				private String dataTime;

				private String workAddr;

				private String result;

				private Integer attempt;

				private Integer status;

				private String jobName;

				public Long getJobInstanceId() {
					return this.jobInstanceId;
				}

				public void setJobInstanceId(Long jobInstanceId) {
					this.jobInstanceId = jobInstanceId;
				}

				public Long getJobId() {
					return this.jobId;
				}

				public void setJobId(Long jobId) {
					this.jobId = jobId;
				}

				public String getStartTime() {
					return this.startTime;
				}

				public void setStartTime(String startTime) {
					this.startTime = startTime;
				}

				public String getEndTime() {
					return this.endTime;
				}

				public void setEndTime(String endTime) {
					this.endTime = endTime;
				}

				public String getScheduleTime() {
					return this.scheduleTime;
				}

				public void setScheduleTime(String scheduleTime) {
					this.scheduleTime = scheduleTime;
				}

				public String getDataTime() {
					return this.dataTime;
				}

				public void setDataTime(String dataTime) {
					this.dataTime = dataTime;
				}

				public String getWorkAddr() {
					return this.workAddr;
				}

				public void setWorkAddr(String workAddr) {
					this.workAddr = workAddr;
				}

				public String getResult() {
					return this.result;
				}

				public void setResult(String result) {
					this.result = result;
				}

				public Integer getAttempt() {
					return this.attempt;
				}

				public void setAttempt(Integer attempt) {
					this.attempt = attempt;
				}

				public Integer getStatus() {
					return this.status;
				}

				public void setStatus(Integer status) {
					this.status = status;
				}

				public String getJobName() {
					return this.jobName;
				}

				public void setJobName(String jobName) {
					this.jobName = jobName;
				}
			}

			public static class Edge {

				private Long source;

				private Long target;

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
			}
		}
	}

	@Override
	public GetWorkflowInstanceResponse getInstance(UnmarshallerContext context) {
		return	GetWorkflowInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
