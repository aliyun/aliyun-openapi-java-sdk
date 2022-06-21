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
public class DescribeCommodityInfosForAbcRequest extends RpcAcsRequest<DescribeCommodityInfosForAbcResponse> {
	   

	private String commodityCode;

	private String commodityVersion;

	private Integer pageNo;

	private Integer pageSize;

	private String commodityType;

	private String queryRegion;
	public DescribeCommodityInfosForAbcRequest() {
		super("SWAS", "2017-08-10", "DescribeCommodityInfosForAbc", "SWAS");
		setMethod(MethodType.POST);
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

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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
	public Class<DescribeCommodityInfosForAbcResponse> getResponseClass() {
		return DescribeCommodityInfosForAbcResponse.class;
	}

}
