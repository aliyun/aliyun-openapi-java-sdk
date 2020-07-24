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

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CompareImageFacesRequest extends RpcAcsRequest<CompareImageFacesResponse> {
	   

	private String project;

	private String faceIdA;

	private String faceIdB;

	private String imageUriB;

	private String imageUriA;

	private String setId;
	public CompareImageFacesRequest() {
		super("imm", "2017-09-06", "CompareImageFaces");
		setMethod(MethodType.POST);
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public String getFaceIdA() {
		return this.faceIdA;
	}

	public void setFaceIdA(String faceIdA) {
		this.faceIdA = faceIdA;
		if(faceIdA != null){
			putQueryParameter("FaceIdA", faceIdA);
		}
	}

	public String getFaceIdB() {
		return this.faceIdB;
	}

	public void setFaceIdB(String faceIdB) {
		this.faceIdB = faceIdB;
		if(faceIdB != null){
			putQueryParameter("FaceIdB", faceIdB);
		}
	}

	public String getImageUriB() {
		return this.imageUriB;
	}

	public void setImageUriB(String imageUriB) {
		this.imageUriB = imageUriB;
		if(imageUriB != null){
			putQueryParameter("ImageUriB", imageUriB);
		}
	}

	public String getImageUriA() {
		return this.imageUriA;
	}

	public void setImageUriA(String imageUriA) {
		this.imageUriA = imageUriA;
		if(imageUriA != null){
			putQueryParameter("ImageUriA", imageUriA);
		}
	}

	public String getSetId() {
		return this.setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
		if(setId != null){
			putQueryParameter("SetId", setId);
		}
	}

	@Override
	public Class<CompareImageFacesResponse> getResponseClass() {
		return CompareImageFacesResponse.class;
	}

}
