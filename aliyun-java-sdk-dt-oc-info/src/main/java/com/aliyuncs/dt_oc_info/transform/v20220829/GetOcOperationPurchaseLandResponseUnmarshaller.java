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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcOperationPurchaseLandResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcOperationPurchaseLandResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcOperationPurchaseLandResponseUnmarshaller {

	public static GetOcOperationPurchaseLandResponse unmarshall(GetOcOperationPurchaseLandResponse getOcOperationPurchaseLandResponse, UnmarshallerContext _ctx) {
		
		getOcOperationPurchaseLandResponse.setRequestId(_ctx.stringValue("GetOcOperationPurchaseLandResponse.RequestId"));
		getOcOperationPurchaseLandResponse.setCode(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Code"));
		getOcOperationPurchaseLandResponse.setSuccess(_ctx.booleanValue("GetOcOperationPurchaseLandResponse.Success"));
		getOcOperationPurchaseLandResponse.setMessage(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Message"));
		getOcOperationPurchaseLandResponse.setTotalNum(_ctx.integerValue("GetOcOperationPurchaseLandResponse.TotalNum"));
		getOcOperationPurchaseLandResponse.setPageIndex(_ctx.integerValue("GetOcOperationPurchaseLandResponse.PageIndex"));
		getOcOperationPurchaseLandResponse.setPageNum(_ctx.integerValue("GetOcOperationPurchaseLandResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcOperationPurchaseLandResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Data["+ i +"].EntName"));
			dataItem.setRegionName(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Data["+ i +"].RegionName"));
			dataItem.setElectronicNo(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Data["+ i +"].ElectronicNo"));
			dataItem.setProjectName(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Data["+ i +"].ProjectName"));
			dataItem.setLocation(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Data["+ i +"].Location"));
			dataItem.setArea(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Data["+ i +"].Area"));
			dataItem.setReleaseDate(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Data["+ i +"].ReleaseDate"));
			dataItem.setLandSource(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Data["+ i +"].LandSource"));
			dataItem.setLandUse(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Data["+ i +"].LandUse"));
			dataItem.setLandLevel(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Data["+ i +"].LandLevel"));
			dataItem.setSigningMode(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Data["+ i +"].SigningMode"));
			dataItem.setUseYear(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Data["+ i +"].UseYear"));
			dataItem.setIndustry(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Data["+ i +"].Industry"));
			dataItem.setPromiseDeliveryDate(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Data["+ i +"].PromiseDeliveryDate"));
			dataItem.setPromiseStartDate(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Data["+ i +"].PromiseStartDate"));
			dataItem.setPromiseEndDate(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Data["+ i +"].PromiseEndDate"));
			dataItem.setDepartment(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Data["+ i +"].Department"));
			dataItem.setPrice(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Data["+ i +"].Price"));
			dataItem.setVolumeFractionUpperBound(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Data["+ i +"].VolumeFractionUpperBound"));
			dataItem.setVolumeFractionLowerBound(_ctx.stringValue("GetOcOperationPurchaseLandResponse.Data["+ i +"].VolumeFractionLowerBound"));

			data.add(dataItem);
		}
		getOcOperationPurchaseLandResponse.setData(data);
	 
	 	return getOcOperationPurchaseLandResponse;
	}
}