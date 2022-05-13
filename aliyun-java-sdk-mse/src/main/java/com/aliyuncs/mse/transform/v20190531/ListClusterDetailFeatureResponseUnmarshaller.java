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

import com.aliyuncs.mse.model.v20190531.ListClusterDetailFeatureResponse;
import com.aliyuncs.mse.model.v20190531.ListClusterDetailFeatureResponse.DataItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterDetailFeatureResponseUnmarshaller {

	public static ListClusterDetailFeatureResponse unmarshall(ListClusterDetailFeatureResponse listClusterDetailFeatureResponse, UnmarshallerContext _ctx) {
		
		listClusterDetailFeatureResponse.setRequestId(_ctx.stringValue("ListClusterDetailFeatureResponse.RequestId"));
		listClusterDetailFeatureResponse.setSuccess(_ctx.booleanValue("ListClusterDetailFeatureResponse.Success"));
		listClusterDetailFeatureResponse.setMessage(_ctx.stringValue("ListClusterDetailFeatureResponse.Message"));
		listClusterDetailFeatureResponse.setErrorCode(_ctx.stringValue("ListClusterDetailFeatureResponse.ErrorCode"));
		listClusterDetailFeatureResponse.setHttpCode(_ctx.stringValue("ListClusterDetailFeatureResponse.HttpCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterDetailFeatureResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setFeatureId(_ctx.stringValue("ListClusterDetailFeatureResponse.Data["+ i +"].FeatureId"));
			dataItem.setStatus(_ctx.stringValue("ListClusterDetailFeatureResponse.Data["+ i +"].Status"));
			dataItem.setMessage(_ctx.stringValue("ListClusterDetailFeatureResponse.Data["+ i +"].Message"));
			dataItem.setExtend(_ctx.mapValue("ListClusterDetailFeatureResponse.Data["+ i +"].Extend"));
			dataItem.setOrderNum(_ctx.stringValue("ListClusterDetailFeatureResponse.Data["+ i +"].OrderNum"));

			data.add(dataItem);
		}
		listClusterDetailFeatureResponse.setData(data);
	 
	 	return listClusterDetailFeatureResponse;
	}
}