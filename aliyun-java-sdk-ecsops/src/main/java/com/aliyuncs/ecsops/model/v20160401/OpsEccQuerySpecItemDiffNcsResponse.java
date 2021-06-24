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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsEccQuerySpecItemDiffNcsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsEccQuerySpecItemDiffNcsResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<CompareResultItem> compareResult;

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<CompareResultItem> getCompareResult() {
			return this.compareResult;
		}

		public void setCompareResult(List<CompareResultItem> compareResult) {
			this.compareResult = compareResult;
		}

		public static class CompareResultItem {

			private String configName;

			private String sn;

			private String configValue;

			private String ncIp;

			private String comparisonValue;

			public String getConfigName() {
				return this.configName;
			}

			public void setConfigName(String configName) {
				this.configName = configName;
			}

			public String getSn() {
				return this.sn;
			}

			public void setSn(String sn) {
				this.sn = sn;
			}

			public String getConfigValue() {
				return this.configValue;
			}

			public void setConfigValue(String configValue) {
				this.configValue = configValue;
			}

			public String getNcIp() {
				return this.ncIp;
			}

			public void setNcIp(String ncIp) {
				this.ncIp = ncIp;
			}

			public String getComparisonValue() {
				return this.comparisonValue;
			}

			public void setComparisonValue(String comparisonValue) {
				this.comparisonValue = comparisonValue;
			}
		}
	}

	@Override
	public OpsEccQuerySpecItemDiffNcsResponse getInstance(UnmarshallerContext context) {
		return	OpsEccQuerySpecItemDiffNcsResponseUnmarshaller.unmarshall(this, context);
	}
}
