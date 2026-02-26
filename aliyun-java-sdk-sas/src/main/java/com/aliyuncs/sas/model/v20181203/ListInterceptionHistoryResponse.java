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
import com.aliyuncs.sas.transform.v20181203.ListInterceptionHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInterceptionHistoryResponse extends AcsResponse {

	private String requestId;

	private List<InterceptionHistory> interceptionHistoryList;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InterceptionHistory> getInterceptionHistoryList() {
		return this.interceptionHistoryList;
	}

	public void setInterceptionHistoryList(List<InterceptionHistory> interceptionHistoryList) {
		this.interceptionHistoryList = interceptionHistoryList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class InterceptionHistory {

		private String srcNamespace;

		private String srcRuleTargetName;

		private Long riskLevel;

		private Long status;

		private String dstImageList;

		private String srcTagList;

		private Long dstPort;

		private Long firstTime;

		private String srcAppName;

		private String srcImageList;

		private Long ruleId;

		private String ruleName;

		private Long interceptionName;

		private String dstNamespace;

		private Long lastTime;

		private String dstAppName;

		private String dstRuleTargetName;

		private String clusterName;

		private Integer tryCount;

		private String dstTagList;

		private Integer interceptionType;

		private Integer realInterceptionType;

		private Long id;

		private String clusterId;

		private String realSrcAppName;

		private String realSrcPodName;

		private String realDstAppName;

		private String realDstPodName;

		private String realDstNamespace;

		private String realDstImageName;

		private String realSrcNamespace;

		private String realSrcImageName;

		public String getSrcNamespace() {
			return this.srcNamespace;
		}

		public void setSrcNamespace(String srcNamespace) {
			this.srcNamespace = srcNamespace;
		}

		public String getSrcRuleTargetName() {
			return this.srcRuleTargetName;
		}

		public void setSrcRuleTargetName(String srcRuleTargetName) {
			this.srcRuleTargetName = srcRuleTargetName;
		}

		public Long getRiskLevel() {
			return this.riskLevel;
		}

		public void setRiskLevel(Long riskLevel) {
			this.riskLevel = riskLevel;
		}

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public String getDstImageList() {
			return this.dstImageList;
		}

		public void setDstImageList(String dstImageList) {
			this.dstImageList = dstImageList;
		}

		public String getSrcTagList() {
			return this.srcTagList;
		}

		public void setSrcTagList(String srcTagList) {
			this.srcTagList = srcTagList;
		}

		public Long getDstPort() {
			return this.dstPort;
		}

		public void setDstPort(Long dstPort) {
			this.dstPort = dstPort;
		}

		public Long getFirstTime() {
			return this.firstTime;
		}

		public void setFirstTime(Long firstTime) {
			this.firstTime = firstTime;
		}

		public String getSrcAppName() {
			return this.srcAppName;
		}

		public void setSrcAppName(String srcAppName) {
			this.srcAppName = srcAppName;
		}

		public String getSrcImageList() {
			return this.srcImageList;
		}

		public void setSrcImageList(String srcImageList) {
			this.srcImageList = srcImageList;
		}

		public Long getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Long ruleId) {
			this.ruleId = ruleId;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public Long getInterceptionName() {
			return this.interceptionName;
		}

		public void setInterceptionName(Long interceptionName) {
			this.interceptionName = interceptionName;
		}

		public String getDstNamespace() {
			return this.dstNamespace;
		}

		public void setDstNamespace(String dstNamespace) {
			this.dstNamespace = dstNamespace;
		}

		public Long getLastTime() {
			return this.lastTime;
		}

		public void setLastTime(Long lastTime) {
			this.lastTime = lastTime;
		}

		public String getDstAppName() {
			return this.dstAppName;
		}

		public void setDstAppName(String dstAppName) {
			this.dstAppName = dstAppName;
		}

		public String getDstRuleTargetName() {
			return this.dstRuleTargetName;
		}

		public void setDstRuleTargetName(String dstRuleTargetName) {
			this.dstRuleTargetName = dstRuleTargetName;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public Integer getTryCount() {
			return this.tryCount;
		}

		public void setTryCount(Integer tryCount) {
			this.tryCount = tryCount;
		}

		public String getDstTagList() {
			return this.dstTagList;
		}

		public void setDstTagList(String dstTagList) {
			this.dstTagList = dstTagList;
		}

		public Integer getInterceptionType() {
			return this.interceptionType;
		}

		public void setInterceptionType(Integer interceptionType) {
			this.interceptionType = interceptionType;
		}

		public Integer getRealInterceptionType() {
			return this.realInterceptionType;
		}

		public void setRealInterceptionType(Integer realInterceptionType) {
			this.realInterceptionType = realInterceptionType;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getRealSrcAppName() {
			return this.realSrcAppName;
		}

		public void setRealSrcAppName(String realSrcAppName) {
			this.realSrcAppName = realSrcAppName;
		}

		public String getRealSrcPodName() {
			return this.realSrcPodName;
		}

		public void setRealSrcPodName(String realSrcPodName) {
			this.realSrcPodName = realSrcPodName;
		}

		public String getRealDstAppName() {
			return this.realDstAppName;
		}

		public void setRealDstAppName(String realDstAppName) {
			this.realDstAppName = realDstAppName;
		}

		public String getRealDstPodName() {
			return this.realDstPodName;
		}

		public void setRealDstPodName(String realDstPodName) {
			this.realDstPodName = realDstPodName;
		}

		public String getRealDstNamespace() {
			return this.realDstNamespace;
		}

		public void setRealDstNamespace(String realDstNamespace) {
			this.realDstNamespace = realDstNamespace;
		}

		public String getRealDstImageName() {
			return this.realDstImageName;
		}

		public void setRealDstImageName(String realDstImageName) {
			this.realDstImageName = realDstImageName;
		}

		public String getRealSrcNamespace() {
			return this.realSrcNamespace;
		}

		public void setRealSrcNamespace(String realSrcNamespace) {
			this.realSrcNamespace = realSrcNamespace;
		}

		public String getRealSrcImageName() {
			return this.realSrcImageName;
		}

		public void setRealSrcImageName(String realSrcImageName) {
			this.realSrcImageName = realSrcImageName;
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

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
	}

	@Override
	public ListInterceptionHistoryResponse getInstance(UnmarshallerContext context) {
		return	ListInterceptionHistoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
