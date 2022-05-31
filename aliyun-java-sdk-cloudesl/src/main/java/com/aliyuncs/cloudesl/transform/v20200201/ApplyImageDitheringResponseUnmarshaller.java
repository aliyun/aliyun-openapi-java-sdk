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

package com.aliyuncs.cloudesl.transform.v20200201;

import com.aliyuncs.cloudesl.model.v20200201.ApplyImageDitheringResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ApplyImageDitheringResponseUnmarshaller {

	public static ApplyImageDitheringResponse unmarshall(ApplyImageDitheringResponse applyImageDitheringResponse, UnmarshallerContext _ctx) {
		
		applyImageDitheringResponse.setRequestId(_ctx.stringValue("ApplyImageDitheringResponse.RequestId"));
		applyImageDitheringResponse.setContent(_ctx.stringValue("ApplyImageDitheringResponse.Content"));
		applyImageDitheringResponse.setSuccess(_ctx.booleanValue("ApplyImageDitheringResponse.Success"));
		applyImageDitheringResponse.setMessage(_ctx.stringValue("ApplyImageDitheringResponse.Message"));
		applyImageDitheringResponse.setErrorCode(_ctx.stringValue("ApplyImageDitheringResponse.ErrorCode"));
		applyImageDitheringResponse.setErrorMessage(_ctx.stringValue("ApplyImageDitheringResponse.ErrorMessage"));
		applyImageDitheringResponse.setCode(_ctx.stringValue("ApplyImageDitheringResponse.Code"));
		applyImageDitheringResponse.setDynamicCode(_ctx.stringValue("ApplyImageDitheringResponse.DynamicCode"));
		applyImageDitheringResponse.setDynamicMessage(_ctx.stringValue("ApplyImageDitheringResponse.DynamicMessage"));
	 
	 	return applyImageDitheringResponse;
	}
}