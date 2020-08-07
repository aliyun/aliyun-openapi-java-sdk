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

package com.aliyuncs.premiumpics.model.v20200505;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryBarrelImageListRequest extends RpcAcsRequest<QueryBarrelImageListResponse> {
	   

	private String barrel;

	private Long startId;

	private Integer pageSize;
	public QueryBarrelImageListRequest() {
		super("Premiumpics", "2020-05-05", "QueryBarrelImageList");
		setMethod(MethodType.POST);
	}

	public String getBarrel() {
		return this.barrel;
	}

	public void setBarrel(String barrel) {
		this.barrel = barrel;
		if(barrel != null){
			putQueryParameter("Barrel", barrel);
		}
	}

	public Long getStartId() {
		return this.startId;
	}

	public void setStartId(Long startId) {
		this.startId = startId;
		if(startId != null){
			putQueryParameter("StartId", startId.toString());
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
	public Class<QueryBarrelImageListResponse> getResponseClass() {
		return QueryBarrelImageListResponse.class;
	}

}
