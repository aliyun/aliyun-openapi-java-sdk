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
		listIvrTrackingDetailResponse.setSuccess(_ctx.booleanValue("ListIvrTrackingDetailResponse.Success"));
		listIvrTrackingDetailResponse.setCode(_ctx.stringValue("ListIvrTrackingDetailResponse.Code"));
		listIvrTrackingDetailResponse.setMessage(_ctx.stringValue("ListIvrTrackingDetailResponse.Message"));
		listIvrTrackingDetailResponse.setHttpStatusCode(_ctx.integerValue("ListIvrTrackingDetailResponse.HttpStatusCode"));

		IvrTrackingDetails ivrTrackingDetails = new IvrTrackingDetails();
		ivrTrackingDetails.setTotalCount(_ctx.integerValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.TotalCount"));
		ivrTrackingDetails.setPageNumber(_ctx.integerValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.PageNumber"));
		ivrTrackingDetails.setPageSize(_ctx.integerValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.PageSize"));

		List<IvrTrackingDetail> list = new ArrayList<IvrTrackingDetail>();
		for (int i = 0; i < _ctx.lengthValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List.Length"); i++) {
			IvrTrackingDetail ivrTrackingDetail = new IvrTrackingDetail();
			ivrTrackingDetail.setFlowName(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].FlowName"));
			ivrTrackingDetail.setNodeName(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].NodeName"));
			ivrTrackingDetail.setNodeType(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].NodeType"));
			ivrTrackingDetail.setContactId(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].ContactId"));
			ivrTrackingDetail.setCallingNumber(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].CallingNumber"));
			ivrTrackingDetail.setCalledNumber(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].CalledNumber"));
			ivrTrackingDetail.setStartTime(_ctx.longValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].StartTime"));
			ivrTrackingDetail.setStopTime(_ctx.longValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].StopTime"));
			ivrTrackingDetail.setStatus(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].Status"));
			ivrTrackingDetail.setInputData(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].InputData"));
			ivrTrackingDetail.setOutputData(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].OutputData"));
			ivrTrackingDetail.setDescription(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].Description"));
			ivrTrackingDetail.setDeviceID(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].DeviceID"));
			ivrTrackingDetail.setTenantId(_ctx.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].TenantId"));

			list.add(ivrTrackingDetail);
		}
		ivrTrackingDetails.setList(list);
		listIvrTrackingDetailResponse.setIvrTrackingDetails(ivrTrackingDetails);
	 
	 	return listIvrTrackingDetailResponse;
	}
}