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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeMountTargetsResponse;
import com.aliyuncs.nas.model.v20170626.DescribeMountTargetsResponse.MountTarget;
import com.aliyuncs.nas.model.v20170626.DescribeMountTargetsResponse.MountTarget.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMountTargetsResponseUnmarshaller {

	public static DescribeMountTargetsResponse unmarshall(DescribeMountTargetsResponse describeMountTargetsResponse, UnmarshallerContext _ctx) {
		
		describeMountTargetsResponse.setRequestId(_ctx.stringValue("DescribeMountTargetsResponse.RequestId"));
		describeMountTargetsResponse.setTotalCount(_ctx.integerValue("DescribeMountTargetsResponse.TotalCount"));
		describeMountTargetsResponse.setPageSize(_ctx.integerValue("DescribeMountTargetsResponse.PageSize"));
		describeMountTargetsResponse.setPageNumber(_ctx.integerValue("DescribeMountTargetsResponse.PageNumber"));

		List<MountTarget> mountTargets = new ArrayList<MountTarget>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMountTargetsResponse.MountTargets.Length"); i++) {
			MountTarget mountTarget = new MountTarget();
			mountTarget.setMountTargetDomain(_ctx.stringValue("DescribeMountTargetsResponse.MountTargets["+ i +"].MountTargetDomain"));
			mountTarget.setNetworkType(_ctx.stringValue("DescribeMountTargetsResponse.MountTargets["+ i +"].NetworkType"));
			mountTarget.setVpcId(_ctx.stringValue("DescribeMountTargetsResponse.MountTargets["+ i +"].VpcId"));
			mountTarget.setVswId(_ctx.stringValue("DescribeMountTargetsResponse.MountTargets["+ i +"].VswId"));
			mountTarget.setAccessGroup(_ctx.stringValue("DescribeMountTargetsResponse.MountTargets["+ i +"].AccessGroup"));
			mountTarget.setStatus(_ctx.stringValue("DescribeMountTargetsResponse.MountTargets["+ i +"].Status"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMountTargetsResponse.MountTargets["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeMountTargetsResponse.MountTargets["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeMountTargetsResponse.MountTargets["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			mountTarget.setTags(tags);

			mountTargets.add(mountTarget);
		}
		describeMountTargetsResponse.setMountTargets(mountTargets);
	 
	 	return describeMountTargetsResponse;
	}
}