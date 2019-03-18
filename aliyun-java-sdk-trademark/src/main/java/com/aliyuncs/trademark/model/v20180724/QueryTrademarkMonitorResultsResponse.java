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

	private String requestId;

	private Integer totalItemNum;

	private Integer currentPageNum;

	private Integer pageSize;

	private Integer totalPageNum;

	private Boolean prePage;

	private Boolean nextPage;

	private List<TmMonitorResult> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public Boolean getPrePage() {
		return this.prePage;
	}

	public void setPrePage(Boolean prePage) {
		this.prePage = prePage;
	}

	public Boolean getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(Boolean nextPage) {
		this.nextPage = nextPage;
	}

	public List<TmMonitorResult> getData() {
		return this.data;
	}

	public void setData(List<TmMonitorResult> data) {
		this.data = data;
	}

	public static class TmMonitorResult {

		private String userId;

		private String ruleId;

		private String tmUid;

		private Long dataCreateTime;

		private Long dataUpdateTime;

		private String tmName;

		private String tmImage;

		private String classification;

		private String registrationNumber;

		private String tmProcedureStatusDesc;

		private String ownerName;

		private String ownerEnName;

		private String applyDate;

		private String xuzhanEndDate;

		private String chesanEndDate;

		private String wuxiaoEndDate;

		private String yiyiEndDate;

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}

		public String getTmUid() {
			return this.tmUid;
		}

		public void setTmUid(String tmUid) {
			this.tmUid = tmUid;
		}

		public Long getDataCreateTime() {
			return this.dataCreateTime;
		}

		public void setDataCreateTime(Long dataCreateTime) {
			this.dataCreateTime = dataCreateTime;
		}

		public Long getDataUpdateTime() {
			return this.dataUpdateTime;
		}

		public void setDataUpdateTime(Long dataUpdateTime) {
			this.dataUpdateTime = dataUpdateTime;
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

		public String getClassification() {
			return this.classification;
		}

		public void setClassification(String classification) {
			this.classification = classification;
		}

		public String getRegistrationNumber() {
			return this.registrationNumber;
		}

		public void setRegistrationNumber(String registrationNumber) {
			this.registrationNumber = registrationNumber;
		}

		public String getTmProcedureStatusDesc() {
			return this.tmProcedureStatusDesc;
		}

		public void setTmProcedureStatusDesc(String tmProcedureStatusDesc) {
			this.tmProcedureStatusDesc = tmProcedureStatusDesc;
		}

		public String getOwnerName() {
			return this.ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		public String getOwnerEnName() {
			return this.ownerEnName;
		}

		public void setOwnerEnName(String ownerEnName) {
			this.ownerEnName = ownerEnName;
		}

		public String getApplyDate() {
			return this.applyDate;
		}

		public void setApplyDate(String applyDate) {
			this.applyDate = applyDate;
		}

		public String getXuzhanEndDate() {
			return this.xuzhanEndDate;
		}

		public void setXuzhanEndDate(String xuzhanEndDate) {
			this.xuzhanEndDate = xuzhanEndDate;
		}

		public String getChesanEndDate() {
			return this.chesanEndDate;
		}

		public void setChesanEndDate(String chesanEndDate) {
			this.chesanEndDate = chesanEndDate;
		}

		public String getWuxiaoEndDate() {
			return this.wuxiaoEndDate;
		}

		public void setWuxiaoEndDate(String wuxiaoEndDate) {
			this.wuxiaoEndDate = wuxiaoEndDate;
		}

		public String getYiyiEndDate() {
			return this.yiyiEndDate;
		}

		public void setYiyiEndDate(String yiyiEndDate) {
			this.yiyiEndDate = yiyiEndDate;
		}
	}

	@Override
	public QueryTrademarkMonitorResultsResponse getInstance(UnmarshallerContext context) {
		return	QueryTrademarkMonitorResultsResponseUnmarshaller.unmarshall(this, context);
	}
}
