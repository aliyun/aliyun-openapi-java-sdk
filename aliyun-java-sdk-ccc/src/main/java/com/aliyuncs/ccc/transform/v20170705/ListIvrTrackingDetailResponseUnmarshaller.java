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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.ListIvrTrackingDetailResponse;
import com.aliyuncs.ccc.model.v20170705.ListIvrTrackingDetailResponse.IvrTrackingDetails;
import com.aliyuncs.ccc.model.v20170705.ListIvrTrackingDetailResponse.IvrTrackingDetails.IvrTrackingDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIvrTrackingDetailResponseUnmarshaller {

	public static ListIvrTrackingDetailResponse unmarshall(ListIvrTrackingDetailResponse listIvrTrackingDetailResponse, UnmarshallerContext _ctx) {
		
		listIvrTrackingDetailResponse.setRequestId(_ctx.stringValue("ListIvrTrackingDetailResponse.RequestId"));
		listIvrTrackingDetailResponse.setHttpStatusCode(_ctx.integerValue("ListIvrTrackingDetailResponse.HttpStatusCode"));
		listIvrTrackingDetailResponse.setCode(_ctx.stringValue("ListIvrTrackingDetailResponse.Code"));
		listIvrTrackingDetailResponse.setMessage(_ctx.stringValue("ListIvrTrackingDetailResponse.Message"));
		listIvrTrackingDetailResponse.setSuccess(_ctx.booleanValue("ListIvrTrackingDetailResponse.Success"));

		IvrTrackingDetails ivrTrackingDetails = new IvrTrackingDetails();
		ivrTrackingDetails.setPageNumber(_ctx.integerValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.PageNumber"));
		ivrTrackingDetails.setPageSize(_ctx.integerValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.PageSize"));
		ivrTrackingDetails.setTotalCount(_ctx.integerValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.TotalCount"));

		List<IvrTrackingDetail> list = new ArrayList<IvrTrackingDetail>();
		for (int i = 0; i < _ctx.lengthValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List.Length"); i++) {
			IvrTrackingDetail ivrTrackingDetail = new IvrTrackingDetail();
			ivrTrackingDetail.setStatus(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].Status"));
			ivrTrackingDetail.setDeviceID(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].DeviceID"));
			ivrTrackingDetail.setInputData(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].InputData"));
			ivrTrackingDetail.setFlowName(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].FlowName"));
			ivrTrackingDetail.setCalledNumber(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].CalledNumber"));
			ivrTrackingDetail.setStopTime(_ctx.longValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].StopTime"));
			ivrTrackingDetail.setStartTime(_ctx.longValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].StartTime"));
			ivrTrackingDetail.setNodeType(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].NodeType"));
			ivrTrackingDetail.setDescription(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].Description"));
			ivrTrackingDetail.setNodeName(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].NodeName"));
			ivrTrackingDetail.setContactId(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].ContactId"));
			ivrTrackingDetail.setCallingNumber(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].CallingNumber"));
			ivrTrackingDetail.setOutputData(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].OutputData"));
			ivrTrackingDetail.setTenantId(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].TenantId"));

			list.add(ivrTrackingDetail);
		}
		ivrTrackingDetails.setList(list);
		listIvrTrackingDetailResponse.setIvrTrackingDetails(ivrTrackingDetails);
	 
	 	return listIvrTrackingDetailResponse;
	}
}