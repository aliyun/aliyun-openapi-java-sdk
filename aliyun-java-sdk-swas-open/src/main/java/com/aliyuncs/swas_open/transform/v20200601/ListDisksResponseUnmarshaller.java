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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.ListDisksResponse;
import com.aliyuncs.swas_open.model.v20200601.ListDisksResponse.Disk;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDisksResponseUnmarshaller {

	public static ListDisksResponse unmarshall(ListDisksResponse listDisksResponse, UnmarshallerContext _ctx) {
		
		listDisksResponse.setRequestId(_ctx.stringValue("ListDisksResponse.RequestId"));
		listDisksResponse.setPageNumber(_ctx.integerValue("ListDisksResponse.PageNumber"));
		listDisksResponse.setPageSize(_ctx.integerValue("ListDisksResponse.PageSize"));
		listDisksResponse.setTotalCount(_ctx.integerValue("ListDisksResponse.TotalCount"));

		List<Disk> disks = new ArrayList<Disk>();
		for (int i = 0; i < _ctx.lengthValue("ListDisksResponse.Disks.Length"); i++) {
			Disk disk = new Disk();
			disk.setDiskId(_ctx.stringValue("ListDisksResponse.Disks["+ i +"].DiskId"));
			disk.setRegionId(_ctx.stringValue("ListDisksResponse.Disks["+ i +"].RegionId"));
			disk.setDiskName(_ctx.stringValue("ListDisksResponse.Disks["+ i +"].DiskName"));
			disk.setDiskType(_ctx.stringValue("ListDisksResponse.Disks["+ i +"].DiskType"));
			disk.setSize(_ctx.integerValue("ListDisksResponse.Disks["+ i +"].Size"));
			disk.setStatus(_ctx.stringValue("ListDisksResponse.Disks["+ i +"].Status"));
			disk.setInstanceId(_ctx.stringValue("ListDisksResponse.Disks["+ i +"].InstanceId"));
			disk.setCreationTime(_ctx.stringValue("ListDisksResponse.Disks["+ i +"].CreationTime"));
			disk.setDiskChargeType(_ctx.stringValue("ListDisksResponse.Disks["+ i +"].DiskChargeType"));
			disk.setDevice(_ctx.stringValue("ListDisksResponse.Disks["+ i +"].Device"));

			disks.add(disk);
		}
		listDisksResponse.setDisks(disks);
	 
	 	return listDisksResponse;
	}
}