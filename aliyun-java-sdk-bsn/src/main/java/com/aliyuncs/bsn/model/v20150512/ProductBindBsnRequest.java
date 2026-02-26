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

package com.aliyuncs.bsn.model.v20150512;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ProductBindBsnRequest extends RpcAcsRequest<ProductBindBsnResponse> {
	   

	private String resourceId;

	private Integer num;

	private Integer resourceType;

	private Long aliuid;
	public ProductBindBsnRequest() {
		super("Bsn", "2015-05-12", "ProductBindBsn");
		setMethod(MethodType.POST);
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("resourceId", resourceId);
		}
	}

	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
		if(num != null){
			putQueryParameter("num", num.toString());
		}
	}

	public Integer getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(Integer resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("resourceType", resourceType.toString());
		}
	}

	public Long getAliuid() {
		return this.aliuid;
	}

	public void setAliuid(Long aliuid) {
		this.aliuid = aliuid;
		if(aliuid != null){
			putQueryParameter("aliuid", aliuid.toString());
		}
	}

	@Override
	public Class<ProductBindBsnResponse> getResponseClass() {
		return ProductBindBsnResponse.class;
	}

}
