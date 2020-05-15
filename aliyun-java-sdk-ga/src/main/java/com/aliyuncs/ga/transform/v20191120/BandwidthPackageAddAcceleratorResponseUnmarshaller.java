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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.BandwidthPackageAddAcceleratorResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BandwidthPackageAddAcceleratorResponseUnmarshaller {

	public static BandwidthPackageAddAcceleratorResponse unmarshall(BandwidthPackageAddAcceleratorResponse bandwidthPackageAddAcceleratorResponse, UnmarshallerContext _ctx) {
		
		bandwidthPackageAddAcceleratorResponse.setRequestId(_ctx.stringValue("BandwidthPackageAddAcceleratorResponse.RequestId"));
		bandwidthPackageAddAcceleratorResponse.setBandwidthPackageId(_ctx.stringValue("BandwidthPackageAddAcceleratorResponse.BandwidthPackageId"));

		List<String> accelerators = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BandwidthPackageAddAcceleratorResponse.Accelerators.Length"); i++) {
			accelerators.add(_ctx.stringValue("BandwidthPackageAddAcceleratorResponse.Accelerators["+ i +"]"));
		}
		bandwidthPackageAddAcceleratorResponse.setAccelerators(accelerators);
	 
	 	return bandwidthPackageAddAcceleratorResponse;
	}
}