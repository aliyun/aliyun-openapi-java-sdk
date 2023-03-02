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

package com.aliyuncs.lto.model.v20210707;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddDeviceGroupRequest extends RpcAcsRequest<AddDeviceGroupResponse> {
	   

	private String remark;

	private String productKey;

	private Integer authorizedCount;
	public AddDeviceGroupRequest() {
		super("lto", "2021-07-07", "AddDeviceGroup");
		setMethod(MethodType.POST);
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public Integer getAuthorizedCount() {
		return this.authorizedCount;
	}

	public void setAuthorizedCount(Integer authorizedCount) {
		this.authorizedCount = authorizedCount;
		if(authorizedCount != null){
			putQueryParameter("AuthorizedCount", authorizedCount.toString());
		}
	}

	@Override
	public Class<AddDeviceGroupResponse> getResponseClass() {
		return AddDeviceGroupResponse.class;
	}

}
