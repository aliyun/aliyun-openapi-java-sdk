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

import com.aliyuncs.lto.model.v20210707.DescribeAdminInfoResponse;
import com.aliyuncs.lto.model.v20210707.DescribeAdminInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAdminInfoResponseUnmarshaller {

	public static DescribeAdminInfoResponse unmarshall(DescribeAdminInfoResponse describeAdminInfoResponse, UnmarshallerContext _ctx) {
		
		describeAdminInfoResponse.setRequestId(_ctx.stringValue("DescribeAdminInfoResponse.RequestId"));
		describeAdminInfoResponse.setCode(_ctx.stringValue("DescribeAdminInfoResponse.Code"));
		describeAdminInfoResponse.setHttpStatusCode(_ctx.integerValue("DescribeAdminInfoResponse.HttpStatusCode"));
		describeAdminInfoResponse.setMessage(_ctx.stringValue("DescribeAdminInfoResponse.Message"));
		describeAdminInfoResponse.setSuccess(_ctx.booleanValue("DescribeAdminInfoResponse.Success"));

		Data data = new Data();
		data.setMemberId(_ctx.stringValue("DescribeAdminInfoResponse.Data.MemberId"));
		data.setUid(_ctx.stringValue("DescribeAdminInfoResponse.Data.Uid"));
		data.setName(_ctx.stringValue("DescribeAdminInfoResponse.Data.Name"));
		data.setAuthorizedCount(_ctx.longValue("DescribeAdminInfoResponse.Data.AuthorizedCount"));
		data.setAuthorizedDeviceCount(_ctx.longValue("DescribeAdminInfoResponse.Data.AuthorizedDeviceCount"));
		data.setContactor(_ctx.stringValue("DescribeAdminInfoResponse.Data.Contactor"));
		data.setTelephony(_ctx.stringValue("DescribeAdminInfoResponse.Data.Telephony"));
		data.setRemark(_ctx.stringValue("DescribeAdminInfoResponse.Data.Remark"));
		data.setStatus(_ctx.stringValue("DescribeAdminInfoResponse.Data.Status"));
		data.setAccessStatus(_ctx.stringValue("DescribeAdminInfoResponse.Data.AccessStatus"));
		data.setAccessDate(_ctx.longValue("DescribeAdminInfoResponse.Data.AccessDate"));
		describeAdminInfoResponse.setData(data);
	 
	 	return describeAdminInfoResponse;
	}
}