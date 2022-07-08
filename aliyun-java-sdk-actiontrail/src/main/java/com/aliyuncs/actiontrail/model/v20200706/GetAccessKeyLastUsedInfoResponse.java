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

package com.aliyuncs.actiontrail.model.v20200706;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.actiontrail.transform.v20200706.GetAccessKeyLastUsedInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAccessKeyLastUsedInfoResponse extends AcsResponse {

	private String requestId;

	private String accessKeyId;

	private String accountId;

	private String ownerId;

	private String userName;

	private String accountType;

	private Long usedTimestamp;

	private String detail;

	private String source;

	private String serviceName;

	private String serviceNameCn;

	private String serviceNameEn;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAccessKeyId() {
		return this.accessKeyId;
	}

	public void setAccessKeyId(String accessKeyId) {
		this.accessKeyId = accessKeyId;
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Long getUsedTimestamp() {
		return this.usedTimestamp;
	}

	public void setUsedTimestamp(Long usedTimestamp) {
		this.usedTimestamp = usedTimestamp;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceNameCn() {
		return this.serviceNameCn;
	}

	public void setServiceNameCn(String serviceNameCn) {
		this.serviceNameCn = serviceNameCn;
	}

	public String getServiceNameEn() {
		return this.serviceNameEn;
	}

	public void setServiceNameEn(String serviceNameEn) {
		this.serviceNameEn = serviceNameEn;
	}

	@Override
	public GetAccessKeyLastUsedInfoResponse getInstance(UnmarshallerContext context) {
		return	GetAccessKeyLastUsedInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
