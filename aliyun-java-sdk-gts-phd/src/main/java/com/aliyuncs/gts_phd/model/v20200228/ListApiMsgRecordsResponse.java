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

package com.aliyuncs.gts_phd.model.v20200228;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gts_phd.transform.v20200228.ListApiMsgRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApiMsgRecordsResponse extends AcsResponse {

	private Integer pageIndex;

	private Boolean success;

	private String requestId;

	private Long cnt;

	private String errorMessage;

	private Integer pageSize;

	private String errorCode;

	private List<ApiMsgSearchVO> data;

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getCnt() {
		return this.cnt;
	}

	public void setCnt(Long cnt) {
		this.cnt = cnt;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<ApiMsgSearchVO> getData() {
		return this.data;
	}

	public void setData(List<ApiMsgSearchVO> data) {
		this.data = data;
	}

	public static class ApiMsgSearchVO {

		private String msg;

		private String uid;

		private Long writeTime;

		private String msgId;

		private String state;

		private Integer type;

		public String getMsg() {
			return this.msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public String getUid() {
			return this.uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		public Long getWriteTime() {
			return this.writeTime;
		}

		public void setWriteTime(Long writeTime) {
			this.writeTime = writeTime;
		}

		public String getMsgId() {
			return this.msgId;
		}

		public void setMsgId(String msgId) {
			this.msgId = msgId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}
	}

	@Override
	public ListApiMsgRecordsResponse getInstance(UnmarshallerContext context) {
		return	ListApiMsgRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
