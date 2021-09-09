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

package com.aliyuncs.companyreg.model.v20201022;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20201022.GetSsoUserInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSsoUserInfoResponse extends AcsResponse {

	private String opsAppKey;

	private String aliUserId;

	private Long ramUserId;

	private String aliUserAccount;

	private String ramUserAccount;

	private String ramUserName;

	private String requestId;

	private Integer userType;

	public String getOpsAppKey() {
		return this.opsAppKey;
	}

	public void setOpsAppKey(String opsAppKey) {
		this.opsAppKey = opsAppKey;
	}

	public String getAliUserId() {
		return this.aliUserId;
	}

	public void setAliUserId(String aliUserId) {
		this.aliUserId = aliUserId;
	}

	public Long getRamUserId() {
		return this.ramUserId;
	}

	public void setRamUserId(Long ramUserId) {
		this.ramUserId = ramUserId;
	}

	public String getAliUserAccount() {
		return this.aliUserAccount;
	}

	public void setAliUserAccount(String aliUserAccount) {
		this.aliUserAccount = aliUserAccount;
	}

	public String getRamUserAccount() {
		return this.ramUserAccount;
	}

	public void setRamUserAccount(String ramUserAccount) {
		this.ramUserAccount = ramUserAccount;
	}

	public String getRamUserName() {
		return this.ramUserName;
	}

	public void setRamUserName(String ramUserName) {
		this.ramUserName = ramUserName;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getUserType() {
		return this.userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	@Override
	public GetSsoUserInfoResponse getInstance(UnmarshallerContext context) {
		return	GetSsoUserInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
