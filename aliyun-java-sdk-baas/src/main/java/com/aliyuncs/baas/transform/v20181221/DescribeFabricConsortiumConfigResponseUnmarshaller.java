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

package com.aliyuncs.baas.transform.v20181221;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20181221.DescribeFabricConsortiumConfigResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricConsortiumConfigResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricConsortiumConfigResponseUnmarshaller {

	public static DescribeFabricConsortiumConfigResponse unmarshall(DescribeFabricConsortiumConfigResponse describeFabricConsortiumConfigResponse, UnmarshallerContext _ctx) {
		
		describeFabricConsortiumConfigResponse.setRequestId(_ctx.stringValue("DescribeFabricConsortiumConfigResponse.RequestId"));
		describeFabricConsortiumConfigResponse.setSuccess(_ctx.booleanValue("DescribeFabricConsortiumConfigResponse.Success"));
		describeFabricConsortiumConfigResponse.setErrorCode(_ctx.integerValue("DescribeFabricConsortiumConfigResponse.ErrorCode"));

		Result result = new Result();

		List<String> channelPolicy = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFabricConsortiumConfigResponse.Result.ChannelPolicy.Length"); i++) {
			channelPolicy.add(_ctx.stringValue("DescribeFabricConsortiumConfigResponse.Result.ChannelPolicy["+ i +"]"));
		}
		result.setChannelPolicy(channelPolicy);

		List<String> ordererType = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFabricConsortiumConfigResponse.Result.OrdererType.Length"); i++) {
			ordererType.add(_ctx.stringValue("DescribeFabricConsortiumConfigResponse.Result.OrdererType["+ i +"]"));
		}
		result.setOrdererType(ordererType);
		describeFabricConsortiumConfigResponse.setResult(result);
	 
	 	return describeFabricConsortiumConfigResponse;
	}
}