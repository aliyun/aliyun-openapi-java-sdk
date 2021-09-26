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
import com.aliyuncs.dataworks_public.transform.v20200518.GetInstanceErrorRankResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceErrorRankResponse extends AcsResponse {

	private String requestId;

	private InstanceErrorRank instanceErrorRank;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public InstanceErrorRank getInstanceErrorRank() {
		return this.instanceErrorRank;
	}

	public void setInstanceErrorRank(InstanceErrorRank instanceErrorRank) {
		this.instanceErrorRank = instanceErrorRank;
	}

	public static class InstanceErrorRank {

		private Long updateTime;

		private List<ErrorRankItem> errorRank;

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public List<ErrorRankItem> getErrorRank() {
			return this.errorRank;
		}

		public void setErrorRank(List<ErrorRankItem> errorRank) {
			this.errorRank = errorRank;
		}

		public static class ErrorRankItem {

			private Long nodeId;

			private String nodeName;

			private String owner;

			private Integer count;

			private Long projectId;

			private Integer prgType;

			public Long getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(Long nodeId) {
				this.nodeId = nodeId;
			}

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public Integer getPrgType() {
				return this.prgType;
			}

			public void setPrgType(Integer prgType) {
				this.prgType = prgType;
			}
		}
	}

	@Override
	public GetInstanceErrorRankResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceErrorRankResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
