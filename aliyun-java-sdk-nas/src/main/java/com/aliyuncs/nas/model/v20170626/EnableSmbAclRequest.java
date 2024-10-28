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

package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EnableSmbAclRequest extends RpcAcsRequest<EnableSmbAclResponse> {
	   

	private String keytab;

	private String keytabMd5;

	private String fileSystemId;
	public EnableSmbAclRequest() {
		super("NAS", "2017-06-26", "EnableSmbAcl", "nas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getKeytab() {
		return this.keytab;
	}

	public void setKeytab(String keytab) {
		this.keytab = keytab;
		if(keytab != null){
			putQueryParameter("Keytab", keytab);
		}
	}

	public String getKeytabMd5() {
		return this.keytabMd5;
	}

	public void setKeytabMd5(String keytabMd5) {
		this.keytabMd5 = keytabMd5;
		if(keytabMd5 != null){
			putQueryParameter("KeytabMd5", keytabMd5);
		}
	}

	public String getFileSystemId() {
		return this.fileSystemId;
	}

	public void setFileSystemId(String fileSystemId) {
		this.fileSystemId = fileSystemId;
		if(fileSystemId != null){
			putQueryParameter("FileSystemId", fileSystemId);
		}
	}

	@Override
	public Class<EnableSmbAclResponse> getResponseClass() {
		return EnableSmbAclResponse.class;
	}

}
