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
public class GetPhotosByMd5sRequest extends RpcAcsRequest<GetPhotosByMd5sResponse> {
	
	public GetPhotosByMd5sRequest() {
		super("CloudPhoto", "2017-07-11", "GetPhotosByMd5s", "cloudphoto");
		setProtocol(ProtocolType.HTTPS);
	}

	private String libraryId;

	private String storeName;

	private String state;

	private List<String> md5s;

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

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putQueryParameter("State", state);
		}
	}

	public List<String> getMd5s() {
		return this.md5s;
	}

	public void setMd5s(List<String> md5s) {
		this.md5s = md5s;	
		if (md5s != null) {
			for (int i = 0; i < md5s.size(); i++) {
				putQueryParameter("Md5." + (i + 1) , md5s.get(i));
			}
		}	
	}

	@Override
	public Class<GetPhotosByMd5sResponse> getResponseClass() {
		return GetPhotosByMd5sResponse.class;
	}

}
