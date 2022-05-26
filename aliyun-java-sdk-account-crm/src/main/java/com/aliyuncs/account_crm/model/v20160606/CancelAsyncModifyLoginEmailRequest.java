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

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CancelAsyncModifyLoginEmailRequest extends RpcAcsRequest<CancelAsyncModifyLoginEmailResponse> {
	   

	private String traceNo;

	private String mpk;
	public CancelAsyncModifyLoginEmailRequest() {
		super("account-crm", "2016-06-06", "CancelAsyncModifyLoginEmail");
		setMethod(MethodType.POST);
	}

	public String getTraceNo() {
		return this.traceNo;
	}

	public void setTraceNo(String traceNo) {
		this.traceNo = traceNo;
		if(traceNo != null){
			putQueryParameter("TraceNo", traceNo);
		}
	}

	public String getMpk() {
		return this.mpk;
	}

	public void setMpk(String mpk) {
		this.mpk = mpk;
		if(mpk != null){
			putQueryParameter("Mpk", mpk);
		}
	}

	@Override
	public Class<CancelAsyncModifyLoginEmailResponse> getResponseClass() {
		return CancelAsyncModifyLoginEmailResponse.class;
	}

}
