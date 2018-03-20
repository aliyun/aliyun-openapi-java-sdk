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
public class ListFacePhotosRequest extends RpcAcsRequest<ListFacePhotosResponse> {
	
	public ListFacePhotosRequest() {
		super("CloudPhoto", "2017-07-11", "ListFacePhotos", "cloudphoto");
		setProtocol(ProtocolType.HTTPS);
	}

	private String cursor;

	private Integer size;

	private String libraryId;

	private String storeName;

	private Long faceId;

	private String state;

	private String direction;

	public String getCursor() {
		return this.cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
		if(cursor != null){
			putQueryParameter("Cursor", cursor);
		}
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
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

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
		if(storeName != null){
			putQueryParameter("StoreName", storeName);
		}
	}

	public Long getFaceId() {
		return this.faceId;
	}

	public void setFaceId(Long faceId) {
		this.faceId = faceId;
		if(faceId != null){
			putQueryParameter("FaceId", faceId.toString());
		}
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putQueryParameter("State", state);
		}
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
		if(direction != null){
			putQueryParameter("Direction", direction);
		}
	}

	@Override
	public Class<ListFacePhotosResponse> getResponseClass() {
		return ListFacePhotosResponse.class;
	}

}
