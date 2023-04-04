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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20200930.SearchImageFigureClusterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchImageFigureClusterResponse extends AcsResponse {

	private String requestId;

	private List<ClustersItem> clusters;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ClustersItem> getClusters() {
		return this.clusters;
	}

	public void setClusters(List<ClustersItem> clusters) {
		this.clusters = clusters;
	}

	public static class ClustersItem {

		private String clusterId;

		private Float similarity;

		private Boundary boundary;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public Float getSimilarity() {
			return this.similarity;
		}

		public void setSimilarity(Float similarity) {
			this.similarity = similarity;
		}

		public Boundary getBoundary() {
			return this.boundary;
		}

		public void setBoundary(Boundary boundary) {
			this.boundary = boundary;
		}

		public static class Boundary {

			private Long width;

			private Long height;

			private Long left;

			private Long top;

			public Long getWidth() {
				return this.width;
			}

			public void setWidth(Long width) {
				this.width = width;
			}

			public Long getHeight() {
				return this.height;
			}

			public void setHeight(Long height) {
				this.height = height;
			}

			public Long getLeft() {
				return this.left;
			}

			public void setLeft(Long left) {
				this.left = left;
			}

			public Long getTop() {
				return this.top;
			}

			public void setTop(Long top) {
				this.top = top;
			}
		}
	}

	@Override
	public SearchImageFigureClusterResponse getInstance(UnmarshallerContext context) {
		return	SearchImageFigureClusterResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
