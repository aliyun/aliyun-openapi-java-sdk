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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeFilesystemsAssociatedHpnZonesResponse;
import com.aliyuncs.nas.model.v20170626.DescribeFilesystemsAssociatedHpnZonesResponse.Filesystem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFilesystemsAssociatedHpnZonesResponseUnmarshaller {

	public static DescribeFilesystemsAssociatedHpnZonesResponse unmarshall(DescribeFilesystemsAssociatedHpnZonesResponse describeFilesystemsAssociatedHpnZonesResponse, UnmarshallerContext _ctx) {
		
		describeFilesystemsAssociatedHpnZonesResponse.setRequestId(_ctx.stringValue("DescribeFilesystemsAssociatedHpnZonesResponse.RequestId"));

		List<Filesystem> filesystems = new ArrayList<Filesystem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFilesystemsAssociatedHpnZonesResponse.Filesystems.Length"); i++) {
			Filesystem filesystem = new Filesystem();
			filesystem.setZoneId(_ctx.stringValue("DescribeFilesystemsAssociatedHpnZonesResponse.Filesystems["+ i +"].ZoneId"));
			filesystem.setFileSystemId(_ctx.stringValue("DescribeFilesystemsAssociatedHpnZonesResponse.Filesystems["+ i +"].FileSystemId"));

			List<String> associatedHpnZones = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeFilesystemsAssociatedHpnZonesResponse.Filesystems["+ i +"].AssociatedHpnZones.Length"); j++) {
				associatedHpnZones.add(_ctx.stringValue("DescribeFilesystemsAssociatedHpnZonesResponse.Filesystems["+ i +"].AssociatedHpnZones["+ j +"]"));
			}
			filesystem.setAssociatedHpnZones(associatedHpnZones);

			filesystems.add(filesystem);
		}
		describeFilesystemsAssociatedHpnZonesResponse.setFilesystems(filesystems);
	 
	 	return describeFilesystemsAssociatedHpnZonesResponse;
	}
}