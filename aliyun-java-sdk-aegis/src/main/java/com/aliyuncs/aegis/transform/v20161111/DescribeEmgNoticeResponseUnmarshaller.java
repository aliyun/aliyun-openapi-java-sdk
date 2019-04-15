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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeEmgNoticeResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeEmgNoticeResponse.EmgVulGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEmgNoticeResponseUnmarshaller {

	public static DescribeEmgNoticeResponse unmarshall(DescribeEmgNoticeResponse describeEmgNoticeResponse, UnmarshallerContext context) {
		
		describeEmgNoticeResponse.setRequestId(context.stringValue("DescribeEmgNoticeResponse.RequestId"));
		describeEmgNoticeResponse.setTotalCount(context.integerValue("DescribeEmgNoticeResponse.TotalCount"));

		List<EmgVulGroup> emgVulGroupList = new ArrayList<EmgVulGroup>();
		for (int i = 0; i < context.lengthValue("DescribeEmgNoticeResponse.EmgVulGroupList.Length"); i++) {
			EmgVulGroup emgVulGroup = new EmgVulGroup();
			emgVulGroup.setAliasName(context.stringValue("DescribeEmgNoticeResponse.EmgVulGroupList["+ i +"].AliasName"));
			emgVulGroup.setName(context.stringValue("DescribeEmgNoticeResponse.EmgVulGroupList["+ i +"].Name"));
			emgVulGroup.setGmtPublish(context.longValue("DescribeEmgNoticeResponse.EmgVulGroupList["+ i +"].GmtPublish"));
			emgVulGroup.setDescription(context.stringValue("DescribeEmgNoticeResponse.EmgVulGroupList["+ i +"].Description"));
			emgVulGroup.setType(context.stringValue("DescribeEmgNoticeResponse.EmgVulGroupList["+ i +"].Type"));
			emgVulGroup.setStatus(context.integerValue("DescribeEmgNoticeResponse.EmgVulGroupList["+ i +"].Status"));

			emgVulGroupList.add(emgVulGroup);
		}
		describeEmgNoticeResponse.setEmgVulGroupList(emgVulGroupList);
	 
	 	return describeEmgNoticeResponse;
	}
}