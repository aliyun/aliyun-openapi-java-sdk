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

package com.aliyuncs.apds.model.v20220331;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListRegionsRequest extends RoaAcsRequest<ListRegionsResponse> {
	   

	private String cloudType;

	private String ak;

	private String sk;

	private String tenantId;

	private String region;
	public ListRegionsRequest() {
		super("apds", "2022-03-31", "ListRegions");
		setUriPattern("/okss-services/winback/query-region");
		setMethod(MethodType.POST);
	}

	public String getCloudType() {
		return this.cloudType;
	}

	public void setCloudType(String cloudType) {
		this.cloudType = cloudType;
		if(cloudType != null){
			putQueryParameter("cloudType", cloudType);
		}
	}

	public String getAk() {
		return this.ak;
	}

	public void setAk(String ak) {
		this.ak = ak;
		if(ak != null){
			putQueryParameter("ak", ak);
		}
	}

	public String getSk() {
		return this.sk;
	}

	public void setSk(String sk) {
		this.sk = sk;
		if(sk != null){
			putQueryParameter("sk", sk);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("tenantId", tenantId);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("region", region);
		}
	}

	@Override
	public Class<ListRegionsResponse> getResponseClass() {
		return ListRegionsResponse.class;
	}

}
