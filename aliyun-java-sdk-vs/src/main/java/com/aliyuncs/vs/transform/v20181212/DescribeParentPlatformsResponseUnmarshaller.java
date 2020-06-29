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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeParentPlatformsResponse;
import com.aliyuncs.vs.model.v20181212.DescribeParentPlatformsResponse.Platform;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParentPlatformsResponseUnmarshaller {

	public static DescribeParentPlatformsResponse unmarshall(DescribeParentPlatformsResponse describeParentPlatformsResponse, UnmarshallerContext _ctx) {
		
		describeParentPlatformsResponse.setRequestId(_ctx.stringValue("DescribeParentPlatformsResponse.RequestId"));
		describeParentPlatformsResponse.setPageSize(_ctx.longValue("DescribeParentPlatformsResponse.PageSize"));
		describeParentPlatformsResponse.setPageNum(_ctx.longValue("DescribeParentPlatformsResponse.PageNum"));
		describeParentPlatformsResponse.setPageCount(_ctx.longValue("DescribeParentPlatformsResponse.PageCount"));
		describeParentPlatformsResponse.setTotalCount(_ctx.longValue("DescribeParentPlatformsResponse.TotalCount"));

		List<Platform> platforms = new ArrayList<Platform>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParentPlatformsResponse.Platforms.Length"); i++) {
			Platform platform = new Platform();
			platform.setId(_ctx.stringValue("DescribeParentPlatformsResponse.Platforms["+ i +"].Id"));
			platform.setName(_ctx.stringValue("DescribeParentPlatformsResponse.Platforms["+ i +"].Name"));
			platform.setDescription(_ctx.stringValue("DescribeParentPlatformsResponse.Platforms["+ i +"].Description"));
			platform.setBizProtocol(_ctx.stringValue("DescribeParentPlatformsResponse.Platforms["+ i +"].Protocol"));
			platform.setStatus(_ctx.stringValue("DescribeParentPlatformsResponse.Platforms["+ i +"].Status"));
			platform.setGbId(_ctx.stringValue("DescribeParentPlatformsResponse.Platforms["+ i +"].GbId"));
			platform.setIp(_ctx.stringValue("DescribeParentPlatformsResponse.Platforms["+ i +"].Ip"));
			platform.setPort(_ctx.longValue("DescribeParentPlatformsResponse.Platforms["+ i +"].Port"));
			platform.setClientGbId(_ctx.stringValue("DescribeParentPlatformsResponse.Platforms["+ i +"].ClientGbId"));
			platform.setClientAuth(_ctx.booleanValue("DescribeParentPlatformsResponse.Platforms["+ i +"].ClientAuth"));
			platform.setClientUsername(_ctx.stringValue("DescribeParentPlatformsResponse.Platforms["+ i +"].ClientUsername"));
			platform.setClientPassword(_ctx.stringValue("DescribeParentPlatformsResponse.Platforms["+ i +"].ClientPassword"));
			platform.setClientIp(_ctx.stringValue("DescribeParentPlatformsResponse.Platforms["+ i +"].ClientIp"));
			platform.setClientPort(_ctx.longValue("DescribeParentPlatformsResponse.Platforms["+ i +"].ClientPort"));
			platform.setAutoStart(_ctx.booleanValue("DescribeParentPlatformsResponse.Platforms["+ i +"].AutoStart"));
			platform.setCreatedTime(_ctx.stringValue("DescribeParentPlatformsResponse.Platforms["+ i +"].CreatedTime"));

			platforms.add(platform);
		}
		describeParentPlatformsResponse.setPlatforms(platforms);
	 
	 	return describeParentPlatformsResponse;
	}
}