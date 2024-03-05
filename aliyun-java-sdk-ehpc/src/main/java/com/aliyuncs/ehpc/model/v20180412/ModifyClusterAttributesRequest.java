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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ehpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyClusterAttributesRequest extends RpcAcsRequest<ModifyClusterAttributesResponse> {
	   

	private String imageId;

	private String description;

	private String ramRoleName;

	private String clusterId;

	private String imageOwnerAlias;

	private List<String> ramNodeTypess;

	private WinAdPar winAdPar;

	private String name;
	public ModifyClusterAttributesRequest() {
		super("EHPC", "2018-04-12", "ModifyClusterAttributes", "ehs");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
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

	public String getRamRoleName() {
		return this.ramRoleName;
	}

	public void setRamRoleName(String ramRoleName) {
		this.ramRoleName = ramRoleName;
		if(ramRoleName != null){
			putQueryParameter("RamRoleName", ramRoleName);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getImageOwnerAlias() {
		return this.imageOwnerAlias;
	}

	public void setImageOwnerAlias(String imageOwnerAlias) {
		this.imageOwnerAlias = imageOwnerAlias;
		if(imageOwnerAlias != null){
			putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
		}
	}

	public List<String> getRamNodeTypess() {
		return this.ramNodeTypess;
	}

	public void setRamNodeTypess(List<String> ramNodeTypess) {
		this.ramNodeTypess = ramNodeTypess;	
		if (ramNodeTypess != null) {
			for (int i = 0; i < ramNodeTypess.size(); i++) {
				putQueryParameter("RamNodeTypes." + (i + 1) , ramNodeTypess.get(i));
			}
		}	
	}

	public WinAdPar getWinAdPar() {
		return this.winAdPar;
	}

	public void setWinAdPar(WinAdPar winAdPar) {
		this.winAdPar = winAdPar;	
		if (winAdPar != null) {
			
				putQueryParameter("WinAdPar.AdUser" , winAdPar.getAdUser());
				putQueryParameter("WinAdPar.AdUserPasswd" , winAdPar.getAdUserPasswd());
				putQueryParameter("WinAdPar.AdIp" , winAdPar.getAdIp());
				putQueryParameter("WinAdPar.FallbackHomeDir" , winAdPar.getFallbackHomeDir());
				putQueryParameter("WinAdPar.AdDc" , winAdPar.getAdDc());
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

	public static class WinAdPar {

		private String adUser;

		private String adUserPasswd;

		private String adIp;

		private String fallbackHomeDir;

		private String adDc;

		public String getAdUser() {
			return this.adUser;
		}

		public void setAdUser(String adUser) {
			this.adUser = adUser;
		}

		public String getAdUserPasswd() {
			return this.adUserPasswd;
		}

		public void setAdUserPasswd(String adUserPasswd) {
			this.adUserPasswd = adUserPasswd;
		}

		public String getAdIp() {
			return this.adIp;
		}

		public void setAdIp(String adIp) {
			this.adIp = adIp;
		}

		public String getFallbackHomeDir() {
			return this.fallbackHomeDir;
		}

		public void setFallbackHomeDir(String fallbackHomeDir) {
			this.fallbackHomeDir = fallbackHomeDir;
		}

		public String getAdDc() {
			return this.adDc;
		}

		public void setAdDc(String adDc) {
			this.adDc = adDc;
		}
	}

	@Override
	public Class<ModifyClusterAttributesResponse> getResponseClass() {
		return ModifyClusterAttributesResponse.class;
	}

}
