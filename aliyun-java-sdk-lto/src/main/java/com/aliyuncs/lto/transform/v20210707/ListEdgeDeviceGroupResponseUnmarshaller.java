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

package com.aliyuncs.lto.transform.v20210707;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lto.model.v20210707.ListEdgeDeviceGroupResponse;
import com.aliyuncs.lto.model.v20210707.ListEdgeDeviceGroupResponse.Data;
import com.aliyuncs.lto.model.v20210707.ListEdgeDeviceGroupResponse.Data.MemberInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEdgeDeviceGroupResponseUnmarshaller {

	public static ListEdgeDeviceGroupResponse unmarshall(ListEdgeDeviceGroupResponse listEdgeDeviceGroupResponse, UnmarshallerContext _ctx) {
		
		listEdgeDeviceGroupResponse.setRequestId(_ctx.stringValue("ListEdgeDeviceGroupResponse.RequestId"));
		listEdgeDeviceGroupResponse.setCode(_ctx.stringValue("ListEdgeDeviceGroupResponse.Code"));
		listEdgeDeviceGroupResponse.setHttpStatusCode(_ctx.integerValue("ListEdgeDeviceGroupResponse.HttpStatusCode"));
		listEdgeDeviceGroupResponse.setMessage(_ctx.stringValue("ListEdgeDeviceGroupResponse.Message"));
		listEdgeDeviceGroupResponse.setSuccess(_ctx.booleanValue("ListEdgeDeviceGroupResponse.Success"));

		Data data = new Data();
		data.setNum(_ctx.integerValue("ListEdgeDeviceGroupResponse.Data.Num"));
		data.setTotal(_ctx.integerValue("ListEdgeDeviceGroupResponse.Data.Total"));
		data.setSize(_ctx.integerValue("ListEdgeDeviceGroupResponse.Data.Size"));

		List<MemberInfo> pageData = new ArrayList<MemberInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListEdgeDeviceGroupResponse.Data.PageData.Length"); i++) {
			MemberInfo memberInfo = new MemberInfo();
			memberInfo.setStatus(_ctx.stringValue("ListEdgeDeviceGroupResponse.Data.PageData["+ i +"].Status"));
			memberInfo.setCurrentUser(_ctx.booleanValue("ListEdgeDeviceGroupResponse.Data.PageData["+ i +"].CurrentUser"));
			memberInfo.setDeviceGroupId(_ctx.stringValue("ListEdgeDeviceGroupResponse.Data.PageData["+ i +"].DeviceGroupId"));
			memberInfo.setProductKey(_ctx.stringValue("ListEdgeDeviceGroupResponse.Data.PageData["+ i +"].ProductKey"));
			memberInfo.setMemberName(_ctx.stringValue("ListEdgeDeviceGroupResponse.Data.PageData["+ i +"].MemberName"));
			memberInfo.setRemark(_ctx.stringValue("ListEdgeDeviceGroupResponse.Data.PageData["+ i +"].Remark"));
			memberInfo.setName(_ctx.stringValue("ListEdgeDeviceGroupResponse.Data.PageData["+ i +"].Name"));
			memberInfo.setDeviceCount(_ctx.longValue("ListEdgeDeviceGroupResponse.Data.PageData["+ i +"].DeviceCount"));
			memberInfo.setAuthorizedCount(_ctx.integerValue("ListEdgeDeviceGroupResponse.Data.PageData["+ i +"].AuthorizedCount"));
			memberInfo.setEdgeName(_ctx.stringValue("ListEdgeDeviceGroupResponse.Data.PageData["+ i +"].EdgeName"));

			pageData.add(memberInfo);
		}
		data.setPageData(pageData);
		listEdgeDeviceGroupResponse.setData(data);
	 
	 	return listEdgeDeviceGroupResponse;
	}
}