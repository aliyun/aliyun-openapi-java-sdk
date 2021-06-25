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

package com.aliyuncs.outboundbot.model.v20191226;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.DescribeDialogueNodeStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDialogueNodeStatisticsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private String groupId;

	private String instanceId;

	private Integer totalCompleted;

	private List<NoAnswerDialogueNode> noAnswerDialogueNodes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public Integer getTotalCompleted() {
		return this.totalCompleted;
	}

	public void setTotalCompleted(Integer totalCompleted) {
		this.totalCompleted = totalCompleted;
	}

	public List<NoAnswerDialogueNode> getNoAnswerDialogueNodes() {
		return this.noAnswerDialogueNodes;
	}

	public void setNoAnswerDialogueNodes(List<NoAnswerDialogueNode> noAnswerDialogueNodes) {
		this.noAnswerDialogueNodes = noAnswerDialogueNodes;
	}

	public static class NoAnswerDialogueNode {

		private String id;

		private String instanceId;

		private String groupId;

		private String nodeId;

		private String nodeName;

		private Integer hitNum;

		private Integer hangUpNum;

		private Integer noAnswerNum;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public Integer getHitNum() {
			return this.hitNum;
		}

		public void setHitNum(Integer hitNum) {
			this.hitNum = hitNum;
		}

		public Integer getHangUpNum() {
			return this.hangUpNum;
		}

		public void setHangUpNum(Integer hangUpNum) {
			this.hangUpNum = hangUpNum;
		}

		public Integer getNoAnswerNum() {
			return this.noAnswerNum;
		}

		public void setNoAnswerNum(Integer noAnswerNum) {
			this.noAnswerNum = noAnswerNum;
		}
	}

	@Override
	public DescribeDialogueNodeStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDialogueNodeStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
