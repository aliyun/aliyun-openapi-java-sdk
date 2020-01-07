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

package com.aliyuncs.retailcloud.transform.v20180313;

import com.aliyuncs.retailcloud.model.v20180313.DescribeSlbAPDetailResponse;
import com.aliyuncs.retailcloud.model.v20180313.DescribeSlbAPDetailResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlbAPDetailResponseUnmarshaller {

	public static DescribeSlbAPDetailResponse unmarshall(DescribeSlbAPDetailResponse describeSlbAPDetailResponse, UnmarshallerContext _ctx) {
		
		describeSlbAPDetailResponse.setRequestId(_ctx.stringValue("DescribeSlbAPDetailResponse.RequestId"));
		describeSlbAPDetailResponse.setCode(_ctx.integerValue("DescribeSlbAPDetailResponse.Code"));
		describeSlbAPDetailResponse.setErrMsg(_ctx.stringValue("DescribeSlbAPDetailResponse.ErrMsg"));
		describeSlbAPDetailResponse.setSuccess(_ctx.booleanValue("DescribeSlbAPDetailResponse.Success"));

		Result result = new Result();
		result.setAppId(_ctx.longValue("DescribeSlbAPDetailResponse.Result.AppId"));
		result.setCookieTimeout(_ctx.integerValue("DescribeSlbAPDetailResponse.Result.CookieTimeout"));
		result.setEnvId(_ctx.longValue("DescribeSlbAPDetailResponse.Result.EnvId"));
		result.setEstablishedTimeout(_ctx.integerValue("DescribeSlbAPDetailResponse.Result.EstablishedTimeout"));
		result.setListenerPort(_ctx.integerValue("DescribeSlbAPDetailResponse.Result.ListenerPort"));
		result.setName(_ctx.stringValue("DescribeSlbAPDetailResponse.Result.Name"));
		result.setNetworkMode(_ctx.stringValue("DescribeSlbAPDetailResponse.Result.NetworkMode"));
		result.setBizProtocol(_ctx.stringValue("DescribeSlbAPDetailResponse.Result.Protocol"));
		result.setRealServerPort(_ctx.integerValue("DescribeSlbAPDetailResponse.Result.RealServerPort"));
		result.setSlbAPId(_ctx.longValue("DescribeSlbAPDetailResponse.Result.SlbAPId"));
		result.setSlbId(_ctx.stringValue("DescribeSlbAPDetailResponse.Result.SlbId"));
		result.setSlbIp(_ctx.stringValue("DescribeSlbAPDetailResponse.Result.SlbIp"));
		result.setSslCertId(_ctx.stringValue("DescribeSlbAPDetailResponse.Result.SslCertId"));
		result.setStickySession(_ctx.integerValue("DescribeSlbAPDetailResponse.Result.StickySession"));
		describeSlbAPDetailResponse.setResult(result);
	 
	 	return describeSlbAPDetailResponse;
	}
}