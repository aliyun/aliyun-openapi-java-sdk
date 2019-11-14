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

package com.aliyuncs.fss.model.v20190125;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.fss.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class NotifyScanResultRequest extends RpcAcsRequest<NotifyScanResultResponse> {
	   

	private String fssTaskUUID;

	private String fssNotifyType;

	private String fssNotifyInterface;

	private String fssResult;

	private String fssReportUrl;

	private String fssRequestId;
	public NotifyScanResultRequest() {
		super("Fss", "2019-01-25", "NotifyScanResult");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFssTaskUUID() {
		return this.fssTaskUUID;
	}

	public void setFssTaskUUID(String fssTaskUUID) {
		this.fssTaskUUID = fssTaskUUID;
		if(fssTaskUUID != null){
			putBodyParameter("FssTaskUUID", fssTaskUUID);
		}
	}

	public String getFssNotifyType() {
		return this.fssNotifyType;
	}

	public void setFssNotifyType(String fssNotifyType) {
		this.fssNotifyType = fssNotifyType;
		if(fssNotifyType != null){
			putBodyParameter("FssNotifyType", fssNotifyType);
		}
	}

	public String getFssNotifyInterface() {
		return this.fssNotifyInterface;
	}

	public void setFssNotifyInterface(String fssNotifyInterface) {
		this.fssNotifyInterface = fssNotifyInterface;
		if(fssNotifyInterface != null){
			putBodyParameter("FssNotifyInterface", fssNotifyInterface);
		}
	}

	public String getFssResult() {
		return this.fssResult;
	}

	public void setFssResult(String fssResult) {
		this.fssResult = fssResult;
		if(fssResult != null){
			putBodyParameter("FssResult", fssResult);
		}
	}

	public String getFssReportUrl() {
		return this.fssReportUrl;
	}

	public void setFssReportUrl(String fssReportUrl) {
		this.fssReportUrl = fssReportUrl;
		if(fssReportUrl != null){
			putBodyParameter("FssReportUrl", fssReportUrl);
		}
	}

	public String getFssRequestId() {
		return this.fssRequestId;
	}

	public void setFssRequestId(String fssRequestId) {
		this.fssRequestId = fssRequestId;
		if(fssRequestId != null){
			putBodyParameter("FssRequestId", fssRequestId);
		}
	}

	@Override
	public Class<NotifyScanResultResponse> getResponseClass() {
		return NotifyScanResultResponse.class;
	}

}
