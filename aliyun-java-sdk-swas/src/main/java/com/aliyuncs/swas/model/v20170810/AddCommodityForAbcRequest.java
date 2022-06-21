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

package com.aliyuncs.swas.model.v20170810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddCommodityForAbcRequest extends RpcAcsRequest<AddCommodityForAbcResponse> {
	   

	private String commodityContent;

	private String commodityCode;

	private String commodityVersion;

	private String commodityType;

	private String queryRegion;
	public AddCommodityForAbcRequest() {
		super("SWAS", "2017-08-10", "AddCommodityForAbc", "SWAS");
		setMethod(MethodType.POST);
	}

	public String getCommodityContent() {
		return this.commodityContent;
	}

	public void setCommodityContent(String commodityContent) {
		this.commodityContent = commodityContent;
		if(commodityContent != null){
			putQueryParameter("CommodityContent", commodityContent);
		}
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
		if(commodityCode != null){
			putQueryParameter("CommodityCode", commodityCode);
		}
	}

	public String getCommodityVersion() {
		return this.commodityVersion;
	}

	public void setCommodityVersion(String commodityVersion) {
		this.commodityVersion = commodityVersion;
		if(commodityVersion != null){
			putQueryParameter("CommodityVersion", commodityVersion);
		}
	}

	public String getCommodityType() {
		return this.commodityType;
	}

	public void setCommodityType(String commodityType) {
		this.commodityType = commodityType;
		if(commodityType != null){
			putQueryParameter("CommodityType", commodityType);
		}
	}

	public String getQueryRegion() {
		return this.queryRegion;
	}

	public void setQueryRegion(String queryRegion) {
		this.queryRegion = queryRegion;
		if(queryRegion != null){
			putQueryParameter("QueryRegion", queryRegion);
		}
	}

	@Override
	public Class<AddCommodityForAbcResponse> getResponseClass() {
		return AddCommodityForAbcResponse.class;
	}

}
