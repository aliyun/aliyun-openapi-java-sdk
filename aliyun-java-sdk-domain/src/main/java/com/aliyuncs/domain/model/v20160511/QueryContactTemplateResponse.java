/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.domain.model.v20160511;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20160511.QueryContactTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryContactTemplateResponse extends AcsResponse {

	private String requestId;

	private Integer totalItemNum;

	private Integer currentPageNum;

	private Integer totalPageNum;

	private Integer pageSize;

	private Boolean prePage;

	private Boolean nextPage;

	private List<ContactTemplate> contactTemplates;

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

	public List<ContactTemplate> getContactTemplates() {
		return this.contactTemplates;
	}

	public void setContactTemplates(List<ContactTemplate> contactTemplates) {
		this.contactTemplates = contactTemplates;
	}

	public static class ContactTemplate {

		private Long contactTemplateId;

		private String createTime;

		private String updateTime;

		private String userId;

		private String regType;

		private Boolean defaultTemplate;

		private String auditStatus;

		private String cName;

		private String eName;

		private String cCompany;

		private String eCompany;

		private String cCountry;

		private String cProvince;

		private String eProvince;

		private String cCity;

		private String eCity;

		private String cVenu;

		private String eVenu;

		private String email;

		private String telArea;

		private String postalCode;

		private String telMain;

		private String telExt;

		public Long getContactTemplateId() {
			return this.contactTemplateId;
		}

		public void setContactTemplateId(Long contactTemplateId) {
			this.contactTemplateId = contactTemplateId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getRegType() {
			return this.regType;
		}

		public void setRegType(String regType) {
			this.regType = regType;
		}

		public Boolean getDefaultTemplate() {
			return this.defaultTemplate;
		}

		public void setDefaultTemplate(Boolean defaultTemplate) {
			this.defaultTemplate = defaultTemplate;
		}

		public String getAuditStatus() {
			return this.auditStatus;
		}

		public void setAuditStatus(String auditStatus) {
			this.auditStatus = auditStatus;
		}

		public String getCName() {
			return this.cName;
		}

		public void setCName(String cName) {
			this.cName = cName;
		}

		public String getEName() {
			return this.eName;
		}

		public void setEName(String eName) {
			this.eName = eName;
		}

		public String getCCompany() {
			return this.cCompany;
		}

		public void setCCompany(String cCompany) {
			this.cCompany = cCompany;
		}

		public String getECompany() {
			return this.eCompany;
		}

		public void setECompany(String eCompany) {
			this.eCompany = eCompany;
		}

		public String getCCountry() {
			return this.cCountry;
		}

		public void setCCountry(String cCountry) {
			this.cCountry = cCountry;
		}

		public String getCProvince() {
			return this.cProvince;
		}

		public void setCProvince(String cProvince) {
			this.cProvince = cProvince;
		}

		public String getEProvince() {
			return this.eProvince;
		}

		public void setEProvince(String eProvince) {
			this.eProvince = eProvince;
		}

		public String getCCity() {
			return this.cCity;
		}

		public void setCCity(String cCity) {
			this.cCity = cCity;
		}

		public String getECity() {
			return this.eCity;
		}

		public void setECity(String eCity) {
			this.eCity = eCity;
		}

		public String getCVenu() {
			return this.cVenu;
		}

		public void setCVenu(String cVenu) {
			this.cVenu = cVenu;
		}

		public String getEVenu() {
			return this.eVenu;
		}

		public void setEVenu(String eVenu) {
			this.eVenu = eVenu;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTelArea() {
			return this.telArea;
		}

		public void setTelArea(String telArea) {
			this.telArea = telArea;
		}

		public String getPostalCode() {
			return this.postalCode;
		}

		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}

		public String getTelMain() {
			return this.telMain;
		}

		public void setTelMain(String telMain) {
			this.telMain = telMain;
		}

		public String getTelExt() {
			return this.telExt;
		}

		public void setTelExt(String telExt) {
			this.telExt = telExt;
		}
	}

	@Override
	public QueryContactTemplateResponse getInstance(UnmarshallerContext context) {
		return	QueryContactTemplateResponseUnmarshaller.unmarshall(this, context);
	}
}
