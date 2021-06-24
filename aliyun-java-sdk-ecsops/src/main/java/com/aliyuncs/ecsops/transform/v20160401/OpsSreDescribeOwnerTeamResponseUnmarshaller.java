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

import com.aliyuncs.ecsops.model.v20160401.OpsSreDescribeOwnerTeamResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsSreDescribeOwnerTeamResponse.OwnerTeams;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsSreDescribeOwnerTeamResponseUnmarshaller {

	public static OpsSreDescribeOwnerTeamResponse unmarshall(OpsSreDescribeOwnerTeamResponse opsSreDescribeOwnerTeamResponse, UnmarshallerContext _ctx) {
		
		opsSreDescribeOwnerTeamResponse.setRequestId(_ctx.stringValue("OpsSreDescribeOwnerTeamResponse.RequestId"));
		opsSreDescribeOwnerTeamResponse.setMessage(_ctx.stringValue("OpsSreDescribeOwnerTeamResponse.Message"));
		opsSreDescribeOwnerTeamResponse.setPageSize(_ctx.integerValue("OpsSreDescribeOwnerTeamResponse.PageSize"));
		opsSreDescribeOwnerTeamResponse.setTotal(_ctx.integerValue("OpsSreDescribeOwnerTeamResponse.Total"));
		opsSreDescribeOwnerTeamResponse.setPageNo(_ctx.integerValue("OpsSreDescribeOwnerTeamResponse.PageNo"));
		opsSreDescribeOwnerTeamResponse.setCode(_ctx.stringValue("OpsSreDescribeOwnerTeamResponse.Code"));
		opsSreDescribeOwnerTeamResponse.setSuccess(_ctx.stringValue("OpsSreDescribeOwnerTeamResponse.Success"));

		List<OwnerTeams> data = new ArrayList<OwnerTeams>();
		for (int i = 0; i < _ctx.lengthValue("OpsSreDescribeOwnerTeamResponse.Data.Length"); i++) {
			OwnerTeams ownerTeams = new OwnerTeams();
			ownerTeams.setGmtCreate(_ctx.stringValue("OpsSreDescribeOwnerTeamResponse.Data["+ i +"].GmtCreate"));
			ownerTeams.setGmtModified(_ctx.stringValue("OpsSreDescribeOwnerTeamResponse.Data["+ i +"].GmtModified"));
			ownerTeams.setId(_ctx.longValue("OpsSreDescribeOwnerTeamResponse.Data["+ i +"].Id"));
			ownerTeams.setOwnerTeamTagName(_ctx.stringValue("OpsSreDescribeOwnerTeamResponse.Data["+ i +"].OwnerTeamTagName"));
			ownerTeams.setOwnerTeam(_ctx.stringValue("OpsSreDescribeOwnerTeamResponse.Data["+ i +"].OwnerTeam"));

			data.add(ownerTeams);
		}
		opsSreDescribeOwnerTeamResponse.setData(data);
	 
	 	return opsSreDescribeOwnerTeamResponse;
	}
}