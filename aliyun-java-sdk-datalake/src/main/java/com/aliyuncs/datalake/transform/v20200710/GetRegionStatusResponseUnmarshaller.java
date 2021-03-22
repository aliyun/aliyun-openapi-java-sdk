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

package com.aliyuncs.datalake.transform.v20200710;

import com.aliyuncs.datalake.model.v20200710.GetRegionStatusResponse;
import com.aliyuncs.datalake.model.v20200710.GetRegionStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRegionStatusResponseUnmarshaller {

	public static GetRegionStatusResponse unmarshall(GetRegionStatusResponse getRegionStatusResponse, UnmarshallerContext _ctx) {
		
		getRegionStatusResponse.setRequestId(_ctx.stringValue("GetRegionStatusResponse.RequestId"));
		getRegionStatusResponse.setSuccess(_ctx.stringValue("GetRegionStatusResponse.Success"));

		Data data = new Data();
		data.setRegionId(_ctx.stringValue("GetRegionStatusResponse.Data.RegionId"));
		data.setIsDlfServiceOpen(_ctx.booleanValue("GetRegionStatusResponse.Data.IsDlfServiceOpen"));
		data.setRegionStatus(_ctx.stringValue("GetRegionStatusResponse.Data.RegionStatus"));
		data.setIsDependencyReady(_ctx.booleanValue("GetRegionStatusResponse.Data.IsDependencyReady"));
		data.setAccountStatus(_ctx.stringValue("GetRegionStatusResponse.Data.AccountStatus"));
		getRegionStatusResponse.setData(data);
	 
	 	return getRegionStatusResponse;
	}
}