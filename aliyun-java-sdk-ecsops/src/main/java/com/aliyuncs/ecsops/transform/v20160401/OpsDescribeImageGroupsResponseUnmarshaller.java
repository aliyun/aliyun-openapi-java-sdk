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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeImageGroupsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeImageGroupsResponse.ImageGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeImageGroupsResponseUnmarshaller {

	public static OpsDescribeImageGroupsResponse unmarshall(OpsDescribeImageGroupsResponse opsDescribeImageGroupsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeImageGroupsResponse.setRequestId(_ctx.stringValue("OpsDescribeImageGroupsResponse.RequestId"));
		opsDescribeImageGroupsResponse.setTotalCount(_ctx.integerValue("OpsDescribeImageGroupsResponse.TotalCount"));
		opsDescribeImageGroupsResponse.setPageSize(_ctx.integerValue("OpsDescribeImageGroupsResponse.PageSize"));
		opsDescribeImageGroupsResponse.setPageNumber(_ctx.integerValue("OpsDescribeImageGroupsResponse.PageNumber"));

		List<ImageGroup> imageGroups = new ArrayList<ImageGroup>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeImageGroupsResponse.ImageGroups.Length"); i++) {
			ImageGroup imageGroup = new ImageGroup();
			imageGroup.setCreationTime(_ctx.stringValue("OpsDescribeImageGroupsResponse.ImageGroups["+ i +"].CreationTime"));
			imageGroup.setPublishState(_ctx.stringValue("OpsDescribeImageGroupsResponse.ImageGroups["+ i +"].PublishState"));
			imageGroup.setImageGroup(_ctx.stringValue("OpsDescribeImageGroupsResponse.ImageGroups["+ i +"].ImageGroup"));
			imageGroup.setPublishTag(_ctx.stringValue("OpsDescribeImageGroupsResponse.ImageGroups["+ i +"].PublishTag"));
			imageGroup.setModifyTime(_ctx.stringValue("OpsDescribeImageGroupsResponse.ImageGroups["+ i +"].ModifyTime"));

			imageGroups.add(imageGroup);
		}
		opsDescribeImageGroupsResponse.setImageGroups(imageGroups);
	 
	 	return opsDescribeImageGroupsResponse;
	}
}