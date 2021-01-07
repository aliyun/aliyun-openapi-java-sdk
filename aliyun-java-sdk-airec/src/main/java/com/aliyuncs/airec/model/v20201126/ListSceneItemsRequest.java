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

package com.aliyuncs.airec.model.v20201126;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.airec.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListSceneItemsRequest extends RoaAcsRequest<ListSceneItemsResponse> {
	   

	private String selectionRuleId;

	private String instanceId;

	private Integer size;

	private Integer queryCount;

	private String sceneId;

	private String operationRuleId;

	private String previewType;

	private Integer page;
	public ListSceneItemsRequest() {
		super("Airec", "2020-11-26", "ListSceneItems", "airec");
		setUriPattern("/v2/openapi/instances/[instanceId]/scenes/[sceneId]/items");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSelectionRuleId() {
		return this.selectionRuleId;
	}

	public void setSelectionRuleId(String selectionRuleId) {
		this.selectionRuleId = selectionRuleId;
		if(selectionRuleId != null){
			putQueryParameter("selectionRuleId", selectionRuleId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putPathParameter("instanceId", instanceId);
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

	public Integer getQueryCount() {
		return this.queryCount;
	}

	public void setQueryCount(Integer queryCount) {
		this.queryCount = queryCount;
		if(queryCount != null){
			putQueryParameter("queryCount", queryCount.toString());
		}
	}

	public String getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
		if(sceneId != null){
			putPathParameter("sceneId", sceneId);
		}
	}

	public String getOperationRuleId() {
		return this.operationRuleId;
	}

	public void setOperationRuleId(String operationRuleId) {
		this.operationRuleId = operationRuleId;
		if(operationRuleId != null){
			putQueryParameter("operationRuleId", operationRuleId);
		}
	}

	public String getPreviewType() {
		return this.previewType;
	}

	public void setPreviewType(String previewType) {
		this.previewType = previewType;
		if(previewType != null){
			putQueryParameter("previewType", previewType);
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

	@Override
	public Class<ListSceneItemsResponse> getResponseClass() {
		return ListSceneItemsResponse.class;
	}

}
