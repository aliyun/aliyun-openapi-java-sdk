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
public class ListABMetricsRequest extends RoaAcsRequest<ListABMetricsResponse> {
	   

	private Boolean realtime;

	private String instanceId;

	private Integer pageSize;

	private String name;

	private String sceneId;

	private String type;

	private Integer pageNumber;

	private String tableMetaId;
	public ListABMetricsRequest() {
		super("PaiRecService", "2022-12-13", "ListABMetrics");
		setUriPattern("/api/v1/abmetrics");
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
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

	public String getTableMetaId() {
		return this.tableMetaId;
	}

	public void setTableMetaId(String tableMetaId) {
		this.tableMetaId = tableMetaId;
		if(tableMetaId != null){
			putQueryParameter("TableMetaId", tableMetaId);
		}
	}

	@Override
	public Class<ListABMetricsResponse> getResponseClass() {
		return ListABMetricsResponse.class;
	}

}
