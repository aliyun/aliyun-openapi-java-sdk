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

import com.aliyuncs.cloudwf.model.v20170328.GetUmengPagePermission4RootResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUmengPagePermission4RootResponseUnmarshaller {

	public static GetUmengPagePermission4RootResponse unmarshall(GetUmengPagePermission4RootResponse getUmengPagePermission4RootResponse, UnmarshallerContext context) {
		
		getUmengPagePermission4RootResponse.setRequestId(context.stringValue("GetUmengPagePermission4RootResponse.RequestId"));
		getUmengPagePermission4RootResponse.setSuccess(context.booleanValue("GetUmengPagePermission4RootResponse.Success"));
		getUmengPagePermission4RootResponse.setMessage(context.stringValue("GetUmengPagePermission4RootResponse.Message"));
		getUmengPagePermission4RootResponse.setData(context.stringValue("GetUmengPagePermission4RootResponse.Data"));
		getUmengPagePermission4RootResponse.setErrorCode(context.integerValue("GetUmengPagePermission4RootResponse.ErrorCode"));
		getUmengPagePermission4RootResponse.setErrorMsg(context.stringValue("GetUmengPagePermission4RootResponse.ErrorMsg"));
	 
	 	return getUmengPagePermission4RootResponse;
	}
}