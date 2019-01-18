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

package com.aliyuncs.linkwan.model.v20181230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class GetNodeGroupTransferPacketsDownloadUrlRequest extends RpcAcsRequest<GetNodeGroupTransferPacketsDownloadUrlResponse> {
	
	public GetNodeGroupTransferPacketsDownloadUrlRequest() {
		super("LinkWAN", "2018-12-30", "GetNodeGroupTransferPacketsDownloadUrl", "linkwan");
		setProtocol(ProtocolType.HTTPS);
	}

	private Long endMillis;

	private String devEui;

	private String nodeGroupId;

	private String category;

	private Long beginMillis;

	private String sortingField;

	private Boolean ascending;

	public Long getEndMillis() {
		return this.endMillis;
	}

	public void setEndMillis(Long endMillis) {
		this.endMillis = endMillis;
		if(endMillis != null){
			putBodyParameter("EndMillis", endMillis.toString());
		}
	}

	public String getDevEui() {
		return this.devEui;
	}

	public void setDevEui(String devEui) {
		this.devEui = devEui;
		if(devEui != null){
			putBodyParameter("DevEui", devEui);
		}
	}

	public String getNodeGroupId() {
		return this.nodeGroupId;
	}

	public void setNodeGroupId(String nodeGroupId) {
		this.nodeGroupId = nodeGroupId;
		if(nodeGroupId != null){
			putBodyParameter("NodeGroupId", nodeGroupId);
		}
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putBodyParameter("Category", category);
		}
	}

	public Long getBeginMillis() {
		return this.beginMillis;
	}

	public void setBeginMillis(Long beginMillis) {
		this.beginMillis = beginMillis;
		if(beginMillis != null){
			putBodyParameter("BeginMillis", beginMillis.toString());
		}
	}

	public String getSortingField() {
		return this.sortingField;
	}

	public void setSortingField(String sortingField) {
		this.sortingField = sortingField;
		if(sortingField != null){
			putBodyParameter("SortingField", sortingField);
		}
	}

	public Boolean getAscending() {
		return this.ascending;
	}

	public void setAscending(Boolean ascending) {
		this.ascending = ascending;
		if(ascending != null){
			putBodyParameter("Ascending", ascending.toString());
		}
	}

	@Override
	public Class<GetNodeGroupTransferPacketsDownloadUrlResponse> getResponseClass() {
		return GetNodeGroupTransferPacketsDownloadUrlResponse.class;
	}

}
