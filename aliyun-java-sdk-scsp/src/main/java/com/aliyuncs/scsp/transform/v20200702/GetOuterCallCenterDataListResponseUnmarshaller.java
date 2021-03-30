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

package com.aliyuncs.scsp.transform.v20200702;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scsp.model.v20200702.GetOuterCallCenterDataListResponse;
import com.aliyuncs.scsp.model.v20200702.GetOuterCallCenterDataListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOuterCallCenterDataListResponseUnmarshaller {

	public static GetOuterCallCenterDataListResponse unmarshall(GetOuterCallCenterDataListResponse getOuterCallCenterDataListResponse, UnmarshallerContext _ctx) {
		
		getOuterCallCenterDataListResponse.setRequestId(_ctx.stringValue("GetOuterCallCenterDataListResponse.RequestId"));
		getOuterCallCenterDataListResponse.setMessage(_ctx.stringValue("GetOuterCallCenterDataListResponse.Message"));
		getOuterCallCenterDataListResponse.setCode(_ctx.stringValue("GetOuterCallCenterDataListResponse.Code"));
		getOuterCallCenterDataListResponse.setSuccess(_ctx.booleanValue("GetOuterCallCenterDataListResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOuterCallCenterDataListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setFromPhoneNum(_ctx.stringValue("GetOuterCallCenterDataListResponse.Data["+ i +"].FromPhoneNum"));
			dataItem.setToPhoneNum(_ctx.stringValue("GetOuterCallCenterDataListResponse.Data["+ i +"].ToPhoneNum"));
			dataItem.setAcid(_ctx.stringValue("GetOuterCallCenterDataListResponse.Data["+ i +"].Acid"));
			dataItem.setEndReason(_ctx.stringValue("GetOuterCallCenterDataListResponse.Data["+ i +"].EndReason"));
			dataItem.setExtInfo(_ctx.stringValue("GetOuterCallCenterDataListResponse.Data["+ i +"].ExtInfo"));
			dataItem.setCallType(_ctx.stringValue("GetOuterCallCenterDataListResponse.Data["+ i +"].CallType"));
			dataItem.setBizType(_ctx.stringValue("GetOuterCallCenterDataListResponse.Data["+ i +"].BizType"));
			dataItem.setUserInfo(_ctx.stringValue("GetOuterCallCenterDataListResponse.Data["+ i +"].UserInfo"));
			dataItem.setSessionId(_ctx.stringValue("GetOuterCallCenterDataListResponse.Data["+ i +"].SessionId"));
			dataItem.setBizId(_ctx.stringValue("GetOuterCallCenterDataListResponse.Data["+ i +"].BizId"));
			dataItem.setInterveneTime(_ctx.stringValue("GetOuterCallCenterDataListResponse.Data["+ i +"].InterveneTime"));

			data.add(dataItem);
		}
		getOuterCallCenterDataListResponse.setData(data);
	 
	 	return getOuterCallCenterDataListResponse;
	}
}