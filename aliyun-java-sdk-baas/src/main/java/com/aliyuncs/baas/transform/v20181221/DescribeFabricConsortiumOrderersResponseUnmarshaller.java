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

import com.aliyuncs.baas.model.v20181221.DescribeFabricConsortiumOrderersResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricConsortiumOrderersResponse.Orderer;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricConsortiumOrderersResponseUnmarshaller {

	public static DescribeFabricConsortiumOrderersResponse unmarshall(DescribeFabricConsortiumOrderersResponse describeFabricConsortiumOrderersResponse, UnmarshallerContext _ctx) {
		
		describeFabricConsortiumOrderersResponse.setRequestId(_ctx.stringValue("DescribeFabricConsortiumOrderersResponse.RequestId"));
		describeFabricConsortiumOrderersResponse.setSuccess(_ctx.booleanValue("DescribeFabricConsortiumOrderersResponse.Success"));
		describeFabricConsortiumOrderersResponse.setErrorCode(_ctx.integerValue("DescribeFabricConsortiumOrderersResponse.ErrorCode"));

		List<Orderer> result = new ArrayList<Orderer>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFabricConsortiumOrderersResponse.Result.Length"); i++) {
			Orderer orderer = new Orderer();
			orderer.setOrdererName(_ctx.stringValue("DescribeFabricConsortiumOrderersResponse.Result["+ i +"].OrdererName"));
			orderer.setDomain(_ctx.stringValue("DescribeFabricConsortiumOrderersResponse.Result["+ i +"].Domain"));
			orderer.setPort(_ctx.integerValue("DescribeFabricConsortiumOrderersResponse.Result["+ i +"].Port"));
			orderer.setInstanceType(_ctx.stringValue("DescribeFabricConsortiumOrderersResponse.Result["+ i +"].InstanceType"));
			orderer.setCreateTime(_ctx.stringValue("DescribeFabricConsortiumOrderersResponse.Result["+ i +"].CreateTime"));
			orderer.setUpdateTime(_ctx.stringValue("DescribeFabricConsortiumOrderersResponse.Result["+ i +"].UpdateTime"));

			result.add(orderer);
		}
		describeFabricConsortiumOrderersResponse.setResult(result);
	 
	 	return describeFabricConsortiumOrderersResponse;
	}
}