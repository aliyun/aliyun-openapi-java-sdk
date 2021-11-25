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

package com.aliyuncs.copyright.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.copyright.model.v20190123.GetPatentStatisticsDetailListResponse;
import com.aliyuncs.copyright.model.v20190123.GetPatentStatisticsDetailListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPatentStatisticsDetailListResponseUnmarshaller {

	public static GetPatentStatisticsDetailListResponse unmarshall(GetPatentStatisticsDetailListResponse getPatentStatisticsDetailListResponse, UnmarshallerContext _ctx) {
		
		getPatentStatisticsDetailListResponse.setRequestId(_ctx.stringValue("GetPatentStatisticsDetailListResponse.RequestId"));
		getPatentStatisticsDetailListResponse.setPageNum(_ctx.integerValue("GetPatentStatisticsDetailListResponse.PageNum"));
		getPatentStatisticsDetailListResponse.setPageSize(_ctx.integerValue("GetPatentStatisticsDetailListResponse.PageSize"));
		getPatentStatisticsDetailListResponse.setSuccess(_ctx.booleanValue("GetPatentStatisticsDetailListResponse.Success"));
		getPatentStatisticsDetailListResponse.setTotalItemNum(_ctx.integerValue("GetPatentStatisticsDetailListResponse.TotalItemNum"));
		getPatentStatisticsDetailListResponse.setTotalPageNum(_ctx.integerValue("GetPatentStatisticsDetailListResponse.TotalPageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPatentStatisticsDetailListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAge(_ctx.stringValue("GetPatentStatisticsDetailListResponse.Data["+ i +"].Age"));
			dataItem.setAgency(_ctx.stringValue("GetPatentStatisticsDetailListResponse.Data["+ i +"].Agency"));
			dataItem.setApplyNumber(_ctx.stringValue("GetPatentStatisticsDetailListResponse.Data["+ i +"].ApplyNumber"));
			dataItem.setDiscount(_ctx.stringValue("GetPatentStatisticsDetailListResponse.Data["+ i +"].Discount"));
			dataItem.setDiscountPrice(_ctx.floatValue("GetPatentStatisticsDetailListResponse.Data["+ i +"].DiscountPrice"));
			dataItem.setName(_ctx.stringValue("GetPatentStatisticsDetailListResponse.Data["+ i +"].Name"));
			dataItem.setOwner(_ctx.stringValue("GetPatentStatisticsDetailListResponse.Data["+ i +"].Owner"));
			dataItem.setPayEndDate(_ctx.stringValue("GetPatentStatisticsDetailListResponse.Data["+ i +"].PayEndDate"));
			dataItem.setSalePrice(_ctx.floatValue("GetPatentStatisticsDetailListResponse.Data["+ i +"].SalePrice"));
			dataItem.setType(_ctx.stringValue("GetPatentStatisticsDetailListResponse.Data["+ i +"].Type"));
			dataItem.setYear(_ctx.integerValue("GetPatentStatisticsDetailListResponse.Data["+ i +"].Year"));
			dataItem.setStatus(_ctx.stringValue("GetPatentStatisticsDetailListResponse.Data["+ i +"].Status"));

			data.add(dataItem);
		}
		getPatentStatisticsDetailListResponse.setData(data);
	 
	 	return getPatentStatisticsDetailListResponse;
	}
}