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

import com.aliyuncs.cloudapi.model.v20160714.DescribeInstanceHttpCodeResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeInstanceHttpCodeResponse.MonitorItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceHttpCodeResponseUnmarshaller {

	public static DescribeInstanceHttpCodeResponse unmarshall(DescribeInstanceHttpCodeResponse describeInstanceHttpCodeResponse, UnmarshallerContext _ctx) {
		
		describeInstanceHttpCodeResponse.setRequestId(_ctx.stringValue("DescribeInstanceHttpCodeResponse.RequestId"));

		List<MonitorItem> instanceHttpCode = new ArrayList<MonitorItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceHttpCodeResponse.InstanceHttpCode.Length"); i++) {
			MonitorItem monitorItem = new MonitorItem();
			monitorItem.setItemValue(_ctx.stringValue("DescribeInstanceHttpCodeResponse.InstanceHttpCode["+ i +"].ItemValue"));
			monitorItem.setItemTime(_ctx.stringValue("DescribeInstanceHttpCodeResponse.InstanceHttpCode["+ i +"].ItemTime"));

			instanceHttpCode.add(monitorItem);
		}
		describeInstanceHttpCodeResponse.setInstanceHttpCode(instanceHttpCode);
	 
	 	return describeInstanceHttpCodeResponse;
	}
}