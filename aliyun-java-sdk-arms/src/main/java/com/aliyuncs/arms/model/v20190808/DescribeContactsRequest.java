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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeContactsRequest extends RpcAcsRequest<DescribeContactsResponse> {
	   

	private String contactIds;

	private String verbose;

	private String contactName;

	private Long size;

	private String phone;

	private Long page;

	private String email;
	public DescribeContactsRequest() {
		super("ARMS", "2019-08-08", "DescribeContacts", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getContactIds() {
		return this.contactIds;
	}

	public void setContactIds(String contactIds) {
		this.contactIds = contactIds;
		if(contactIds != null){
			putQueryParameter("ContactIds", contactIds);
		}
	}

	public String getVerbose() {
		return this.verbose;
	}

	public void setVerbose(String verbose) {
		this.verbose = verbose;
		if(verbose != null){
			putQueryParameter("Verbose", verbose);
		}
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
		if(contactName != null){
			putQueryParameter("ContactName", contactName);
		}
	}

	public Long getSize() {
		return this.size;
	}

	public void setSize(Long size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
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

	public Long getPage() {
		return this.page;
	}

	public void setPage(Long page) {
		this.page = page;
		if(page != null){
			putQueryParameter("Page", page.toString());
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

	@Override
	public Class<DescribeContactsResponse> getResponseClass() {
		return DescribeContactsResponse.class;
	}

}
