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

package com.aliyuncs.trademark.model.v20190902;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20190902.ListAdminTrademarkApplicationLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAdminTrademarkApplicationLogsResponse extends AcsResponse {

	private String requestId;

	private List<TrademarkApplicationLog> trademarkApplicationLogs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TrademarkApplicationLog> getTrademarkApplicationLogs() {
		return this.trademarkApplicationLogs;
	}

	public void setTrademarkApplicationLogs(List<TrademarkApplicationLog> trademarkApplicationLogs) {
		this.trademarkApplicationLogs = trademarkApplicationLogs;
	}

	public static class TrademarkApplicationLog {

		private Long operateTime;

		private Integer operateType;

		private String note;

		private String bizId;

		private Integer bizStatus;

		public Long getOperateTime() {
			return this.operateTime;
		}

		public void setOperateTime(Long operateTime) {
			this.operateTime = operateTime;
		}

		public Integer getOperateType() {
			return this.operateType;
		}

		public void setOperateType(Integer operateType) {
			this.operateType = operateType;
		}

		public String getNote() {
			return this.note;
		}

		public void setNote(String note) {
			this.note = note;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public Integer getBizStatus() {
			return this.bizStatus;
		}

		public void setBizStatus(Integer bizStatus) {
			this.bizStatus = bizStatus;
		}
	}

	@Override
	public ListAdminTrademarkApplicationLogsResponse getInstance(UnmarshallerContext context) {
		return	ListAdminTrademarkApplicationLogsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
