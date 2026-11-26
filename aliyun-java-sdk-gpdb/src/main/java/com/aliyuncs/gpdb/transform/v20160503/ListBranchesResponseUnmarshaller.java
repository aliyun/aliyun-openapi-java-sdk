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

import com.aliyuncs.gpdb.model.v20160503.ListBranchesResponse;
import com.aliyuncs.gpdb.model.v20160503.ListBranchesResponse.Branch;
import com.aliyuncs.gpdb.model.v20160503.ListBranchesResponse.Branch.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBranchesResponseUnmarshaller {

	public static ListBranchesResponse unmarshall(ListBranchesResponse listBranchesResponse, UnmarshallerContext _ctx) {
		
		listBranchesResponse.setRequestId(_ctx.stringValue("ListBranchesResponse.RequestId"));
		listBranchesResponse.setTotalCount(_ctx.integerValue("ListBranchesResponse.TotalCount"));
		listBranchesResponse.setPageSize(_ctx.integerValue("ListBranchesResponse.PageSize"));
		listBranchesResponse.setNextToken(_ctx.stringValue("ListBranchesResponse.NextToken"));
		listBranchesResponse.setPageNumber(_ctx.integerValue("ListBranchesResponse.PageNumber"));
		listBranchesResponse.setMaxResults(_ctx.integerValue("ListBranchesResponse.MaxResults"));

		List<Branch> branches = new ArrayList<Branch>();
		for (int i = 0; i < _ctx.lengthValue("ListBranchesResponse.Branches.Length"); i++) {
			Branch branch = new Branch();
			branch.setIsDefault(_ctx.booleanValue("ListBranchesResponse.Branches["+ i +"].IsDefault"));
			branch.setStatus(_ctx.stringValue("ListBranchesResponse.Branches["+ i +"].Status"));
			branch.set_Protected(_ctx.booleanValue("ListBranchesResponse.Branches["+ i +"].Protected"));
			branch.setDescription(_ctx.stringValue("ListBranchesResponse.Branches["+ i +"].Description"));
			branch.setParentLSN(_ctx.stringValue("ListBranchesResponse.Branches["+ i +"].ParentLSN"));
			branch.setCreateTime(_ctx.stringValue("ListBranchesResponse.Branches["+ i +"].CreateTime"));
			branch.setProjectId(_ctx.stringValue("ListBranchesResponse.Branches["+ i +"].ProjectId"));
			branch.setBranchId(_ctx.stringValue("ListBranchesResponse.Branches["+ i +"].BranchId"));
			branch.setParentBranchName(_ctx.stringValue("ListBranchesResponse.Branches["+ i +"].ParentBranchName"));
			branch.setSpbProjectId(_ctx.stringValue("ListBranchesResponse.Branches["+ i +"].SpbProjectId"));
			branch.setParentBranchId(_ctx.stringValue("ListBranchesResponse.Branches["+ i +"].ParentBranchId"));
			branch.setServiceType(_ctx.stringValue("ListBranchesResponse.Branches["+ i +"].ServiceType"));
			branch.setInitSource(_ctx.stringValue("ListBranchesResponse.Branches["+ i +"].InitSource"));
			branch.setBranchName(_ctx.stringValue("ListBranchesResponse.Branches["+ i +"].BranchName"));
			branch.setExpiresAt(_ctx.stringValue("ListBranchesResponse.Branches["+ i +"].ExpiresAt"));
			branch.setParentTimestamp(_ctx.stringValue("ListBranchesResponse.Branches["+ i +"].ParentTimestamp"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListBranchesResponse.Branches["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setValue(_ctx.stringValue("ListBranchesResponse.Branches["+ i +"].Tags["+ j +"].Value"));
				tag.setKey(_ctx.stringValue("ListBranchesResponse.Branches["+ i +"].Tags["+ j +"].Key"));

				tags.add(tag);
			}
			branch.setTags(tags);

			branches.add(branch);
		}
		listBranchesResponse.setBranches(branches);
	 
	 	return listBranchesResponse;
	}
}