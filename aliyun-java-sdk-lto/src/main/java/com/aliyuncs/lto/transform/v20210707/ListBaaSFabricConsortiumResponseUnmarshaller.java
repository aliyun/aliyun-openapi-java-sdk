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

import com.aliyuncs.lto.model.v20210707.ListBaaSFabricConsortiumResponse;
import com.aliyuncs.lto.model.v20210707.ListBaaSFabricConsortiumResponse.BaaSFabricConsortiumInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBaaSFabricConsortiumResponseUnmarshaller {

	public static ListBaaSFabricConsortiumResponse unmarshall(ListBaaSFabricConsortiumResponse listBaaSFabricConsortiumResponse, UnmarshallerContext _ctx) {
		
		listBaaSFabricConsortiumResponse.setRequestId(_ctx.stringValue("ListBaaSFabricConsortiumResponse.RequestId"));
		listBaaSFabricConsortiumResponse.setCode(_ctx.stringValue("ListBaaSFabricConsortiumResponse.Code"));
		listBaaSFabricConsortiumResponse.setHttpStatusCode(_ctx.integerValue("ListBaaSFabricConsortiumResponse.HttpStatusCode"));
		listBaaSFabricConsortiumResponse.setMessage(_ctx.stringValue("ListBaaSFabricConsortiumResponse.Message"));
		listBaaSFabricConsortiumResponse.setSuccess(_ctx.booleanValue("ListBaaSFabricConsortiumResponse.Success"));

		List<BaaSFabricConsortiumInfo> data = new ArrayList<BaaSFabricConsortiumInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListBaaSFabricConsortiumResponse.Data.Length"); i++) {
			BaaSFabricConsortiumInfo baaSFabricConsortiumInfo = new BaaSFabricConsortiumInfo();
			baaSFabricConsortiumInfo.setBaaSFabricConsortiumId(_ctx.stringValue("ListBaaSFabricConsortiumResponse.Data["+ i +"].BaaSFabricConsortiumId"));
			baaSFabricConsortiumInfo.setBaaSFabricConsortiumName(_ctx.stringValue("ListBaaSFabricConsortiumResponse.Data["+ i +"].BaaSFabricConsortiumName"));

			data.add(baaSFabricConsortiumInfo);
		}
		listBaaSFabricConsortiumResponse.setData(data);
	 
	 	return listBaaSFabricConsortiumResponse;
	}
}