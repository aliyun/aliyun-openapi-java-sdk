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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebAccessLogDispatchStatusResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebAccessLogDispatchStatusResponse.SlsConfigStatusItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebAccessLogDispatchStatusResponseUnmarshaller {

	public static DescribeWebAccessLogDispatchStatusResponse unmarshall(DescribeWebAccessLogDispatchStatusResponse describeWebAccessLogDispatchStatusResponse, UnmarshallerContext _ctx) {
		
		describeWebAccessLogDispatchStatusResponse.setRequestId(_ctx.stringValue("DescribeWebAccessLogDispatchStatusResponse.RequestId"));
		describeWebAccessLogDispatchStatusResponse.setTotalCount(_ctx.integerValue("DescribeWebAccessLogDispatchStatusResponse.TotalCount"));

		List<SlsConfigStatusItem> slsConfigStatus = new ArrayList<SlsConfigStatusItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebAccessLogDispatchStatusResponse.SlsConfigStatus.Length"); i++) {
			SlsConfigStatusItem slsConfigStatusItem = new SlsConfigStatusItem();
			slsConfigStatusItem.setEnable(_ctx.booleanValue("DescribeWebAccessLogDispatchStatusResponse.SlsConfigStatus["+ i +"].Enable"));
			slsConfigStatusItem.setDomain(_ctx.stringValue("DescribeWebAccessLogDispatchStatusResponse.SlsConfigStatus["+ i +"].Domain"));

			slsConfigStatus.add(slsConfigStatusItem);
		}
		describeWebAccessLogDispatchStatusResponse.setSlsConfigStatus(slsConfigStatus);
	 
	 	return describeWebAccessLogDispatchStatusResponse;
	}
}