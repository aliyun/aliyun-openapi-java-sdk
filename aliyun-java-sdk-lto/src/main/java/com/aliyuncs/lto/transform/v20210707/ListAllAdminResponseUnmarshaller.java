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

import com.aliyuncs.lto.model.v20210707.ListAllAdminResponse;
import com.aliyuncs.lto.model.v20210707.ListAllAdminResponse.AdminInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAllAdminResponseUnmarshaller {

	public static ListAllAdminResponse unmarshall(ListAllAdminResponse listAllAdminResponse, UnmarshallerContext _ctx) {
		
		listAllAdminResponse.setRequestId(_ctx.stringValue("ListAllAdminResponse.RequestId"));
		listAllAdminResponse.setCode(_ctx.stringValue("ListAllAdminResponse.Code"));
		listAllAdminResponse.setHttpStatusCode(_ctx.integerValue("ListAllAdminResponse.HttpStatusCode"));
		listAllAdminResponse.setMessage(_ctx.stringValue("ListAllAdminResponse.Message"));
		listAllAdminResponse.setSuccess(_ctx.booleanValue("ListAllAdminResponse.Success"));

		List<AdminInfo> data = new ArrayList<AdminInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListAllAdminResponse.Data.Length"); i++) {
			AdminInfo adminInfo = new AdminInfo();
			adminInfo.setName(_ctx.stringValue("ListAllAdminResponse.Data["+ i +"].Name"));
			adminInfo.setAdminId(_ctx.stringValue("ListAllAdminResponse.Data["+ i +"].AdminId"));

			data.add(adminInfo);
		}
		listAllAdminResponse.setData(data);
	 
	 	return listAllAdminResponse;
	}
}