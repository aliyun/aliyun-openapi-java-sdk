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

package com.aliyuncs.marketplaceintl.model.v20221230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribePushMeteringDataRequest extends RpcAcsRequest<DescribePushMeteringDataResponse> {
	   

	private String pushOrderBizId;
	public DescribePushMeteringDataRequest() {
		super("marketplaceIntl", "2022-12-30", "DescribePushMeteringData");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getPushOrderBizId() {
		return this.pushOrderBizId;
	}

	public void setPushOrderBizId(String pushOrderBizId) {
		this.pushOrderBizId = pushOrderBizId;
		if(pushOrderBizId != null){
			putQueryParameter("PushOrderBizId", pushOrderBizId);
		}
	}

	@Override
	public Class<DescribePushMeteringDataResponse> getResponseClass() {
		return DescribePushMeteringDataResponse.class;
	}

}
