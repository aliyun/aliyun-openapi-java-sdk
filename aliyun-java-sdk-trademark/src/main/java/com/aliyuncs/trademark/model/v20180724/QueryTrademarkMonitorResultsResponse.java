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

package com.aliyuncs.trademark.model.v20180724;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20180724.QueryTrademarkMonitorResultsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTrademarkMonitorResultsResponse extends AcsResponse {

	private Boolean nextPage;

	private String requestId;

	private Boolean prePage;

	private Integer totalItemNum;

	private Integer currentPageNum;

	private Integer totalPageNum;

	private Integer pageSize;

	private List<TmMonitorResult> data;

	public Boolean getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(Boolean nextPage) {
		this.nextPage = nextPage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getPrePage() {
		return this.prePage;
	}

	public void setPrePage(Boolean prePage) {
		this.prePage = prePage;
	}

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

	public Integer getCurrentPageNum() {
		return this.currentPageNum;
	}

	public void setCurrentPageNum(Integer currentPageNum) {
		this.currentPageNum = currentPageNum;
	}

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<TmMonitorResult> getData() {
		return this.data;
	}

	public void setData(List<TmMonitorResult> data) {
		this.data = data;
	}

	public static class TmMonitorResult {

		private String tmProcedureStatusDesc;

		private String wuxiaoEndDate;

		private String userId;

		private String ownerEnName;

		private String tmUid;

		private String ownerName;

		private Long dataUpdateTime;

		private String chesanEndDate;

		private String xuzhanEndDate;

		private String ruleId;

		private String registrationNumber;

		private String tmName;

		private String tmImage;

		private Long dataCreateTime;

		private String yiyiEndDate;

		private String classification;

		private String applyDate;

		public String getTmProcedureStatusDesc() {
			return this.tmProcedureStatusDesc;
		}

		public void setTmProcedureStatusDesc(String tmProcedureStatusDesc) {
			this.tmProcedureStatusDesc = tmProcedureStatusDesc;
		}

		public String getWuxiaoEndDate() {
			return this.wuxiaoEndDate;
		}

		public void setWuxiaoEndDate(String wuxiaoEndDate) {
			this.wuxiaoEndDate = wuxiaoEndDate;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getOwnerEnName() {
			return this.ownerEnName;
		}

		public void setOwnerEnName(String ownerEnName) {
			this.ownerEnName = ownerEnName;
		}

		public String getTmUid() {
			return this.tmUid;
		}

		public void setTmUid(String tmUid) {
			this.tmUid = tmUid;
		}

		public String getOwnerName() {
			return this.ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		public Long getDataUpdateTime() {
			return this.dataUpdateTime;
		}

		public void setDataUpdateTime(Long dataUpdateTime) {
			this.dataUpdateTime = dataUpdateTime;
		}

		public String getChesanEndDate() {
			return this.chesanEndDate;
		}

		public void setChesanEndDate(String chesanEndDate) {
			this.chesanEndDate = chesanEndDate;
		}

		public String getXuzhanEndDate() {
			return this.xuzhanEndDate;
		}

		public void setXuzhanEndDate(String xuzhanEndDate) {
			this.xuzhanEndDate = xuzhanEndDate;
		}

		public String getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}

		public String getRegistrationNumber() {
			return this.registrationNumber;
		}

		public void setRegistrationNumber(String registrationNumber) {
			this.registrationNumber = registrationNumber;
		}

		public String getTmName() {
			return this.tmName;
		}

		public void setTmName(String tmName) {
			this.tmName = tmName;
		}

		public String getTmImage() {
			return this.tmImage;
		}

		public void setTmImage(String tmImage) {
			this.tmImage = tmImage;
		}

		public Long getDataCreateTime() {
			return this.dataCreateTime;
		}

		public void setDataCreateTime(Long dataCreateTime) {
			this.dataCreateTime = dataCreateTime;
		}

		public String getYiyiEndDate() {
			return this.yiyiEndDate;
		}

		public void setYiyiEndDate(String yiyiEndDate) {
			this.yiyiEndDate = yiyiEndDate;
		}

		public String getClassification() {
			return this.classification;
		}

		public void setClassification(String classification) {
			this.classification = classification;
		}

		public String getApplyDate() {
			return this.applyDate;
		}

		public void setApplyDate(String applyDate) {
			this.applyDate = applyDate;
		}
	}

	@Override
	public QueryTrademarkMonitorResultsResponse getInstance(UnmarshallerContext context) {
		return	QueryTrademarkMonitorResultsResponseUnmarshaller.unmarshall(this, context);
	}
}
