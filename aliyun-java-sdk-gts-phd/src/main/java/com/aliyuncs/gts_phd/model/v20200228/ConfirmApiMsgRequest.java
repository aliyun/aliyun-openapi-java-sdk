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
	   

	private String msgId;
	public ConfirmApiMsgRequest() {
		super("gts-phd", "2020-02-28", "ConfirmApiMsg");
		setMethod(MethodType.POST);
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

	@Override
	public Class<ConfirmApiMsgResponse> getResponseClass() {
		return ConfirmApiMsgResponse.class;
	}

}
