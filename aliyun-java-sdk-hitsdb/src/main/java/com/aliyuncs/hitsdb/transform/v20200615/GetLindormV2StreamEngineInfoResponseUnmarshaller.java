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

import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2StreamEngineInfoResponse;
import com.aliyuncs.hitsdb.model.v20200615.GetLindormV2StreamEngineInfoResponse.ResourceGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLindormV2StreamEngineInfoResponseUnmarshaller {

	public static GetLindormV2StreamEngineInfoResponse unmarshall(GetLindormV2StreamEngineInfoResponse getLindormV2StreamEngineInfoResponse, UnmarshallerContext _ctx) {
		
		getLindormV2StreamEngineInfoResponse.setRequestId(_ctx.stringValue("GetLindormV2StreamEngineInfoResponse.RequestId"));
		getLindormV2StreamEngineInfoResponse.setInstanceId(_ctx.stringValue("GetLindormV2StreamEngineInfoResponse.InstanceId"));

		List<ResourceGroup> resourceGroupList = new ArrayList<ResourceGroup>();
		for (int i = 0; i < _ctx.lengthValue("GetLindormV2StreamEngineInfoResponse.ResourceGroupList.Length"); i++) {
			ResourceGroup resourceGroup = new ResourceGroup();
			resourceGroup.setStatus(_ctx.stringValue("GetLindormV2StreamEngineInfoResponse.ResourceGroupList["+ i +"].Status"));
			resourceGroup.setQuantity(_ctx.integerValue("GetLindormV2StreamEngineInfoResponse.ResourceGroupList["+ i +"].Quantity"));
			resourceGroup.setSpec(_ctx.stringValue("GetLindormV2StreamEngineInfoResponse.ResourceGroupList["+ i +"].Spec"));
			resourceGroup.setSpecId(_ctx.stringValue("GetLindormV2StreamEngineInfoResponse.ResourceGroupList["+ i +"].SpecId"));
			resourceGroup.setResourceGroupName(_ctx.stringValue("GetLindormV2StreamEngineInfoResponse.ResourceGroupList["+ i +"].ResourceGroupName"));

			List<String> jmIpList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLindormV2StreamEngineInfoResponse.ResourceGroupList["+ i +"].JmIpList.Length"); j++) {
				jmIpList.add(_ctx.stringValue("GetLindormV2StreamEngineInfoResponse.ResourceGroupList["+ i +"].JmIpList["+ j +"]"));
			}
			resourceGroup.setJmIpList(jmIpList);

			List<String> sgIpList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLindormV2StreamEngineInfoResponse.ResourceGroupList["+ i +"].SgIpList.Length"); j++) {
				sgIpList.add(_ctx.stringValue("GetLindormV2StreamEngineInfoResponse.ResourceGroupList["+ i +"].SgIpList["+ j +"]"));
			}
			resourceGroup.setSgIpList(sgIpList);

			resourceGroupList.add(resourceGroup);
		}
		getLindormV2StreamEngineInfoResponse.setResourceGroupList(resourceGroupList);
	 
	 	return getLindormV2StreamEngineInfoResponse;
	}
}