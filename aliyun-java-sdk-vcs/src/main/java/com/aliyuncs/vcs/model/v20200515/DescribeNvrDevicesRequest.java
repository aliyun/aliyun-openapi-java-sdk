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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeNvrDevicesRequest extends RpcAcsRequest<DescribeNvrDevicesResponse> {
	   

	private String nvrDeviceIdList;

	private Long pageNum;

	private String corpIdList;

	private String deviceFilter;

	private Long pageSize;
	public DescribeNvrDevicesRequest() {
		super("Vcs", "2020-05-15", "DescribeNvrDevices");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNvrDeviceIdList() {
		return this.nvrDeviceIdList;
	}

	public void setNvrDeviceIdList(String nvrDeviceIdList) {
		this.nvrDeviceIdList = nvrDeviceIdList;
		if(nvrDeviceIdList != null){
			putBodyParameter("NvrDeviceIdList", nvrDeviceIdList);
		}
	}

	public Long getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putBodyParameter("PageNum", pageNum.toString());
		}
	}

	public String getCorpIdList() {
		return this.corpIdList;
	}

	public void setCorpIdList(String corpIdList) {
		this.corpIdList = corpIdList;
		if(corpIdList != null){
			putBodyParameter("CorpIdList", corpIdList);
		}
	}

	public String getDeviceFilter() {
		return this.deviceFilter;
	}

	public void setDeviceFilter(String deviceFilter) {
		this.deviceFilter = deviceFilter;
		if(deviceFilter != null){
			putBodyParameter("DeviceFilter", deviceFilter);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<DescribeNvrDevicesResponse> getResponseClass() {
		return DescribeNvrDevicesResponse.class;
	}

}
