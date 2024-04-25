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

package com.aliyuncs.ehpcinstant.model.v20230701;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddImageRequest extends RpcAcsRequest<AddImageResponse> {
	   

	private String description;

	private String name;

	private String imageVersion;

	@SerializedName("containerImageSpec")
	private ContainerImageSpec containerImageSpec;

	@SerializedName("vMImageSpec")
	private VMImageSpec vMImageSpec;
	public AddImageRequest() {
		super("EhpcInstant", "2023-07-01", "AddImage");
		setMethod(MethodType.POST);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getImageVersion() {
		return this.imageVersion;
	}

	public void setImageVersion(String imageVersion) {
		this.imageVersion = imageVersion;
		if(imageVersion != null){
			putQueryParameter("ImageVersion", imageVersion);
		}
	}

	public ContainerImageSpec getContainerImageSpec() {
		return this.containerImageSpec;
	}

	public void setContainerImageSpec(ContainerImageSpec containerImageSpec) {
		this.containerImageSpec = containerImageSpec;	
		if (containerImageSpec != null) {
			putQueryParameter("ContainerImageSpec" , new Gson().toJson(containerImageSpec));
		}	
	}

	public VMImageSpec getVMImageSpec() {
		return this.vMImageSpec;
	}

	public void setVMImageSpec(VMImageSpec vMImageSpec) {
		this.vMImageSpec = vMImageSpec;	
		if (vMImageSpec != null) {
			putQueryParameter("VMImageSpec" , new Gson().toJson(vMImageSpec));
		}	
	}

	public static class ContainerImageSpec {

		@SerializedName("IsACREnterprise")
		private Boolean isACREnterprise;

		@SerializedName("RegistryUrl")
		private String registryUrl;

		@SerializedName("RegistryCredential")
		private RegistryCredential registryCredential;

		@SerializedName("RegistryCriId")
		private String registryCriId;

		@SerializedName("IsACRRegistry")
		private Boolean isACRRegistry;

		public Boolean getIsACREnterprise() {
			return this.isACREnterprise;
		}

		public void setIsACREnterprise(Boolean isACREnterprise) {
			this.isACREnterprise = isACREnterprise;
		}

		public String getRegistryUrl() {
			return this.registryUrl;
		}

		public void setRegistryUrl(String registryUrl) {
			this.registryUrl = registryUrl;
		}

		public RegistryCredential getRegistryCredential() {
			return this.registryCredential;
		}

		public void setRegistryCredential(RegistryCredential registryCredential) {
			this.registryCredential = registryCredential;
		}

		public String getRegistryCriId() {
			return this.registryCriId;
		}

		public void setRegistryCriId(String registryCriId) {
			this.registryCriId = registryCriId;
		}

		public Boolean getIsACRRegistry() {
			return this.isACRRegistry;
		}

		public void setIsACRRegistry(Boolean isACRRegistry) {
			this.isACRRegistry = isACRRegistry;
		}

		public static class RegistryCredential {

			@SerializedName("Server")
			private String server;

			@SerializedName("Password")
			private String password;

			@SerializedName("UserName")
			private String userName;

			public String getServer() {
				return this.server;
			}

			public void setServer(String server) {
				this.server = server;
			}

			public String getPassword() {
				return this.password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}
		}
	}

	public static class VMImageSpec {

		@SerializedName("ImageId")
		private String imageId;

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}
	}

	@Override
	public Class<AddImageResponse> getResponseClass() {
		return AddImageResponse.class;
	}

}
