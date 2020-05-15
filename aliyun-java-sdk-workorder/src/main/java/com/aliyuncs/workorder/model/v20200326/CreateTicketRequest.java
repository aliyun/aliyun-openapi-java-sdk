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

package com.aliyuncs.workorder.model.v20200326;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.workorder.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTicketRequest extends RpcAcsRequest<CreateTicketResponse> {
	   

	private String productCode;

	private String language;

	private String title;

	private String content;

	private String notifyTimeRange;

	private String phone;

	private String category;

	private String email;

	private String secretContent;
	public CreateTicketRequest() {
		super("Workorder", "2020-03-26", "CreateTicket", "workorder");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putQueryParameter("Language", language);
		}
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putQueryParameter("Title", title);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putQueryParameter("Content", content);
		}
	}

	public String getNotifyTimeRange() {
		return this.notifyTimeRange;
	}

	public void setNotifyTimeRange(String notifyTimeRange) {
		this.notifyTimeRange = notifyTimeRange;
		if(notifyTimeRange != null){
			putQueryParameter("NotifyTimeRange", notifyTimeRange);
		}
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		if(phone != null){
			putQueryParameter("Phone", phone);
		}
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putQueryParameter("Category", category);
		}
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email != null){
			putQueryParameter("Email", email);
		}
	}

	public String getSecretContent() {
		return this.secretContent;
	}

	public void setSecretContent(String secretContent) {
		this.secretContent = secretContent;
		if(secretContent != null){
			putQueryParameter("SecretContent", secretContent);
		}
	}

	@Override
	public Class<CreateTicketResponse> getResponseClass() {
		return CreateTicketResponse.class;
	}

}
