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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIpWorksCopyrightResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIpWorksCopyrightResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcIpWorksCopyrightResponseUnmarshaller {

	public static GetOcIpWorksCopyrightResponse unmarshall(GetOcIpWorksCopyrightResponse getOcIpWorksCopyrightResponse, UnmarshallerContext _ctx) {
		
		getOcIpWorksCopyrightResponse.setRequestId(_ctx.stringValue("GetOcIpWorksCopyrightResponse.RequestId"));
		getOcIpWorksCopyrightResponse.setCode(_ctx.stringValue("GetOcIpWorksCopyrightResponse.Code"));
		getOcIpWorksCopyrightResponse.setSuccess(_ctx.booleanValue("GetOcIpWorksCopyrightResponse.Success"));
		getOcIpWorksCopyrightResponse.setMessage(_ctx.stringValue("GetOcIpWorksCopyrightResponse.Message"));
		getOcIpWorksCopyrightResponse.setTotalNum(_ctx.integerValue("GetOcIpWorksCopyrightResponse.TotalNum"));
		getOcIpWorksCopyrightResponse.setPageIndex(_ctx.integerValue("GetOcIpWorksCopyrightResponse.PageIndex"));
		getOcIpWorksCopyrightResponse.setPageNum(_ctx.integerValue("GetOcIpWorksCopyrightResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcIpWorksCopyrightResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcIpWorksCopyrightResponse.Data["+ i +"].EntName"));
			dataItem.setCopyName(_ctx.stringValue("GetOcIpWorksCopyrightResponse.Data["+ i +"].CopyName"));
			dataItem.setTypeName(_ctx.stringValue("GetOcIpWorksCopyrightResponse.Data["+ i +"].TypeName"));
			dataItem.setCopyNum(_ctx.stringValue("GetOcIpWorksCopyrightResponse.Data["+ i +"].CopyNum"));
			dataItem.setSuccessDate(_ctx.stringValue("GetOcIpWorksCopyrightResponse.Data["+ i +"].SuccessDate"));
			dataItem.setFirstDate(_ctx.stringValue("GetOcIpWorksCopyrightResponse.Data["+ i +"].FirstDate"));
			dataItem.setApprovalDate(_ctx.stringValue("GetOcIpWorksCopyrightResponse.Data["+ i +"].ApprovalDate"));

			data.add(dataItem);
		}
		getOcIpWorksCopyrightResponse.setData(data);
	 
	 	return getOcIpWorksCopyrightResponse;
	}
}