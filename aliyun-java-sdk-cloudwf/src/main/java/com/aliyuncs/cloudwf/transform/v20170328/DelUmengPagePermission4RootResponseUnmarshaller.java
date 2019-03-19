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

import com.aliyuncs.cloudwf.model.v20170328.DelUmengPagePermission4RootResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DelUmengPagePermission4RootResponseUnmarshaller {

	public static DelUmengPagePermission4RootResponse unmarshall(DelUmengPagePermission4RootResponse delUmengPagePermission4RootResponse, UnmarshallerContext context) {
		
		delUmengPagePermission4RootResponse.setRequestId(context.stringValue("DelUmengPagePermission4RootResponse.RequestId"));
		delUmengPagePermission4RootResponse.setSuccess(context.booleanValue("DelUmengPagePermission4RootResponse.Success"));
		delUmengPagePermission4RootResponse.setMessage(context.stringValue("DelUmengPagePermission4RootResponse.Message"));
		delUmengPagePermission4RootResponse.setErrorCode(context.integerValue("DelUmengPagePermission4RootResponse.ErrorCode"));
		delUmengPagePermission4RootResponse.setErrorMsg(context.stringValue("DelUmengPagePermission4RootResponse.ErrorMsg"));
	 
	 	return delUmengPagePermission4RootResponse;
	}
}