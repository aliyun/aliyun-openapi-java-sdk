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

package com.aliyuncs.cloudwf.transform.v20170328;

import com.aliyuncs.cloudwf.model.v20170328.GetBindAp4UmengResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBindAp4UmengResponseUnmarshaller {

	public static GetBindAp4UmengResponse unmarshall(GetBindAp4UmengResponse getBindAp4UmengResponse, UnmarshallerContext context) {
		
		getBindAp4UmengResponse.setRequestId(context.stringValue("GetBindAp4UmengResponse.RequestId"));
		getBindAp4UmengResponse.setSuccess(context.booleanValue("GetBindAp4UmengResponse.Success"));
		getBindAp4UmengResponse.setMessage(context.stringValue("GetBindAp4UmengResponse.Message"));
		getBindAp4UmengResponse.setData(context.stringValue("GetBindAp4UmengResponse.Data"));
		getBindAp4UmengResponse.setErrorCode(context.integerValue("GetBindAp4UmengResponse.ErrorCode"));
		getBindAp4UmengResponse.setErrorMsg(context.stringValue("GetBindAp4UmengResponse.ErrorMsg"));
	 
	 	return getBindAp4UmengResponse;
	}
}