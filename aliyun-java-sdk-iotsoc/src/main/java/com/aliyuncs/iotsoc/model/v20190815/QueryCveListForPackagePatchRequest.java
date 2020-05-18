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

package com.aliyuncs.iotsoc.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iotsoc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryCveListForPackagePatchRequest extends RpcAcsRequest<QueryCveListForPackagePatchResponse> {
	   

	private String packageVersion;

	private String patchName;
	public QueryCveListForPackagePatchRequest() {
		super("Iotsoc", "2019-08-15", "QueryCveListForPackagePatch", "Iotsoc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPackageVersion() {
		return this.packageVersion;
	}

	public void setPackageVersion(String packageVersion) {
		this.packageVersion = packageVersion;
		if(packageVersion != null){
			putBodyParameter("PackageVersion", packageVersion);
		}
	}

	public String getPatchName() {
		return this.patchName;
	}

	public void setPatchName(String patchName) {
		this.patchName = patchName;
		if(patchName != null){
			putBodyParameter("PatchName", patchName);
		}
	}

	@Override
	public Class<QueryCveListForPackagePatchResponse> getResponseClass() {
		return QueryCveListForPackagePatchResponse.class;
	}

}
