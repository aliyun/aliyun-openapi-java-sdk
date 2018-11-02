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

package com.aliyuncs.lubancloud.model.v20180509;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SubmitGenerateTaskRequest extends RpcAcsRequest<SubmitGenerateTaskResponse> {
	
	public SubmitGenerateTaskRequest() {
		super("lubancloud", "2018-05-09", "SubmitGenerateTask", "luban");
		setMethod(MethodType.POST);
	}

	private Integer imageCount;

	private String actionPoint;

	private String logoImagePath;

	private Integer type;

	private List<String> majorImagePaths;

	private Integer width;

	private List<String> copyWrites;

	private List<Long> propertyIds;

	private Integer height;

	public Integer getImageCount() {
		return this.imageCount;
	}

	public void setImageCount(Integer imageCount) {
		this.imageCount = imageCount;
		if(imageCount != null){
			putQueryParameter("ImageCount", imageCount.toString());
		}
	}

	public String getActionPoint() {
		return this.actionPoint;
	}

	public void setActionPoint(String actionPoint) {
		this.actionPoint = actionPoint;
		if(actionPoint != null){
			putQueryParameter("ActionPoint", actionPoint);
		}
	}

	public String getLogoImagePath() {
		return this.logoImagePath;
	}

	public void setLogoImagePath(String logoImagePath) {
		this.logoImagePath = logoImagePath;
		if(logoImagePath != null){
			putQueryParameter("LogoImagePath", logoImagePath);
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type.toString());
		}
	}

	public List<String> getMajorImagePaths() {
		return this.majorImagePaths;
	}

	public void setMajorImagePaths(List<String> majorImagePaths) {
		this.majorImagePaths = majorImagePaths;	
		if (majorImagePaths != null) {
			for (int i = 0; i < majorImagePaths.size(); i++) {
				putQueryParameter("MajorImagePath." + (i + 1) , majorImagePaths.get(i));
			}
		}	
	}

	public Integer getWidth() {
		return this.width;
	}

	public void setWidth(Integer width) {
		this.width = width;
		if(width != null){
			putQueryParameter("Width", width.toString());
		}
	}

	public List<String> getCopyWrites() {
		return this.copyWrites;
	}

	public void setCopyWrites(List<String> copyWrites) {
		this.copyWrites = copyWrites;	
		if (copyWrites != null) {
			for (int i = 0; i < copyWrites.size(); i++) {
				putQueryParameter("CopyWrite." + (i + 1) , copyWrites.get(i));
			}
		}	
	}

	public List<Long> getPropertyIds() {
		return this.propertyIds;
	}

	public void setPropertyIds(List<Long> propertyIds) {
		this.propertyIds = propertyIds;	
		if (propertyIds != null) {
			for (int i = 0; i < propertyIds.size(); i++) {
				putQueryParameter("PropertyId." + (i + 1) , propertyIds.get(i));
			}
		}	
	}

	public Integer getHeight() {
		return this.height;
	}

	public void setHeight(Integer height) {
		this.height = height;
		if(height != null){
			putQueryParameter("Height", height.toString());
		}
	}

	@Override
	public Class<SubmitGenerateTaskResponse> getResponseClass() {
		return SubmitGenerateTaskResponse.class;
	}

}
