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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.ListClusterMembersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterMembersResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private ClusterMemberPage clusterMemberPage;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ClusterMemberPage getClusterMemberPage() {
		return this.clusterMemberPage;
	}

	public void setClusterMemberPage(ClusterMemberPage clusterMemberPage) {
		this.clusterMemberPage = clusterMemberPage;
	}

	public static class ClusterMemberPage {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalSize;

		private List<ClusterMember> clusterMemberList;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Integer totalSize) {
			this.totalSize = totalSize;
		}

		public List<ClusterMember> getClusterMemberList() {
			return this.clusterMemberList;
		}

		public void setClusterMemberList(List<ClusterMember> clusterMemberList) {
			this.clusterMemberList = clusterMemberList;
		}

		public static class ClusterMember {

			private String clusterMemberId;

			private String clusterId;

			private String ecuId;

			private String ecsId;

			private Integer status;

			private Integer createTime;

			private Integer updateTime;

			public String getClusterMemberId() {
				return this.clusterMemberId;
			}

			public void setClusterMemberId(String clusterMemberId) {
				this.clusterMemberId = clusterMemberId;
			}

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}

			public String getEcuId() {
				return this.ecuId;
			}

			public void setEcuId(String ecuId) {
				this.ecuId = ecuId;
			}

			public String getEcsId() {
				return this.ecsId;
			}

			public void setEcsId(String ecsId) {
				this.ecsId = ecsId;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Integer getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Integer createTime) {
				this.createTime = createTime;
			}

			public Integer getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(Integer updateTime) {
				this.updateTime = updateTime;
			}
		}
	}

	@Override
	public ListClusterMembersResponse getInstance(UnmarshallerContext context) {
		return	ListClusterMembersResponseUnmarshaller.unmarshall(this, context);
	}
}
