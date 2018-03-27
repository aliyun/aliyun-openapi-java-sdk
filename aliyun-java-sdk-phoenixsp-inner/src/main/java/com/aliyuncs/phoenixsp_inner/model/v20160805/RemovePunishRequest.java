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

package com.aliyuncs.phoenixsp_inner.model.v20160805;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class RemovePunishRequest extends RpcAcsRequest<RemovePunishResponse> {
	
	public RemovePunishRequest() {
		super("Phoenixsp-inner", "2016-08-05", "RemovePunish");
	}

	private String bizPunishRequest;

	private String sign;

	private String punishResult;

	public String getBizPunishRequest() {
		return this.bizPunishRequest;
	}

	public void setBizPunishRequest(String bizPunishRequest) {
		this.bizPunishRequest = bizPunishRequest;
		if(bizPunishRequest != null){
			putQueryParameter("BizPunishRequest", bizPunishRequest);
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

	public String getPunishResult() {
		return this.punishResult;
	}

	public void setPunishResult(String punishResult) {
		this.punishResult = punishResult;
		if(punishResult != null){
			putQueryParameter("PunishResult", punishResult);
		}
	}

	@Override
	public Class<RemovePunishResponse> getResponseClass() {
		return RemovePunishResponse.class;
	}

}
