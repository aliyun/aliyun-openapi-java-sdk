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

import com.aliyuncs.ens.model.v20171110.DescribeDiskIopsListResponse;
import com.aliyuncs.ens.model.v20171110.DescribeDiskIopsListResponse.DiskIops;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiskIopsListResponseUnmarshaller {

	public static DescribeDiskIopsListResponse unmarshall(DescribeDiskIopsListResponse describeDiskIopsListResponse, UnmarshallerContext _ctx) {
		
		describeDiskIopsListResponse.setRequestId(_ctx.stringValue("DescribeDiskIopsListResponse.RequestId"));

		List<DiskIops> diskIopsList = new ArrayList<DiskIops>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiskIopsListResponse.DiskIopsList.Length"); i++) {
			DiskIops diskIops = new DiskIops();
			diskIops.setDiskId(_ctx.stringValue("DescribeDiskIopsListResponse.DiskIopsList["+ i +"].DiskId"));
			diskIops.setRegionId(_ctx.stringValue("DescribeDiskIopsListResponse.DiskIopsList["+ i +"].RegionId"));
			diskIops.setReadBytes(_ctx.longValue("DescribeDiskIopsListResponse.DiskIopsList["+ i +"].ReadBytes"));
			diskIops.setReadLatency(_ctx.longValue("DescribeDiskIopsListResponse.DiskIopsList["+ i +"].ReadLatency"));
			diskIops.setReadOps(_ctx.longValue("DescribeDiskIopsListResponse.DiskIopsList["+ i +"].ReadOps"));
			diskIops.setWriteBytes(_ctx.longValue("DescribeDiskIopsListResponse.DiskIopsList["+ i +"].WriteBytes"));
			diskIops.setWriteLatency(_ctx.longValue("DescribeDiskIopsListResponse.DiskIopsList["+ i +"].WriteLatency"));
			diskIops.setWriteOps(_ctx.longValue("DescribeDiskIopsListResponse.DiskIopsList["+ i +"].WriteOps"));
			diskIops.setBizTime(_ctx.stringValue("DescribeDiskIopsListResponse.DiskIopsList["+ i +"].BizTime"));

			diskIopsList.add(diskIops);
		}
		describeDiskIopsListResponse.setDiskIopsList(diskIopsList);
	 
	 	return describeDiskIopsListResponse;
	}
}