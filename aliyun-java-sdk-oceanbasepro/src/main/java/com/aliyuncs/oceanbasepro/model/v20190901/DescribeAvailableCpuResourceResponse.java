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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeAvailableCpuResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAvailableCpuResourceResponse extends AcsResponse {

	private String requestId;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Long unitNum;

		private Long minCpu;

		private Long maxCpu;

		private String reviewCode;

		private String comment;

		public Long getUnitNum() {
			return this.unitNum;
		}

		public void setUnitNum(Long unitNum) {
			this.unitNum = unitNum;
		}

		public Long getMinCpu() {
			return this.minCpu;
		}

		public void setMinCpu(Long minCpu) {
			this.minCpu = minCpu;
		}

		public Long getMaxCpu() {
			return this.maxCpu;
		}

		public void setMaxCpu(Long maxCpu) {
			this.maxCpu = maxCpu;
		}

		public String getReviewCode() {
			return this.reviewCode;
		}

		public void setReviewCode(String reviewCode) {
			this.reviewCode = reviewCode;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}
	}

	@Override
	public DescribeAvailableCpuResourceResponse getInstance(UnmarshallerContext context) {
		return	DescribeAvailableCpuResourceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
