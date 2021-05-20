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
import com.aliyuncs.smartag.transform.v20180313.DescribeGrantRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGrantRulesResponse extends AcsResponse {

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

		private Long gmtCreate;

		private Long cenUid;

		private Boolean grantTrafficService;

		private String ccnInstanceId;

		private String grantRuleId;

		private String cenInstanceId;

		private Long gmtModified;

		private Long ccnUid;

		private String regionId;

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getCenUid() {
			return this.cenUid;
		}

		public void setCenUid(Long cenUid) {
			this.cenUid = cenUid;
		}

		public Boolean getGrantTrafficService() {
			return this.grantTrafficService;
		}

		public void setGrantTrafficService(Boolean grantTrafficService) {
			this.grantTrafficService = grantTrafficService;
		}

		public String getCcnInstanceId() {
			return this.ccnInstanceId;
		}

		public void setCcnInstanceId(String ccnInstanceId) {
			this.ccnInstanceId = ccnInstanceId;
		}

		public String getGrantRuleId() {
			return this.grantRuleId;
		}

		public void setGrantRuleId(String grantRuleId) {
			this.grantRuleId = grantRuleId;
		}

		public String getCenInstanceId() {
			return this.cenInstanceId;
		}

		public void setCenInstanceId(String cenInstanceId) {
			this.cenInstanceId = cenInstanceId;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getCcnUid() {
			return this.ccnUid;
		}

		public void setCcnUid(Long ccnUid) {
			this.ccnUid = ccnUid;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public DescribeGrantRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeGrantRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
