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

package com.aliyuncs.cas.model.v20180813;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cas.transform.v20180813.DescribeSignatureTradeDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSignatureTradeDetailResponse extends AcsResponse {

	private String requestId;

	private Long id;

	private String docTitle;

	private String transactionId;

	private String peopleName;

	private Long createTime;

	private Integer signStatus;

	private Integer signMode;

	private String docId;

	private String peopleId;

	private String peopleIdentity;

	private String peopleMobile;

	private String peopleEmail;

	private String signCompany;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDocTitle() {
		return this.docTitle;
	}

	public void setDocTitle(String docTitle) {
		this.docTitle = docTitle;
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getPeopleName() {
		return this.peopleName;
	}

	public void setPeopleName(String peopleName) {
		this.peopleName = peopleName;
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Integer getSignStatus() {
		return this.signStatus;
	}

	public void setSignStatus(Integer signStatus) {
		this.signStatus = signStatus;
	}

	public Integer getSignMode() {
		return this.signMode;
	}

	public void setSignMode(Integer signMode) {
		this.signMode = signMode;
	}

	public String getDocId() {
		return this.docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getPeopleId() {
		return this.peopleId;
	}

	public void setPeopleId(String peopleId) {
		this.peopleId = peopleId;
	}

	public String getPeopleIdentity() {
		return this.peopleIdentity;
	}

	public void setPeopleIdentity(String peopleIdentity) {
		this.peopleIdentity = peopleIdentity;
	}

	public String getPeopleMobile() {
		return this.peopleMobile;
	}

	public void setPeopleMobile(String peopleMobile) {
		this.peopleMobile = peopleMobile;
	}

	public String getPeopleEmail() {
		return this.peopleEmail;
	}

	public void setPeopleEmail(String peopleEmail) {
		this.peopleEmail = peopleEmail;
	}

	public String getSignCompany() {
		return this.signCompany;
	}

	public void setSignCompany(String signCompany) {
		this.signCompany = signCompany;
	}

	@Override
	public DescribeSignatureTradeDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeSignatureTradeDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
