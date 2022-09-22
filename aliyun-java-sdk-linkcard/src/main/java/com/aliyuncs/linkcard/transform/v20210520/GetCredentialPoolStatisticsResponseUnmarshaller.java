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

package com.aliyuncs.linkcard.transform.v20210520;

import com.aliyuncs.linkcard.model.v20210520.GetCredentialPoolStatisticsResponse;
import com.aliyuncs.linkcard.model.v20210520.GetCredentialPoolStatisticsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCredentialPoolStatisticsResponseUnmarshaller {

	public static GetCredentialPoolStatisticsResponse unmarshall(GetCredentialPoolStatisticsResponse getCredentialPoolStatisticsResponse, UnmarshallerContext _ctx) {
		
		getCredentialPoolStatisticsResponse.setRequestId(_ctx.stringValue("GetCredentialPoolStatisticsResponse.RequestId"));
		getCredentialPoolStatisticsResponse.setCode(_ctx.stringValue("GetCredentialPoolStatisticsResponse.Code"));
		getCredentialPoolStatisticsResponse.setErrorMessage(_ctx.stringValue("GetCredentialPoolStatisticsResponse.ErrorMessage"));
		getCredentialPoolStatisticsResponse.setSuccess(_ctx.booleanValue("GetCredentialPoolStatisticsResponse.Success"));

		Data data = new Data();
		data.setPoolUsed(_ctx.stringValue("GetCredentialPoolStatisticsResponse.Data.PoolUsed"));
		data.setCredentialNO(_ctx.stringValue("GetCredentialPoolStatisticsResponse.Data.CredentialNO"));
		data.setPoolOutUsed(_ctx.stringValue("GetCredentialPoolStatisticsResponse.Data.PoolOutUsed"));
		data.setPoolGrandTotalUsed(_ctx.stringValue("GetCredentialPoolStatisticsResponse.Data.PoolGrandTotalUsed"));
		data.setCredentialType(_ctx.stringValue("GetCredentialPoolStatisticsResponse.Data.CredentialType"));
		data.setCardTotalNum(_ctx.longValue("GetCredentialPoolStatisticsResponse.Data.CardTotalNum"));
		data.setPoolGrandTotal(_ctx.stringValue("GetCredentialPoolStatisticsResponse.Data.PoolGrandTotal"));
		data.setCardActiveNum(_ctx.longValue("GetCredentialPoolStatisticsResponse.Data.CardActiveNum"));
		data.setEffectiveTotalFlow(_ctx.stringValue("GetCredentialPoolStatisticsResponse.Data.EffectiveTotalFlow"));
		data.setEffectiveAvailableFlow(_ctx.stringValue("GetCredentialPoolStatisticsResponse.Data.EffectiveAvailableFlow"));
		data.setPoolAvaiable(_ctx.stringValue("GetCredentialPoolStatisticsResponse.Data.PoolAvaiable"));
		data.setMonthFeatureFee(_ctx.longValue("GetCredentialPoolStatisticsResponse.Data.MonthFeatureFee"));
		data.setCredentialInstanceId(_ctx.stringValue("GetCredentialPoolStatisticsResponse.Data.CredentialInstanceId"));
		data.setSmsUsed(_ctx.longValue("GetCredentialPoolStatisticsResponse.Data.SmsUsed"));
		data.setMonthUsedAmount(_ctx.longValue("GetCredentialPoolStatisticsResponse.Data.MonthUsedAmount"));
		getCredentialPoolStatisticsResponse.setData(data);
	 
	 	return getCredentialPoolStatisticsResponse;
	}
}