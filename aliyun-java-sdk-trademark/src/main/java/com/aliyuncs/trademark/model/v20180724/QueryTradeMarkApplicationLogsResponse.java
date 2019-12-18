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

package com.aliyuncs.trademark.model.v20180724;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20180724.QueryTradeMarkApplicationLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTradeMarkApplicationLogsResponse extends AcsResponse {

	private String requestId;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String bizId;

		private String note;

		private Integer operateType;

		private Long operateTime;

		private Integer bizStatus;

		private String extendContent;

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getNote() {
			return this.note;
		}

		public void setNote(String note) {
			this.note = note;
		}

		public Integer getOperateType() {
			return this.operateType;
		}

		public void setOperateType(Integer operateType) {
			this.operateType = operateType;
		}

		public Long getOperateTime() {
			return this.operateTime;
		}

		public void setOperateTime(Long operateTime) {
			this.operateTime = operateTime;
		}

		public Integer getBizStatus() {
			return this.bizStatus;
		}

		public void setBizStatus(Integer bizStatus) {
			this.bizStatus = bizStatus;
		}

		public String getExtendContent() {
			return this.extendContent;
		}

		public void setExtendContent(String extendContent) {
			this.extendContent = extendContent;
		}
	}

	@Override
	public QueryTradeMarkApplicationLogsResponse getInstance(UnmarshallerContext context) {
		return	QueryTradeMarkApplicationLogsResponseUnmarshaller.unmarshall(this, context);
	}
}
