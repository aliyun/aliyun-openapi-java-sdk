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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateCabServiceStatusRequest extends RpcAcsRequest<UpdateCabServiceStatusResponse> {
	
	public UpdateCabServiceStatusRequest() {
		super("CloudCallCenter", "2017-07-05", "UpdateCabServiceStatus", "CloudCallCenter", "innerAPI");
	}

	private Boolean suspend;

	private Long ownerId;

	public Boolean getSuspend() {
		return this.suspend;
	}

	public void setSuspend(Boolean suspend) {
		this.suspend = suspend;
		if(suspend != null){
			putQueryParameter("Suspend", suspend.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<UpdateCabServiceStatusResponse> getResponseClass() {
		return UpdateCabServiceStatusResponse.class;
	}

}
