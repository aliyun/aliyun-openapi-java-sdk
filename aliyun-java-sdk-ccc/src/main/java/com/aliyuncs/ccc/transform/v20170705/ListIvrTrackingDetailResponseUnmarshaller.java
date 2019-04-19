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

	public static ListIvrTrackingDetailResponse unmarshall(ListIvrTrackingDetailResponse listIvrTrackingDetailResponse, UnmarshallerContext context) {
		
		listIvrTrackingDetailResponse.setRequestId(context.stringValue("ListIvrTrackingDetailResponse.RequestId"));
		listIvrTrackingDetailResponse.setSuccess(context.booleanValue("ListIvrTrackingDetailResponse.Success"));
		listIvrTrackingDetailResponse.setCode(context.stringValue("ListIvrTrackingDetailResponse.Code"));
		listIvrTrackingDetailResponse.setMessage(context.stringValue("ListIvrTrackingDetailResponse.Message"));
		listIvrTrackingDetailResponse.setHttpStatusCode(context.integerValue("ListIvrTrackingDetailResponse.HttpStatusCode"));

		IvrTrackingDetails ivrTrackingDetails = new IvrTrackingDetails();
		ivrTrackingDetails.setTotalCount(context.integerValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.TotalCount"));
		ivrTrackingDetails.setPageNumber(context.integerValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.PageNumber"));
		ivrTrackingDetails.setPageSize(context.integerValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.PageSize"));

		List<IvrTrackingDetail> list = new ArrayList<IvrTrackingDetail>();
		for (int i = 0; i < context.lengthValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List.Length"); i++) {
			IvrTrackingDetail ivrTrackingDetail = new IvrTrackingDetail();
			ivrTrackingDetail.setFlowName(context.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].FlowName"));
			ivrTrackingDetail.setNodeName(context.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].NodeName"));
			ivrTrackingDetail.setNodeType(context.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].NodeType"));
			ivrTrackingDetail.setContactId(context.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].ContactId"));
			ivrTrackingDetail.setCallingNumber(context.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].CallingNumber"));
			ivrTrackingDetail.setCalledNumber(context.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].CalledNumber"));
			ivrTrackingDetail.setStartTime(context.longValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].StartTime"));
			ivrTrackingDetail.setStopTime(context.longValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].StopTime"));
			ivrTrackingDetail.setStatus(context.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].Status"));
			ivrTrackingDetail.setInputData(context.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].InputData"));
			ivrTrackingDetail.setOutputData(context.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].OutputData"));
			ivrTrackingDetail.setDescription(context.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].Description"));
			ivrTrackingDetail.setDeviceID(context.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].DeviceID"));
			ivrTrackingDetail.setTenantId(context.stringValue("ListIvrTrackingDetailResponse.IvrTrackingDetails.List["+ i +"].TenantId"));

			list.add(ivrTrackingDetail);
		}
		ivrTrackingDetails.setList(list);
		listIvrTrackingDetailResponse.setIvrTrackingDetails(ivrTrackingDetails);
	 
	 	return listIvrTrackingDetailResponse;
	}
}