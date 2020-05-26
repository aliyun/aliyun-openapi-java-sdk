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

package com.aliyuncs.datav_outer.model.v20190402;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateWorkspaceRequest extends RpcAcsRequest<CreateWorkspaceResponse> {
	   

	private String product;

	private Integer screen;

	private String version;

	private String domain;

	private List<Members> memberss;

	private String name;

	private Integer favorite;
	public CreateWorkspaceRequest() {
		super("datav-outer", "2019-04-02", "CreateWorkspace", "datav");
		setMethod(MethodType.POST);
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putBodyParameter("Product", product);
		}
	}

	public Integer getScreen() {
		return this.screen;
	}

	public void setScreen(Integer screen) {
		this.screen = screen;
		if(screen != null){
			putBodyParameter("Screen", screen.toString());
		}
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putBodyParameter("Version", version);
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putBodyParameter("Domain", domain);
		}
	}

	public List<Members> getMemberss() {
		return this.memberss;
	}

	public void setMemberss(List<Members> memberss) {
		this.memberss = memberss;	
		if (memberss != null) {
			for (int depth1 = 0; depth1 < memberss.size(); depth1++) {
				putBodyParameter("Members." + (depth1 + 1) + ".ExpiredAt" , memberss.get(depth1).getExpiredAt());
				putBodyParameter("Members." + (depth1 + 1) + ".Type" , memberss.get(depth1).getType());
				putBodyParameter("Members." + (depth1 + 1) + ".UserId" , memberss.get(depth1).getUserId());
			}
		}	
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public Integer getFavorite() {
		return this.favorite;
	}

	public void setFavorite(Integer favorite) {
		this.favorite = favorite;
		if(favorite != null){
			putBodyParameter("Favorite", favorite.toString());
		}
	}

	public static class Members {

		private Long expiredAt;

		private String type;

		private String userId;

		public Long getExpiredAt() {
			return this.expiredAt;
		}

		public void setExpiredAt(Long expiredAt) {
			this.expiredAt = expiredAt;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}
	}

	@Override
	public Class<CreateWorkspaceResponse> getResponseClass() {
		return CreateWorkspaceResponse.class;
	}

}
