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

import com.aliyuncs.retailadvqa_public.model.v20200515.SaveExternalDirectoryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveExternalDirectoryResponseUnmarshaller {

	public static SaveExternalDirectoryResponse unmarshall(SaveExternalDirectoryResponse saveExternalDirectoryResponse, UnmarshallerContext _ctx) {
		
		saveExternalDirectoryResponse.setRequestId(_ctx.stringValue("SaveExternalDirectoryResponse.RequestId"));
		saveExternalDirectoryResponse.setErrorDesc(_ctx.stringValue("SaveExternalDirectoryResponse.ErrorDesc"));
		saveExternalDirectoryResponse.setTraceId(_ctx.stringValue("SaveExternalDirectoryResponse.TraceId"));
		saveExternalDirectoryResponse.setData(_ctx.stringValue("SaveExternalDirectoryResponse.Data"));
		saveExternalDirectoryResponse.setErrorCode(_ctx.stringValue("SaveExternalDirectoryResponse.ErrorCode"));
		saveExternalDirectoryResponse.setSuccess(_ctx.booleanValue("SaveExternalDirectoryResponse.Success"));
	 
	 	return saveExternalDirectoryResponse;
	}
}