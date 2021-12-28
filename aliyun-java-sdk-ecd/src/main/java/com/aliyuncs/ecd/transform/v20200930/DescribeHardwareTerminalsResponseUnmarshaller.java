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

import com.aliyuncs.ecd.model.v20200930.DescribeHardwareTerminalsResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeHardwareTerminalsResponse.HardwareTerminal;
import com.aliyuncs.ecd.model.v20200930.DescribeHardwareTerminalsResponse.HardwareTerminal.HardwareTypeDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHardwareTerminalsResponseUnmarshaller {

	public static DescribeHardwareTerminalsResponse unmarshall(DescribeHardwareTerminalsResponse describeHardwareTerminalsResponse, UnmarshallerContext _ctx) {
		
		describeHardwareTerminalsResponse.setRequestId(_ctx.stringValue("DescribeHardwareTerminalsResponse.RequestId"));

		List<HardwareTerminal> hardwareTerminals = new ArrayList<HardwareTerminal>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHardwareTerminalsResponse.HardwareTerminals.Length"); i++) {
			HardwareTerminal hardwareTerminal = new HardwareTerminal();
			hardwareTerminal.setHardwareType(_ctx.stringValue("DescribeHardwareTerminalsResponse.HardwareTerminals["+ i +"].HardwareType"));

			List<HardwareTypeDetail> hardwareTypeDetails = new ArrayList<HardwareTypeDetail>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHardwareTerminalsResponse.HardwareTerminals["+ i +"].HardwareTypeDetails.Length"); j++) {
				HardwareTypeDetail hardwareTypeDetail = new HardwareTypeDetail();
				hardwareTypeDetail.setStockState(_ctx.stringValue("DescribeHardwareTerminalsResponse.HardwareTerminals["+ i +"].HardwareTypeDetails["+ j +"].StockState"));
				hardwareTypeDetail.setHardwareVersion(_ctx.integerValue("DescribeHardwareTerminalsResponse.HardwareTerminals["+ i +"].HardwareTypeDetails["+ j +"].HardwareVersion"));
				hardwareTypeDetail.setDescription(_ctx.stringValue("DescribeHardwareTerminalsResponse.HardwareTerminals["+ i +"].HardwareTypeDetails["+ j +"].Description"));

				hardwareTypeDetails.add(hardwareTypeDetail);
			}
			hardwareTerminal.setHardwareTypeDetails(hardwareTypeDetails);

			hardwareTerminals.add(hardwareTerminal);
		}
		describeHardwareTerminalsResponse.setHardwareTerminals(hardwareTerminals);
	 
	 	return describeHardwareTerminalsResponse;
	}
}