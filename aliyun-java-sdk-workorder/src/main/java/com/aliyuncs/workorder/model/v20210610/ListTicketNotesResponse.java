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

package com.aliyuncs.workorder.model.v20210610;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.workorder.transform.v20210610.ListTicketNotesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTicketNotesResponse extends AcsResponse {

	private Integer code;

	private String requestId;

	private String message;

	private Boolean success;

	private List<DataItem> data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Integer status;

		private Long createTime;

		private Integer type;

		private Long dialogId;

		private String tip;

		private Dialog dialog;

		private User user;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Long getDialogId() {
			return this.dialogId;
		}

		public void setDialogId(Long dialogId) {
			this.dialogId = dialogId;
		}

		public String getTip() {
			return this.tip;
		}

		public void setTip(String tip) {
			this.tip = tip;
		}

		public Dialog getDialog() {
			return this.dialog;
		}

		public void setDialog(Dialog dialog) {
			this.dialog = dialog;
		}

		public User getUser() {
			return this.user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public static class Dialog {

			private String content;

			private String schema;

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public String getSchema() {
				return this.schema;
			}

			public void setSchema(String schema) {
				this.schema = schema;
			}
		}

		public static class User {

			private String name;

			private Integer role;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getRole() {
				return this.role;
			}

			public void setRole(Integer role) {
				this.role = role;
			}
		}
	}

	@Override
	public ListTicketNotesResponse getInstance(UnmarshallerContext context) {
		return	ListTicketNotesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
