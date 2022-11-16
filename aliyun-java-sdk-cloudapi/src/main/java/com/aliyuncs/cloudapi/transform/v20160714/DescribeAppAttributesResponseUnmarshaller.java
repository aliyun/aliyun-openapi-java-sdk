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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeAppAttributesResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeAppAttributesResponse.AppAttribute;
import com.aliyuncs.cloudapi.model.v20160714.DescribeAppAttributesResponse.AppAttribute.TagInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppAttributesResponseUnmarshaller {

	public static DescribeAppAttributesResponse unmarshall(DescribeAppAttributesResponse describeAppAttributesResponse, UnmarshallerContext _ctx) {
		
		describeAppAttributesResponse.setRequestId(_ctx.stringValue("DescribeAppAttributesResponse.RequestId"));
		describeAppAttributesResponse.setPageNumber(_ctx.integerValue("DescribeAppAttributesResponse.PageNumber"));
		describeAppAttributesResponse.setPageSize(_ctx.integerValue("DescribeAppAttributesResponse.PageSize"));
		describeAppAttributesResponse.setTotalCount(_ctx.integerValue("DescribeAppAttributesResponse.TotalCount"));

		List<AppAttribute> apps = new ArrayList<AppAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppAttributesResponse.Apps.Length"); i++) {
			AppAttribute appAttribute = new AppAttribute();
			appAttribute.setAppName(_ctx.stringValue("DescribeAppAttributesResponse.Apps["+ i +"].AppName"));
			appAttribute.setModifiedTime(_ctx.stringValue("DescribeAppAttributesResponse.Apps["+ i +"].ModifiedTime"));
			appAttribute.setDescription(_ctx.stringValue("DescribeAppAttributesResponse.Apps["+ i +"].Description"));
			appAttribute.setCreatedTime(_ctx.stringValue("DescribeAppAttributesResponse.Apps["+ i +"].CreatedTime"));
			appAttribute.setAppId(_ctx.longValue("DescribeAppAttributesResponse.Apps["+ i +"].AppId"));

			List<TagInfo> tags = new ArrayList<TagInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAppAttributesResponse.Apps["+ i +"].Tags.Length"); j++) {
				TagInfo tagInfo = new TagInfo();
				tagInfo.setKey(_ctx.stringValue("DescribeAppAttributesResponse.Apps["+ i +"].Tags["+ j +"].Key"));
				tagInfo.setValue(_ctx.stringValue("DescribeAppAttributesResponse.Apps["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagInfo);
			}
			appAttribute.setTags(tags);

			apps.add(appAttribute);
		}
		describeAppAttributesResponse.setApps(apps);
	 
	 	return describeAppAttributesResponse;
	}
}