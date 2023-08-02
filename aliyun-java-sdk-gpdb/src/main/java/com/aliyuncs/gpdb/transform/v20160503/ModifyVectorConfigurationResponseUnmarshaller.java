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

import com.aliyuncs.gpdb.model.v20160503.ModifyVectorConfigurationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyVectorConfigurationResponseUnmarshaller {

	public static ModifyVectorConfigurationResponse unmarshall(ModifyVectorConfigurationResponse modifyVectorConfigurationResponse, UnmarshallerContext _ctx) {
		
		modifyVectorConfigurationResponse.setRequestId(_ctx.stringValue("ModifyVectorConfigurationResponse.RequestId"));
		modifyVectorConfigurationResponse.setStatus(_ctx.booleanValue("ModifyVectorConfigurationResponse.Status"));
		modifyVectorConfigurationResponse.setErrorMessage(_ctx.stringValue("ModifyVectorConfigurationResponse.ErrorMessage"));
		modifyVectorConfigurationResponse.setDBInstanceId(_ctx.stringValue("ModifyVectorConfigurationResponse.DBInstanceId"));
	 
	 	return modifyVectorConfigurationResponse;
	}
}