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

import com.aliyuncs.cloudwf.model.v20170328.ListUmengPagePermission4RootResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUmengPagePermission4RootResponseUnmarshaller {

	public static ListUmengPagePermission4RootResponse unmarshall(ListUmengPagePermission4RootResponse listUmengPagePermission4RootResponse, UnmarshallerContext context) {
		
		listUmengPagePermission4RootResponse.setRequestId(context.stringValue("ListUmengPagePermission4RootResponse.RequestId"));
		listUmengPagePermission4RootResponse.setSuccess(context.booleanValue("ListUmengPagePermission4RootResponse.Success"));
		listUmengPagePermission4RootResponse.setData(context.stringValue("ListUmengPagePermission4RootResponse.Data"));
		listUmengPagePermission4RootResponse.setMessage(context.stringValue("ListUmengPagePermission4RootResponse.Message"));
		listUmengPagePermission4RootResponse.setErrorCode(context.integerValue("ListUmengPagePermission4RootResponse.ErrorCode"));
		listUmengPagePermission4RootResponse.setErrorMsg(context.stringValue("ListUmengPagePermission4RootResponse.ErrorMsg"));
	 
	 	return listUmengPagePermission4RootResponse;
	}
}