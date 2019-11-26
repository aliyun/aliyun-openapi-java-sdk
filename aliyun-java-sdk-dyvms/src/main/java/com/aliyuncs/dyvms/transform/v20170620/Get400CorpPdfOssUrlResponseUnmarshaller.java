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

package com.aliyuncs.dyvms.transform.v20170620;

import com.aliyuncs.dyvms.model.v20170620.Get400CorpPdfOssUrlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class Get400CorpPdfOssUrlResponseUnmarshaller {

	public static Get400CorpPdfOssUrlResponse unmarshall(Get400CorpPdfOssUrlResponse get400CorpPdfOssUrlResponse, UnmarshallerContext _ctx) {
		
		get400CorpPdfOssUrlResponse.setRequestId(_ctx.stringValue("Get400CorpPdfOssUrlResponse.RequestId"));
		get400CorpPdfOssUrlResponse.setCode(_ctx.stringValue("Get400CorpPdfOssUrlResponse.code"));
		get400CorpPdfOssUrlResponse.setData(_ctx.stringValue("Get400CorpPdfOssUrlResponse.data"));
	 
	 	return get400CorpPdfOssUrlResponse;
	}
}