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

import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmInstanceResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmInstanceResponse.Config;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmInstanceResponse.Config.AlertConfigItem;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmInstanceResponse.UsedQuota;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDnsGtmInstanceResponseUnmarshaller {

	public static DescribeDnsGtmInstanceResponse unmarshall(DescribeDnsGtmInstanceResponse describeDnsGtmInstanceResponse, UnmarshallerContext _ctx) {
		
		describeDnsGtmInstanceResponse.setRequestId(_ctx.stringValue("DescribeDnsGtmInstanceResponse.RequestId"));
		describeDnsGtmInstanceResponse.setExpireTimestamp(_ctx.longValue("DescribeDnsGtmInstanceResponse.ExpireTimestamp"));
		describeDnsGtmInstanceResponse.setResourceGroupId(_ctx.stringValue("DescribeDnsGtmInstanceResponse.ResourceGroupId"));
		describeDnsGtmInstanceResponse.setInstanceId(_ctx.stringValue("DescribeDnsGtmInstanceResponse.InstanceId"));
		describeDnsGtmInstanceResponse.setTaskQuota(_ctx.integerValue("DescribeDnsGtmInstanceResponse.TaskQuota"));
		describeDnsGtmInstanceResponse.setCreateTime(_ctx.stringValue("DescribeDnsGtmInstanceResponse.CreateTime"));
		describeDnsGtmInstanceResponse.setSmsQuota(_ctx.integerValue("DescribeDnsGtmInstanceResponse.SmsQuota"));
		describeDnsGtmInstanceResponse.setVersionCode(_ctx.stringValue("DescribeDnsGtmInstanceResponse.VersionCode"));
		describeDnsGtmInstanceResponse.setPaymentType(_ctx.stringValue("DescribeDnsGtmInstanceResponse.PaymentType"));
		describeDnsGtmInstanceResponse.setExpireTime(_ctx.stringValue("DescribeDnsGtmInstanceResponse.ExpireTime"));
		describeDnsGtmInstanceResponse.setCreateTimestamp(_ctx.longValue("DescribeDnsGtmInstanceResponse.CreateTimestamp"));

		Config config = new Config();
		config.setTtl(_ctx.integerValue("DescribeDnsGtmInstanceResponse.Config.Ttl"));
		config.setAlertGroup(_ctx.stringValue("DescribeDnsGtmInstanceResponse.Config.AlertGroup"));
		config.setCnameType(_ctx.stringValue("DescribeDnsGtmInstanceResponse.Config.CnameType"));
		config.setStrategyMode(_ctx.stringValue("DescribeDnsGtmInstanceResponse.Config.StrategyMode"));
		config.setInstanceName(_ctx.stringValue("DescribeDnsGtmInstanceResponse.Config.InstanceName"));
		config.setPublicCnameMode(_ctx.stringValue("DescribeDnsGtmInstanceResponse.Config.PublicCnameMode"));
		config.setPublicUserDomainName(_ctx.stringValue("DescribeDnsGtmInstanceResponse.Config.PublicUserDomainName"));
		config.setPubicZoneName(_ctx.stringValue("DescribeDnsGtmInstanceResponse.Config.PubicZoneName"));
		config.setPublicRr(_ctx.stringValue("DescribeDnsGtmInstanceResponse.Config.PublicRr"));

		List<AlertConfigItem> alertConfig = new ArrayList<AlertConfigItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsGtmInstanceResponse.Config.AlertConfig.Length"); i++) {
			AlertConfigItem alertConfigItem = new AlertConfigItem();
			alertConfigItem.setSmsNotice(_ctx.booleanValue("DescribeDnsGtmInstanceResponse.Config.AlertConfig["+ i +"].SmsNotice"));
			alertConfigItem.setNoticeType(_ctx.stringValue("DescribeDnsGtmInstanceResponse.Config.AlertConfig["+ i +"].NoticeType"));
			alertConfigItem.setEmailNotice(_ctx.booleanValue("DescribeDnsGtmInstanceResponse.Config.AlertConfig["+ i +"].EmailNotice"));
			alertConfigItem.setDingtalkNotice(_ctx.booleanValue("DescribeDnsGtmInstanceResponse.Config.AlertConfig["+ i +"].DingtalkNotice"));

			alertConfig.add(alertConfigItem);
		}
		config.setAlertConfig(alertConfig);
		describeDnsGtmInstanceResponse.setConfig(config);

		UsedQuota usedQuota = new UsedQuota();
		usedQuota.setEmailUsedCount(_ctx.integerValue("DescribeDnsGtmInstanceResponse.UsedQuota.EmailUsedCount"));
		usedQuota.setTaskUsedCount(_ctx.integerValue("DescribeDnsGtmInstanceResponse.UsedQuota.TaskUsedCount"));
		usedQuota.setSmsUsedCount(_ctx.integerValue("DescribeDnsGtmInstanceResponse.UsedQuota.SmsUsedCount"));
		usedQuota.setDingtalkUsedCount(_ctx.integerValue("DescribeDnsGtmInstanceResponse.UsedQuota.DingtalkUsedCount"));
		describeDnsGtmInstanceResponse.setUsedQuota(usedQuota);
	 
	 	return describeDnsGtmInstanceResponse;
	}
}