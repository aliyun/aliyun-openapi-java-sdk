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

package com.aliyuncs.elasticsearch.model.v20170613;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.elasticsearch.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListInstanceIndicesRequest extends RoaAcsRequest<ListInstanceIndicesResponse> {
	   

	private Boolean all;

	private String instanceId;

	private Boolean isManaged;

	private Integer size;

	private String name;

	private Integer page;

	private Boolean isOpenstore;
	public ListInstanceIndicesRequest() {
		super("elasticsearch", "2017-06-13", "ListInstanceIndices", "elasticsearch");
		setUriPattern("/openapi/instances/[InstanceId]/indices");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getAll() {
		return this.all;
	}

	public void setAll(Boolean all) {
		this.all = all;
		if(all != null){
			putQueryParameter("all", all.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putPathParameter("InstanceId", instanceId);
		}
	}

	public Boolean getIsManaged() {
		return this.isManaged;
	}

	public void setIsManaged(Boolean isManaged) {
		this.isManaged = isManaged;
		if(isManaged != null){
			putQueryParameter("isManaged", isManaged.toString());
		}
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
		if(size != null){
			putQueryParameter("size", size.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("name", name);
		}
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
		if(page != null){
			putQueryParameter("page", page.toString());
		}
	}

	public Boolean getIsOpenstore() {
		return this.isOpenstore;
	}

	public void setIsOpenstore(Boolean isOpenstore) {
		this.isOpenstore = isOpenstore;
		if(isOpenstore != null){
			putQueryParameter("isOpenstore", isOpenstore.toString());
		}
	}

	@Override
	public Class<ListInstanceIndicesResponse> getResponseClass() {
		return ListInstanceIndicesResponse.class;
	}

}
