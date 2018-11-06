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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeEmgVulGroupResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeEmgVulGroupResponse.EmgVulGroup;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEmgVulGroupResponseUnmarshaller {

	public static DescribeEmgVulGroupResponse unmarshall(DescribeEmgVulGroupResponse describeEmgVulGroupResponse, UnmarshallerContext context) {
		
		describeEmgVulGroupResponse.setRequestId(context.stringValue("DescribeEmgVulGroupResponse.RequestId"));
		describeEmgVulGroupResponse.setTotalCount(context.integerValue("DescribeEmgVulGroupResponse.TotalCount"));

		List<EmgVulGroup> emgVulGroupList = new ArrayList<EmgVulGroup>();
		for (int i = 0; i < context.lengthValue("DescribeEmgVulGroupResponse.EmgVulGroupList.Length"); i++) {
			EmgVulGroup emgVulGroup = new EmgVulGroup();
			emgVulGroup.setAliasName(context.stringValue("DescribeEmgVulGroupResponse.EmgVulGroupList["+ i +"].AliasName"));
			emgVulGroup.setPendingCount(context.integerValue("DescribeEmgVulGroupResponse.EmgVulGroupList["+ i +"].PendingCount"));
			emgVulGroup.setName(context.stringValue("DescribeEmgVulGroupResponse.EmgVulGroupList["+ i +"].Name"));
			emgVulGroup.setGmtPublish(context.longValue("DescribeEmgVulGroupResponse.EmgVulGroupList["+ i +"].GmtPublish"));
			emgVulGroup.setDescription(context.stringValue("DescribeEmgVulGroupResponse.EmgVulGroupList["+ i +"].Description"));
			emgVulGroup.setType(context.stringValue("DescribeEmgVulGroupResponse.EmgVulGroupList["+ i +"].Type"));
			emgVulGroup.setStatus(context.integerValue("DescribeEmgVulGroupResponse.EmgVulGroupList["+ i +"].Status"));

			emgVulGroupList.add(emgVulGroup);
		}
		describeEmgVulGroupResponse.setEmgVulGroupList(emgVulGroupList);
	 
	 	return describeEmgVulGroupResponse;
	}
}