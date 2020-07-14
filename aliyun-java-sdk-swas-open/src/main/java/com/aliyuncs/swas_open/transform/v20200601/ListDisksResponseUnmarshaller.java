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
import com.aliyuncs.swas_open.model.v20200601.ListDisksResponse.DisksItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDisksResponseUnmarshaller {

	public static ListDisksResponse unmarshall(ListDisksResponse listDisksResponse, UnmarshallerContext _ctx) {
		
		listDisksResponse.setRequestId(_ctx.stringValue("ListDisksResponse.RequestId"));
		listDisksResponse.setPageNumber(_ctx.integerValue("ListDisksResponse.PageNumber"));
		listDisksResponse.setPageSize(_ctx.integerValue("ListDisksResponse.PageSize"));
		listDisksResponse.setTotalCount(_ctx.integerValue("ListDisksResponse.TotalCount"));

		List<DisksItem> disks = new ArrayList<DisksItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDisksResponse.Disks.Length"); i++) {
			DisksItem disksItem = new DisksItem();
			disksItem.setDiskId(_ctx.stringValue("ListDisksResponse.Disks["+ i +"].DiskId"));
			disksItem.setRegionId(_ctx.stringValue("ListDisksResponse.Disks["+ i +"].RegionId"));
			disksItem.setDiskName(_ctx.stringValue("ListDisksResponse.Disks["+ i +"].DiskName"));
			disksItem.setDiskType(_ctx.stringValue("ListDisksResponse.Disks["+ i +"].DiskType"));
			disksItem.setSize(_ctx.integerValue("ListDisksResponse.Disks["+ i +"].Size"));
			disksItem.setStatus(_ctx.stringValue("ListDisksResponse.Disks["+ i +"].Status"));
			disksItem.setInstanceId(_ctx.stringValue("ListDisksResponse.Disks["+ i +"].InstanceId"));
			disksItem.setCreationTime(_ctx.stringValue("ListDisksResponse.Disks["+ i +"].CreationTime"));
			disksItem.setDiskChargeType(_ctx.stringValue("ListDisksResponse.Disks["+ i +"].DiskChargeType"));
			disksItem.setDevice(_ctx.stringValue("ListDisksResponse.Disks["+ i +"].Device"));
			disksItem.setBusinessStatus(_ctx.stringValue("ListDisksResponse.Disks["+ i +"].BusinessStatus"));

			disks.add(disksItem);
		}
		listDisksResponse.setDisks(disks);
	 
	 	return listDisksResponse;
	}
}