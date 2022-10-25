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

package com.aliyuncs.dt_oc_info.transform.v20220829;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcBranchResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcBranchResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcIcBranchResponseUnmarshaller {

	public static GetOcIcBranchResponse unmarshall(GetOcIcBranchResponse getOcIcBranchResponse, UnmarshallerContext _ctx) {
		
		getOcIcBranchResponse.setRequestId(_ctx.stringValue("GetOcIcBranchResponse.RequestId"));
		getOcIcBranchResponse.setCode(_ctx.stringValue("GetOcIcBranchResponse.Code"));
		getOcIcBranchResponse.setSuccess(_ctx.booleanValue("GetOcIcBranchResponse.Success"));
		getOcIcBranchResponse.setMessage(_ctx.stringValue("GetOcIcBranchResponse.Message"));
		getOcIcBranchResponse.setTotalNum(_ctx.integerValue("GetOcIcBranchResponse.TotalNum"));
		getOcIcBranchResponse.setPageIndex(_ctx.integerValue("GetOcIcBranchResponse.PageIndex"));
		getOcIcBranchResponse.setPageNum(_ctx.integerValue("GetOcIcBranchResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcIcBranchResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcIcBranchResponse.Data["+ i +"].EntName"));
			dataItem.setEntStatus(_ctx.stringValue("GetOcIcBranchResponse.Data["+ i +"].EntStatus"));
			dataItem.setOperName(_ctx.stringValue("GetOcIcBranchResponse.Data["+ i +"].OperName"));
			dataItem.setEsDate(_ctx.stringValue("GetOcIcBranchResponse.Data["+ i +"].EsDate"));

			data.add(dataItem);
		}
		getOcIcBranchResponse.setData(data);
	 
	 	return getOcIcBranchResponse;
	}
}