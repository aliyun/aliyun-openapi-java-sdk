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

package com.aliyuncs.ots.model.v20160620;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListClusterTypeRequest extends RpcAcsRequest<ListClusterTypeResponse> {
	
	public ListClusterTypeRequest() {
		super("Ots", "2016-06-20", "ListClusterType", "ots");
	}

	private String access_key_id;

	private Long resourceOwnerId;

	public String getAccess_key_id() {
		return this.access_key_id;
	}

	public void setAccess_key_id(String access_key_id) {
		this.access_key_id = access_key_id;
		if(access_key_id != null){
			putQueryParameter("access_key_id", access_key_id);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	@Override
	public Class<ListClusterTypeResponse> getResponseClass() {
		return ListClusterTypeResponse.class;
	}

}
