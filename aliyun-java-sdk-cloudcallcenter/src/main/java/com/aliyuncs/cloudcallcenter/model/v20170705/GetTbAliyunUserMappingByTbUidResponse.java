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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.GetTbAliyunUserMappingByTbUidResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTbAliyunUserMappingByTbUidResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Long id;

	private Long tbUserid;

	private String tbNickname;

	private Long aliyunPk;

	private Boolean subAccount;

	private Long primaryAccountPk;

	private String aliyunAkId;

	private String aliyunAkSecret;

	private String taobaoAccessToken;

	private Integer taobaoAccessTokenExpiresIn;

	private Long taobaoAccessTokenCreate;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTbUserid() {
		return this.tbUserid;
	}

	public void setTbUserid(Long tbUserid) {
		this.tbUserid = tbUserid;
	}

	public String getTbNickname() {
		return this.tbNickname;
	}

	public void setTbNickname(String tbNickname) {
		this.tbNickname = tbNickname;
	}

	public Long getAliyunPk() {
		return this.aliyunPk;
	}

	public void setAliyunPk(Long aliyunPk) {
		this.aliyunPk = aliyunPk;
	}

	public Boolean getSubAccount() {
		return this.subAccount;
	}

	public void setSubAccount(Boolean subAccount) {
		this.subAccount = subAccount;
	}

	public Long getPrimaryAccountPk() {
		return this.primaryAccountPk;
	}

	public void setPrimaryAccountPk(Long primaryAccountPk) {
		this.primaryAccountPk = primaryAccountPk;
	}

	public String getAliyunAkId() {
		return this.aliyunAkId;
	}

	public void setAliyunAkId(String aliyunAkId) {
		this.aliyunAkId = aliyunAkId;
	}

	public String getAliyunAkSecret() {
		return this.aliyunAkSecret;
	}

	public void setAliyunAkSecret(String aliyunAkSecret) {
		this.aliyunAkSecret = aliyunAkSecret;
	}

	public String getTaobaoAccessToken() {
		return this.taobaoAccessToken;
	}

	public void setTaobaoAccessToken(String taobaoAccessToken) {
		this.taobaoAccessToken = taobaoAccessToken;
	}

	public Integer getTaobaoAccessTokenExpiresIn() {
		return this.taobaoAccessTokenExpiresIn;
	}

	public void setTaobaoAccessTokenExpiresIn(Integer taobaoAccessTokenExpiresIn) {
		this.taobaoAccessTokenExpiresIn = taobaoAccessTokenExpiresIn;
	}

	public Long getTaobaoAccessTokenCreate() {
		return this.taobaoAccessTokenCreate;
	}

	public void setTaobaoAccessTokenCreate(Long taobaoAccessTokenCreate) {
		this.taobaoAccessTokenCreate = taobaoAccessTokenCreate;
	}

	@Override
	public GetTbAliyunUserMappingByTbUidResponse getInstance(UnmarshallerContext context) {
		return	GetTbAliyunUserMappingByTbUidResponseUnmarshaller.unmarshall(this, context);
	}
}
