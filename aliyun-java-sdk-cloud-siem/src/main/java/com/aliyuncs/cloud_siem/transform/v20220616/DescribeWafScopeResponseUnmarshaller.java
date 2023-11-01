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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.DescribeWafScopeResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeWafScopeResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWafScopeResponseUnmarshaller {

	public static DescribeWafScopeResponse unmarshall(DescribeWafScopeResponse describeWafScopeResponse, UnmarshallerContext _ctx) {
		
		describeWafScopeResponse.setRequestId(_ctx.stringValue("DescribeWafScopeResponse.RequestId"));
		describeWafScopeResponse.setSuccess(_ctx.booleanValue("DescribeWafScopeResponse.Success"));
		describeWafScopeResponse.setCode(_ctx.integerValue("DescribeWafScopeResponse.Code"));
		describeWafScopeResponse.setMessage(_ctx.stringValue("DescribeWafScopeResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWafScopeResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setInstanceId(_ctx.stringValue("DescribeWafScopeResponse.Data["+ i +"].InstanceId"));
			dataItem.setAliuid(_ctx.longValue("DescribeWafScopeResponse.Data["+ i +"].Aliuid"));

			List<String> domains = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeWafScopeResponse.Data["+ i +"].Domains.Length"); j++) {
				domains.add(_ctx.stringValue("DescribeWafScopeResponse.Data["+ i +"].Domains["+ j +"]"));
			}
			dataItem.setDomains(domains);

			data.add(dataItem);
		}
		describeWafScopeResponse.setData(data);
	 
	 	return describeWafScopeResponse;
	}
}