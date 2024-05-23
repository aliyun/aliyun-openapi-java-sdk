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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListPhoneTagsRequest extends RpcAcsRequest<ListPhoneTagsResponse> {
	   

	private List<String> numberGroupIdss;

	private Integer currentPage;

	private Boolean outboundOnly;

	private String number;

	private String instanceId;

	private Integer pageSize;
	public ListPhoneTagsRequest() {
		super("CCC", "2017-07-05", "ListPhoneTags", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getNumberGroupIdss() {
		return this.numberGroupIdss;
	}

	public void setNumberGroupIdss(List<String> numberGroupIdss) {
		this.numberGroupIdss = numberGroupIdss;	
		if (numberGroupIdss != null) {
			for (int i = 0; i < numberGroupIdss.size(); i++) {
				putQueryParameter("NumberGroupIds." + (i + 1) , numberGroupIdss.get(i));
			}
		}	
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public Boolean getOutboundOnly() {
		return this.outboundOnly;
	}

	public void setOutboundOnly(Boolean outboundOnly) {
		this.outboundOnly = outboundOnly;
		if(outboundOnly != null){
			putQueryParameter("OutboundOnly", outboundOnly.toString());
		}
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
		if(number != null){
			putQueryParameter("Number", number);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
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

	@Override
	public Class<ListPhoneTagsResponse> getResponseClass() {
		return ListPhoneTagsResponse.class;
	}

}
