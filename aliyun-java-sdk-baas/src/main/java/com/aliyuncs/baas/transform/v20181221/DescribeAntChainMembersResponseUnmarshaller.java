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

package com.aliyuncs.baas.transform.v20181221;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20181221.DescribeAntChainMembersResponse;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainMembersResponse.Result;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainMembersResponse.Result.MembersItem;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainMembersResponse.Result.Pagination;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainMembersResponseUnmarshaller {

	public static DescribeAntChainMembersResponse unmarshall(DescribeAntChainMembersResponse describeAntChainMembersResponse, UnmarshallerContext _ctx) {
		
		describeAntChainMembersResponse.setRequestId(_ctx.stringValue("DescribeAntChainMembersResponse.RequestId"));

		Result result = new Result();

		Pagination pagination = new Pagination();
		pagination.setPageSize(_ctx.integerValue("DescribeAntChainMembersResponse.Result.Pagination.PageSize"));
		pagination.setPageNumber(_ctx.integerValue("DescribeAntChainMembersResponse.Result.Pagination.PageNumber"));
		pagination.setTotalCount(_ctx.integerValue("DescribeAntChainMembersResponse.Result.Pagination.TotalCount"));
		result.setPagination(pagination);

		List<MembersItem> members = new ArrayList<MembersItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainMembersResponse.Result.Members.Length"); i++) {
			MembersItem membersItem = new MembersItem();
			membersItem.setMemberName(_ctx.stringValue("DescribeAntChainMembersResponse.Result.Members["+ i +"].MemberName"));
			membersItem.setMemberId(_ctx.stringValue("DescribeAntChainMembersResponse.Result.Members["+ i +"].MemberId"));
			membersItem.setJoinTime(_ctx.longValue("DescribeAntChainMembersResponse.Result.Members["+ i +"].JoinTime"));
			membersItem.setRole(_ctx.stringValue("DescribeAntChainMembersResponse.Result.Members["+ i +"].Role"));
			membersItem.setStatus(_ctx.stringValue("DescribeAntChainMembersResponse.Result.Members["+ i +"].Status"));

			members.add(membersItem);
		}
		result.setMembers(members);
		describeAntChainMembersResponse.setResult(result);
	 
	 	return describeAntChainMembersResponse;
	}
}