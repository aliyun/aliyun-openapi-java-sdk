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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryPageByApplyIdResponse;
import com.aliyuncs.iot.model.v20180120.QueryPageByApplyIdResponse.ApplyDeviceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPageByApplyIdResponseUnmarshaller {

	public static QueryPageByApplyIdResponse unmarshall(QueryPageByApplyIdResponse queryPageByApplyIdResponse, UnmarshallerContext _ctx) {
		
		queryPageByApplyIdResponse.setRequestId(_ctx.stringValue("QueryPageByApplyIdResponse.RequestId"));
		queryPageByApplyIdResponse.setSuccess(_ctx.booleanValue("QueryPageByApplyIdResponse.Success"));
		queryPageByApplyIdResponse.setCode(_ctx.stringValue("QueryPageByApplyIdResponse.Code"));
		queryPageByApplyIdResponse.setErrorMessage(_ctx.stringValue("QueryPageByApplyIdResponse.ErrorMessage"));
		queryPageByApplyIdResponse.setPageSize(_ctx.integerValue("QueryPageByApplyIdResponse.PageSize"));
		queryPageByApplyIdResponse.setPage(_ctx.integerValue("QueryPageByApplyIdResponse.Page"));
		queryPageByApplyIdResponse.setPageCount(_ctx.integerValue("QueryPageByApplyIdResponse.PageCount"));
		queryPageByApplyIdResponse.setTotal(_ctx.integerValue("QueryPageByApplyIdResponse.Total"));

		List<ApplyDeviceInfo> applyDeviceList = new ArrayList<ApplyDeviceInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryPageByApplyIdResponse.ApplyDeviceList.Length"); i++) {
			ApplyDeviceInfo applyDeviceInfo = new ApplyDeviceInfo();
			applyDeviceInfo.setDeviceId(_ctx.stringValue("QueryPageByApplyIdResponse.ApplyDeviceList["+ i +"].DeviceId"));
			applyDeviceInfo.setDeviceName(_ctx.stringValue("QueryPageByApplyIdResponse.ApplyDeviceList["+ i +"].DeviceName"));
			applyDeviceInfo.setDeviceSecret(_ctx.stringValue("QueryPageByApplyIdResponse.ApplyDeviceList["+ i +"].DeviceSecret"));
			applyDeviceInfo.setIotId(_ctx.stringValue("QueryPageByApplyIdResponse.ApplyDeviceList["+ i +"].IotId"));

			applyDeviceList.add(applyDeviceInfo);
		}
		queryPageByApplyIdResponse.setApplyDeviceList(applyDeviceList);
	 
	 	return queryPageByApplyIdResponse;
	}
}