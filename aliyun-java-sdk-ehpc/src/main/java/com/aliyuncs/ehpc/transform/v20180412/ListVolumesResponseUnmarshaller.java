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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ListVolumesResponse;
import com.aliyuncs.ehpc.model.v20180412.ListVolumesResponse.VolumeInfo;
import com.aliyuncs.ehpc.model.v20180412.ListVolumesResponse.VolumeInfo.VolumeInfo1;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVolumesResponseUnmarshaller {

	public static ListVolumesResponse unmarshall(ListVolumesResponse listVolumesResponse, UnmarshallerContext context) {
		
		listVolumesResponse.setRequestId(context.stringValue("ListVolumesResponse.RequestId"));
		listVolumesResponse.setTotalCount(context.integerValue("ListVolumesResponse.TotalCount"));
		listVolumesResponse.setPageNumber(context.integerValue("ListVolumesResponse.PageNumber"));
		listVolumesResponse.setPageSize(context.integerValue("ListVolumesResponse.PageSize"));

		List<VolumeInfo> volumes = new ArrayList<VolumeInfo>();
		for (int i = 0; i < context.lengthValue("ListVolumesResponse.Volumes.Length"); i++) {
			VolumeInfo volumeInfo = new VolumeInfo();
			volumeInfo.setRegionId(context.stringValue("ListVolumesResponse.Volumes["+ i +"].RegionId"));
			volumeInfo.setClusterId(context.stringValue("ListVolumesResponse.Volumes["+ i +"].ClusterId"));
			volumeInfo.setClusterName(context.stringValue("ListVolumesResponse.Volumes["+ i +"].ClusterName"));
			volumeInfo.setVolumeId(context.stringValue("ListVolumesResponse.Volumes["+ i +"].VolumeId"));
			volumeInfo.setVolumeType(context.stringValue("ListVolumesResponse.Volumes["+ i +"].VolumeType"));
			volumeInfo.setVolumeProtocol(context.stringValue("ListVolumesResponse.Volumes["+ i +"].VolumeProtocol"));
			volumeInfo.setVolumeMountpoint(context.stringValue("ListVolumesResponse.Volumes["+ i +"].VolumeMountpoint"));
			volumeInfo.setRemoteDirectory(context.stringValue("ListVolumesResponse.Volumes["+ i +"].RemoteDirectory"));

			List<VolumeInfo1> additionalVolumes = new ArrayList<VolumeInfo1>();
			for (int j = 0; j < context.lengthValue("ListVolumesResponse.Volumes["+ i +"].AdditionalVolumes.Length"); j++) {
				VolumeInfo1 volumeInfo1 = new VolumeInfo1();
				volumeInfo1.setVolumeType(context.stringValue("ListVolumesResponse.Volumes["+ i +"].AdditionalVolumes["+ j +"].VolumeType"));
				volumeInfo1.setVolumeId(context.stringValue("ListVolumesResponse.Volumes["+ i +"].AdditionalVolumes["+ j +"].VolumeId"));
				volumeInfo1.setVolumeProtocol(context.stringValue("ListVolumesResponse.Volumes["+ i +"].AdditionalVolumes["+ j +"].VolumeProtocol"));
				volumeInfo1.setVolumeMountpoint(context.stringValue("ListVolumesResponse.Volumes["+ i +"].AdditionalVolumes["+ j +"].VolumeMountpoint"));
				volumeInfo1.setRemoteDirectory(context.stringValue("ListVolumesResponse.Volumes["+ i +"].AdditionalVolumes["+ j +"].RemoteDirectory"));
				volumeInfo1.setLocalDirectory(context.stringValue("ListVolumesResponse.Volumes["+ i +"].AdditionalVolumes["+ j +"].LocalDirectory"));
				volumeInfo1.setRole(context.stringValue("ListVolumesResponse.Volumes["+ i +"].AdditionalVolumes["+ j +"].Role"));
				volumeInfo1.setLocation(context.stringValue("ListVolumesResponse.Volumes["+ i +"].AdditionalVolumes["+ j +"].Location"));
				volumeInfo1.setJobQueue(context.stringValue("ListVolumesResponse.Volumes["+ i +"].AdditionalVolumes["+ j +"].JobQueue"));

				additionalVolumes.add(volumeInfo1);
			}
			volumeInfo.setAdditionalVolumes(additionalVolumes);

			volumes.add(volumeInfo);
		}
		listVolumesResponse.setVolumes(volumes);
	 
	 	return listVolumesResponse;
	}
}