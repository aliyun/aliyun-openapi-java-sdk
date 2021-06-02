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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryRobotListRequest extends RpcAcsRequest<QueryRobotListResponse> {
	   

	private String corpId;

	private String openInstanceId;

	private Integer productionType;
	public QueryRobotListRequest() {
		super("CCCXSpaceInner", "2019-12-27", "QueryRobotList");
		setMethod(MethodType.GET);
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putQueryParameter("CorpId", corpId);
		}
	}

	public String getOpenInstanceId() {
		return this.openInstanceId;
	}

	public void setOpenInstanceId(String openInstanceId) {
		this.openInstanceId = openInstanceId;
		if(openInstanceId != null){
			putQueryParameter("OpenInstanceId", openInstanceId);
		}
	}

	public Integer getProductionType() {
		return this.productionType;
	}

	public void setProductionType(Integer productionType) {
		this.productionType = productionType;
		if(productionType != null){
			putQueryParameter("ProductionType", productionType.toString());
		}
	}

	@Override
	public Class<QueryRobotListResponse> getResponseClass() {
		return QueryRobotListResponse.class;
	}

}
