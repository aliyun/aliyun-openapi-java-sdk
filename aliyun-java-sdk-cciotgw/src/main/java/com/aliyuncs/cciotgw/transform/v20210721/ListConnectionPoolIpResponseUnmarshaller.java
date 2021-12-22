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

package com.aliyuncs.cciotgw.transform.v20210721;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cciotgw.model.v20210721.ListConnectionPoolIpResponse;
import com.aliyuncs.cciotgw.model.v20210721.ListConnectionPoolIpResponse.IpInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConnectionPoolIpResponseUnmarshaller {

	public static ListConnectionPoolIpResponse unmarshall(ListConnectionPoolIpResponse listConnectionPoolIpResponse, UnmarshallerContext _ctx) {
		
		listConnectionPoolIpResponse.setRequestId(_ctx.stringValue("ListConnectionPoolIpResponse.RequestId"));
		listConnectionPoolIpResponse.setCode(_ctx.stringValue("ListConnectionPoolIpResponse.Code"));
		listConnectionPoolIpResponse.setMessage(_ctx.stringValue("ListConnectionPoolIpResponse.Message"));
		listConnectionPoolIpResponse.setSuccess(_ctx.stringValue("ListConnectionPoolIpResponse.Success"));
		listConnectionPoolIpResponse.setCount(_ctx.longValue("ListConnectionPoolIpResponse.Count"));
		listConnectionPoolIpResponse.setPageSize(_ctx.longValue("ListConnectionPoolIpResponse.PageSize"));
		listConnectionPoolIpResponse.setPageId(_ctx.stringValue("ListConnectionPoolIpResponse.PageId"));

		List<IpInfo> ipInfoList = new ArrayList<IpInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListConnectionPoolIpResponse.IpInfoList.Length"); i++) {
			IpInfo ipInfo = new IpInfo();
			ipInfo.setIp(_ctx.stringValue("ListConnectionPoolIpResponse.IpInfoList["+ i +"].Ip"));
			ipInfo.setCciotId(_ctx.stringValue("ListConnectionPoolIpResponse.IpInfoList["+ i +"].CciotId"));
			ipInfo.setConnectionPoolId(_ctx.stringValue("ListConnectionPoolIpResponse.IpInfoList["+ i +"].ConnectionPoolId"));
			ipInfo.setStatus(_ctx.stringValue("ListConnectionPoolIpResponse.IpInfoList["+ i +"].Status"));

			ipInfoList.add(ipInfo);
		}
		listConnectionPoolIpResponse.setIpInfoList(ipInfoList);
	 
	 	return listConnectionPoolIpResponse;
	}
}