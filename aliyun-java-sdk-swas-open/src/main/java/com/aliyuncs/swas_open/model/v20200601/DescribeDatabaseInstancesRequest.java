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

package com.aliyuncs.swas_open.model.v20200601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeDatabaseInstancesRequest extends RpcAcsRequest<DescribeDatabaseInstancesResponse> {
	   

	private String databaseInstanceIds;

	private Integer pageNumber;

	private Integer pageSize;
	public DescribeDatabaseInstancesRequest() {
		super("SWAS-OPEN", "2020-06-01", "DescribeDatabaseInstances", "SWAS-OPEN");
		setMethod(MethodType.POST);
	}

	public String getDatabaseInstanceIds() {
		return this.databaseInstanceIds;
	}

	public void setDatabaseInstanceIds(String databaseInstanceIds) {
		this.databaseInstanceIds = databaseInstanceIds;
		if(databaseInstanceIds != null){
			putQueryParameter("DatabaseInstanceIds", databaseInstanceIds);
		}
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
	public Class<DescribeDatabaseInstancesResponse> getResponseClass() {
		return DescribeDatabaseInstancesResponse.class;
	}

}
