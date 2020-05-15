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

import com.aliyuncs.hbr.model.v20170908.DescribeNasInstancesResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeNasInstancesResponse.NasInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNasInstancesResponseUnmarshaller {

	public static DescribeNasInstancesResponse unmarshall(DescribeNasInstancesResponse describeNasInstancesResponse, UnmarshallerContext _ctx) {
		
		describeNasInstancesResponse.setRequestId(_ctx.stringValue("DescribeNasInstancesResponse.RequestId"));
		describeNasInstancesResponse.setSuccess(_ctx.booleanValue("DescribeNasInstancesResponse.Success"));
		describeNasInstancesResponse.setCode(_ctx.stringValue("DescribeNasInstancesResponse.Code"));
		describeNasInstancesResponse.setMessage(_ctx.stringValue("DescribeNasInstancesResponse.Message"));
		describeNasInstancesResponse.setTotalCount(_ctx.longValue("DescribeNasInstancesResponse.TotalCount"));
		describeNasInstancesResponse.setPageSize(_ctx.integerValue("DescribeNasInstancesResponse.PageSize"));
		describeNasInstancesResponse.setPageNumber(_ctx.integerValue("DescribeNasInstancesResponse.PageNumber"));

		List<NasInstance> nasInstances = new ArrayList<NasInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNasInstancesResponse.NasInstances.Length"); i++) {
			NasInstance nasInstance = new NasInstance();
			nasInstance.setFileSystemId(_ctx.stringValue("DescribeNasInstancesResponse.NasInstances["+ i +"].FileSystemId"));
			nasInstance.setCreateTime(_ctx.longValue("DescribeNasInstancesResponse.NasInstances["+ i +"].CreateTime"));
			nasInstance.setVaultId(_ctx.stringValue("DescribeNasInstancesResponse.NasInstances["+ i +"].VaultId"));
			nasInstance.setDescription(_ctx.stringValue("DescribeNasInstancesResponse.NasInstances["+ i +"].Description"));
			nasInstance.setRegionId(_ctx.stringValue("DescribeNasInstancesResponse.NasInstances["+ i +"].RegionId"));
			nasInstance.setZoneId(_ctx.stringValue("DescribeNasInstancesResponse.NasInstances["+ i +"].ZoneId"));
			nasInstance.setProtocolType(_ctx.stringValue("DescribeNasInstancesResponse.NasInstances["+ i +"].ProtocolType"));
			nasInstance.setStorageType(_ctx.stringValue("DescribeNasInstancesResponse.NasInstances["+ i +"].StorageType"));
			nasInstance.setStatus(_ctx.stringValue("DescribeNasInstancesResponse.NasInstances["+ i +"].Status"));
			nasInstance.setMountTargetCount(_ctx.integerValue("DescribeNasInstancesResponse.NasInstances["+ i +"].MountTargetCount"));
			nasInstance.setMeteredSize(_ctx.longValue("DescribeNasInstancesResponse.NasInstances["+ i +"].MeteredSize"));
			nasInstance.setFileSystemDesc(_ctx.stringValue("DescribeNasInstancesResponse.NasInstances["+ i +"].FileSystemDesc"));

			nasInstances.add(nasInstance);
		}
		describeNasInstancesResponse.setNasInstances(nasInstances);
	 
	 	return describeNasInstancesResponse;
	}
}