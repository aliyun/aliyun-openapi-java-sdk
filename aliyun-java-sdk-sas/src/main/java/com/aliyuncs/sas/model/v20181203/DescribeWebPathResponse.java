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
import com.aliyuncs.sas.transform.v20181203.DescribeWebPathResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebPathResponse extends AcsResponse {

	private Integer currentPage;

	private Integer pageSize;

	private String requestId;

	private Integer totalCount;

	private Integer count;

	private List<Config> configList;

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<Config> getConfigList() {
		return this.configList;
	}

	public void setConfigList(List<Config> configList) {
		this.configList = configList;
	}

	public static class Config {

		private String webPath;

		private String webPathType;

		private List<Target> targetList;

		public String getWebPath() {
			return this.webPath;
		}

		public void setWebPath(String webPath) {
			this.webPath = webPath;
		}

		public String getWebPathType() {
			return this.webPathType;
		}

		public void setWebPathType(String webPathType) {
			this.webPathType = webPathType;
		}

		public List<Target> getTargetList() {
			return this.targetList;
		}

		public void setTargetList(List<Target> targetList) {
			this.targetList = targetList;
		}

		public static class Target {

			private String target;

			private String targetType;

			public String getTarget() {
				return this.target;
			}

			public void setTarget(String target) {
				this.target = target;
			}

			public String getTargetType() {
				return this.targetType;
			}

			public void setTargetType(String targetType) {
				this.targetType = targetType;
			}
		}
	}

	@Override
	public DescribeWebPathResponse getInstance(UnmarshallerContext context) {
		return	DescribeWebPathResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
