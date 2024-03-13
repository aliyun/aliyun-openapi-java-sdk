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

package com.aliyuncs.swas_open.model.v20200601;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListCustomImagesRequest extends RpcAcsRequest<ListCustomImagesResponse> {
	   

	private String systemSnapshotId;

	private String dataSnapshotId;

	private String clientToken;

	private String imageNames;

	private Integer pageNumber;

	private String resourceGroupId;

	private Integer pageSize;

	private List<Tag> tags;

	private String imageIds;
	public ListCustomImagesRequest() {
		super("SWAS-OPEN", "2020-06-01", "ListCustomImages", "SWAS-OPEN");
		setMethod(MethodType.POST);
	}

	public String getSystemSnapshotId() {
		return this.systemSnapshotId;
	}

	public void setSystemSnapshotId(String systemSnapshotId) {
		this.systemSnapshotId = systemSnapshotId;
		if(systemSnapshotId != null){
			putQueryParameter("SystemSnapshotId", systemSnapshotId);
		}
	}

	public String getDataSnapshotId() {
		return this.dataSnapshotId;
	}

	public void setDataSnapshotId(String dataSnapshotId) {
		this.dataSnapshotId = dataSnapshotId;
		if(dataSnapshotId != null){
			putQueryParameter("DataSnapshotId", dataSnapshotId);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getImageNames() {
		return this.imageNames;
	}

	public void setImageNames(String imageNames) {
		this.imageNames = imageNames;
		if(imageNames != null){
			putQueryParameter("ImageNames", imageNames);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
			}
		}	
	}

	public String getImageIds() {
		return this.imageIds;
	}

	public void setImageIds(String imageIds) {
		this.imageIds = imageIds;
		if(imageIds != null){
			putQueryParameter("ImageIds", imageIds);
		}
	}

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<ListCustomImagesResponse> getResponseClass() {
		return ListCustomImagesResponse.class;
	}

}
