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
package com.aliyuncs.cloudphoto.model.v20170711;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class ListPhotoFacesRequest extends RpcAcsRequest<ListPhotoFacesResponse> {
	
	public ListPhotoFacesRequest() {
		super("CloudPhoto", "2017-07-11", "ListPhotoFaces", "cloudphoto");
		setProtocol(ProtocolType.HTTPS);
	}

	private String libraryId;

	private Long photoId;

	private String storeName;

	public String getLibraryId() {
		return this.libraryId;
	}

	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
		if(libraryId != null){
			putQueryParameter("LibraryId", libraryId);
		}
	}

	public Long getPhotoId() {
		return this.photoId;
	}

	public void setPhotoId(Long photoId) {
		this.photoId = photoId;
		if(photoId != null){
			putQueryParameter("PhotoId", photoId.toString());
		}
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
		if(storeName != null){
			putQueryParameter("StoreName", storeName);
		}
	}

	@Override
	public Class<ListPhotoFacesResponse> getResponseClass() {
		return ListPhotoFacesResponse.class;
	}

}
