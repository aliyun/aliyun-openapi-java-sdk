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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryDeviceEventRecordResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryDeviceEventRecordResponse.VodInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceEventRecordResponseUnmarshaller {

	public static QueryDeviceEventRecordResponse unmarshall(QueryDeviceEventRecordResponse queryDeviceEventRecordResponse, UnmarshallerContext _ctx) {
		
		queryDeviceEventRecordResponse.setRequestId(_ctx.stringValue("QueryDeviceEventRecordResponse.RequestId"));
		queryDeviceEventRecordResponse.setSuccess(_ctx.booleanValue("QueryDeviceEventRecordResponse.Success"));
		queryDeviceEventRecordResponse.setErrorMessage(_ctx.stringValue("QueryDeviceEventRecordResponse.ErrorMessage"));
		queryDeviceEventRecordResponse.setCode(_ctx.integerValue("QueryDeviceEventRecordResponse.Code"));

		List<VodInfo> data = new ArrayList<VodInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceEventRecordResponse.Data.Length"); i++) {
			VodInfo vodInfo = new VodInfo();
			vodInfo.setFileName(_ctx.stringValue("QueryDeviceEventRecordResponse.Data["+ i +"].FileName"));
			vodInfo.setVodUrl(_ctx.stringValue("QueryDeviceEventRecordResponse.Data["+ i +"].VodUrl"));
			vodInfo.setBeginTime(_ctx.stringValue("QueryDeviceEventRecordResponse.Data["+ i +"].BeginTime"));
			vodInfo.setEndTime(_ctx.stringValue("QueryDeviceEventRecordResponse.Data["+ i +"].EndTime"));

			data.add(vodInfo);
		}
		queryDeviceEventRecordResponse.setData(data);
	 
	 	return queryDeviceEventRecordResponse;
	}
}