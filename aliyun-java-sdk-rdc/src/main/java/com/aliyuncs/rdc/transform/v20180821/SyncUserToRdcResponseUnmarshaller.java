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

package com.aliyuncs.rdc.transform.v20180821;

import com.aliyuncs.rdc.model.v20180821.SyncUserToRdcResponse;
import com.aliyuncs.rdc.model.v20180821.SyncUserToRdcResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncUserToRdcResponseUnmarshaller {

	public static SyncUserToRdcResponse unmarshall(SyncUserToRdcResponse syncUserToRdcResponse, UnmarshallerContext _ctx) {
		
		syncUserToRdcResponse.setRequestId(_ctx.stringValue("SyncUserToRdcResponse.RequestId"));
		syncUserToRdcResponse.setSuccess(_ctx.booleanValue("SyncUserToRdcResponse.Success"));
		syncUserToRdcResponse.setCode(_ctx.integerValue("SyncUserToRdcResponse.Code"));
		syncUserToRdcResponse.setMessage(_ctx.stringValue("SyncUserToRdcResponse.Message"));

		Data data = new Data();
		data.setIsValid(_ctx.booleanValue("SyncUserToRdcResponse.Data.IsValid"));
		syncUserToRdcResponse.setData(data);
	 
	 	return syncUserToRdcResponse;
	}
}