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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateBundleRequest extends RpcAcsRequest<CreateBundleResponse> {
	   

	private String imageId;

	private String description;

	private String bundleName;

	private List<Integer> userDiskSizeGibs;

	private String desktopType;

	private Integer rootDiskSizeGib;
	public CreateBundleRequest() {
		super("ecd", "2020-09-30", "CreateBundle", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getBundleName() {
		return this.bundleName;
	}

	public void setBundleName(String bundleName) {
		this.bundleName = bundleName;
		if(bundleName != null){
			putQueryParameter("BundleName", bundleName);
		}
	}

	public List<Integer> getUserDiskSizeGibs() {
		return this.userDiskSizeGibs;
	}

	public void setUserDiskSizeGibs(List<Integer> userDiskSizeGibs) {
		this.userDiskSizeGibs = userDiskSizeGibs;	
		if (userDiskSizeGibs != null) {
			for (int i = 0; i < userDiskSizeGibs.size(); i++) {
				putQueryParameter("UserDiskSizeGib." + (i + 1) , userDiskSizeGibs.get(i));
			}
		}	
	}

	public String getDesktopType() {
		return this.desktopType;
	}

	public void setDesktopType(String desktopType) {
		this.desktopType = desktopType;
		if(desktopType != null){
			putQueryParameter("DesktopType", desktopType);
		}
	}

	public Integer getRootDiskSizeGib() {
		return this.rootDiskSizeGib;
	}

	public void setRootDiskSizeGib(Integer rootDiskSizeGib) {
		this.rootDiskSizeGib = rootDiskSizeGib;
		if(rootDiskSizeGib != null){
			putQueryParameter("RootDiskSizeGib", rootDiskSizeGib.toString());
		}
	}

	@Override
	public Class<CreateBundleResponse> getResponseClass() {
		return CreateBundleResponse.class;
	}

}
