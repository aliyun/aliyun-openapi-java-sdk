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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.RenewElasticityAssurancesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RenewElasticityAssurancesResponseUnmarshaller {

	public static RenewElasticityAssurancesResponse unmarshall(RenewElasticityAssurancesResponse renewElasticityAssurancesResponse, UnmarshallerContext _ctx) {
		
		renewElasticityAssurancesResponse.setRequestId(_ctx.stringValue("RenewElasticityAssurancesResponse.RequestId"));
		renewElasticityAssurancesResponse.setOrderId(_ctx.stringValue("RenewElasticityAssurancesResponse.OrderId"));

		List<String> privatePoolOptionsIdSet = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RenewElasticityAssurancesResponse.PrivatePoolOptionsIdSet.Length"); i++) {
			privatePoolOptionsIdSet.add(_ctx.stringValue("RenewElasticityAssurancesResponse.PrivatePoolOptionsIdSet["+ i +"]"));
		}
		renewElasticityAssurancesResponse.setPrivatePoolOptionsIdSet(privatePoolOptionsIdSet);
	 
	 	return renewElasticityAssurancesResponse;
	}
}