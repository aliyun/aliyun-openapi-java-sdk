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

package com.aliyuncs.openitag.model.v20220616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.openitag.transform.v20220616.GetSubtaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSubtaskResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private String details;

	private Boolean success;

	private String errorCode;

	private Subtask subtask;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
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

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Subtask getSubtask() {
		return this.subtask;
	}

	public void setSubtask(Subtask subtask) {
		this.subtask = subtask;
	}

	public static class Subtask {

		private Long subtaskId;

		private String status;

		private List<ItemsItem> items;

		public Long getSubtaskId() {
			return this.subtaskId;
		}

		public void setSubtaskId(Long subtaskId) {
			this.subtaskId = subtaskId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<ItemsItem> getItems() {
			return this.items;
		}

		public void setItems(List<ItemsItem> items) {
			this.items = items;
		}

		public static class ItemsItem {

			private String feedbackRemark;

			private Boolean feedbackFlag;

			private String dataId;

			private String state;

			private Long mine;

			private Boolean rejectFlag;

			private Boolean fixedFlag;

			private Boolean abandonFlag;

			private String abandonRemark;

			private Long weight;

			private Long itemId;

			public String getFeedbackRemark() {
				return this.feedbackRemark;
			}

			public void setFeedbackRemark(String feedbackRemark) {
				this.feedbackRemark = feedbackRemark;
			}

			public Boolean getFeedbackFlag() {
				return this.feedbackFlag;
			}

			public void setFeedbackFlag(Boolean feedbackFlag) {
				this.feedbackFlag = feedbackFlag;
			}

			public String getDataId() {
				return this.dataId;
			}

			public void setDataId(String dataId) {
				this.dataId = dataId;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public Long getMine() {
				return this.mine;
			}

			public void setMine(Long mine) {
				this.mine = mine;
			}

			public Boolean getRejectFlag() {
				return this.rejectFlag;
			}

			public void setRejectFlag(Boolean rejectFlag) {
				this.rejectFlag = rejectFlag;
			}

			public Boolean getFixedFlag() {
				return this.fixedFlag;
			}

			public void setFixedFlag(Boolean fixedFlag) {
				this.fixedFlag = fixedFlag;
			}

			public Boolean getAbandonFlag() {
				return this.abandonFlag;
			}

			public void setAbandonFlag(Boolean abandonFlag) {
				this.abandonFlag = abandonFlag;
			}

			public String getAbandonRemark() {
				return this.abandonRemark;
			}

			public void setAbandonRemark(String abandonRemark) {
				this.abandonRemark = abandonRemark;
			}

			public Long getWeight() {
				return this.weight;
			}

			public void setWeight(Long weight) {
				this.weight = weight;
			}

			public Long getItemId() {
				return this.itemId;
			}

			public void setItemId(Long itemId) {
				this.itemId = itemId;
			}
		}
	}

	@Override
	public GetSubtaskResponse getInstance(UnmarshallerContext context) {
		return	GetSubtaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
