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

import com.aliyuncs.ecd.model.v20200930.DescribeBundlesResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeBundlesResponse.Bundle;
import com.aliyuncs.ecd.model.v20200930.DescribeBundlesResponse.Bundle.DesktopTypeAttribute;
import com.aliyuncs.ecd.model.v20200930.DescribeBundlesResponse.Bundle.Disk;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBundlesResponseUnmarshaller {

	public static DescribeBundlesResponse unmarshall(DescribeBundlesResponse describeBundlesResponse, UnmarshallerContext _ctx) {
		
		describeBundlesResponse.setRequestId(_ctx.stringValue("DescribeBundlesResponse.RequestId"));
		describeBundlesResponse.setNextToken(_ctx.stringValue("DescribeBundlesResponse.NextToken"));

		List<Bundle> bundles = new ArrayList<Bundle>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBundlesResponse.Bundles.Length"); i++) {
			Bundle bundle = new Bundle();
			bundle.setImageId(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].ImageId"));
			bundle.setBundleId(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].BundleId"));
			bundle.setBundleType(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].BundleType"));
			bundle.setBundleName(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].BundleName"));
			bundle.setDescription(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].Description"));
			bundle.setDesktopType(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].DesktopType"));
			bundle.setOsType(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].OsType"));

			DesktopTypeAttribute desktopTypeAttribute = new DesktopTypeAttribute();
			desktopTypeAttribute.setCpuCount(_ctx.integerValue("DescribeBundlesResponse.Bundles["+ i +"].DesktopTypeAttribute.CpuCount"));
			desktopTypeAttribute.setMemorySize(_ctx.integerValue("DescribeBundlesResponse.Bundles["+ i +"].DesktopTypeAttribute.MemorySize"));
			desktopTypeAttribute.setGpuCount(_ctx.floatValue("DescribeBundlesResponse.Bundles["+ i +"].DesktopTypeAttribute.GpuCount"));
			desktopTypeAttribute.setGpuSpec(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].DesktopTypeAttribute.GpuSpec"));
			bundle.setDesktopTypeAttribute(desktopTypeAttribute);

			List<Disk> disks = new ArrayList<Disk>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBundlesResponse.Bundles["+ i +"].Disks.Length"); j++) {
				Disk disk = new Disk();
				disk.setDiskSize(_ctx.integerValue("DescribeBundlesResponse.Bundles["+ i +"].Disks["+ j +"].DiskSize"));
				disk.setDiskType(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].Disks["+ j +"].DiskType"));

				disks.add(disk);
			}
			bundle.setDisks(disks);

			bundles.add(bundle);
		}
		describeBundlesResponse.setBundles(bundles);
	 
	 	return describeBundlesResponse;
	}
}