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

package com.aliyuncs.dbfs.model.v20200418;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dbfs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DetachDbfsRequest extends RpcAcsRequest<DetachDbfsResponse> {
	   

	private String eCSInstanceId;

	private String fsId;
	public DetachDbfsRequest() {
		super("DBFS", "2020-04-18", "DetachDbfs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getECSInstanceId() {
		return this.eCSInstanceId;
	}

	public void setECSInstanceId(String eCSInstanceId) {
		this.eCSInstanceId = eCSInstanceId;
		if(eCSInstanceId != null){
			putQueryParameter("ECSInstanceId", eCSInstanceId);
		}
	}

	public String getFsId() {
		return this.fsId;
	}

	public void setFsId(String fsId) {
		this.fsId = fsId;
		if(fsId != null){
			putQueryParameter("FsId", fsId);
		}
	}

	@Override
	public Class<DetachDbfsResponse> getResponseClass() {
		return DetachDbfsResponse.class;
	}

}
