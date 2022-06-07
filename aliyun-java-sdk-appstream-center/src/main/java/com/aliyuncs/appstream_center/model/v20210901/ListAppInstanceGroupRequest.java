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

package com.aliyuncs.appstream_center.model.v20210901;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListAppInstanceGroupRequest extends RpcAcsRequest<ListAppInstanceGroupResponse> {
	   

	private Integer pageNumber;

	private String productType;

	private String appInstanceGroupName;

	private String appInstanceGroupId;

	private Integer pageSize;

	private List<String> statuss;
	public ListAppInstanceGroupRequest() {
		super("appstream-center", "2021-09-01", "ListAppInstanceGroup");
		setMethod(MethodType.POST);
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

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
		if(productType != null){
			putQueryParameter("ProductType", productType);
		}
	}

	public String getAppInstanceGroupName() {
		return this.appInstanceGroupName;
	}

	public void setAppInstanceGroupName(String appInstanceGroupName) {
		this.appInstanceGroupName = appInstanceGroupName;
		if(appInstanceGroupName != null){
			putQueryParameter("AppInstanceGroupName", appInstanceGroupName);
		}
	}

	public String getAppInstanceGroupId() {
		return this.appInstanceGroupId;
	}

	public void setAppInstanceGroupId(String appInstanceGroupId) {
		this.appInstanceGroupId = appInstanceGroupId;
		if(appInstanceGroupId != null){
			putQueryParameter("AppInstanceGroupId", appInstanceGroupId);
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

	public List<String> getStatuss() {
		return this.statuss;
	}

	public void setStatuss(List<String> statuss) {
		this.statuss = statuss;	
		if (statuss != null) {
			for (int i = 0; i < statuss.size(); i++) {
				putBodyParameter("Status." + (i + 1) , statuss.get(i));
			}
		}	
	}

	@Override
	public Class<ListAppInstanceGroupResponse> getResponseClass() {
		return ListAppInstanceGroupResponse.class;
	}

}
