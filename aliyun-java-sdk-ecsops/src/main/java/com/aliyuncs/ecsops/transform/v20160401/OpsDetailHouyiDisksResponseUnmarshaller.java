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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDetailHouyiDisksResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDetailHouyiDisksResponse.DiskItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDetailHouyiDisksResponseUnmarshaller {

	public static OpsDetailHouyiDisksResponse unmarshall(OpsDetailHouyiDisksResponse opsDetailHouyiDisksResponse, UnmarshallerContext _ctx) {
		
		opsDetailHouyiDisksResponse.setRequestId(_ctx.stringValue("OpsDetailHouyiDisksResponse.RequestId"));
		opsDetailHouyiDisksResponse.setTotalCount(_ctx.integerValue("OpsDetailHouyiDisksResponse.TotalCount"));
		opsDetailHouyiDisksResponse.setNextToken(_ctx.stringValue("OpsDetailHouyiDisksResponse.NextToken"));
		opsDetailHouyiDisksResponse.setPageSize(_ctx.integerValue("OpsDetailHouyiDisksResponse.PageSize"));
		opsDetailHouyiDisksResponse.setPageNumber(_ctx.integerValue("OpsDetailHouyiDisksResponse.PageNumber"));

		List<DiskItem> diskSet = new ArrayList<DiskItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsDetailHouyiDisksResponse.DiskSet.Length"); i++) {
			DiskItem diskItem = new DiskItem();
			diskItem.setStatus(_ctx.stringValue("OpsDetailHouyiDisksResponse.DiskSet["+ i +"].Status"));
			diskItem.setBpsR(_ctx.stringValue("OpsDetailHouyiDisksResponse.DiskSet["+ i +"].BpsR"));
			diskItem.setBpsW(_ctx.stringValue("OpsDetailHouyiDisksResponse.DiskSet["+ i +"].BpsW"));
			diskItem.setAvailableZoneId(_ctx.stringValue("OpsDetailHouyiDisksResponse.DiskSet["+ i +"].AvailableZoneId"));
			diskItem.setDiskSize(_ctx.stringValue("OpsDetailHouyiDisksResponse.DiskSet["+ i +"].DiskSize"));
			diskItem.setDiskType(_ctx.stringValue("OpsDetailHouyiDisksResponse.DiskSet["+ i +"].DiskType"));
			diskItem.setDiskId(_ctx.stringValue("OpsDetailHouyiDisksResponse.DiskSet["+ i +"].DiskId"));
			diskItem.setInstanceId(_ctx.stringValue("OpsDetailHouyiDisksResponse.DiskSet["+ i +"].InstanceId"));
			diskItem.setIops(_ctx.stringValue("OpsDetailHouyiDisksResponse.DiskSet["+ i +"].Iops"));
			diskItem.setDriver(_ctx.stringValue("OpsDetailHouyiDisksResponse.DiskSet["+ i +"].Driver"));
			diskItem.setBps(_ctx.stringValue("OpsDetailHouyiDisksResponse.DiskSet["+ i +"].Bps"));
			diskItem.setIopsR(_ctx.stringValue("OpsDetailHouyiDisksResponse.DiskSet["+ i +"].IopsR"));
			diskItem.setIopsW(_ctx.stringValue("OpsDetailHouyiDisksResponse.DiskSet["+ i +"].IopsW"));
			diskItem.setDevice(_ctx.stringValue("OpsDetailHouyiDisksResponse.DiskSet["+ i +"].Device"));
			diskItem.setDiskName(_ctx.stringValue("OpsDetailHouyiDisksResponse.DiskSet["+ i +"].DiskName"));
			diskItem.setZoneId(_ctx.stringValue("OpsDetailHouyiDisksResponse.DiskSet["+ i +"].ZoneId"));
			diskItem.setSerialNumber(_ctx.stringValue("OpsDetailHouyiDisksResponse.DiskSet["+ i +"].serialNumber"));

			diskSet.add(diskItem);
		}
		opsDetailHouyiDisksResponse.setDiskSet(diskSet);
	 
	 	return opsDetailHouyiDisksResponse;
	}
}