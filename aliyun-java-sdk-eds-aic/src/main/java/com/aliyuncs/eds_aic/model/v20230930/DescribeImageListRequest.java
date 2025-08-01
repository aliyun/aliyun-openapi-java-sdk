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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageListRequest extends RpcAcsRequest<DescribeImageListResponse> {
	   

	private String imageId;

	private String imageName;

	private String nextToken;

	private String imagePackageType;

	private String instanceType;

	private List<ImageBizTags> imageBizTagss;

	private String imageType;

	private Integer maxResults;

	private String status;
	public DescribeImageListRequest() {
		super("eds-aic", "2023-09-30", "DescribeImageList");
		setProtocol(ProtocolType.HTTPS);
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

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
		if(imageName != null){
			putBodyParameter("ImageName", imageName);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putBodyParameter("NextToken", nextToken);
		}
	}

	public String getImagePackageType() {
		return this.imagePackageType;
	}

	public void setImagePackageType(String imagePackageType) {
		this.imagePackageType = imagePackageType;
		if(imagePackageType != null){
			putQueryParameter("ImagePackageType", imagePackageType);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public List<ImageBizTags> getImageBizTagss() {
		return this.imageBizTagss;
	}

	public void setImageBizTagss(List<ImageBizTags> imageBizTagss) {
		this.imageBizTagss = imageBizTagss;	
		if (imageBizTagss != null) {
			for (int depth1 = 0; depth1 < imageBizTagss.size(); depth1++) {
				putQueryParameter("ImageBizTags." + (depth1 + 1) + ".Value" , imageBizTagss.get(depth1).getValue());
				putQueryParameter("ImageBizTags." + (depth1 + 1) + ".Key" , imageBizTagss.get(depth1).getKey());
			}
		}	
	}

	public String getImageType() {
		return this.imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
		if(imageType != null){
			putBodyParameter("ImageType", imageType);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putBodyParameter("MaxResults", maxResults.toString());
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	public static class ImageBizTags {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<DescribeImageListResponse> getResponseClass() {
		return DescribeImageListResponse.class;
	}

}
