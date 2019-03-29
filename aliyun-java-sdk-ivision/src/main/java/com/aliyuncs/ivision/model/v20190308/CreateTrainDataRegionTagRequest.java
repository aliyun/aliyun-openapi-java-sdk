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

package com.aliyuncs.ivision.model.v20190308;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateTrainDataRegionTagRequest extends RpcAcsRequest<CreateTrainDataRegionTagResponse> {
	
	public CreateTrainDataRegionTagRequest() {
		super("ivision", "2019-03-08", "CreateTrainDataRegionTag", "ivision");
	}

	private String projectId;

	private String tagItems;

	private Long ownerId;

	private String dataId;

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	public String getTagItems() {
		return this.tagItems;
	}

	public void setTagItems(String tagItems) {
		this.tagItems = tagItems;
		if(tagItems != null){
			putQueryParameter("TagItems", tagItems);
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

	public String getDataId() {
		return this.dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
		if(dataId != null){
			putQueryParameter("DataId", dataId);
		}
	}

	@Override
	public Class<CreateTrainDataRegionTagResponse> getResponseClass() {
		return CreateTrainDataRegionTagResponse.class;
	}

}
