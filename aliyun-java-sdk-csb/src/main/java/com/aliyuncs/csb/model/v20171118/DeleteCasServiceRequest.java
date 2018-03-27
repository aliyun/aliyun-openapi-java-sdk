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

package com.aliyuncs.csb.model.v20171118;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteCasServiceRequest extends RpcAcsRequest<DeleteCasServiceResponse> {
	
	public DeleteCasServiceRequest() {
		super("CSB", "2017-11-18", "DeleteCasService", "CSB");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	private Boolean leafOnly;

	private String casCsbName;

	private String srcUserId;

	private String casServiceId;

	public Boolean getLeafOnly() {
		return this.leafOnly;
	}

	public void setLeafOnly(Boolean leafOnly) {
		this.leafOnly = leafOnly;
		if(leafOnly != null){
			putQueryParameter("LeafOnly", leafOnly.toString());
		}
	}

	public String getCasCsbName() {
		return this.casCsbName;
	}

	public void setCasCsbName(String casCsbName) {
		this.casCsbName = casCsbName;
		if(casCsbName != null){
			putQueryParameter("CasCsbName", casCsbName);
		}
	}

	public String getSrcUserId() {
		return this.srcUserId;
	}

	public void setSrcUserId(String srcUserId) {
		this.srcUserId = srcUserId;
		if(srcUserId != null){
			putQueryParameter("SrcUserId", srcUserId);
		}
	}

	public String getCasServiceId() {
		return this.casServiceId;
	}

	public void setCasServiceId(String casServiceId) {
		this.casServiceId = casServiceId;
		if(casServiceId != null){
			putQueryParameter("CasServiceId", casServiceId);
		}
	}

	@Override
	public Class<DeleteCasServiceResponse> getResponseClass() {
		return DeleteCasServiceResponse.class;
	}

}
