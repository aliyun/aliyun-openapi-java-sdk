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

package com.aliyuncs.clickhouse.transform.v20191111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.clickhouse.model.v20191111.DescribeAvailableResourceResponse;
import com.aliyuncs.clickhouse.model.v20191111.DescribeAvailableResourceResponse.AvailableZone;
import com.aliyuncs.clickhouse.model.v20191111.DescribeAvailableResourceResponse.AvailableZone.SupportedSerial;
import com.aliyuncs.clickhouse.model.v20191111.DescribeAvailableResourceResponse.AvailableZone.SupportedSerial.SupportedInstanceClass;
import com.aliyuncs.clickhouse.model.v20191111.DescribeAvailableResourceResponse.AvailableZone.SupportedSerial.SupportedInstanceClass.SupportedExecutor;
import com.aliyuncs.clickhouse.model.v20191111.DescribeAvailableResourceResponse.AvailableZone.SupportedSerial.SupportedInstanceClass.SupportedExecutor.NodeCount;
import com.aliyuncs.clickhouse.model.v20191111.DescribeAvailableResourceResponse.AvailableZone.SupportedSerial.SupportedInstanceClass.SupportedNodeCount;
import com.aliyuncs.clickhouse.model.v20191111.DescribeAvailableResourceResponse.AvailableZone.SupportedSerial.SupportedInstanceClass.SupportedNodeCount.NodeCount1;
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

					List<SupportedExecutor> supportedExecutorList = new ArrayList<SupportedExecutor>();
					for (int l = 0; l < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedSerialList["+ j +"].SupportedInstanceClassList["+ k +"].SupportedExecutorList.Length"); l++) {
						SupportedExecutor supportedExecutor = new SupportedExecutor();

						NodeCount nodeCount = new NodeCount();
						nodeCount.setStep(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedSerialList["+ j +"].SupportedInstanceClassList["+ k +"].SupportedExecutorList["+ l +"].NodeCount.Step"));
						nodeCount.setMinCount(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedSerialList["+ j +"].SupportedInstanceClassList["+ k +"].SupportedExecutorList["+ l +"].NodeCount.MinCount"));
						nodeCount.setMaxCount(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedSerialList["+ j +"].SupportedInstanceClassList["+ k +"].SupportedExecutorList["+ l +"].NodeCount.MaxCount"));
						supportedExecutor.setNodeCount(nodeCount);

						supportedExecutorList.add(supportedExecutor);
					}
					supportedInstanceClass.setSupportedExecutorList(supportedExecutorList);

					List<SupportedNodeCount> supportedNodeCountList = new ArrayList<SupportedNodeCount>();
					for (int l = 0; l < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedSerialList["+ j +"].SupportedInstanceClassList["+ k +"].SupportedNodeCountList.Length"); l++) {
						SupportedNodeCount supportedNodeCount = new SupportedNodeCount();

						List<String> storageSize = new ArrayList<String>();
						for (int m = 0; m < _ctx.lengthValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedSerialList["+ j +"].SupportedInstanceClassList["+ k +"].SupportedNodeCountList["+ l +"].StorageSize.Length"); m++) {
							storageSize.add(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedSerialList["+ j +"].SupportedInstanceClassList["+ k +"].SupportedNodeCountList["+ l +"].StorageSize["+ m +"]"));
						}
						supportedNodeCount.setStorageSize(storageSize);

						NodeCount1 nodeCount1 = new NodeCount1();
						nodeCount1.setStep(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedSerialList["+ j +"].SupportedInstanceClassList["+ k +"].SupportedNodeCountList["+ l +"].NodeCount.Step"));
						nodeCount1.setMinCount(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedSerialList["+ j +"].SupportedInstanceClassList["+ k +"].SupportedNodeCountList["+ l +"].NodeCount.MinCount"));
						nodeCount1.setMaxCount(_ctx.stringValue("DescribeAvailableResourceResponse.AvailableZoneList["+ i +"].SupportedSerialList["+ j +"].SupportedInstanceClassList["+ k +"].SupportedNodeCountList["+ l +"].NodeCount.MaxCount"));
						supportedNodeCount.setNodeCount1(nodeCount1);

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