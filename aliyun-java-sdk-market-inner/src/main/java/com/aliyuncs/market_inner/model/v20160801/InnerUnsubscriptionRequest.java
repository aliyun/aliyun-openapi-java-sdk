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

package com.aliyuncs.market_inner.model.v20160801;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class InnerUnsubscriptionRequest extends RpcAcsRequest<InnerUnsubscriptionResponse> {
	
	public InnerUnsubscriptionRequest() {
		super("Market-Inner", "2016-08-01", "InnerUnsubscription");
	}

	private String requestSource;

	private String produceCode;

	private Long aliUid;

	public String getRequestSource() {
		return this.requestSource;
	}

	public void setRequestSource(String requestSource) {
		this.requestSource = requestSource;
		if(requestSource != null){
			putQueryParameter("RequestSource", requestSource);
		}
	}

	public String getProduceCode() {
		return this.produceCode;
	}

	public void setProduceCode(String produceCode) {
		this.produceCode = produceCode;
		if(produceCode != null){
			putQueryParameter("ProduceCode", produceCode);
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	@Override
	public Class<InnerUnsubscriptionResponse> getResponseClass() {
		return InnerUnsubscriptionResponse.class;
	}

}
