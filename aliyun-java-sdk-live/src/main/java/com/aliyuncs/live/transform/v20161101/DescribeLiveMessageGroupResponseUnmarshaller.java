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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveMessageGroupResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveMessageGroupResponseUnmarshaller {

	public static DescribeLiveMessageGroupResponse unmarshall(DescribeLiveMessageGroupResponse describeLiveMessageGroupResponse, UnmarshallerContext _ctx) {
		
		describeLiveMessageGroupResponse.setRequestId(_ctx.stringValue("DescribeLiveMessageGroupResponse.RequestId"));
		describeLiveMessageGroupResponse.setGroupId(_ctx.stringValue("DescribeLiveMessageGroupResponse.GroupId"));
		describeLiveMessageGroupResponse.setCreatorId(_ctx.stringValue("DescribeLiveMessageGroupResponse.CreatorId"));
		describeLiveMessageGroupResponse.setCreatetime(_ctx.longValue("DescribeLiveMessageGroupResponse.Createtime"));
		describeLiveMessageGroupResponse.setGroupName(_ctx.stringValue("DescribeLiveMessageGroupResponse.GroupName"));
		describeLiveMessageGroupResponse.setGroupInfo(_ctx.stringValue("DescribeLiveMessageGroupResponse.GroupInfo"));
		describeLiveMessageGroupResponse.setDelete(_ctx.booleanValue("DescribeLiveMessageGroupResponse.Delete"));
		describeLiveMessageGroupResponse.setTotalTimes(_ctx.longValue("DescribeLiveMessageGroupResponse.TotalTimes"));
		describeLiveMessageGroupResponse.setOnlineUserCounts(_ctx.longValue("DescribeLiveMessageGroupResponse.OnlineUserCounts"));
		describeLiveMessageGroupResponse.setMsgAmount(_ctx.mapValue("DescribeLiveMessageGroupResponse.MsgAmount"));
		describeLiveMessageGroupResponse.setDeletatime(_ctx.longValue("DescribeLiveMessageGroupResponse.Deletatime"));
		describeLiveMessageGroupResponse.setDeletor(_ctx.stringValue("DescribeLiveMessageGroupResponse.Deletor"));

		List<String> adminList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveMessageGroupResponse.AdminList.Length"); i++) {
			adminList.add(_ctx.stringValue("DescribeLiveMessageGroupResponse.AdminList["+ i +"]"));
		}
		describeLiveMessageGroupResponse.setAdminList(adminList);
	 
	 	return describeLiveMessageGroupResponse;
	}
}