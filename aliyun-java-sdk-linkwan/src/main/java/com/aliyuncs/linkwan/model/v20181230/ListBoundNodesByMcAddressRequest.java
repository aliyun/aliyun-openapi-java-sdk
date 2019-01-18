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

package com.aliyuncs.linkwan.model.v20181230;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListBoundNodesByMcAddressRequest extends RpcAcsRequest<ListBoundNodesByMcAddressResponse> {
	
	public ListBoundNodesByMcAddressRequest() {
		super("LinkWAN", "2018-12-30", "ListBoundNodesByMcAddress", "linkwan");
	}

	private Long offset;

	private Long limit;

	private String mcAddress;

	public Long getOffset() {
		return this.offset;
	}

	public void setOffset(Long offset) {
		this.offset = offset;
		if(offset != null){
			putBodyParameter("Offset", offset.toString());
		}
	}

	public Long getLimit() {
		return this.limit;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
		if(limit != null){
			putBodyParameter("Limit", limit.toString());
		}
	}

	public String getMcAddress() {
		return this.mcAddress;
	}

	public void setMcAddress(String mcAddress) {
		this.mcAddress = mcAddress;
		if(mcAddress != null){
			putBodyParameter("McAddress", mcAddress);
		}
	}

	@Override
	public Class<ListBoundNodesByMcAddressResponse> getResponseClass() {
		return ListBoundNodesByMcAddressResponse.class;
	}

}
