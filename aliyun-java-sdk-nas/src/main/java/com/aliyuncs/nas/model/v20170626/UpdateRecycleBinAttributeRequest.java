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
public class UpdateRecycleBinAttributeRequest extends RpcAcsRequest<UpdateRecycleBinAttributeResponse> {
	   

	private String fileSystemId;

	private Long reservedDays;
	public UpdateRecycleBinAttributeRequest() {
		super("NAS", "2017-06-26", "UpdateRecycleBinAttribute");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getReservedDays() {
		return this.reservedDays;
	}

	public void setReservedDays(Long reservedDays) {
		this.reservedDays = reservedDays;
		if(reservedDays != null){
			putQueryParameter("ReservedDays", reservedDays.toString());
		}
	}

	@Override
	public Class<UpdateRecycleBinAttributeResponse> getResponseClass() {
		return UpdateRecycleBinAttributeResponse.class;
	}

}