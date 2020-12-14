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

package com.aliyuncs.cdrs.model.v20201101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListCityMapCameraResultsRequest extends RpcAcsRequest<ListCityMapCameraResultsResponse> {
	   

	private Long pageNum;

	private List<Object> dataSourceIdList;

	private Long pageSize;
	public ListCityMapCameraResultsRequest() {
		super("CDRS", "2020-11-01", "ListCityMapCameraResults");
		setMethod(MethodType.POST);
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

	public List<Object> getDataSourceIdList() {
		return this.dataSourceIdList;
	}

	public void setDataSourceIdList(List<Object> dataSourceIdList) {
		this.dataSourceIdList = dataSourceIdList;
		if(dataSourceIdList != null){
			putBodyParameter("DataSourceIdList", new Gson().toJson(dataSourceIdList));
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
	public Class<ListCityMapCameraResultsResponse> getResponseClass() {
		return ListCityMapCameraResultsResponse.class;
	}

}
