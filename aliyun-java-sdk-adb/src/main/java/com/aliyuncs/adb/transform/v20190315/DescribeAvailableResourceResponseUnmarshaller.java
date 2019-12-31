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

import com.aliyuncs.adb.model.v20190315.DescribeAvailableResourceResponse;
import com.aliyuncs.adb.model.v20190315.DescribeAvailableResourceResponse.AvailableZone;
import com.aliyuncs.adb.model.v20190315.DescribeAvailableResourceResponse.AvailableZone.SupportedSerial;
import com.aliyuncs.adb.model.v20190315.DescribeAvailableResourceResponse.AvailableZone.SupportedSerial.SupportedInstanceClass;
import com.aliyuncs.adb.model.v20190315.DescribeAvailableResourceResponse.AvailableZone.SupportedSerial.SupportedInstanceClass.SupportedNodeCount;
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

					List<SupportedNodeCount> supportedNodeCountList = new ArrayList<SupportedNodeCount>();
					for (int l = 0; l < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedSerialList["+ j +"].SupportedInstanceClassList["+ k +"].SupportedNodeCountList.Length"); l++) {
						SupportedNodeCount supportedNodeCount = new SupportedNodeCount();
						supportedNodeCount.setNodeCount(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedSerialList["+ j +"].SupportedInstanceClassList["+ k +"].SupportedNodeCountList["+ l +"].NodeCount"));

						List<String> storageSize = new ArrayList<String>();
						for (int m = 0; m < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedSerialList["+ j +"].SupportedInstanceClassList["+ k +"].SupportedNodeCountList["+ l +"].StorageSize.Length"); m++) {
							storageSize.add(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedSerialList["+ j +"].SupportedInstanceClassList["+ k +"].SupportedNodeCountList["+ l +"].StorageSize["+ m +"]"));
						}
						supportedNodeCount.setStorageSize(storageSize);

						supportedNodeCountList.add(supportedNodeCount);
					}
					supportedInstanceClass.setSupportedNodeCountList(supportedNodeCountList);

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