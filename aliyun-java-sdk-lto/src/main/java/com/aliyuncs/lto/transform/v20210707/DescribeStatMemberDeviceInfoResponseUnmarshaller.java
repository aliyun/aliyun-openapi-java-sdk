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

import com.aliyuncs.lto.model.v20210707.DescribeStatMemberDeviceInfoResponse;
import com.aliyuncs.lto.model.v20210707.DescribeStatMemberDeviceInfoResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStatMemberDeviceInfoResponseUnmarshaller {

	public static DescribeStatMemberDeviceInfoResponse unmarshall(DescribeStatMemberDeviceInfoResponse describeStatMemberDeviceInfoResponse, UnmarshallerContext _ctx) {
		
		describeStatMemberDeviceInfoResponse.setRequestId(_ctx.stringValue("DescribeStatMemberDeviceInfoResponse.RequestId"));
		describeStatMemberDeviceInfoResponse.setCode(_ctx.stringValue("DescribeStatMemberDeviceInfoResponse.Code"));
		describeStatMemberDeviceInfoResponse.setHttpStatusCode(_ctx.integerValue("DescribeStatMemberDeviceInfoResponse.HttpStatusCode"));
		describeStatMemberDeviceInfoResponse.setMessage(_ctx.stringValue("DescribeStatMemberDeviceInfoResponse.Message"));
		describeStatMemberDeviceInfoResponse.setSuccess(_ctx.booleanValue("DescribeStatMemberDeviceInfoResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStatMemberDeviceInfoResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setMemberId(_ctx.stringValue("DescribeStatMemberDeviceInfoResponse.Data["+ i +"].MemberId"));
			dataItem.setMemberName(_ctx.stringValue("DescribeStatMemberDeviceInfoResponse.Data["+ i +"].MemberName"));
			dataItem.setBizChainCount(_ctx.stringValue("DescribeStatMemberDeviceInfoResponse.Data["+ i +"].BizChainCount"));
			dataItem.setAuthorizedCount(_ctx.stringValue("DescribeStatMemberDeviceInfoResponse.Data["+ i +"].AuthorizedCount"));
			dataItem.setUsedCount(_ctx.stringValue("DescribeStatMemberDeviceInfoResponse.Data["+ i +"].UsedCount"));

			data.add(dataItem);
		}
		describeStatMemberDeviceInfoResponse.setData(data);
	 
	 	return describeStatMemberDeviceInfoResponse;
	}
}