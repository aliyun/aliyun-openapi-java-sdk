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

package com.aliyuncs.imm.model.v20200930;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20200930.QuerySimilarImageClustersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySimilarImageClustersResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<SimilarImageClustersItem> similarImageClusters;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<SimilarImageClustersItem> getSimilarImageClusters() {
		return this.similarImageClusters;
	}

	public void setSimilarImageClusters(List<SimilarImageClustersItem> similarImageClusters) {
		this.similarImageClusters = similarImageClusters;
	}

	public static class SimilarImageClustersItem {

		private String objectId;

		private String updateTime;

		private String createTime;

		private Map<Object,Object> customLabels;

		private List<FilesItem> files;

		public String getObjectId() {
			return this.objectId;
		}

		public void setObjectId(String objectId) {
			this.objectId = objectId;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Map<Object,Object> getCustomLabels() {
			return this.customLabels;
		}

		public void setCustomLabels(Map<Object,Object> customLabels) {
			this.customLabels = customLabels;
		}

		public List<FilesItem> getFiles() {
			return this.files;
		}

		public void setFiles(List<FilesItem> files) {
			this.files = files;
		}

		public static class FilesItem {

			private String uRI;

			private Double imageScore;

			public String getURI() {
				return this.uRI;
			}

			public void setURI(String uRI) {
				this.uRI = uRI;
			}

			public Double getImageScore() {
				return this.imageScore;
			}

			public void setImageScore(Double imageScore) {
				this.imageScore = imageScore;
			}
		}
	}

	@Override
	public QuerySimilarImageClustersResponse getInstance(UnmarshallerContext context) {
		return	QuerySimilarImageClustersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
