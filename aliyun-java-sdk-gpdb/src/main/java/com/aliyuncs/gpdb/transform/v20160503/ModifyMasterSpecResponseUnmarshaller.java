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

package com.aliyuncs.gpdb.transform.v20160503;

import com.aliyuncs.gpdb.model.v20160503.ModifyMasterSpecResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyMasterSpecResponseUnmarshaller {

	public static ModifyMasterSpecResponse unmarshall(ModifyMasterSpecResponse modifyMasterSpecResponse, UnmarshallerContext _ctx) {
		
		modifyMasterSpecResponse.setRequestId(_ctx.stringValue("ModifyMasterSpecResponse.RequestId"));
		modifyMasterSpecResponse.setErrorMessage(_ctx.stringValue("ModifyMasterSpecResponse.ErrorMessage"));
		modifyMasterSpecResponse.setDbInstanceId(_ctx.stringValue("ModifyMasterSpecResponse.DbInstanceId"));
		modifyMasterSpecResponse.setStatus(_ctx.booleanValue("ModifyMasterSpecResponse.Status"));
	 
	 	return modifyMasterSpecResponse;
	}
}