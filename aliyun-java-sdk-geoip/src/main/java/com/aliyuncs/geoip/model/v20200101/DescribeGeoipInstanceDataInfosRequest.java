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

package com.aliyuncs.geoip.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeGeoipInstanceDataInfosRequest extends RpcAcsRequest<DescribeGeoipInstanceDataInfosResponse> {
	   

	private String locationDataType;

	private String instanceId;

	private String lang;
	public DescribeGeoipInstanceDataInfosRequest() {
		super("geoip", "2020-01-01", "DescribeGeoipInstanceDataInfos", "geoip");
		setMethod(MethodType.POST);
	}

	public String getLocationDataType() {
		return this.locationDataType;
	}

	public void setLocationDataType(String locationDataType) {
		this.locationDataType = locationDataType;
		if(locationDataType != null){
			putQueryParameter("LocationDataType", locationDataType);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<DescribeGeoipInstanceDataInfosResponse> getResponseClass() {
		return DescribeGeoipInstanceDataInfosResponse.class;
	}

}
