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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateInstanceGroupImageRequest extends RpcAcsRequest<UpdateInstanceGroupImageResponse> {
	   

	private String imageId;

	private List<String> instanceGroupIdss;
	public UpdateInstanceGroupImageRequest() {
		super("eds-aic", "2023-09-30", "UpdateInstanceGroupImage");
		setMethod(MethodType.POST);
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putBodyParameter("ImageId", imageId);
		}
	}

	public List<String> getInstanceGroupIdss() {
		return this.instanceGroupIdss;
	}

	public void setInstanceGroupIdss(List<String> instanceGroupIdss) {
		this.instanceGroupIdss = instanceGroupIdss;	
		if (instanceGroupIdss != null) {
			for (int i = 0; i < instanceGroupIdss.size(); i++) {
				putBodyParameter("InstanceGroupIds." + (i + 1) , instanceGroupIdss.get(i));
			}
		}	
	}

	@Override
	public Class<UpdateInstanceGroupImageResponse> getResponseClass() {
		return UpdateInstanceGroupImageResponse.class;
	}

}
