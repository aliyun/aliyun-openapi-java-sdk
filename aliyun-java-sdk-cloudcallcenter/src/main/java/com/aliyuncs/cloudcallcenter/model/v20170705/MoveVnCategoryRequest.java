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
public class MoveVnCategoryRequest extends RpcAcsRequest<MoveVnCategoryResponse> {
	
	public MoveVnCategoryRequest() {
		super("CloudCallCenter", "2017-07-05", "MoveVnCategory", "CloudCallCenter", "innerAPI");
	}

	private String instanceId;

	private String targetPreviousSiblingId;

	private String targetParentId;

	private String categoryId;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getTargetPreviousSiblingId() {
		return this.targetPreviousSiblingId;
	}

	public void setTargetPreviousSiblingId(String targetPreviousSiblingId) {
		this.targetPreviousSiblingId = targetPreviousSiblingId;
		if(targetPreviousSiblingId != null){
			putQueryParameter("TargetPreviousSiblingId", targetPreviousSiblingId);
		}
	}

	public String getTargetParentId() {
		return this.targetParentId;
	}

	public void setTargetParentId(String targetParentId) {
		this.targetParentId = targetParentId;
		if(targetParentId != null){
			putQueryParameter("TargetParentId", targetParentId);
		}
	}

	public String getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
		if(categoryId != null){
			putQueryParameter("CategoryId", categoryId);
		}
	}

	@Override
	public Class<MoveVnCategoryResponse> getResponseClass() {
		return MoveVnCategoryResponse.class;
	}

}
