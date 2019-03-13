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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeGrantRulesToCenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGrantRulesToCenResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<CbnGrantRule> cenGrantRules;

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

	public List<CbnGrantRule> getCenGrantRules() {
		return this.cenGrantRules;
	}

	public void setCenGrantRules(List<CbnGrantRule> cenGrantRules) {
		this.cenGrantRules = cenGrantRules;
	}

	public static class CbnGrantRule {

		private String cenInstanceId;

		private Long cenOwnerId;

		private String creationTime;

		public String getCenInstanceId() {
			return this.cenInstanceId;
		}

		public void setCenInstanceId(String cenInstanceId) {
			this.cenInstanceId = cenInstanceId;
		}

		public Long getCenOwnerId() {
			return this.cenOwnerId;
		}

		public void setCenOwnerId(Long cenOwnerId) {
			this.cenOwnerId = cenOwnerId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}
	}

	@Override
	public DescribeGrantRulesToCenResponse getInstance(UnmarshallerContext context) {
		return	DescribeGrantRulesToCenResponseUnmarshaller.unmarshall(this, context);
	}
}
