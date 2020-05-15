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

package com.aliyuncs.nas.model.v20170626;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.DescribeLogAnalysisResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLogAnalysisResponse extends AcsResponse {

	private String requestId;

	private String code;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Analysis> analyses;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Analysis> getAnalyses() {
		return this.analyses;
	}

	public void setAnalyses(List<Analysis> analyses) {
		this.analyses = analyses;
	}

	public static class Analysis {

		private String metaKey;

		private MetaValue metaValue;

		public String getMetaKey() {
			return this.metaKey;
		}

		public void setMetaKey(String metaKey) {
			this.metaKey = metaKey;
		}

		public MetaValue getMetaValue() {
			return this.metaValue;
		}

		public void setMetaValue(MetaValue metaValue) {
			this.metaValue = metaValue;
		}

		public static class MetaValue {

			private String logstore;

			private String region;

			private String project;

			private String roleArn;

			public String getLogstore() {
				return this.logstore;
			}

			public void setLogstore(String logstore) {
				this.logstore = logstore;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getProject() {
				return this.project;
			}

			public void setProject(String project) {
				this.project = project;
			}

			public String getRoleArn() {
				return this.roleArn;
			}

			public void setRoleArn(String roleArn) {
				this.roleArn = roleArn;
			}
		}
	}

	@Override
	public DescribeLogAnalysisResponse getInstance(UnmarshallerContext context) {
		return	DescribeLogAnalysisResponseUnmarshaller.unmarshall(this, context);
	}
}
