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
public class ListNodesRequest extends RoaAcsRequest<ListNodesResponse> {
	   

	private String ecsInstanceName;

	private String ecsInstanceIds;

	private Integer size;

	private Integer page;

	private String resId;

	private String tags;
	public ListNodesRequest() {
		super("elasticsearch", "2017-06-13", "ListNodes", "elasticsearch");
		setUriPattern("/openapi/collectors/[ResId]/nodes");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEcsInstanceName() {
		return this.ecsInstanceName;
	}

	public void setEcsInstanceName(String ecsInstanceName) {
		this.ecsInstanceName = ecsInstanceName;
		if(ecsInstanceName != null){
			putQueryParameter("ecsInstanceName", ecsInstanceName);
		}
	}

	public String getEcsInstanceIds() {
		return this.ecsInstanceIds;
	}

	public void setEcsInstanceIds(String ecsInstanceIds) {
		this.ecsInstanceIds = ecsInstanceIds;
		if(ecsInstanceIds != null){
			putQueryParameter("ecsInstanceIds", ecsInstanceIds);
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

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
		if(page != null){
			putQueryParameter("page", page.toString());
		}
	}

	public String getResId() {
		return this.resId;
	}

	public void setResId(String resId) {
		this.resId = resId;
		if(resId != null){
			putPathParameter("ResId", resId);
		}
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("tags", tags);
		}
	}

	@Override
	public Class<ListNodesResponse> getResponseClass() {
		return ListNodesResponse.class;
	}

}
