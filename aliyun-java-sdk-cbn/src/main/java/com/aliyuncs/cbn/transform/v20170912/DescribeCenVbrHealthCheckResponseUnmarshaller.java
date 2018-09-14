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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.DescribeCenVbrHealthCheckResponse;
import com.aliyuncs.cbn.model.v20170912.DescribeCenVbrHealthCheckResponse.VbrHealthCheck;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCenVbrHealthCheckResponseUnmarshaller {

	public static DescribeCenVbrHealthCheckResponse unmarshall(DescribeCenVbrHealthCheckResponse describeCenVbrHealthCheckResponse, UnmarshallerContext context) {
		
		describeCenVbrHealthCheckResponse.setRequestId(context.stringValue("DescribeCenVbrHealthCheckResponse.RequestId"));
		describeCenVbrHealthCheckResponse.setTotalCount(context.integerValue("DescribeCenVbrHealthCheckResponse.TotalCount"));
		describeCenVbrHealthCheckResponse.setPageNumber(context.integerValue("DescribeCenVbrHealthCheckResponse.PageNumber"));
		describeCenVbrHealthCheckResponse.setPageSize(context.integerValue("DescribeCenVbrHealthCheckResponse.PageSize"));

		List<VbrHealthCheck> vbrHealthChecks = new ArrayList<VbrHealthCheck>();
		for (int i = 0; i < context.lengthValue("DescribeCenVbrHealthCheckResponse.VbrHealthChecks.Length"); i++) {
			VbrHealthCheck vbrHealthCheck = new VbrHealthCheck();
			vbrHealthCheck.setCenId(context.stringValue("DescribeCenVbrHealthCheckResponse.VbrHealthChecks["+ i +"].CenId"));
			vbrHealthCheck.setVbrInstanceId(context.stringValue("DescribeCenVbrHealthCheckResponse.VbrHealthChecks["+ i +"].VbrInstanceId"));
			vbrHealthCheck.setLinkStatus(context.stringValue("DescribeCenVbrHealthCheckResponse.VbrHealthChecks["+ i +"].LinkStatus"));
			vbrHealthCheck.setPacketLoss(context.longValue("DescribeCenVbrHealthCheckResponse.VbrHealthChecks["+ i +"].PacketLoss"));
			vbrHealthCheck.setHealthCheckSourceIp(context.stringValue("DescribeCenVbrHealthCheckResponse.VbrHealthChecks["+ i +"].HealthCheckSourceIp"));
			vbrHealthCheck.setHealthCheckTargetIp(context.stringValue("DescribeCenVbrHealthCheckResponse.VbrHealthChecks["+ i +"].HealthCheckTargetIp"));
			vbrHealthCheck.setDelay(context.longValue("DescribeCenVbrHealthCheckResponse.VbrHealthChecks["+ i +"].Delay"));

			vbrHealthChecks.add(vbrHealthCheck);
		}
		describeCenVbrHealthCheckResponse.setVbrHealthChecks(vbrHealthChecks);
	 
	 	return describeCenVbrHealthCheckResponse;
	}
}