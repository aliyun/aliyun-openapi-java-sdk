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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QuerySolutionDeviceGroupPageResponse;
import com.aliyuncs.iot.model.v20180120.QuerySolutionDeviceGroupPageResponse.Data;
import com.aliyuncs.iot.model.v20180120.QuerySolutionDeviceGroupPageResponse.Data.ItemName;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySolutionDeviceGroupPageResponseUnmarshaller {

	public static QuerySolutionDeviceGroupPageResponse unmarshall(QuerySolutionDeviceGroupPageResponse querySolutionDeviceGroupPageResponse, UnmarshallerContext _ctx) {
		
		querySolutionDeviceGroupPageResponse.setRequestId(_ctx.stringValue("QuerySolutionDeviceGroupPageResponse.RequestId"));
		querySolutionDeviceGroupPageResponse.setSuccess(_ctx.booleanValue("QuerySolutionDeviceGroupPageResponse.Success"));
		querySolutionDeviceGroupPageResponse.setCode(_ctx.stringValue("QuerySolutionDeviceGroupPageResponse.Code"));
		querySolutionDeviceGroupPageResponse.setErrorMessage(_ctx.stringValue("QuerySolutionDeviceGroupPageResponse.ErrorMessage"));

		Data data = new Data();
		data.setPageId(_ctx.integerValue("QuerySolutionDeviceGroupPageResponse.Data.PageId"));
		data.setPageSize(_ctx.integerValue("QuerySolutionDeviceGroupPageResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("QuerySolutionDeviceGroupPageResponse.Data.Total"));

		List<ItemName> list = new ArrayList<ItemName>();
		for (int i = 0; i < _ctx.lengthValue("QuerySolutionDeviceGroupPageResponse.Data.List.Length"); i++) {
			ItemName itemName = new ItemName();
			itemName.setGmtCreate(_ctx.longValue("QuerySolutionDeviceGroupPageResponse.Data.List["+ i +"].GmtCreate"));
			itemName.setGmtModified(_ctx.longValue("QuerySolutionDeviceGroupPageResponse.Data.List["+ i +"].GmtModified"));
			itemName.setGroupId(_ctx.stringValue("QuerySolutionDeviceGroupPageResponse.Data.List["+ i +"].GroupId"));
			itemName.setGroupName(_ctx.stringValue("QuerySolutionDeviceGroupPageResponse.Data.List["+ i +"].GroupName"));
			itemName.setGroupDesc(_ctx.stringValue("QuerySolutionDeviceGroupPageResponse.Data.List["+ i +"].GroupDesc"));
			itemName.setDeviceCount(_ctx.longValue("QuerySolutionDeviceGroupPageResponse.Data.List["+ i +"].DeviceCount"));

			list.add(itemName);
		}
		data.setList(list);
		querySolutionDeviceGroupPageResponse.setData(data);
	 
	 	return querySolutionDeviceGroupPageResponse;
	}
}