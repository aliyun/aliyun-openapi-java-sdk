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

import com.aliyuncs.retailadvqa_public.model.v20200515.CheckResourcepackSlrResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckResourcepackSlrResponseUnmarshaller {

	public static CheckResourcepackSlrResponse unmarshall(CheckResourcepackSlrResponse checkResourcepackSlrResponse, UnmarshallerContext _ctx) {
		
		checkResourcepackSlrResponse.setRequestId(_ctx.stringValue("CheckResourcepackSlrResponse.RequestId"));
		checkResourcepackSlrResponse.setData(_ctx.stringValue("CheckResourcepackSlrResponse.Data"));
		checkResourcepackSlrResponse.setErrorCode(_ctx.stringValue("CheckResourcepackSlrResponse.ErrorCode"));
		checkResourcepackSlrResponse.setSuccess(_ctx.stringValue("CheckResourcepackSlrResponse.Success"));
	 
	 	return checkResourcepackSlrResponse;
	}
}