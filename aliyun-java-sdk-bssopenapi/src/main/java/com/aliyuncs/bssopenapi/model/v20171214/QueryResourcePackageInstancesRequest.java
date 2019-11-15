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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryResourcePackageInstancesRequest extends RpcAcsRequest<QueryResourcePackageInstancesResponse> {
	   

	private String expiryTimeEnd;

	private String productCode;

	private Long ownerId;

	private String expiryTimeStart;

	private Integer pageNum;

	private Integer pageSize;
	public QueryResourcePackageInstancesRequest() {
		super("BssOpenApi", "2017-12-14", "QueryResourcePackageInstances");
		setMethod(MethodType.POST);
	}

	public String getExpiryTimeEnd() {
		return this.expiryTimeEnd;
	}

	public void setExpiryTimeEnd(String expiryTimeEnd) {
		this.expiryTimeEnd = expiryTimeEnd;
		if(expiryTimeEnd != null){
			putQueryParameter("ExpiryTimeEnd", expiryTimeEnd);
		}
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getExpiryTimeStart() {
		return this.expiryTimeStart;
	}

	public void setExpiryTimeStart(String expiryTimeStart) {
		this.expiryTimeStart = expiryTimeStart;
		if(expiryTimeStart != null){
			putQueryParameter("ExpiryTimeStart", expiryTimeStart);
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
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
	public Class<QueryResourcePackageInstancesResponse> getResponseClass() {
		return QueryResourcePackageInstancesResponse.class;
	}

}
