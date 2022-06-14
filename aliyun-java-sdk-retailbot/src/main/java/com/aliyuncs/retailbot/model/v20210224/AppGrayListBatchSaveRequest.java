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

package com.aliyuncs.retailbot.model.v20210224;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AppGrayListBatchSaveRequest extends RpcAcsRequest<AppGrayListBatchSaveResponse> {
	   

	private String instanceId;

	private Long tenantId;

	private String appCode;

	private List<Content> content;
	public AppGrayListBatchSaveRequest() {
		super("RetailBot", "2021-02-24", "AppGrayListBatchSave");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
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

	public String getAppCode() {
		return this.appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
		if(appCode != null){
			putQueryParameter("AppCode", appCode);
		}
	}

	public List<Content> getContent() {
		return this.content;
	}

	public void setContent(List<Content> content) {
		this.content = content;	
		if (content != null) {
			for (int depth1 = 0; depth1 < content.size(); depth1++) {
				if (content.get(depth1) != null) {
					
						putQueryParameter("Content." + (depth1 + 1) + ".SellerId" , content.get(depth1).getSellerId());
						putQueryParameter("Content." + (depth1 + 1) + ".ShopName" , content.get(depth1).getShopName());
						putQueryParameter("Content." + (depth1 + 1) + ".SellerName" , content.get(depth1).getSellerName());
						putQueryParameter("Content." + (depth1 + 1) + ".ShopId" , content.get(depth1).getShopId());
						putQueryParameter("Content." + (depth1 + 1) + ".Version" , content.get(depth1).getVersion());
				}
			}
		}	
	}

	public static class Content {

		private String sellerId;

		private String shopName;

		private String sellerName;

		private String shopId;

		private String version;

		public String getSellerId() {
			return this.sellerId;
		}

		public void setSellerId(String sellerId) {
			this.sellerId = sellerId;
		}

		public String getShopName() {
			return this.shopName;
		}

		public void setShopName(String shopName) {
			this.shopName = shopName;
		}

		public String getSellerName() {
			return this.sellerName;
		}

		public void setSellerName(String sellerName) {
			this.sellerName = sellerName;
		}

		public String getShopId() {
			return this.shopId;
		}

		public void setShopId(String shopId) {
			this.shopId = shopId;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}
	}

	@Override
	public Class<AppGrayListBatchSaveResponse> getResponseClass() {
		return AppGrayListBatchSaveResponse.class;
	}

}
