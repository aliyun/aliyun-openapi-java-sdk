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

package com.aliyuncs.dt_oc_info.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetNearbyCompanyRequest extends RpcAcsRequest<GetNearbyCompanyResponse> {
	   

	private Float distance;

	private Integer offset;

	private String corpKey;

	private Integer limit;

	private Float lon;

	private Float lat;
	public GetNearbyCompanyRequest() {
		super("dt-oc-info", "2020-04-01", "GetNearbyCompany");
		setMethod(MethodType.POST);
	}

	public Float getDistance() {
		return this.distance;
	}

	public void setDistance(Float distance) {
		this.distance = distance;
		if(distance != null){
			putQueryParameter("Distance", distance.toString());
		}
	}

	public Integer getOffset() {
		return this.offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
		if(offset != null){
			putQueryParameter("Offset", offset.toString());
		}
	}

	public String getCorpKey() {
		return this.corpKey;
	}

	public void setCorpKey(String corpKey) {
		this.corpKey = corpKey;
		if(corpKey != null){
			putQueryParameter("CorpKey", corpKey);
		}
	}

	public Integer getLimit() {
		return this.limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit.toString());
		}
	}

	public Float getLon() {
		return this.lon;
	}

	public void setLon(Float lon) {
		this.lon = lon;
		if(lon != null){
			putQueryParameter("Lon", lon.toString());
		}
	}

	public Float getLat() {
		return this.lat;
	}

	public void setLat(Float lat) {
		this.lat = lat;
		if(lat != null){
			putQueryParameter("Lat", lat.toString());
		}
	}

	@Override
	public Class<GetNearbyCompanyResponse> getResponseClass() {
		return GetNearbyCompanyResponse.class;
	}

}
