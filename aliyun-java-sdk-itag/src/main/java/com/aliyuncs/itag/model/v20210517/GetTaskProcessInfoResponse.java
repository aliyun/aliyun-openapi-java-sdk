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

package com.aliyuncs.itag.model.v20210517;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.itag.transform.v20210517.GetTaskProcessInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTaskProcessInfoResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String errInfo;

	private String msg;

	private Boolean succ;

	private String errorCode;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrInfo() {
		return this.errInfo;
	}

	public void setErrInfo(String errInfo) {
		this.errInfo = errInfo;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Boolean getSucc() {
		return this.succ;
	}

	public void setSucc(Boolean succ) {
		this.succ = succ;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String taskId;

		private Map<Object,Object> nodeSummary;

		private String stage;

		private Summary summary;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public Map<Object,Object> getNodeSummary() {
			return this.nodeSummary;
		}

		public void setNodeSummary(Map<Object,Object> nodeSummary) {
			this.nodeSummary = nodeSummary;
		}

		public String getStage() {
			return this.stage;
		}

		public void setStage(String stage) {
			this.stage = stage;
		}

		public Summary getSummary() {
			return this.summary;
		}

		public void setSummary(Summary summary) {
			this.summary = summary;
		}

		public static class Summary {

			private String node;

			private Integer totalSubTask;

			private Integer finishedSubTask;

			private Integer totalItem;

			private Integer finishedItem;

			private String state;

			private Long fixedItem;

			private Long abandonItem;

			public String getNode() {
				return this.node;
			}

			public void setNode(String node) {
				this.node = node;
			}

			public Integer getTotalSubTask() {
				return this.totalSubTask;
			}

			public void setTotalSubTask(Integer totalSubTask) {
				this.totalSubTask = totalSubTask;
			}

			public Integer getFinishedSubTask() {
				return this.finishedSubTask;
			}

			public void setFinishedSubTask(Integer finishedSubTask) {
				this.finishedSubTask = finishedSubTask;
			}

			public Integer getTotalItem() {
				return this.totalItem;
			}

			public void setTotalItem(Integer totalItem) {
				this.totalItem = totalItem;
			}

			public Integer getFinishedItem() {
				return this.finishedItem;
			}

			public void setFinishedItem(Integer finishedItem) {
				this.finishedItem = finishedItem;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public Long getFixedItem() {
				return this.fixedItem;
			}

			public void setFixedItem(Long fixedItem) {
				this.fixedItem = fixedItem;
			}

			public Long getAbandonItem() {
				return this.abandonItem;
			}

			public void setAbandonItem(Long abandonItem) {
				this.abandonItem = abandonItem;
			}
		}
	}

	@Override
	public GetTaskProcessInfoResponse getInstance(UnmarshallerContext context) {
		return	GetTaskProcessInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
