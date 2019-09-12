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

package com.aliyuncs.webplus.model.v20190320;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.webplus.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeletePkgVersionRequest extends RoaAcsRequest<DeletePkgVersionResponse> {
	
	public DeletePkgVersionRequest() {
		super("WebPlus", "2019-03-20", "DeletePkgVersion");
		setUriPattern("/pop/v1/wam/pkgVersion");
		setMethod(MethodType.DELETE);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String pkgVersionId;

	public String getPkgVersionId() {
		return this.pkgVersionId;
	}

	public void setPkgVersionId(String pkgVersionId) {
		this.pkgVersionId = pkgVersionId;
		if(pkgVersionId != null){
			putQueryParameter("PkgVersionId", pkgVersionId);
		}
	}

	@Override
	public Class<DeletePkgVersionResponse> getResponseClass() {
		return DeletePkgVersionResponse.class;
	}

}
