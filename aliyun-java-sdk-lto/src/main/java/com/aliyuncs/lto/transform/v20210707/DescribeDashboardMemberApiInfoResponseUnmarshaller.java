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

import com.aliyuncs.lto.model.v20210707.DescribeDashboardMemberApiInfoResponse;
import com.aliyuncs.lto.model.v20210707.DescribeDashboardMemberApiInfoResponse.DataItem;
import com.aliyuncs.lto.model.v20210707.DescribeDashboardMemberApiInfoResponse.DataItem.MemberInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDashboardMemberApiInfoResponseUnmarshaller {

	public static DescribeDashboardMemberApiInfoResponse unmarshall(DescribeDashboardMemberApiInfoResponse describeDashboardMemberApiInfoResponse, UnmarshallerContext _ctx) {
		
		describeDashboardMemberApiInfoResponse.setRequestId(_ctx.stringValue("DescribeDashboardMemberApiInfoResponse.RequestId"));
		describeDashboardMemberApiInfoResponse.setCode(_ctx.stringValue("DescribeDashboardMemberApiInfoResponse.Code"));
		describeDashboardMemberApiInfoResponse.setHttpStatusCode(_ctx.integerValue("DescribeDashboardMemberApiInfoResponse.HttpStatusCode"));
		describeDashboardMemberApiInfoResponse.setMessage(_ctx.stringValue("DescribeDashboardMemberApiInfoResponse.Message"));
		describeDashboardMemberApiInfoResponse.setSuccess(_ctx.booleanValue("DescribeDashboardMemberApiInfoResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDashboardMemberApiInfoResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setMemberName(_ctx.stringValue("DescribeDashboardMemberApiInfoResponse.Data["+ i +"].MemberName"));

			List<MemberInfo> memberInfoList = new ArrayList<MemberInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDashboardMemberApiInfoResponse.Data["+ i +"].MemberInfoList.Length"); j++) {
				MemberInfo memberInfo = new MemberInfo();
				memberInfo.setTime(_ctx.longValue("DescribeDashboardMemberApiInfoResponse.Data["+ i +"].MemberInfoList["+ j +"].Time"));
				memberInfo.setApiInvokeCount(_ctx.longValue("DescribeDashboardMemberApiInfoResponse.Data["+ i +"].MemberInfoList["+ j +"].ApiInvokeCount"));

				memberInfoList.add(memberInfo);
			}
			dataItem.setMemberInfoList(memberInfoList);

			data.add(dataItem);
		}
		describeDashboardMemberApiInfoResponse.setData(data);
	 
	 	return describeDashboardMemberApiInfoResponse;
	}
}