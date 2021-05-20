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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCenInterRegionBandwidthLimitsResponseUnmarshaller {

	public static DescribeCenInterRegionBandwidthLimitsResponse unmarshall(DescribeCenInterRegionBandwidthLimitsResponse describeCenInterRegionBandwidthLimitsResponse, UnmarshallerContext _ctx) {
		
		describeCenInterRegionBandwidthLimitsResponse.setRequestId(_ctx.stringValue("DescribeCenInterRegionBandwidthLimitsResponse.RequestId"));
		describeCenInterRegionBandwidthLimitsResponse.setTotalCount(_ctx.integerValue("DescribeCenInterRegionBandwidthLimitsResponse.TotalCount"));
		describeCenInterRegionBandwidthLimitsResponse.setPageNumber(_ctx.integerValue("DescribeCenInterRegionBandwidthLimitsResponse.PageNumber"));
		describeCenInterRegionBandwidthLimitsResponse.setPageSize(_ctx.integerValue("DescribeCenInterRegionBandwidthLimitsResponse.PageSize"));

		List<CenInterRegionBandwidthLimit> cenInterRegionBandwidthLimits = new ArrayList<CenInterRegionBandwidthLimit>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCenInterRegionBandwidthLimitsResponse.CenInterRegionBandwidthLimits.Length"); i++) {
			CenInterRegionBandwidthLimit cenInterRegionBandwidthLimit = new CenInterRegionBandwidthLimit();
			cenInterRegionBandwidthLimit.setCenId(_ctx.stringValue("DescribeCenInterRegionBandwidthLimitsResponse.CenInterRegionBandwidthLimits["+ i +"].CenId"));
			cenInterRegionBandwidthLimit.setLocalRegionId(_ctx.stringValue("DescribeCenInterRegionBandwidthLimitsResponse.CenInterRegionBandwidthLimits["+ i +"].LocalRegionId"));
			cenInterRegionBandwidthLimit.setOppositeRegionId(_ctx.stringValue("DescribeCenInterRegionBandwidthLimitsResponse.CenInterRegionBandwidthLimits["+ i +"].OppositeRegionId"));
			cenInterRegionBandwidthLimit.setGeographicSpanId(_ctx.stringValue("DescribeCenInterRegionBandwidthLimitsResponse.CenInterRegionBandwidthLimits["+ i +"].GeographicSpanId"));
			cenInterRegionBandwidthLimit.setBandwidthLimit(_ctx.longValue("DescribeCenInterRegionBandwidthLimitsResponse.CenInterRegionBandwidthLimits["+ i +"].BandwidthLimit"));
			cenInterRegionBandwidthLimit.setStatus(_ctx.stringValue("DescribeCenInterRegionBandwidthLimitsResponse.CenInterRegionBandwidthLimits["+ i +"].Status"));
			cenInterRegionBandwidthLimit.setTransitRouterAttachmentId(_ctx.stringValue("DescribeCenInterRegionBandwidthLimitsResponse.CenInterRegionBandwidthLimits["+ i +"].TransitRouterAttachmentId"));
			cenInterRegionBandwidthLimit.setBandwidthPackageId(_ctx.stringValue("DescribeCenInterRegionBandwidthLimitsResponse.CenInterRegionBandwidthLimits["+ i +"].BandwidthPackageId"));

			cenInterRegionBandwidthLimits.add(cenInterRegionBandwidthLimit);
		}
		describeCenInterRegionBandwidthLimitsResponse.setCenInterRegionBandwidthLimits(cenInterRegionBandwidthLimits);
	 
	 	return describeCenInterRegionBandwidthLimitsResponse;
	}
}