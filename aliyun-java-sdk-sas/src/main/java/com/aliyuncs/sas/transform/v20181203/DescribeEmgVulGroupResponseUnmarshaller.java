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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeEmgVulGroupResponse;
import com.aliyuncs.sas.model.v20181203.DescribeEmgVulGroupResponse.EmgVulGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEmgVulGroupResponseUnmarshaller {

	public static DescribeEmgVulGroupResponse unmarshall(DescribeEmgVulGroupResponse describeEmgVulGroupResponse, UnmarshallerContext _ctx) {
		
		describeEmgVulGroupResponse.setRequestId(_ctx.stringValue("DescribeEmgVulGroupResponse.RequestId"));
		describeEmgVulGroupResponse.setTotalCount(_ctx.integerValue("DescribeEmgVulGroupResponse.TotalCount"));

		List<EmgVulGroup> emgVulGroupList = new ArrayList<EmgVulGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEmgVulGroupResponse.EmgVulGroupList.Length"); i++) {
			EmgVulGroup emgVulGroup = new EmgVulGroup();
			emgVulGroup.setAliasName(_ctx.stringValue("DescribeEmgVulGroupResponse.EmgVulGroupList["+ i +"].AliasName"));
			emgVulGroup.setPendingCount(_ctx.integerValue("DescribeEmgVulGroupResponse.EmgVulGroupList["+ i +"].PendingCount"));
			emgVulGroup.setName(_ctx.stringValue("DescribeEmgVulGroupResponse.EmgVulGroupList["+ i +"].Name"));
			emgVulGroup.setGmtPublish(_ctx.longValue("DescribeEmgVulGroupResponse.EmgVulGroupList["+ i +"].GmtPublish"));
			emgVulGroup.setDescription(_ctx.stringValue("DescribeEmgVulGroupResponse.EmgVulGroupList["+ i +"].Description"));
			emgVulGroup.setType(_ctx.stringValue("DescribeEmgVulGroupResponse.EmgVulGroupList["+ i +"].Type"));
			emgVulGroup.setStatus(_ctx.integerValue("DescribeEmgVulGroupResponse.EmgVulGroupList["+ i +"].Status"));
			emgVulGroup.setProgress(_ctx.integerValue("DescribeEmgVulGroupResponse.EmgVulGroupList["+ i +"].Progress"));
			emgVulGroup.setGmtLastCheck(_ctx.longValue("DescribeEmgVulGroupResponse.EmgVulGroupList["+ i +"].GmtLastCheck"));

			emgVulGroupList.add(emgVulGroup);
		}
		describeEmgVulGroupResponse.setEmgVulGroupList(emgVulGroupList);
	 
	 	return describeEmgVulGroupResponse;
	}
}