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
import com.aliyuncs.datav_outer.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchPublishScreensRequest extends RpcAcsRequest<BatchPublishScreensResponse> {
	   

	private String product;

	private List<Screens> screenss;

	private String domain;

	private String version;
	public BatchPublishScreensRequest() {
		super("datav-outer", "2019-04-02", "BatchPublishScreens", "datav");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<Screens> getScreenss() {
		return this.screenss;
	}

	public void setScreenss(List<Screens> screenss) {
		this.screenss = screenss;	
		if (screenss != null) {
			for (int depth1 = 0; depth1 < screenss.size(); depth1++) {
				putBodyParameter("Screens." + (depth1 + 1) + ".ScreenId" , screenss.get(depth1).getScreenId());
				putBodyParameter("Screens." + (depth1 + 1) + ".Password" , screenss.get(depth1).getPassword());
				putBodyParameter("Screens." + (depth1 + 1) + ".SnapshotId" , screenss.get(depth1).getSnapshotId());
				putBodyParameter("Screens." + (depth1 + 1) + ".EnableShare" , screenss.get(depth1).getEnableShare());
				putBodyParameter("Screens." + (depth1 + 1) + ".AuthTime" , screenss.get(depth1).getAuthTime());
				putBodyParameter("Screens." + (depth1 + 1) + ".NeedToken" , screenss.get(depth1).getNeedToken());
				putBodyParameter("Screens." + (depth1 + 1) + ".CreateSnapshot" , screenss.get(depth1).getCreateSnapshot());
			}
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

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putBodyParameter("Version", version);
		}
	}

	public static class Screens {

		private Integer screenId;

		private String password;

		private Integer snapshotId;

		private Boolean enableShare;

		private Integer authTime;

		private Boolean needToken;

		private Boolean createSnapshot;

		public Integer getScreenId() {
			return this.screenId;
		}

		public void setScreenId(Integer screenId) {
			this.screenId = screenId;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Integer getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(Integer snapshotId) {
			this.snapshotId = snapshotId;
		}

		public Boolean getEnableShare() {
			return this.enableShare;
		}

		public void setEnableShare(Boolean enableShare) {
			this.enableShare = enableShare;
		}

		public Integer getAuthTime() {
			return this.authTime;
		}

		public void setAuthTime(Integer authTime) {
			this.authTime = authTime;
		}

		public Boolean getNeedToken() {
			return this.needToken;
		}

		public void setNeedToken(Boolean needToken) {
			this.needToken = needToken;
		}

		public Boolean getCreateSnapshot() {
			return this.createSnapshot;
		}

		public void setCreateSnapshot(Boolean createSnapshot) {
			this.createSnapshot = createSnapshot;
		}
	}

	@Override
	public Class<BatchPublishScreensResponse> getResponseClass() {
		return BatchPublishScreensResponse.class;
	}

}
