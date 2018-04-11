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
public class EditPhotosRequest extends RpcAcsRequest<EditPhotosResponse> {
	
	public EditPhotosRequest() {
		super("CloudPhoto", "2017-07-11", "EditPhotos", "cloudphoto");
		setProtocol(ProtocolType.HTTPS);
	}

	private Long takenAt;

	private String libraryId;

	private Long shareExpireTime;

	private List<Long> photoIds;

	private String storeName;

	private String remark;

	private String title;

	public Long getTakenAt() {
		return this.takenAt;
	}

	public void setTakenAt(Long takenAt) {
		this.takenAt = takenAt;
		if(takenAt != null){
			putQueryParameter("TakenAt", takenAt.toString());
		}
	}

	public String getLibraryId() {
		return this.libraryId;
	}

	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
		if(libraryId != null){
			putQueryParameter("LibraryId", libraryId);
		}
	}

	public Long getShareExpireTime() {
		return this.shareExpireTime;
	}

	public void setShareExpireTime(Long shareExpireTime) {
		this.shareExpireTime = shareExpireTime;
		if(shareExpireTime != null){
			putQueryParameter("ShareExpireTime", shareExpireTime.toString());
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putQueryParameter("Title", title);
		}
	}

	@Override
	public Class<EditPhotosResponse> getResponseClass() {
		return EditPhotosResponse.class;
	}

}
