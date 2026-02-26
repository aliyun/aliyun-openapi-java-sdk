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

import com.aliyuncs.ens.model.v20171110.DescribeMountTargetsResponse;
import com.aliyuncs.ens.model.v20171110.DescribeMountTargetsResponse.MountTargetsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMountTargetsResponseUnmarshaller {

	public static DescribeMountTargetsResponse unmarshall(DescribeMountTargetsResponse describeMountTargetsResponse, UnmarshallerContext _ctx) {
		
		describeMountTargetsResponse.setRequestId(_ctx.stringValue("DescribeMountTargetsResponse.RequestId"));
		describeMountTargetsResponse.setPageNumber(_ctx.integerValue("DescribeMountTargetsResponse.PageNumber"));
		describeMountTargetsResponse.setPageSize(_ctx.integerValue("DescribeMountTargetsResponse.PageSize"));
		describeMountTargetsResponse.setTotalCount(_ctx.integerValue("DescribeMountTargetsResponse.TotalCount"));

		List<MountTargetsItem> mountTargets = new ArrayList<MountTargetsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMountTargetsResponse.MountTargets.Length"); i++) {
			MountTargetsItem mountTargetsItem = new MountTargetsItem();
			mountTargetsItem.setMountTargetDomain(_ctx.stringValue("DescribeMountTargetsResponse.MountTargets["+ i +"].MountTargetDomain"));
			mountTargetsItem.setMountTargetName(_ctx.stringValue("DescribeMountTargetsResponse.MountTargets["+ i +"].MountTargetName"));
			mountTargetsItem.setNetWorkId(_ctx.stringValue("DescribeMountTargetsResponse.MountTargets["+ i +"].NetWorkId"));
			mountTargetsItem.setStatus(_ctx.stringValue("DescribeMountTargetsResponse.MountTargets["+ i +"].Status"));
			mountTargetsItem.setEnsRegionId(_ctx.stringValue("DescribeMountTargetsResponse.MountTargets["+ i +"].EnsRegionId"));
			mountTargetsItem.setFileSystemId(_ctx.stringValue("DescribeMountTargetsResponse.MountTargets["+ i +"].FileSystemId"));

			mountTargets.add(mountTargetsItem);
		}
		describeMountTargetsResponse.setMountTargets(mountTargets);
	 
	 	return describeMountTargetsResponse;
	}
}