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

package com.aliyuncs.swas.model.v20170810;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas.transform.v20170810.GetServerDomainsSettingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetServerDomainsSettingResponse extends AcsResponse {

	private Boolean isSuccess;

	private Boolean addSettingStatus;

	private Integer addSettingNum;

	private Integer httpsSettingOff;

	private String requestId;

	private Integer httpsSettingOn;

	private Integer httpsSettingNoSetting;

	private String beianSettingDomain;

	private Boolean beianSettingStatus;

	private String addSettingDomain;

	private String code;

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public Boolean getAddSettingStatus() {
		return this.addSettingStatus;
	}

	public void setAddSettingStatus(Boolean addSettingStatus) {
		this.addSettingStatus = addSettingStatus;
	}

	public Integer getAddSettingNum() {
		return this.addSettingNum;
	}

	public void setAddSettingNum(Integer addSettingNum) {
		this.addSettingNum = addSettingNum;
	}

	public Integer getHttpsSettingOff() {
		return this.httpsSettingOff;
	}

	public void setHttpsSettingOff(Integer httpsSettingOff) {
		this.httpsSettingOff = httpsSettingOff;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpsSettingOn() {
		return this.httpsSettingOn;
	}

	public void setHttpsSettingOn(Integer httpsSettingOn) {
		this.httpsSettingOn = httpsSettingOn;
	}

	public Integer getHttpsSettingNoSetting() {
		return this.httpsSettingNoSetting;
	}

	public void setHttpsSettingNoSetting(Integer httpsSettingNoSetting) {
		this.httpsSettingNoSetting = httpsSettingNoSetting;
	}

	public String getBeianSettingDomain() {
		return this.beianSettingDomain;
	}

	public void setBeianSettingDomain(String beianSettingDomain) {
		this.beianSettingDomain = beianSettingDomain;
	}

	public Boolean getBeianSettingStatus() {
		return this.beianSettingStatus;
	}

	public void setBeianSettingStatus(Boolean beianSettingStatus) {
		this.beianSettingStatus = beianSettingStatus;
	}

	public String getAddSettingDomain() {
		return this.addSettingDomain;
	}

	public void setAddSettingDomain(String addSettingDomain) {
		this.addSettingDomain = addSettingDomain;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public GetServerDomainsSettingResponse getInstance(UnmarshallerContext context) {
		return	GetServerDomainsSettingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
