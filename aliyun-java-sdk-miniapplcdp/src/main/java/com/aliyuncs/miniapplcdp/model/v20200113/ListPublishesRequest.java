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

package com.aliyuncs.miniapplcdp.model.v20200113;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListPublishesRequest extends RpcAcsRequest<ListPublishesResponse> {
	   

	private String publishType;

	private String envId;

	private Integer pageNumber;

	private String appId;

	private Integer pageSize;

	private String publishStatus;
	public ListPublishesRequest() {
		super("miniapplcdp", "2020-01-13", "ListPublishes");
		setMethod(MethodType.POST);
	}

	public String getPublishType() {
		return this.publishType;
	}

	public void setPublishType(String publishType) {
		this.publishType = publishType;
		if(publishType != null){
			putQueryParameter("PublishType", publishType);
		}
	}

	public String getEnvId() {
		return this.envId;
	}

	public void setEnvId(String envId) {
		this.envId = envId;
		if(envId != null){
			putQueryParameter("EnvId", envId);
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

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
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

	public String getPublishStatus() {
		return this.publishStatus;
	}

	public void setPublishStatus(String publishStatus) {
		this.publishStatus = publishStatus;
		if(publishStatus != null){
			putQueryParameter("PublishStatus", publishStatus);
		}
	}

	@Override
	public Class<ListPublishesResponse> getResponseClass() {
		return ListPublishesResponse.class;
	}

}
