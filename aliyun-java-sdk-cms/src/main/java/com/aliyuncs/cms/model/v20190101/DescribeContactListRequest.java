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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeContactListRequest extends RpcAcsRequest<DescribeContactListResponse> {
	   

	private String chanelType;

	private Integer pageNumber;

	private String contactName;

	private Integer pageSize;

	private String chanelValue;
	public DescribeContactListRequest() {
		super("Cms", "2019-01-01", "DescribeContactList", "cms");
		setMethod(MethodType.POST);
	}

	public String getChanelType() {
		return this.chanelType;
	}

	public void setChanelType(String chanelType) {
		this.chanelType = chanelType;
		if(chanelType != null){
			putQueryParameter("ChanelType", chanelType);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getChanelValue() {
		return this.chanelValue;
	}

	public void setChanelValue(String chanelValue) {
		this.chanelValue = chanelValue;
		if(chanelValue != null){
			putQueryParameter("ChanelValue", chanelValue);
		}
	}

	@Override
	public Class<DescribeContactListResponse> getResponseClass() {
		return DescribeContactListResponse.class;
	}

}
