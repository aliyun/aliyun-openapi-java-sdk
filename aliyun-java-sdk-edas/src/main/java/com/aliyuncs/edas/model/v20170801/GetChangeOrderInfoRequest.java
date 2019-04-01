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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetChangeOrderInfoRequest extends RoaAcsRequest<GetChangeOrderInfoResponse> {
	
	public GetChangeOrderInfoRequest() {
		super("Edas", "2017-08-01", "GetChangeOrderInfo");
		setUriPattern("/pop/v5/changeorder/change_order_info");
		setMethod(MethodType.POST);
	}

	private String changeOrderId;

	public String getChangeOrderId() {
		return this.changeOrderId;
	}

	public void setChangeOrderId(String changeOrderId) {
		this.changeOrderId = changeOrderId;
		if(changeOrderId != null){
			putQueryParameter("ChangeOrderId", changeOrderId);
		}
	}

	@Override
	public Class<GetChangeOrderInfoResponse> getResponseClass() {
		return GetChangeOrderInfoResponse.class;
	}

}
