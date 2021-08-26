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
public class CreateImageRequest extends RpcAcsRequest<CreateImageResponse> {
	   

	private String snapshotId;

	private List<String> snapshotIdss;

	private String description;

	private String imageName;

	private String desktopId;

	private String imageResourceType;
	public CreateImageRequest() {
		super("ecd", "2020-09-30", "CreateImage");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
		if(snapshotId != null){
			putQueryParameter("SnapshotId", snapshotId);
		}
	}

	public List<String> getSnapshotIdss() {
		return this.snapshotIdss;
	}

	public void setSnapshotIdss(List<String> snapshotIdss) {
		this.snapshotIdss = snapshotIdss;	
		if (snapshotIdss != null) {
			for (int i = 0; i < snapshotIdss.size(); i++) {
				putQueryParameter("SnapshotIds." + (i + 1) , snapshotIdss.get(i));
			}
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

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
		if(imageName != null){
			putQueryParameter("ImageName", imageName);
		}
	}

	public String getDesktopId() {
		return this.desktopId;
	}

	public void setDesktopId(String desktopId) {
		this.desktopId = desktopId;
		if(desktopId != null){
			putQueryParameter("DesktopId", desktopId);
		}
	}

	public String getImageResourceType() {
		return this.imageResourceType;
	}

	public void setImageResourceType(String imageResourceType) {
		this.imageResourceType = imageResourceType;
		if(imageResourceType != null){
			putQueryParameter("ImageResourceType", imageResourceType);
		}
	}

	@Override
	public Class<CreateImageResponse> getResponseClass() {
		return CreateImageResponse.class;
	}

}
