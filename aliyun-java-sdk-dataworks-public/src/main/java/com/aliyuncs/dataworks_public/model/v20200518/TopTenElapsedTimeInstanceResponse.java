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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.TopTenElapsedTimeInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TopTenElapsedTimeInstanceResponse extends AcsResponse {

	private String requestId;

	private InstanceConsumeTimeRank instanceConsumeTimeRank;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public InstanceConsumeTimeRank getInstanceConsumeTimeRank() {
		return this.instanceConsumeTimeRank;
	}

	public void setInstanceConsumeTimeRank(InstanceConsumeTimeRank instanceConsumeTimeRank) {
		this.instanceConsumeTimeRank = instanceConsumeTimeRank;
	}

	public static class InstanceConsumeTimeRank {

		private Long updateTime;

		private List<ConsumeTimeRankItem> consumeTimeRank;

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public List<ConsumeTimeRankItem> getConsumeTimeRank() {
			return this.consumeTimeRank;
		}

		public void setConsumeTimeRank(List<ConsumeTimeRankItem> consumeTimeRank) {
			this.consumeTimeRank = consumeTimeRank;
		}

		public static class ConsumeTimeRankItem {

			private String nodeName;

			private Long nodeId;

			private Long businessDate;

			private String owner;

			private Long consumed;

			private Long instanceId;

			private Integer programType;

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public Long getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(Long nodeId) {
				this.nodeId = nodeId;
			}

			public Long getBusinessDate() {
				return this.businessDate;
			}

			public void setBusinessDate(Long businessDate) {
				this.businessDate = businessDate;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public Long getConsumed() {
				return this.consumed;
			}

			public void setConsumed(Long consumed) {
				this.consumed = consumed;
			}

			public Long getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(Long instanceId) {
				this.instanceId = instanceId;
			}

			public Integer getProgramType() {
				return this.programType;
			}

			public void setProgramType(Integer programType) {
				this.programType = programType;
			}
		}
	}

	@Override
	public TopTenElapsedTimeInstanceResponse getInstance(UnmarshallerContext context) {
		return	TopTenElapsedTimeInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
