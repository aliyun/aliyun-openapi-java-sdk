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

import com.aliyuncs.cloudwf.model.v20170328.SaveUmengPagePermission4RootResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveUmengPagePermission4RootResponseUnmarshaller {

	public static SaveUmengPagePermission4RootResponse unmarshall(SaveUmengPagePermission4RootResponse saveUmengPagePermission4RootResponse, UnmarshallerContext context) {
		
		saveUmengPagePermission4RootResponse.setRequestId(context.stringValue("SaveUmengPagePermission4RootResponse.RequestId"));
		saveUmengPagePermission4RootResponse.setSuccess(context.booleanValue("SaveUmengPagePermission4RootResponse.Success"));
		saveUmengPagePermission4RootResponse.setMessage(context.stringValue("SaveUmengPagePermission4RootResponse.Message"));
		saveUmengPagePermission4RootResponse.setErrorCode(context.integerValue("SaveUmengPagePermission4RootResponse.ErrorCode"));
		saveUmengPagePermission4RootResponse.setErrorMsg(context.stringValue("SaveUmengPagePermission4RootResponse.ErrorMsg"));
	 
	 	return saveUmengPagePermission4RootResponse;
	}
}