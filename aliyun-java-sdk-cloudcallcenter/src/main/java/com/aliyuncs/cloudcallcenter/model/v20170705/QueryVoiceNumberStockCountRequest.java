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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class QueryVoiceNumberStockCountRequest extends RpcAcsRequest<QueryVoiceNumberStockCountResponse> {
	
	public QueryVoiceNumberStockCountRequest() {
		super("CloudCallCenter", "2017-07-05", "QueryVoiceNumberStockCount", "CloudCallCenter", "innerAPI");
	}

	private List<Long> specIds;

	private String province;

	private String city;

	public List<Long> getSpecIds() {
		return this.specIds;
	}

	public void setSpecIds(List<Long> specIds) {
		this.specIds = specIds;	
		if (specIds != null) {
			for (int i = 0; i < specIds.size(); i++) {
				putQueryParameter("SpecId." + (i + 1) , specIds.get(i));
			}
		}	
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
		if(province != null){
			putQueryParameter("Province", province);
		}
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
		if(city != null){
			putQueryParameter("City", city);
		}
	}

	@Override
	public Class<QueryVoiceNumberStockCountResponse> getResponseClass() {
		return QueryVoiceNumberStockCountResponse.class;
	}

}
