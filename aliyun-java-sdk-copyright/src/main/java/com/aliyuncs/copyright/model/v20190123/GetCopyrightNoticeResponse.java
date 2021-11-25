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

package com.aliyuncs.copyright.model.v20190123;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.copyright.transform.v20190123.GetCopyrightNoticeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCopyrightNoticeResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String applyPeople;

	private String modifyInfo;

	private String flowNumber;

	private String agentPeople;

	private String name;

	private String owner;

	private String createDate;

	private String admissibleNumber;

	private String fileList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getApplyPeople() {
		return this.applyPeople;
	}

	public void setApplyPeople(String applyPeople) {
		this.applyPeople = applyPeople;
	}

	public String getModifyInfo() {
		return this.modifyInfo;
	}

	public void setModifyInfo(String modifyInfo) {
		this.modifyInfo = modifyInfo;
	}

	public String getFlowNumber() {
		return this.flowNumber;
	}

	public void setFlowNumber(String flowNumber) {
		this.flowNumber = flowNumber;
	}

	public String getAgentPeople() {
		return this.agentPeople;
	}

	public void setAgentPeople(String agentPeople) {
		this.agentPeople = agentPeople;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getAdmissibleNumber() {
		return this.admissibleNumber;
	}

	public void setAdmissibleNumber(String admissibleNumber) {
		this.admissibleNumber = admissibleNumber;
	}

	public String getFileList() {
		return this.fileList;
	}

	public void setFileList(String fileList) {
		this.fileList = fileList;
	}

	@Override
	public GetCopyrightNoticeResponse getInstance(UnmarshallerContext context) {
		return	GetCopyrightNoticeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
