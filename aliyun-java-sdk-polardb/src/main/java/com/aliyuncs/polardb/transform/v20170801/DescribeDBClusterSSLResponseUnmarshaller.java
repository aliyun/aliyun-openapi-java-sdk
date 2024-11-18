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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterSSLResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterSSLResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterSSLResponseUnmarshaller {

	public static DescribeDBClusterSSLResponse unmarshall(DescribeDBClusterSSLResponse describeDBClusterSSLResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterSSLResponse.setRequestId(_ctx.stringValue("DescribeDBClusterSSLResponse.RequestId"));
		describeDBClusterSSLResponse.setSSLAutoRotate(_ctx.stringValue("DescribeDBClusterSSLResponse.SSLAutoRotate"));

		List<String> supportAdvancedSSLFeatureEndpointTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterSSLResponse.SupportAdvancedSSLFeatureEndpointTypes.Length"); i++) {
			supportAdvancedSSLFeatureEndpointTypes.add(_ctx.stringValue("DescribeDBClusterSSLResponse.SupportAdvancedSSLFeatureEndpointTypes["+ i +"]"));
		}
		describeDBClusterSSLResponse.setSupportAdvancedSSLFeatureEndpointTypes(supportAdvancedSSLFeatureEndpointTypes);

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterSSLResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setSSLExpireTime(_ctx.stringValue("DescribeDBClusterSSLResponse.Items["+ i +"].SSLExpireTime"));
			item.setSSLEnabled(_ctx.stringValue("DescribeDBClusterSSLResponse.Items["+ i +"].SSLEnabled"));
			item.setSSLConnectionString(_ctx.stringValue("DescribeDBClusterSSLResponse.Items["+ i +"].SSLConnectionString"));
			item.setDBEndpointId(_ctx.stringValue("DescribeDBClusterSSLResponse.Items["+ i +"].DBEndpointId"));
			item.setCAType(_ctx.stringValue("DescribeDBClusterSSLResponse.Items["+ i +"].CAType"));
			item.setServerCert(_ctx.stringValue("DescribeDBClusterSSLResponse.Items["+ i +"].ServerCert"));
			item.setServerKey(_ctx.stringValue("DescribeDBClusterSSLResponse.Items["+ i +"].ServerKey"));
			item.setClientCACert(_ctx.stringValue("DescribeDBClusterSSLResponse.Items["+ i +"].ClientCACert"));
			item.setClientCrl(_ctx.stringValue("DescribeDBClusterSSLResponse.Items["+ i +"].ClientCrl"));
			item.setACL(_ctx.stringValue("DescribeDBClusterSSLResponse.Items["+ i +"].ACL"));

			List<String> allowedACLs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClusterSSLResponse.Items["+ i +"].AllowedACLs.Length"); j++) {
				allowedACLs.add(_ctx.stringValue("DescribeDBClusterSSLResponse.Items["+ i +"].AllowedACLs["+ j +"]"));
			}
			item.setAllowedACLs(allowedACLs);

			items.add(item);
		}
		describeDBClusterSSLResponse.setItems(items);
	 
	 	return describeDBClusterSSLResponse;
	}
}