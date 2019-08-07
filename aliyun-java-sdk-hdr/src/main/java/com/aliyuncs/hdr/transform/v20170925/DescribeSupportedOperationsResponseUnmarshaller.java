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

package com.aliyuncs.hdr.transform.v20170925;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hdr.model.v20170925.DescribeSupportedOperationsResponse;
import com.aliyuncs.hdr.model.v20170925.DescribeSupportedOperationsResponse.Operation;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSupportedOperationsResponseUnmarshaller {

	public static DescribeSupportedOperationsResponse unmarshall(DescribeSupportedOperationsResponse describeSupportedOperationsResponse, UnmarshallerContext _ctx) {
		
		describeSupportedOperationsResponse.setRequestId(_ctx.stringValue("DescribeSupportedOperationsResponse.RequestId"));
		describeSupportedOperationsResponse.setSuccess(_ctx.booleanValue("DescribeSupportedOperationsResponse.Success"));
		describeSupportedOperationsResponse.setCode(_ctx.stringValue("DescribeSupportedOperationsResponse.Code"));
		describeSupportedOperationsResponse.setMessage(_ctx.stringValue("DescribeSupportedOperationsResponse.Message"));
		describeSupportedOperationsResponse.setTotalCount(_ctx.integerValue("DescribeSupportedOperationsResponse.TotalCount"));

		List<Operation> operations = new ArrayList<Operation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSupportedOperationsResponse.Operations.Length"); i++) {
			Operation operation = new Operation();
			operation.setName(_ctx.stringValue("DescribeSupportedOperationsResponse.Operations["+ i +"].Name"));

			operations.add(operation);
		}
		describeSupportedOperationsResponse.setOperations(operations);
	 
	 	return describeSupportedOperationsResponse;
	}
}