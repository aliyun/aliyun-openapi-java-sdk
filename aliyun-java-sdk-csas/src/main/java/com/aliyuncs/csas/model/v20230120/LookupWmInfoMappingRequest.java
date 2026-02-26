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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class LookupWmInfoMappingRequest extends RpcAcsRequest<LookupWmInfoMappingResponse> {
	   

	private String wmInfoUint;

	private Long wmInfoSize;

	private String wmType;
	public LookupWmInfoMappingRequest() {
		super("csas", "2023-01-20", "LookupWmInfoMapping");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
	}

	public String getWmInfoUint() {
		return this.wmInfoUint;
	}

	public void setWmInfoUint(String wmInfoUint) {
		this.wmInfoUint = wmInfoUint;
		if(wmInfoUint != null){
			putQueryParameter("WmInfoUint", wmInfoUint);
		}
	}

	public Long getWmInfoSize() {
		return this.wmInfoSize;
	}

	public void setWmInfoSize(Long wmInfoSize) {
		this.wmInfoSize = wmInfoSize;
		if(wmInfoSize != null){
			putQueryParameter("WmInfoSize", wmInfoSize.toString());
		}
	}

	public String getWmType() {
		return this.wmType;
	}

	public void setWmType(String wmType) {
		this.wmType = wmType;
		if(wmType != null){
			putQueryParameter("WmType", wmType);
		}
	}

	@Override
	public Class<LookupWmInfoMappingResponse> getResponseClass() {
		return LookupWmInfoMappingResponse.class;
	}

}
