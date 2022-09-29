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

package com.aliyuncs.cc5g.transform.v20220314;

import com.aliyuncs.cc5g.model.v20220314.GetCardResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCardResponseUnmarshaller {

	public static GetCardResponse unmarshall(GetCardResponse getCardResponse, UnmarshallerContext _ctx) {
		
		getCardResponse.setRequestId(_ctx.stringValue("GetCardResponse.RequestId"));
		getCardResponse.setIccid(_ctx.stringValue("GetCardResponse.Iccid"));
		getCardResponse.setNetType(_ctx.stringValue("GetCardResponse.NetType"));
		getCardResponse.setAPN(_ctx.stringValue("GetCardResponse.APN"));
		getCardResponse.setISP(_ctx.stringValue("GetCardResponse.ISP"));
		getCardResponse.setIpAddress(_ctx.stringValue("GetCardResponse.IpAddress"));
		getCardResponse.setImsi(_ctx.stringValue("GetCardResponse.Imsi"));
		getCardResponse.setImei(_ctx.stringValue("GetCardResponse.Imei"));
		getCardResponse.setLock(_ctx.stringValue("GetCardResponse.Lock"));
		getCardResponse.setSpec(_ctx.stringValue("GetCardResponse.Spec"));
		getCardResponse.setSimStatus(_ctx.stringValue("GetCardResponse.SimStatus"));
		getCardResponse.setStatus(_ctx.stringValue("GetCardResponse.Status"));
		getCardResponse.setDescription(_ctx.stringValue("GetCardResponse.Description"));
		getCardResponse.setName(_ctx.stringValue("GetCardResponse.Name"));
		getCardResponse.setWirelessCloudConnectorId(_ctx.stringValue("GetCardResponse.WirelessCloudConnectorId"));
		getCardResponse.setCloudConnectorId(_ctx.stringValue("GetCardResponse.CloudConnectorId"));
		getCardResponse.setUsageDataMonth(_ctx.integerValue("GetCardResponse.UsageDataMonth"));
		getCardResponse.setOrderId(_ctx.stringValue("GetCardResponse.OrderId"));
		getCardResponse.setActivatedTime(_ctx.stringValue("GetCardResponse.ActivatedTime"));
		getCardResponse.setMsisdn(_ctx.stringValue("GetCardResponse.Msisdn"));
		getCardResponse.setUsageDataTotal(_ctx.longValue("GetCardResponse.UsageDataTotal"));
		getCardResponse.setLimitThreshold(_ctx.longValue("GetCardResponse.LimitThreshold"));
		getCardResponse.setStopThreshold(_ctx.longValue("GetCardResponse.StopThreshold"));
		getCardResponse.setAlarmThreshold(_ctx.longValue("GetCardResponse.AlarmThreshold"));
	 
	 	return getCardResponse;
	}
}