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

package com.aliyuncs.gts_phd.model.v20200228;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ConfirmApiMsgRequest extends RpcAcsRequest<ConfirmApiMsgResponse> {
	   

	private String uid;

	private String requestId;

	private String sign;

	private String msgId;

	private String ak;

	private String signTimestamp;
	public ConfirmApiMsgRequest() {
		super("gts-phd", "2020-02-28", "ConfirmApiMsg");
		setMethod(MethodType.POST);
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid);
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putQueryParameter("RequestId", requestId);
		}
	}

	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
		if(sign != null){
			putQueryParameter("Sign", sign);
		}
	}

	public String getMsgId() {
		return this.msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
		if(msgId != null){
			putQueryParameter("MsgId", msgId);
		}
	}

	public String getAk() {
		return this.ak;
	}

	public void setAk(String ak) {
		this.ak = ak;
		if(ak != null){
			putQueryParameter("Ak", ak);
		}
	}

	public String getSignTimestamp() {
		return this.signTimestamp;
	}

	public void setSignTimestamp(String signTimestamp) {
		this.signTimestamp = signTimestamp;
		if(signTimestamp != null){
			putQueryParameter("SignTimestamp", signTimestamp);
		}
	}

	@Override
	public Class<ConfirmApiMsgResponse> getResponseClass() {
		return ConfirmApiMsgResponse.class;
	}

}
