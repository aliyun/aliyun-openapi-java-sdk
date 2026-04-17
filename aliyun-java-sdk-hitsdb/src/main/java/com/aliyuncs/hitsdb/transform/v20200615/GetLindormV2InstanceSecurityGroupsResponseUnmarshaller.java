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

package com.aliyuncs.hitsdb.transform.v20200615;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2InstanceSecurityGroupsResponse;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2InstanceSecurityGroupsResponse.SgListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLindormV2InstanceSecurityGroupsResponseUnmarshaller {

	public static GetLindormV2InstanceSecurityGroupsResponse unmarshall(GetLindormV2InstanceSecurityGroupsResponse getLindormV2InstanceSecurityGroupsResponse, UnmarshallerContext _ctx) {
		
		getLindormV2InstanceSecurityGroupsResponse.setRequestId(_ctx.stringValue("GetLindormV2InstanceSecurityGroupsResponse.RequestId"));
		getLindormV2InstanceSecurityGroupsResponse.setInstanceId(_ctx.stringValue("GetLindormV2InstanceSecurityGroupsResponse.InstanceId"));
		getLindormV2InstanceSecurityGroupsResponse.setAccessDeniedDetail(_ctx.stringValue("GetLindormV2InstanceSecurityGroupsResponse.AccessDeniedDetail"));

		List<SgListItem> sgList = new ArrayList<SgListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLindormV2InstanceSecurityGroupsResponse.SgList.Length"); i++) {
			SgListItem sgListItem = new SgListItem();
			sgListItem.setIpList(_ctx.stringValue("GetLindormV2InstanceSecurityGroupsResponse.SgList["+ i +"].IpList"));
			sgListItem.setSecurityGroupId(_ctx.stringValue("GetLindormV2InstanceSecurityGroupsResponse.SgList["+ i +"].SecurityGroupId"));
			sgListItem.setIsAvailable(_ctx.booleanValue("GetLindormV2InstanceSecurityGroupsResponse.SgList["+ i +"].IsAvailable"));
			sgListItem.setGmtModified(_ctx.stringValue("GetLindormV2InstanceSecurityGroupsResponse.SgList["+ i +"].GmtModified"));

			sgList.add(sgListItem);
		}
		getLindormV2InstanceSecurityGroupsResponse.setSgList(sgList);
	 
	 	return getLindormV2InstanceSecurityGroupsResponse;
	}
}