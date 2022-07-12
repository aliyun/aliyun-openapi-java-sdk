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

package com.aliyuncs.antiddos_public.transform.v20170518;

import com.aliyuncs.antiddos_public.model.v20170518.DescribeBgpPackByIpResponse;
import com.aliyuncs.antiddos_public.model.v20170518.DescribeBgpPackByIpResponse.DdosbgpInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBgpPackByIpResponseUnmarshaller {

	public static DescribeBgpPackByIpResponse unmarshall(DescribeBgpPackByIpResponse describeBgpPackByIpResponse, UnmarshallerContext _ctx) {
		
		describeBgpPackByIpResponse.setRequestId(_ctx.stringValue("DescribeBgpPackByIpResponse.RequestId"));
		describeBgpPackByIpResponse.setCode(_ctx.integerValue("DescribeBgpPackByIpResponse.Code"));
		describeBgpPackByIpResponse.setSuccess(_ctx.booleanValue("DescribeBgpPackByIpResponse.Success"));

		DdosbgpInfo ddosbgpInfo = new DdosbgpInfo();
		ddosbgpInfo.setIp(_ctx.stringValue("DescribeBgpPackByIpResponse.DdosbgpInfo.Ip"));
		ddosbgpInfo.setExpireTime(_ctx.longValue("DescribeBgpPackByIpResponse.DdosbgpInfo.ExpireTime"));
		ddosbgpInfo.setElasticThreshold(_ctx.integerValue("DescribeBgpPackByIpResponse.DdosbgpInfo.ElasticThreshold"));
		ddosbgpInfo.setBaseThreshold(_ctx.integerValue("DescribeBgpPackByIpResponse.DdosbgpInfo.BaseThreshold"));
		ddosbgpInfo.setDdosbgpInstanceId(_ctx.stringValue("DescribeBgpPackByIpResponse.DdosbgpInfo.DdosbgpInstanceId"));
		describeBgpPackByIpResponse.setDdosbgpInfo(ddosbgpInfo);
	 
	 	return describeBgpPackByIpResponse;
	}
}