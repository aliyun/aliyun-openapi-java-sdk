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

package com.aliyuncs.lto.transform.v20210707;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lto.model.v20210707.DescribeDashboardMemberDeviceInfoResponse;
import com.aliyuncs.lto.model.v20210707.DescribeDashboardMemberDeviceInfoResponse.DataItem;
import com.aliyuncs.lto.model.v20210707.DescribeDashboardMemberDeviceInfoResponse.DataItem.MemberInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDashboardMemberDeviceInfoResponseUnmarshaller {

	public static DescribeDashboardMemberDeviceInfoResponse unmarshall(DescribeDashboardMemberDeviceInfoResponse describeDashboardMemberDeviceInfoResponse, UnmarshallerContext _ctx) {
		
		describeDashboardMemberDeviceInfoResponse.setRequestId(_ctx.stringValue("DescribeDashboardMemberDeviceInfoResponse.RequestId"));
		describeDashboardMemberDeviceInfoResponse.setCode(_ctx.stringValue("DescribeDashboardMemberDeviceInfoResponse.Code"));
		describeDashboardMemberDeviceInfoResponse.setHttpStatusCode(_ctx.integerValue("DescribeDashboardMemberDeviceInfoResponse.HttpStatusCode"));
		describeDashboardMemberDeviceInfoResponse.setMessage(_ctx.stringValue("DescribeDashboardMemberDeviceInfoResponse.Message"));
		describeDashboardMemberDeviceInfoResponse.setSuccess(_ctx.booleanValue("DescribeDashboardMemberDeviceInfoResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDashboardMemberDeviceInfoResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setMemberName(_ctx.stringValue("DescribeDashboardMemberDeviceInfoResponse.Data["+ i +"].MemberName"));

			List<MemberInfo> memberInfoList = new ArrayList<MemberInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDashboardMemberDeviceInfoResponse.Data["+ i +"].MemberInfoList.Length"); j++) {
				MemberInfo memberInfo = new MemberInfo();
				memberInfo.setTime(_ctx.longValue("DescribeDashboardMemberDeviceInfoResponse.Data["+ i +"].MemberInfoList["+ j +"].Time"));
				memberInfo.setDeviceCount(_ctx.integerValue("DescribeDashboardMemberDeviceInfoResponse.Data["+ i +"].MemberInfoList["+ j +"].DeviceCount"));

				memberInfoList.add(memberInfo);
			}
			dataItem.setMemberInfoList(memberInfoList);

			data.add(dataItem);
		}
		describeDashboardMemberDeviceInfoResponse.setData(data);
	 
	 	return describeDashboardMemberDeviceInfoResponse;
	}
}