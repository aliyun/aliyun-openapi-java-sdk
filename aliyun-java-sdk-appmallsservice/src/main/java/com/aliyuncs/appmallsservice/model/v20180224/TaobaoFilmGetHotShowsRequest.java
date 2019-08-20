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

package com.aliyuncs.appmallsservice.model.v20180224;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.appmallsservice.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class TaobaoFilmGetHotShowsRequest extends RpcAcsRequest<TaobaoFilmGetHotShowsResponse> {
	
	public TaobaoFilmGetHotShowsRequest() {
		super("AppMallsService", "2018-02-24", "TaobaoFilmGetHotShows");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long cityCode;

	private String paramsJson;

	public Long getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(Long cityCode) {
		this.cityCode = cityCode;
		if(cityCode != null){
			putQueryParameter("CityCode", cityCode.toString());
		}
	}

	public String getParamsJson() {
		return this.paramsJson;
	}

	public void setParamsJson(String paramsJson) {
		this.paramsJson = paramsJson;
		if(paramsJson != null){
			putQueryParameter("ParamsJson", paramsJson);
		}
	}

	@Override
	public Class<TaobaoFilmGetHotShowsResponse> getResponseClass() {
		return TaobaoFilmGetHotShowsResponse.class;
	}

}
