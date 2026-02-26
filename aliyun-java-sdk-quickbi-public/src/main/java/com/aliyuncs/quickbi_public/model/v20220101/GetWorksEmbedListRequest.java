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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetWorksEmbedListRequest extends RpcAcsRequest<GetWorksEmbedListResponse> {
	   

	private String wsId;

	private Integer pageSize;

	private String keyword;

	private String worksType;

	private Integer pageNo;
	public GetWorksEmbedListRequest() {
		super("quickbi-public", "2022-01-01", "GetWorksEmbedList", "2.2.0");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getWsId() {
		return this.wsId;
	}

	public void setWsId(String wsId) {
		this.wsId = wsId;
		if(wsId != null){
			putQueryParameter("WsId", wsId);
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

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
		}
	}

	public String getWorksType() {
		return this.worksType;
	}

	public void setWorksType(String worksType) {
		this.worksType = worksType;
		if(worksType != null){
			putQueryParameter("WorksType", worksType);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
		}
	}

	@Override
	public Class<GetWorksEmbedListResponse> getResponseClass() {
		return GetWorksEmbedListResponse.class;
	}

}
