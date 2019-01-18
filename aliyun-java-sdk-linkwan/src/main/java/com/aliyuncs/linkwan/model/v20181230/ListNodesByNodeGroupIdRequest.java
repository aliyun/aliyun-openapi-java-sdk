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
public class ListNodesByNodeGroupIdRequest extends RpcAcsRequest<ListNodesByNodeGroupIdResponse> {
	
	public ListNodesByNodeGroupIdRequest() {
		super("LinkWAN", "2018-12-30", "ListNodesByNodeGroupId", "linkwan");
		setProtocol(ProtocolType.HTTPS);
	}

	private Long offset;

	private String nodeGroupId;

	private String fuzzyDevEui;

	private Long limit;

	private String sortingField;

	private Boolean ascending;

	public Long getOffset() {
		return this.offset;
	}

	public void setOffset(Long offset) {
		this.offset = offset;
		if(offset != null){
			putBodyParameter("Offset", offset.toString());
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

	public String getFuzzyDevEui() {
		return this.fuzzyDevEui;
	}

	public void setFuzzyDevEui(String fuzzyDevEui) {
		this.fuzzyDevEui = fuzzyDevEui;
		if(fuzzyDevEui != null){
			putBodyParameter("FuzzyDevEui", fuzzyDevEui);
		}
	}

	public Long getLimit() {
		return this.limit;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
		if(limit != null){
			putBodyParameter("Limit", limit.toString());
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
	public Class<ListNodesByNodeGroupIdResponse> getResponseClass() {
		return ListNodesByNodeGroupIdResponse.class;
	}

}
