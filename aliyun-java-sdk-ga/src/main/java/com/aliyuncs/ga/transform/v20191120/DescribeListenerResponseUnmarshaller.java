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

import com.aliyuncs.ga.model.v20191120.DescribeListenerResponse;
import com.aliyuncs.ga.model.v20191120.DescribeListenerResponse.PortRangesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeListenerResponseUnmarshaller {

	public static DescribeListenerResponse unmarshall(DescribeListenerResponse describeListenerResponse, UnmarshallerContext _ctx) {
		
		describeListenerResponse.setRequestId(_ctx.stringValue("DescribeListenerResponse.RequestId"));
		describeListenerResponse.setListenerId(_ctx.stringValue("DescribeListenerResponse.ListenerId"));
		describeListenerResponse.setName(_ctx.stringValue("DescribeListenerResponse.Name"));
		describeListenerResponse.setDescription(_ctx.stringValue("DescribeListenerResponse.Description"));
		describeListenerResponse.setBizProtocol(_ctx.stringValue("DescribeListenerResponse.Protocol"));
		describeListenerResponse.setClientAffinity(_ctx.stringValue("DescribeListenerResponse.ClientAffinity"));
		describeListenerResponse.setState(_ctx.stringValue("DescribeListenerResponse.State"));
		describeListenerResponse.setCreateTime(_ctx.stringValue("DescribeListenerResponse.CreateTime"));

		List<PortRangesItem> portRanges = new ArrayList<PortRangesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeListenerResponse.PortRanges.Length"); i++) {
			PortRangesItem portRangesItem = new PortRangesItem();
			portRangesItem.setFromPort(_ctx.integerValue("DescribeListenerResponse.PortRanges["+ i +"].FromPort"));
			portRangesItem.setToPort(_ctx.integerValue("DescribeListenerResponse.PortRanges["+ i +"].ToPort"));

			portRanges.add(portRangesItem);
		}
		describeListenerResponse.setPortRanges(portRanges);
	 
	 	return describeListenerResponse;
	}
}