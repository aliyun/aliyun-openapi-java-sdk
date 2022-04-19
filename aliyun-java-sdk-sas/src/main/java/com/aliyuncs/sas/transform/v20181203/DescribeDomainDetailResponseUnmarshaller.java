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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeDomainDetailResponse;
import com.aliyuncs.sas.model.v20181203.DescribeDomainDetailResponse.DomainDetailItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainDetailResponseUnmarshaller {

	public static DescribeDomainDetailResponse unmarshall(DescribeDomainDetailResponse describeDomainDetailResponse, UnmarshallerContext _ctx) {
		
		describeDomainDetailResponse.setRequestId(_ctx.stringValue("DescribeDomainDetailResponse.RequestId"));
		describeDomainDetailResponse.setDomain(_ctx.stringValue("DescribeDomainDetailResponse.Domain"));
		describeDomainDetailResponse.setVulCount(_ctx.integerValue("DescribeDomainDetailResponse.VulCount"));
		describeDomainDetailResponse.setAlarmCount(_ctx.integerValue("DescribeDomainDetailResponse.AlarmCount"));
		describeDomainDetailResponse.setRootDomain(_ctx.stringValue("DescribeDomainDetailResponse.RootDomain"));

		List<DomainDetailItem> domainDetailItems = new ArrayList<DomainDetailItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainDetailResponse.DomainDetailItems.Length"); i++) {
			DomainDetailItem domainDetailItem = new DomainDetailItem();
			domainDetailItem.setUuid(_ctx.stringValue("DescribeDomainDetailResponse.DomainDetailItems["+ i +"].Uuid"));
			domainDetailItem.setInternetIp(_ctx.stringValue("DescribeDomainDetailResponse.DomainDetailItems["+ i +"].InternetIp"));
			domainDetailItem.setMachineIp(_ctx.stringValue("DescribeDomainDetailResponse.DomainDetailItems["+ i +"].MachineIp"));
			domainDetailItem.setInstanceName(_ctx.stringValue("DescribeDomainDetailResponse.DomainDetailItems["+ i +"].InstanceName"));
			domainDetailItem.setInstanceId(_ctx.stringValue("DescribeDomainDetailResponse.DomainDetailItems["+ i +"].InstanceId"));
			domainDetailItem.setIntranetIp(_ctx.stringValue("DescribeDomainDetailResponse.DomainDetailItems["+ i +"].IntranetIp"));
			domainDetailItem.setAssetType(_ctx.stringValue("DescribeDomainDetailResponse.DomainDetailItems["+ i +"].AssetType"));

			domainDetailItems.add(domainDetailItem);
		}
		describeDomainDetailResponse.setDomainDetailItems(domainDetailItems);
	 
	 	return describeDomainDetailResponse;
	}
}