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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeUserVipsByDomainResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserVipsByDomainResponseUnmarshaller {

	public static DescribeUserVipsByDomainResponse unmarshall(DescribeUserVipsByDomainResponse describeUserVipsByDomainResponse, UnmarshallerContext _ctx) {
		
		describeUserVipsByDomainResponse.setRequestId(_ctx.stringValue("DescribeUserVipsByDomainResponse.RequestId"));
		describeUserVipsByDomainResponse.setDomainName(_ctx.stringValue("DescribeUserVipsByDomainResponse.DomainName"));

		List<String> vips = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserVipsByDomainResponse.Vips.Length"); i++) {
			vips.add(_ctx.stringValue("DescribeUserVipsByDomainResponse.Vips["+ i +"]"));
		}
		describeUserVipsByDomainResponse.setVips(vips);
	 
	 	return describeUserVipsByDomainResponse;
	}
}