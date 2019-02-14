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

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeDomainCnameResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainCnameResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainCnameResponseUnmarshaller {

	public static DescribeDomainCnameResponse unmarshall(DescribeDomainCnameResponse describeDomainCnameResponse, UnmarshallerContext context) {
		
		describeDomainCnameResponse.setRequestId(context.stringValue("DescribeDomainCnameResponse.RequestId"));

		List<Data> cnameDatas = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("DescribeDomainCnameResponse.CnameDatas.Length"); i++) {
			Data data = new Data();
			data.setDomain(context.stringValue("DescribeDomainCnameResponse.CnameDatas["+ i +"].Domain"));
			data.setCname(context.stringValue("DescribeDomainCnameResponse.CnameDatas["+ i +"].Cname"));
			data.setStatus(context.integerValue("DescribeDomainCnameResponse.CnameDatas["+ i +"].Status"));

			cnameDatas.add(data);
		}
		describeDomainCnameResponse.setCnameDatas(cnameDatas);
	 
	 	return describeDomainCnameResponse;
	}
}