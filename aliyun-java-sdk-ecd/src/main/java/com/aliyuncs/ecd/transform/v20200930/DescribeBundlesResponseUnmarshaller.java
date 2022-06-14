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
			bundle.setDescription(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].Description"));
			bundle.setBundleType(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].BundleType"));
			bundle.setOsType(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].OsType"));
			bundle.setStockState(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].StockState"));
			bundle.setDesktopType(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].DesktopType"));
			bundle.setProtocolType(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].ProtocolType"));
			bundle.setBundleId(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].BundleId"));
			bundle.setImageId(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].ImageId"));
			bundle.setImageName(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].ImageName"));
			bundle.setLanguage(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].Language"));
			bundle.setBundleName(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].BundleName"));
			bundle.setDesktopTypeFamily(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].DesktopTypeFamily"));
			bundle.setCreationTime(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].CreationTime"));
			bundle.setSessionType(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].SessionType"));
			bundle.setVolumeEncryptionEnabled(_ctx.booleanValue("DescribeBundlesResponse.Bundles["+ i +"].VolumeEncryptionEnabled"));
			bundle.setVolumeEncryptionKey(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].VolumeEncryptionKey"));

			DesktopTypeAttribute desktopTypeAttribute = new DesktopTypeAttribute();
			desktopTypeAttribute.setCpuCount(_ctx.integerValue("DescribeBundlesResponse.Bundles["+ i +"].DesktopTypeAttribute.CpuCount"));
			desktopTypeAttribute.setGpuCount(_ctx.floatValue("DescribeBundlesResponse.Bundles["+ i +"].DesktopTypeAttribute.GpuCount"));
			desktopTypeAttribute.setGpuSpec(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].DesktopTypeAttribute.GpuSpec"));
			desktopTypeAttribute.setMemorySize(_ctx.integerValue("DescribeBundlesResponse.Bundles["+ i +"].DesktopTypeAttribute.MemorySize"));
			bundle.setDesktopTypeAttribute(desktopTypeAttribute);

			List<Disk> disks = new ArrayList<Disk>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBundlesResponse.Bundles["+ i +"].Disks.Length"); j++) {
				Disk disk = new Disk();
				disk.setDiskType(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].Disks["+ j +"].DiskType"));
				disk.setDiskSize(_ctx.integerValue("DescribeBundlesResponse.Bundles["+ i +"].Disks["+ j +"].DiskSize"));
				disk.setDiskPerformanceLevel(_ctx.stringValue("DescribeBundlesResponse.Bundles["+ i +"].Disks["+ j +"].DiskPerformanceLevel"));

				disks.add(disk);
			}
			bundle.setDisks(disks);

			bundles.add(bundle);
		}
		describeBundlesResponse.setBundles(bundles);
	 
	 	return describeBundlesResponse;
	}
}