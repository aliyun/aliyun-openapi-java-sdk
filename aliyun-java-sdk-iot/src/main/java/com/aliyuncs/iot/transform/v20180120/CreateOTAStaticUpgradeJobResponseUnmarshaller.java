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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.CreateOTAStaticUpgradeJobResponse;
import com.aliyuncs.iot.model.v20180120.CreateOTAStaticUpgradeJobResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOTAStaticUpgradeJobResponseUnmarshaller {

	public static CreateOTAStaticUpgradeJobResponse unmarshall(CreateOTAStaticUpgradeJobResponse createOTAStaticUpgradeJobResponse, UnmarshallerContext _ctx) {
		
		createOTAStaticUpgradeJobResponse.setRequestId(_ctx.stringValue("CreateOTAStaticUpgradeJobResponse.RequestId"));
		createOTAStaticUpgradeJobResponse.setSuccess(_ctx.booleanValue("CreateOTAStaticUpgradeJobResponse.Success"));
		createOTAStaticUpgradeJobResponse.setCode(_ctx.stringValue("CreateOTAStaticUpgradeJobResponse.Code"));
		createOTAStaticUpgradeJobResponse.setErrorMessage(_ctx.stringValue("CreateOTAStaticUpgradeJobResponse.ErrorMessage"));

		Data data = new Data();
		data.setJobId(_ctx.stringValue("CreateOTAStaticUpgradeJobResponse.Data.JobId"));
		data.setUtcCreate(_ctx.stringValue("CreateOTAStaticUpgradeJobResponse.Data.UtcCreate"));
		createOTAStaticUpgradeJobResponse.setData(data);
	 
	 	return createOTAStaticUpgradeJobResponse;
	}
}