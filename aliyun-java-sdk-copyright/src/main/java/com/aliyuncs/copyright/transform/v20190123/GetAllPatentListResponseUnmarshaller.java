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

import com.aliyuncs.copyright.model.v20190123.GetAllPatentListResponse;
import com.aliyuncs.copyright.model.v20190123.GetAllPatentListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAllPatentListResponseUnmarshaller {

	public static GetAllPatentListResponse unmarshall(GetAllPatentListResponse getAllPatentListResponse, UnmarshallerContext _ctx) {
		
		getAllPatentListResponse.setRequestId(_ctx.stringValue("GetAllPatentListResponse.RequestId"));
		getAllPatentListResponse.setPageNum(_ctx.integerValue("GetAllPatentListResponse.PageNum"));
		getAllPatentListResponse.setPageSize(_ctx.integerValue("GetAllPatentListResponse.PageSize"));
		getAllPatentListResponse.setSuccess(_ctx.booleanValue("GetAllPatentListResponse.Success"));
		getAllPatentListResponse.setTotalItemNum(_ctx.integerValue("GetAllPatentListResponse.TotalItemNum"));
		getAllPatentListResponse.setTotalPageNum(_ctx.integerValue("GetAllPatentListResponse.TotalPageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAllPatentListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAgency(_ctx.stringValue("GetAllPatentListResponse.Data["+ i +"].Agency"));
			dataItem.setApplyNumber(_ctx.stringValue("GetAllPatentListResponse.Data["+ i +"].ApplyNumber"));
			dataItem.setBizId(_ctx.stringValue("GetAllPatentListResponse.Data["+ i +"].BizId"));
			dataItem.setName(_ctx.stringValue("GetAllPatentListResponse.Data["+ i +"].Name"));
			dataItem.setOwner(_ctx.stringValue("GetAllPatentListResponse.Data["+ i +"].Owner"));
			dataItem.setPayStatus(_ctx.integerValue("GetAllPatentListResponse.Data["+ i +"].PayStatus"));
			dataItem.setSoldStatus(_ctx.integerValue("GetAllPatentListResponse.Data["+ i +"].SoldStatus"));
			dataItem.setType(_ctx.stringValue("GetAllPatentListResponse.Data["+ i +"].Type"));
			dataItem.setYear(_ctx.integerValue("GetAllPatentListResponse.Data["+ i +"].Year"));
			dataItem.setPayEndDate(_ctx.stringValue("GetAllPatentListResponse.Data["+ i +"].PayEndDate"));
			dataItem.setDiscountPrice(_ctx.floatValue("GetAllPatentListResponse.Data["+ i +"].DiscountPrice"));
			dataItem.setPatentDiscard(_ctx.booleanValue("GetAllPatentListResponse.Data["+ i +"].PatentDiscard"));
			dataItem.setPatentStatus(_ctx.stringValue("GetAllPatentListResponse.Data["+ i +"].PatentStatus"));

			data.add(dataItem);
		}
		getAllPatentListResponse.setData(data);
	 
	 	return getAllPatentListResponse;
	}
}