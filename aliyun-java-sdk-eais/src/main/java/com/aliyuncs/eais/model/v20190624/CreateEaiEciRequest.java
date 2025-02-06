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

package com.aliyuncs.eais.model.v20190624;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eais.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateEaiEciRequest extends RpcAcsRequest<CreateEaiEciResponse> {
	   

	private String clientToken;

	private String securityGroupId;

	@SerializedName("eci")
	private Eci eci;

	private String eaisType;

	private String resourceGroupId;

	private String eaisName;

	private List<Tag> tags;

	private String vSwitchId;
	public CreateEaiEciRequest() {
		super("eais", "2019-06-24", "CreateEaiEci", "eais");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
		}
	}

	public Eci getEci() {
		return this.eci;
	}

	public void setEci(Eci eci) {
		this.eci = eci;	
		if (eci != null) {
			putQueryParameter("Eci" , new Gson().toJson(eci));
		}	
	}

	public String getEaisType() {
		return this.eaisType;
	}

	public void setEaisType(String eaisType) {
		this.eaisType = eaisType;
		if(eaisType != null){
			putQueryParameter("EaisType", eaisType);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getEaisName() {
		return this.eaisName;
	}

	public void setEaisName(String eaisName) {
		this.eaisName = eaisName;
		if(eaisName != null){
			putQueryParameter("EaisName", eaisName);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public static class Eci {

		@SerializedName("Container")
		private Container container;

		@SerializedName("Volume")
		private String volume;

		@SerializedName("EipId")
		private String eipId;

		@SerializedName("Name")
		private String name;

		@SerializedName("Type")
		private String type;

		public Container getContainer() {
			return this.container;
		}

		public void setContainer(Container container) {
			this.container = container;
		}

		public String getVolume() {
			return this.volume;
		}

		public void setVolume(String volume) {
			this.volume = volume;
		}

		public String getEipId() {
			return this.eipId;
		}

		public void setEipId(String eipId) {
			this.eipId = eipId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public static class Container {

			@SerializedName("Image")
			private String image;

			@SerializedName("Arg")
			private String arg;

			@SerializedName("Name")
			private String name;

			@SerializedName("Volumes")
			private String volumes;

			@SerializedName("Command")
			private String command;

			public String getImage() {
				return this.image;
			}

			public void setImage(String image) {
				this.image = image;
			}

			public String getArg() {
				return this.arg;
			}

			public void setArg(String arg) {
				this.arg = arg;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getVolumes() {
				return this.volumes;
			}

			public void setVolumes(String volumes) {
				this.volumes = volumes;
			}

			public String getCommand() {
				return this.command;
			}

			public void setCommand(String command) {
				this.command = command;
			}
		}
	}

	public static class Tag {

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
	public Class<CreateEaiEciResponse> getResponseClass() {
		return CreateEaiEciResponse.class;
	}

}
