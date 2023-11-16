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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListSoftwareForUserDeviceRequest extends RpcAcsRequest<ListSoftwareForUserDeviceResponse> {
	   

	private String deviceTag;

	private Long currentPage;

	private Long pageSize;
	public ListSoftwareForUserDeviceRequest() {
		super("csas", "2023-01-20", "ListSoftwareForUserDevice");
		setMethod(MethodType.GET);
	}

	public String getDeviceTag() {
		return this.deviceTag;
	}

	public void setDeviceTag(String deviceTag) {
		this.deviceTag = deviceTag;
		if(deviceTag != null){
			putQueryParameter("DeviceTag", deviceTag);
		}
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<ListSoftwareForUserDeviceResponse> getResponseClass() {
		return ListSoftwareForUserDeviceResponse.class;
	}

}
