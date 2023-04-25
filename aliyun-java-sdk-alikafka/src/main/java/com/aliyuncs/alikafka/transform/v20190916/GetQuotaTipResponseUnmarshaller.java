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

package com.aliyuncs.alikafka.transform.v20190916;

import com.aliyuncs.alikafka.model.v20190916.GetQuotaTipResponse;
import com.aliyuncs.alikafka.model.v20190916.GetQuotaTipResponse.QuotaData;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQuotaTipResponseUnmarshaller {

	public static GetQuotaTipResponse unmarshall(GetQuotaTipResponse getQuotaTipResponse, UnmarshallerContext _ctx) {
		
		getQuotaTipResponse.setRequestId(_ctx.stringValue("GetQuotaTipResponse.RequestId"));
		getQuotaTipResponse.setCode(_ctx.integerValue("GetQuotaTipResponse.Code"));
		getQuotaTipResponse.setMessage(_ctx.stringValue("GetQuotaTipResponse.Message"));
		getQuotaTipResponse.setSuccess(_ctx.booleanValue("GetQuotaTipResponse.Success"));

		QuotaData quotaData = new QuotaData();
		quotaData.setTopicNumOfBuy(_ctx.integerValue("GetQuotaTipResponse.QuotaData.TopicNumOfBuy"));
		quotaData.setTopicQuota(_ctx.integerValue("GetQuotaTipResponse.QuotaData.TopicQuota"));
		quotaData.setTopicLeft(_ctx.integerValue("GetQuotaTipResponse.QuotaData.TopicLeft"));
		quotaData.setTopicUsed(_ctx.integerValue("GetQuotaTipResponse.QuotaData.TopicUsed"));
		quotaData.setPartitionNumOfBuy(_ctx.integerValue("GetQuotaTipResponse.QuotaData.PartitionNumOfBuy"));
		quotaData.setPartitionQuata(_ctx.integerValue("GetQuotaTipResponse.QuotaData.PartitionQuata"));
		quotaData.setPartitionLeft(_ctx.integerValue("GetQuotaTipResponse.QuotaData.PartitionLeft"));
		quotaData.setPartitionUsed(_ctx.integerValue("GetQuotaTipResponse.QuotaData.PartitionUsed"));
		quotaData.setGroupLeft(_ctx.integerValue("GetQuotaTipResponse.QuotaData.GroupLeft"));
		quotaData.setGroupUsed(_ctx.integerValue("GetQuotaTipResponse.QuotaData.GroupUsed"));
		quotaData.setIsPartitionBuy(_ctx.integerValue("GetQuotaTipResponse.QuotaData.IsPartitionBuy"));
		quotaData.setPartitionQuota(_ctx.integerValue("GetQuotaTipResponse.QuotaData.PartitionQuota"));
		getQuotaTipResponse.setQuotaData(quotaData);
	 
	 	return getQuotaTipResponse;
	}
}