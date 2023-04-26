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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.CreateVolumesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateVolumesResponseUnmarshaller {

	public static CreateVolumesResponse unmarshall(CreateVolumesResponse createVolumesResponse, UnmarshallerContext _ctx) {
		
		createVolumesResponse.setRequestId(_ctx.stringValue("CreateVolumesResponse.RequestId"));

		List<String> volumeIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateVolumesResponse.VolumeIds.Length"); i++) {
			volumeIds.add(_ctx.stringValue("CreateVolumesResponse.VolumeIds["+ i +"]"));
		}
		createVolumesResponse.setVolumeIds(volumeIds);
	 
	 	return createVolumesResponse;
	}
}