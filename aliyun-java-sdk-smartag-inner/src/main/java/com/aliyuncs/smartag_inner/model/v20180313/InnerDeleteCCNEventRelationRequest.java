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

package com.aliyuncs.smartag_inner.model.v20180313;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class InnerDeleteCCNEventRelationRequest extends RpcAcsRequest<InnerDeleteCCNEventRelationResponse> {
	
	public InnerDeleteCCNEventRelationRequest() {
		super("Smartag-inner", "2018-03-13", "InnerDeleteCCNEventRelation", "smartag", "innerAPI");
	}

	private String access_key_id;

	private String childEventInstanceId;

	private String childEventNamespace;

	private String parentEventRegionNo;

	private String parentEventNamespace;

	private String parentEventInstanceId;

	private String childEventRegionNo;

	private String regionNo;

	public String getAccess_key_id() {
		return this.access_key_id;
	}

	public void setAccess_key_id(String access_key_id) {
		this.access_key_id = access_key_id;
		if(access_key_id != null){
			putQueryParameter("access_key_id", access_key_id);
		}
	}

	public String getChildEventInstanceId() {
		return this.childEventInstanceId;
	}

	public void setChildEventInstanceId(String childEventInstanceId) {
		this.childEventInstanceId = childEventInstanceId;
		if(childEventInstanceId != null){
			putQueryParameter("ChildEventInstanceId", childEventInstanceId);
		}
	}

	public String getChildEventNamespace() {
		return this.childEventNamespace;
	}

	public void setChildEventNamespace(String childEventNamespace) {
		this.childEventNamespace = childEventNamespace;
		if(childEventNamespace != null){
			putQueryParameter("ChildEventNamespace", childEventNamespace);
		}
	}

	public String getParentEventRegionNo() {
		return this.parentEventRegionNo;
	}

	public void setParentEventRegionNo(String parentEventRegionNo) {
		this.parentEventRegionNo = parentEventRegionNo;
		if(parentEventRegionNo != null){
			putQueryParameter("ParentEventRegionNo", parentEventRegionNo);
		}
	}

	public String getParentEventNamespace() {
		return this.parentEventNamespace;
	}

	public void setParentEventNamespace(String parentEventNamespace) {
		this.parentEventNamespace = parentEventNamespace;
		if(parentEventNamespace != null){
			putQueryParameter("ParentEventNamespace", parentEventNamespace);
		}
	}

	public String getParentEventInstanceId() {
		return this.parentEventInstanceId;
	}

	public void setParentEventInstanceId(String parentEventInstanceId) {
		this.parentEventInstanceId = parentEventInstanceId;
		if(parentEventInstanceId != null){
			putQueryParameter("ParentEventInstanceId", parentEventInstanceId);
		}
	}

	public String getChildEventRegionNo() {
		return this.childEventRegionNo;
	}

	public void setChildEventRegionNo(String childEventRegionNo) {
		this.childEventRegionNo = childEventRegionNo;
		if(childEventRegionNo != null){
			putQueryParameter("ChildEventRegionNo", childEventRegionNo);
		}
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	@Override
	public Class<InnerDeleteCCNEventRelationResponse> getResponseClass() {
		return InnerDeleteCCNEventRelationResponse.class;
	}

}
