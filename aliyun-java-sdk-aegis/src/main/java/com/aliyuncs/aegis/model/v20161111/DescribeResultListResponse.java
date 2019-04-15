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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeResultListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResultListResponse extends AcsResponse {

	private String requestId;

	private List<ResultListItem> resultList;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultListItem> getResultList() {
		return this.resultList;
	}

	public void setResultList(List<ResultListItem> resultList) {
		this.resultList = resultList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class ResultListItem {

		private Long lastTimestamp;

		private Long modifiedTimestamp;

		private String warnLevel;

		private String uniqueKey;

		private Long lastOperate;

		private Long createTimestamp;

		private String ruleDescription;

		private String ruleType;

		private String ruleName;

		private String details;

		private Integer id;

		private Long aliUid;

		private Integer ruleId;

		private Integer status;

		private String fieldKey;

		private String internetIp;

		private String intranetIp;

		private String instanceId;

		private String instanceName;

		private String fieldKey1;

		public Long getLastTimestamp() {
			return this.lastTimestamp;
		}

		public void setLastTimestamp(Long lastTimestamp) {
			this.lastTimestamp = lastTimestamp;
		}

		public Long getModifiedTimestamp() {
			return this.modifiedTimestamp;
		}

		public void setModifiedTimestamp(Long modifiedTimestamp) {
			this.modifiedTimestamp = modifiedTimestamp;
		}

		public String getWarnLevel() {
			return this.warnLevel;
		}

		public void setWarnLevel(String warnLevel) {
			this.warnLevel = warnLevel;
		}

		public String getUniqueKey() {
			return this.uniqueKey;
		}

		public void setUniqueKey(String uniqueKey) {
			this.uniqueKey = uniqueKey;
		}

		public Long getLastOperate() {
			return this.lastOperate;
		}

		public void setLastOperate(Long lastOperate) {
			this.lastOperate = lastOperate;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public String getRuleDescription() {
			return this.ruleDescription;
		}

		public void setRuleDescription(String ruleDescription) {
			this.ruleDescription = ruleDescription;
		}

		public String getRuleType() {
			return this.ruleType;
		}

		public void setRuleType(String ruleType) {
			this.ruleType = ruleType;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getDetails() {
			return this.details;
		}

		public void setDetails(String details) {
			this.details = details;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public Integer getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Integer ruleId) {
			this.ruleId = ruleId;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getFieldKey() {
			return this.fieldKey;
		}

		public void setFieldKey(String fieldKey) {
			this.fieldKey = fieldKey;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getFieldKey1() {
			return this.fieldKey1;
		}

		public void setFieldKey1(String fieldKey1) {
			this.fieldKey1 = fieldKey1;
		}
	}

	public static class PageInfo {

		private Integer count;

		private Integer pageSize;

		private Integer currentPage;

		private Integer totalCount;

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}
	}

	@Override
	public DescribeResultListResponse getInstance(UnmarshallerContext context) {
		return	DescribeResultListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
