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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeChangeMemberResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeChangeMemberResponse.ChangeMembers;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeChangeMemberResponseUnmarshaller {

	public static OpsDescribeChangeMemberResponse unmarshall(OpsDescribeChangeMemberResponse opsDescribeChangeMemberResponse, UnmarshallerContext _ctx) {
		
		opsDescribeChangeMemberResponse.setRequestId(_ctx.stringValue("OpsDescribeChangeMemberResponse.RequestId"));
		opsDescribeChangeMemberResponse.setCode(_ctx.stringValue("OpsDescribeChangeMemberResponse.Code"));
		opsDescribeChangeMemberResponse.setMessage(_ctx.stringValue("OpsDescribeChangeMemberResponse.Message"));
		opsDescribeChangeMemberResponse.setSuccess(_ctx.stringValue("OpsDescribeChangeMemberResponse.Success"));
		opsDescribeChangeMemberResponse.setTotalCount(_ctx.integerValue("OpsDescribeChangeMemberResponse.TotalCount"));
		opsDescribeChangeMemberResponse.setPageNumber(_ctx.integerValue("OpsDescribeChangeMemberResponse.PageNumber"));
		opsDescribeChangeMemberResponse.setPageSize(_ctx.integerValue("OpsDescribeChangeMemberResponse.PageSize"));

		List<ChangeMembers> data = new ArrayList<ChangeMembers>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeChangeMemberResponse.Data.Length"); i++) {
			ChangeMembers changeMembers = new ChangeMembers();
			changeMembers.setId(_ctx.longValue("OpsDescribeChangeMemberResponse.Data["+ i +"].Id"));
			changeMembers.setGmtCreate(_ctx.stringValue("OpsDescribeChangeMemberResponse.Data["+ i +"].GmtCreate"));
			changeMembers.setMemberNo(_ctx.stringValue("OpsDescribeChangeMemberResponse.Data["+ i +"].MemberNo"));
			changeMembers.setMemberName(_ctx.stringValue("OpsDescribeChangeMemberResponse.Data["+ i +"].MemberName"));

			data.add(changeMembers);
		}
		opsDescribeChangeMemberResponse.setData(data);
	 
	 	return opsDescribeChangeMemberResponse;
	}
}