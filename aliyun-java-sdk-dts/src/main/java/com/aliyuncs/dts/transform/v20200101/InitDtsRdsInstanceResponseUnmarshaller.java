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

package com.aliyuncs.dts.transform.v20200101;

import com.aliyuncs.dts.model.v20200101.InitDtsRdsInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InitDtsRdsInstanceResponseUnmarshaller {

	public static InitDtsRdsInstanceResponse unmarshall(InitDtsRdsInstanceResponse initDtsRdsInstanceResponse, UnmarshallerContext _ctx) {
		
		initDtsRdsInstanceResponse.setRequestId(_ctx.stringValue("InitDtsRdsInstanceResponse.RequestId"));
		initDtsRdsInstanceResponse.setHttpStatusCode(_ctx.stringValue("InitDtsRdsInstanceResponse.HttpStatusCode"));
		initDtsRdsInstanceResponse.setErrCode(_ctx.stringValue("InitDtsRdsInstanceResponse.ErrCode"));
		initDtsRdsInstanceResponse.setSuccess(_ctx.stringValue("InitDtsRdsInstanceResponse.Success"));
		initDtsRdsInstanceResponse.setErrMessage(_ctx.stringValue("InitDtsRdsInstanceResponse.ErrMessage"));
		initDtsRdsInstanceResponse.setAdminAccount(_ctx.stringValue("InitDtsRdsInstanceResponse.AdminAccount"));
		initDtsRdsInstanceResponse.setAdminPassword(_ctx.stringValue("InitDtsRdsInstanceResponse.AdminPassword"));
	 
	 	return initDtsRdsInstanceResponse;
	}
}