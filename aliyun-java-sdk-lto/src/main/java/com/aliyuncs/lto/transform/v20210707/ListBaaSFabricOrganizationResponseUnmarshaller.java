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

import com.aliyuncs.lto.model.v20210707.ListBaaSFabricOrganizationResponse;
import com.aliyuncs.lto.model.v20210707.ListBaaSFabricOrganizationResponse.BaaSFabricOrganizationInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBaaSFabricOrganizationResponseUnmarshaller {

	public static ListBaaSFabricOrganizationResponse unmarshall(ListBaaSFabricOrganizationResponse listBaaSFabricOrganizationResponse, UnmarshallerContext _ctx) {
		
		listBaaSFabricOrganizationResponse.setRequestId(_ctx.stringValue("ListBaaSFabricOrganizationResponse.RequestId"));
		listBaaSFabricOrganizationResponse.setCode(_ctx.stringValue("ListBaaSFabricOrganizationResponse.Code"));
		listBaaSFabricOrganizationResponse.setHttpStatusCode(_ctx.integerValue("ListBaaSFabricOrganizationResponse.HttpStatusCode"));
		listBaaSFabricOrganizationResponse.setMessage(_ctx.stringValue("ListBaaSFabricOrganizationResponse.Message"));
		listBaaSFabricOrganizationResponse.setSuccess(_ctx.booleanValue("ListBaaSFabricOrganizationResponse.Success"));

		List<BaaSFabricOrganizationInfo> data = new ArrayList<BaaSFabricOrganizationInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListBaaSFabricOrganizationResponse.Data.Length"); i++) {
			BaaSFabricOrganizationInfo baaSFabricOrganizationInfo = new BaaSFabricOrganizationInfo();
			baaSFabricOrganizationInfo.setBaaSFabricOrganizationName(_ctx.stringValue("ListBaaSFabricOrganizationResponse.Data["+ i +"].BaaSFabricOrganizationName"));
			baaSFabricOrganizationInfo.setBaaSFabricOrganizationId(_ctx.stringValue("ListBaaSFabricOrganizationResponse.Data["+ i +"].BaaSFabricOrganizationId"));

			data.add(baaSFabricOrganizationInfo);
		}
		listBaaSFabricOrganizationResponse.setData(data);
	 
	 	return listBaaSFabricOrganizationResponse;
	}
}