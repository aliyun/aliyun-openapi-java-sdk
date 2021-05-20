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

package com.aliyuncs.dbfs.transform.v20200418;

import com.aliyuncs.dbfs.model.v20200418.GetSynchronizConstantsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSynchronizConstantsResponseUnmarshaller {

	public static GetSynchronizConstantsResponse unmarshall(GetSynchronizConstantsResponse getSynchronizConstantsResponse, UnmarshallerContext _ctx) {
		
		getSynchronizConstantsResponse.setRequestId(_ctx.stringValue("GetSynchronizConstantsResponse.RequestId"));
		getSynchronizConstantsResponse.setData(_ctx.stringValue("GetSynchronizConstantsResponse.Data"));
		getSynchronizConstantsResponse.setPageSize(_ctx.longValue("GetSynchronizConstantsResponse.PageSize"));
		getSynchronizConstantsResponse.setTotalCount(_ctx.longValue("GetSynchronizConstantsResponse.TotalCount"));
		getSynchronizConstantsResponse.setPageNumber(_ctx.longValue("GetSynchronizConstantsResponse.PageNumber"));
		getSynchronizConstantsResponse.setRegionData(_ctx.stringValue("GetSynchronizConstantsResponse.RegionData"));
		getSynchronizConstantsResponse.setZoneData(_ctx.stringValue("GetSynchronizConstantsResponse.ZoneData"));
		getSynchronizConstantsResponse.setOsversionData(_ctx.stringValue("GetSynchronizConstantsResponse.OsversionData"));
		getSynchronizConstantsResponse.setProductCodeData(_ctx.stringValue("GetSynchronizConstantsResponse.ProductCodeData"));
		getSynchronizConstantsResponse.setMasterData(_ctx.stringValue("GetSynchronizConstantsResponse.MasterData"));
		getSynchronizConstantsResponse.setEndpointData(_ctx.stringValue("GetSynchronizConstantsResponse.EndpointData"));
		getSynchronizConstantsResponse.setAccessData(_ctx.stringValue("GetSynchronizConstantsResponse.AccessData"));
	 
	 	return getSynchronizConstantsResponse;
	}
}