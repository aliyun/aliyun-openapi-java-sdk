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

package com.aliyuncs.dbs.transform.v20190306;

import com.aliyuncs.dbs.model.v20190306.DescribeBackupPlanBillingResponse;
import com.aliyuncs.dbs.model.v20190306.DescribeBackupPlanBillingResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupPlanBillingResponseUnmarshaller {

	public static DescribeBackupPlanBillingResponse unmarshall(DescribeBackupPlanBillingResponse describeBackupPlanBillingResponse, UnmarshallerContext _ctx) {
		
		describeBackupPlanBillingResponse.setRequestId(_ctx.stringValue("DescribeBackupPlanBillingResponse.RequestId"));
		describeBackupPlanBillingResponse.setSuccess(_ctx.booleanValue("DescribeBackupPlanBillingResponse.Success"));
		describeBackupPlanBillingResponse.setErrCode(_ctx.stringValue("DescribeBackupPlanBillingResponse.ErrCode"));
		describeBackupPlanBillingResponse.setErrMessage(_ctx.stringValue("DescribeBackupPlanBillingResponse.ErrMessage"));
		describeBackupPlanBillingResponse.setHttpStatusCode(_ctx.integerValue("DescribeBackupPlanBillingResponse.HttpStatusCode"));

		Item item = new Item();
		item.setBuySpec(_ctx.stringValue("DescribeBackupPlanBillingResponse.Item.BuySpec"));
		item.setBuyChargeType(_ctx.stringValue("DescribeBackupPlanBillingResponse.Item.BuyChargeType"));
		item.setBuyExpiredTimestamp(_ctx.longValue("DescribeBackupPlanBillingResponse.Item.BuyExpiredTimestamp"));
		item.setTotalFreeBytes(_ctx.longValue("DescribeBackupPlanBillingResponse.Item.TotalFreeBytes"));
		item.setPaiedBytes(_ctx.longValue("DescribeBackupPlanBillingResponse.Item.PaiedBytes"));
		item.setUsedFullBytes(_ctx.longValue("DescribeBackupPlanBillingResponse.Item.UsedFullBytes"));
		item.setUsedIncrementBytes(_ctx.longValue("DescribeBackupPlanBillingResponse.Item.UsedIncrementBytes"));
		item.setQuotaStartTimestamp(_ctx.longValue("DescribeBackupPlanBillingResponse.Item.QuotaStartTimestamp"));
		item.setQuotaEndTimestamp(_ctx.longValue("DescribeBackupPlanBillingResponse.Item.QuotaEndTimestamp"));
		item.setBuyCreateTimestamp(_ctx.longValue("DescribeBackupPlanBillingResponse.Item.BuyCreateTimestamp"));
		item.setFullStorageSize(_ctx.longValue("DescribeBackupPlanBillingResponse.Item.FullStorageSize"));
		item.setContStorageSize(_ctx.longValue("DescribeBackupPlanBillingResponse.Item.ContStorageSize"));
		item.setIsExpired(_ctx.booleanValue("DescribeBackupPlanBillingResponse.Item.IsExpired"));
		item.setIsFreeBytesUnlimited(_ctx.booleanValue("DescribeBackupPlanBillingResponse.Item.IsFreeBytesUnlimited"));
		describeBackupPlanBillingResponse.setItem(item);
	 
	 	return describeBackupPlanBillingResponse;
	}
}