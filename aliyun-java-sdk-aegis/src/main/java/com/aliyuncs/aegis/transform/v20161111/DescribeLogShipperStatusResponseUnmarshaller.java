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

package com.aliyuncs.aegis.transform.v20161111;

import com.aliyuncs.aegis.model.v20161111.DescribeLogShipperStatusResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeLogShipperStatusResponse.LogShipperStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogShipperStatusResponseUnmarshaller {

	public static DescribeLogShipperStatusResponse unmarshall(DescribeLogShipperStatusResponse describeLogShipperStatusResponse, UnmarshallerContext context) {
		
		describeLogShipperStatusResponse.setRequestId(context.stringValue("DescribeLogShipperStatusResponse.RequestId"));

		LogShipperStatus logShipperStatus = new LogShipperStatus();
		logShipperStatus.setBuyStatus(context.stringValue("DescribeLogShipperStatusResponse.LogShipperStatus.BuyStatus"));
		logShipperStatus.setAuthStatus(context.stringValue("DescribeLogShipperStatusResponse.LogShipperStatus.AuthStatus"));
		logShipperStatus.setOpenStatus(context.stringValue("DescribeLogShipperStatusResponse.LogShipperStatus.OpenStatus"));
		logShipperStatus.setSlsServiceStatus(context.stringValue("DescribeLogShipperStatusResponse.LogShipperStatus.SlsServiceStatus"));
		describeLogShipperStatusResponse.setLogShipperStatus(logShipperStatus);
	 
	 	return describeLogShipperStatusResponse;
	}
}