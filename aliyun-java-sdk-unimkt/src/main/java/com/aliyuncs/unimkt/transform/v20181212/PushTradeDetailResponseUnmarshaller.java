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

import com.aliyuncs.unimkt.model.v20181212.PushTradeDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushTradeDetailResponseUnmarshaller {

	public static PushTradeDetailResponse unmarshall(PushTradeDetailResponse pushTradeDetailResponse, UnmarshallerContext _ctx) {
		
		pushTradeDetailResponse.setRequestId(_ctx.stringValue("PushTradeDetailResponse.RequestId"));
		pushTradeDetailResponse.setStatus(_ctx.booleanValue("PushTradeDetailResponse.Status"));
		pushTradeDetailResponse.setMsg(_ctx.stringValue("PushTradeDetailResponse.Msg"));
		pushTradeDetailResponse.setData(_ctx.stringValue("PushTradeDetailResponse.Data"));
		pushTradeDetailResponse.setErrorCode(_ctx.stringValue("PushTradeDetailResponse.ErrorCode"));
	 
	 	return pushTradeDetailResponse;
	}
}