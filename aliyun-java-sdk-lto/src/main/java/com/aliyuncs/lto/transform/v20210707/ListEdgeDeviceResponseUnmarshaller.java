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

import com.aliyuncs.lto.model.v20210707.ListEdgeDeviceResponse;
import com.aliyuncs.lto.model.v20210707.ListEdgeDeviceResponse.Data;
import com.aliyuncs.lto.model.v20210707.ListEdgeDeviceResponse.Data.MemberInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEdgeDeviceResponseUnmarshaller {

	public static ListEdgeDeviceResponse unmarshall(ListEdgeDeviceResponse listEdgeDeviceResponse, UnmarshallerContext _ctx) {
		
		listEdgeDeviceResponse.setRequestId(_ctx.stringValue("ListEdgeDeviceResponse.RequestId"));
		listEdgeDeviceResponse.setCode(_ctx.stringValue("ListEdgeDeviceResponse.Code"));
		listEdgeDeviceResponse.setHttpStatusCode(_ctx.integerValue("ListEdgeDeviceResponse.HttpStatusCode"));
		listEdgeDeviceResponse.setMessage(_ctx.stringValue("ListEdgeDeviceResponse.Message"));
		listEdgeDeviceResponse.setSuccess(_ctx.booleanValue("ListEdgeDeviceResponse.Success"));

		Data data = new Data();
		data.setNum(_ctx.integerValue("ListEdgeDeviceResponse.Data.Num"));
		data.setTotal(_ctx.integerValue("ListEdgeDeviceResponse.Data.Total"));
		data.setSize(_ctx.integerValue("ListEdgeDeviceResponse.Data.Size"));

		List<MemberInfo> pageData = new ArrayList<MemberInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListEdgeDeviceResponse.Data.PageData.Length"); i++) {
			MemberInfo memberInfo = new MemberInfo();
			memberInfo.setStatus(_ctx.stringValue("ListEdgeDeviceResponse.Data.PageData["+ i +"].Status"));
			memberInfo.setLastOnchainTime(_ctx.stringValue("ListEdgeDeviceResponse.Data.PageData["+ i +"].LastOnchainTime"));
			memberInfo.setUsedOnchainCount(_ctx.longValue("ListEdgeDeviceResponse.Data.PageData["+ i +"].UsedOnchainCount"));
			memberInfo.setName(_ctx.stringValue("ListEdgeDeviceResponse.Data.PageData["+ i +"].Name"));
			memberInfo.setDeviceId(_ctx.stringValue("ListEdgeDeviceResponse.Data.PageData["+ i +"].DeviceId"));

			pageData.add(memberInfo);
		}
		data.setPageData(pageData);
		listEdgeDeviceResponse.setData(data);
	 
	 	return listEdgeDeviceResponse;
	}
}