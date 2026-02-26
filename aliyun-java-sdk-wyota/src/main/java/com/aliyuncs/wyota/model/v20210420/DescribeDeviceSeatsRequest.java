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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeDeviceSeatsRequest extends RpcAcsRequest<DescribeDeviceSeatsResponse> {
	   

	private List<String> serialNoLists;

	private Integer pageSize;

	private String tenantId;

	private String siteId;

	private Integer pageNumber;

	private String serialNo;
	public DescribeDeviceSeatsRequest() {
		super("wyota", "2021-04-20", "DescribeDeviceSeats");
		setMethod(MethodType.POST);
	}

	public List<String> getSerialNoLists() {
		return this.serialNoLists;
	}

	public void setSerialNoLists(List<String> serialNoLists) {
		this.serialNoLists = serialNoLists;	
		if (serialNoLists != null) {
			for (int i = 0; i < serialNoLists.size(); i++) {
				putBodyParameter("SerialNoList." + (i + 1) , serialNoLists.get(i));
			}
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

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getSiteId() {
		return this.siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
		if(siteId != null){
			putBodyParameter("SiteId", siteId);
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

	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
		if(serialNo != null){
			putBodyParameter("SerialNo", serialNo);
		}
	}

	@Override
	public Class<DescribeDeviceSeatsResponse> getResponseClass() {
		return DescribeDeviceSeatsResponse.class;
	}

}
