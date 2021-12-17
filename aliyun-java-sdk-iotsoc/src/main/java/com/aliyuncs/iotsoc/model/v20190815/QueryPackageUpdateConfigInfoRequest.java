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
public class QueryPackageUpdateConfigInfoRequest extends RpcAcsRequest<QueryPackageUpdateConfigInfoResponse> {
	   

	private Boolean releaseFlag;

	private String oSEntry;

	private String arch;
	public QueryPackageUpdateConfigInfoRequest() {
		super("Iotsoc", "2019-08-15", "QueryPackageUpdateConfigInfo");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getReleaseFlag() {
		return this.releaseFlag;
	}

	public void setReleaseFlag(Boolean releaseFlag) {
		this.releaseFlag = releaseFlag;
		if(releaseFlag != null){
			putQueryParameter("ReleaseFlag", releaseFlag.toString());
		}
	}

	public String getOSEntry() {
		return this.oSEntry;
	}

	public void setOSEntry(String oSEntry) {
		this.oSEntry = oSEntry;
		if(oSEntry != null){
			putQueryParameter("OSEntry", oSEntry);
		}
	}

	public String getArch() {
		return this.arch;
	}

	public void setArch(String arch) {
		this.arch = arch;
		if(arch != null){
			putQueryParameter("Arch", arch);
		}
	}

	@Override
	public Class<QueryPackageUpdateConfigInfoResponse> getResponseClass() {
		return QueryPackageUpdateConfigInfoResponse.class;
	}

}
