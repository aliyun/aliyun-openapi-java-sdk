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

package com.aliyuncs.dt_oc_info.model.v20220829;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcOperationRecruitmentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcOperationRecruitmentResponse extends AcsResponse {

	private String code;

	private Boolean success;

	private String message;

	private Integer totalNum;

	private Integer pageIndex;

	private Integer pageNum;

	private String requestId;

	private List<DataItem> data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String entName;

		private String recruitingName;

		private String description;

		private String salary;

		private String recruitingAddress;

		private String education;

		private String experience;

		private String benefitList;

		private String publishDate;

		private String startDate;

		private String endDate;

		private String pageUrl;

		public String getEntName() {
			return this.entName;
		}

		public void setEntName(String entName) {
			this.entName = entName;
		}

		public String getRecruitingName() {
			return this.recruitingName;
		}

		public void setRecruitingName(String recruitingName) {
			this.recruitingName = recruitingName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSalary() {
			return this.salary;
		}

		public void setSalary(String salary) {
			this.salary = salary;
		}

		public String getRecruitingAddress() {
			return this.recruitingAddress;
		}

		public void setRecruitingAddress(String recruitingAddress) {
			this.recruitingAddress = recruitingAddress;
		}

		public String getEducation() {
			return this.education;
		}

		public void setEducation(String education) {
			this.education = education;
		}

		public String getExperience() {
			return this.experience;
		}

		public void setExperience(String experience) {
			this.experience = experience;
		}

		public String getBenefitList() {
			return this.benefitList;
		}

		public void setBenefitList(String benefitList) {
			this.benefitList = benefitList;
		}

		public String getPublishDate() {
			return this.publishDate;
		}

		public void setPublishDate(String publishDate) {
			this.publishDate = publishDate;
		}

		public String getStartDate() {
			return this.startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public String getEndDate() {
			return this.endDate;
		}

		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}

		public String getPageUrl() {
			return this.pageUrl;
		}

		public void setPageUrl(String pageUrl) {
			this.pageUrl = pageUrl;
		}
	}

	@Override
	public GetOcOperationRecruitmentResponse getInstance(UnmarshallerContext context) {
		return	GetOcOperationRecruitmentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
