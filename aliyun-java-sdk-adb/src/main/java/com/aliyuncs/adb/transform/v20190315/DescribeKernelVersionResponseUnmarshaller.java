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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeKernelVersionResponse;
import com.aliyuncs.adb.model.v20190315.DescribeKernelVersionResponse.AvailableKernelVersionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeKernelVersionResponseUnmarshaller {

	public static DescribeKernelVersionResponse unmarshall(DescribeKernelVersionResponse describeKernelVersionResponse, UnmarshallerContext _ctx) {
		
		describeKernelVersionResponse.setRequestId(_ctx.stringValue("DescribeKernelVersionResponse.RequestId"));
		describeKernelVersionResponse.setKernelVersion(_ctx.stringValue("DescribeKernelVersionResponse.KernelVersion"));
		describeKernelVersionResponse.setExpireDate(_ctx.stringValue("DescribeKernelVersionResponse.ExpireDate"));

		List<AvailableKernelVersionsItem> availableKernelVersions = new ArrayList<AvailableKernelVersionsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeKernelVersionResponse.AvailableKernelVersions.Length"); i++) {
			AvailableKernelVersionsItem availableKernelVersionsItem = new AvailableKernelVersionsItem();
			availableKernelVersionsItem.setKernelVersion(_ctx.stringValue("DescribeKernelVersionResponse.AvailableKernelVersions["+ i +"].KernelVersion"));
			availableKernelVersionsItem.setReleaseDate(_ctx.stringValue("DescribeKernelVersionResponse.AvailableKernelVersions["+ i +"].ReleaseDate"));
			availableKernelVersionsItem.setExpireDate(_ctx.stringValue("DescribeKernelVersionResponse.AvailableKernelVersions["+ i +"].ExpireDate"));

			availableKernelVersions.add(availableKernelVersionsItem);
		}
		describeKernelVersionResponse.setAvailableKernelVersions(availableKernelVersions);
	 
	 	return describeKernelVersionResponse;
	}
}