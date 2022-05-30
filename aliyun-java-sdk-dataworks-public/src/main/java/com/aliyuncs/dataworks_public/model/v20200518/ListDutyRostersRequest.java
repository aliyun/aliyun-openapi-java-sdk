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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListDutyRostersRequest extends RpcAcsRequest<ListDutyRostersResponse> {
	   

	private String dutyRosterOwner;

	private String dutyRosterName;

	private Integer pageSize;

	private Integer pageNumber;
	public ListDutyRostersRequest() {
		super("dataworks-public", "2020-05-18", "ListDutyRosters");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDutyRosterOwner() {
		return this.dutyRosterOwner;
	}

	public void setDutyRosterOwner(String dutyRosterOwner) {
		this.dutyRosterOwner = dutyRosterOwner;
		if(dutyRosterOwner != null){
			putBodyParameter("DutyRosterOwner", dutyRosterOwner);
		}
	}

	public String getDutyRosterName() {
		return this.dutyRosterName;
	}

	public void setDutyRosterName(String dutyRosterName) {
		this.dutyRosterName = dutyRosterName;
		if(dutyRosterName != null){
			putBodyParameter("DutyRosterName", dutyRosterName);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	@Override
	public Class<ListDutyRostersResponse> getResponseClass() {
		return ListDutyRostersResponse.class;
	}

}
