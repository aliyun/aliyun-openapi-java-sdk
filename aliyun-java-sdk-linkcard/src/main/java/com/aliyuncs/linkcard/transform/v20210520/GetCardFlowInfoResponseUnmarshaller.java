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

package com.aliyuncs.linkcard.transform.v20210520;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkcard.model.v20210520.GetCardFlowInfoResponse;
import com.aliyuncs.linkcard.model.v20210520.GetCardFlowInfoResponse.Data;
import com.aliyuncs.linkcard.model.v20210520.GetCardFlowInfoResponse.Data.CardMonthFlow;
import com.aliyuncs.linkcard.model.v20210520.GetCardFlowInfoResponse.Data.CardMonthFlow.DayFlowDto;
import com.aliyuncs.linkcard.model.v20210520.GetCardFlowInfoResponse.Data.PackageDTO;
import com.aliyuncs.linkcard.model.v20210520.GetCardFlowInfoResponse.Data.VendorDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCardFlowInfoResponseUnmarshaller {

	public static GetCardFlowInfoResponse unmarshall(GetCardFlowInfoResponse getCardFlowInfoResponse, UnmarshallerContext _ctx) {
		
		getCardFlowInfoResponse.setRequestId(_ctx.stringValue("GetCardFlowInfoResponse.RequestId"));
		getCardFlowInfoResponse.setCode(_ctx.stringValue("GetCardFlowInfoResponse.Code"));
		getCardFlowInfoResponse.setErrorMessage(_ctx.stringValue("GetCardFlowInfoResponse.ErrorMessage"));
		getCardFlowInfoResponse.setSuccess(_ctx.booleanValue("GetCardFlowInfoResponse.Success"));
		getCardFlowInfoResponse.setLocalizedMessage(_ctx.stringValue("GetCardFlowInfoResponse.LocalizedMessage"));

		Data data = new Data();

		List<VendorDetail> listVendorDetail = new ArrayList<VendorDetail>();
		for (int i = 0; i < _ctx.lengthValue("GetCardFlowInfoResponse.Data.ListVendorDetail.Length"); i++) {
			VendorDetail vendorDetail = new VendorDetail();
			vendorDetail.setNetWorkDelay(_ctx.stringValue("GetCardFlowInfoResponse.Data.ListVendorDetail["+ i +"].NetWorkDelay"));
			vendorDetail.setSignalStrength(_ctx.stringValue("GetCardFlowInfoResponse.Data.ListVendorDetail["+ i +"].SignalStrength"));
			vendorDetail.setVendor(_ctx.stringValue("GetCardFlowInfoResponse.Data.ListVendorDetail["+ i +"].Vendor"));
			vendorDetail.setUsedFlow(_ctx.stringValue("GetCardFlowInfoResponse.Data.ListVendorDetail["+ i +"].UsedFlow"));
			vendorDetail.setRatio(_ctx.stringValue("GetCardFlowInfoResponse.Data.ListVendorDetail["+ i +"].Ratio"));

			listVendorDetail.add(vendorDetail);
		}
		data.setListVendorDetail(listVendorDetail);

		List<CardMonthFlow> listCardMonthFlow = new ArrayList<CardMonthFlow>();
		for (int i = 0; i < _ctx.lengthValue("GetCardFlowInfoResponse.Data.ListCardMonthFlow.Length"); i++) {
			CardMonthFlow cardMonthFlow = new CardMonthFlow();
			cardMonthFlow.setFlowCount(_ctx.stringValue("GetCardFlowInfoResponse.Data.ListCardMonthFlow["+ i +"].FlowCount"));
			cardMonthFlow.setMonth(_ctx.stringValue("GetCardFlowInfoResponse.Data.ListCardMonthFlow["+ i +"].Month"));

			List<DayFlowDto> listDayFlow = new ArrayList<DayFlowDto>();
			for (int j = 0; j < _ctx.lengthValue("GetCardFlowInfoResponse.Data.ListCardMonthFlow["+ i +"].ListDayFlow.Length"); j++) {
				DayFlowDto dayFlowDto = new DayFlowDto();
				dayFlowDto.setFlow(_ctx.stringValue("GetCardFlowInfoResponse.Data.ListCardMonthFlow["+ i +"].ListDayFlow["+ j +"].Flow"));
				dayFlowDto.setDay(_ctx.stringValue("GetCardFlowInfoResponse.Data.ListCardMonthFlow["+ i +"].ListDayFlow["+ j +"].Day"));

				listDayFlow.add(dayFlowDto);
			}
			cardMonthFlow.setListDayFlow(listDayFlow);

			listCardMonthFlow.add(cardMonthFlow);
		}
		data.setListCardMonthFlow(listCardMonthFlow);

		List<PackageDTO> listPackageDTO = new ArrayList<PackageDTO>();
		for (int i = 0; i < _ctx.lengthValue("GetCardFlowInfoResponse.Data.ListPackageDTO.Length"); i++) {
			PackageDTO packageDTO = new PackageDTO();
			packageDTO.setEffectiveTime(_ctx.stringValue("GetCardFlowInfoResponse.Data.ListPackageDTO["+ i +"].EffectiveTime"));
			packageDTO.setRemark(_ctx.stringValue("GetCardFlowInfoResponse.Data.ListPackageDTO["+ i +"].Remark"));
			packageDTO.setPackageName(_ctx.stringValue("GetCardFlowInfoResponse.Data.ListPackageDTO["+ i +"].PackageName"));
			packageDTO.setExpireTime(_ctx.stringValue("GetCardFlowInfoResponse.Data.ListPackageDTO["+ i +"].ExpireTime"));

			listPackageDTO.add(packageDTO);
		}
		data.setListPackageDTO(listPackageDTO);
		getCardFlowInfoResponse.setData(data);
	 
	 	return getCardFlowInfoResponse;
	}
}