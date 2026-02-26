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

package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.ModifyDBNodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyDBNodeResponseUnmarshaller {

	public static ModifyDBNodeResponse unmarshall(ModifyDBNodeResponse modifyDBNodeResponse, UnmarshallerContext _ctx) {
		
		modifyDBNodeResponse.setRequestId(_ctx.stringValue("ModifyDBNodeResponse.RequestId"));
		modifyDBNodeResponse.setDBInstanceId(_ctx.stringValue("ModifyDBNodeResponse.DBInstanceId"));
		modifyDBNodeResponse.setOrderId(_ctx.longValue("ModifyDBNodeResponse.OrderId"));
		modifyDBNodeResponse.setSuccess(_ctx.booleanValue("ModifyDBNodeResponse.Success"));
	 
	 	return modifyDBNodeResponse;
	}
}