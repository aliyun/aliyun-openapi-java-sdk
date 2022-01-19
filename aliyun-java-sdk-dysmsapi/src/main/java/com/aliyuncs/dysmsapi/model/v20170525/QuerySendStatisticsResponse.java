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

package com.aliyuncs.dysmsapi.model.v20170525;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dysmsapi.transform.v20170525.QuerySendStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySendStatisticsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

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

		private Long totalSize;

		private List<SmsStatisticsDTO> targetList;

		public Long getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Long totalSize) {
			this.totalSize = totalSize;
		}

		public List<SmsStatisticsDTO> getTargetList() {
			return this.targetList;
		}

		public void setTargetList(List<SmsStatisticsDTO> targetList) {
			this.targetList = targetList;
		}

		public static class SmsStatisticsDTO {

			private Long totalCount;

			private Long respondedSuccessCount;

			private Long respondedFailCount;

			private Long noRespondedCount;

			private String sendDate;

			public Long getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Long totalCount) {
				this.totalCount = totalCount;
			}

			public Long getRespondedSuccessCount() {
				return this.respondedSuccessCount;
			}

			public void setRespondedSuccessCount(Long respondedSuccessCount) {
				this.respondedSuccessCount = respondedSuccessCount;
			}

			public Long getRespondedFailCount() {
				return this.respondedFailCount;
			}

			public void setRespondedFailCount(Long respondedFailCount) {
				this.respondedFailCount = respondedFailCount;
			}

			public Long getNoRespondedCount() {
				return this.noRespondedCount;
			}

			public void setNoRespondedCount(Long noRespondedCount) {
				this.noRespondedCount = noRespondedCount;
			}

			public String getSendDate() {
				return this.sendDate;
			}

			public void setSendDate(String sendDate) {
				this.sendDate = sendDate;
			}
		}
	}

	@Override
	public QuerySendStatisticsResponse getInstance(UnmarshallerContext context) {
		return	QuerySendStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
