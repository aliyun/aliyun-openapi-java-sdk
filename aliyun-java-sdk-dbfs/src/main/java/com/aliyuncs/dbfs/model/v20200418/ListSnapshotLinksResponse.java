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

package com.aliyuncs.dbfs.model.v20200418;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dbfs.transform.v20200418.ListSnapshotLinksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSnapshotLinksResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<Info> snapshotLinks;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Info> getSnapshotLinks() {
		return this.snapshotLinks;
	}

	public void setSnapshotLinks(List<Info> snapshotLinks) {
		this.snapshotLinks = snapshotLinks;
	}

	public static class Info {

		private String status;

		private Long totalSize;

		private Integer sourceSize;

		private String fsId;

		private Integer snapshotCount;

		private String fsName;

		private String linkId;

		private List<EcsListItem> ecsList;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Long totalSize) {
			this.totalSize = totalSize;
		}

		public Integer getSourceSize() {
			return this.sourceSize;
		}

		public void setSourceSize(Integer sourceSize) {
			this.sourceSize = sourceSize;
		}

		public String getFsId() {
			return this.fsId;
		}

		public void setFsId(String fsId) {
			this.fsId = fsId;
		}

		public Integer getSnapshotCount() {
			return this.snapshotCount;
		}

		public void setSnapshotCount(Integer snapshotCount) {
			this.snapshotCount = snapshotCount;
		}

		public String getFsName() {
			return this.fsName;
		}

		public void setFsName(String fsName) {
			this.fsName = fsName;
		}

		public String getLinkId() {
			return this.linkId;
		}

		public void setLinkId(String linkId) {
			this.linkId = linkId;
		}

		public List<EcsListItem> getEcsList() {
			return this.ecsList;
		}

		public void setEcsList(List<EcsListItem> ecsList) {
			this.ecsList = ecsList;
		}

		public static class EcsListItem {

			private String ecsId;

			public String getEcsId() {
				return this.ecsId;
			}

			public void setEcsId(String ecsId) {
				this.ecsId = ecsId;
			}
		}
	}

	@Override
	public ListSnapshotLinksResponse getInstance(UnmarshallerContext context) {
		return	ListSnapshotLinksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
