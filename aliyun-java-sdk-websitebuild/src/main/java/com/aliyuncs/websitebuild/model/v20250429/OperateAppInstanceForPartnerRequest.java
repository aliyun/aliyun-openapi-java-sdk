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

package com.aliyuncs.websitebuild.model.v20250429;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OperateAppInstanceForPartnerRequest extends RpcAcsRequest<OperateAppInstanceForPartnerResponse> {
	   

	private String extend;

	private String operateEvent;
	public OperateAppInstanceForPartnerRequest() {
		super("WebsiteBuild", "2025-04-29", "OperateAppInstanceForPartner");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getExtend() {
		return this.extend;
	}

	public void setExtend(String extend) {
		this.extend = extend;
		if(extend != null){
			putQueryParameter("Extend", extend);
		}
	}

	public String getOperateEvent() {
		return this.operateEvent;
	}

	public void setOperateEvent(String operateEvent) {
		this.operateEvent = operateEvent;
		if(operateEvent != null){
			putQueryParameter("OperateEvent", operateEvent);
		}
	}

	@Override
	public Class<OperateAppInstanceForPartnerResponse> getResponseClass() {
		return OperateAppInstanceForPartnerResponse.class;
	}

}
