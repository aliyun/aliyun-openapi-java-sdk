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

package com.aliyuncs.scdn.transform.v20171115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainCnameResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainCnameResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainCnameResponseUnmarshaller {

	public static DescribeScdnDomainCnameResponse unmarshall(DescribeScdnDomainCnameResponse describeScdnDomainCnameResponse, UnmarshallerContext _ctx) {
		
		describeScdnDomainCnameResponse.setRequestId(_ctx.stringValue("DescribeScdnDomainCnameResponse.RequestId"));

		List<Data> cnameDatas = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDomainCnameResponse.CnameDatas.Length"); i++) {
			Data data = new Data();
			data.setDomain(_ctx.stringValue("DescribeScdnDomainCnameResponse.CnameDatas["+ i +"].Domain"));
			data.setCname(_ctx.stringValue("DescribeScdnDomainCnameResponse.CnameDatas["+ i +"].Cname"));
			data.setStatus(_ctx.integerValue("DescribeScdnDomainCnameResponse.CnameDatas["+ i +"].Status"));

			cnameDatas.add(data);
		}
		describeScdnDomainCnameResponse.setCnameDatas(cnameDatas);
	 
	 	return describeScdnDomainCnameResponse;
	}
}