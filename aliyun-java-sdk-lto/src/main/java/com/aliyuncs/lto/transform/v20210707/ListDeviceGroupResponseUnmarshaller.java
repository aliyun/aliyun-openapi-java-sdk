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

import com.aliyuncs.lto.model.v20210707.ListDeviceGroupResponse;
import com.aliyuncs.lto.model.v20210707.ListDeviceGroupResponse.Data;
import com.aliyuncs.lto.model.v20210707.ListDeviceGroupResponse.Data.MemberInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeviceGroupResponseUnmarshaller {

	public static ListDeviceGroupResponse unmarshall(ListDeviceGroupResponse listDeviceGroupResponse, UnmarshallerContext _ctx) {
		
		listDeviceGroupResponse.setRequestId(_ctx.stringValue("ListDeviceGroupResponse.RequestId"));
		listDeviceGroupResponse.setCode(_ctx.stringValue("ListDeviceGroupResponse.Code"));
		listDeviceGroupResponse.setHttpStatusCode(_ctx.integerValue("ListDeviceGroupResponse.HttpStatusCode"));
		listDeviceGroupResponse.setMessage(_ctx.stringValue("ListDeviceGroupResponse.Message"));
		listDeviceGroupResponse.setSuccess(_ctx.booleanValue("ListDeviceGroupResponse.Success"));

		Data data = new Data();
		data.setNum(_ctx.integerValue("ListDeviceGroupResponse.Data.Num"));
		data.setTotal(_ctx.integerValue("ListDeviceGroupResponse.Data.Total"));
		data.setSize(_ctx.integerValue("ListDeviceGroupResponse.Data.Size"));

		List<MemberInfo> pageData = new ArrayList<MemberInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListDeviceGroupResponse.Data.PageData.Length"); i++) {
			MemberInfo memberInfo = new MemberInfo();
			memberInfo.setStatus(_ctx.stringValue("ListDeviceGroupResponse.Data.PageData["+ i +"].Status"));
			memberInfo.setCurrentUser(_ctx.booleanValue("ListDeviceGroupResponse.Data.PageData["+ i +"].CurrentUser"));
			memberInfo.setDeviceGroupId(_ctx.stringValue("ListDeviceGroupResponse.Data.PageData["+ i +"].DeviceGroupId"));
			memberInfo.setProductKey(_ctx.stringValue("ListDeviceGroupResponse.Data.PageData["+ i +"].ProductKey"));
			memberInfo.setMemberName(_ctx.stringValue("ListDeviceGroupResponse.Data.PageData["+ i +"].MemberName"));
			memberInfo.setRemark(_ctx.stringValue("ListDeviceGroupResponse.Data.PageData["+ i +"].Remark"));
			memberInfo.setName(_ctx.stringValue("ListDeviceGroupResponse.Data.PageData["+ i +"].Name"));
			memberInfo.setDeviceCount(_ctx.longValue("ListDeviceGroupResponse.Data.PageData["+ i +"].DeviceCount"));
			memberInfo.setAuthorizedCount(_ctx.integerValue("ListDeviceGroupResponse.Data.PageData["+ i +"].AuthorizedCount"));

			pageData.add(memberInfo);
		}
		data.setPageData(pageData);
		listDeviceGroupResponse.setData(data);
	 
	 	return listDeviceGroupResponse;
	}
}