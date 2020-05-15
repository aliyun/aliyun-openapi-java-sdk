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

package com.aliyuncs.gdb.transform.v20190903;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gdb.model.v20190903.DescribeAvailableResourceResponse;
import com.aliyuncs.gdb.model.v20190903.DescribeAvailableResourceResponse.AvailableZone;
import com.aliyuncs.gdb.model.v20190903.DescribeAvailableResourceResponse.AvailableZone.SupportedSerial;
import com.aliyuncs.gdb.model.v20190903.DescribeAvailableResourceResponse.AvailableZone.SupportedSerial.SupportedInstanceClass;
import com.aliyuncs.gdb.model.v20190903.DescribeAvailableResourceResponse.AvailableZone.SupportedSerial.SupportedInstanceClass.SupportedStorageSize;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvailableResourceResponseUnmarshaller {

	public static DescribeAvailableResourceResponse unmarshall(DescribeAvailableResourceResponse describeAvailableResourceResponse, UnmarshallerContext _ctx) {
		
		describeAvailableResourceResponse.setRequestId(_ctx.stringValue("DescribeAvailableResourceResponse.RequestId"));
		describeAvailableResourceResponse.setRegionId(_ctx.stringValue("DescribeAvailableResourceResponse.RegionId"));

		List<AvailableZone> availableZoneList = new ArrayList<AvailableZone>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZoneList.Length"); i++) {
			AvailableZone availableZone = new AvailableZone();
			availableZone.setZoneId(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].ZoneId"));

			List<SupportedSerial> supportedSerialList = new ArrayList<SupportedSerial>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedSerialList.Length"); j++) {
				SupportedSerial supportedSerial = new SupportedSerial();
				supportedSerial.setSerial(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedSerialList["+ j +"].Serial"));

				List<SupportedInstanceClass> supportedInstanceClassList = new ArrayList<SupportedInstanceClass>();
				for (int k = 0; k < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedSerialList["+ j +"].SupportedInstanceClassList.Length"); k++) {
					SupportedInstanceClass supportedInstanceClass = new SupportedInstanceClass();
					supportedInstanceClass.setInstanceClass(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedSerialList["+ j +"].SupportedInstanceClassList["+ k +"].InstanceClass"));
					supportedInstanceClass.setTips(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedSerialList["+ j +"].SupportedInstanceClassList["+ k +"].Tips"));

					List<SupportedStorageSize> supportedStorageSizeList = new ArrayList<SupportedStorageSize>();
					for (int l = 0; l < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedSerialList["+ j +"].SupportedInstanceClassList["+ k +"].SupportedStorageSizeList.Length"); l++) {
						SupportedStorageSize supportedStorageSize = new SupportedStorageSize();
						supportedStorageSize.setStorageSize(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedSerialList["+ j +"].SupportedInstanceClassList["+ k +"].SupportedStorageSizeList["+ l +"].StorageSize"));
						supportedStorageSize.setStorageType(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedSerialList["+ j +"].SupportedInstanceClassList["+ k +"].SupportedStorageSizeList["+ l +"].StorageType"));

						supportedStorageSizeList.add(supportedStorageSize);
					}
					supportedInstanceClass.setSupportedStorageSizeList(supportedStorageSizeList);

					supportedInstanceClassList.add(supportedInstanceClass);
				}
				supportedSerial.setSupportedInstanceClassList(supportedInstanceClassList);

				supportedSerialList.add(supportedSerial);
			}
			availableZone.setSupportedSerialList(supportedSerialList);

			availableZoneList.add(availableZone);
		}
		describeAvailableResourceResponse.setAvailableZoneList(availableZoneList);
	 
	 	return describeAvailableResourceResponse;
	}
}