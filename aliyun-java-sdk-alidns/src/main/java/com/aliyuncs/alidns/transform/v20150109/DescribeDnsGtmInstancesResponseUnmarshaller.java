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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmInstancesResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmInstancesResponse.GtmInstance;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmInstancesResponse.GtmInstance.Config;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmInstancesResponse.GtmInstance.Config.AlertConfigItem;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmInstancesResponse.GtmInstance.UsedQuota;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDnsGtmInstancesResponseUnmarshaller {

	public static DescribeDnsGtmInstancesResponse unmarshall(DescribeDnsGtmInstancesResponse describeDnsGtmInstancesResponse, UnmarshallerContext _ctx) {
		
		describeDnsGtmInstancesResponse.setRequestId(_ctx.stringValue("DescribeDnsGtmInstancesResponse.RequestId"));
		describeDnsGtmInstancesResponse.setPageNumber(_ctx.integerValue("DescribeDnsGtmInstancesResponse.PageNumber"));
		describeDnsGtmInstancesResponse.setPageSize(_ctx.integerValue("DescribeDnsGtmInstancesResponse.PageSize"));
		describeDnsGtmInstancesResponse.setTotalItems(_ctx.integerValue("DescribeDnsGtmInstancesResponse.TotalItems"));
		describeDnsGtmInstancesResponse.setTotalPages(_ctx.integerValue("DescribeDnsGtmInstancesResponse.TotalPages"));

		List<GtmInstance> gtmInstances = new ArrayList<GtmInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsGtmInstancesResponse.GtmInstances.Length"); i++) {
			GtmInstance gtmInstance = new GtmInstance();
			gtmInstance.setInstanceId(_ctx.stringValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].InstanceId"));
			gtmInstance.setVersionCode(_ctx.stringValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].VersionCode"));
			gtmInstance.setSmsQuota(_ctx.integerValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].SmsQuota"));
			gtmInstance.setCreateTime(_ctx.stringValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].CreateTime"));
			gtmInstance.setCreateTimestamp(_ctx.longValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].CreateTimestamp"));
			gtmInstance.setExpireTime(_ctx.stringValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].ExpireTime"));
			gtmInstance.setExpireTimestamp(_ctx.longValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].ExpireTimestamp"));
			gtmInstance.setTaskQuota(_ctx.integerValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].TaskQuota"));
			gtmInstance.setResourceGroupId(_ctx.stringValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].ResourceGroupId"));
			gtmInstance.setPaymentType(_ctx.stringValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].PaymentType"));

			Config config = new Config();
			config.setInstanceName(_ctx.stringValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].Config.InstanceName"));
			config.setCnameType(_ctx.stringValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].Config.CnameType"));
			config.setPublicUserDomainName(_ctx.stringValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].Config.PublicUserDomainName"));
			config.setPublicCnameMode(_ctx.stringValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].Config.PublicCnameMode"));
			config.setPublicZoneName(_ctx.stringValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].Config.PublicZoneName"));
			config.setTtl(_ctx.integerValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].Config.Ttl"));
			config.setAlertGroup(_ctx.stringValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].Config.AlertGroup"));
			config.setStrategyMode(_ctx.stringValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].Config.StrategyMode"));

			List<AlertConfigItem> alertConfig = new ArrayList<AlertConfigItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].Config.AlertConfig.Length"); j++) {
				AlertConfigItem alertConfigItem = new AlertConfigItem();
				alertConfigItem.setNoticeType(_ctx.stringValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].Config.AlertConfig["+ j +"].NoticeType"));
				alertConfigItem.setSmsNotice(_ctx.stringValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].Config.AlertConfig["+ j +"].SmsNotice"));
				alertConfigItem.setEmailNotice(_ctx.stringValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].Config.AlertConfig["+ j +"].EmailNotice"));

				alertConfig.add(alertConfigItem);
			}
			config.setAlertConfig(alertConfig);
			gtmInstance.setConfig(config);

			UsedQuota usedQuota = new UsedQuota();
			usedQuota.setTaskUsedCount(_ctx.integerValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].UsedQuota.TaskUsedCount"));
			usedQuota.setSmsUsedCount(_ctx.integerValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].UsedQuota.SmsUsedCount"));
			usedQuota.setEmailUsedCount(_ctx.integerValue("DescribeDnsGtmInstancesResponse.GtmInstances["+ i +"].UsedQuota.EmailUsedCount"));
			gtmInstance.setUsedQuota(usedQuota);

			gtmInstances.add(gtmInstance);
		}
		describeDnsGtmInstancesResponse.setGtmInstances(gtmInstances);
	 
	 	return describeDnsGtmInstancesResponse;
	}
}