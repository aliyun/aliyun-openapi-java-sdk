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

package com.aliyuncs.dts.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dts.transform.v20200101.DescribeConsumerChannelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeConsumerChannelResponse extends AcsResponse {

	private String errCode;

	private String errMessage;

	private String requestId;

	private String success;

	private String httpStatusCode;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private Long totalRecordCount;

	private List<ConsumerChannel> consumerChannels;

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public Long getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Long totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<ConsumerChannel> getConsumerChannels() {
		return this.consumerChannels;
	}

	public void setConsumerChannels(List<ConsumerChannel> consumerChannels) {
		this.consumerChannels = consumerChannels;
	}

	public static class ConsumerChannel {

		private String consumerGroupId;

		private String consumerGroupName;

		private String consumptionCheckpoint;

		private Long unconsumedData;

		private Long messageDelay;

		private String consumerGroupUserName;

		public String getConsumerGroupId() {
			return this.consumerGroupId;
		}

		public void setConsumerGroupId(String consumerGroupId) {
			this.consumerGroupId = consumerGroupId;
		}

		public String getConsumerGroupName() {
			return this.consumerGroupName;
		}

		public void setConsumerGroupName(String consumerGroupName) {
			this.consumerGroupName = consumerGroupName;
		}

		public String getConsumptionCheckpoint() {
			return this.consumptionCheckpoint;
		}

		public void setConsumptionCheckpoint(String consumptionCheckpoint) {
			this.consumptionCheckpoint = consumptionCheckpoint;
		}

		public Long getUnconsumedData() {
			return this.unconsumedData;
		}

		public void setUnconsumedData(Long unconsumedData) {
			this.unconsumedData = unconsumedData;
		}

		public Long getMessageDelay() {
			return this.messageDelay;
		}

		public void setMessageDelay(Long messageDelay) {
			this.messageDelay = messageDelay;
		}

		public String getConsumerGroupUserName() {
			return this.consumerGroupUserName;
		}

		public void setConsumerGroupUserName(String consumerGroupUserName) {
			this.consumerGroupUserName = consumerGroupUserName;
		}
	}

	@Override
	public DescribeConsumerChannelResponse getInstance(UnmarshallerContext context) {
		return	DescribeConsumerChannelResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
