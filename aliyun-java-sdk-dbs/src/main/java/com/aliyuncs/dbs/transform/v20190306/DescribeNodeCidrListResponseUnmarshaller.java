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

	public static DescribeNodeCidrListResponse unmarshall(DescribeNodeCidrListResponse describeNodeCidrListResponse, UnmarshallerContext context) {
		
		describeNodeCidrListResponse.setRequestId(context.stringValue("DescribeNodeCidrListResponse.RequestId"));
		describeNodeCidrListResponse.setSuccess(context.booleanValue("DescribeNodeCidrListResponse.Success"));
		describeNodeCidrListResponse.setErrCode(context.stringValue("DescribeNodeCidrListResponse.ErrCode"));
		describeNodeCidrListResponse.setErrMessage(context.stringValue("DescribeNodeCidrListResponse.ErrMessage"));
		describeNodeCidrListResponse.setHttpStatusCode(context.integerValue("DescribeNodeCidrListResponse.HttpStatusCode"));

		List<String> internetIPs = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeNodeCidrListResponse.InternetIPs.Length"); i++) {
			internetIPs.add(context.stringValue("DescribeNodeCidrListResponse.InternetIPs["+ i +"]"));
		}
		describeNodeCidrListResponse.setInternetIPs(internetIPs);

		List<String> intranetIPs = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeNodeCidrListResponse.IntranetIPs.Length"); i++) {
			intranetIPs.add(context.stringValue("DescribeNodeCidrListResponse.IntranetIPs["+ i +"]"));
		}
		describeNodeCidrListResponse.setIntranetIPs(intranetIPs);
	 
	 	return describeNodeCidrListResponse;
	}
}