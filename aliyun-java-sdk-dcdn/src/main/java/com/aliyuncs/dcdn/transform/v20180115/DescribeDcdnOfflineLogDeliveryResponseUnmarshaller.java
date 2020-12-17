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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnOfflineLogDeliveryResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnOfflineLogDeliveryResponse.Domain;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnOfflineLogDeliveryResponse.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnOfflineLogDeliveryResponseUnmarshaller {

	public static DescribeDcdnOfflineLogDeliveryResponse unmarshall(DescribeDcdnOfflineLogDeliveryResponse describeDcdnOfflineLogDeliveryResponse, UnmarshallerContext _ctx) {
		
		describeDcdnOfflineLogDeliveryResponse.setRequestId(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryResponse.RequestId"));

		List<String> fields = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnOfflineLogDeliveryResponse.Fields.Length"); i++) {
			fields.add(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryResponse.Fields["+ i +"]"));
		}
		describeDcdnOfflineLogDeliveryResponse.setFields(fields);

		List<Domain> domains = new ArrayList<Domain>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnOfflineLogDeliveryResponse.Domains.Length"); i++) {
			Domain domain = new Domain();
			domain.setDomainName(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryResponse.Domains["+ i +"].DomainName"));

			domains.add(domain);
		}
		describeDcdnOfflineLogDeliveryResponse.setDomains(domains);

		List<Region> regions = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnOfflineLogDeliveryResponse.Regions.Length"); i++) {
			Region region = new Region();
			region.setOssId(_ctx.integerValue("DescribeDcdnOfflineLogDeliveryResponse.Regions["+ i +"].OssId"));
			region.setOssBucketName(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryResponse.Regions["+ i +"].OssBucketName"));
			region.setOssPathPrefix(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryResponse.Regions["+ i +"].OssPathPrefix"));
			region.setDlaVcName(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryResponse.Regions["+ i +"].DlaVcName"));
			region.setRegionId(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryResponse.Regions["+ i +"].RegionId"));
			region.setRegionName(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryResponse.Regions["+ i +"].RegionName"));
			region.setIsOverseas(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryResponse.Regions["+ i +"].IsOverseas"));
			region.setOssEndpoint(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryResponse.Regions["+ i +"].OssEndpoint"));
			region.setAreaId(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryResponse.Regions["+ i +"].AreaId"));
			region.setAreaName(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryResponse.Regions["+ i +"].AreaName"));
			region.setDlaDbName(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryResponse.Regions["+ i +"].DlaDbName"));
			region.setDlaTableName(_ctx.stringValue("DescribeDcdnOfflineLogDeliveryResponse.Regions["+ i +"].DlaTableName"));

			regions.add(region);
		}
		describeDcdnOfflineLogDeliveryResponse.setRegions(regions);
	 
	 	return describeDcdnOfflineLogDeliveryResponse;
	}
}