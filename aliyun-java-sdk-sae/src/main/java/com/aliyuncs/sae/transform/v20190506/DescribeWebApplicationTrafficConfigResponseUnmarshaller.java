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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationTrafficConfigResponse;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationTrafficConfigResponse.Data;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationTrafficConfigResponse.Data.WebAclConfig;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationTrafficConfigResponse.Data.WebAclConfig.WebAclEntriesItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebApplicationTrafficConfigResponseUnmarshaller {

	public static DescribeWebApplicationTrafficConfigResponse unmarshall(DescribeWebApplicationTrafficConfigResponse describeWebApplicationTrafficConfigResponse, UnmarshallerContext _ctx) {
		
		describeWebApplicationTrafficConfigResponse.setRequestId(_ctx.stringValue("DescribeWebApplicationTrafficConfigResponse.RequestId"));
		describeWebApplicationTrafficConfigResponse.setCode(_ctx.integerValue("DescribeWebApplicationTrafficConfigResponse.Code"));
		describeWebApplicationTrafficConfigResponse.setMessage(_ctx.stringValue("DescribeWebApplicationTrafficConfigResponse.Message"));
		describeWebApplicationTrafficConfigResponse.setSuccess(_ctx.booleanValue("DescribeWebApplicationTrafficConfigResponse.Success"));

		Data data = new Data();
		data.setAuthType(_ctx.stringValue("DescribeWebApplicationTrafficConfigResponse.Data.AuthType"));
		data.setDisableInternetURL(_ctx.booleanValue("DescribeWebApplicationTrafficConfigResponse.Data.DisableInternetURL"));
		data.setRevisionsTrafficWeight(_ctx.mapValue("DescribeWebApplicationTrafficConfigResponse.Data.RevisionsTrafficWeight"));

		WebAclConfig webAclConfig = new WebAclConfig();
		webAclConfig.setAclDescription(_ctx.stringValue("DescribeWebApplicationTrafficConfigResponse.Data.WebAclConfig.AclDescription"));

		List<WebAclEntriesItem> webAclEntries = new ArrayList<WebAclEntriesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebApplicationTrafficConfigResponse.Data.WebAclConfig.WebAclEntries.Length"); i++) {
			WebAclEntriesItem webAclEntriesItem = new WebAclEntriesItem();
			webAclEntriesItem.setEntry(_ctx.stringValue("DescribeWebApplicationTrafficConfigResponse.Data.WebAclConfig.WebAclEntries["+ i +"].Entry"));
			webAclEntriesItem.setDescription(_ctx.stringValue("DescribeWebApplicationTrafficConfigResponse.Data.WebAclConfig.WebAclEntries["+ i +"].Description"));

			webAclEntries.add(webAclEntriesItem);
		}
		webAclConfig.setWebAclEntries(webAclEntries);
		data.setWebAclConfig(webAclConfig);
		describeWebApplicationTrafficConfigResponse.setData(data);
	 
	 	return describeWebApplicationTrafficConfigResponse;
	}
}