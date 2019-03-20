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

package com.aliyuncs.itaas.model.v20170505;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateIPSegmentRequest extends RpcAcsRequest<UpdateIPSegmentResponse> {
	
	public UpdateIPSegmentRequest() {
		super("ITaaS", "2017-05-05", "UpdateIPSegment", "itaas");
	}

	private String clientappid;

	private String ipsegment;

	private String memo;

	private String sysfrom;

	private String uuid;

	private String operator;

	public String getClientappid() {
		return this.clientappid;
	}

	public void setClientappid(String clientappid) {
		this.clientappid = clientappid;
		if(clientappid != null){
			putQueryParameter("Clientappid", clientappid);
		}
	}

	public String getIpsegment() {
		return this.ipsegment;
	}

	public void setIpsegment(String ipsegment) {
		this.ipsegment = ipsegment;
		if(ipsegment != null){
			putQueryParameter("Ipsegment", ipsegment);
		}
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
		if(memo != null){
			putQueryParameter("Memo", memo);
		}
	}

	public String getSysfrom() {
		return this.sysfrom;
	}

	public void setSysfrom(String sysfrom) {
		this.sysfrom = sysfrom;
		if(sysfrom != null){
			putQueryParameter("Sysfrom", sysfrom);
		}
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putQueryParameter("Uuid", uuid);
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	@Override
	public Class<UpdateIPSegmentResponse> getResponseClass() {
		return UpdateIPSegmentResponse.class;
	}

}
