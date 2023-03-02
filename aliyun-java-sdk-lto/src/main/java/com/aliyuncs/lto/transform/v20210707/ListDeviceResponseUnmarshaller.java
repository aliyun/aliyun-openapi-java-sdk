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

import com.aliyuncs.lto.model.v20210707.ListDeviceResponse;
import com.aliyuncs.lto.model.v20210707.ListDeviceResponse.Data;
import com.aliyuncs.lto.model.v20210707.ListDeviceResponse.Data.MemberInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeviceResponseUnmarshaller {

	public static ListDeviceResponse unmarshall(ListDeviceResponse listDeviceResponse, UnmarshallerContext _ctx) {
		
		listDeviceResponse.setRequestId(_ctx.stringValue("ListDeviceResponse.RequestId"));
		listDeviceResponse.setCode(_ctx.stringValue("ListDeviceResponse.Code"));
		listDeviceResponse.setHttpStatusCode(_ctx.integerValue("ListDeviceResponse.HttpStatusCode"));
		listDeviceResponse.setMessage(_ctx.stringValue("ListDeviceResponse.Message"));
		listDeviceResponse.setSuccess(_ctx.booleanValue("ListDeviceResponse.Success"));

		Data data = new Data();
		data.setNum(_ctx.integerValue("ListDeviceResponse.Data.Num"));
		data.setTotal(_ctx.integerValue("ListDeviceResponse.Data.Total"));
		data.setSize(_ctx.integerValue("ListDeviceResponse.Data.Size"));

		List<MemberInfo> pageData = new ArrayList<MemberInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListDeviceResponse.Data.PageData.Length"); i++) {
			MemberInfo memberInfo = new MemberInfo();
			memberInfo.setStatus(_ctx.stringValue("ListDeviceResponse.Data.PageData["+ i +"].Status"));
			memberInfo.setLastOnchainTime(_ctx.stringValue("ListDeviceResponse.Data.PageData["+ i +"].LastOnchainTime"));
			memberInfo.setUsedOnchainCount(_ctx.longValue("ListDeviceResponse.Data.PageData["+ i +"].UsedOnchainCount"));
			memberInfo.setName(_ctx.stringValue("ListDeviceResponse.Data.PageData["+ i +"].Name"));
			memberInfo.setDeviceId(_ctx.stringValue("ListDeviceResponse.Data.PageData["+ i +"].DeviceId"));

			pageData.add(memberInfo);
		}
		data.setPageData(pageData);
		listDeviceResponse.setData(data);
	 
	 	return listDeviceResponse;
	}
}