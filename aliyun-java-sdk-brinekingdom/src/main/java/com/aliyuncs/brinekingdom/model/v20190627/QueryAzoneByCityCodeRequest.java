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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryAzoneByCityCodeRequest extends RpcAcsRequest<QueryAzoneByCityCodeResponse> {
	   

	private String cityCode;
	public QueryAzoneByCityCodeRequest() {
		super("brinekingdom", "2019-06-27", "QueryAzoneByCityCode");
		setMethod(MethodType.POST);
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
		if(cityCode != null){
			putQueryParameter("CityCode", cityCode);
		}
	}

	@Override
	public Class<QueryAzoneByCityCodeResponse> getResponseClass() {
		return QueryAzoneByCityCodeResponse.class;
	}

}
