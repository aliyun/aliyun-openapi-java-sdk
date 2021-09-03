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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import com.aliyuncs.retailadvqa_public.model.v20200515.CheckUmengInnerOuterCompleteResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckUmengInnerOuterCompleteResponseUnmarshaller {

	public static CheckUmengInnerOuterCompleteResponse unmarshall(CheckUmengInnerOuterCompleteResponse checkUmengInnerOuterCompleteResponse, UnmarshallerContext _ctx) {
		
		checkUmengInnerOuterCompleteResponse.setRequestId(_ctx.stringValue("CheckUmengInnerOuterCompleteResponse.RequestId"));
		checkUmengInnerOuterCompleteResponse.setErrorDesc(_ctx.stringValue("CheckUmengInnerOuterCompleteResponse.ErrorDesc"));
		checkUmengInnerOuterCompleteResponse.setTraceId(_ctx.stringValue("CheckUmengInnerOuterCompleteResponse.TraceId"));
		checkUmengInnerOuterCompleteResponse.setData(_ctx.booleanValue("CheckUmengInnerOuterCompleteResponse.Data"));
		checkUmengInnerOuterCompleteResponse.setErrorCode(_ctx.stringValue("CheckUmengInnerOuterCompleteResponse.ErrorCode"));
		checkUmengInnerOuterCompleteResponse.setSuccess(_ctx.booleanValue("CheckUmengInnerOuterCompleteResponse.Success"));
	 
	 	return checkUmengInnerOuterCompleteResponse;
	}
}