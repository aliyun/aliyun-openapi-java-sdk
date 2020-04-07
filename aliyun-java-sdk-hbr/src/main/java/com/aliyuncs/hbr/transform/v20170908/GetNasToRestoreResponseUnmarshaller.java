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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.GetNasToRestoreResponse;
import com.aliyuncs.hbr.model.v20170908.GetNasToRestoreResponse.NasInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNasToRestoreResponseUnmarshaller {

	public static GetNasToRestoreResponse unmarshall(GetNasToRestoreResponse getNasToRestoreResponse, UnmarshallerContext _ctx) {
		
		getNasToRestoreResponse.setRequestId(_ctx.stringValue("GetNasToRestoreResponse.RequestId"));
		getNasToRestoreResponse.setSuccess(_ctx.booleanValue("GetNasToRestoreResponse.Success"));
		getNasToRestoreResponse.setCode(_ctx.stringValue("GetNasToRestoreResponse.Code"));
		getNasToRestoreResponse.setMessage(_ctx.stringValue("GetNasToRestoreResponse.Message"));
		getNasToRestoreResponse.setTotalCount(_ctx.longValue("GetNasToRestoreResponse.TotalCount"));
		getNasToRestoreResponse.setPageSize(_ctx.integerValue("GetNasToRestoreResponse.PageSize"));
		getNasToRestoreResponse.setPageNumber(_ctx.integerValue("GetNasToRestoreResponse.PageNumber"));

		List<NasInstance> nasInstances = new ArrayList<NasInstance>();
		for (int i = 0; i < _ctx.lengthValue("GetNasToRestoreResponse.NasInstances.Length"); i++) {
			NasInstance nasInstance = new NasInstance();
			nasInstance.setFileSystemId(_ctx.stringValue("GetNasToRestoreResponse.NasInstances["+ i +"].FileSystemId"));
			nasInstance.setCreateTime(_ctx.longValue("GetNasToRestoreResponse.NasInstances["+ i +"].CreateTime"));
			nasInstance.setVaultId(_ctx.stringValue("GetNasToRestoreResponse.NasInstances["+ i +"].VaultId"));
			nasInstance.setDescription(_ctx.stringValue("GetNasToRestoreResponse.NasInstances["+ i +"].Description"));
			nasInstance.setRegionId(_ctx.stringValue("GetNasToRestoreResponse.NasInstances["+ i +"].RegionId"));
			nasInstance.setZoneId(_ctx.stringValue("GetNasToRestoreResponse.NasInstances["+ i +"].ZoneId"));
			nasInstance.setProtocolType(_ctx.stringValue("GetNasToRestoreResponse.NasInstances["+ i +"].ProtocolType"));
			nasInstance.setStorageType(_ctx.stringValue("GetNasToRestoreResponse.NasInstances["+ i +"].StorageType"));
			nasInstance.setStatus(_ctx.stringValue("GetNasToRestoreResponse.NasInstances["+ i +"].Status"));
			nasInstance.setMountTargetCount(_ctx.integerValue("GetNasToRestoreResponse.NasInstances["+ i +"].MountTargetCount"));
			nasInstance.setMeteredSize(_ctx.longValue("GetNasToRestoreResponse.NasInstances["+ i +"].MeteredSize"));
			nasInstance.setFileSystemDesc(_ctx.stringValue("GetNasToRestoreResponse.NasInstances["+ i +"].FileSystemDesc"));

			nasInstances.add(nasInstance);
		}
		getNasToRestoreResponse.setNasInstances(nasInstances);
	 
	 	return getNasToRestoreResponse;
	}
}