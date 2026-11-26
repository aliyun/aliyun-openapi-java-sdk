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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeBranchResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeBranchResponse.Branch;
import com.aliyuncs.gpdb.model.v20160503.DescribeBranchResponse.Branch.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBranchResponseUnmarshaller {

	public static DescribeBranchResponse unmarshall(DescribeBranchResponse describeBranchResponse, UnmarshallerContext _ctx) {
		
		describeBranchResponse.setRequestId(_ctx.stringValue("DescribeBranchResponse.RequestId"));

		Branch branch = new Branch();
		branch.setIsDefault(_ctx.booleanValue("DescribeBranchResponse.Branch.IsDefault"));
		branch.setStatus(_ctx.stringValue("DescribeBranchResponse.Branch.Status"));
		branch.set_Protected(_ctx.booleanValue("DescribeBranchResponse.Branch.Protected"));
		branch.setDescription(_ctx.stringValue("DescribeBranchResponse.Branch.Description"));
		branch.setParentLSN(_ctx.stringValue("DescribeBranchResponse.Branch.ParentLSN"));
		branch.setCreateTime(_ctx.stringValue("DescribeBranchResponse.Branch.CreateTime"));
		branch.setProjectId(_ctx.stringValue("DescribeBranchResponse.Branch.ProjectId"));
		branch.setBranchId(_ctx.stringValue("DescribeBranchResponse.Branch.BranchId"));
		branch.setComputeEndpoint(_ctx.stringValue("DescribeBranchResponse.Branch.ComputeEndpoint"));
		branch.setParentBranchName(_ctx.stringValue("DescribeBranchResponse.Branch.ParentBranchName"));
		branch.setSpbProjectId(_ctx.stringValue("DescribeBranchResponse.Branch.SpbProjectId"));
		branch.setParentBranchId(_ctx.stringValue("DescribeBranchResponse.Branch.ParentBranchId"));
		branch.setServiceType(_ctx.stringValue("DescribeBranchResponse.Branch.ServiceType"));
		branch.setInitSource(_ctx.stringValue("DescribeBranchResponse.Branch.InitSource"));
		branch.setBranchName(_ctx.stringValue("DescribeBranchResponse.Branch.BranchName"));
		branch.setExpiresAt(_ctx.stringValue("DescribeBranchResponse.Branch.ExpiresAt"));
		branch.setParentTimestamp(_ctx.stringValue("DescribeBranchResponse.Branch.ParentTimestamp"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBranchResponse.Branch.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setValue(_ctx.stringValue("DescribeBranchResponse.Branch.Tags["+ i +"].Value"));
			tag.setKey(_ctx.stringValue("DescribeBranchResponse.Branch.Tags["+ i +"].Key"));

			tags.add(tag);
		}
		branch.setTags(tags);
		describeBranchResponse.setBranch(branch);
	 
	 	return describeBranchResponse;
	}
}