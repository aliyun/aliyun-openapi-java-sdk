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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribePortAutoCcStatusResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribePortAutoCcStatusResponse.Status;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePortAutoCcStatusResponseUnmarshaller {

	public static DescribePortAutoCcStatusResponse unmarshall(DescribePortAutoCcStatusResponse describePortAutoCcStatusResponse, UnmarshallerContext _ctx) {
		
		describePortAutoCcStatusResponse.setRequestId(_ctx.stringValue("DescribePortAutoCcStatusResponse.RequestId"));

		List<Status> portAutoCcStatus = new ArrayList<Status>();
		for (int i = 0; i < _ctx.lengthValue("DescribePortAutoCcStatusResponse.PortAutoCcStatus.Length"); i++) {
			Status status = new Status();
			status.setMode(_ctx.stringValue("DescribePortAutoCcStatusResponse.PortAutoCcStatus["+ i +"].Mode"));
			status.setWebSwitch(_ctx.stringValue("DescribePortAutoCcStatusResponse.PortAutoCcStatus["+ i +"].WebSwitch"));
			status.setWebMode(_ctx.stringValue("DescribePortAutoCcStatusResponse.PortAutoCcStatus["+ i +"].WebMode"));
			status.set_Switch(_ctx.stringValue("DescribePortAutoCcStatusResponse.PortAutoCcStatus["+ i +"].Switch"));

			portAutoCcStatus.add(status);
		}
		describePortAutoCcStatusResponse.setPortAutoCcStatus(portAutoCcStatus);
	 
	 	return describePortAutoCcStatusResponse;
	}
}