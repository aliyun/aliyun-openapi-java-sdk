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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.DescribeLogShipperStatusResponse;
import com.aliyuncs.sas.model.v20181203.DescribeLogShipperStatusResponse.LogShipperStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogShipperStatusResponseUnmarshaller {

	public static DescribeLogShipperStatusResponse unmarshall(DescribeLogShipperStatusResponse describeLogShipperStatusResponse, UnmarshallerContext _ctx) {
		
		describeLogShipperStatusResponse.setRequestId(_ctx.stringValue("DescribeLogShipperStatusResponse.RequestId"));

		LogShipperStatus logShipperStatus = new LogShipperStatus();
		logShipperStatus.setOpenStatus(_ctx.stringValue("DescribeLogShipperStatusResponse.LogShipperStatus.OpenStatus"));
		logShipperStatus.setSlsServiceStatus(_ctx.stringValue("DescribeLogShipperStatusResponse.LogShipperStatus.SlsServiceStatus"));
		logShipperStatus.setAuthStatus(_ctx.stringValue("DescribeLogShipperStatusResponse.LogShipperStatus.AuthStatus"));
		logShipperStatus.setBuyStatus(_ctx.stringValue("DescribeLogShipperStatusResponse.LogShipperStatus.BuyStatus"));
		logShipperStatus.setPostPaidSupportStatus(_ctx.stringValue("DescribeLogShipperStatusResponse.LogShipperStatus.PostPaidSupportStatus"));
		logShipperStatus.setPostPaidOpenStatus(_ctx.stringValue("DescribeLogShipperStatusResponse.LogShipperStatus.PostPaidOpenStatus"));
		logShipperStatus.setSlsProjectStatus(_ctx.stringValue("DescribeLogShipperStatusResponse.LogShipperStatus.SlsProjectStatus"));
		describeLogShipperStatusResponse.setLogShipperStatus(logShipperStatus);
	 
	 	return describeLogShipperStatusResponse;
	}
}