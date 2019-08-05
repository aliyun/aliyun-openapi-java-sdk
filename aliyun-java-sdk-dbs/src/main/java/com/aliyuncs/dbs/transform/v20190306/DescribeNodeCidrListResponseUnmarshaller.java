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

package com.aliyuncs.dbs.transform.v20190306;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dbs.model.v20190306.DescribeNodeCidrListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNodeCidrListResponseUnmarshaller {

	public static DescribeNodeCidrListResponse unmarshall(DescribeNodeCidrListResponse describeNodeCidrListResponse, UnmarshallerContext _ctx) {
		
		describeNodeCidrListResponse.setRequestId(_ctx.stringValue("DescribeNodeCidrListResponse.RequestId"));
		describeNodeCidrListResponse.setSuccess(_ctx.booleanValue("DescribeNodeCidrListResponse.Success"));
		describeNodeCidrListResponse.setErrCode(_ctx.stringValue("DescribeNodeCidrListResponse.ErrCode"));
		describeNodeCidrListResponse.setErrMessage(_ctx.stringValue("DescribeNodeCidrListResponse.ErrMessage"));
		describeNodeCidrListResponse.setHttpStatusCode(_ctx.integerValue("DescribeNodeCidrListResponse.HttpStatusCode"));

		List<String> internetIPs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNodeCidrListResponse.InternetIPs.Length"); i++) {
			internetIPs.add(_ctx.stringValue("DescribeNodeCidrListResponse.InternetIPs["+ i +"]"));
		}
		describeNodeCidrListResponse.setInternetIPs(internetIPs);

		List<String> intranetIPs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNodeCidrListResponse.IntranetIPs.Length"); i++) {
			intranetIPs.add(_ctx.stringValue("DescribeNodeCidrListResponse.IntranetIPs["+ i +"]"));
		}
		describeNodeCidrListResponse.setIntranetIPs(intranetIPs);
	 
	 	return describeNodeCidrListResponse;
	}
}