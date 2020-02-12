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

package com.aliyuncs.unimkt.transform.v20181212;

import com.aliyuncs.unimkt.model.v20181212.CheckReceivingDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckReceivingDetailResponseUnmarshaller {

	public static CheckReceivingDetailResponse unmarshall(CheckReceivingDetailResponse checkReceivingDetailResponse, UnmarshallerContext _ctx) {
		
		checkReceivingDetailResponse.setRequestId(_ctx.stringValue("CheckReceivingDetailResponse.RequestId"));
		checkReceivingDetailResponse.setStatus(_ctx.booleanValue("CheckReceivingDetailResponse.Status"));
		checkReceivingDetailResponse.setMsg(_ctx.stringValue("CheckReceivingDetailResponse.Msg"));
		checkReceivingDetailResponse.setErrorCode(_ctx.stringValue("CheckReceivingDetailResponse.ErrorCode"));
		checkReceivingDetailResponse.setHasPromotion(_ctx.booleanValue("CheckReceivingDetailResponse.HasPromotion"));
		checkReceivingDetailResponse.setTradeOrderId(_ctx.stringValue("CheckReceivingDetailResponse.TradeOrderId"));
	 
	 	return checkReceivingDetailResponse;
	}
}