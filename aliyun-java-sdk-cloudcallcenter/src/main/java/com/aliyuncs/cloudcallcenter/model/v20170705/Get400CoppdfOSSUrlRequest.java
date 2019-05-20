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

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class Get400CoppdfOSSUrlRequest extends RpcAcsRequest<Get400CoppdfOSSUrlResponse> {
	
	public Get400CoppdfOSSUrlRequest() {
		super("CloudCallCenter", "2017-07-05", "Get400CoppdfOSSUrl", "CloudCallCenter", "innerAPI");
	}

	private String number;

	private String managerCertEffDate;

	private String managerName;

	private String managerCertPic;

	private String managerCertNumber;

	private String managerCertExpDate;

	private String managerMobilePhone;

	private String managerCertType;

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
		if(number != null){
			putQueryParameter("Number", number);
		}
	}

	public String getManagerCertEffDate() {
		return this.managerCertEffDate;
	}

	public void setManagerCertEffDate(String managerCertEffDate) {
		this.managerCertEffDate = managerCertEffDate;
		if(managerCertEffDate != null){
			putQueryParameter("ManagerCertEffDate", managerCertEffDate);
		}
	}

	public String getManagerName() {
		return this.managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
		if(managerName != null){
			putQueryParameter("ManagerName", managerName);
		}
	}

	public String getManagerCertPic() {
		return this.managerCertPic;
	}

	public void setManagerCertPic(String managerCertPic) {
		this.managerCertPic = managerCertPic;
		if(managerCertPic != null){
			putQueryParameter("ManagerCertPic", managerCertPic);
		}
	}

	public String getManagerCertNumber() {
		return this.managerCertNumber;
	}

	public void setManagerCertNumber(String managerCertNumber) {
		this.managerCertNumber = managerCertNumber;
		if(managerCertNumber != null){
			putQueryParameter("ManagerCertNumber", managerCertNumber);
		}
	}

	public String getManagerCertExpDate() {
		return this.managerCertExpDate;
	}

	public void setManagerCertExpDate(String managerCertExpDate) {
		this.managerCertExpDate = managerCertExpDate;
		if(managerCertExpDate != null){
			putQueryParameter("ManagerCertExpDate", managerCertExpDate);
		}
	}

	public String getManagerMobilePhone() {
		return this.managerMobilePhone;
	}

	public void setManagerMobilePhone(String managerMobilePhone) {
		this.managerMobilePhone = managerMobilePhone;
		if(managerMobilePhone != null){
			putQueryParameter("ManagerMobilePhone", managerMobilePhone);
		}
	}

	public String getManagerCertType() {
		return this.managerCertType;
	}

	public void setManagerCertType(String managerCertType) {
		this.managerCertType = managerCertType;
		if(managerCertType != null){
			putQueryParameter("ManagerCertType", managerCertType);
		}
	}

	@Override
	public Class<Get400CoppdfOSSUrlResponse> getResponseClass() {
		return Get400CoppdfOSSUrlResponse.class;
	}

}
