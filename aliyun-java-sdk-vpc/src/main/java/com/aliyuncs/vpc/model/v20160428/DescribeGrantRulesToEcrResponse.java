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
import com.aliyuncs.vpc.transform.v20160428.DescribeGrantRulesToEcrResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGrantRulesToEcrResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer count;

	private Integer pageNumber;

	private Integer pageSize;

	private List<EcrRelationModel> ecrGrantRules;

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

	public List<EcrRelationModel> getEcrGrantRules() {
		return this.ecrGrantRules;
	}

	public void setEcrGrantRules(List<EcrRelationModel> ecrGrantRules) {
		this.ecrGrantRules = ecrGrantRules;
	}

	public static class EcrRelationModel {

		private Long ecrUid;

		private String createTime;

		private String ecrInstanceId;

		public Long getEcrUid() {
			return this.ecrUid;
		}

		public void setEcrUid(Long ecrUid) {
			this.ecrUid = ecrUid;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getEcrInstanceId() {
			return this.ecrInstanceId;
		}

		public void setEcrInstanceId(String ecrInstanceId) {
			this.ecrInstanceId = ecrInstanceId;
		}
	}

	@Override
	public DescribeGrantRulesToEcrResponse getInstance(UnmarshallerContext context) {
		return	DescribeGrantRulesToEcrResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
