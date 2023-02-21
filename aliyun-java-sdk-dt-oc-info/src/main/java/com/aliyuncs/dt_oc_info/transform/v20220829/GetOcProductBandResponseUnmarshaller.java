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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcProductBandResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcProductBandResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcProductBandResponseUnmarshaller {

	public static GetOcProductBandResponse unmarshall(GetOcProductBandResponse getOcProductBandResponse, UnmarshallerContext _ctx) {
		
		getOcProductBandResponse.setRequestId(_ctx.stringValue("GetOcProductBandResponse.RequestId"));
		getOcProductBandResponse.setCode(_ctx.stringValue("GetOcProductBandResponse.Code"));
		getOcProductBandResponse.setSuccess(_ctx.booleanValue("GetOcProductBandResponse.Success"));
		getOcProductBandResponse.setMessage(_ctx.stringValue("GetOcProductBandResponse.Message"));
		getOcProductBandResponse.setTotalNum(_ctx.integerValue("GetOcProductBandResponse.TotalNum"));
		getOcProductBandResponse.setPageIndex(_ctx.integerValue("GetOcProductBandResponse.PageIndex"));
		getOcProductBandResponse.setPageNum(_ctx.integerValue("GetOcProductBandResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcProductBandResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcProductBandResponse.Data["+ i +"].EntName"));
			dataItem.setProductName(_ctx.stringValue("GetOcProductBandResponse.Data["+ i +"].ProductName"));
			dataItem.setProductLogo(_ctx.stringValue("GetOcProductBandResponse.Data["+ i +"].ProductLogo"));
			dataItem.setProductIntroduction(_ctx.stringValue("GetOcProductBandResponse.Data["+ i +"].ProductIntroduction"));
			dataItem.setBrandIntroduction(_ctx.stringValue("GetOcProductBandResponse.Data["+ i +"].BrandIntroduction"));
			dataItem.setProductWebsite(_ctx.stringValue("GetOcProductBandResponse.Data["+ i +"].ProductWebsite"));
			dataItem.setProductTag(_ctx.stringValue("GetOcProductBandResponse.Data["+ i +"].ProductTag"));
			dataItem.setDevice(_ctx.stringValue("GetOcProductBandResponse.Data["+ i +"].Device"));

			data.add(dataItem);
		}
		getOcProductBandResponse.setData(data);
	 
	 	return getOcProductBandResponse;
	}
}