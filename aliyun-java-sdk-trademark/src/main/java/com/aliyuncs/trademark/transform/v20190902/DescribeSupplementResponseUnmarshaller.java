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

package com.aliyuncs.trademark.transform.v20190902;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20190902.DescribeSupplementResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSupplementResponseUnmarshaller {

	public static DescribeSupplementResponse unmarshall(DescribeSupplementResponse describeSupplementResponse, UnmarshallerContext _ctx) {
		
		describeSupplementResponse.setRequestId(_ctx.stringValue("DescribeSupplementResponse.RequestId"));
		describeSupplementResponse.setSupplementId(_ctx.longValue("DescribeSupplementResponse.SupplementId"));
		describeSupplementResponse.setSerialNumber(_ctx.stringValue("DescribeSupplementResponse.SerialNumber"));
		describeSupplementResponse.setApplicationType(_ctx.integerValue("DescribeSupplementResponse.ApplicationType"));
		describeSupplementResponse.setSupplementStatus(_ctx.integerValue("DescribeSupplementResponse.SupplementStatus"));
		describeSupplementResponse.setTrademarkNumber(_ctx.stringValue("DescribeSupplementResponse.TrademarkNumber"));
		describeSupplementResponse.setSendTime(_ctx.longValue("DescribeSupplementResponse.SendTime"));
		describeSupplementResponse.setAcceptTime(_ctx.longValue("DescribeSupplementResponse.AcceptTime"));
		describeSupplementResponse.setSbjExpirationDate(_ctx.longValue("DescribeSupplementResponse.SbjExpirationDate"));
		describeSupplementResponse.setAcceptExpirationDate(_ctx.longValue("DescribeSupplementResponse.AcceptExpirationDate"));
		describeSupplementResponse.setOperateTime(_ctx.longValue("DescribeSupplementResponse.OperateTime"));
		describeSupplementResponse.setOfficialFile(_ctx.stringValue("DescribeSupplementResponse.OfficialFile"));
		describeSupplementResponse.setContent(_ctx.stringValue("DescribeSupplementResponse.Content"));

		List<String> userFiles = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSupplementResponse.UserFiles.Length"); i++) {
			userFiles.add(_ctx.stringValue("DescribeSupplementResponse.UserFiles["+ i +"]"));
		}
		describeSupplementResponse.setUserFiles(userFiles);
	 
	 	return describeSupplementResponse;
	}
}