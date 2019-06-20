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

package com.aliyuncs.dts.model.v20180801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dts.transform.v20180801.DescribeConsumerGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeConsumerGroupResponse extends AcsResponse {

	private Integer pageNumber;

	private Integer totalRecordCount;

	private Integer pageRecordCount;

	private List<DescribeConsumerChannel> consumerChannels;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public List<DescribeConsumerChannel> getConsumerChannels() {
		return this.consumerChannels;
	}

	public void setConsumerChannels(List<DescribeConsumerChannel> consumerChannels) {
		this.consumerChannels = consumerChannels;
	}

	public static class DescribeConsumerChannel {

		private String consumerGroupID;

		private String consumerGroupName;

		private String consumptionCheckpoint;

		private Long unconsumedData;

		private Long messageDelay;

		private String consumerGroupUserName;

		public String getConsumerGroupID() {
			return this.consumerGroupID;
		}

		public void setConsumerGroupID(String consumerGroupID) {
			this.consumerGroupID = consumerGroupID;
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
	public DescribeConsumerGroupResponse getInstance(UnmarshallerContext context) {
		return	DescribeConsumerGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
