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

package com.aliyuncs.efc_service.model.v20190318;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryReservedInstanceSharedInfosRequest extends RpcAcsRequest<QueryReservedInstanceSharedInfosResponse> {
	   

	private List<RiInfos> riInfoss;

	private Long uid;

	private Integer pageNo;

	private String accountType;

	private Integer pageSize;

	private String region;
	public QueryReservedInstanceSharedInfosRequest() {
		super("efc-service", "2019-03-18", "QueryReservedInstanceSharedInfos", "efcservice");
		setMethod(MethodType.GET);
	}

	public List<RiInfos> getRiInfoss() {
		return this.riInfoss;
	}

	public void setRiInfoss(List<RiInfos> riInfoss) {
		this.riInfoss = riInfoss;	
		if (riInfoss != null) {
			for (int depth1 = 0; depth1 < riInfoss.size(); depth1++) {
				putBodyParameter("RiInfos." + (depth1 + 1) + ".CommodityCode" , riInfoss.get(depth1).getCommodityCode());
				putBodyParameter("RiInfos." + (depth1 + 1) + ".RiInstanceId" , riInfoss.get(depth1).getRiInstanceId());
			}
		}	
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid.toString());
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

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
		if(accountType != null){
			putQueryParameter("AccountType", accountType);
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

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public static class RiInfos {

		private String commodityCode;

		private String riInstanceId;

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getRiInstanceId() {
			return this.riInstanceId;
		}

		public void setRiInstanceId(String riInstanceId) {
			this.riInstanceId = riInstanceId;
		}
	}

	@Override
	public Class<QueryReservedInstanceSharedInfosResponse> getResponseClass() {
		return QueryReservedInstanceSharedInfosResponse.class;
	}

}
