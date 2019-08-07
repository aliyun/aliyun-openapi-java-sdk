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

package com.aliyuncs.hdr.transform.v20170925;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hdr.model.v20170925.DescribeSitePairsResponse;
import com.aliyuncs.hdr.model.v20170925.DescribeSitePairsResponse.SitePair;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSitePairsResponseUnmarshaller {

	public static DescribeSitePairsResponse unmarshall(DescribeSitePairsResponse describeSitePairsResponse, UnmarshallerContext _ctx) {
		
		describeSitePairsResponse.setRequestId(_ctx.stringValue("DescribeSitePairsResponse.RequestId"));
		describeSitePairsResponse.setSuccess(_ctx.booleanValue("DescribeSitePairsResponse.Success"));
		describeSitePairsResponse.setCode(_ctx.stringValue("DescribeSitePairsResponse.Code"));
		describeSitePairsResponse.setMessage(_ctx.stringValue("DescribeSitePairsResponse.Message"));
		describeSitePairsResponse.setTotalCount(_ctx.integerValue("DescribeSitePairsResponse.TotalCount"));
		describeSitePairsResponse.setPageNumber(_ctx.integerValue("DescribeSitePairsResponse.PageNumber"));
		describeSitePairsResponse.setPageSize(_ctx.integerValue("DescribeSitePairsResponse.PageSize"));

		List<SitePair> sitePairs = new ArrayList<SitePair>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSitePairsResponse.SitePairs.Length"); i++) {
			SitePair sitePair = new SitePair();
			sitePair.setSitePairId(_ctx.stringValue("DescribeSitePairsResponse.SitePairs["+ i +"].SitePairId"));
			sitePair.setSitePairType(_ctx.stringValue("DescribeSitePairsResponse.SitePairs["+ i +"].SitePairType"));
			sitePair.setLocalSiteName(_ctx.stringValue("DescribeSitePairsResponse.SitePairs["+ i +"].LocalSiteName"));
			sitePair.setCloudSiteName(_ctx.stringValue("DescribeSitePairsResponse.SitePairs["+ i +"].CloudSiteName"));
			sitePair.setPrimarySiteId(_ctx.stringValue("DescribeSitePairsResponse.SitePairs["+ i +"].PrimarySiteId"));
			sitePair.setSecondarySiteId(_ctx.stringValue("DescribeSitePairsResponse.SitePairs["+ i +"].SecondarySiteId"));
			sitePair.setPrimarySiteName(_ctx.stringValue("DescribeSitePairsResponse.SitePairs["+ i +"].PrimarySiteName"));
			sitePair.setSecondarySiteName(_ctx.stringValue("DescribeSitePairsResponse.SitePairs["+ i +"].SecondarySiteName"));
			sitePair.setBucketName(_ctx.stringValue("DescribeSitePairsResponse.SitePairs["+ i +"].BucketName"));
			sitePair.setCreatedTime(_ctx.longValue("DescribeSitePairsResponse.SitePairs["+ i +"].CreatedTime"));
			sitePair.setBucketSize(_ctx.longValue("DescribeSitePairsResponse.SitePairs["+ i +"].BucketSize"));
			sitePair.setUpgradeStatus(_ctx.stringValue("DescribeSitePairsResponse.SitePairs["+ i +"].UpgradeStatus"));
			sitePair.setServerCount(_ctx.integerValue("DescribeSitePairsResponse.SitePairs["+ i +"].ServerCount"));

			sitePairs.add(sitePair);
		}
		describeSitePairsResponse.setSitePairs(sitePairs);
	 
	 	return describeSitePairsResponse;
	}
}