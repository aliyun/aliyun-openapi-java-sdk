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

package com.aliyuncs.green.model.v20170823;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.DescribeOssResultItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOssResultItemsResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalCount;

	private String queryId;

	private List<ScanResult> scanResultList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getQueryId() {
		return this.queryId;
	}

	public void setQueryId(String queryId) {
		this.queryId = queryId;
	}

	public List<ScanResult> getScanResultList() {
		return this.scanResultList;
	}

	public void setScanResultList(List<ScanResult> scanResultList) {
		this.scanResultList = scanResultList;
	}

	public static class ScanResult {

		private String taskId;

		private String dataId;

		private String newUrl;

		private String thumbnail;

		private String requestTime;

		private String scanFinishedTime;

		private String createTime;

		private String suggestion;

		private Long id;

		private String bucket;

		private String object;

		private String score;

		private Integer handleStatus;

		private Integer resourceStatus;

		private List<FrameResult> frameResults;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getDataId() {
			return this.dataId;
		}

		public void setDataId(String dataId) {
			this.dataId = dataId;
		}

		public String getNewUrl() {
			return this.newUrl;
		}

		public void setNewUrl(String newUrl) {
			this.newUrl = newUrl;
		}

		public String getThumbnail() {
			return this.thumbnail;
		}

		public void setThumbnail(String thumbnail) {
			this.thumbnail = thumbnail;
		}

		public String getRequestTime() {
			return this.requestTime;
		}

		public void setRequestTime(String requestTime) {
			this.requestTime = requestTime;
		}

		public String getScanFinishedTime() {
			return this.scanFinishedTime;
		}

		public void setScanFinishedTime(String scanFinishedTime) {
			this.scanFinishedTime = scanFinishedTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getSuggestion() {
			return this.suggestion;
		}

		public void setSuggestion(String suggestion) {
			this.suggestion = suggestion;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getBucket() {
			return this.bucket;
		}

		public void setBucket(String bucket) {
			this.bucket = bucket;
		}

		public String getObject() {
			return this.object;
		}

		public void setObject(String object) {
			this.object = object;
		}

		public String getScore() {
			return this.score;
		}

		public void setScore(String score) {
			this.score = score;
		}

		public Integer getHandleStatus() {
			return this.handleStatus;
		}

		public void setHandleStatus(Integer handleStatus) {
			this.handleStatus = handleStatus;
		}

		public Integer getResourceStatus() {
			return this.resourceStatus;
		}

		public void setResourceStatus(Integer resourceStatus) {
			this.resourceStatus = resourceStatus;
		}

		public List<FrameResult> getFrameResults() {
			return this.frameResults;
		}

		public void setFrameResults(List<FrameResult> frameResults) {
			this.frameResults = frameResults;
		}

		public static class FrameResult {

			private String thumbnail;

			private Integer offset;

			private String url;

			public String getThumbnail() {
				return this.thumbnail;
			}

			public void setThumbnail(String thumbnail) {
				this.thumbnail = thumbnail;
			}

			public Integer getOffset() {
				return this.offset;
			}

			public void setOffset(Integer offset) {
				this.offset = offset;
			}

			public String getBizUrl() {
				return this.url;
			}

			public void setBizUrl(String url) {
				this.url = url;
			}

			/**
			 * @deprecated use getBizUrl instead of this.
			 */
			@Deprecated
			public String getUrl() {
				return this.url;
			}

			/**
			 * @deprecated use setBizUrl instead of this.
			 */
			@Deprecated
			public void setUrl(String url) {
				this.url = url;
			}
		}
	}

	@Override
	public DescribeOssResultItemsResponse getInstance(UnmarshallerContext context) {
		return	DescribeOssResultItemsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
