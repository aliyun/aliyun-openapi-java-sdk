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

import com.aliyuncs.datalake.model.v20200710.GetRegionClusterInfoResponse;
import com.aliyuncs.datalake.model.v20200710.GetRegionClusterInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRegionClusterInfoResponseUnmarshaller {

	public static GetRegionClusterInfoResponse unmarshall(GetRegionClusterInfoResponse getRegionClusterInfoResponse, UnmarshallerContext _ctx) {
		
		getRegionClusterInfoResponse.setRequestId(_ctx.stringValue("GetRegionClusterInfoResponse.RequestId"));
		getRegionClusterInfoResponse.setSuccess(_ctx.booleanValue("GetRegionClusterInfoResponse.Success"));

		Data data = new Data();
		data.setRegionId(_ctx.stringValue("GetRegionClusterInfoResponse.Data.RegionId"));
		data.setZoneId(_ctx.stringValue("GetRegionClusterInfoResponse.Data.ZoneId"));
		data.setClusterType(_ctx.stringValue("GetRegionClusterInfoResponse.Data.ClusterType"));
		getRegionClusterInfoResponse.setData(data);
	 
	 	return getRegionClusterInfoResponse;
	}
}