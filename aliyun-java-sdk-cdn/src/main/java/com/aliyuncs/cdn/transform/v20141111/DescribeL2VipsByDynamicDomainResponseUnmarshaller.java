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

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeL2VipsByDynamicDomainResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeL2VipsByDynamicDomainResponseUnmarshaller {

	public static DescribeL2VipsByDynamicDomainResponse unmarshall(DescribeL2VipsByDynamicDomainResponse describeL2VipsByDynamicDomainResponse, UnmarshallerContext _ctx) {
		
		describeL2VipsByDynamicDomainResponse.setRequestId(_ctx.stringValue("DescribeL2VipsByDynamicDomainResponse.RequestId"));
		describeL2VipsByDynamicDomainResponse.setDomainName(_ctx.stringValue("DescribeL2VipsByDynamicDomainResponse.DomainName"));

		List<String> vips = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeL2VipsByDynamicDomainResponse.Vips.Length"); i++) {
			vips.add(_ctx.stringValue("DescribeL2VipsByDynamicDomainResponse.Vips["+ i +"]"));
		}
		describeL2VipsByDynamicDomainResponse.setVips(vips);
	 
	 	return describeL2VipsByDynamicDomainResponse;
	}
}