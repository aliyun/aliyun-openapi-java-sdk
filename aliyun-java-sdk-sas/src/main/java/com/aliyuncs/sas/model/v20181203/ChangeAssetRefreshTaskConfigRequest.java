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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ChangeAssetRefreshTaskConfigRequest extends RpcAcsRequest<ChangeAssetRefreshTaskConfigResponse> {
	   

	private List<AssetRefreshConfigs> assetRefreshConfigss;
	public ChangeAssetRefreshTaskConfigRequest() {
		super("Sas", "2018-12-03", "ChangeAssetRefreshTaskConfig");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<AssetRefreshConfigs> getAssetRefreshConfigss() {
		return this.assetRefreshConfigss;
	}

	public void setAssetRefreshConfigss(List<AssetRefreshConfigs> assetRefreshConfigss) {
		this.assetRefreshConfigss = assetRefreshConfigss;	
		if (assetRefreshConfigss != null) {
			for (int depth1 = 0; depth1 < assetRefreshConfigss.size(); depth1++) {
				putQueryParameter("AssetRefreshConfigs." + (depth1 + 1) + ".Vendor" , assetRefreshConfigss.get(depth1).getVendor());
				putQueryParameter("AssetRefreshConfigs." + (depth1 + 1) + ".SchedulePeriod" , assetRefreshConfigss.get(depth1).getSchedulePeriod());
				putQueryParameter("AssetRefreshConfigs." + (depth1 + 1) + ".Status" , assetRefreshConfigss.get(depth1).getStatus());
			}
		}	
	}

	public static class AssetRefreshConfigs {

		private Integer vendor;

		private Integer schedulePeriod;

		private Integer status;

		public Integer getVendor() {
			return this.vendor;
		}

		public void setVendor(Integer vendor) {
			this.vendor = vendor;
		}

		public Integer getSchedulePeriod() {
			return this.schedulePeriod;
		}

		public void setSchedulePeriod(Integer schedulePeriod) {
			this.schedulePeriod = schedulePeriod;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public Class<ChangeAssetRefreshTaskConfigResponse> getResponseClass() {
		return ChangeAssetRefreshTaskConfigResponse.class;
	}

}
