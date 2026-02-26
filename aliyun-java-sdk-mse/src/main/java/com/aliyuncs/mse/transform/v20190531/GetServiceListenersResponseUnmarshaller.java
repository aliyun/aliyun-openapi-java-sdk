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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.GetServiceListenersResponse;
import com.aliyuncs.mse.model.v20190531.GetServiceListenersResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceListenersResponseUnmarshaller {

	public static GetServiceListenersResponse unmarshall(GetServiceListenersResponse getServiceListenersResponse, UnmarshallerContext _ctx) {
		
		getServiceListenersResponse.setRequestId(_ctx.stringValue("GetServiceListenersResponse.RequestId"));
		getServiceListenersResponse.setPageNumber(_ctx.integerValue("GetServiceListenersResponse.PageNumber"));
		getServiceListenersResponse.setTotalCount(_ctx.integerValue("GetServiceListenersResponse.TotalCount"));
		getServiceListenersResponse.setPageSize(_ctx.integerValue("GetServiceListenersResponse.PageSize"));
		getServiceListenersResponse.setSuccess(_ctx.booleanValue("GetServiceListenersResponse.Success"));
		getServiceListenersResponse.setMessage(_ctx.stringValue("GetServiceListenersResponse.Message"));
		getServiceListenersResponse.setErrorCode(_ctx.stringValue("GetServiceListenersResponse.ErrorCode"));
		getServiceListenersResponse.setHttpCode(_ctx.stringValue("GetServiceListenersResponse.HttpCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceListenersResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAddr(_ctx.stringValue("GetServiceListenersResponse.Data["+ i +"].Addr"));
			dataItem.setAgent(_ctx.stringValue("GetServiceListenersResponse.Data["+ i +"].Agent"));
			dataItem.setApp(_ctx.stringValue("GetServiceListenersResponse.Data["+ i +"].App"));
			dataItem.setIP(_ctx.stringValue("GetServiceListenersResponse.Data["+ i +"].IP"));
			dataItem.setPort(_ctx.stringValue("GetServiceListenersResponse.Data["+ i +"].Port"));
			dataItem.setNamespaceId(_ctx.stringValue("GetServiceListenersResponse.Data["+ i +"].NamespaceId"));
			dataItem.setServiceName(_ctx.stringValue("GetServiceListenersResponse.Data["+ i +"].ServiceName"));
			dataItem.setCluster(_ctx.stringValue("GetServiceListenersResponse.Data["+ i +"].Cluster"));

			data.add(dataItem);
		}
		getServiceListenersResponse.setData(data);
	 
	 	return getServiceListenersResponse;
	}
}