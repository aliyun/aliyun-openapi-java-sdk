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

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyCustomerInfoRequest extends RpcAcsRequest<ModifyCustomerInfoResponse> {
	   

	private String customerCategory;

	private String website;

	private String biz;

	private String customerSubCategory;

	private Long userId;
	public ModifyCustomerInfoRequest() {
		super("account-crm", "2016-06-06", "ModifyCustomerInfo");
		setMethod(MethodType.POST);
	}

	public String getCustomerCategory() {
		return this.customerCategory;
	}

	public void setCustomerCategory(String customerCategory) {
		this.customerCategory = customerCategory;
		if(customerCategory != null){
			putQueryParameter("CustomerCategory", customerCategory);
		}
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
		if(website != null){
			putQueryParameter("Website", website);
		}
	}

	public String getBiz() {
		return this.biz;
	}

	public void setBiz(String biz) {
		this.biz = biz;
		if(biz != null){
			putQueryParameter("Biz", biz);
		}
	}

	public String getCustomerSubCategory() {
		return this.customerSubCategory;
	}

	public void setCustomerSubCategory(String customerSubCategory) {
		this.customerSubCategory = customerSubCategory;
		if(customerSubCategory != null){
			putQueryParameter("CustomerSubCategory", customerSubCategory);
		}
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId.toString());
		}
	}

	@Override
	public Class<ModifyCustomerInfoResponse> getResponseClass() {
		return ModifyCustomerInfoResponse.class;
	}

}
