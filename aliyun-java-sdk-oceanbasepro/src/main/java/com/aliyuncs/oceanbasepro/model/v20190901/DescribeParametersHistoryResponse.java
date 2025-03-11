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
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeParametersHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeParametersHistoryResponse extends AcsResponse {

	private String requestId;

	private Respond respond;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Respond getRespond() {
		return this.respond;
	}

	public void setRespond(Respond respond) {
		this.respond = respond;
	}

	public static class Respond {

		private Integer totalCount;

		private Integer pageNumber;

		private List<ParametersItem> parameters;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public List<ParametersItem> getParameters() {
			return this.parameters;
		}

		public void setParameters(List<ParametersItem> parameters) {
			this.parameters = parameters;
		}

		public static class ParametersItem {

			private String status;

			private String oldValue;

			private String updateTime;

			private String createTime;

			private String dimensionValue;

			private String name;

			private String newValue;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getOldValue() {
				return this.oldValue;
			}

			public void setOldValue(String oldValue) {
				this.oldValue = oldValue;
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

			public String getDimensionValue() {
				return this.dimensionValue;
			}

			public void setDimensionValue(String dimensionValue) {
				this.dimensionValue = dimensionValue;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getNewValue() {
				return this.newValue;
			}

			public void setNewValue(String newValue) {
				this.newValue = newValue;
			}
		}
	}

	@Override
	public DescribeParametersHistoryResponse getInstance(UnmarshallerContext context) {
		return	DescribeParametersHistoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
