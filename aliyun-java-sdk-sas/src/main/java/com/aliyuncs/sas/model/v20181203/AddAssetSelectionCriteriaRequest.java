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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddAssetSelectionCriteriaRequest extends RpcAcsRequest<AddAssetSelectionCriteriaResponse> {
	   

	private String criteriaOperation;

	private String criteria;

	private List<TargetOperationList> targetOperationLists;

	private String selectionKey;
	public AddAssetSelectionCriteriaRequest() {
		super("Sas", "2018-12-03", "AddAssetSelectionCriteria");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCriteriaOperation() {
		return this.criteriaOperation;
	}

	public void setCriteriaOperation(String criteriaOperation) {
		this.criteriaOperation = criteriaOperation;
		if(criteriaOperation != null){
			putQueryParameter("CriteriaOperation", criteriaOperation);
		}
	}

	public String getCriteria() {
		return this.criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
		if(criteria != null){
			putQueryParameter("Criteria", criteria);
		}
	}

	public List<TargetOperationList> getTargetOperationLists() {
		return this.targetOperationLists;
	}

	public void setTargetOperationLists(List<TargetOperationList> targetOperationLists) {
		this.targetOperationLists = targetOperationLists;	
		if (targetOperationLists != null) {
			for (int depth1 = 0; depth1 < targetOperationLists.size(); depth1++) {
				putQueryParameter("TargetOperationList." + (depth1 + 1) + ".Operation" , targetOperationLists.get(depth1).getOperation());
				putQueryParameter("TargetOperationList." + (depth1 + 1) + ".Target" , targetOperationLists.get(depth1).getTarget());
			}
		}	
	}

	public String getSelectionKey() {
		return this.selectionKey;
	}

	public void setSelectionKey(String selectionKey) {
		this.selectionKey = selectionKey;
		if(selectionKey != null){
			putQueryParameter("SelectionKey", selectionKey);
		}
	}

	public static class TargetOperationList {

		private String operation;

		private String target;

		public String getOperation() {
			return this.operation;
		}

		public void setOperation(String operation) {
			this.operation = operation;
		}

		public String getTarget() {
			return this.target;
		}

		public void setTarget(String target) {
			this.target = target;
		}
	}

	@Override
	public Class<AddAssetSelectionCriteriaResponse> getResponseClass() {
		return AddAssetSelectionCriteriaResponse.class;
	}

}
