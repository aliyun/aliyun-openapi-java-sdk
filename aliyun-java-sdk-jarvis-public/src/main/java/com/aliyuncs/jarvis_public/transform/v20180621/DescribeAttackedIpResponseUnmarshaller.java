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

package com.aliyuncs.jarvis_public.transform.v20180621;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.jarvis_public.model.v20180621.DescribeAttackedIpResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAttackedIpResponseUnmarshaller {

	public static DescribeAttackedIpResponse unmarshall(DescribeAttackedIpResponse describeAttackedIpResponse, UnmarshallerContext context) {
		
		describeAttackedIpResponse.setRequestId(context.stringValue("DescribeAttackedIpResponse.RequestId"));
		describeAttackedIpResponse.setModule(context.stringValue("DescribeAttackedIpResponse.Module"));

		List<String> ipList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeAttackedIpResponse.IpList.Length"); i++) {
			ipList.add(context.stringValue("DescribeAttackedIpResponse.IpList["+ i +"]"));
		}
		describeAttackedIpResponse.setIpList(ipList);
	 
	 	return describeAttackedIpResponse;
	}
}