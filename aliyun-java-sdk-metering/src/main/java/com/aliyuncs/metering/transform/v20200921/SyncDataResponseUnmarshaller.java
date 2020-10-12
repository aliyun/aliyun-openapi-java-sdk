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

package com.aliyuncs.metering.transform.v20200921;

import com.aliyuncs.metering.model.v20200921.SyncDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncDataResponseUnmarshaller {

	public static SyncDataResponse unmarshall(SyncDataResponse syncDataResponse, UnmarshallerContext _ctx) {
		
		syncDataResponse.setRequestId(_ctx.stringValue("SyncDataResponse.RequestId"));
		syncDataResponse.setCode(_ctx.integerValue("SyncDataResponse.Code"));
		syncDataResponse.setSuccess(_ctx.booleanValue("SyncDataResponse.Success"));
		syncDataResponse.setData(_ctx.booleanValue("SyncDataResponse.Data"));
		syncDataResponse.setErrCode(_ctx.integerValue("SyncDataResponse.ErrCode"));
		syncDataResponse.setErrMessage(_ctx.stringValue("SyncDataResponse.ErrMessage"));
	 
	 	return syncDataResponse;
	}
}