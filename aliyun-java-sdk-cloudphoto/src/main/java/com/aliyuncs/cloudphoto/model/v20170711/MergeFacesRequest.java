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
public class MergeFacesRequest extends RpcAcsRequest<MergeFacesResponse> {
	
	public MergeFacesRequest() {
		super("CloudPhoto", "2017-07-11", "MergeFaces", "cloudphoto");
		setProtocol(ProtocolType.HTTPS);
	}

	private String libraryId;

	private Long targetFaceId;

	private String storeName;

	private List<Long> faceIds;

	public String getLibraryId() {
		return this.libraryId;
	}

	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
		if(libraryId != null){
			putQueryParameter("LibraryId", libraryId);
		}
	}

	public Long getTargetFaceId() {
		return this.targetFaceId;
	}

	public void setTargetFaceId(Long targetFaceId) {
		this.targetFaceId = targetFaceId;
		if(targetFaceId != null){
			putQueryParameter("TargetFaceId", targetFaceId.toString());
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

	public List<Long> getFaceIds() {
		return this.faceIds;
	}

	public void setFaceIds(List<Long> faceIds) {
		this.faceIds = faceIds;	
		if (faceIds != null) {
			for (int i = 0; i < faceIds.size(); i++) {
				putQueryParameter("FaceId." + (i + 1) , faceIds.get(i));
			}
		}	
	}

	@Override
	public Class<MergeFacesResponse> getResponseClass() {
		return MergeFacesResponse.class;
	}

}
