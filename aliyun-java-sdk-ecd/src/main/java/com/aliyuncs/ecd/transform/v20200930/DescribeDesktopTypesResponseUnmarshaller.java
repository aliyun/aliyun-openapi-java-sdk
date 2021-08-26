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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeDesktopTypesResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeDesktopTypesResponse.DesktopType;
import com.aliyuncs.ecd.model.v20200930.DescribeDesktopTypesResponse.DesktopType.AllowDiskSizeItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDesktopTypesResponseUnmarshaller {

	public static DescribeDesktopTypesResponse unmarshall(DescribeDesktopTypesResponse describeDesktopTypesResponse, UnmarshallerContext _ctx) {
		
		describeDesktopTypesResponse.setRequestId(_ctx.stringValue("DescribeDesktopTypesResponse.RequestId"));

		List<DesktopType> desktopTypes = new ArrayList<DesktopType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDesktopTypesResponse.DesktopTypes.Length"); i++) {
			DesktopType desktopType = new DesktopType();
			desktopType.setSystemDiskSize(_ctx.stringValue("DescribeDesktopTypesResponse.DesktopTypes["+ i +"].SystemDiskSize"));
			desktopType.setDesktopTypeId(_ctx.stringValue("DescribeDesktopTypesResponse.DesktopTypes["+ i +"].DesktopTypeId"));
			desktopType.setDataDiskSize(_ctx.stringValue("DescribeDesktopTypesResponse.DesktopTypes["+ i +"].DataDiskSize"));
			desktopType.setCpuCount(_ctx.stringValue("DescribeDesktopTypesResponse.DesktopTypes["+ i +"].CpuCount"));
			desktopType.setGpuCount(_ctx.floatValue("DescribeDesktopTypesResponse.DesktopTypes["+ i +"].GpuCount"));
			desktopType.setGpuSpec(_ctx.stringValue("DescribeDesktopTypesResponse.DesktopTypes["+ i +"].GpuSpec"));
			desktopType.setInstanceTypeFamily(_ctx.stringValue("DescribeDesktopTypesResponse.DesktopTypes["+ i +"].InstanceTypeFamily"));
			desktopType.setMemorySize(_ctx.stringValue("DescribeDesktopTypesResponse.DesktopTypes["+ i +"].MemorySize"));

			List<AllowDiskSizeItem> allowDiskSize = new ArrayList<AllowDiskSizeItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDesktopTypesResponse.DesktopTypes["+ i +"].AllowDiskSize.Length"); j++) {
				AllowDiskSizeItem allowDiskSizeItem = new AllowDiskSizeItem();
				allowDiskSizeItem.setDataDiskSize(_ctx.integerValue("DescribeDesktopTypesResponse.DesktopTypes["+ i +"].AllowDiskSize["+ j +"].DataDiskSize"));
				allowDiskSizeItem.setSystemDiskSize(_ctx.integerValue("DescribeDesktopTypesResponse.DesktopTypes["+ i +"].AllowDiskSize["+ j +"].SystemDiskSize"));

				allowDiskSize.add(allowDiskSizeItem);
			}
			desktopType.setAllowDiskSize(allowDiskSize);

			desktopTypes.add(desktopType);
		}
		describeDesktopTypesResponse.setDesktopTypes(desktopTypes);
	 
	 	return describeDesktopTypesResponse;
	}
}