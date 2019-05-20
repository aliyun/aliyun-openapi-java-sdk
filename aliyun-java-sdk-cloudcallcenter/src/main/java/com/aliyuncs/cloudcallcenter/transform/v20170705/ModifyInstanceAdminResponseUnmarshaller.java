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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyInstanceAdminResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyInstanceAdminResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyInstanceAdminResponseUnmarshaller {

	public static ModifyInstanceAdminResponse unmarshall(ModifyInstanceAdminResponse modifyInstanceAdminResponse, UnmarshallerContext context) {
		
		modifyInstanceAdminResponse.setRequestId(context.stringValue("ModifyInstanceAdminResponse.RequestId"));
		modifyInstanceAdminResponse.setSuccess(context.booleanValue("ModifyInstanceAdminResponse.Success"));
		modifyInstanceAdminResponse.setCode(context.stringValue("ModifyInstanceAdminResponse.Code"));
		modifyInstanceAdminResponse.setMessage(context.stringValue("ModifyInstanceAdminResponse.Message"));
		modifyInstanceAdminResponse.setHttpStatusCode(context.integerValue("ModifyInstanceAdminResponse.HttpStatusCode"));

		Data data = new Data();

		List<String> successAdmins = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ModifyInstanceAdminResponse.Data.SuccessAdmins.Length"); i++) {
			successAdmins.add(context.stringValue("ModifyInstanceAdminResponse.Data.SuccessAdmins["+ i +"]"));
		}
		data.setSuccessAdmins(successAdmins);

		List<String> failAdmins = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ModifyInstanceAdminResponse.Data.FailAdmins.Length"); i++) {
			failAdmins.add(context.stringValue("ModifyInstanceAdminResponse.Data.FailAdmins["+ i +"]"));
		}
		data.setFailAdmins(failAdmins);
		modifyInstanceAdminResponse.setData(data);
	 
	 	return modifyInstanceAdminResponse;
	}
}