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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeGrantSagVbrRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGrantSagVbrRulesResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<GrantRule> grantRules;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<GrantRule> getGrantRules() {
		return this.grantRules;
	}

	public void setGrantRules(List<GrantRule> grantRules) {
		this.grantRules = grantRules;
	}

	public static class GrantRule {

		private Long vbrUid;

		private Long smartAGUid;

		private String vbrInstanceId;

		private String instanceId;

		private Long createTime;

		private Boolean bound;

		private String vbrRegionId;

		private String smartAGId;

		public Long getVbrUid() {
			return this.vbrUid;
		}

		public void setVbrUid(Long vbrUid) {
			this.vbrUid = vbrUid;
		}

		public Long getSmartAGUid() {
			return this.smartAGUid;
		}

		public void setSmartAGUid(Long smartAGUid) {
			this.smartAGUid = smartAGUid;
		}

		public String getVbrInstanceId() {
			return this.vbrInstanceId;
		}

		public void setVbrInstanceId(String vbrInstanceId) {
			this.vbrInstanceId = vbrInstanceId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Boolean getBound() {
			return this.bound;
		}

		public void setBound(Boolean bound) {
			this.bound = bound;
		}

		public String getVbrRegionId() {
			return this.vbrRegionId;
		}

		public void setVbrRegionId(String vbrRegionId) {
			this.vbrRegionId = vbrRegionId;
		}

		public String getSmartAGId() {
			return this.smartAGId;
		}

		public void setSmartAGId(String smartAGId) {
			this.smartAGId = smartAGId;
		}
	}

	@Override
	public DescribeGrantSagVbrRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeGrantSagVbrRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
