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

package com.aliyuncs.mns.transform.v20210319;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mns.model.v20210319.GetRegionListResponse;
import com.aliyuncs.mns.model.v20210319.GetRegionListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRegionListResponseUnmarshaller {

	public static GetRegionListResponse unmarshall(GetRegionListResponse getRegionListResponse, UnmarshallerContext _ctx) {
		
		getRegionListResponse.setRequestId(_ctx.stringValue("GetRegionListResponse.RequestId"));
		getRegionListResponse.setCode(_ctx.longValue("GetRegionListResponse.Code"));
		getRegionListResponse.setStatus(_ctx.stringValue("GetRegionListResponse.Status"));
		getRegionListResponse.setMessage(_ctx.stringValue("GetRegionListResponse.Message"));
		getRegionListResponse.setSuccess(_ctx.booleanValue("GetRegionListResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRegionListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRegionId(_ctx.stringValue("GetRegionListResponse.Data["+ i +"].RegionId"));
			dataItem.setRegionCnName(_ctx.stringValue("GetRegionListResponse.Data["+ i +"].RegionCnName"));
			dataItem.setRegionEnName(_ctx.stringValue("GetRegionListResponse.Data["+ i +"].RegionEnName"));

			data.add(dataItem);
		}
		getRegionListResponse.setData(data);
	 
	 	return getRegionListResponse;
	}
}