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

package com.aliyuncs.ehpcinstant.model.v20230701;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListImagesRequest extends RpcAcsRequest<ListImagesResponse> {
	   

	@SerializedName("imageNames")
	private List<String> imageNames;

	private Long pageNumber;

	private Long pageSize;

	@SerializedName("imageIds")
	private List<String> imageIds;
	public ListImagesRequest() {
		super("EhpcInstant", "2023-07-01", "ListImages");
		setMethod(MethodType.POST);
	}

	public List<String> getImageNames() {
		return this.imageNames;
	}

	public void setImageNames(List<String> imageNames) {
		this.imageNames = imageNames;	
		if (imageNames != null) {
			putQueryParameter("ImageNames" , new Gson().toJson(imageNames));
		}	
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public List<String> getImageIds() {
		return this.imageIds;
	}

	public void setImageIds(List<String> imageIds) {
		this.imageIds = imageIds;	
		if (imageIds != null) {
			putQueryParameter("ImageIds" , new Gson().toJson(imageIds));
		}	
	}

	@Override
	public Class<ListImagesResponse> getResponseClass() {
		return ListImagesResponse.class;
	}

}
