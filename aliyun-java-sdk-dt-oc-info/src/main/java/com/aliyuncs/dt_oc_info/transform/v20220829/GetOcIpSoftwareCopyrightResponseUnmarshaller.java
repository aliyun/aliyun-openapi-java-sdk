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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIpSoftwareCopyrightResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIpSoftwareCopyrightResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcIpSoftwareCopyrightResponseUnmarshaller {

	public static GetOcIpSoftwareCopyrightResponse unmarshall(GetOcIpSoftwareCopyrightResponse getOcIpSoftwareCopyrightResponse, UnmarshallerContext _ctx) {
		
		getOcIpSoftwareCopyrightResponse.setRequestId(_ctx.stringValue("GetOcIpSoftwareCopyrightResponse.RequestId"));
		getOcIpSoftwareCopyrightResponse.setCode(_ctx.stringValue("GetOcIpSoftwareCopyrightResponse.Code"));
		getOcIpSoftwareCopyrightResponse.setSuccess(_ctx.booleanValue("GetOcIpSoftwareCopyrightResponse.Success"));
		getOcIpSoftwareCopyrightResponse.setMessage(_ctx.stringValue("GetOcIpSoftwareCopyrightResponse.Message"));
		getOcIpSoftwareCopyrightResponse.setTotalNum(_ctx.integerValue("GetOcIpSoftwareCopyrightResponse.TotalNum"));
		getOcIpSoftwareCopyrightResponse.setPageIndex(_ctx.integerValue("GetOcIpSoftwareCopyrightResponse.PageIndex"));
		getOcIpSoftwareCopyrightResponse.setPageNum(_ctx.integerValue("GetOcIpSoftwareCopyrightResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcIpSoftwareCopyrightResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcIpSoftwareCopyrightResponse.Data["+ i +"].EntName"));
			dataItem.setCopyNum(_ctx.stringValue("GetOcIpSoftwareCopyrightResponse.Data["+ i +"].CopyNum"));
			dataItem.setTypeNum(_ctx.stringValue("GetOcIpSoftwareCopyrightResponse.Data["+ i +"].TypeNum"));
			dataItem.setShortName(_ctx.stringValue("GetOcIpSoftwareCopyrightResponse.Data["+ i +"].ShortName"));
			dataItem.setCopyName(_ctx.stringValue("GetOcIpSoftwareCopyrightResponse.Data["+ i +"].CopyName"));
			dataItem.setVersion(_ctx.stringValue("GetOcIpSoftwareCopyrightResponse.Data["+ i +"].Version"));
			dataItem.setSuccessDate(_ctx.stringValue("GetOcIpSoftwareCopyrightResponse.Data["+ i +"].SuccessDate"));
			dataItem.setFirstDate(_ctx.stringValue("GetOcIpSoftwareCopyrightResponse.Data["+ i +"].FirstDate"));
			dataItem.setApprovalDate(_ctx.stringValue("GetOcIpSoftwareCopyrightResponse.Data["+ i +"].ApprovalDate"));

			data.add(dataItem);
		}
		getOcIpSoftwareCopyrightResponse.setData(data);
	 
	 	return getOcIpSoftwareCopyrightResponse;
	}
}