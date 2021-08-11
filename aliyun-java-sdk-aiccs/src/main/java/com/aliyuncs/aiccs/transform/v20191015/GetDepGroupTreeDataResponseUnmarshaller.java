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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.GetDepGroupTreeDataResponse;
import com.aliyuncs.aiccs.model.v20191015.GetDepGroupTreeDataResponse.DataItem;
import com.aliyuncs.aiccs.model.v20191015.GetDepGroupTreeDataResponse.DataItem.GroupDTOSItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDepGroupTreeDataResponseUnmarshaller {

	public static GetDepGroupTreeDataResponse unmarshall(GetDepGroupTreeDataResponse getDepGroupTreeDataResponse, UnmarshallerContext _ctx) {
		
		getDepGroupTreeDataResponse.setRequestId(_ctx.stringValue("GetDepGroupTreeDataResponse.RequestId"));
		getDepGroupTreeDataResponse.setMessage(_ctx.stringValue("GetDepGroupTreeDataResponse.Message"));
		getDepGroupTreeDataResponse.setCode(_ctx.stringValue("GetDepGroupTreeDataResponse.Code"));
		getDepGroupTreeDataResponse.setSuccess(_ctx.stringValue("GetDepGroupTreeDataResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDepGroupTreeDataResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDepGroupName(_ctx.stringValue("GetDepGroupTreeDataResponse.Data["+ i +"].DepGroupName"));
			dataItem.setDepGroupId(_ctx.stringValue("GetDepGroupTreeDataResponse.Data["+ i +"].DepGroupId"));

			List<GroupDTOSItem> groupDTOS = new ArrayList<GroupDTOSItem>();
			for (int j = 0; j < _ctx.lengthValue("GetDepGroupTreeDataResponse.Data["+ i +"].GroupDTOS.Length"); j++) {
				GroupDTOSItem groupDTOSItem = new GroupDTOSItem();
				groupDTOSItem.setSkillGroupId(_ctx.longValue("GetDepGroupTreeDataResponse.Data["+ i +"].GroupDTOS["+ j +"].SkillGroupId"));
				groupDTOSItem.setName(_ctx.stringValue("GetDepGroupTreeDataResponse.Data["+ i +"].GroupDTOS["+ j +"].Name"));

				groupDTOS.add(groupDTOSItem);
			}
			dataItem.setGroupDTOS(groupDTOS);

			data.add(dataItem);
		}
		getDepGroupTreeDataResponse.setData(data);
	 
	 	return getDepGroupTreeDataResponse;
	}
}