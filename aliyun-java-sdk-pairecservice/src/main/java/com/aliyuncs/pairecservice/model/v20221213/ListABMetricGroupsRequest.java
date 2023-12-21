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

package com.aliyuncs.pairecservice.model.v20221213;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListABMetricGroupsRequest extends RoaAcsRequest<ListABMetricGroupsResponse> {
	   

	private Boolean realtime;

	private String instanceId;

	private String sceneId;

	private Integer pageSize;

	private Integer pageNumber;
	public ListABMetricGroupsRequest() {
		super("PaiRecService", "2022-12-13", "ListABMetricGroups");
		setUriPattern("/api/v1/abmetricgroups");
		setMethod(MethodType.GET);
	}

	public Boolean getRealtime() {
		return this.realtime;
	}

	public void setRealtime(Boolean realtime) {
		this.realtime = realtime;
		if(realtime != null){
			putQueryParameter("Realtime", realtime.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
		if(sceneId != null){
			putQueryParameter("SceneId", sceneId);
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	@Override
	public Class<ListABMetricGroupsResponse> getResponseClass() {
		return ListABMetricGroupsResponse.class;
	}

}
