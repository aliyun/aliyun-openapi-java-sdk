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

package com.aliyuncs.xrengine.model.v20221111;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.xrengine.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateProjectRequest extends RpcAcsRequest<CreateProjectResponse> {
	   

	private String gender;

	@SerializedName("tryOnParams")
	private TryOnParams tryOnParams;

	private String title;

	private String type;

	private String mode;

	private String intro;

	private String jwtToken;

	private Double height;

	private String extInfo;

	private String method;

	private Double weight;

	private String dependencies;

	private Boolean autoBuild;

	private String mapUuid;
	public CreateProjectRequest() {
		super("xrEngine", "2022-11-11", "CreateProject");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
		if(gender != null){
			putBodyParameter("Gender", gender);
		}
	}

	public TryOnParams getTryOnParams() {
		return this.tryOnParams;
	}

	public void setTryOnParams(TryOnParams tryOnParams) {
		this.tryOnParams = tryOnParams;	
		if (tryOnParams != null) {
			putBodyParameter("TryOnParams" , new Gson().toJson(tryOnParams));
		}	
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putBodyParameter("Title", title);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putBodyParameter("Mode", mode);
		}
	}

	public String getIntro() {
		return this.intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
		if(intro != null){
			putBodyParameter("Intro", intro);
		}
	}

	public String getJwtToken() {
		return this.jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
		if(jwtToken != null){
			putBodyParameter("JwtToken", jwtToken);
		}
	}

	public Double getHeight() {
		return this.height;
	}

	public void setHeight(Double height) {
		this.height = height;
		if(height != null){
			putBodyParameter("Height", height.toString());
		}
	}

	public String getExtInfo() {
		return this.extInfo;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
		if(extInfo != null){
			putBodyParameter("ExtInfo", extInfo);
		}
	}

	public String getBizMethod() {
		return this.method;
	}

	public void setBizMethod(String method) {
		this.method = method;
		if(method != null){
			putBodyParameter("Method", method);
		}
	}

	public Double getWeight() {
		return this.weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
		if(weight != null){
			putBodyParameter("Weight", weight.toString());
		}
	}

	public String getDependencies() {
		return this.dependencies;
	}

	public void setDependencies(String dependencies) {
		this.dependencies = dependencies;
		if(dependencies != null){
			putBodyParameter("Dependencies", dependencies);
		}
	}

	public Boolean getAutoBuild() {
		return this.autoBuild;
	}

	public void setAutoBuild(Boolean autoBuild) {
		this.autoBuild = autoBuild;
		if(autoBuild != null){
			putBodyParameter("AutoBuild", autoBuild.toString());
		}
	}

	public String getMapUuid() {
		return this.mapUuid;
	}

	public void setMapUuid(String mapUuid) {
		this.mapUuid = mapUuid;
		if(mapUuid != null){
			putBodyParameter("MapUuid", mapUuid);
		}
	}

	public static class TryOnParams {

		@SerializedName("ClothInfos")
		private List<ClothInfosItem> clothInfos;

		@SerializedName("ClothIds")
		private List<Long> clothIds;

		public List<ClothInfosItem> getClothInfos() {
			return this.clothInfos;
		}

		public void setClothInfos(List<ClothInfosItem> clothInfos) {
			this.clothInfos = clothInfos;
		}

		public List<Long> getClothIds() {
			return this.clothIds;
		}

		public void setClothIds(List<Long> clothIds) {
			this.clothIds = clothIds;
		}

		public static class ClothInfosItem {

			@SerializedName("Size")
			private String size;

			@SerializedName("Id")
			private Long id;

			@SerializedName("Status")
			private String status;

			public String getSize() {
				return this.size;
			}

			public void setSize(String size) {
				this.size = size;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public Class<CreateProjectResponse> getResponseClass() {
		return CreateProjectResponse.class;
	}

}
