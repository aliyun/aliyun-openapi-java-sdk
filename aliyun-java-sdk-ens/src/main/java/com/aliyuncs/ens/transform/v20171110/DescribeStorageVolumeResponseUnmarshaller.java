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

import com.aliyuncs.ens.model.v20171110.DescribeStorageVolumeResponse;
import com.aliyuncs.ens.model.v20171110.DescribeStorageVolumeResponse.StorageVolumesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStorageVolumeResponseUnmarshaller {

	public static DescribeStorageVolumeResponse unmarshall(DescribeStorageVolumeResponse describeStorageVolumeResponse, UnmarshallerContext _ctx) {
		
		describeStorageVolumeResponse.setRequestId(_ctx.stringValue("DescribeStorageVolumeResponse.RequestId"));
		describeStorageVolumeResponse.setPageNumber(_ctx.stringValue("DescribeStorageVolumeResponse.PageNumber"));
		describeStorageVolumeResponse.setPageSize(_ctx.stringValue("DescribeStorageVolumeResponse.PageSize"));
		describeStorageVolumeResponse.setTotalCount(_ctx.stringValue("DescribeStorageVolumeResponse.TotalCount"));

		List<StorageVolumesItem> storageVolumes = new ArrayList<StorageVolumesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStorageVolumeResponse.StorageVolumes.Length"); i++) {
			StorageVolumesItem storageVolumesItem = new StorageVolumesItem();
			storageVolumesItem.setStorageVolumeId(_ctx.stringValue("DescribeStorageVolumeResponse.StorageVolumes["+ i +"].StorageVolumeId"));
			storageVolumesItem.setStorageVolumeName(_ctx.stringValue("DescribeStorageVolumeResponse.StorageVolumes["+ i +"].StorageVolumeName"));
			storageVolumesItem.setStorageGatewayId(_ctx.stringValue("DescribeStorageVolumeResponse.StorageVolumes["+ i +"].StorageGatewayId"));
			storageVolumesItem.setStorageId(_ctx.stringValue("DescribeStorageVolumeResponse.StorageVolumes["+ i +"].StorageId"));
			storageVolumesItem.setCreationTime(_ctx.stringValue("DescribeStorageVolumeResponse.StorageVolumes["+ i +"].CreationTime"));
			storageVolumesItem.setIsEnable(_ctx.integerValue("DescribeStorageVolumeResponse.StorageVolumes["+ i +"].IsEnable"));
			storageVolumesItem.setIsAuth(_ctx.integerValue("DescribeStorageVolumeResponse.StorageVolumes["+ i +"].IsAuth"));
			storageVolumesItem.setDescription(_ctx.stringValue("DescribeStorageVolumeResponse.StorageVolumes["+ i +"].Description"));
			storageVolumesItem.setTargetName(_ctx.stringValue("DescribeStorageVolumeResponse.StorageVolumes["+ i +"].TargetName"));
			storageVolumesItem.setStatus(_ctx.stringValue("DescribeStorageVolumeResponse.StorageVolumes["+ i +"].Status"));
			storageVolumesItem.setAuthProtocol(_ctx.stringValue("DescribeStorageVolumeResponse.StorageVolumes["+ i +"].AuthProtocol"));
			storageVolumesItem.setEnsRegionId(_ctx.stringValue("DescribeStorageVolumeResponse.StorageVolumes["+ i +"].EnsRegionId"));

			storageVolumes.add(storageVolumesItem);
		}
		describeStorageVolumeResponse.setStorageVolumes(storageVolumes);
	 
	 	return describeStorageVolumeResponse;
	}
}