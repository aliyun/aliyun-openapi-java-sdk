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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeCommonOverallConfigListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCommonOverallConfigListResponse extends AcsResponse {

	private String requestId;

	private List<OverallConfig> overallList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<OverallConfig> getOverallList() {
		return this.overallList;
	}

	public void setOverallList(List<OverallConfig> overallList) {
		this.overallList = overallList;
	}

	public static class OverallConfig {

		private String type;

		private Integer totalCount;

		private String config;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}
	}

	@Override
	public DescribeCommonOverallConfigListResponse getInstance(UnmarshallerContext context) {
		return	DescribeCommonOverallConfigListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
