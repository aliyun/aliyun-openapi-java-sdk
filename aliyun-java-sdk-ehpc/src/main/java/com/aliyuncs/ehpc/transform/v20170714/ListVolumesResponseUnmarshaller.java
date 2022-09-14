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

package com.aliyuncs.ehpc.transform.v20170714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20170714.ListVolumesResponse;
import com.aliyuncs.ehpc.model.v20170714.ListVolumesResponse.VolumeInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVolumesResponseUnmarshaller {

	public static ListVolumesResponse unmarshall(ListVolumesResponse listVolumesResponse, UnmarshallerContext _ctx) {
		
		listVolumesResponse.setRequestId(_ctx.stringValue("ListVolumesResponse.RequestId"));
		listVolumesResponse.setPageSize(_ctx.integerValue("ListVolumesResponse.PageSize"));
		listVolumesResponse.setPageNumber(_ctx.integerValue("ListVolumesResponse.PageNumber"));
		listVolumesResponse.setTotalCount(_ctx.integerValue("ListVolumesResponse.TotalCount"));

		List<VolumeInfo> volumes = new ArrayList<VolumeInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListVolumesResponse.Volumes.Length"); i++) {
			VolumeInfo volumeInfo = new VolumeInfo();
			volumeInfo.setVolumeId(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].VolumeId"));
			volumeInfo.setClusterName(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].ClusterName"));
			volumeInfo.setRemoteDirectory(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].RemoteDirectory"));
			volumeInfo.setVolumeMountpoint(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].VolumeMountpoint"));
			volumeInfo.setVolumeType(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].VolumeType"));
			volumeInfo.setVolumeProtocol(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].VolumeProtocol"));
			volumeInfo.setRegionId(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].RegionId"));
			volumeInfo.setClusterId(_ctx.stringValue("ListVolumesResponse.Volumes["+ i +"].ClusterId"));

			volumes.add(volumeInfo);
		}
		listVolumesResponse.setVolumes(volumes);
	 
	 	return listVolumesResponse;
	}
}