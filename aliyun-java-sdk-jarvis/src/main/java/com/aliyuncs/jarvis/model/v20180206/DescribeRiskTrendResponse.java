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

package com.aliyuncs.jarvis.model.v20180206;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.jarvis.transform.v20180206.DescribeRiskTrendResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRiskTrendResponse extends AcsResponse {

	private String requestId;

	private String totalCount;

	private String module;

	private List<DataItem> dataList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public List<DataItem> getDataList() {
		return this.dataList;
	}

	public void setDataList(List<DataItem> dataList) {
		this.dataList = dataList;
	}

	public static class DataItem {

		private String updateTime;

		private Integer newRiskCount;

		private Integer totalRiskCount;

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public Integer getNewRiskCount() {
			return this.newRiskCount;
		}

		public void setNewRiskCount(Integer newRiskCount) {
			this.newRiskCount = newRiskCount;
		}

		public Integer getTotalRiskCount() {
			return this.totalRiskCount;
		}

		public void setTotalRiskCount(Integer totalRiskCount) {
			this.totalRiskCount = totalRiskCount;
		}
	}

	@Override
	public DescribeRiskTrendResponse getInstance(UnmarshallerContext context) {
		return	DescribeRiskTrendResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
