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

package com.aliyuncs.avatar.model.v20220130;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class Update2dAvatarRequest extends RpcAcsRequest<Update2dAvatarResponse> {
	   

	private String image;

	private Integer orientation;

	private String code;

	private String description;

	private String video;

	private String portrait;

	private Boolean transparent;

	private Long tenantId;

	private String name;

	private Boolean callback;
	public Update2dAvatarRequest() {
		super("avatar", "2022-01-30", "Update2dAvatar");
		setMethod(MethodType.POST);
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
		if(image != null){
			putQueryParameter("Image", image);
		}
	}

	public Integer getOrientation() {
		return this.orientation;
	}

	public void setOrientation(Integer orientation) {
		this.orientation = orientation;
		if(orientation != null){
			putQueryParameter("Orientation", orientation.toString());
		}
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
		if(code != null){
			putQueryParameter("Code", code);
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

	public String getVideo() {
		return this.video;
	}

	public void setVideo(String video) {
		this.video = video;
		if(video != null){
			putQueryParameter("Video", video);
		}
	}

	public String getPortrait() {
		return this.portrait;
	}

	public void setPortrait(String portrait) {
		this.portrait = portrait;
		if(portrait != null){
			putQueryParameter("Portrait", portrait);
		}
	}

	public Boolean getTransparent() {
		return this.transparent;
	}

	public void setTransparent(Boolean transparent) {
		this.transparent = transparent;
		if(transparent != null){
			putQueryParameter("Transparent", transparent.toString());
		}
	}

	public Long getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Boolean getCallback() {
		return this.callback;
	}

	public void setCallback(Boolean callback) {
		this.callback = callback;
		if(callback != null){
			putQueryParameter("Callback", callback.toString());
		}
	}

	@Override
	public Class<Update2dAvatarResponse> getResponseClass() {
		return Update2dAvatarResponse.class;
	}

}
