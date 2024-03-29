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

package com.aliyuncs.facebody.model.v20191230;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.facebody.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DetectLivingFaceRequest extends RpcAcsRequest<DetectLivingFaceResponse> {
	   

	private List<Tasks> taskss;
	public DetectLivingFaceRequest() {
		super("facebody", "2019-12-30", "DetectLivingFace", "facebody");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Tasks> getTaskss() {
		return this.taskss;
	}

	public void setTaskss(List<Tasks> taskss) {
		this.taskss = taskss;	
		if (taskss != null) {
			for (int depth1 = 0; depth1 < taskss.size(); depth1++) {
				putBodyParameter("Tasks." + (depth1 + 1) + ".ImageURL" , taskss.get(depth1).getImageURL());
				putBodyParameter("Tasks." + (depth1 + 1) + ".ImageData" , taskss.get(depth1).getImageData());
			}
		}	
	}

	public static class Tasks {

		private String imageURL;

		private String imageData;

		public String getImageURL() {
			return this.imageURL;
		}

		public void setImageURL(String imageURL) {
			this.imageURL = imageURL;
		}

		public String getImageData() {
			return this.imageData;
		}

		public void setImageData(String imageData) {
			this.imageData = imageData;
		}
	}

	@Override
	public Class<DetectLivingFaceResponse> getResponseClass() {
		return DetectLivingFaceResponse.class;
	}

}
