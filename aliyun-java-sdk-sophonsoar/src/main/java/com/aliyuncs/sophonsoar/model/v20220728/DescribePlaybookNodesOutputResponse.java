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

package com.aliyuncs.sophonsoar.model.v20220728;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sophonsoar.transform.v20220728.DescribePlaybookNodesOutputResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePlaybookNodesOutputResponse extends AcsResponse {

	private String requestId;

	private PlaybookNodesOutput playbookNodesOutput;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PlaybookNodesOutput getPlaybookNodesOutput() {
		return this.playbookNodesOutput;
	}

	public void setPlaybookNodesOutput(PlaybookNodesOutput playbookNodesOutput) {
		this.playbookNodesOutput = playbookNodesOutput;
	}

	public static class PlaybookNodesOutput {

		private String nodeName;

		private String nodeOutput;

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public String getNodeOutput() {
			return this.nodeOutput;
		}

		public void setNodeOutput(String nodeOutput) {
			this.nodeOutput = nodeOutput;
		}
	}

	@Override
	public DescribePlaybookNodesOutputResponse getInstance(UnmarshallerContext context) {
		return	DescribePlaybookNodesOutputResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
