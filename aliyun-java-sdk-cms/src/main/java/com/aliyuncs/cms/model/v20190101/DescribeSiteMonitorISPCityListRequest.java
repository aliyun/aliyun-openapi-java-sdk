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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeSiteMonitorISPCityListRequest extends RpcAcsRequest<DescribeSiteMonitorISPCityListResponse> {
	   

	private String city;

	private String isp;

	private Boolean iPV4;

	private Boolean iPV6;
	public DescribeSiteMonitorISPCityListRequest() {
		super("Cms", "2019-01-01", "DescribeSiteMonitorISPCityList", "cms");
		setMethod(MethodType.POST);
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

	public String getIsp() {
		return this.isp;
	}

	public void setIsp(String isp) {
		this.isp = isp;
		if(isp != null){
			putQueryParameter("Isp", isp);
		}
	}

	public Boolean getIPV4() {
		return this.iPV4;
	}

	public void setIPV4(Boolean iPV4) {
		this.iPV4 = iPV4;
		if(iPV4 != null){
			putQueryParameter("IPV4", iPV4.toString());
		}
	}

	public Boolean getIPV6() {
		return this.iPV6;
	}

	public void setIPV6(Boolean iPV6) {
		this.iPV6 = iPV6;
		if(iPV6 != null){
			putQueryParameter("IPV6", iPV6.toString());
		}
	}

	@Override
	public Class<DescribeSiteMonitorISPCityListResponse> getResponseClass() {
		return DescribeSiteMonitorISPCityListResponse.class;
	}

}
