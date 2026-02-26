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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.GetResourceListResponse;
import com.aliyuncs.advisor_share.model.v20180608.GetResourceListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResourceListResponseUnmarshaller {

	public static GetResourceListResponse unmarshall(GetResourceListResponse getResourceListResponse, UnmarshallerContext _ctx) {
		
		getResourceListResponse.setRequestId(_ctx.stringValue("GetResourceListResponse.RequestId"));
		getResourceListResponse.setMessage(_ctx.stringValue("GetResourceListResponse.Message"));
		getResourceListResponse.setSuccess(_ctx.stringValue("GetResourceListResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetResourceListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRegionId(_ctx.stringValue("GetResourceListResponse.Data["+ i +"].RegionId"));
			dataItem.setResourceId(_ctx.stringValue("GetResourceListResponse.Data["+ i +"].ResourceId"));
			dataItem.setResourceName(_ctx.stringValue("GetResourceListResponse.Data["+ i +"].ResourceName"));
			dataItem.setIsFlag(_ctx.booleanValue("GetResourceListResponse.Data["+ i +"].IsFlag"));

			data.add(dataItem);
		}
		getResourceListResponse.setData(data);
	 
	 	return getResourceListResponse;
	}
}