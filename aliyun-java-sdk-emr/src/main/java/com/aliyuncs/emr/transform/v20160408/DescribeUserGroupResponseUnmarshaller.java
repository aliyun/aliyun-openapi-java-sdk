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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.DescribeUserGroupResponse;
import com.aliyuncs.emr.model.v20160408.DescribeUserGroupResponse.RoleDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserGroupResponseUnmarshaller {

	public static DescribeUserGroupResponse unmarshall(DescribeUserGroupResponse describeUserGroupResponse, UnmarshallerContext _ctx) {
		
		describeUserGroupResponse.setRequestId(_ctx.stringValue("DescribeUserGroupResponse.RequestId"));
		describeUserGroupResponse.setPaging(_ctx.booleanValue("DescribeUserGroupResponse.Paging"));
		describeUserGroupResponse.setId(_ctx.longValue("DescribeUserGroupResponse.Id"));
		describeUserGroupResponse.setType(_ctx.stringValue("DescribeUserGroupResponse.Type"));
		describeUserGroupResponse.setName(_ctx.stringValue("DescribeUserGroupResponse.Name"));
		describeUserGroupResponse.setGmtCreate(_ctx.stringValue("DescribeUserGroupResponse.GmtCreate"));

		List<RoleDTO> roleDTOList = new ArrayList<RoleDTO>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserGroupResponse.RoleDTOList.Length"); i++) {
			RoleDTO roleDTO = new RoleDTO();
			roleDTO.setId(_ctx.longValue("DescribeUserGroupResponse.RoleDTOList["+ i +"].Id"));
			roleDTO.setName(_ctx.stringValue("DescribeUserGroupResponse.RoleDTOList["+ i +"].Name"));
			roleDTO.setResourceType(_ctx.stringValue("DescribeUserGroupResponse.RoleDTOList["+ i +"].ResourceType"));
			roleDTO.setGmtCreate(_ctx.stringValue("DescribeUserGroupResponse.RoleDTOList["+ i +"].GmtCreate"));
			roleDTO.setGmtModified(_ctx.stringValue("DescribeUserGroupResponse.RoleDTOList["+ i +"].GmtModified"));
			roleDTO.setDescription(_ctx.stringValue("DescribeUserGroupResponse.RoleDTOList["+ i +"].Description"));

			roleDTOList.add(roleDTO);
		}
		describeUserGroupResponse.setRoleDTOList(roleDTOList);
	 
	 	return describeUserGroupResponse;
	}
}