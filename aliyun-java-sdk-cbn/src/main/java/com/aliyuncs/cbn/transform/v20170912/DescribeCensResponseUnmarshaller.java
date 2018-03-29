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

import com.aliyuncs.cbn.model.v20170912.DescribeCensResponse;
import com.aliyuncs.cbn.model.v20170912.DescribeCensResponse.Cen;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCensResponseUnmarshaller {

	public static DescribeCensResponse unmarshall(DescribeCensResponse describeCensResponse, UnmarshallerContext context) {
		
		describeCensResponse.setRequestId(context.stringValue("DescribeCensResponse.RequestId"));
		describeCensResponse.setTotalCount(context.integerValue("DescribeCensResponse.TotalCount"));
		describeCensResponse.setPageNumber(context.integerValue("DescribeCensResponse.PageNumber"));
		describeCensResponse.setPageSize(context.integerValue("DescribeCensResponse.PageSize"));

		List<Cen> cens = new ArrayList<Cen>();
		for (int i = 0; i < context.lengthValue("DescribeCensResponse.Cens.Length"); i++) {
			Cen cen = new Cen();
			cen.setCenId(context.stringValue("DescribeCensResponse.Cens["+ i +"].CenId"));
			cen.setName(context.stringValue("DescribeCensResponse.Cens["+ i +"].Name"));
			cen.setDescription(context.stringValue("DescribeCensResponse.Cens["+ i +"].Description"));
			cen.setStatus(context.stringValue("DescribeCensResponse.Cens["+ i +"].Status"));
			cen.setCreationTime(context.stringValue("DescribeCensResponse.Cens["+ i +"].CreationTime"));

			List<String> cenBandwidthPackageIds = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeCensResponse.Cens["+ i +"].CenBandwidthPackageIds.Length"); j++) {
				cenBandwidthPackageIds.add(context.stringValue("DescribeCensResponse.Cens["+ i +"].CenBandwidthPackageIds["+ j +"]"));
			}
			cen.setCenBandwidthPackageIds(cenBandwidthPackageIds);

			cens.add(cen);
		}
		describeCensResponse.setCens(cens);
	 
	 	return describeCensResponse;
	}
}