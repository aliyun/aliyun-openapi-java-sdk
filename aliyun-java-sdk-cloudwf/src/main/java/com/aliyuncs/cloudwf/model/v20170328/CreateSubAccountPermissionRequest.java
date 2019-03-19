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

package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class CreateSubAccountPermissionRequest extends RpcAcsRequest<CreateSubAccountPermissionResponse> {
	
	public CreateSubAccountPermissionRequest() {
		super("cloudwf", "2017-03-28", "CreateSubAccountPermission", "cloudwf");
	}

	private Long uid;

	private List<Long> shopGroupIdss;

	private List<Long> shopIdss;

	private String pagePermission;

	private Integer permissionType;

	private List<Long> businessIdss;

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid.toString());
		}
	}

	public List<Long> getShopGroupIdss() {
		return this.shopGroupIdss;
	}

	public void setShopGroupIdss(List<Long> shopGroupIdss) {
		this.shopGroupIdss = shopGroupIdss;	
		if (shopGroupIdss != null) {
			for (int i = 0; i < shopGroupIdss.size(); i++) {
				putQueryParameter("ShopGroupIds." + (i + 1) , shopGroupIdss.get(i));
			}
		}	
	}

	public List<Long> getShopIdss() {
		return this.shopIdss;
	}

	public void setShopIdss(List<Long> shopIdss) {
		this.shopIdss = shopIdss;	
		if (shopIdss != null) {
			for (int i = 0; i < shopIdss.size(); i++) {
				putQueryParameter("ShopIds." + (i + 1) , shopIdss.get(i));
			}
		}	
	}

	public String getPagePermission() {
		return this.pagePermission;
	}

	public void setPagePermission(String pagePermission) {
		this.pagePermission = pagePermission;
		if(pagePermission != null){
			putQueryParameter("PagePermission", pagePermission);
		}
	}

	public Integer getPermissionType() {
		return this.permissionType;
	}

	public void setPermissionType(Integer permissionType) {
		this.permissionType = permissionType;
		if(permissionType != null){
			putQueryParameter("PermissionType", permissionType.toString());
		}
	}

	public List<Long> getBusinessIdss() {
		return this.businessIdss;
	}

	public void setBusinessIdss(List<Long> businessIdss) {
		this.businessIdss = businessIdss;	
		if (businessIdss != null) {
			for (int i = 0; i < businessIdss.size(); i++) {
				putQueryParameter("BusinessIds." + (i + 1) , businessIdss.get(i));
			}
		}	
	}

	@Override
	public Class<CreateSubAccountPermissionResponse> getResponseClass() {
		return CreateSubAccountPermissionResponse.class;
	}

}
