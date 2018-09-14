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

import com.aliyuncs.cbn.model.v20170912.DescribeCenInterRegionBandwidthLimitsResponse;
import com.aliyuncs.cbn.model.v20170912.DescribeCenInterRegionBandwidthLimitsResponse.CenInterRegionBandwidthLimit;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCenInterRegionBandwidthLimitsResponseUnmarshaller {

	public static DescribeCenInterRegionBandwidthLimitsResponse unmarshall(DescribeCenInterRegionBandwidthLimitsResponse describeCenInterRegionBandwidthLimitsResponse, UnmarshallerContext context) {
		
		describeCenInterRegionBandwidthLimitsResponse.setRequestId(context.stringValue("DescribeCenInterRegionBandwidthLimitsResponse.RequestId"));
		describeCenInterRegionBandwidthLimitsResponse.setTotalCount(context.integerValue("DescribeCenInterRegionBandwidthLimitsResponse.TotalCount"));
		describeCenInterRegionBandwidthLimitsResponse.setPageNumber(context.integerValue("DescribeCenInterRegionBandwidthLimitsResponse.PageNumber"));
		describeCenInterRegionBandwidthLimitsResponse.setPageSize(context.integerValue("DescribeCenInterRegionBandwidthLimitsResponse.PageSize"));

		List<CenInterRegionBandwidthLimit> cenInterRegionBandwidthLimits = new ArrayList<CenInterRegionBandwidthLimit>();
		for (int i = 0; i < context.lengthValue("DescribeCenInterRegionBandwidthLimitsResponse.CenInterRegionBandwidthLimits.Length"); i++) {
			CenInterRegionBandwidthLimit cenInterRegionBandwidthLimit = new CenInterRegionBandwidthLimit();
			cenInterRegionBandwidthLimit.setCenId(context.stringValue("DescribeCenInterRegionBandwidthLimitsResponse.CenInterRegionBandwidthLimits["+ i +"].CenId"));
			cenInterRegionBandwidthLimit.setLocalRegionId(context.stringValue("DescribeCenInterRegionBandwidthLimitsResponse.CenInterRegionBandwidthLimits["+ i +"].LocalRegionId"));
			cenInterRegionBandwidthLimit.setOppositeRegionId(context.stringValue("DescribeCenInterRegionBandwidthLimitsResponse.CenInterRegionBandwidthLimits["+ i +"].OppositeRegionId"));
			cenInterRegionBandwidthLimit.setGeographicSpanId(context.stringValue("DescribeCenInterRegionBandwidthLimitsResponse.CenInterRegionBandwidthLimits["+ i +"].GeographicSpanId"));
			cenInterRegionBandwidthLimit.setBandwidthLimit(context.longValue("DescribeCenInterRegionBandwidthLimitsResponse.CenInterRegionBandwidthLimits["+ i +"].BandwidthLimit"));
			cenInterRegionBandwidthLimit.setStatus(context.stringValue("DescribeCenInterRegionBandwidthLimitsResponse.CenInterRegionBandwidthLimits["+ i +"].Status"));

			cenInterRegionBandwidthLimits.add(cenInterRegionBandwidthLimit);
		}
		describeCenInterRegionBandwidthLimitsResponse.setCenInterRegionBandwidthLimits(cenInterRegionBandwidthLimits);
	 
	 	return describeCenInterRegionBandwidthLimitsResponse;
	}
}