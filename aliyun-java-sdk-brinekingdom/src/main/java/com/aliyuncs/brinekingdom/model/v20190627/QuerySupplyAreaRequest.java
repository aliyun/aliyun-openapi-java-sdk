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

package com.aliyuncs.brinekingdom.model.v20190627;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QuerySupplyAreaRequest extends RpcAcsRequest<QuerySupplyAreaResponse> {
	   

	@SerializedName("areaList")
	private List<String> areaList;

	@SerializedName("idcList")
	private List<String> idcList;
	public QuerySupplyAreaRequest() {
		super("brinekingdom", "2019-06-27", "QuerySupplyArea");
		setMethod(MethodType.POST);
	}

	public List<String> getAreaList() {
		return this.areaList;
	}

	public void setAreaList(List<String> areaList) {
		this.areaList = areaList;	
		if (areaList != null) {
			putQueryParameter("AreaList" , new Gson().toJson(areaList));
		}	
	}

	public List<String> getIdcList() {
		return this.idcList;
	}

	public void setIdcList(List<String> idcList) {
		this.idcList = idcList;	
		if (idcList != null) {
			putQueryParameter("IdcList" , new Gson().toJson(idcList));
		}	
	}

	@Override
	public Class<QuerySupplyAreaResponse> getResponseClass() {
		return QuerySupplyAreaResponse.class;
	}

}
