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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeDisksResponse;
import com.aliyuncs.ens.model.v20171110.DescribeDisksResponse.DisksItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDisksResponseUnmarshaller {

	public static DescribeDisksResponse unmarshall(DescribeDisksResponse describeDisksResponse, UnmarshallerContext _ctx) {
		
		describeDisksResponse.setRequestId(_ctx.stringValue("DescribeDisksResponse.RequestId"));
		describeDisksResponse.setCode(_ctx.integerValue("DescribeDisksResponse.Code"));
		describeDisksResponse.setPageNumber(_ctx.integerValue("DescribeDisksResponse.PageNumber"));
		describeDisksResponse.setPageSize(_ctx.integerValue("DescribeDisksResponse.PageSize"));
		describeDisksResponse.setTotalCount(_ctx.integerValue("DescribeDisksResponse.TotalCount"));

		List<DisksItem> disks = new ArrayList<DisksItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDisksResponse.Disks.Length"); i++) {
			DisksItem disksItem = new DisksItem();
			disksItem.setCategory(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].Category"));
			disksItem.setCreationTime(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].CreationTime"));
			disksItem.setDiskChargeType(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].DiskChargeType"));
			disksItem.setDiskId(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].DiskId"));
			disksItem.setDiskName(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].DiskName"));
			disksItem.setEnsRegionId(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].EnsRegionId"));
			disksItem.setInstanceId(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].InstanceId"));
			disksItem.setInstanceName(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].InstanceName"));
			disksItem.setSize(_ctx.integerValue("DescribeDisksResponse.Disks["+ i +"].Size"));
			disksItem.setStatus(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].Status"));
			disksItem.setType(_ctx.stringValue("DescribeDisksResponse.Disks["+ i +"].Type"));
			disksItem.setPortable(_ctx.booleanValue("DescribeDisksResponse.Disks["+ i +"].Portable"));

			disks.add(disksItem);
		}
		describeDisksResponse.setDisks(disks);
	 
	 	return describeDisksResponse;
	}
}