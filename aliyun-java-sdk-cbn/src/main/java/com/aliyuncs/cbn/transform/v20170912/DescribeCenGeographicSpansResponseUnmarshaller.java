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

import com.aliyuncs.cbn.model.v20170912.DescribeCenGeographicSpansResponse;
import com.aliyuncs.cbn.model.v20170912.DescribeCenGeographicSpansResponse.GeographicSpanModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCenGeographicSpansResponseUnmarshaller {

	public static DescribeCenGeographicSpansResponse unmarshall(DescribeCenGeographicSpansResponse describeCenGeographicSpansResponse, UnmarshallerContext _ctx) {
		
		describeCenGeographicSpansResponse.setRequestId(_ctx.stringValue("DescribeCenGeographicSpansResponse.RequestId"));
		describeCenGeographicSpansResponse.setTotalCount(_ctx.integerValue("DescribeCenGeographicSpansResponse.TotalCount"));
		describeCenGeographicSpansResponse.setPageNumber(_ctx.integerValue("DescribeCenGeographicSpansResponse.PageNumber"));
		describeCenGeographicSpansResponse.setPageSize(_ctx.integerValue("DescribeCenGeographicSpansResponse.PageSize"));

		List<GeographicSpanModel> geographicSpanModels = new ArrayList<GeographicSpanModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCenGeographicSpansResponse.GeographicSpanModels.Length"); i++) {
			GeographicSpanModel geographicSpanModel = new GeographicSpanModel();
			geographicSpanModel.setGeographicSpanId(_ctx.stringValue("DescribeCenGeographicSpansResponse.GeographicSpanModels["+ i +"].GeographicSpanId"));
			geographicSpanModel.setLocalGeoRegionId(_ctx.stringValue("DescribeCenGeographicSpansResponse.GeographicSpanModels["+ i +"].LocalGeoRegionId"));
			geographicSpanModel.setOppositeGeoRegionId(_ctx.stringValue("DescribeCenGeographicSpansResponse.GeographicSpanModels["+ i +"].OppositeGeoRegionId"));

			geographicSpanModels.add(geographicSpanModel);
		}
		describeCenGeographicSpansResponse.setGeographicSpanModels(geographicSpanModels);
	 
	 	return describeCenGeographicSpansResponse;
	}
}