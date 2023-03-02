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

import com.aliyuncs.lto.model.v20210707.ListBaaSFabricChannelResponse;
import com.aliyuncs.lto.model.v20210707.ListBaaSFabricChannelResponse.BaaSFabricChannelInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBaaSFabricChannelResponseUnmarshaller {

	public static ListBaaSFabricChannelResponse unmarshall(ListBaaSFabricChannelResponse listBaaSFabricChannelResponse, UnmarshallerContext _ctx) {
		
		listBaaSFabricChannelResponse.setRequestId(_ctx.stringValue("ListBaaSFabricChannelResponse.RequestId"));
		listBaaSFabricChannelResponse.setCode(_ctx.stringValue("ListBaaSFabricChannelResponse.Code"));
		listBaaSFabricChannelResponse.setHttpStatusCode(_ctx.integerValue("ListBaaSFabricChannelResponse.HttpStatusCode"));
		listBaaSFabricChannelResponse.setMessage(_ctx.stringValue("ListBaaSFabricChannelResponse.Message"));
		listBaaSFabricChannelResponse.setSuccess(_ctx.booleanValue("ListBaaSFabricChannelResponse.Success"));

		List<BaaSFabricChannelInfo> data = new ArrayList<BaaSFabricChannelInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListBaaSFabricChannelResponse.Data.Length"); i++) {
			BaaSFabricChannelInfo baaSFabricChannelInfo = new BaaSFabricChannelInfo();
			baaSFabricChannelInfo.setBaaSFabricChannelName(_ctx.stringValue("ListBaaSFabricChannelResponse.Data["+ i +"].BaaSFabricChannelName"));
			baaSFabricChannelInfo.setBaaSFabricChannelId(_ctx.stringValue("ListBaaSFabricChannelResponse.Data["+ i +"].BaaSFabricChannelId"));

			data.add(baaSFabricChannelInfo);
		}
		listBaaSFabricChannelResponse.setData(data);
	 
	 	return listBaaSFabricChannelResponse;
	}
}