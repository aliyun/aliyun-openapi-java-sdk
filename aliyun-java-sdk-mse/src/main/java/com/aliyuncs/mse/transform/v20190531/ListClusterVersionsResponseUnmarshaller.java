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

import com.aliyuncs.mse.model.v20190531.ListClusterVersionsResponse;
import com.aliyuncs.mse.model.v20190531.ListClusterVersionsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterVersionsResponseUnmarshaller {

	public static ListClusterVersionsResponse unmarshall(ListClusterVersionsResponse listClusterVersionsResponse, UnmarshallerContext _ctx) {
		
		listClusterVersionsResponse.setRequestId(_ctx.stringValue("ListClusterVersionsResponse.RequestId"));
		listClusterVersionsResponse.setHttpStatusCode(_ctx.integerValue("ListClusterVersionsResponse.HttpStatusCode"));
		listClusterVersionsResponse.setSuccess(_ctx.booleanValue("ListClusterVersionsResponse.Success"));
		listClusterVersionsResponse.setErrorCode(_ctx.stringValue("ListClusterVersionsResponse.ErrorCode"));
		listClusterVersionsResponse.setCode(_ctx.integerValue("ListClusterVersionsResponse.Code"));
		listClusterVersionsResponse.setMessage(_ctx.stringValue("ListClusterVersionsResponse.Message"));
		listClusterVersionsResponse.setDynamicMessage(_ctx.stringValue("ListClusterVersionsResponse.DynamicMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterVersionsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCode(_ctx.stringValue("ListClusterVersionsResponse.Data["+ i +"].Code"));
			dataItem.setShowName(_ctx.stringValue("ListClusterVersionsResponse.Data["+ i +"].ShowName"));
			dataItem.setClusterType(_ctx.stringValue("ListClusterVersionsResponse.Data["+ i +"].ClusterType"));

			data.add(dataItem);
		}
		listClusterVersionsResponse.setData(data);
	 
	 	return listClusterVersionsResponse;
	}
}