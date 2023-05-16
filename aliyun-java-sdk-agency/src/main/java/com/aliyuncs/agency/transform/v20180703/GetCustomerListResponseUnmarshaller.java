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

package com.aliyuncs.agency.transform.v20180703;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.agency.model.v20180703.GetCustomerListResponse;
import com.aliyuncs.agency.model.v20180703.GetCustomerListResponse.Data;
import com.aliyuncs.agency.model.v20180703.GetCustomerListResponse.Data.FxCustomerReportDTO;
import com.aliyuncs.agency.model.v20180703.GetCustomerListResponse.Data.FxCustomerReportDTO.GcLevelAmountInfo;
import com.aliyuncs.agency.model.v20180703.GetCustomerListResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCustomerListResponseUnmarshaller {

	public static GetCustomerListResponse unmarshall(GetCustomerListResponse getCustomerListResponse, UnmarshallerContext _ctx) {
		
		getCustomerListResponse.setCode(_ctx.stringValue("GetCustomerListResponse.Code"));
		getCustomerListResponse.setMessage(_ctx.stringValue("GetCustomerListResponse.Message"));
		getCustomerListResponse.setSuccess(_ctx.booleanValue("GetCustomerListResponse.Success"));

		Data data = new Data();

		List<FxCustomerReportDTO> list = new ArrayList<FxCustomerReportDTO>();
		for (int i = 0; i < _ctx.lengthValue("GetCustomerListResponse.Data.List.Length"); i++) {
			FxCustomerReportDTO fxCustomerReportDTO = new FxCustomerReportDTO();
			fxCustomerReportDTO.setReportedTime(_ctx.stringValue("GetCustomerListResponse.Data.List["+ i +"].ReportedTime"));
			fxCustomerReportDTO.setHasAccount(_ctx.integerValue("GetCustomerListResponse.Data.List["+ i +"].HasAccount"));
			fxCustomerReportDTO.setExpireTime(_ctx.stringValue("GetCustomerListResponse.Data.List["+ i +"].ExpireTime"));
			fxCustomerReportDTO.setCid(_ctx.longValue("GetCustomerListResponse.Data.List["+ i +"].Cid"));
			fxCustomerReportDTO.setCustomerName(_ctx.stringValue("GetCustomerListResponse.Data.List["+ i +"].CustomerName"));
			fxCustomerReportDTO.setCustomerStatus(_ctx.integerValue("GetCustomerListResponse.Data.List["+ i +"].CustomerStatus"));
			fxCustomerReportDTO.setCustomerType(_ctx.integerValue("GetCustomerListResponse.Data.List["+ i +"].CustomerType"));
			fxCustomerReportDTO.setCustomerGcLevel(_ctx.stringValue("GetCustomerListResponse.Data.List["+ i +"].CustomerGcLevel"));

			List<String> customerUids = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetCustomerListResponse.Data.List["+ i +"].CustomerUids.Length"); j++) {
				customerUids.add(_ctx.stringValue("GetCustomerListResponse.Data.List["+ i +"].CustomerUids["+ j +"]"));
			}
			fxCustomerReportDTO.setCustomerUids(customerUids);

			GcLevelAmountInfo gcLevelAmountInfo = new GcLevelAmountInfo();
			gcLevelAmountInfo.setThreeMonthAmount(_ctx.stringValue("GetCustomerListResponse.Data.List["+ i +"].GcLevelAmountInfo.ThreeMonthAmount"));
			gcLevelAmountInfo.setShowOne(_ctx.booleanValue("GetCustomerListResponse.Data.List["+ i +"].GcLevelAmountInfo.ShowOne"));
			gcLevelAmountInfo.setShowThree(_ctx.booleanValue("GetCustomerListResponse.Data.List["+ i +"].GcLevelAmountInfo.ShowThree"));
			gcLevelAmountInfo.setShowSix(_ctx.booleanValue("GetCustomerListResponse.Data.List["+ i +"].GcLevelAmountInfo.ShowSix"));
			gcLevelAmountInfo.setTwelveMonthAmount(_ctx.stringValue("GetCustomerListResponse.Data.List["+ i +"].GcLevelAmountInfo.TwelveMonthAmount"));
			gcLevelAmountInfo.setOneMonthAmount(_ctx.stringValue("GetCustomerListResponse.Data.List["+ i +"].GcLevelAmountInfo.OneMonthAmount"));
			gcLevelAmountInfo.setSixMonthAmount(_ctx.stringValue("GetCustomerListResponse.Data.List["+ i +"].GcLevelAmountInfo.SixMonthAmount"));
			fxCustomerReportDTO.setGcLevelAmountInfo(gcLevelAmountInfo);

			list.add(fxCustomerReportDTO);
		}
		data.setList(list);
		getCustomerListResponse.setData(data);

		PageInfo pageInfo = new PageInfo();
		pageInfo.setPageSize(_ctx.integerValue("GetCustomerListResponse.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("GetCustomerListResponse.PageInfo.Total"));
		pageInfo.setPage(_ctx.integerValue("GetCustomerListResponse.PageInfo.Page"));
		getCustomerListResponse.setPageInfo(pageInfo);
	 
	 	return getCustomerListResponse;
	}
}