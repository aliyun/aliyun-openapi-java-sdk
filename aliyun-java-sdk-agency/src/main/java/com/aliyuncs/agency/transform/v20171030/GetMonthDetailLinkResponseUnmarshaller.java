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

package com.aliyuncs.agency.transform.v20171030;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.agency.model.v20171030.GetMonthDetailLinkResponse;
import com.aliyuncs.agency.model.v20171030.GetMonthDetailLinkResponse.BillDownloadDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMonthDetailLinkResponseUnmarshaller {

	public static GetMonthDetailLinkResponse unmarshall(GetMonthDetailLinkResponse getMonthDetailLinkResponse, UnmarshallerContext _ctx) {
		
		getMonthDetailLinkResponse.setRequestId(_ctx.stringValue("GetMonthDetailLinkResponse.RequestId"));
		getMonthDetailLinkResponse.setCode(_ctx.stringValue("GetMonthDetailLinkResponse.Code"));
		getMonthDetailLinkResponse.setMessage(_ctx.stringValue("GetMonthDetailLinkResponse.Message"));
		getMonthDetailLinkResponse.setSuccess(_ctx.booleanValue("GetMonthDetailLinkResponse.Success"));

		List<BillDownloadDTO> data = new ArrayList<BillDownloadDTO>();
		for (int i = 0; i < _ctx.lengthValue("GetMonthDetailLinkResponse.Data.Length"); i++) {
			BillDownloadDTO billDownloadDTO = new BillDownloadDTO();
			billDownloadDTO.setUserType(_ctx.stringValue("GetMonthDetailLinkResponse.Data["+ i +"].UserType"));
			billDownloadDTO.setBillType(_ctx.stringValue("GetMonthDetailLinkResponse.Data["+ i +"].BillType"));
			billDownloadDTO.setBillLink(_ctx.stringValue("GetMonthDetailLinkResponse.Data["+ i +"].BillLink"));
			billDownloadDTO.setId(_ctx.longValue("GetMonthDetailLinkResponse.Data["+ i +"].Id"));
			billDownloadDTO.setBillTime(_ctx.stringValue("GetMonthDetailLinkResponse.Data["+ i +"].BillTime"));
			billDownloadDTO.setUid(_ctx.longValue("GetMonthDetailLinkResponse.Data["+ i +"].Uid"));

			data.add(billDownloadDTO);
		}
		getMonthDetailLinkResponse.setData(data);
	 
	 	return getMonthDetailLinkResponse;
	}
}