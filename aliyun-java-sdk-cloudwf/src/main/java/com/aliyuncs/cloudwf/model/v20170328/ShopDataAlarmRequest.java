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

package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ShopDataAlarmRequest extends RpcAcsRequest<ShopDataAlarmResponse> {
	
	public ShopDataAlarmRequest() {
		super("cloudwf", "2017-03-28", "ShopDataAlarm", "cloudwf");
	}

	private String warnPhone;

	private Integer warn;

	private Integer closeWarn;

	private String warnEmail;

	private Long sid;

	public String getWarnPhone() {
		return this.warnPhone;
	}

	public void setWarnPhone(String warnPhone) {
		this.warnPhone = warnPhone;
		if(warnPhone != null){
			putQueryParameter("WarnPhone", warnPhone);
		}
	}

	public Integer getWarn() {
		return this.warn;
	}

	public void setWarn(Integer warn) {
		this.warn = warn;
		if(warn != null){
			putQueryParameter("Warn", warn.toString());
		}
	}

	public Integer getCloseWarn() {
		return this.closeWarn;
	}

	public void setCloseWarn(Integer closeWarn) {
		this.closeWarn = closeWarn;
		if(closeWarn != null){
			putQueryParameter("CloseWarn", closeWarn.toString());
		}
	}

	public String getWarnEmail() {
		return this.warnEmail;
	}

	public void setWarnEmail(String warnEmail) {
		this.warnEmail = warnEmail;
		if(warnEmail != null){
			putQueryParameter("WarnEmail", warnEmail);
		}
	}

	public Long getSid() {
		return this.sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
		if(sid != null){
			putQueryParameter("Sid", sid.toString());
		}
	}

	@Override
	public Class<ShopDataAlarmResponse> getResponseClass() {
		return ShopDataAlarmResponse.class;
	}

}
