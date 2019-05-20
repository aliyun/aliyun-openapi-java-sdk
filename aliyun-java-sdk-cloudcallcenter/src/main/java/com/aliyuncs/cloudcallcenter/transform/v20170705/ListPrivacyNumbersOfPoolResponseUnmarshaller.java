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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListPrivacyNumbersOfPoolResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListPrivacyNumbersOfPoolResponse.PrivacyNumber;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListPrivacyNumbersOfPoolResponse.VirtualPool;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPrivacyNumbersOfPoolResponseUnmarshaller {

	public static ListPrivacyNumbersOfPoolResponse unmarshall(ListPrivacyNumbersOfPoolResponse listPrivacyNumbersOfPoolResponse, UnmarshallerContext context) {
		
		listPrivacyNumbersOfPoolResponse.setRequestId(context.stringValue("ListPrivacyNumbersOfPoolResponse.RequestId"));
		listPrivacyNumbersOfPoolResponse.setSuccess(context.booleanValue("ListPrivacyNumbersOfPoolResponse.Success"));
		listPrivacyNumbersOfPoolResponse.setCode(context.stringValue("ListPrivacyNumbersOfPoolResponse.Code"));
		listPrivacyNumbersOfPoolResponse.setMessage(context.stringValue("ListPrivacyNumbersOfPoolResponse.Message"));
		listPrivacyNumbersOfPoolResponse.setHttpStatusCode(context.integerValue("ListPrivacyNumbersOfPoolResponse.HttpStatusCode"));

		VirtualPool virtualPool = new VirtualPool();
		virtualPool.setPoolId(context.stringValue("ListPrivacyNumbersOfPoolResponse.VirtualPool.PoolId"));
		virtualPool.setProviderId(context.stringValue("ListPrivacyNumbersOfPoolResponse.VirtualPool.ProviderId"));
		virtualPool.setProviderName(context.stringValue("ListPrivacyNumbersOfPoolResponse.VirtualPool.ProviderName"));
		virtualPool.setPrefix(context.stringValue("ListPrivacyNumbersOfPoolResponse.VirtualPool.Prefix"));
		virtualPool.setType(context.stringValue("ListPrivacyNumbersOfPoolResponse.VirtualPool.Type"));
		virtualPool.setName(context.stringValue("ListPrivacyNumbersOfPoolResponse.VirtualPool.Name"));
		virtualPool.setRamId(context.longValue("ListPrivacyNumbersOfPoolResponse.VirtualPool.RamId"));
		virtualPool.setBizId(context.stringValue("ListPrivacyNumbersOfPoolResponse.VirtualPool.BizId"));
		listPrivacyNumbersOfPoolResponse.setVirtualPool(virtualPool);

		List<PrivacyNumber> privacyNumbers = new ArrayList<PrivacyNumber>();
		for (int i = 0; i < context.lengthValue("ListPrivacyNumbersOfPoolResponse.PrivacyNumbers.Length"); i++) {
			PrivacyNumber privacyNumber = new PrivacyNumber();
			privacyNumber.setCity(context.stringValue("ListPrivacyNumbersOfPoolResponse.PrivacyNumbers["+ i +"].City"));
			privacyNumber.setAreaCode(context.stringValue("ListPrivacyNumbersOfPoolResponse.PrivacyNumbers["+ i +"].AreaCode"));
			privacyNumber.setOperator(context.stringValue("ListPrivacyNumbersOfPoolResponse.PrivacyNumbers["+ i +"].Operator"));
			privacyNumber.setTelX(context.stringValue("ListPrivacyNumbersOfPoolResponse.PrivacyNumbers["+ i +"].TelX"));
			privacyNumber.setBindStatus(context.booleanValue("ListPrivacyNumbersOfPoolResponse.PrivacyNumbers["+ i +"].BindStatus"));

			privacyNumbers.add(privacyNumber);
		}
		listPrivacyNumbersOfPoolResponse.setPrivacyNumbers(privacyNumbers);
	 
	 	return listPrivacyNumbersOfPoolResponse;
	}
}