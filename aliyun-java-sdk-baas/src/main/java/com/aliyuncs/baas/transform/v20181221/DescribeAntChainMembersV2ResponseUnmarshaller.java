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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainMembersV2Response;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainMembersV2Response.Result;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainMembersV2Response.Result.MembersItem;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainMembersV2Response.Result.Pagination;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainMembersV2ResponseUnmarshaller {

	public static DescribeAntChainMembersV2Response unmarshall(DescribeAntChainMembersV2Response describeAntChainMembersV2Response, UnmarshallerContext _ctx) {
		
		describeAntChainMembersV2Response.setRequestId(_ctx.stringValue("DescribeAntChainMembersV2Response.RequestId"));
		describeAntChainMembersV2Response.setResultCode(_ctx.stringValue("DescribeAntChainMembersV2Response.ResultCode"));
		describeAntChainMembersV2Response.setResultMessage(_ctx.stringValue("DescribeAntChainMembersV2Response.ResultMessage"));
		describeAntChainMembersV2Response.setSuccess(_ctx.booleanValue("DescribeAntChainMembersV2Response.Success"));
		describeAntChainMembersV2Response.setHttpStatusCode(_ctx.stringValue("DescribeAntChainMembersV2Response.HttpStatusCode"));
		describeAntChainMembersV2Response.setCode(_ctx.stringValue("DescribeAntChainMembersV2Response.Code"));
		describeAntChainMembersV2Response.setMessage(_ctx.stringValue("DescribeAntChainMembersV2Response.Message"));

		Result result = new Result();

		Pagination pagination = new Pagination();
		pagination.setPageSize(_ctx.integerValue("DescribeAntChainMembersV2Response.Result.Pagination.PageSize"));
		pagination.setPageNumber(_ctx.integerValue("DescribeAntChainMembersV2Response.Result.Pagination.PageNumber"));
		pagination.setTotalCount(_ctx.integerValue("DescribeAntChainMembersV2Response.Result.Pagination.TotalCount"));
		result.setPagination(pagination);

		List<MembersItem> members = new ArrayList<MembersItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainMembersV2Response.Result.Members.Length"); i++) {
			MembersItem membersItem = new MembersItem();
			membersItem.setMemberName(_ctx.stringValue("DescribeAntChainMembersV2Response.Result.Members["+ i +"].MemberName"));
			membersItem.setMemberId(_ctx.stringValue("DescribeAntChainMembersV2Response.Result.Members["+ i +"].MemberId"));
			membersItem.setJoinTime(_ctx.longValue("DescribeAntChainMembersV2Response.Result.Members["+ i +"].JoinTime"));
			membersItem.setRole(_ctx.stringValue("DescribeAntChainMembersV2Response.Result.Members["+ i +"].Role"));
			membersItem.setStatus(_ctx.stringValue("DescribeAntChainMembersV2Response.Result.Members["+ i +"].Status"));

			members.add(membersItem);
		}
		result.setMembers(members);
		describeAntChainMembersV2Response.setResult(result);
	 
	 	return describeAntChainMembersV2Response;
	}
}