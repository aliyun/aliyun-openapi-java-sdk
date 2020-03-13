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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.DescribeMetricsOverviewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMetricsOverviewResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long backlogNum;

	private Long dlqNum;

	private Long groupNum;

	private Long subscriptionNum;

	private Long topicNum;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Long getBacklogNum() {
		return this.backlogNum;
	}

	public void setBacklogNum(Long backlogNum) {
		this.backlogNum = backlogNum;
	}

	public Long getDlqNum() {
		return this.dlqNum;
	}

	public void setDlqNum(Long dlqNum) {
		this.dlqNum = dlqNum;
	}

	public Long getGroupNum() {
		return this.groupNum;
	}

	public void setGroupNum(Long groupNum) {
		this.groupNum = groupNum;
	}

	public Long getSubscriptionNum() {
		return this.subscriptionNum;
	}

	public void setSubscriptionNum(Long subscriptionNum) {
		this.subscriptionNum = subscriptionNum;
	}

	public Long getTopicNum() {
		return this.topicNum;
	}

	public void setTopicNum(Long topicNum) {
		this.topicNum = topicNum;
	}

	@Override
	public DescribeMetricsOverviewResponse getInstance(UnmarshallerContext context) {
		return	DescribeMetricsOverviewResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
