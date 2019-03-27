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

package com.aliyuncs.ivision.model.v20190308;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ivision.transform.v20190308.DescribeIterationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIterationsResponse extends AcsResponse {

	private String requestId;

	private Long totalNum;

	private Long currentPage;

	private Long pageSize;

	private String nextPageToken;

	private List<Iteration> iterations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getNextPageToken() {
		return this.nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}

	public List<Iteration> getIterations() {
		return this.iterations;
	}

	public void setIterations(List<Iteration> iterations) {
		this.iterations = iterations;
	}

	public static class Iteration {

		private String projectId;

		private String iterationId;

		private String iterationName;

		private String status;

		private String creationTime;

		private String finishTime;

		private String modelId;

		private String precision;

		private String recall;

		private String mAP;

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getIterationId() {
			return this.iterationId;
		}

		public void setIterationId(String iterationId) {
			this.iterationId = iterationId;
		}

		public String getIterationName() {
			return this.iterationName;
		}

		public void setIterationName(String iterationName) {
			this.iterationName = iterationName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
		}

		public String getModelId() {
			return this.modelId;
		}

		public void setModelId(String modelId) {
			this.modelId = modelId;
		}

		public String getPrecision() {
			return this.precision;
		}

		public void setPrecision(String precision) {
			this.precision = precision;
		}

		public String getRecall() {
			return this.recall;
		}

		public void setRecall(String recall) {
			this.recall = recall;
		}

		public String getMAP() {
			return this.mAP;
		}

		public void setMAP(String mAP) {
			this.mAP = mAP;
		}
	}

	@Override
	public DescribeIterationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeIterationsResponseUnmarshaller.unmarshall(this, context);
	}
}
