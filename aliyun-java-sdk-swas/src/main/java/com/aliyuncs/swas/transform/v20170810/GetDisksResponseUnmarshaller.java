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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas.model.v20170810.GetDisksResponse;
import com.aliyuncs.swas.model.v20170810.GetDisksResponse.Disk;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDisksResponseUnmarshaller {

	public static GetDisksResponse unmarshall(GetDisksResponse getDisksResponse, UnmarshallerContext _ctx) {
		
		getDisksResponse.setRequestId(_ctx.stringValue("GetDisksResponse.RequestId"));
		getDisksResponse.setIsSuccess(_ctx.booleanValue("GetDisksResponse.IsSuccess"));
		getDisksResponse.setPageSize(_ctx.integerValue("GetDisksResponse.PageSize"));
		getDisksResponse.setPageNumber(_ctx.integerValue("GetDisksResponse.PageNumber"));
		getDisksResponse.setTotalCount(_ctx.integerValue("GetDisksResponse.TotalCount"));
		getDisksResponse.setCode(_ctx.stringValue("GetDisksResponse.Code"));

		List<Disk> disks = new ArrayList<Disk>();
		for (int i = 0; i < _ctx.lengthValue("GetDisksResponse.Disks.Length"); i++) {
			Disk disk = new Disk();
			disk.setAttacthedServerName(_ctx.stringValue("GetDisksResponse.Disks["+ i +"].AttacthedServerName"));
			disk.setCreationTime(_ctx.longValue("GetDisksResponse.Disks["+ i +"].CreationTime"));
			disk.setStatus(_ctx.stringValue("GetDisksResponse.Disks["+ i +"].Status"));
			disk.setRemark(_ctx.stringValue("GetDisksResponse.Disks["+ i +"].Remark"));
			disk.setDiskId(_ctx.stringValue("GetDisksResponse.Disks["+ i +"].DiskId"));
			disk.setIsAttached(_ctx.booleanValue("GetDisksResponse.Disks["+ i +"].IsAttached"));
			disk.setIOPS(_ctx.longValue("GetDisksResponse.Disks["+ i +"].IOPS"));
			disk.setRegionId(_ctx.stringValue("GetDisksResponse.Disks["+ i +"].RegionId"));
			disk.setDiskCategory(_ctx.stringValue("GetDisksResponse.Disks["+ i +"].DiskCategory"));
			disk.setResourceType(_ctx.stringValue("GetDisksResponse.Disks["+ i +"].ResourceType"));
			disk.setSize(_ctx.integerValue("GetDisksResponse.Disks["+ i +"].Size"));
			disk.setDiskName(_ctx.stringValue("GetDisksResponse.Disks["+ i +"].DiskName"));
			disk.setIsSystemDisk(_ctx.booleanValue("GetDisksResponse.Disks["+ i +"].IsSystemDisk"));
			disk.setDiskChargeType(_ctx.stringValue("GetDisksResponse.Disks["+ i +"].DiskChargeType"));
			disk.setPath(_ctx.stringValue("GetDisksResponse.Disks["+ i +"].Path"));
			disk.setZoneId(_ctx.stringValue("GetDisksResponse.Disks["+ i +"].ZoneId"));
			disk.setAttachedServerUid(_ctx.stringValue("GetDisksResponse.Disks["+ i +"].AttachedServerUid"));

			disks.add(disk);
		}
		getDisksResponse.setDisks(disks);
	 
	 	return getDisksResponse;
	}
}