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
public class DescribeChannelsRequest extends RpcAcsRequest<DescribeChannelsResponse> {
	   

	private String nvrId;

	private Long pageNum;

	private Long showUnConfig;

	private String deviceFilter;

	private Long pageSize;
	public DescribeChannelsRequest() {
		super("Vcs", "2020-05-15", "DescribeChannels");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNvrId() {
		return this.nvrId;
	}

	public void setNvrId(String nvrId) {
		this.nvrId = nvrId;
		if(nvrId != null){
			putBodyParameter("NvrId", nvrId);
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

	public Long getShowUnConfig() {
		return this.showUnConfig;
	}

	public void setShowUnConfig(Long showUnConfig) {
		this.showUnConfig = showUnConfig;
		if(showUnConfig != null){
			putBodyParameter("ShowUnConfig", showUnConfig.toString());
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
	public Class<DescribeChannelsResponse> getResponseClass() {
		return DescribeChannelsResponse.class;
	}

}
