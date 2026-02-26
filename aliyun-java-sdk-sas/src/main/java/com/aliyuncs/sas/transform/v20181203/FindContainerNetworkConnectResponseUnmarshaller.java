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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.FindContainerNetworkConnectResponse;
import com.aliyuncs.sas.model.v20181203.FindContainerNetworkConnectResponse.Connect;
import com.aliyuncs.sas.model.v20181203.FindContainerNetworkConnectResponse.Connect.DstContainer;
import com.aliyuncs.sas.model.v20181203.FindContainerNetworkConnectResponse.Connect.SrcContainer;
import com.aliyuncs.sas.model.v20181203.FindContainerNetworkConnectResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindContainerNetworkConnectResponseUnmarshaller {

	public static FindContainerNetworkConnectResponse unmarshall(FindContainerNetworkConnectResponse findContainerNetworkConnectResponse, UnmarshallerContext _ctx) {
		
		findContainerNetworkConnectResponse.setRequestId(_ctx.stringValue("FindContainerNetworkConnectResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setTotalCount(_ctx.longValue("FindContainerNetworkConnectResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.longValue("FindContainerNetworkConnectResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.longValue("FindContainerNetworkConnectResponse.PageInfo.PageSize"));
		pageInfo.setCurrentPage(_ctx.longValue("FindContainerNetworkConnectResponse.PageInfo.CurrentPage"));
		findContainerNetworkConnectResponse.setPageInfo(pageInfo);

		List<Connect> connects = new ArrayList<Connect>();
		for (int i = 0; i < _ctx.lengthValue("FindContainerNetworkConnectResponse.Connects.Length"); i++) {
			Connect connect = new Connect();
			connect.setId(_ctx.longValue("FindContainerNetworkConnectResponse.Connects["+ i +"].Id"));
			connect.setFirstTime(_ctx.longValue("FindContainerNetworkConnectResponse.Connects["+ i +"].FirstTime"));
			connect.setLastTime(_ctx.longValue("FindContainerNetworkConnectResponse.Connects["+ i +"].LastTime"));
			connect.setSrcIp(_ctx.stringValue("FindContainerNetworkConnectResponse.Connects["+ i +"].SrcIp"));
			connect.setSrcPort(_ctx.stringValue("FindContainerNetworkConnectResponse.Connects["+ i +"].SrcPort"));
			connect.setDstIp(_ctx.stringValue("FindContainerNetworkConnectResponse.Connects["+ i +"].DstIp"));
			connect.setDstPort(_ctx.stringValue("FindContainerNetworkConnectResponse.Connects["+ i +"].DstPort"));

			SrcContainer srcContainer = new SrcContainer();
			srcContainer.setContainerId(_ctx.stringValue("FindContainerNetworkConnectResponse.Connects["+ i +"].SrcContainer.ContainerId"));
			connect.setSrcContainer(srcContainer);

			DstContainer dstContainer = new DstContainer();
			dstContainer.setContainerId(_ctx.stringValue("FindContainerNetworkConnectResponse.Connects["+ i +"].DstContainer.ContainerId"));
			connect.setDstContainer(dstContainer);

			connects.add(connect);
		}
		findContainerNetworkConnectResponse.setConnects(connects);
	 
	 	return findContainerNetworkConnectResponse;
	}
}