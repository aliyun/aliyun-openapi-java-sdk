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

import com.aliyuncs.copyright.model.v20190123.GetPatentPlanDetailListResponse;
import com.aliyuncs.copyright.model.v20190123.GetPatentPlanDetailListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPatentPlanDetailListResponseUnmarshaller {

	public static GetPatentPlanDetailListResponse unmarshall(GetPatentPlanDetailListResponse getPatentPlanDetailListResponse, UnmarshallerContext _ctx) {
		
		getPatentPlanDetailListResponse.setRequestId(_ctx.stringValue("GetPatentPlanDetailListResponse.RequestId"));
		getPatentPlanDetailListResponse.setPageNum(_ctx.integerValue("GetPatentPlanDetailListResponse.PageNum"));
		getPatentPlanDetailListResponse.setPageSize(_ctx.integerValue("GetPatentPlanDetailListResponse.PageSize"));
		getPatentPlanDetailListResponse.setSuccess(_ctx.booleanValue("GetPatentPlanDetailListResponse.Success"));
		getPatentPlanDetailListResponse.setTotalItemNum(_ctx.integerValue("GetPatentPlanDetailListResponse.TotalItemNum"));
		getPatentPlanDetailListResponse.setTotalPageNum(_ctx.integerValue("GetPatentPlanDetailListResponse.TotalPageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPatentPlanDetailListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAgency(_ctx.stringValue("GetPatentPlanDetailListResponse.Data["+ i +"].Agency"));
			dataItem.setApplyNumber(_ctx.stringValue("GetPatentPlanDetailListResponse.Data["+ i +"].ApplyNumber"));
			dataItem.setBizId(_ctx.stringValue("GetPatentPlanDetailListResponse.Data["+ i +"].BizId"));
			dataItem.setDiscount(_ctx.integerValue("GetPatentPlanDetailListResponse.Data["+ i +"].Discount"));
			dataItem.setGmtExpireDate(_ctx.stringValue("GetPatentPlanDetailListResponse.Data["+ i +"].GmtExpireDate"));
			dataItem.setName(_ctx.stringValue("GetPatentPlanDetailListResponse.Data["+ i +"].Name"));
			dataItem.setOwner(_ctx.stringValue("GetPatentPlanDetailListResponse.Data["+ i +"].Owner"));
			dataItem.setPaidDate(_ctx.stringValue("GetPatentPlanDetailListResponse.Data["+ i +"].PaidDate"));
			dataItem.setPayStatus(_ctx.integerValue("GetPatentPlanDetailListResponse.Data["+ i +"].PayStatus"));
			dataItem.setPlanDetailId(_ctx.longValue("GetPatentPlanDetailListResponse.Data["+ i +"].PlanDetailId"));
			dataItem.setPlanId(_ctx.longValue("GetPatentPlanDetailListResponse.Data["+ i +"].PlanId"));
			dataItem.setPlanPayDate(_ctx.stringValue("GetPatentPlanDetailListResponse.Data["+ i +"].PlanPayDate"));
			dataItem.setSoldStatus(_ctx.integerValue("GetPatentPlanDetailListResponse.Data["+ i +"].SoldStatus"));
			dataItem.setType(_ctx.integerValue("GetPatentPlanDetailListResponse.Data["+ i +"].Type"));
			dataItem.setUidAgreement(_ctx.booleanValue("GetPatentPlanDetailListResponse.Data["+ i +"].UidAgreement"));
			dataItem.setYear(_ctx.integerValue("GetPatentPlanDetailListResponse.Data["+ i +"].Year"));
			dataItem.setPatentStatus(_ctx.stringValue("GetPatentPlanDetailListResponse.Data["+ i +"].PatentStatus"));
			dataItem.setPatentDiscard(_ctx.booleanValue("GetPatentPlanDetailListResponse.Data["+ i +"].PatentDiscard"));
			dataItem.setLabel(_ctx.integerValue("GetPatentPlanDetailListResponse.Data["+ i +"].Label"));
			dataItem.setEndPayDate(_ctx.stringValue("GetPatentPlanDetailListResponse.Data["+ i +"].EndPayDate"));

			data.add(dataItem);
		}
		getPatentPlanDetailListResponse.setData(data);
	 
	 	return getPatentPlanDetailListResponse;
	}
}