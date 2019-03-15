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

package com.aliyuncs.crm.model.v20150408;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryBidUserCertifiedInfoRequest extends RpcAcsRequest<QueryBidUserCertifiedInfoResponse> {
	
	public QueryBidUserCertifiedInfoRequest() {
		super("Crm", "2015-04-08", "QueryBidUserCertifiedInfo", "crm");
	}

	private String bidType;

	private String pK;

	public String getBidType() {
		return this.bidType;
	}

	public void setBidType(String bidType) {
		this.bidType = bidType;
		if(bidType != null){
			putQueryParameter("BidType", bidType);
		}
	}

	public String getPK() {
		return this.pK;
	}

	public void setPK(String pK) {
		this.pK = pK;
		if(pK != null){
			putQueryParameter("PK", pK);
		}
	}

	@Override
	public Class<QueryBidUserCertifiedInfoResponse> getResponseClass() {
		return QueryBidUserCertifiedInfoResponse.class;
	}

}
