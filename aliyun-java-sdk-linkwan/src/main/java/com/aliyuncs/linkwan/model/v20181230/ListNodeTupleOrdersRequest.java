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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ListNodeTupleOrdersRequest extends RpcAcsRequest<ListNodeTupleOrdersResponse> {
	
	public ListNodeTupleOrdersRequest() {
		super("LinkWAN", "2018-12-30", "ListNodeTupleOrders", "linkwan");
	}

	private Boolean isKpm;

	private Long offset;

	private Long limit;

	private List<String> states;

	private String sortingField;

	private Boolean ascending;

	public Boolean getIsKpm() {
		return this.isKpm;
	}

	public void setIsKpm(Boolean isKpm) {
		this.isKpm = isKpm;
		if(isKpm != null){
			putBodyParameter("IsKpm", isKpm.toString());
		}
	}

	public Long getOffset() {
		return this.offset;
	}

	public void setOffset(Long offset) {
		this.offset = offset;
		if(offset != null){
			putBodyParameter("Offset", offset.toString());
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

	public List<String> getStates() {
		return this.states;
	}

	public void setStates(List<String> states) {
		this.states = states;	
		if (states != null) {
			for (int i = 0; i < states.size(); i++) {
				putBodyParameter("State." + (i + 1) , states.get(i));
			}
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
	public Class<ListNodeTupleOrdersResponse> getResponseClass() {
		return ListNodeTupleOrdersResponse.class;
	}

}
