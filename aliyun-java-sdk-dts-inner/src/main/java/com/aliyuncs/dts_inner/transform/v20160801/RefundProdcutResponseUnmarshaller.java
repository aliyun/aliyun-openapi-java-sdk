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

package com.aliyuncs.dts_inner.transform.v20160801;

import com.aliyuncs.dts_inner.model.v20160801.RefundProdcutResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RefundProdcutResponseUnmarshaller {

	public static RefundProdcutResponse unmarshall(RefundProdcutResponse refundProdcutResponse, UnmarshallerContext _ctx) {
		
		refundProdcutResponse.setRequestId(_ctx.stringValue("RefundProdcutResponse.requestId"));
		refundProdcutResponse.setData(_ctx.stringValue("RefundProdcutResponse.data"));
		refundProdcutResponse.setSuccess(_ctx.booleanValue("RefundProdcutResponse.success"));
		refundProdcutResponse.setCode(_ctx.stringValue("RefundProdcutResponse.code"));
		refundProdcutResponse.setMessage(_ctx.stringValue("RefundProdcutResponse.message"));
	 
	 	return refundProdcutResponse;
	}
}