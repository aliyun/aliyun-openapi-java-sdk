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
import java.util.List;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class GetDownloadUrlsRequest extends RpcAcsRequest<GetDownloadUrlsResponse> {
	
	public GetDownloadUrlsRequest() {
		super("CloudPhoto", "2017-07-11", "GetDownloadUrls", "cloudphoto");
		setProtocol(ProtocolType.HTTPS);
	}

	private String libraryId;

	private List<Long> photoIds;

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

	public List<Long> getPhotoIds() {
		return this.photoIds;
	}

	public void setPhotoIds(List<Long> photoIds) {
		this.photoIds = photoIds;	
		if (photoIds != null) {
			for (int i = 0; i < photoIds.size(); i++) {
				putQueryParameter("PhotoId." + (i + 1) , photoIds.get(i));
			}
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
	public Class<GetDownloadUrlsResponse> getResponseClass() {
		return GetDownloadUrlsResponse.class;
	}

}
