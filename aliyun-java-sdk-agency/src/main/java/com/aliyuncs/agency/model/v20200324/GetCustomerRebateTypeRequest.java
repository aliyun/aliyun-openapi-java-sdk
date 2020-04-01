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

package com.aliyuncs.agency.model.v20200324;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetCustomerRebateTypeRequest extends RpcAcsRequest<GetCustomerRebateTypeResponse> {
	   

	private Long transferUid;

	private String siteId;
	public GetCustomerRebateTypeRequest() {
		super("Agency", "2020-03-24", "GetCustomerRebateType");
		setMethod(MethodType.POST);
	}

	public Long getTransferUid() {
		return this.transferUid;
	}

	public void setTransferUid(Long transferUid) {
		this.transferUid = transferUid;
		if(transferUid != null){
			putQueryParameter("TransferUid", transferUid.toString());
		}
	}

	public String getSiteId() {
		return this.siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
		if(siteId != null){
			putQueryParameter("SiteId", siteId);
		}
	}

	@Override
	public Class<GetCustomerRebateTypeResponse> getResponseClass() {
		return GetCustomerRebateTypeResponse.class;
	}

}
