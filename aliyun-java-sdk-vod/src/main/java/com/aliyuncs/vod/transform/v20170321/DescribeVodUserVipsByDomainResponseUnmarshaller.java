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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.DescribeVodUserVipsByDomainResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodUserVipsByDomainResponseUnmarshaller {

	public static DescribeVodUserVipsByDomainResponse unmarshall(DescribeVodUserVipsByDomainResponse describeVodUserVipsByDomainResponse, UnmarshallerContext _ctx) {
		
		describeVodUserVipsByDomainResponse.setRequestId(_ctx.stringValue("DescribeVodUserVipsByDomainResponse.RequestId"));
		describeVodUserVipsByDomainResponse.setDomainName(_ctx.stringValue("DescribeVodUserVipsByDomainResponse.DomainName"));

		List<String> vips = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodUserVipsByDomainResponse.Vips.Length"); i++) {
			vips.add(_ctx.stringValue("DescribeVodUserVipsByDomainResponse.Vips["+ i +"]"));
		}
		describeVodUserVipsByDomainResponse.setVips(vips);
	 
	 	return describeVodUserVipsByDomainResponse;
	}
}