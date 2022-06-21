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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.GetDiskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDiskResponseUnmarshaller {

	public static GetDiskResponse unmarshall(GetDiskResponse getDiskResponse, UnmarshallerContext _ctx) {
		
		getDiskResponse.setRequestId(_ctx.stringValue("GetDiskResponse.RequestId"));
		getDiskResponse.setStatus(_ctx.stringValue("GetDiskResponse.Status"));
		getDiskResponse.setPath(_ctx.stringValue("GetDiskResponse.Path"));
		getDiskResponse.setIsSuccess(_ctx.booleanValue("GetDiskResponse.IsSuccess"));
		getDiskResponse.setZoneId(_ctx.stringValue("GetDiskResponse.ZoneId"));
		getDiskResponse.setSize(_ctx.integerValue("GetDiskResponse.Size"));
		getDiskResponse.setIsAttached(_ctx.booleanValue("GetDiskResponse.IsAttached"));
		getDiskResponse.setDiskChargeType(_ctx.stringValue("GetDiskResponse.DiskChargeType"));
		getDiskResponse.setDiskCategory(_ctx.stringValue("GetDiskResponse.DiskCategory"));
		getDiskResponse.setResourceType(_ctx.stringValue("GetDiskResponse.ResourceType"));
		getDiskResponse.setIOPS(_ctx.longValue("GetDiskResponse.IOPS"));
		getDiskResponse.setDiskName(_ctx.stringValue("GetDiskResponse.DiskName"));
		getDiskResponse.setCode(_ctx.stringValue("GetDiskResponse.Code"));
		getDiskResponse.setRemark(_ctx.stringValue("GetDiskResponse.Remark"));
		getDiskResponse.setAttacthedServerName(_ctx.stringValue("GetDiskResponse.AttacthedServerName"));
		getDiskResponse.setIsSystemDisk(_ctx.booleanValue("GetDiskResponse.IsSystemDisk"));
		getDiskResponse.setAttachedServerUid(_ctx.stringValue("GetDiskResponse.AttachedServerUid"));
		getDiskResponse.setCreationTime(_ctx.longValue("GetDiskResponse.CreationTime"));
		getDiskResponse.setRegionId(_ctx.stringValue("GetDiskResponse.RegionId"));
		getDiskResponse.setDiskId(_ctx.stringValue("GetDiskResponse.DiskId"));
	 
	 	return getDiskResponse;
	}
}