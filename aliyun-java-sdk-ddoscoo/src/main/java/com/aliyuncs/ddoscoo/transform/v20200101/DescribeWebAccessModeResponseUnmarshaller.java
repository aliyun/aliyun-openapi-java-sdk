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

import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebAccessModeResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebAccessModeResponse.DomainMode;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebAccessModeResponseUnmarshaller {

	public static DescribeWebAccessModeResponse unmarshall(DescribeWebAccessModeResponse describeWebAccessModeResponse, UnmarshallerContext _ctx) {
		
		describeWebAccessModeResponse.setRequestId(_ctx.stringValue("DescribeWebAccessModeResponse.RequestId"));

		List<DomainMode> domainModes = new ArrayList<DomainMode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebAccessModeResponse.DomainModes.Length"); i++) {
			DomainMode domainMode = new DomainMode();
			domainMode.setDomain(_ctx.stringValue("DescribeWebAccessModeResponse.DomainModes["+ i +"].Domain"));
			domainMode.setAccessMode(_ctx.integerValue("DescribeWebAccessModeResponse.DomainModes["+ i +"].AccessMode"));

			domainModes.add(domainMode);
		}
		describeWebAccessModeResponse.setDomainModes(domainModes);
	 
	 	return describeWebAccessModeResponse;
	}
}